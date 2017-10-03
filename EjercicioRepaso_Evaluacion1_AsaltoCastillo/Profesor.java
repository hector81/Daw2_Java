/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioRepaso_Evaluacion1_AsaltoCastillo;

public class Profesor { 
     
 public void ponerNota (Alumno alumno) 
 { 
     
     
    alumno.getAsignatura1().setCalificacion(Math.random()); 
    alumno.getAsignatura2().setCalificacion(Math.random()); 
    alumno.getAsignatura3().setCalificacion(Math.random()); 
     
     
 } 
  
 public double calcularMedia (Alumno alumno) 
 { 
     double media; 
     media= (alumno.getAsignatura1().getCalificacion() + 
             alumno.getAsignatura2().getCalificacion() + 
             alumno.getAsignatura3().getCalificacion() )/3; 
     return media; 
 } 
} 
 