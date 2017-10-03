/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema6_Polimorfismo_FiguraMatematico;

/**
 *
 * @author Hector Garcia
 */
public class Triangulo extends Figura {
    //variables
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    //constructor
    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    //getters and setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    
    //metodos
    @Override
    public double calcularArea(){
       double area;
       area =(base*altura)/2;
       System.out.println("El area del triangulo es " + area);
        return area;
    }
    
    @Override
    public double calcularPerimetro(){
        double perimetro;
        perimetro = lado1 + lado2 + lado3;
        System.out.println("El perimetro del triangulo es " + perimetro);
        return perimetro;
    }
    
}