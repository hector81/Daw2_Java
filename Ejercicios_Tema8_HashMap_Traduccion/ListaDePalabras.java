/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema8_HashMap_Traduccion;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author VESPERTINO
 */
public class ListaDePalabras {
    //propiedades
    private HashMap<Integer, Palabras> mapaPalabras;
    
    //constructor

    public ListaDePalabras() {
        mapaPalabras= new HashMap();
    }

    public void añadir(Integer indice,Palabras palabra1) {
        mapaPalabras.put(indice, palabra1);
    }

    public Palabras damePalabraCastellano() {
        //sacamos numero espacio palabras del hash map
        int tamaño = mapaPalabras.values().size();
        //int numeroAleatorio
        int numeroAleatorio = (int) (Math.floor(Math.random()*(tamaño)));
        //coge una palabra aleatoria
        return mapaPalabras.get(new Integer(numeroAleatorio));
    }
    
            
}//fin clase
