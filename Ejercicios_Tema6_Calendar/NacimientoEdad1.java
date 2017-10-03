/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema6_Calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class NacimientoEdad1 {

    public static void main(String[] args) {
        //Instanciamos el objeto Calendar en fecha obtenemos la fecha actual
        Calendar fecha = new GregorianCalendar();
        //usando el método get y el parámetro correspondiente
        int añoACTUAL = fecha.get(Calendar.YEAR);
        //imprimimos año actual
        System.out.println("Fecha Actual: " + añoACTUAL);
        //creamos fecha de alta en la empresa
        GregorianCalendar fechaAlta = new GregorianCalendar(1985, 00, 16, 12, 45, 15);
        //MES 00 ENERO PORQUE ES UN ARRAY Y LA PRIMERA POSICION ES CERO	    
        System.out.println("Fecha Nacimiento: " + fechaAlta.getTime());
        //creamos un int
        int fa = fechaAlta.get(Calendar.YEAR);
        ///// hacer las restas
        int resta = fecha.get(Calendar.YEAR) - fechaAlta.get(Calendar.YEAR);
        //IMPRIMIR antiguedad
        System.out.println("Tu edad en este momento es: " + resta);
    }
}
