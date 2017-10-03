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
public class TestAnimales {
    //main
   public static void main(String[] args) {
       //Creamos objeto lobo instanciandolo
      
       Canino nu = new Canino();
       nu.comer(null);
       nu.rugir(null);
       nu.hacerRuido("GRRRR", "GLGLGLGL");
   }//fin main   
}//fin clase
