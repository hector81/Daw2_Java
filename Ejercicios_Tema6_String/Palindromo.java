/*
2-Realiza un método dentro de la clase StringII que reciba un string leido por teclado(desde la clasee
prueba) y retorne un booleanao indicnado si es o no palindromo
 */
package Ejercicios_Tema6_String;

import java.util.Scanner;

/**
 *
 * @author Hector Garcia
 */
public class Palindromo {
public static void main(String[] args) {    
//ATRIBUTOS
    String cadena ;
    
    //metodo pedir datos
    Scanner sc = new Scanner(System.in);
    System.out.print("Pon palabra  : ");
    cadena = sc.nextLine();

    System.out.println("Palabra vuelta del reves ");
    MetodosString.volverReves(cadena);
    System.out.println("¿Es palindromo? : " + MetodosString.esPalindromo(cadena));
    System.out.println("STRINGBUFFER. ¿Es palindromo? : " + MetodosString.averiguarPalindromo(cadena));

    }//fin main
}//fin clase

