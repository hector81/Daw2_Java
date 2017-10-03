/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema10_Buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Prueba {
    private File file1, file2;
    private FileReader ARCHIVOlee;
    private FileWriter ARCHIVOescribe;
    private BufferedReader buffer1 ;
    private BufferedWriter buffer2;
    
    public Prueba(){
    
        
        try {
            file1 = new File("D:\\RESULTADO22.txt");
            file2 = new File("D:\\RESULTADO33.txt");
            ARCHIVOlee = new FileReader(file1);
            buffer1 = new BufferedReader(ARCHIVOlee);
            int suma =0;
            while(buffer1.readLine()!=null){
                String linea = buffer1.readLine();
                
                int numero = Integer.parseInt(linea);  
                suma += numero;
                
            }   
            String str = " ee " + suma;
            
            ARCHIVOescribe = new FileWriter(file2);
            buffer2 = new BufferedWriter(ARCHIVOescribe);
            
            buffer2.write(str);
            
            
        
        } catch (IOException | NumberFormatException ex) {
            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
        } 
    
    }    
        public static void main(String[] args) {
     Prueba n = new Prueba();   
    }
}
