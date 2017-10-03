/*
8-Realizar un método que reciba dos número N y M (entero positivo + 0). Rellene un
String con 10 números aleatorios de una cifra y añada en el String de aleatorios N 
asteriscos a partir de la posición M del String, retornando el resultado.
Ejemplo
String: 8956234567
N: 3   (asteriscos)
M: 4   (n º posicines)
Resultado: 8956***234567
 */
package Ejercicios_Tema6_String;

import java.util.Scanner;

/**
 *
 * @author Hector Garcia
 */
public class NumerosAleatorios {
//main
    public static void main(String[] args) {
    //ATRIBUTOS
    String cadena;
    int N;
    int M;

    // pedir datos
    Scanner sc = new Scanner(System.in);
    System.out.print("Pon primer String : ");
    cadena = sc.nextLine();
    System.out.print("Pon N . Números asteriscos : ");
    N = sc.nextInt();
    do {
        System.out.print("Pon M . Posición: ");
        M = sc.nextInt();
        if (M >= cadena.length()+1) {
            System.out.println("Error. La posicion es mas alta que la longitud de la cadena. ");
        }
    } while (M >= cadena.length()+1);

    System.out.println("Resultado: " + MetodosString.ponerAsteriscosString(cadena,N,M));

    }//fin main

}//fin clase
