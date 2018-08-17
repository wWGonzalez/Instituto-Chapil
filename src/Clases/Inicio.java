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
    
    
    }//Finaliza Validar Primer Uso
    
    
    
    public void validadGrado(){
        
        String sql="SELECT * FROM grado";
        try{
            s.pst= s.conn.prepareStatement(sql); 
            s.rs = s.pst.executeQuery(); 
             
            if(s.rs.next()){
               // System.out.println("si hay datos");
                //Login p = new Login();
                // p.setVisible(true);
                 
                  
                 s.rs.close();
                 System.out.println("Conexion cerrada");
                 
             //conn.close();
            }
            else{
                System.out.println("No hay datos en grado");
                this.registrarGrado();
               
            //    System.out.println("no hay datos");
            }
        }
                   
         catch (SQLException ex) {
         // handle any errors
        System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());    
         
        }
        
    }//Finaliza Validar Grado
    
    
    //Registra los grados en la Base de Datos
    
    private void registrarGrado(){
        try{
            String sql="Insert into grado(nombreGrado) values(?),(?),(?)";
            s.pst=s.conn.prepareStatement(sql);
            //pst.setString(1, null);
            s.pst.setString(1, "Primero"); 
            s.pst.setString(2, "Segundo"); 
            s.pst.setString(3, "Tercero");  
            s.pst.execute();
            
               s.rs.close();
               //System.out.println("Conexion cerrada");
            System.out.println("Grado creado exitosamente");
                      
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
   
    }
    
    
    
    
    
    public void validarSeccion(){
        
        
        String sql="SELECT * FROM seccion";
        try{
            s.pst= s.conn.prepareStatement(sql); 
            s.rs = s.pst.executeQuery(); 
             
            if(s.rs.next()){
               // System.out.println("si hay datos");
                //Login p = new Login();
                // p.setVisible(true);
                 
                  
                 s.rs.close();
                 System.out.println("Conexion cerrada");
                 
             //conn.close();
            }
            else{
                System.out.println("No hay datos en seccion");
                
                this.registrarSeccion();
                
                
            //    System.out.println("no hay datos");
            }
        }
                   
         catch (SQLException ex) {
         // handle any errors
        System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());    
         
        }
        
    }//Finaliza validar seccion
    
    
    
    //Registra las secciones en la Base de Datos
    
    private void registrarSeccion(){
        try{
            String sql="Insert into seccion(nombreSeccionl) values(?),(?),(?),(?)";
            s.pst=s.conn.prepareStatement(sql);
            //pst.setString(1, null);
            s.pst.setString(1, "A"); 
            s.pst.setString(2, "B"); 
            s.pst.setString(3, "C"); 
            s.pst.setString(4, "D"); 
            s.pst.execute();
            
            System.out.println("Seccion creada exitosamente");
            s.rs.close();
            //System.out.println("Conexion cerrada");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//Finaliza registrar Seccion
    
    
    
 
}//Finaliza la clase

