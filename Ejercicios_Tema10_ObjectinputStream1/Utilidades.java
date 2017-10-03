/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema10_ObjectinputStream1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VESPERTINO
 */
public class Utilidades {
    // Guardar objeto 
    public static void guardarCliente(ArrayList<Cliente> lista){   
        
        
        ObjectOutputStream salida = null;
        FileOutputStream ficheroSalida = null;
        try {
            ficheroSalida = new FileOutputStream("D:\\clientesLista.txt");
            salida = new ObjectOutputStream(ficheroSalida);
            salida.writeObject(lista);
            salida.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (ficheroSalida != null) {
                    ficheroSalida.close();
                }
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
       
    }//FIN METODO
    
    // Leer objeto
    public static ArrayList<Cliente> leerClientes(){       
        ObjectInputStream entrada = null;
        try {
            entrada =new ObjectInputStream(new FileInputStream("D:\\clientesLista.txt"));
            ArrayList<Cliente> aux = (ArrayList<Cliente>)entrada.readObject();
            return aux;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }
}
