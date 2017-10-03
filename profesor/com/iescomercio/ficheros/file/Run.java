/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.ficheros.file;

/**
 *
 * @author VESPERTINO
 */
public class Run {
    public static void main(String[] args) {
        Ejercicio1 eje1=new Ejercicio1();
        
        eje1.datosArchivos("hormilla.txt");        
        eje1.datosArchivos("aragon1.exe");        
        System.out.println("*******************");
        eje1.datosArchivos("uninstall.exe"); 
        System.out.println("*******************");
        eje1.datosDirecorio("C:\\enrique");
    }
    
}







