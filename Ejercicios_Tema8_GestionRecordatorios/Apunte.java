/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema8_GestionRecordatorios;


import java.util.GregorianCalendar;
import java.util.Objects;

/**
 *
 * @author Hector Garcia
 */
public class Apunte implements Comparable{
     //campos o atributos
    private String asunto;
    private GregorianCalendar fecha;
    private String descripcion;
    
    //constructores
   public Apunte(){
        this.asunto = "";
        this.descripcion = "";
        fecha = new GregorianCalendar();
    }
    
    public Apunte(String asunto, String descripcion) {
        this.asunto = asunto;
        this.descripcion = descripcion;
        fecha = new GregorianCalendar();
    }
   
   //getters and setters
    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public String getTextoDescripcion() {
        return descripcion;
    }

    public void setTextoDescripcion(String TextoDescripcion) {
        this.descripcion = TextoDescripcion;
    }
    
    //metodo ToString

    @Override
    public String toString() {
        return "Apunte : asunto = " + asunto + " , fecha = " + fecha + " , Texto Descripcion = " + descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.asunto);
        return hash;
    }
    
    
    
    //metodo equals
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Apunte other = (Apunte) obj;
        if (!Objects.equals(this.asunto, other.asunto)) {
            return false;
        }
        return true;
    }//fin metodo
    
    @Override
    public int compareTo(Object o){
        int aux;
        Apunte apunte = (Apunte) o;
        this.getFecha().set(GregorianCalendar.HOUR,this.fecha.get(GregorianCalendar.HOUR));
        this.getFecha().set(GregorianCalendar.MINUTE,this.fecha.get(GregorianCalendar.MINUTE));
        this.getFecha().set(GregorianCalendar.SECOND,this.fecha.get(GregorianCalendar.SECOND));
        aux = apunte.getFecha().compareTo(this.fecha);
        return aux;
    }
    
    
}//fin clase
