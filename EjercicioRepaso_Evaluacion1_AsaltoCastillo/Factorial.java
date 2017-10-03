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
public class Factorial {
    public static void main(String[] args) {
        //atributo
        int numero;
        int resultado=1;
        //pedir numeros
        do{
            System.out.println("numero ");
            Scanner num=new Scanner(System.in);
            numero = num.nextInt();
            if(numero<0){System.out.println("numero negativo ");}
            
        }while(numero<0);
        
        if(numero>0);{
                for(int contador = numero; contador>0; contador--){
                    resultado *= contador;

                }
        }
        System.out.println(resultado);
    }
}
