/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema8_Collections;



/**
 *
 * @author Hector Garcia
 */
import java.util.Objects;
public class Alumno {
    //atributos
    private String nombre;
    private String apellido;
    private String curso;
    
    //constructor

    public Alumno(String nombre, String apellido, String curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
    }
    
    
    //getters and setters
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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    @Override    
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    //sobreescribimos el equals
    @Override    
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.curso, other.curso)) {
            return false;
        }
        return true;
    }

    //STRING TOsTRING
    @Override
    public String toString() {
        return "Alumno nombre= " + nombre + ", apellido= " + apellido + ", curso= " + curso;
    }
  
    
}
