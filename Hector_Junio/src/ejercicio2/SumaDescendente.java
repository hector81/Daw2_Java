/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VESPERTINO
 */
public class SumaDescendente {
    //atributos
    private File file;
    private FileReader archivoLeer;
    private BufferedReader filtroLeer;
    
    public void leerArchivo(){
        String linea;
        int numero =0;
        int numeroNuevo=0;
        int resultado=0;
        int resto =1;//inicio asi para que en bucle sea distinto de 0
        int suma = 0;
        int sumaTotal= 0;
        try {
            // E:\Users\VESPERTINO\Documents\NetBeansProjects\Hector_Junio
            file = new File("fichero.txt");
            archivoLeer = new FileReader(file);
            filtroLeer = new BufferedReader(archivoLeer);
            
            while(filtroLeer.readLine() != null){
                linea = filtroLeer.readLine();//cogemos el numero de la lineas
                //pasamos el numero a int
                numero = Integer.parseInt(linea);
                
                //mientras ese resto no sea cero
                    while(resto != 0){
                        //divido ENTRE 10 PARA QUE ME DE EL RESTO
                        resto = numero%10;
                        //ACUMULO EN UNA SUMA
                        suma += resto;
                        //ADJUDICO COMO NUMERO NUEVO EL resto para la siguiente vuelta este cambiado
                        resto =resto;
                    }
                    //cogo el acumulado y pongo el numero entero que antes no habia puesto en
                    //el acumulado de la suma
                sumaTotal = suma + numero; 
                System.out.println(sumaTotal);
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SumaDescendente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SumaDescendente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                archivoLeer.close();
                filtroLeer.close();
            } catch (IOException ex) {
                Logger.getLogger(SumaDescendente.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
    //main
    public static void main(String[] args) {
        SumaDescendente sd= new SumaDescendente();
        sd.leerArchivo();
    }//fin main
    
}//fin clase
