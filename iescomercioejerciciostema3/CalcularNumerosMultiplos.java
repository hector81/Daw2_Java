/*
Realizar un programa en Java que pida dos números y calcule y
muestre por pantalla si el primero es múltiplo del segundo
 */
package iescomercioejerciciostema3;

import java.util.Scanner;

public class CalcularNumerosMultiplos {
  //main
    public static void main(String[] args) {  
    // Declaracion de variables
		int numero1;
                int numero2;
		Scanner sc = new Scanner(System.in);
	//Pedir datos
		System.out.print("Pon el número 1: ");
		numero1 = sc.nextInt();	
                System.out.print("Pon el número 2: ");
		numero2 = sc.nextInt();
        //ordenar números con el if
                if(numero1%numero2 == 0  ){
                    System.out.println("El primer número es multiplo del segundo");
                }else {
                    System.out.println("El primer número no es multiplo del segundo");
                }
    }//fin del main
}//fin de la clase
