/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioRepaso_Evaluacion1_AsaltoCastillo;

public class Asignatura { 
     
    private int identificador; 
    private double calificacion; 
     
    public int getIdentificador() { 
        return identificador; 
    } 
 
    public double getCalificacion() { 
        return calificacion; 
    } 
 
    public void setCalificacion(double calificacion) { 
        this.calificacion = calificacion; 
    } 
 
    public Asignatura(int identificador, double calificacion) { 
        super(); 
        this.identificador = identificador; 
        this.calificacion = calificacion; 
    } 
     
 
} 
 