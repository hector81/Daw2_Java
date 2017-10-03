/*
6-Realizar un programa en Java que pida dos números y calcule y
muestre por pantalla si el primero es múltiplo del segundo
 */
package Ejercicios_Tema3_IfElse;

import java.util.Scanner;

public class CalcularNumerosMultiplos {
    // main

    public static void main(String[] args) {
        // Declaracion de variables
        int numero1;
        int numero2;

        // Pedir datos
        // hacemos do while para numeros negativos o cero
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Pon el número 1: ");
            numero1 = sc.nextInt();
            System.out.println("Pon el número 2: ");
            numero2 = sc.nextInt();
            if (numero2 < 1 || numero1 < 1) {
                System.out.println("Error, los 2 numeros positivo mayor que 0. ");
            }// fin if	
        } while (numero2 < 1 || numero1 < 1);// fin do while
        // ordenar números con el if
        if (numero1 % numero2 == 0) {
            System.out.println("El primer número es multiplo del segundo");
        } else {
            System.out.println("El primer número no es multiplo del segundo");
        }
    }// fin del main
}// fin de la clase
