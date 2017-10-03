package Paquete1;

import java.util.Scanner;

/*
Realizar un programa que pida un dos n�meros (enteros positivos y mayores de 0) y 
calcule y muestre por pantalla un rect�ngulo de tama�o NxM.
 */
public class RectanguloAsteriscos {
	// main
	public static void main(String[] args) {
		// DECLARAMOS ATRIBUTO
		int N;
		int M;
		// PEDIMOS DATOS		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un N (filas): ");
		N = sc.nextInt();
		System.out.print("Introduce un M (columnas): ");
		M = sc.nextInt();
	
				//for para filas
				for(int filas=0;filas<M;filas++){
					//for anidado para columnas
					for(int columnas=0;columnas<N;columnas++){
						System.out.print("*");//pinta las filas
					}//fin del for anidado
					System.out.println("");//con esto creamos las columnmas haciendo que las filas
					//vayan para abajo
				}//fin del for
		
			
				
		
	}// fin del main
}// fin de la clase
