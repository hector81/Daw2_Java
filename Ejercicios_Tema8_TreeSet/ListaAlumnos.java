/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema8_TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Hector Garcia
 */
public class ListaAlumnos {
    private TreeSet lista;

    public ListaAlumnos() {
        lista = new TreeSet();
    }
    
    public boolean guardaAlumno(Alumno a) {
        if (!lista.add(a)) {
            System.out.println("Alumno " + a.toString() +" esta repetido");
            return false;
        }
        return true;        
    }
    //este sera el metodo que ordenara por el orden natural
    public void muestraPorNumeroDeExpeciente() {
        Iterator i = lista.iterator();
        // Mostraremos listado haciendo uso del "orden natural"
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
    
    public void muestraPorNombre() {
        AlumnoOrdenadoPorNombre ordenNombre = new AlumnoOrdenadoPorNombre();
        TreeSet aux = new TreeSet(ordenNombre);
        aux.addAll(lista);
        
        Iterator i = aux.iterator();
        // Mostraremos listado haciendo uso de otro orden que no sea el natural
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
    
    //
    public void muestraPorNota() {
        AlumnoOrdenadoPorNota ordenNota = new AlumnoOrdenadoPorNota();
        TreeSet aux = new TreeSet(ordenNota);
        aux.addAll(lista);
        
        Iterator i = aux.iterator();
        // Mostraremos listado haciendo uso de otro orden que no sea el natural
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
    
    public void muestraPorTelefono() {
        AlumnoOrdenadoPorTelefono ordenTelefono = new AlumnoOrdenadoPorTelefono();
        TreeSet aux = new TreeSet(ordenTelefono);
        aux.addAll(lista);
        
        Iterator i = aux.iterator();
        // Mostraremos listado haciendo uso de otro orden que no sea el natural
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
    
}
