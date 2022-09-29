/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tplp016_p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andri
 */
public class P5_mysql {

    String jdbcDriver = "com.mysql.cj.jdbc.Driver";
    String dbUrl = "jdbc:mysql://localhost/db_tplp016";
    String user = "root";
    String pass = "";

    Connection con;
    Statement st;
    ResultSet rs;
    PreparedStatement pst;

    public P5_mysql() {
        try {
            Class.forName(jdbcDriver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(P5_mysql.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            con = DriverManager.getConnection(dbUrl, user, pass);
            System.out.println("Berhasil terkoneksi ke Database");
        } catch (SQLException ex) {
            System.out.println("Gagal koneksi ke Database");
            Logger.getLogger(P5_mysql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertMhs(String nim, String nama, double n_uts, double n_uas, double n_akhir, char grade) {
        String query = "insert into tbl_mahasiswa (nim, nama_mahasiswa, n_uts, n_uas, n_akhir, grade) values (?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, nim);
            pst.setString(2, nama);
            pst.setString(3, Double.toString(n_uts));
            pst.setString(4, Double.toString(n_uas));
            pst.setString(5, Double.toString(n_akhir));
            pst.setString(6, String.valueOf(grade));
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("gagal insert");
            Logger.getLogger(P5_mysql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateMhs(String nim, String nama, double n_uts, double n_uas, double n_akhir, char grade) {
        String query = "update tbl_mahasiswa set nama_mahasiswa=?, n_uts=?, n_uas=? , n_akhir=?, grade=? where nim = ?";
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, nama);
            pst.setString(2, Double.toString(n_uts));
            pst.setString(3, Double.toString(n_uas));
            pst.setString(4, Double.toString(n_akhir));
            pst.setString(5, String.valueOf(grade));
            pst.setString(6, nim);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("gagal update");
            Logger.getLogger(P5_mysql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteMhs(String nim) {
        String query = "delete from tbl_mahasiswa where nim = ?";
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, nim);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("gagal delete");
            Logger.getLogger(P5_mysql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet getDataMahasiswa() {
        try {
            String query = "Select * from tbl_mahasiswa";
            st = con.createStatement();
            rs = st.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(P5_mysql.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rs;
    }
}
