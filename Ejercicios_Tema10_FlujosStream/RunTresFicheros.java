/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema10_FlujosStream;

/**
 *
 * @author VESPERTINO
 */
public class RunTresFicheros {
    public static void main(String[] args) {
        //instanciamos objeto archivo
        TresFicheros archivoHector =new TresFicheros();
        
        archivoHector.datosDirecorio("C:\\Prueba");
        System.out.println("*******************");
        archivoHector.datosArchivos("eres.txt"); 
        System.out.println("*******************");
        archivoHector.datosArchivos("git.docx");        
        System.out.println("*******************");
        archivoHector.datosArchivos("homer.jpg"); 
        System.out.println("*******************");
        archivoHector.datosArchivos("wer.exe");
    }
    
}





