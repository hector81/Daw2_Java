/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioRepaso_Evaluacion1_AsaltoCastillo;

public class Alumno { 
     
    private Asignatura Asignatura1; 
    private Asignatura Asignatura2; 
    private Asignatura Asignatura3; 
     
    public Alumno(Asignatura asignatura1, Asignatura asignatura2, 
            Asignatura asignatura3) { 
        super(); 
        Asignatura1 = asignatura1; 
        Asignatura2 = asignatura2; 
        Asignatura3 = asignatura3; 
    } 
     
    public Alumno(int asignatura1, int asignatura2, 
            int asignatura3) { 
        super(); 
        Asignatura1 = new Asignatura(asignatura1, 0); 
        Asignatura2 = new Asignatura (asignatura2, 0); 
        Asignatura3 = new Asignatura (asignatura3, 0); 
    } 
 
    public Asignatura getAsignatura1() { 
        return Asignatura1; 
    } 
 
    public Asignatura getAsignatura2() { 
        return Asignatura2; 
    } 
 
    public Asignatura getAsignatura3() { 
        return Asignatura3; 
    } 
     
     
 
}
