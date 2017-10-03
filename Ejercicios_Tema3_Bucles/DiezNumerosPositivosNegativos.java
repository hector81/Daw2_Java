/*
12.	Programa en Java que pide 10 números y calcula y muestra por pantalla la 
cantidad de números positivos, negativos y de ceros introducidos.
 */
package Ejercicios_Tema3_Bucles;

import java.util.Scanner;

public class DiezNumerosPositivosNegativos {
    //main
    public static void main(String[] args) {
        // Declaracion de variables
        int numero;
        int contador=0;
        int numeroPositivo = 0;
        int numeroNegativo = 0;
        int numeroCero = 0;
        
        Scanner sc = new Scanner(System.in);
       
        //while y pedir los datos dentro para que no te pida más de 10
        while(contador < 10){        
            //ESTO LO REPITE 10 VECES
            System.out.println("Pon un número : ");
            //A SU VEZ ESTO LO REPITE 10 VECES
            numero = sc.nextInt();          
            
            //usamos el if para contar las veces que son positivos, negativos o ceros 
            if(numero < 0){
                    numeroNegativo++;
                }else if (numero > 0) {
                    numeroPositivo++;
                } else {
                    numeroCero++;
                }
            
            //suma contador //ACUMULADOR// esto sumara el contador hasta el limite de 10
            contador++;
        }
       
        //IMPRIMIR
        System.out.println("La cantidad de números positivos es: " + numeroPositivo);
        System.out.println("La cantidad de números negativos es: " + numeroNegativo);
        System.out.println("La cantidad de ceros es: " + numeroCero);
     
    }//fin main
}//fin clase


