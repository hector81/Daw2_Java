/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema9_TryCatch;

/**
 *
 * @author Hector Garcia
 */
public class Metodo {
    //metodo
    public void sumarImpares(int numero1) throws PruebaException{
        int numero2 = 7;
        int suma = 0;
        if (numero1 % 2 == 0) {
            throw new PruebaException(numero1);
           
        } else {
            suma = numero1 + numero2;
        }
        }//fin metodo

}
