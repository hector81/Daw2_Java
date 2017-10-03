/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.ficheros.file;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;

/**
 *
 * @author VESPERTINO
 */
public class Ejercicio1 {
    private File archivo;
    private URL url;
    private FileInputStream fis;
    
    public Ejercicio1() {
     
        
    }
    public void datosArchivos(String nombre){
        archivo=new File("C:\\enrique\\"+nombre);
        System.out.println( "Dame nombre-->"+archivo.getName());
        System.out.println( "La ruta absoluta-->"+archivo.getAbsolutePath());
        System.out.println( "Permisos lectura-->"+archivo.canRead());        
        System.out.println( "Espacio-->"+archivo.length());
        System.out.println("Se puede ejecutar: " + archivo.canExecute());
  
    }
     public void datosDirecorio(String nombre){
         archivo=new File(nombre);
         if(archivo.isDirectory()){             
             for (int i = 0; i < archivo.listFiles().length; i++) {
                 System.out.println(archivo.listFiles()[i] ); 
               
             }
             
         }
        
     }
         
}
