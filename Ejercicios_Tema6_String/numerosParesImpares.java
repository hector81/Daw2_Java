/*
11. Realizar un método que recibe un String con números pares e impares de una cifra
y retorna dos Strings con los números pares por un lado y los impares por otro.
 */
package Ejercicios_Tema6_String;

import java.util.Scanner;

/**
 *
 * @author Hector Garcia
 */
public class numerosParesImpares {

    //MAIN
    public static void main(String[] args) {
        //ATRIBUTOS
        String cadena;
        // pedir datos
        //pedir datos
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon cadena : ");
        cadena = sc.nextLine();

        //llamar
        System.out.println(MetodosString.detectarParesImparesString(cadena));
    }//fin main
}//Fin clase
