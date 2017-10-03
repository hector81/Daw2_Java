/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema6_Polimorfismo.Ejercicios_Tema5_Herencia_Empleado_Examen;

/**
 *
 * @author Hector Garcia
 */
public class Empleado {
    //atributos
    private String nif;
    private String nombre;
    private int edad;
    
    //constructor
    public Empleado(String nif, String nombre, int edad) {
        this.nif = nif;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //getters and setters
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //metodo para calcular horas mes trabajadas
    public int horasMesTrabajo(int mes){
        if(mes==1){return 110;}
        else if(mes==2){return 120;}
        else if(mes==3){return 130;}
        else if(mes==4){return 140;}
        else if(mes==5){return 160;}
        else if(mes==6){return 170;}
        else if(mes==7){return 180;}
        else if(mes==8){return 190;}
        else if(mes==9){return 170;}
        else if(mes==10){return 170;}
        else if(mes==11){return 170;}
        else if(mes==12){return 170;}
        return 0;
    }
    
    /*metodo to string sobreescrito de la clase Object 
    Sobreescribe el método de Object retornando las propiedades del empleado.*/
    @Override
    public String toString() {
        return "El nombre del empleado es " + this.nombre + " y su nif es " + this.nif + 
                " y su edad es " + this.edad + " y su salario mínomo es " + calculaSueldo();
    }
    
    //calculaSueldo(): Retorna el Salario Mínimo Interprofesional (580€)
    public double calculaSueldo() {
        double smi =580.00;
        return smi;
    }  
}//fin metodo
