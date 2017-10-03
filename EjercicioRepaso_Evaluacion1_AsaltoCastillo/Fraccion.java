/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioRepaso_Evaluacion1_AsaltoCastillo;

/**
 *
 * @author Alumno 10
 */

public class Fraccion {
    //Atributos
    private int numerador;
    private int denominador;
    
    //constructores
    //1ºconstructor.  Constructores por defecto. El alumno decide con que valor inicializarlos
    public Fraccion(){
        numerador = 4;
        denominador = 7;
    }
   //2ºconstructor. Constructor completamente parametrizado.
    public Fraccion(int num, int denomi){
        numerador = num;
        denominador = denomi;
    }
    
    //Getters and setters
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int num) {
        this.numerador = num;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denomi) {
        this.denominador = denomi;
    }
    
    public Fraccion sumarFraccion(Fraccion fraccion){
    //primero creamos fraccion
    Fraccion aux= new Fraccion();
    //declarar varaibles
    int n, d;
    
    n= this.numerador + fraccion.getDenominador();
    d= this.denominador + fraccion.getNumerador();
    
    aux.setDenominador(d);
    aux.setDenominador(d);
    
    return aux;
    
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
   
        Fraccion ff = (Fraccion) obj;
        if (this.numerador != ff.numerador) {
            System.out.println("no iguales");
            return false;
        }
        if (this.denominador != ff.denominador) {
            System.out.println("iguales");
            return false;
        }
        return true;
    }
    
    
    
    public double realizarSuma(Fraccion fraccion){
        double resultado;
        resultado = numerador/denominador;
        return resultado;
    }
    
    public static void main(String[] args) {
        Fraccion fraccion1  = new Fraccion(8,7);
        Fraccion fraccion2 = new Fraccion(8,7);
        Fraccion aux;
        
        aux =fraccion1.sumarFraccion(fraccion2);
        System.out.println(fraccion1.equals(fraccion2));
        System.out.println(fraccion2.realizarSuma(fraccion1));
        
        int x = 0;
        int y = x++;
        System.out.println("x " + x + " y " + y);
        
        int x1 = 1;
        int y1 = --x1;
        System.out.println("x " + x1 + " y " + y1);
        
    }

}