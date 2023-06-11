/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas_kelompok;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class model_perpustakaan {
    String jdbcDriver = "com.mysql.cj.jdbc.Driver";
    String dbUrl = "jdbc:mysql://localhost/db_perpustakaan";
    String user = "root";
    String password = "";
    
    Connection con;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;
    
    boolean respons;
    
    public model_perpustakaan() {
        try {
            Class.forName(jdbcDriver);
            System.out.println("driver terhubung");
        } catch (ClassNotFoundException ex) {
            System.out.println("driver tidak terhubung");
            Logger.getLogger(model_perpustakaan.class.getName()).log(Level.SEVERE, null, ex);
        }
        try { 
            con = DriverManager.getConnection(dbUrl, user, password);
            System.out.println("berhasil terkoneksi mysql");
        } catch (SQLException ex) {
            System.out.println("tidak berhasil terkoneksi mysql");
            Logger.getLogger(model_perpustakaan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public boolean insertPer(String nama, String tanggal_pinjam, String tanggal_pengembalian, String keterangan){
         String query = "insert into tbl_tamu_peminjam (nama, tanggal_pinjam, tanggal_pengembalian, keterangan) values (?, ?, ?, ?)";
         try {
             ps = con.prepareStatement(query);
             ps.setString(1, nama);
             ps.setString(2, tanggal_pinjam);
             ps.setString(3, tanggal_pengembalian);
             ps.setString(4, keterangan);
             ps.executeUpdate();
             respons = true;
             System.out.println("berhasil insert");
        } catch (SQLException ex) {
            respons = false;
            System.out.println("tidak berhasil insert");
            Logger.getLogger(model_perpustakaan.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         return respons;
     }
     
     public ResultSet getAllPer() {
         String query = "select * from tbl_tamu_peminjam";
         try {
            st = con.createStatement();
            rs = st.executeQuery(query);
         } catch (SQLException ex) {
             Logger.getLogger(model_perpustakaan.class.getName()).log(Level.SEVERE, null, ex);
         }
         return rs;
     }
     
     public boolean updatePer(String nama, String tanggal_pinjam, String tanggal_pengembalian, String keterangan, int no) {
         String query = "update tbl_tamu_peminjam set nama = ?, "
                 + "tanggal_pinjam = ?, "
                 + "tanggal_pengembalian = ?, "
                 + "keterangan = ? where no = ?";
         try {
             ps = con.prepareStatement(query);
             ps.setString(1, nama);
             ps.setString(2, tanggal_pinjam);
             ps.setString(3, tanggal_pengembalian);
             ps.setString(4, keterangan);
             ps.setInt(5, no);
             ps.executeUpdate();
             respons = true;
             System.out.println("berhasil update");
         } catch (SQLException ex) {
            respons = false;
            System.out.println("tidak berhasil update");
            Logger.getLogger(model_perpustakaan.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         return respons;  
     }
     
     public void hapusPer (int no) {
         String query = "delete from tbl_tamu_peminjam where no = ?";
         try {
            ps = con.prepareStatement(query);
            ps.setInt(1, no);
            ps.executeUpdate();
     } catch (SQLException ex) {
         Logger.getLogger(model_perpustakaan.class.getName()).log(Level.SEVERE, null, ex);
  
     }
     }

}
