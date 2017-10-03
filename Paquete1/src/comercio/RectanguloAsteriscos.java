package Paquete1.src.comercio;

import java.util.Scanner;

/*
Realizar un programa que pida un dos numeros (enteros positivos y mayores de 0) y 
calcule y muestre por pantalla un rectangulo de tamaño NxM.
 */
public class RectanguloAsteriscos {
	// main
	public static void main(String[] args) {
		// DECLARAMOS ATRIBUTO
		int N;
		int M;
		// PEDIMOS DATOS
		do {
			//PEDIREMOS DATOS Y SI UNO DE LOS DATOS NO ES VALIDO VOLVERA A PEDIRLOS
			Scanner sc = new Scanner(System.in);
			System.out.print("Introduce un N (filas): ");
			N = sc.nextInt();
			System.out.print("Introduce un M (columnas): ");
			M = sc.nextInt();
			if (N < 1) {
				System.out.println("N es negativo o igual que cero. ");
			} else if (M < 1) {
				System.out.println("M es negativo o igual que cero. ");
			}//fin if
		} while (N < 1 || M < 1);

		// for para filas
		for (int filas = 0; filas < M; filas++) {
			// for anidado para columnas
			for (int columnas = 0; columnas < N; columnas++) {
				System.out.print("*");// pinta las filas
			} // fin del for anidado
			System.out.println("");// con esto creamos las columnmas haciendo
									// que las filas
			// vayan para abajo
		} // fin del for

	}// fin del main
}// fin de la clase
