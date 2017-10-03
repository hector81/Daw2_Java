/*
4-Realizar un programa en java que pida dos números y calcule y muestre por pantalla
si son iguales o en caso de no serlo cual es el mayor
 */
package Ejercicios_Tema3_IfElse;

import java.util.Scanner;

public class NumerosIgualesMayores {

    public static void main(String[] args) {
        // Declaracion de variables
        long numero1;
        long numero2;
        Scanner sc = new Scanner(System.in);
        // Pedir datos
        System.out.print("Pon el primer número : ");
        numero1 = sc.nextLong();
        System.out.print("Pon el segundo número : ");
        numero2 = sc.nextLong();

        // calcular con if si es mayor o igual los números
        // si el numero1 es mayor que el numero2
        if (numero1 > numero2) {
            System.out.println("El mayor es: " + numero1);
            // si el numero2 es mayor que el numero1
        } else if (numero2 > numero1) {
            System.out.println("El mayor es: " + numero2);
        } else {
            System.out.println("Los dos números son iguales");
        }

    }// fin del main
}// fin de la clase
