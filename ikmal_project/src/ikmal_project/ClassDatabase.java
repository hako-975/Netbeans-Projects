/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ikmal_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
    
/**
 *
 * @author ASUS
 */
public class ClassDatabase {

    public static String PathReport=System.getProperty("user.dir") + "/src/ikmal_project";
    private static Connection koneksi;
    public static Connection getkoneksi() {
        if (koneksi==null) {
            try {
                String url=new String();
                String user=new String();
                String password=new String();
                url="jdbc:mysql://localhost:3306/ikmal_04tplp016";
                user="root";
                password="";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi=DriverManager.getConnection(url,user,password);
            }catch (SQLException t) {
                System.out.println("Error membuat koneksi");
            }
        }
     return koneksi;
    }

    
}
