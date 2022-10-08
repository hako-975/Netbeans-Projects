
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author andri
 */
public class Koneksi {

    String jdbcDriver = "com.mysql.cj.jdbc.Driver";
    String dbUrl = "jdbc:mysql://localhost/db_kontak_hp";
    String username = "root";
    String password = "";

    Connection con;
    Statement st;
    ResultSet rs;
    PreparedStatement pst;

    public Koneksi() {
        try {
            Class.forName(jdbcDriver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            con = DriverManager.getConnection(dbUrl, username, password);
            System.out.println("Koneksi berhasil");
        } catch (SQLException ex) {
            System.out.println("Koneksi gagal");
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void InsertKontak(String nama, String no_telepon, String email, String alamat, String perusahaan) {
        String query = "INSERT INTO kontak_hp (nama_lengkap, no_telepon, email, alamat, perusahaan)"
                + " VALUES (?, ?, ?, ?, ?)";
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, nama);
            pst.setString(2, no_telepon);
            pst.setString(3, email);
            pst.setString(4, alamat);
            pst.setString(5, perusahaan);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Gagal menambahkan kontak");
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void UpdateKontak(String nama, String no_telepon, String email, String alamat, String perusahaan, int id_kontak) {
        String query = "UPDATE kontak_hp SET nama_lengkap = ?, no_telepon = ?, email = ?, alamat = ?, perusahaan = ?"
                + " WHERE id_kontak_hp = ?";
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, nama);
            pst.setString(2, no_telepon);
            pst.setString(3, email);
            pst.setString(4, alamat);
            pst.setString(5, perusahaan);
            pst.setInt(6, id_kontak);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Gagal mengubah kontak");
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void DeleteKontak(int id_kontak) {
        String query = "DELETE FROM kontak_hp WHERE id_kontak_hp = ?";
        try {
            pst = con.prepareStatement(query);
            pst.setInt(1, id_kontak);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Gagal menghapus kontak");
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet GetDataKontak()
    {
        String query = "SELECT * FROM kontak_hp";
        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
}
