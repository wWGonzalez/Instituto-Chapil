/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author wer
 */


public class SQL {
    
 public   Connection conn=null;
 public   ResultSet rs = null;
 public   PreparedStatement pst=null;

    public SQL() throws ClassNotFoundException {
        conn = Conexion.ConnectDB(); 
    }
    
    
    
    

    
}
