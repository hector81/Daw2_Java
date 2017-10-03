/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema8_HashMap_Traduccion;

/**
 *
 * @author VESPERTINO
 */
public class Main {
    //main
    public static void main(String[] args) {
        Palabras palabra1 = new Palabras("coche","car", "voiture");
        Palabras palabra2 = new Palabras("casa","house", "maison");
        Palabras palabra3 = new Palabras("jardin","garden", "jardin");
        
        ListaDePalabras lista = new ListaDePalabras();
        
        Vista vista = new Vista();
        
        lista.añadir(new Integer(0),palabra1);
        lista.añadir(new Integer(1),palabra2);
        lista.añadir(new Integer(2),palabra3);
        
        vista.jugar(lista);
    }
}
