/*
9-Pedir un número entre 0 y 9999 mostrando por pantalla si es o no capicúa.
 */
package Ejercicios_Tema3_IfElse;

import java.util.Scanner;

public class NumeroCapicua {
    // main

    public static void main(String[] args) {
        // declarar variables
        int numero;
        int numeroMil;
        int numeroCien;
        int numeroDiez;
        int numeroUno;

        // do while para errores
        // Pedir datos
        do {
            // Pedir datos
            Scanner sc = new Scanner(System.in);
            System.out.print("Pon el número : ");
            numero = sc.nextInt();
            if (numero < 0 || numero > 9999) {
                System.out
                        .println("Error, El n�mero es negativo o m�s de 99999. ");
            }// fin if
        } while (numero < 0 || numero > 9999);// fin do while

        // realizar calculos// al ser int solo devolvera el entero no los
        // decimales
        numeroMil = numero / 1000;
        numeroCien = (numero - numeroMil * 1000) / 100;
        numeroDiez = (numero - numeroMil * 1000 - numeroCien * 100) / 10;
        numeroUno = numero - numeroMil * 1000 - numeroCien * 100 - numeroDiez
                * 10;

        // volver numero del reves y comparar //el numero vuelto tiene ambito
        // solo dentro de cada if
        if (numero > 999 && numero < 10000) {
            int numeroVuelto = numeroUno * 1000 + numeroDiez * 100 + numeroCien
                    * 10 + numeroMil * 1;
            System.out.println("El número vuelto es : " + numeroVuelto);
            // if anidado
            if (numero == numeroVuelto) {
                System.out.println("El número es capicua");
            } else {
                System.out.println("El número no es capicua");
            }// cierre if anidado
        } else if (numero > 99 && numero < 1000) {
            int numeroVuelto = numeroUno * 100 + numeroDiez * 10 + numeroCien
                    * 1;
            System.out.println("El número vuelto es : " + numeroVuelto);
            // if anidado
            if (numero == numeroVuelto) {
                System.out.println("El número es capicua");
            } else {
                System.out.println("El número no es capicua");
            }// cierre if anidado
        } else if (numero > 9 && numero < 100) {
            int numeroVuelto = numeroUno * 10 + numeroDiez * 1;
            System.out.println("El número vuelto es : " + numeroVuelto);
            // if anidado
            if (numero == numeroVuelto) {
                System.out.println("El número es capicua");
            } else {
                System.out.println("El número no es capicua");
            }// cierre if anidado
        } else if (numero >= 0 && numero < 10) {
            int numeroVuelto = numeroUno * 1;
            System.out.println("El número vuelto es : " + numeroVuelto);
            // if anidado
            if (numero == numeroVuelto) {
                System.out.println("El número es capicua");
            } else {
                System.out.println("El número no es capicua");
            }// cierre if anidado
        } else {
            System.out
                    .println("El número es superior a 9999 o es un número negativo");
        }// cierre if else

    }// fin del main
}// fin de la clase
