/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema8_HashMap_Traduccion;

/**
 *
 * @author Hector Garcia
 */
public class Marcador {
    //atributos
    private int puntos;
    //constructor
    public Marcador() {
        this.puntos = 0;
    }
    //metodo para sumar aciertos
    public void numeroAciertos(int numero){
        if (numero ==2) {
            puntos= puntos +100;//aumentamos 100 con el acumulador
        }else if (numero==1){
        puntos= puntos +50;//aumentamos 50 con el acumulador
        }
    }

    @Override
    public String toString() {
        return "Marcador : " + puntos;
    }
    
}//fin clase
