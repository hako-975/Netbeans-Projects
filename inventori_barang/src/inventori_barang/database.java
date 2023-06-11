/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventori_barang;

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
public class database {
    String jdbcDriver = "com.mysql.cj.jdbc.Driver";
    String dbUrl = "jdbc:mysql://localhost/inventori_barang";
    String username = "root";
    String password = "";
    
    Connection con;
    Statement st;
    ResultSet rs;
    PreparedStatement pst;
    
    public database() {
        try {
            Class.forName(jdbcDriver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            con = DriverManager.getConnection(dbUrl, username, password);
            System.out.println("Berhasil Terkoneksi!");
        } catch (SQLException ex) {
            System.out.println("Gagal Terkoneksi!");
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void InsertBarang(String nama_barang, int harga_beli, int harga_jual, int stok, String keterangan) {
        String query = "INSERT INTO barang (nama_barang, harga_beli, harga_jual, stok, keterangan) "
                + "VALUES (?, ?, ?, ?, ?)";
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, nama_barang);
            pst.setInt(2, harga_beli);
            pst.setInt(3, harga_jual);
            pst.setInt(4, stok);
            pst.setString(5, keterangan);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Gagal Menambahkan Barang");
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void UpdateBarang(int id_barang, String nama_barang, int harga_beli, int harga_jual, int stok, String keterangan) {
        String query = "UPDATE barang SET nama_barang = ?, harga_beli = ?, harga_jual = ?, stok = ?, keterangan = ? "
                + "WHERE id_barang = ?";
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, nama_barang);
            pst.setInt(2, harga_beli);
            pst.setInt(3, harga_jual);
            pst.setInt(4, stok);
            pst.setString(5, keterangan);
            pst.setInt(6, id_barang);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Gagal Mengubah Barang");
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void DeleteBarang(int id_barang) {
        String query = "DELETE FROM barang WHERE id_barang = ?";
        try {
            pst = con.prepareStatement(query);
            pst.setInt(1, id_barang);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Gagal Menghapus Barang");
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet GetDataBarang() {
        String query = "SELECT * FROM barang";
        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
}
