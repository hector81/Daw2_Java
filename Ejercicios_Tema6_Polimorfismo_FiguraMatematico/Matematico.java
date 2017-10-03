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
public class Matematico {
   
    //metodos polimorfico funciona para cualquier figura que se le pase
    public double averiguarArea(Figura parametro){
        return parametro.calcularArea();
    }
    //metodos polimorfico
    public double averiguarPerimetro(Figura parametro){
        return parametro.calcularPerimetro();
    }
}
