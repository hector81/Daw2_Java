/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema10_Buffer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hector Garcia
 */
public class CopiarArchivoHilo implements Runnable {
    //atributo objeto de CopiarArchivos
    private CopiarArchivos copia;

    //constructor al que le pasamos objeto 
    public CopiarArchivoHilo(CopiarArchivos copia) {
        this.copia = copia;
    }
    
    @Override
    public void run() {
        FileInputStream ficheroEntrada = null;
        FileOutputStream ficheroSalida = null;
        byte datos[] = new byte[1024];
        int lecturaBytes, contador=0 , numeroVueltas =0 ,porcentajeBarras =0;
        long longitud=0;
        File fichero;
        try {
            //declaro fichero para sacar su longitud
            fichero = new File(copia.getArchivoCopia().getAbsolutePath());
            
            //regla de 3 para que lea kn
            longitud=fichero.length();
            numeroVueltas= (int) (longitud/1024);//divide los archivos en bytes y calcule loas vueltas que v a dar
            porcentajeBarras= numeroVueltas/100;//esto es para el porcentaje  de barras
            //calse que nos permite leer
            ficheroEntrada = new FileInputStream(copia.getArchivoCopia());
            //clase que nos permite escribir
            ficheroSalida = new FileOutputStream(copia.getArchivoDestino());
            //leo y guardo en un array de 1024 bytes.
            lecturaBytes = ficheroEntrada.read(datos);
            //bucle que de las vueltas necesarias
            for (int i = 0; i < numeroVueltas; i++) {
                ficheroSalida.write(datos);                              
                lecturaBytes = ficheroEntrada.read(datos);
                //Si la lectura es solo una pasada lleno la barra directamente
                copia.getJpBarra().setValue(copia.getJpBarra().getValue() + porcentajeBarras);
                sleep(100);
                //copia.getFileChooserOrigen();
            }
            //para sacar todos los datos mas el resto que puede quedar
            int aux = (int)(longitud-numeroVueltas*1024);
            lecturaBytes = ficheroEntrada.read(datos);
            //el numero de bytes que queremos leer
            ficheroSalida.write(datos,0,aux);
            copia.getJpBarra().setValue(100);
            
            //hacemos los catch
        } catch (InterruptedException ex) {
            Logger.getLogger(CopiarArchivoHilo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CopiarArchivoHilo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CopiarArchivoHilo.class.getName()).log(Level.SEVERE, null, ex);
        } finally { 
            if(ficheroEntrada != null) 
                try { 
                    ficheroEntrada.close(); 
                } catch (IOException IOE) { 
                    ; 
                } 
            if(ficheroSalida != null) 
                try{ 
                    ficheroSalida.close(); 
                } catch (IOException IOE) { 
                    ; 
                }
        }//fin finally
    }
}
