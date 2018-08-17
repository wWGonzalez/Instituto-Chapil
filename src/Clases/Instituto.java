/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Formularios.Login;
import Formularios.Principal;
import Formularios.RegistrarUsuario;


/**
 *
 * @author wer
 */
public class Instituto {
    
  
    public Instituto() {
        
    }
    
   
  


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        //Login n = new Login();
        //n.setVisible(true);
        // TODO code application logic here
        Inicio n = new Inicio();
        n.validarPrimerUso();
        n.validadGrado();
        n.validarSeccion();
        
    }
    
    
    
}
