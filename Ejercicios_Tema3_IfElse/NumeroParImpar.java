/*
3-Realizar un programa en java que pida un número e indique si este es par o impar
 */
package Ejercicios_Tema3_IfElse;

import java.util.Scanner;

public class NumeroParImpar {

    public static void main(String[] args) {
        // Declaracion de variables
        long numero;
        // do while para errores
        // Pedir datos
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Pon el numero: ");
            numero = sc.nextLong();
            if (numero < 0) {
                System.out.println("Error, el números es negativo");
            }// fin if
        } while (numero < 0);// fin do while

        // comparar si es par o impar con if
        // si el resto de dividir el numero entre 2 es igual a 0
        if (numero % 2 == 0) {
            System.out.printf("El número es par\n");
        } else {
            System.out.printf("El número es impar\n");
        }// fin if

    }// fin del main
}// fin de la clase
