/*
14-Dado un texto leido por pantalla, desde la clase MAIN realiza un metodo que retorne un entero
indicando el numero de palabras,vocales, consonantes, simbolos que contiene
 */
package Ejercicios_Tema6_String;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Hector Garcia
 */
public class TextNumero {
    public static void main(String[] args) {
    //ATRIBUTOS
    String cadena;

    // pedir datos
    Scanner sc = new Scanner(System.in);
    System.out.print("Pon un texto : ");
    cadena = sc.nextLine();

    
    System.out.println("Numero palabras del texto: " + MetodosString.calcularPalabras(cadena));
    System.out.println("Numero vocales del texto: " + MetodosString.calcularVocales(cadena));
    System.out.println("Numero consonantes del texto: " + MetodosString.calcularConsonantes(cadena));
    System.out.println("Numero simbolos del texto: " + MetodosString.calcularSimbolos(cadena));
    System.out.println("Numero numeros del texto: " + MetodosString.calcularNumeros(cadena));
    }//fin main
}//fin clase