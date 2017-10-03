/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema9_TryCatch;

import java.io.File;

/**
 *
 * @author Hector Garcia
 */
public class ProvocandoError {
    /*
    5. Copia y documenta para su entendimiento el ejemplo de la diapositiva
    2 de la página 6 de la teoría introduce el código en un método lla-
    mado método4
    */  
    public ProvocandoError (File aFile) {
        if(aFile == null){
            try {
                throw new Exception("No me puedes pasar un NULL");
            } catch (Exception ex) {
                //Logger.getLogger(ProvocandoError.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("error captura");
            }
        }
   
    }
    
}
