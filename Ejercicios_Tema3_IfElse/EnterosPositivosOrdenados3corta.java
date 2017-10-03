/*
Realizar un programa en java que pida dos números enteros positivos y los muestre por pantalla ordenados
probar por ejemplo con cuatro numeros y hacer un if con los dos numeros negativos en un solo if
 */
package Ejercicios_Tema3_IfElse;

import java.util.Scanner;

public class EnterosPositivosOrdenados3corta {

    public static void main(String[] args) {
        // Declaracion de variables
        //los numeros que pediremos
        int numero1;
        int numero2;
        int numero3;
        Scanner sc = new Scanner(System.in);
        //declaramos posiciones
        int posicion1 = 0;
        int posicion2 = 0;
        int posicion3 = 0;
        //Pedir datos
        System.out.print("Pon el primer número entero positivo: ");
        numero1 = sc.nextInt();
        System.out.print("Pon el segundo número entero positivo: ");
        numero2 = sc.nextInt();
        System.out.print("Pon el tercer número entero positivo: ");
        numero3 = sc.nextInt();

        //ordenar números con el if
        if (numero1 < numero2 && numero1 < numero3 && numero2 < numero3 && (numero1 > 0 || numero2 > 0 || numero3 > 0)) {
            posicion1 = numero1;
            posicion2 = numero2;
            posicion3 = numero3;
            System.out.println("Orden: " + posicion1 + " " + posicion2 + " " + posicion3);
        } else if (numero1 < numero2 && numero1 < numero3 && numero3 < numero2 && (numero1 > 0 || numero2 > 0 || numero3 > 0)) {
            posicion1 = numero1;
            posicion2 = numero3;
            posicion3 = numero2;
            System.out.println("Orden: " + posicion1 + " " + posicion2 + " " + posicion3);
        } else if (numero2 < numero1 && numero2 < numero3 && numero1 < numero3 && (numero1 > 0 || numero2 > 0 || numero3 > 0)) {
            posicion1 = numero2;
            posicion2 = numero1;
            posicion3 = numero3;
            System.out.println("Orden: " + posicion1 + " " + posicion2 + " " + posicion3);
        } else if (numero2 < numero1 && numero2 < numero3 && numero3 < numero1 && (numero1 > 0 || numero2 > 0 || numero3 > 0)) {
            posicion1 = numero2;
            posicion2 = numero3;
            posicion3 = numero1;
            System.out.println("Orden: " + posicion1 + " " + posicion2 + " " + posicion3);
        } else if (numero3 < numero1 && numero3 < numero2 && numero1 < numero2 && (numero1 > 0 || numero2 > 0 || numero3 > 0)) {
            posicion1 = numero3;
            posicion2 = numero1;
            posicion3 = numero2;
            System.out.println("Orden: " + posicion1 + " " + posicion2 + " " + posicion3);
        } else if (numero3 < numero1 && numero3 < numero2 && numero2 < numero1 && (numero1 > 0 || numero2 > 0 || numero3 > 0)) {
            posicion1 = numero3;
            posicion2 = numero2;
            posicion3 = numero1;
            System.out.println("Orden: " + posicion1 + " " + posicion2 + " " + posicion3);
        } else {
            System.out.println("Error, uno de los números es negativo");
        }

    }//fin del main
}//fin de la classe
