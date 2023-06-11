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
import view.PesanDialog;

/**
 *
 * @author 4R135
 */
public class Pembeli {

    private String nikPembeli, namaPembeli, noTeleponPembeli, alamatPembeli;

    private String pesan;
    private Object[][] list;
    private final Koneksi koneksi = new Koneksi();
    private final PesanDialog pesanDialog = new PesanDialog();

    public String getNikPembeli() {
        return nikPembeli;
    }

    public void setNikPembeli(String nikPembeli) {
        this.nikPembeli = nikPembeli;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public String getNoTeleponPembeli() {
        return noTeleponPembeli;
    }

    public void setNoTeleponPembeli(String noTeleponPembeli) {
        this.noTeleponPembeli = noTeleponPembeli;
    }

    public String getAlamatPembeli() {
        return alamatPembeli;
    }

    public void setAlamatPembeli(String alamatPembeli) {
        this.alamatPembeli = alamatPembeli;
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
                SQLStatemen = "select * from pembeli where nikPembeli=?";

                preparedStatement = connection.prepareStatement(SQLStatemen);
                preparedStatement.setString(1, nikPembeli);
                rset = preparedStatement.executeQuery();

                rset.next();
                if (rset.getRow() > 0) {
                    if (pesanDialog.tampilkanPilihan("Nik Pembeli sudah ada\nApakah data diperbaharui?", "Konfirmasi", new Object[]{"Ya", "Tidak"}) == 0) {
                        simpan = true;
                        SQLStatemen = "update pembeli set namaPembeli=?, noTeleponPembeli=?, alamatPembeli=? where nikPembeli=?";

                        preparedStatement = connection.prepareStatement(SQLStatemen);
                        preparedStatement.setString(1, namaPembeli);
                        preparedStatement.setString(2, noTeleponPembeli);
                        preparedStatement.setString(3, alamatPembeli);
                        preparedStatement.setString(4, nikPembeli);

                        jumlahSimpan = preparedStatement.executeUpdate();
                    }
                } else {
                    simpan = true;
                    SQLStatemen = "insert into pembeli(nikPembeli, namaPembeli, noTeleponPembeli, alamatPembeli) values (?,?,?,?)";

                    preparedStatement = connection.prepareStatement(SQLStatemen);
                    preparedStatement.setString(1, nikPembeli);
                    preparedStatement.setString(2, namaPembeli);
                    preparedStatement.setString(3, noTeleponPembeli);
                    preparedStatement.setString(4, alamatPembeli);

                    jumlahSimpan = preparedStatement.executeUpdate();
                }

                if (simpan) {
                    if (jumlahSimpan < 1) {
                        adaKesalahan = true;
                        pesan = "Gagal menyimpan data pembeli";
                    }
                }

                preparedStatement.close();
                rset.close();
                connection.close();
            } catch (SQLException ex) {
                adaKesalahan = true;
                pesan = "Tidak dapat membuka tabel pembeli\n" + ex + "\n" + SQLStatemen;
            }
        } else {
            adaKesalahan = true;
            pesan = "Tidak dapat melakukan koneksi ke server\n" + koneksi.getPesanKesalahan();
        }

        return !adaKesalahan;
    }

    public boolean baca(String nikPembeli) {
        boolean adaKesalahan = false;
        Connection connection;

        this.nikPembeli = "";
        this.namaPembeli = "";
        this.noTeleponPembeli = "";
        this.alamatPembeli = "";

        if ((connection = koneksi.getConnection()) != null) {
            PreparedStatement preparedStatement;
            ResultSet rset;

            try {
                String SQLStatemen = "select * from pembeli where nikPembeli=?";
                preparedStatement = connection.prepareStatement(SQLStatemen);
                preparedStatement.setString(1, nikPembeli);
                rset = preparedStatement.executeQuery();

                rset.next();
                if (rset.getRow() > 0) {
                    this.nikPembeli = rset.getString("nikPembeli");
                    this.namaPembeli = rset.getString("namaPembeli");
                    this.noTeleponPembeli = rset.getString("noTeleponPembeli");
                    this.alamatPembeli = rset.getString("alamatPembeli");
                } else {
                    adaKesalahan = true;
                    pesan = "Nik Pembeli \"" + nikPembeli + "\" tidak ditemukan";
                }

                preparedStatement.close();
                rset.close();
                connection.close();
            } catch (SQLException ex) {
                adaKesalahan = true;
                pesan = "Tidak dapat membuka tabel pembeli\n" + ex;
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
                SQLStatemen = "select nikPembeli, namaPembeli, noTeleponPembeli, alamatPembeli from pembeli";
                sta = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                rset = sta.executeQuery(SQLStatemen);

                rset.next();
                rset.last();
                list = new Object[rset.getRow()][2];
                if (rset.getRow() > 0) {
                    rset.first();
                    int i = 0;
                    do {
                        list[i] = new Object[]{rset.getString("nikPembeli"), rset.getString("namaPembeli"), rset.getString("noTeleponPembeli"), rset.getString("alamatPembeli")};
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

    public boolean hapus(String nikPembeli) {
        boolean adaKesalahan = false;
        Connection connection;

        if ((connection = koneksi.getConnection()) != null) {
            int jumlahHapus;
            String SQLStatemen;
            PreparedStatement preparedStatement;

            try {
                SQLStatemen = "delete from pembeli where nikPembeli=?";
                preparedStatement = connection.prepareStatement(SQLStatemen);
                preparedStatement.setString(1, nikPembeli);
                jumlahHapus = preparedStatement.executeUpdate();

                if (jumlahHapus < 1) {
                    pesan = "Data pembeli dengan NikPembeli " + nikPembeli + " tidak ditemukan";
                    adaKesalahan = true;
                }

                preparedStatement.close();
                connection.close();
            } catch (SQLException ex) {
                adaKesalahan = true;
                pesan = "Tidak dapat membuka tabel pembeli\n" + ex;
            }
        } else {
            adaKesalahan = true;
            pesan = "Tidak dapat melakukan koneksi ke server\n" + koneksi.getPesanKesalahan();
        }

        return !adaKesalahan;
    }
}
