package Paquete1;

import java.util.Scanner;

/*
 Realizar un programa que pida un n�mero N y calcule y muestre por pantalla 
 cuantos n�meros de esos N son n�meros primos  
 */
public class NumerosPrimos {
	public static void main(String[] args) {
		// DECLARAMOS ATRIBUTO
		int numero;
		int contador;
		// pedir numero
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un n�mero entero: ");
		numero = sc.nextInt();
		// USAMOS BUCLE FOR PARA RECORRER HASTA EL N�MERO
		for (contador = 1; contador <= numero; contador++) {
			int numeroPrimo = numero % contador;
			if (numeroPrimo == 0 && contador !=numeroPrimo ) {
				// IMPRIMIMOS
				numeroPrimo = contador;
				System.out.print(numeroPrimo + " ");
			}// fin if
		}// fin for
	}// fin main
}// fin clase
