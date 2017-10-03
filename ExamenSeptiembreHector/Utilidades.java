/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenSeptiembreHector;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VESPERTINO
 */
public class Utilidades {
    public static int contarLineasProvincias(){
        FileReader fr = null;
        BufferedReader br= null;
        File file;
        String linea;
        int contador=0;
        try {
            file = new File("directorio\\Provincias");
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            
            linea = br.readLine();
            
            while(linea != null){
                contador++;
                linea = br.readLine();
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Utilidades.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Utilidades.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                br.close();
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(Utilidades.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
          return contador;  
            
            
    }
    
    
    public static String separarProvincias(String linea){
        int punto;
        String resultado;
        punto = linea.indexOf("#") ;
        resultado = linea.substring(0,punto+1).trim();
        return resultado;
    }
    
    public static String separarCCAA(String linea){
        int punto;
        String resultado ="";
        punto = linea.indexOf("#");
        resultado = linea.substring(punto+1,linea.length());
        return resultado;
    }
    
    public static ArrayList ordenarCCAAAsinRepeticiones(ArrayList listaOrdenar){
        //creamos un linkedHasset que no contiene repeticiones
        LinkedHashSet<String> listaHS = new LinkedHashSet<>();
        //le añadimos el arrayList
        listaHS.addAll(listaOrdenar);
        //limpiamos
        listaOrdenar.clear();
        //y añadimos el hashset al array list vacio sin repeticiones
        listaOrdenar.addAll(listaHS);
        Collections.sort(listaOrdenar);///ordenamos la lista
        return listaOrdenar;
    
    }
    
    public static ArrayList limpiarArrayList(ArrayList lista){
        lista.clear();
        return lista;
    }



    public static boolean comprobarCCAAPROVINCIA(String provincia, String ccaa){
        FileReader fr = null;
        BufferedReader br= null;
        File file;
        String linea;
        boolean comp = false;
        int punto ;
        try {
            file = new File("directorio\\Provincias");
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            
            linea = br.readLine();
            
            while(linea != null){
                punto = linea.indexOf("#");
                if(linea.substring(0, punto).equals(provincia) && linea.substring(punto+1, linea.length()).equals(provincia)){
                    comp = true;
                }
                linea = br.readLine();
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Utilidades.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Utilidades.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                br.close();
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(Utilidades.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
          return comp;

    }

    
    
    }
