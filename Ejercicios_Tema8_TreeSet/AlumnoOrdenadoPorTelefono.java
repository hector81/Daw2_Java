/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema8_TreeSet;



/**
 *
 * @author Hector Garcia
 */
import java.util.Comparator;
//ES UN COMPARADOR DE TELEFONOS QUE CREAMOS PERO NO ES EL ORDEN NATURAL
public class AlumnoOrdenadoPorTelefono implements Comparator{
    //Sobreescribimos el metodo compare
    @Override
    public int compare(Object o1, Object o2) {
        //creamos los dos objetos que vamos a comparar
        Alumno a1 = (Alumno)o1;
        Alumno a2 = (Alumno)o2;        
        long aux;
        //depende de lo que devuelve nos dara el orden
        aux = a1.getTelefono() - a2.getTelefono();
        return (int) aux;    
    }
}
