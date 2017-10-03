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
public class Circulo extends Figura {

    //variables
    private double radio;
    private double pi;
    
    //constructor
    public Circulo(double radio, double pi) {
        this.radio = radio;
        this.pi = pi;
    }
    
    //metodos
    @Override
    public double calcularArea(){
       double area;
       area =(double) (pi*(radio*radio));
       System.out.println("El area del circulo es " + area);
        return area;
    }
    
    @Override
    public double calcularPerimetro(){
        double perimetro;
        perimetro= (2*pi*radio);
        System.out.println("El perimetro del triangulo es " + perimetro);
        return perimetro;
    }
}
