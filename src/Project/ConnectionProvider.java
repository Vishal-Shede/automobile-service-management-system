/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vishal
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/automobile","root","");
              return con;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionProvider.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionProvider.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
        
       
    }
    
}
