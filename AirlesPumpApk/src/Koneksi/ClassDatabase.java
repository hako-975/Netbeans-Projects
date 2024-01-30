/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author TEGUH-PC
 */
public class ClassDatabase {
    private static Connection Koneksi;
    public static Connection getKoneksi(){
        if (Koneksi==null){
            try{
                String url = new String();
                String user = new String();
                String password = new String();
                
                url="jdbc:mysql://localhost:3306/airles_pump";
                user="root";
                password="";
                
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                Koneksi = DriverManager.getConnection(url,user,password);
                
            }catch (SQLException t){
                System.out.println("Error Membuat Koneksi");
            }
        }
        return Koneksi;
    }
}
