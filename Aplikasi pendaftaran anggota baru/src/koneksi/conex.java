/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
    import com.mysql.jdbc.Driver;
    import java.sql.DriverManager;
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;
/**
 *
 * @author Dopamint
 */
public class conex {
    private static Connection koneksi;
    
    public static Connection GetConnection()throws SQLException{
        if(koneksi==null){
            new Driver();
            koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/pesertabaru","root","");
        }
        return koneksi;
    }
}
