/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoDavid;

/**
 *
 * @author VESPERTINO
 */
public class Main {
    public static void main(String[] args) {
        EjercicioDavid_ImplementacionDao modelo = new EjercicioDavid_ImplementacionDao();
        EjercicioDavid_Swing vista = new EjercicioDavid_Swing();
        VistaConsola vista1 = new VistaConsola();
        
        Controlador controla = new Controlador(modelo, vista);
    }
     
    
}
