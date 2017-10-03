/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioRepaso_Evaluacion1_AsaltoCastillo;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class NumerosnEGATIVOS {
    public static void main(String[] args) {
        //atriutos
        int numero=0;
        int numerosnegativos=0;
        int contador;
        System.out.println("numero ");
        
        for(contador =1; contador <11;contador++){
            Scanner dr = new Scanner(System.in);
            numero=dr.nextInt();
            System.out.println("numero " + contador + " = " + numero);
            if(numero < 0){
                numerosnegativos++;
            }
            }
        
        System.out.println("+++++++++++++"+numerosnegativos);
    }
}
