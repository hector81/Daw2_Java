/*
10. Realizar un método que recibe un número N (entero + 0) y devuelve un String. El
método creará inicialmente un String con números entre 1 y 100 y posteriormente
eliminará el número N del String retornándolo.
 */
package Ejercicios_Tema6_String;

import java.util.Scanner;

/**
 *
 * @author Hector Garcia
 */
public class QuitarNSring {

    public static void main(String[] args) {
        //atributo
        int N;

        //pedir datos
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Pon N : ");
            N = sc.nextInt();
        } while (Utilidades.comprobarRango(N, 1, 100) == false);

        System.out.println(MetodosString.quitarN(N));

    }//fin main
}//fin clase
