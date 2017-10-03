/*
7-Realizar un programa en java que pida 3 números enteros positivos y los muestre 
por pantalla ordenados
 */
package Ejercicios_Tema3_IfElse;

import java.util.Scanner;

public class EnterosPositivosOrdenados3larga {

    public static void main(String[] args) {
        // Declaracion de variables
        int numero1;
        int numero2;
        int numero3;

        // do while para errores
        // Pedir datos
        do {
            // Pedir datos
            Scanner sc = new Scanner(System.in);
            System.out.print("Pon el primer número entero positivo: ");
            numero1 = sc.nextInt();
            System.out.print("Pon el segundo número entero positivo: ");
            numero2 = sc.nextInt();
            System.out.print("Pon el tercer número entero positivo: ");
            numero3 = sc.nextInt();
            if (numero1 < 0 || numero2 < 0 || numero3 < 0) {
                System.out.println("Error, uno de los números es negativo");
            }// fin if
        } while (numero1 < 0 || numero2 < 0 || numero3 < 0);// fin do while

        // ordenar números con el if
        if (numero1 < numero2 && numero1 < numero3 && numero3 < numero2) {
            System.out.println("El orden es " + numero1 + " " + numero3 + " "
                    + numero2);
        } else if (numero2 < numero1 && numero2 < numero3 && numero1 < numero3) {
            System.out.println("El orden es " + numero2 + " " + numero1 + " "
                    + numero3);
        } else if (numero2 < numero1 && numero2 < numero3 && numero3 < numero1) {
            System.out.println("El orden es " + numero2 + " " + numero3 + " "
                    + numero1);
        } else if (numero3 < numero1 && numero3 < numero2 && numero1 < numero2) {
            System.out.println("El orden es " + numero3 + " " + numero1 + " "
                    + numero2);
        } else if (numero3 < numero1 && numero3 < numero2 && numero2 < numero1) {
            System.out.println("El orden es " + numero3 + " " + numero2 + " "
                    + numero1);
        } else if (numero1 < numero2 && numero1 < numero3 && numero2 < numero3) {
            System.out.println("El orden es " + numero1 + " " + numero2 + " "
                    + numero3);
        } else {
            System.out.println("Error, la operación no se puede realizar");
        }

    }// fin del main
}// fin de la clase
