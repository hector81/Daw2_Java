/*
6.	Realizar un programa que pide números al usuarios hasta que introduzca
un 0 y calcula y muestra por pantalla cuantos pares y cuantos impares ha leído.
 */
package Ejercicios_Tema3_Bucles;

import java.util.Scanner;

public class HastaCeroCuantosImparesPares {
    // main

    public static void main(String[] args) {
        // declarar variables
        int numero = 0;
        int contadorPares = 0;
        int contadorImpares = 0;
        Scanner sc = new Scanner(System.in);

        do {
            // pedir variables
            System.out.println("Pon un número : ");
            numero = sc.nextInt();
            // contamos numeros pares
            if (numero % 2 == 0 && numero != 0) {
                contadorPares++;
            }
            // contamos numeros impares
            if (numero % 2 != 0) {
                contadorImpares++;
            }
        } while (numero > 0);

        // con while
        /*
		 * while(numero != 0){ //pedir variables int aux= numero%2; if(aux == 0
		 * ){contadorPares++;} else if(aux != 0){contadorImpares++;}
		 * System.out.println("Pon un número : "); numero = sc.nextInt(); }
         */
        // imprimir
        System.out.println("El número de pares es : " + contadorPares);
        System.out.println("El número de impares es : " + contadorImpares);
    }// fin del main
}// fin de la clase
