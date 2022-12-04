/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import view.PesanDialog;

/**
 *
 * @author 4R135
 */
public class Transaksi {

    private String kodeTransaksi, tglTransaksi, nikPembeli, kodeMobil, kodeAdmin, totalHarga, bayar, kembalian;

    private String pesan;
    private Object[][] list;
    private final Koneksi koneksi = new Koneksi();
    private final PesanDialog pesanDialog = new PesanDialog();

    public String getKodeTransaksi() {
        return kodeTransaksi;
    }

    public void setKodeTransaksi(String kodeTransaksi) {
        this.kodeTransaksi = kodeTransaksi;
    }

    public String getTglTransaksi() {
        return tglTransaksi;
    }

    public void setTglTransaksi(String tglTransaksi) {
        this.tglTransaksi = tglTransaksi;
    }

    public String getNikPembeli() {
        return nikPembeli;
    }

    public void setNikPembeli(String nikPembeli) {
        this.nikPembeli = nikPembeli;
    }

    public String getKodeMobil() {
        return kodeMobil;
    }

    public void setKodeMobil(String kodeMobil) {
        this.kodeMobil = kodeMobil;
    }

    public String getKodeAdmin() {
        return kodeAdmin;
    }

    public void setKodeAdmin(String kodeAdmin) {
        this.kodeAdmin = kodeAdmin;
    }

    public String getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(String totalHarga) {
        this.totalHarga = totalHarga;
    }

    public String getBayar() {
        return bayar;
    }

    public void setBayar(String bayar) {
        this.bayar = bayar;
    }

    public String getKembalian() {
        return kembalian;
    }

    public void setKembalian(String kembalian) {
        this.kembalian = kembalian;
    }

    public String getPesan() {
        return pesan;
    }

    public Object[][] getList() {
        return list;
    }

    public void setList(Object[][] list) {
        this.list = list;
    }

    public boolean simpan() {
        boolean adaKesalahan = false;
        Connection connection;

        if ((connection = koneksi.getConnection()) != null) {
            int jumlahSimpan = 0;
            boolean simpan = false;
            String SQLStatemen = "";
            PreparedStatement preparedStatement;
            ResultSet rset;

            try {
                SQLStatemen = "select * from transaksi where kodeTransaksi=?";

                preparedStatement = connection.prepareStatement(SQLStatemen);
                preparedStatement.setString(1, kodeTransaksi);
                rset = preparedStatement.executeQuery();

                rset.next();
                if (rset.getRow() > 0) {
                    if (pesanDialog.tampilkanPilihan("Kode Transaksi sudah ada\nApakah data diperbaharui?", "Konfirmasi", new Object[]{"Ya", "Tidak"}) == 0) {
                        simpan = true;
                        SQLStatemen = "update transaksi set "
                                + "tglTransaksi = ?, "
                                + "nikPembeli = ?, "
                                + "kodeMobil = ?, "
                                + "kodeAdmin = ?, "
                                + "totalHarga = ?, "
                                + "bayar = ?, "
                                + "kembalian = ? "
                                + "where kodeTransaksi=?";

                        preparedStatement = connection.prepareStatement(SQLStatemen);
                        preparedStatement.setString(1, tglTransaksi);
                        preparedStatement.setString(2, nikPembeli);
                        preparedStatement.setString(3, kodeMobil);
                        preparedStatement.setString(4, kodeAdmin);
                        preparedStatement.setString(5, totalHarga);
                        preparedStatement.setString(6, bayar);
                        preparedStatement.setString(7, kembalian);
                        preparedStatement.setString(8, kodeTransaksi);

                        jumlahSimpan = preparedStatement.executeUpdate();
                    }
                } else {
                    simpan = true;
                    SQLStatemen = "insert into transaksi(tglTransaksi, nikPembeli, kodeMobil, kodeAdmin, totalHarga, bayar, kembalian) values (?,?,?,?,?,?,?)";

                    preparedStatement = connection.prepareStatement(SQLStatemen);
                    preparedStatement.setString(1, tglTransaksi);
                    preparedStatement.setString(2, nikPembeli);
                    preparedStatement.setString(3, kodeMobil);
                    preparedStatement.setString(4, kodeAdmin);
                    preparedStatement.setString(5, totalHarga);
                    preparedStatement.setString(6, bayar);
                    preparedStatement.setString(7, kembalian);

                    jumlahSimpan = preparedStatement.executeUpdate();
                }

                if (simpan) {
                    if (jumlahSimpan < 1) {
                        adaKesalahan = true;
                        pesan = "Gagal menyimpan data transaksi";
                    }
                }

                preparedStatement.close();
                rset.close();
                connection.close();
            } catch (SQLException ex) {
                adaKesalahan = true;
                pesan = "Tidak dapat membuka tabel transaksi\n" + ex + "\n" + SQLStatemen;
            }
        } else {
            adaKesalahan = true;
            pesan = "Tidak dapat melakukan koneksi ke server\n" + koneksi.getPesanKesalahan();
        }

        this.kodeTransaksi = "";

        return !adaKesalahan;
    }

    public boolean baca(String kodeTransaksi) {
        boolean adaKesalahan = false;
        Connection connection;

        this.kodeTransaksi = "";
        this.tglTransaksi = "";
        this.nikPembeli = "";
        this.kodeMobil = "";
        this.kodeAdmin = "";
        this.totalHarga = "";
        this.bayar = "";
        this.kembalian = "";

        if ((connection = koneksi.getConnection()) != null) {
            PreparedStatement preparedStatement;
            ResultSet rset;

            try {
                String SQLStatemen = "select * from transaksi where kodeTransaksi=?";
                preparedStatement = connection.prepareStatement(SQLStatemen);
                preparedStatement.setString(1, kodeTransaksi);
                rset = preparedStatement.executeQuery();

                rset.next();
                if (rset.getRow() > 0) {
                    this.kodeTransaksi = rset.getString("kodeTransaksi");
                    this.kodeTransaksi = rset.getString("kodeTransaksi");
                    this.tglTransaksi = rset.getString("tglTransaksi");
                    this.nikPembeli = rset.getString("nikPembeli");
                    this.kodeMobil = rset.getString("kodeMobil");
                    this.kodeAdmin = rset.getString("kodeAdmin");
                    this.totalHarga = rset.getString("totalHarga");
                    this.bayar = rset.getString("bayar");
                    this.kembalian = rset.getString("kembalian");
                } else {
                    adaKesalahan = true;
                    pesan = "Kode Transaksi \"" + kodeTransaksi + "\" tidak ditemukan";
                }

                preparedStatement.close();
                rset.close();
                connection.close();
            } catch (SQLException ex) {
                adaKesalahan = true;
                pesan = "Tidak dapat membuka tabel transaksi\n" + ex;
            }
        } else {
            adaKesalahan = true;
            pesan = "Tidak dapat melakukan koneksi ke server\n" + koneksi.getPesanKesalahan();
        }

        return !adaKesalahan;
    }

    public boolean bacaData() {
        boolean adaKesalahan = false;
        Connection connection;
        list = new Object[0][0];

        if ((connection = koneksi.getConnection()) != null) {
            String SQLStatemen;
            Statement sta;
            ResultSet rset;

            try {
                SQLStatemen = "select * from transaksi";
                sta = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                rset = sta.executeQuery(SQLStatemen);

                rset.next();
                rset.last();
                list = new Object[rset.getRow()][2];
                if (rset.getRow() > 0) {
                    rset.first();
                    int i = 0;
                    do {
                        list[i] = new Object[]{
                            rset.getString("kodeTransaksi"),
                            rset.getString("tglTransaksi"),
                            rset.getString("nikPembeli"),
                            rset.getString("kodeMobil"),
                            rset.getString("kodeAdmin"),
                            rset.getString("totalHarga"),
                            rset.getString("bayar"),
                            rset.getString("kembalian")
                        };
                        i++;
                    } while (rset.next());
                }

                sta.close();
                rset.close();
                connection.close();
            } catch (SQLException ex) {
                adaKesalahan = true;
                pesan = "Tidak dapat membaca data\n" + ex.getMessage();
            }
        } else {
            adaKesalahan = true;
            pesan = "Tidak dapat melakukan koneksi ke server\n" + koneksi.getPesanKesalahan();
        }
        return !adaKesalahan;
    }

    public boolean hapus(String kodeTransaksi) {
        boolean adaKesalahan = false;
        Connection connection;

        if ((connection = koneksi.getConnection()) != null) {
            int jumlahHapus;
            String SQLStatemen;
            PreparedStatement preparedStatement;

            try {
                SQLStatemen = "delete from transaksi where kodeTransaksi=?";
                preparedStatement = connection.prepareStatement(SQLStatemen);
                preparedStatement.setString(1, kodeTransaksi);
                jumlahHapus = preparedStatement.executeUpdate();

                if (jumlahHapus < 1) {
                    pesan = "Data transaksi dengan KodeTransaksi " + kodeTransaksi + " tidak ditemukan";
                    adaKesalahan = true;
                }

                preparedStatement.close();
                connection.close();
            } catch (SQLException ex) {
                adaKesalahan = true;
                pesan = "Tidak dapat membuka tabel transaksi\n" + ex;
            }
        } else {
            adaKesalahan = true;
            pesan = "Tidak dapat melakukan koneksi ke server\n" + koneksi.getPesanKesalahan();
        }

        return !adaKesalahan;
    }

    public boolean cetakLaporan() {
        boolean adaKesalahan = false;
        Connection connection;

        if ((connection = koneksi.getConnection()) != null) {
            String SQLStatement;
            Statement statement;
            ResultSet resultSet = null;

            try {
                SQLStatement = " SELECT * FROM transaksi "
                        + "INNER JOIN mobil ON transaksi.kodeMobil = mobil.kodeMobil "
                        + "INNER JOIN admin ON transaksi.kodeAdmin = admin.kodeAdmin "
                        + "INNER JOIN pembeli ON transaksi.nikPembeli = pembeli.nikPembeli";

                SQLStatement = SQLStatement + " ORDER BY transaksi.tglTransaksi DESC";

                statement = connection.createStatement();
                resultSet = statement.executeQuery(SQLStatement);
            } catch (SQLException ex) {
                adaKesalahan = true;
                pesan = "Tidak dapat membaca data\n" + ex;
            }

            if (resultSet != null) {
                try {
                    JasperDesign disain = JRXmlLoader.load("src/reports/TransaksiReport.jrxml");
                    JasperReport nilaiLaporan = JasperCompileManager.compileReport(disain);
                    JRResultSetDataSource resultSetDataSource = new JRResultSetDataSource(resultSet);
                    JasperPrint cetak = JasperFillManager.fillReport(nilaiLaporan, new HashMap(), resultSetDataSource);
                    JasperViewer.viewReport(cetak, false);
                } catch (JRException ex) {
                    adaKesalahan = true;
                    pesan = "Tidak dapat mencetak laporan\n" + ex;
                }
            }
        } else {
            adaKesalahan = true;
            pesan = "Tidak dapat melakukan koneksi ke server\n" + koneksi.getPesanKesalahan();
        }

        return !adaKesalahan;
    }
}
