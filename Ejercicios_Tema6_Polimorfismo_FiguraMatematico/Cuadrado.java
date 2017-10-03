/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema6_Polimorfismo_FiguraMatematico;

/**
 *
 * @author VESPERTINO
 */
public class Cuadrado extends Figura {
    //variables
    private double lado;

    //constructor
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    //getters and setters
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
    //metodos
    @Override
    public double calcularArea(){
        double area;
        area = lado*lado;
        System.out.println("El area del cuadrado es " + area);
        return area;
    }
    
    @Override
    public double calcularPerimetro(){
        double perimetro;
        perimetro = 4*lado;
        System.out.println("El perimetro del cuadrado es " + perimetro);
        return perimetro;
    }
    
}
