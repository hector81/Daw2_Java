/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author VESPERTINO
 */
public class Run {
    public static void main(String[] args) {
        Reloj r = new Reloj();
        
        r.pedirDatos();
        r.muestraHoraCompleta();
        r.mostrarResultados();
    }
    
}
