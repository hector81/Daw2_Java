/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema6_Calendar;

import java.util.GregorianCalendar;

/**
 *
 * @author user
 */
public class CalcularEdadGrregorianCalendar {
    public static void main(String[] args) {
        GregorianCalendar fechaNacimiento = new GregorianCalendar(1985, 1, 1);
        GregorianCalendar fechaActual = new GregorianCalendar();
        int diferencia = fechaActual.get(GregorianCalendar.YEAR) - fechaNacimiento.get(GregorianCalendar.YEAR);
        System.out.println("edad " + diferencia);
    }
}
