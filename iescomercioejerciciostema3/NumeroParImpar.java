/*
Realizar un programa en java que pida un número e indique si este es par o impar
 */
package iescomercioejerciciostema3;

import java.util.Scanner;

public class NumeroParImpar {
    public static void main(String[] args) {
	// Declaracion de variables
		long numero;
		Scanner sc = new Scanner(System.in);
	//Pedir datos
		System.out.print("Pon un número: ");
		numero = sc.nextLong();	
        
        //comparar si es par o impar con if
                //si el resto de dividir el numero entre 2 es igual a 0
                if(numero%2 == 0){
                    System.out.printf("El número es par\n");
                }else{
                    System.out.printf("El número es impar\n");
                }
                
    }//fin del main
}//fin de la clase
