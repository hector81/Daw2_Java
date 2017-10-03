/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author VESPERTINO
 */
public class Main {
    public static void main(String[] args) {
        VistaSwing vista = new VistaSwing();
        Modelo modelo = new Modelo();
        
        Controlador control = new Controlador(vista, modelo);
    }
}
