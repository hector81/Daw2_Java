/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso;

import java.util.Comparator;

/**
 *
 * @author user
 */
public class AlumnoNombre implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        int aux=0;
        
        Alumno alumno1=(Alumno)o1;
        Alumno alumno2=(Alumno)o2;
        aux= alumno1.getNombre().compareTo(alumno2.getNombre());
        return aux;
    }
    
}
