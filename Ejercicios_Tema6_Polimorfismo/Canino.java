/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema6_Polimorfismo;

/**
 *
 * @author VESPERTINO
 */
public class Canino extends Animales {
    
    //metodos
    //@Override //final no deja sobreescribir
    //habría que sobreescribirlo
    public void rugir(String ruido){
    	System.out.println("El canino hace breebee");
    }
    
    //final  deja sobrecargar
    public void hacerRuido(String ruido, String chilla){
        ruido = "eeeeeeeeeeeeee";
    	System.out.println(ruido);
    }
    
    public void numeroOjos(){
    	System.out.println(numeroOjos);
    }
}
