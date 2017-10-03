package Paquete1.src.comercio;

import java.util.Scanner;

/*
 Realizar un programa que pida un numero N y calcule y muestre por pantalla 
 cuantos numeros de esos N son numeros primos  
 */
public class NumerosPrimos {
	public static void main(String[] args) {
		// DECLARAMOS ATRIBUTO
		int numero;
		int contador;

		// operacion
		do {
			// pedir numero
			Scanner sc = new Scanner(System.in);
			System.out.print("Introduce un numero entero: ");
			numero = sc.nextInt();
			// USAMOS BUCLE FOR PARA RECORRER HASTA EL NUMERO
			for (contador = 1; contador <= numero; contador++) {
				// declaramos variable local para sea el resto de
				// numero/contador
				int numeroPrimo = numero%contador;
				// si esa variable es igual a 0 o distinta al contador
				if (numeroPrimo == 0 && contador != numeroPrimo) {
					// asignaremos a esa variable local el contador que cumpla
					// los requisitos del if
					numeroPrimo = contador;
					// IMPRIMIMOS
					System.out.print(numeroPrimo + " ");
				} // fin if
			} // fin for
		} while (contador <= numero); // fin do while

	}// fin main
}// fin clase
