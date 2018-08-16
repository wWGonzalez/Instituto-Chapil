/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author wer
 */


public class Conexion {
    
    public static Connection conn =null;
    

  public static Connection ConnectDB() throws ClassNotFoundException {
    // Load the JDBC driver
   Class.forName("org.mariadb.jdbc.Driver");
   System.out.println("Driver loaded");

          // Try to connect
        try {
             
        //conn = DriverManager.getConnection("jdbc:mysql://localhost/colegio", "root", "");
        
        //Conexion wer
        conn = DriverManager.getConnection("jdbc:mysql://localhost/colegio", "root", "01234");
    
         //Conexion MySQl
         // DriverManager.getConnection("jdbc:mysql://localhost/test?" +
        //                              "user=minty&password=greatsqldb");

         System.out.println("It works!");

         //conn.close();
        
    
         }catch (SQLException ex) {
         // handle any errors
        System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());    
         
        }
       return conn;
  }
    
}
