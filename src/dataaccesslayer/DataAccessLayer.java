/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccesslayer;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.sql.*;

/**
 *
 * @author Zach
 */
public class DataAccessLayer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Properties prop = new Properties();
        InputStream input = null;
        Connection conn = null;
        
        try
        {
            input = new FileInputStream("C:\\Users\\Zach\\Documents\\NetBeansProjects\\DataAccessLayer\\src\\properties\\database_connection.properties");
            
            prop.load(input);
            
            String username = prop.getProperty("username");
            String password = prop.getProperty("password");
            String hostname = prop.getProperty("hostname");
            String connectionString = "jdbc:mysql://localhost:3306/test_database";
            
            conn = DriverManager.getConnection(connectionString, username, password);
            System.out.println("connected");
            
        } catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
    }
    
}
