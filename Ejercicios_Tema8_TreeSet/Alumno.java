/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema8_TreeSet;

/**
 *
 * @author PROF_VESPERTINO
 */
//La clase tiene la interface para crear el orden natural para mostrar los alumnos.
public class Alumno implements Comparable {
    //atributos
    private int nExpediente;
    private String nombre; 
    private String apellido;
    private int edad;
    private int nota;
    private long telefono;
    
    //Constructores
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
    
    
    //GETTERS AND SETTERS
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
    //FIN GETTERS AND SETTERS
    
    
    @Override
    public String toString() {
        return "Expediente numero " + nExpediente + " ,nombre " + nombre + " ,apellido " + apellido + " ,edad " +edad
                + " ,nota " + nota + " ,telefono " + telefono
                ;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    //comparara los expedientes para que no metamos repetidos
    @Override
    public boolean equals(Object obj) {
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
        return true;
    }

    @Override
    public int compareTo(Object o) { //"orden natural" de Alumno
        int aux;
        Alumno alumno = (Alumno)o;
        
        aux = alumno.getnExpediente() - alumno.getnExpediente();
        return aux;        
    }
    
    
    
    
    
}
