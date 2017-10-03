/*
11.	Pedir un número y calcular su factorial. ejemplo factorial de 6 , 6*5*4*3*2*1 = 760
 */
package Ejercicios_Tema3_Bucles;

import java.util.Scanner;

public class CalcularFactorial {
	// main
	public static void main(String[] args) {
		// Declaracion de variables
		int numeroFactorial, factorial = 1;

		// Pedir datos y hacer do while por si acaso hay numeros nregativos y hay que volver
		// a introducir
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Pon un número para calcular su factorial : ");
			numeroFactorial = sc.nextInt();
			if (numeroFactorial < 0) {
				System.out.println("El número es negativo");
			}
		} while (numeroFactorial < 0);

		// while y calcular factorial
		while (numeroFactorial != 0) {
			if (numeroFactorial > 0) {
				// factorial = numeroFactorial*numeroFactorial; multiplicamos
				// numeros factoriales// acumulador
				factorial *= numeroFactorial;
				// decrecemos el numero factorial
				numeroFactorial--;
			}// fin if
		}// fin while
			// IMPRIMIR
		System.out.print("El factorial del número es: " + factorial);
	}// fin main
}// fin clase

