/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercio_Tema6_Polimorfismo_Empleado_Abstracto;

import java.util.Calendar;


/**
 *
 * @author Hector Garcia
 */
public class TestEmpleado {
    public static void main(String[] args) {
        EmpleadoHoras hector = new EmpleadoHoras("1514545", "hector", 36, 12, 0, 1);
        hector.setNumeroHorasTrabajadasMes(167);
        System.out.println("Enero: " + hector.calculaSueldo());
        
        // Mes de febrero
        hector.setNumeroHorasTrabajadasMes(235);
        System.out.println("febrero: " + hector.calculaSueldo());
        
        // aumento de sueldo
        hector.setPrecioHoraTrabajada(12.5);
        System.out.println("Enero: " + hector.calculaSueldo());
        
        System.out.println("*********************************");
        
        //creamos objeto EmpleadoHoras
        EmpleadoHoras empleadoHoras = new EmpleadoHoras("89897878d","Isabel Garcia",28,5,1,3);
        //llamamos metodos
        System.out.println(empleadoHoras.toString());
        
        System.out.println("*********************************");
        
        //creamos objeto EmpleadoHoras
         //Creo las dos instancias de fecha
         //Instanciamos el objeto Calendar en fecha obtenemos la fecha actua       
        Calendar fechaAlta = Calendar.getInstance();
        Calendar fechaBaja = Calendar.getInstance();
        fechaAlta.set(Calendar.YEAR, 2010);
        fechaBaja.set(Calendar.YEAR, 2015);
        EmleadoTemporal empleadoTemp = new EmleadoTemporal(fechaAlta,fechaBaja,"89897878d","María Jesus ",38);
        //llamamos metodos
        System.out.println(empleadoTemp.toString());
        
        System.out.println("*********************************");
        
        //creamos instancia objeto EmpleadoFijo
        EmpleadoFijo empleadoFijo = new EmpleadoFijo("99663320a","Jose Luis",42, fechaAlta, fechaBaja);
        //llamamos metodos
        System.out.println(empleadoFijo.toString());
        
        
    }//fin main
}//fin clase
