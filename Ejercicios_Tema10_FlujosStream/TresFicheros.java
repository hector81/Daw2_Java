/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema10_FlujosStream;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;

/**
 *
 * @author Hector Garcia
 */
public class TresFicheros {
    //atributo
    private File archivo;
    private URL url;
    private FileInputStream fis;
    //constructor
    public TresFicheros() {
     
        
    }
    //metodos
    public void datosArchivos(String nombre){
        archivo=new File("C:\\Prueba\\"+nombre);
        System.out.println( "Dame nombre-->"+archivo.getName());//nos da el nombre del archivo
        System.out.println( "La ruta absoluta-->"+archivo.getAbsolutePath());//nos da la ruta
        System.out.println( "Permisos lectura-->"+archivo.canRead()); //¿se puede leer?  booleano      
        System.out.println( "Espacio-->"+archivo.length());//tamaño del archivo
        System.out.println("Se puede ejecutar: " + archivo.canExecute());//¿se puede ejecutar?  booleano
  
    }
     public void datosDirecorio(String nombre){
         //instancia objeto del archivo con el nombre
         archivo=new File(nombre);
         if(archivo.isDirectory()){ //si el archivo es un directorio lo ejecuta            
             for (int i = 0; i < archivo.listFiles().length; i++) {
                 System.out.println(archivo.listFiles()[i] ); 
               
             }
             
         }
        
     }
         
}