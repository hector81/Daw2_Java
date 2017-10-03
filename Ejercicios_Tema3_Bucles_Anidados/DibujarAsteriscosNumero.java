package Ejercicios_Tema3_Bucles_Anidados;

import java.util.Scanner;

/*
 4. Realizar un programa en java que pida un numero entero positivo N mayor de 0 y calcula y 
 muestra por pantalla un cuadrado de tama�o NxN con asteriscos.
 */
public class DibujarAsteriscosNumero {
    // main

    public static void main(String[] args) {
        // DECLARAMOS ATRIBUTO
        int numero;
        do {
            // PEDIMOS DATOS
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce un n�mero entero: ");
            numero = sc.nextInt();
            if (numero < 1) {
                System.out.print("N�mero negativo o igual que cero. ");

            }
        } while (numero < 1);

        // imprimir para cuaddrado relleno
        System.out.println("cuadrado relleno");

        // for para filas
        for (int filas = 0; filas < numero; filas++) {
            // for anidado para columnas
            for (int columnas = 0; columnas < numero; columnas++) {
                System.out.print("*");// pinta las filas
            } // fin del for anidado
            System.out.println("");// con esto creamos las columnmas haciendo
            // que las filas
            // vayan para abajo
        } // fin del for

        // imprimir para cuadrado vacio
        System.out.println("cuadrado vacio");

        // for para filas
        for (int filas = 1; filas <= numero; filas++) {
            // for anidado para columnas
            for (int columnas = 1; columnas <= numero; columnas++) {
                // si las filas o columnas es igual a 1 o igual al ultimo n�mero
                // imprime asterisco
                if (columnas == 1 || columnas == numero || filas == 1 || filas == numero) {
                    System.out.print("*");// pinta las filas y columnas con asteriscos, pero solo la primera
                    //y la ultima posicion
                } else {
                    System.out.print(" ");// con esto creamos las columnmas
                    // haciendo que las filas vayan para
                    // abajo pero sin imprimir nada
                } // fin if else

            } // fin del for anidado
            System.out.println(); // da espacios segun la cantidad ingresada
            // vayan para abajo
        } // fin del for

    }// fin del main
}// fin de la clase

