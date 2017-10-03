/*
9.	Realizar un juego para adivinar un numero. Para ello pedir un numero N y 
luego ir pidiendo numeros indicando mayor de  o menor de segun sea el caso con respecto 
a N. El proceso termina cuando el usuario acierta.
 */
package Ejercicios_Tema3_Bucles;

import java.util.Scanner;

public class JuegoAdivinaNumero {
    // main

    public static void main(String[] args) {
        // Declaracion de variables
        int N = (int) (Math.random() * 100 + 1);
        ; // numero correcto
        int numero = 0;
        int numeroIntentos = 0;
        // imprimir
        System.out.println("Adivina un numero del 0 al 100: ");

        // do while para pedir numero ,repetir si no aciertas y contar intentos
        do {
            // pedimos datos
            Scanner sc = new Scanner(System.in);
            System.out.println("Pon un numero : ");
            numero = sc.nextInt();
            // mientras el numero no sea 87
            if (numero != N) {
                // si el numero es menor o mayor o fuera del rango que N
                // imprimira los mensajes de error
                if (numero > N) {
                    System.out.println("El numero es Mayor al correcto");
                } else if (numero < N) {
                    System.out.println("El numero es Menor al correcto");
                }// fin del if anidado
            }// fin del if
            // contador numero intentos
            numeroIntentos++;
        } while (numero != N && numeroIntentos < 10);// fin del do while

        // si el numero es el correcto
        if (numero == N) {
            System.out.println("ACERTASTE");
            System.out
                    .println("Has necesitado " + numeroIntentos + " intentos");
            // si agotas las vidas
        }
        if (numeroIntentos == 10) {
            System.out.println("TE HAS QUEDADO SIN INTENTOS");
            System.out.println("EL NÚMERO ERA " + N);

        }
        // imprimir

    }// fin main
}// fin clase
