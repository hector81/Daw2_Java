/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author user
 */
public class Fechas {
    public static void main(String[] args) {
        GregorianCalendar calendario = new GregorianCalendar(2015, 3, 2,22,33,15);
        
        int dia = calendario.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println(dia);
        int mes = calendario.get(GregorianCalendar.MONTH);
        System.out.println(mes);
        int año = calendario.get(GregorianCalendar.YEAR);
        System.out.println(año);
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        System.out.println(hora);
        int minuto = calendario.get(Calendar.MINUTE);
        System.out.println(hora);
        int segundo = calendario.get(Calendar.SECOND);
        System.out.println(hora);
    }
}
