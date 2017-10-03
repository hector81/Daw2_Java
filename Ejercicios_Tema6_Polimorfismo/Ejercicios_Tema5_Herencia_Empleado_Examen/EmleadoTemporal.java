/*
Empleado temporal: del que nos interesa saber la fecha de alta y de baja en la empresa.
Las fechas serán de tipo GregorianCalendar
 */
package Ejercicios_Tema6_Polimorfismo.Ejercicios_Tema5_Herencia_Empleado_Examen;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Hector Garcia
 */
public class EmleadoTemporal extends Empleado {
    //atributos propios
    private GregorianCalendar yearAlta;
    private GregorianCalendar yearBaja;

    //constructor
    public EmleadoTemporal(Calendar yearAlta, Calendar yearBaja, String nif, String nombre, int edad) {
        super(nif, nombre, edad);
        this.yearAlta = (GregorianCalendar) yearAlta;
        this.yearBaja = (GregorianCalendar) yearBaja;
    }

    //getters and setters
    public Calendar getYearAlta() {
        return yearAlta;
    }

    public void setYearAlta(Calendar yearAlta) {
        this.yearAlta = (GregorianCalendar) yearAlta;
    }

    public Calendar getYearBaja() {
        return yearBaja;
    }

    public void setYearBaja(Calendar yearBaja) {
        this.yearBaja = (GregorianCalendar) yearBaja;
    }
    
    //metodo sobreescrito
    //En los empleados temporales el suelo mensual es fijo (salario mínimo interprofesional 580 €).
    @Override
    public double calculaSueldo() {
        double smi =580.00;
        return smi;
    }  

    @Override
    public String toString() {
        return "El nombre del empleado temporal es " + this.getNombre() + " y su nif es " + this.getNif() + 
                " y su edad es " + this.getEdad() + " y su salario es " + calculaSueldo() +
                "\n ,su año de alta= " + yearAlta.getTime() + " , su año de baja= " + yearBaja.getTime();
    }
    
    
    
}//fin clase
