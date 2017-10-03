/*
9. Realizar un método que reciba un número N (entero positivo + 0) y retorne un 
String. El método rellenará inicialmente un String del 0 al 9. Posteriormente 
recorrerá dicho String insertando el número N de forma ordenada en el String y 
retornándolo.
EJEMPLO: GENERA 0123456789
PONG0 N EL 3
RESULTADO: 01233456789
 */
package Ejercicios_Tema6_String;

import java.util.Scanner;

/**
 *
 * @author Hector Garcia
 */
public class NumerosAleatorosNM {
    public static void main(String[] args) {
    //ATRIBUTOS
   int N;
   String cadena = "0123456789";

    // pedir datos
   
    do {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Pon N : ");
        N = sc.nextInt();
        System.out.println(cadena);
        if (N >= cadena.length() || N < 0) {
            System.out.println("Error. La posicion es mas alta"
                    + " que la longitud de la cadena o negativa. ");
        }
    } while (N >= cadena.length() || N < 0);

    System.out.println("resultado:" + MetodosString.insertarNumeroIgual(cadena, N));
    }//fin main
}//fin clase