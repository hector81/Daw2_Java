/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioRepaso_Evaluacion1_AsaltoCastillo;

public class Practica5b { 
 
    public static void main(String[] args) { 
        // TODO Auto-generated method stub 
 
        Asignatura asignatura1 = new Asignatura(1,0); 
        Asignatura asignatura2 = new Asignatura(2,0); 
        Asignatura asignatura3 = new Asignatura(3,0); 
         
        Alumno alumno = new Alumno(asignatura1, asignatura2, asignatura3); 
         
        Profesor profesor = new Profesor(); 
         
        profesor.ponerNota(alumno); 
         
        System.out.println(profesor.calcularMedia(alumno)); 
    } 
 
} 