/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso;

import java.util.Objects;

/**
 *
 * @author user
 */
public class Alumno implements Comparable{

    //atributos
    
    private int nExpediente;
    private String nombre; 
    private String apellido;
    private int edad;
    private int nota;
    private long telefono;
    
    public Alumno(int nExpediente, String nombre, String apellido, int edad, int nota, long telefono) {
        this.nExpediente = nExpediente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nota = nota;
        this.telefono = telefono;
    }

    public Alumno() {
    }
    
    

    public int getnExpediente() {
        return nExpediente;
    }

    public void setnExpediente(int nExpediente) {
        this.nExpediente = nExpediente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

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
        final Alumno other = (Alumno) obj;
        if (this.nExpediente != other.nExpediente) {
            return false;
        }
        if (this.edad != other.edad) {
            return false;
        }
        if (this.nota != other.nota) {
            return false;
        }
        if (this.telefono != other.telefono) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object o) {
        int aux=0;
        Alumno alumno = (Alumno)o;
        
        aux = this.getnExpediente()-this.getnExpediente();
        return aux ;
    }
    
    
}
