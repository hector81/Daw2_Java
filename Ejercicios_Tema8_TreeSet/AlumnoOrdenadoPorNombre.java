/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema8_TreeSet;

import java.util.Comparator;

/**
 *
 * @author Hector Garcia
 */
//ES UN COMPARADOR DE NOMBRES QUE CREAMOS PERO NO ES EL ORDEN NATURAL
public class AlumnoOrdenadoPorNombre implements Comparator{
    //Sobreescribimos el metodo compare
    @Override
    public int compare(Object o1, Object o2) {
        Alumno a1 = (Alumno)o1;
        Alumno a2 = (Alumno)o2;        
        int aux;
        
        aux = a2.getNombre().compareTo(a1.getNombre());
        return aux;    
    }
    
}
