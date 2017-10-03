/*
10-Pedir 15 números y escribir la suma y la media de todos ellos, salvo aquellos que sean 0.
 */
package iescomercioejerciciostema3;

import java.util.Scanner;

public class EjercicioSumaMedios15Numeros {
    //main
    public static void main(String[] args) {
        // Declaracion de variables
       int numero, contador=0, suma=0;
       float media;
       int denominador = 15;//para hacer la media
        Scanner sc = new Scanner(System.in);
        
        //Pedir datos while y calcular dentro
        while(contador < 15){
            //ESTO LO REPITE 15 VECES
            System.out.println("Pon un número : ");           
            //A SU VEZ ESTO LO REPITE 15 VECES
            numero = sc.nextInt();
                if(numero > 0){
                 denominador = denominador-1;   
                }
               //Y ESTO LO SUMA 15 VECES
                //suma = suma + numero;
                suma += numero;
                
            //suma contador //ACUMULADOR
            contador++;
        }
        //CALCULAR MEDIA
        media = (float) suma / denominador;
        //IMPRIMIR
            System.out.println("La suma es: " + suma);
            System.out.println("La media es : " + media);
            System.out.println("El denominador es : " + denominador);
        
        
    }//fin main
}//fin clase
