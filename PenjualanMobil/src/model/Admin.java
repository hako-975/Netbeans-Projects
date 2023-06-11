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
public class Admin {

    private String kodeAdmin, username, password, namaAdmin;
    private String pesan;
    private Object[][] list;
    private final Koneksi koneksi = new Koneksi();
    private final PesanDialog pesanDialog = new PesanDialog();

    public String getKodeAdmin() {
        return kodeAdmin;
    }

    public void setKodeAdmin(String kodeAdmin) {
        this.kodeAdmin = kodeAdmin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNama_admin() {
        return namaAdmin;
    }

    public void setNama_admin(String namaAdmin) {
        this.namaAdmin = namaAdmin;
    }

    public String getPesan() {
        return pesan;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
                SQLStatemen = "select * from admin where username=?";

                preparedStatement = connection.prepareStatement(SQLStatemen);
                preparedStatement.setString(1, username);
                rset = preparedStatement.executeQuery();

                rset.next();
                if (rset.getRow() > 0) {
                    if (pesanDialog.tampilkanPilihan("Username sudah ada\nApakah data diperbaharui?", "Konfirmasi", new Object[]{"Ya", "Tidak"}) == 0) {
                        simpan = true;
                        SQLStatemen = "update admin set namaAdmin=? where username=?";

                        preparedStatement = connection.prepareStatement(SQLStatemen);
                        preparedStatement.setString(1, namaAdmin);
                        preparedStatement.setString(2, username);

                        jumlahSimpan = preparedStatement.executeUpdate();
                    }
                } else {
                    simpan = true;
                    SQLStatemen = "insert into admin(username, password, namaAdmin) values (?,?,?)";

                    preparedStatement = connection.prepareStatement(SQLStatemen);
                    preparedStatement.setString(1, username);
                    preparedStatement.setString(2, password);
                    preparedStatement.setString(3, namaAdmin);

                    jumlahSimpan = preparedStatement.executeUpdate();
                }

                if (simpan) {
                    if (jumlahSimpan < 1) {
                        adaKesalahan = true;
                        pesan = "Gagal menyimpan data admin";
                    }
                }

                preparedStatement.close();
                rset.close();
                connection.close();
            } catch (SQLException ex) {
                adaKesalahan = true;
                pesan = "Tidak dapat membuka tabel admin\n" + ex + "\n" + SQLStatemen;
            }
        } else {
            adaKesalahan = true;
            pesan = "Tidak dapat melakukan koneksi ke server\n" + koneksi.getPesanKesalahan();
        }

        return !adaKesalahan;
    }

    public boolean baca(String username) {
        boolean adaKesalahan = false;
        Connection connection;
        this.username = "";
        this.password = "";
        this.namaAdmin = "";

        if ((connection = koneksi.getConnection()) != null) {
            PreparedStatement preparedStatement;
            ResultSet rset;

            try {
                String SQLStatemen = "select * from admin where username=?";
                preparedStatement = connection.prepareStatement(SQLStatemen);
                preparedStatement.setString(1, username);
                rset = preparedStatement.executeQuery();

                rset.next();
                if (rset.getRow() > 0) {
                    this.kodeAdmin = rset.getString("kodeAdmin");
                    this.username = rset.getString("username");
                    this.password = rset.getString("password");
                    this.namaAdmin = rset.getString("namaAdmin");
                } else {
                    adaKesalahan = true;
                    pesan = "Username \"" + username + "\" tidak ditemukan";
                }
                
                preparedStatement.close();
                rset.close();
                connection.close();
            } catch (SQLException ex) {
                adaKesalahan = true;
                pesan = "Tidak dapat membuka tabel admin\n" + ex;
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
                SQLStatemen = "select username, namaAdmin from admin";
                sta = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                rset = sta.executeQuery(SQLStatemen);

                rset.next();
                rset.last();
                list = new Object[rset.getRow()][2];
                if (rset.getRow() > 0) {
                    rset.first();
                    int i = 0;
                    do {
                        list[i] = new Object[]{rset.getString("username"), rset.getString("namaAdmin")};
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

    public boolean hapus(String username) {
        boolean adaKesalahan = false;
        Connection connection;

        if ((connection = koneksi.getConnection()) != null) {
            int jumlahHapus;
            String SQLStatemen;
            PreparedStatement preparedStatement;

            try {
                SQLStatemen = "delete from admin where username=?";
                preparedStatement = connection.prepareStatement(SQLStatemen);
                preparedStatement.setString(1, username);
                jumlahHapus = preparedStatement.executeUpdate();

                if (jumlahHapus < 1) {
                    pesan = "Data admin dengan Username " + username + " tidak ditemukan";
                    adaKesalahan = true;
                }

                preparedStatement.close();
                connection.close();
            } catch (SQLException ex) {
                adaKesalahan = true;
                pesan = "Tidak dapat membuka tabel admin\n" + ex;
            }
        } else {
            adaKesalahan = true;
            pesan = "Tidak dapat melakukan koneksi ke server\n" + koneksi.getPesanKesalahan();
        }

        return !adaKesalahan;
    }
}
