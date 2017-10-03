/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema10_Buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Prueba4 {

    public Prueba4() {
        //atributos
        FileReader fr = null;
        BufferedReader br = null;
        File archivoOrigen;
        URL url;
        String linea;//declaramos la linea de la cadena que vamos a leer

        //intentamos
        try {
            // Abrir un archivo
            url = getClass().getResource("/Ejercicios_Tema10_Buffer/4_CallejeroValencia.txt");
            archivoOrigen = new File(url.getFile());
            fr = new FileReader(archivoOrigen);
            br = new BufferedReader(fr);//le pasamos como parametro el objeto
            // Leer una linea
            linea = br.readLine();
            //mientras lea la cadena
            while ((linea = br.readLine()) != null) {
                ////////////////////////////////////////////////////
                dameFicheros(linea);
                /////////////////////////////////////////////////////
            }//fin de la operacion WHILE

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Run.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Run.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
                fr.close();

            } catch (IOException ex) {
                Logger.getLogger(Run.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private static void dameFicheros(String linea) {
        //variables locales
        String destino = null;
        BufferedWriter bw = null;
        FileWriter fw = null;
        String nuevaLinea = "";//declaramos variable para acumular las lineas
        String abcedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] arrayChar = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        try {
            //la primera vuelta dara 26 vueltas y creara los archivos
            for (int j = 0; j < abcedario.length(); j++) {
                destino = "C:\\Users\\user\\Documents\\NetBeansProjects\\Hector_Proyecto\\src\\Ejercicios_Tema10_Buffer\\resultado" + abcedario.charAt(j) + ".txt";            
                fw = new FileWriter(destino);
                //declaramos objeto de BufferedWriter
                bw = new BufferedWriter(fw);
                //tratamiento de los datos
                String cadena;//usaremos esta variable para almacenar las variables
                cadena = linea.toUpperCase();//pasamos a mayusculas
                //la segunda vuelta ingresar en los archivos las lineas de las letras que le correspondan
                for (int i = 0; i < arrayChar.length; i++) {
                    if (cadena.charAt(10) == arrayChar[i]) {
                        //acumulamos la cadena o linea si coincide con el caracter
                        nuevaLinea = nuevaLinea + "\n" + linea;
                        
                    }
                }//fin for 2
                //ESTO ESTA MAL , NO CIERRA BIEN CORREGIR 
                bw.write(nuevaLinea); //pasamos los resultados y lo escribimos en BufferedWriter
                bw.close();//cerramos BufferedWriter
                fw.close();//cerramos FileWriter
            }//fin for 1
        } catch (IOException ex) {
            Logger.getLogger(Prueba4.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Prueba4.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//fin metodo

    //
    //main
    public static void main(String[] args) {
        Prueba4 p = new Prueba4();
    }//fin main
    
}//fin clase