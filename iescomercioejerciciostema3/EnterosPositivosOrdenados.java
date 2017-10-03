/*
Realizar un programa en java que pida dos números enteros positivos y los muestre por pantalla ordenados
 */
package iescomercioejerciciostema3;

import java.util.Scanner;

public class EnterosPositivosOrdenados {
    public static void main(String[] args) {    
        // Declaracion de variables
		int numero1;
                int numero2;
		Scanner sc = new Scanner(System.in);
	//Pedir datos
		System.out.print("Pon el primer número entero positivo: ");
		numero1 = sc.nextInt();	
                System.out.print("Pon el segundo número entero positivo: ");
		numero2 = sc.nextInt();	
         
        //ordenar números con el if
                //si el numero1 es mayor que numero2 y los 2 son mayores o iguales que 0
                if(numero1 < numero2 && numero1>=0 && numero2>=0){
                    System.out.println("El orden es " + numero1 + " " + numero2);
                //si el numero2 es mayor que numero1 y los 2 son mayores o iguales que 0
                }else if(numero1 > numero2 && numero1>=0 && numero2>=0){
                    System.out.println("El orden es " + numero2 + " " + numero1);
                }else{
                    System.out.println("Error, uno de los números es negativo");
                }
                
    }//fin del main
}//fin de la classe
