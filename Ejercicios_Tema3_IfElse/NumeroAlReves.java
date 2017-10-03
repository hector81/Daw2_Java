/*
11.	Realizar un programa que pida un número entero entre 0 y 99.999 y 
muestra dicho cifras en sentido contrario
 */
package Ejercicios_Tema3_IfElse;

import java.util.Scanner;

public class NumeroAlReves {
    // main

    public static void main(String[] args) {
        // Declaracion de variables
        int numero;
        int numeroDiezMil;
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
            if (numero < 0 || numero > 99999) {
                System.out.println("Error, El n�mero es negativo o m�s de 99999. ");
            }// fin if
        } while (numero < 0 || numero > 99999);// fin do while

        // realizar calculos para separar numeros y al ser int solo devolvera el
        // entero no los decimales
        numeroDiezMil = numero / 10000;
        numeroMil = (numero - numeroDiezMil * 10000) / 1000;
        numeroCien = (numero - numeroDiezMil * 10000 - numeroMil * 1000) / 100;
        numeroDiez = (numero - numeroDiezMil * 10000 - numeroMil * 1000 - numeroCien * 100) / 10;
        numeroUno = numero - numeroDiezMil * 10000 - numeroMil * 1000
                - numeroCien * 100 - numeroDiez * 10;
        // ordenar números con el if
        if (numero > 9999 && numero < 99999) {
            System.out.println("El número vuelto es " + numeroUno + numeroDiez
                    + numeroCien + numeroMil + numeroDiezMil);
        } else if (numero > 999 && numero < 9999) {
            System.out.println("El número vuelto es " + numeroUno + numeroDiez
                    + numeroCien + numeroMil);
        } else if (numero > 99 && numero < 999) {
            System.out.println("El número vuelto es " + numeroUno + numeroDiez
                    + numeroCien);
        } else if (numero > 9 && numero < 99) {
            System.out
                    .println("El número vuelto es " + numeroUno + numeroDiez);
        } else if (numero > -1 && numero < 10) {
            System.out.println("El número vuelto es " + numeroUno);
        }
    }// fin del main
}// fin de la clase

