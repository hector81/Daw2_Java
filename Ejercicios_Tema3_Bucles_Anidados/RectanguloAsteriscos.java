package Ejercicios_Tema3_Bucles_Anidados;

/*
6- Realizar un programa que pida un dos n�meros (enteros positivos y mayores de 0) y 
calcule y muestre por pantalla un rect�ngulo de tama�o NxM.
 */
import java.util.Scanner;

public class RectanguloAsteriscos {
    // main

    public static void main(String[] args) {
        // DECLARAMOS ATRIBUTO
        int N;
        int M;
        // PEDIMOS DATOS
        do {
            // PEDIREMOS DATOS Y SI UNO DE LOS DATOS NO ES VALIDO VOLVERA A
            // PEDIRLOS
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce un N (filas): ");
            N = sc.nextInt();
            System.out.print("Introduce un M (columnas): ");
            M = sc.nextInt();
            if (N < 1) {
                System.out.println("N es negativo o igual que cero. ");
            } else if (M < 1) {
                System.out.println("M es negativo o igual que cero. ");
            } // fin if
        } while (N < 1 || M < 1);

        // imprimir para rectangulo relleno
        System.out.println("rectangulo relleno");

        // for para filas
        for (int columnas = 0; columnas < N; columnas++) {
            // for anidado para columnas
            for (int filas = 0; filas < M; filas++) {
                System.out.print("*");// pinta las filas
            } // fin del for anidado
            System.out.println("");// con esto creamos las columnmas haciendo
            // que las filas
            // vayan para abajo
        } // fin del for

        // imprimir para rectangulo vacio
        System.out.println("rectangulo vacio");
        //for para para las filas
        for (int columnas = 0; columnas < N; columnas++) {
            //for anidado para las columnas
            for (int filas = 0; filas < M; filas++) {
                //CUANDO LA filas N SEA 1 O N MUESTRA  ASTERISOCS
                //CUANDO LA columnas N SEA 1 O N MUESTRA  ASTERISOCS
                if ((filas == M - 1) || ((filas == 0)) || (columnas == 0) || (columnas == (N - 1))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");//HACEMOS SALTO DE LINEA
                }
            }
            System.out.println("");
        }

    }// fin del main
}// fin de la clase
