/*
Realizar un programa en java que lea de un fichero de caracteres con números y 
calcule y muestre su suma .Lectura FILEINPUSTREAM
 */
package Ejercicios_Tema10_FlujosStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author VESPERTINO
 */
public class LeerYSumarNumerosFicheros {

    private URL url;
    private String fichero;
    private FileInputStream fis;

    public LeerYSumarNumerosFicheros() {
        int dato;

        fichero = "numeros.txt";
        url = getClass().getResource("/Archivos/" + fichero);

    }

    public void abrirFichero() {
        try {
            fis = new FileInputStream(url.getFile());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeerYSumarNumerosFicheros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int leerDatos() {
        int aux, cont = 0;
        try {
            // Tratamiento
            aux = fis.read();
            while (aux != -1) {
                if (aux!=13 && aux!=10) 
                    cont = cont + (aux-48);
                aux = fis.read();
            }
            return cont;
        } catch (IOException ex) {
            Logger.getLogger(LeerYSumarNumerosFicheros.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
           
            try {
                fis.close(); // Cerrar fichero
            } catch (IOException ex) {
                Logger.getLogger(LeerYSumarNumerosFicheros.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
        return 0;
    }

}