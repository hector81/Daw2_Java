/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen_Mayo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author user
 */
public class Modelo {
public Modelo() {

    }

//metodo filtrado numeros :se leera primero totalmente el fichero nomfile1
    //y devolvera en una collecion de tipo set todos aqueloos numeros
    //que empiezen y acaben igual
    public HashSet<Integer> filtradoNumeros(File fichero) {
        HashSet<Integer> hsColeccion = new HashSet();
        //iniciamos buffer
        BufferedReader br = null;
        FileReader fr= null;
        String linea;
        String primera="";
        String ultima = "";
        int num = 0;
        try {
            fr = new FileReader(fichero);
            br = new BufferedReader(fr);
            linea= br.readLine();
            while(linea!= null){
              primera= linea.substring(0,1);
              ultima= linea.substring(linea.length()-1);
              if(primera.equals(ultima)){
                  num = Integer.parseInt(linea);
                  hsColeccion.add(num);
              }
              linea= br.readLine();  
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
                fr.close();
            }
            //mientras la linea no sea nula
            catch (IOException ex) {
                Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return hsColeccion;
    }
    
    //metodo filtracoleccion recorrera la coleccion, eliminando de ella los numeros menores de2 y mayores que 7
    public HashSet<String> filtraColeccion(HashSet<Integer> hsColeccionInt) {
        HashSet<String> hsColeccionString = new HashSet();
       
        String nuevaLinea ="";
        String num="";
        String nuevoNumero="";
        int numer=0;
        //recorremos collecion
        Iterator it = hsColeccionInt.iterator();
        while (it.hasNext()) {
            nuevaLinea =  it.next()+"";
            numer= Integer.parseInt(nuevaLinea);
            num = cambioNumero(numer);
            hsColeccionString.add(num);
        }
        
        return hsColeccionString;
    }
    
    public static String eliminarNumeros(String linea){
        StringBuilder sb = new StringBuilder(linea);
        for (int i = 0; i < linea.length(); i++) {
            if(linea.charAt(i)!= '8' && linea.charAt(i)!= '9' && 
                    linea.charAt(i)!= '0' &&linea.charAt(i)!= '1'){
                sb.append(linea.charAt(i));
            }
            
        }
        return sb.toString()+"";
    }

    //metodo rellenadestino guardara en los resultaod en el fichero destino nomfile2, tras sumar cada uno de los digitos
    //de los numeros recogidos en la coleccion
    // ej 6+3+9 = 21
    //ej 6+88+6 = 124
    public String rellenaDestino(HashSet<String> hsColeccionString, String ruta, String nombreFichero) {
        BufferedWriter escritor = null;
        int suma, numero;
        String aux;
        StringBuilder sb = new StringBuilder("");
        try {
            escritor = new BufferedWriter(new FileWriter(ruta + "\\" + nombreFichero + ".txt"));
            String nuevaLinea ="";
            String sumaNumeros="";
        
            //recorremos collecion
            Iterator it = hsColeccionString.iterator();
            while (it.hasNext()) {
                nuevaLinea =  it.next()+"";        
                sumaNumeros = sumarNumeros(nuevaLinea);
                System.out.println(sumaNumeros +" ");
                escritor.write(sumaNumeros);
            }
            

        } catch (IOException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                escritor.close();
            } catch (IOException ex) {
                Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    
    public static String sumarNumeros(String linea){
        String frase="";
        int numero= 0;
        int suma =0;
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < linea.length(); i++) {
            sb.append(linea.charAt(i) + " + ");
            numero= Integer.parseInt(linea.charAt(i) + "");
            suma += numero;
        }
        frase = sb.toString() + " = " + suma;
        return frase;
    }
    
    public static String cambioNumero(int numero){
        String numeroString="";
        String nuevoNumero ="";
        numeroString = Integer.toString(numero);
        for (int i = 0; i < numeroString.length(); i++) {
            if(numeroString.charAt(i)!= '0' && numeroString.charAt(i)!= '1' && numeroString.charAt(i)!= '8' &&
            numeroString.charAt(i)!= '9'){
                nuevoNumero += numeroString.charAt(i) + "";
            }
            
        }
        return nuevoNumero;
    }
}
