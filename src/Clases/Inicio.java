/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Formularios.Login;
import Formularios.Principal;
import Formularios.RegistrarUsuario;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author wer
 */
public class Inicio {
    


SQL  s = new SQL(); 

    public Inicio() throws ClassNotFoundException{
      
    }
    
    
    
    
    //Evalua si existen datos en la tabla usuario de colegio
    
    public void validarPrimerUso() throws ClassNotFoundException {
        
        
       String sql="SELECT * FROM usuario";
        try{
            s.pst= s.conn.prepareStatement(sql); 
            s.rs = s.pst.executeQuery(); 
             
            if(s.rs.next()){
               // System.out.println("si hay datos");
                 Login p = new Login();
                 p.setVisible(true);
                 
                  
                 s.rs.close();
                 System.out.println("Conexion cerrada");
                 
             //conn.close();
            }
            else{
                RegistrarUsuario r = new RegistrarUsuario();
                r.setVisible(true);
                
                
            //    System.out.println("no hay datos");
            }
        }
                   
         catch (SQLException ex) {
         // handle any errors
        System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());    
         
        }
    
    
    }
 
}
