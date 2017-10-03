/*
Realizar un programa en java que lea de un fichero de caracteres con números y 
calcule y muestre su suma .Lectura FILEINPUSTREAM
 */
package Ejercicios_Tema10_FlujosStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author VESPERTINO
 */
public class LeerYSumarNumerosFicheros1 {
    //main
    public static void main(String[] args) {
        //atributos
        FileInputStream fich = null;
        int aux; //para los numeros
        int contador = 0;
        
        try {
            //creamos el objeto con la ruta
            fich = new  FileInputStream("C:\\Users\\user\\Documents\\NetBeansProjects\\Hector_Proyecto\\src\\Archivos\\Numeros.txt");
            //bucle while que mientras haya numeros que leer
            aux = fich.read();
            while (aux != -1) {
                if (aux!=13 && aux!=10) 
                    aux = aux + (aux-48);//asignamos el valor de la variable del numero leido
                aux = fich.read();//lo acumulamos
            }//fin del bucle while
            //IMPRIMIMOS
            System.out.println("LA SUMA DE LOS NUMEROS DEL ARCHIVO ES: " + contador);
        } catch (FileNotFoundException e) {
            e.printStackTrace();//no encuentra el archivo
        } catch(IOException ex){
            ex.printStackTrace();
        } finally {
            try {
                fich.close();
            } catch(IOException ex) {
                ex.printStackTrace();
            }
        }//fin try catch
        
    }//fin main
}//fin clase