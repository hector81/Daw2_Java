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
public class Test {
    public static void main(String[] args) {
        //instancias objeto de tipo Figura
        Figura f= new Figura();
        //instancias objeto de tipo Circulo
        Circulo circulo= new Circulo(2,3.14);
        //instancias objeto de tipo Triangulo
        Triangulo triangulo= new Triangulo(2,4,5,6,7);
        //instancias objeto de tipo Cuadrado
        Cuadrado cuadrado = new Cuadrado(4);
        //instancias objeto de tipo matematico
        Matematico m = new Matematico();
        
        System.out.println();
        //llamar metodos
        System.out.println("Area circulo " + m.averiguarArea(circulo));
        System.out.println("Perimetro circulo " + m.averiguarPerimetro(circulo));
        System.out.println("Area triangulo " + m.averiguarArea(triangulo));
        System.out.println("Perimetro triangulo " + m.averiguarPerimetro(triangulo));
        System.out.println("Area cuadrado " + m.averiguarArea(cuadrado));
        System.out.println("Perimetro cuadrado " + m.averiguarPerimetro(cuadrado));
    }
    
 
}
