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
public class Mobil {

    private String kodeMobil, merkMobil, tahunMobil, hargaMobil;

    private String pesan;
    private Object[][] list;
    private final Koneksi koneksi = new Koneksi();
    private final PesanDialog pesanDialog = new PesanDialog();

    public String getKodeMobil() {
        return kodeMobil;
    }

    public void setKodeMobil(String kodeMobil) {
        this.kodeMobil = kodeMobil;
    }

    public String getMerkMobil() {
        return merkMobil;
    }

    public void setMerkMobil(String merkMobil) {
        this.merkMobil = merkMobil;
    }

    public String getTahunMobil() {
        return tahunMobil;
    }

    public void setTahunMobil(String tahunMobil) {
        this.tahunMobil = tahunMobil;
    }

    public String getHargaMobil() {
        return hargaMobil;
    }

    public void setHargaMobil(String hargaMobil) {
        this.hargaMobil = hargaMobil;
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
                SQLStatemen = "select * from mobil where kodeMobil=?";

                preparedStatement = connection.prepareStatement(SQLStatemen);
                preparedStatement.setString(1, kodeMobil);
                rset = preparedStatement.executeQuery();

                rset.next();
                if (rset.getRow() > 0) {
                    if (pesanDialog.tampilkanPilihan("Kode Mobil sudah ada\nApakah data diperbaharui?", "Konfirmasi", new Object[]{"Ya", "Tidak"}) == 0) {
                        simpan = true;
                        SQLStatemen = "update mobil set merkMobil=?, tahunMobil=?, hargaMobil=? where kodeMobil=?";

                        preparedStatement = connection.prepareStatement(SQLStatemen);
                        preparedStatement.setString(1, merkMobil);
                        preparedStatement.setInt(2, Integer.parseInt(tahunMobil));
                        preparedStatement.setInt(3, Integer.parseInt(hargaMobil));
                        preparedStatement.setString(4, kodeMobil);

                        jumlahSimpan = preparedStatement.executeUpdate();
                    }
                } else {
                    simpan = true;
                    SQLStatemen = "insert into mobil(merkMobil, tahunMobil, hargaMobil) values (?,?,?)";

                    preparedStatement = connection.prepareStatement(SQLStatemen);
                    preparedStatement.setString(1, merkMobil);
                    preparedStatement.setInt(2, Integer.parseInt(tahunMobil));
                    preparedStatement.setInt(3, Integer.parseInt(hargaMobil));

                    jumlahSimpan = preparedStatement.executeUpdate();
                }

                if (simpan) {
                    if (jumlahSimpan < 1) {
                        adaKesalahan = true;
                        pesan = "Gagal menyimpan data mobil";
                    }
                }

                preparedStatement.close();
                rset.close();
                connection.close();
            } catch (SQLException ex) {
                adaKesalahan = true;
                pesan = "Tidak dapat membuka tabel mobil\n" + ex + "\n" + SQLStatemen;
            }
        } else {
            adaKesalahan = true;
            pesan = "Tidak dapat melakukan koneksi ke server\n" + koneksi.getPesanKesalahan();
        }
        
        this.kodeMobil = "";
        
        return !adaKesalahan;
    }

    public boolean baca(String kodeMobil) {
        boolean adaKesalahan = false;
        Connection connection;

        this.kodeMobil = "";
        this.merkMobil = "";
        this.tahunMobil = "";
        this.hargaMobil = "";

        if ((connection = koneksi.getConnection()) != null) {
            PreparedStatement preparedStatement;
            ResultSet rset;

            try {
                String SQLStatemen = "select * from mobil where kodeMobil=?";
                preparedStatement = connection.prepareStatement(SQLStatemen);
                preparedStatement.setString(1, kodeMobil);
                rset = preparedStatement.executeQuery();

                rset.next();
                if (rset.getRow() > 0) {
                    this.kodeMobil = rset.getString("kodeMobil");
                    this.merkMobil = rset.getString("merkMobil");
                    this.tahunMobil = rset.getString("tahunMobil");
                    this.hargaMobil = rset.getString("hargaMobil");
                } else {
                    adaKesalahan = true;
                    pesan = "Kode Mobil \"" + kodeMobil + "\" tidak ditemukan";
                }

                preparedStatement.close();
                rset.close();
                connection.close();
            } catch (SQLException ex) {
                adaKesalahan = true;
                pesan = "Tidak dapat membuka tabel mobil\n" + ex;
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
                SQLStatemen = "select kodeMobil, merkMobil, tahunMobil, hargaMobil from mobil";
                sta = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                rset = sta.executeQuery(SQLStatemen);

                rset.next();
                rset.last();
                list = new Object[rset.getRow()][2];
                if (rset.getRow() > 0) {
                    rset.first();
                    int i = 0;
                    do {
                        list[i] = new Object[]{rset.getString("kodeMobil"), rset.getString("merkMobil"), rset.getString("tahunMobil"), rset.getString("hargaMobil")};
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

    public boolean hapus(String kodeMobil) {
        boolean adaKesalahan = false;
        Connection connection;

        if ((connection = koneksi.getConnection()) != null) {
            int jumlahHapus;
            String SQLStatemen;
            PreparedStatement preparedStatement;

            try {
                SQLStatemen = "delete from mobil where kodeMobil=?";
                preparedStatement = connection.prepareStatement(SQLStatemen);
                preparedStatement.setString(1, kodeMobil);
                jumlahHapus = preparedStatement.executeUpdate();

                if (jumlahHapus < 1) {
                    pesan = "Data mobil dengan KodeMobil " + kodeMobil + " tidak ditemukan";
                    adaKesalahan = true;
                }

                preparedStatement.close();
                connection.close();
            } catch (SQLException ex) {
                adaKesalahan = true;
                pesan = "Tidak dapat membuka tabel mobil\n" + ex;
            }
        } else {
            adaKesalahan = true;
            pesan = "Tidak dapat melakukan koneksi ke server\n" + koneksi.getPesanKesalahan();
        }
        
        return !adaKesalahan;
    }
}
