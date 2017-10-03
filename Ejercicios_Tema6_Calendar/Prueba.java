/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema6_Calendar;

import java.util.Calendar;

/**
 *
 * @author Alumno 10
 */
public class Prueba {

    public static void main(String[] args) {
        Calendar sameDate = Calendar.getInstance();

        sameDate.set(Calendar.YEAR, 2010);

        System.out.println("fecha: " + sameDate.getTime());
    }
}
//http://chuwiki.chuidiang.org/index.php?title=Clase_Calendar_de_Java