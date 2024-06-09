/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author tifanny
 */
public class koneksi {

    private static Connection KoneksiDatabse;

    public static Connection koneksiDB() throws SQLException {
        try {
            String DB = "jdbc:mysql://localhost/aplikasidatabasefutsal";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            KoneksiDatabse = (Connection) DriverManager.getConnection(DB, user, pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tidak ada koneksi", "Error", JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
            System.exit(0);
        }
        return KoneksiDatabse;
    }
}
