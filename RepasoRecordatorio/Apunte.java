/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoRecordatorio;

import java.util.GregorianCalendar;
import java.util.Objects;

/**
 *
 * @author user
 */
public class Apunte implements Comparable {

    //atributos
    private String asunto;
    private String descripcion;
    private GregorianCalendar fecha;
    //constructores

    public Apunte(String asunto, String descripcion) {
        this.asunto = asunto;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public Apunte() {
        fecha = new GregorianCalendar();
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    //getters and setters
    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    //toSring
    @Override
    public String toString() {
        return "Apunte{" + "asunto=" + asunto + ", descripcion=" + descripcion + ", fecha=" + fecha + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    //equals y hashcode
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
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
    }

    //compareto
    @Override
    public int compareTo(Object o) {
        int aux;
        Apunte apunte = (Apunte) o;
        apunte.getFecha().set(GregorianCalendar.YEAR, this.fecha.get(GregorianCalendar.YEAR));
        apunte.getFecha().set(GregorianCalendar.DAY_OF_MONTH, this.fecha.get(GregorianCalendar.DAY_OF_MONTH));
        apunte.getFecha().set(GregorianCalendar.MONTH, this.fecha.get(GregorianCalendar.MONTH));
        aux = apunte.getFecha().compareTo(apunte.getFecha());
        return aux;

    }

}
