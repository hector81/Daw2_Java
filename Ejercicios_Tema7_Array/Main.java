/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema7_Array;

/**
 *
 * @author Hector Garcia
 */
public class Main {
    public static void main(String[] args) {
        float nAleatorio[]; // declaracion        
        nAleatorio = new float[20]; // Inicializacion
        double media;
        
        UtilidadesArray.rellenaArrayConAleatoriosFloat (nAleatorio, 0, 10);
        media = UtilidadesArray.calculaMedia(nAleatorio);
        System.out.println("La media es: " + media);
        
        
    }
}
