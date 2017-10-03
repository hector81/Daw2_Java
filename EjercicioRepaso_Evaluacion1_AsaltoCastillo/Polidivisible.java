/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioRepaso_Evaluacion1_AsaltoCastillo;

import java.util.Scanner;

/**
 *
 * @author Alumno 10
 */
public class Polidivisible {

    public static void main(String[] args) {

    
    //atributos
    int numero = 0 ;
    int contador;
    int contador2;
    int limite =4;
    int division=0;
    Scanner sc = new Scanner(System.in);

    
        do {
            
            for (contador = 0; contador < limite; contador++) {
            //pedir datos  
            
            numero = sc.nextInt();
            //limitamos numero hermanos a 8
            if (numero < 0) {
                System.out.println("Numero no valido");
            }//fin if
        }//fin for
    }
    while (numero< 0 && limite < 5 );
        
        System.out.println("///////");
       for (contador2 = 1; contador2 < 10; contador2++) {
           division = numero%contador2;
           numero = numero/contador;
            if(division ==0){
                System.out.println("POLIDIVISIBLE");
            }else{System.out.println("no POLIDIVISIBLE");}
       }
       
       
}
}
