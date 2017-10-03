/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema5_Herencia_Animal;

/**
 *
 * @author VESPERTINO
 */
public class Lobo extends Canino {
    
    //metodos
    @Override
    public void hacerRuido(){
    	System.out.println("El canino hace ruido");
    }
    
    @Override
    public void comer(){
    	System.out.println("El lobo come");
    }
}
