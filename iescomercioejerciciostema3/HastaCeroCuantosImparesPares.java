/*
6.	Realizar un programa que pide números al usuarios hasta que introduzca
un 0 y calcula y muestra por pantalla cuantos pares y cuantos impares ha leído.
 */
package iescomercioejerciciostema3;

import java.util.Scanner;

public class HastaCeroCuantosImparesPares {
     //main
    public static void main(String[] args) {
    //declarar variables
        int numero = 0;
        int contadorPares = 0 ;
        int contadorImpares = 0 ;
        Scanner sc = new Scanner(System.in);
        
        while(numero > 0) {
        //pedir variables
        System.out.println("Pon un número : ");           
        numero = sc.nextInt();
            if(numero%2 == 0)contadorPares++;
            if(numero%2 != 0)contadorImpares++;    
         
        } 
                
        //imprimir
          System.out.println("El número de pares es : " + contadorPares);       
          System.out.println("El número de impares es : " + contadorImpares);   
    }//fin del main
}//fin de la clase
