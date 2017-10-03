package Paquete1.src.comercio;

import java.util.Scanner;

/*
 4. Realizar un programa en java que pida un numero entero positivo N mayor de 0 y calcula y 
 muestra por pantalla un cuadrado de tamaño NxN con asteriscos.
 */
public class DibujarAsteriscosNumero {
	// main
	public static void main(String[] args) {
		// DECLARAMOS ATRIBUTO
		int numero;
		do {
			// PEDIMOS DATOS
			Scanner sc = new Scanner(System.in);
			System.out.print("Introduce un numero entero: ");
			numero = sc.nextInt();
			if (numero < 1) {
				System.out.print("Numero negativo o igual que cero. ");

			}
		} while (numero < 1);

		// for para filas
		for (int filas = 0; filas < numero; filas++) {
			// for anidado para columnas
			for (int columnas = 0; columnas < numero; columnas++) {
				System.out.print("*");// pinta las filas
			} // fin del for anidado
			System.out.println("");// con esto creamos las columnmas haciendo
									// que las filas
			// vayan para abajo
		} // fin del for

	}// fin del main
}// fin de la clase
