/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen1Repaso_Factura;

/**
 *
 * @author Hector Garcia
 */
public class Cliente {
    //atributos
    private String nombre;
    private String direccion;
    private int numeroIdentificacion;
    
    //constructor completo
    public Cliente(String nombre, String direccion, int numeroIdentificacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroIdentificacion = numeroIdentificacion;
    }
    //getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    //metodo toString

    @Override
    public String toString() {
        return "El nombre del cliente es " + nombre + " ,su direccion es "
                + direccion + " y su numero de identificacion es " + numeroIdentificacion;
    }
    
}//fin clase
