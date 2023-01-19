/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package billingsystem2.pkg0;
import java.sql.*;

/**
 *
 * @author Darwin Lustre
 */
public class mysql_connector {
    public static Connection getCon() {
        
        String className = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/bms_db";
        String user = "root";
        String password = "1234root5678";
        
        try {
            Class.forName(className);
                Connection conn = DriverManager.getConnection(url, user, password);

            return conn;
        } catch(Exception e) {
            return null;
        }
    }
    
}
