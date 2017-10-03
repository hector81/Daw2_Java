/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema10_ObjectinputStream1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author VESPERTINO
 */
public class MainCliente {

    public static void main(String[] args) {
        ArrayList aux = null;
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        Cliente cliente1 = new Cliente("Hector", "Garcia", 30,16665500);
        Cliente cliente2 = new Cliente("David", "Gonzalez", 40,15151515);
        Cliente cliente3 = new Cliente("Sara", "Garcia", 20,02020202);
        
        lista.add(cliente1);
        lista.add(cliente2);
        lista.add(cliente3);
        
        Utilidades.guardarCliente(lista);
  
        aux = Utilidades.leerClientes();
        
        for(int i=0; i<aux.size(); i++)
        {
         System.out.println(aux.get(i).toString());
        }
    }
}
