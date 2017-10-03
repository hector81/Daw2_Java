/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercio_Tema6_Polimorfismo_Empleado_Abstracto;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author VESPERTINO
 */
public class EmpleadoHoras1 extends Empleado {
    //atributos
    private GregorianCalendar yearAlta;
    private GregorianCalendar yearBaja;
    
    //constructor
    public EmpleadoHoras1(String nif, String nombre, int edad, Calendar yearAlta,
            Calendar yearBaja) {
        super(nif, nombre, edad);
        this.yearAlta = (GregorianCalendar) yearAlta;
        this.yearBaja = (GregorianCalendar) yearBaja;
    }
    //calendar today
    
    //getters and setters
    public GregorianCalendar getYearAlta() {
        return yearAlta;
    }

    public void setYearAlta(GregorianCalendar yearAlta) {
        this.yearAlta = yearAlta;
    }
    
    public GregorianCalendar getYearBaja() {
        return yearBaja;
    }

    public void setYearBaja(GregorianCalendar yearBaja) {
        this.yearBaja = yearBaja;
    }
    
    //metodo para calcular la diferencia de años
    public int diferenciaNumeroYears(GregorianCalendar yearAlta, GregorianCalendar yearBaja) {         
//       Calendar c = Calendar.getInstance();
//       int fechaN = c.getTime().getYear();
        //declaramos variable diferencia
        int diferenciaYear;
        //restamos
        diferenciaYear = yearBaja.get(Calendar.YEAR) - yearAlta.get(Calendar.YEAR);
        return diferenciaYear;
        
    }
    
    //En los empleados fijos el sueldo es el resultado de sumarle a la base (SMI) un complemento
    //anual fijo (20 € en la actualidad, pero hay que permitir la modificación de dicho complemento)
    //multiplicado por el número de años en la empresa. ◦ Salario = SMI + (Complemento * Años_Antigüedad)
    @Override
    public double calculaSueldo() {
        return getSalario_minimo() + (20*diferenciaNumeroYears(yearAlta,yearBaja));
    }  

    @Override
    public String toString() {
        return "El nombre del empleado fijo es " + this.getNombre() + " y su nif es " + this.getNif() + 
                " y su edad es " + this.getEdad() + " y su salario es " + calculaSueldo() +
                "\n ,su año de alta= " + this.getYearAlta().getTime() +
                ", los años que lleva en la empresa este trabajador son " + diferenciaNumeroYears(yearAlta,yearBaja);
         
    }
    
    
    
}//fin clase