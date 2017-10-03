/*
15-Haciendo uso de la clase Stringtokenizer realiza un método en Java que lea po
teclado una cadena de números enteros separados por comas y calcule y muestre
por pantalla el maximo y la media de dichos números  ej: "8,2,5,6,7"
 */
package Ejercicios_Tema6_String;

import java.util.Scanner;

/**
 *
 * @author Hector Garcia
 */
public class CalcularMaximoMediaStringNumeros {
    //main
    public static void main(String[] args) {
    String cadena;
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Pon un String : ");
    cadena = sc.nextLine();
 
    System.out.println(MetodosString.calculosMediaMax(cadena));
        
    }//fin main
}//fin clase
