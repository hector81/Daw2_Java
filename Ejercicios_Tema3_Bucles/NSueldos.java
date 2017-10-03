package Ejercicios_Tema3_Bucles;

import java.util.Scanner;

/*
 17- Pedir un n�mero N, introducir N sueldos y mostrar el sueldo m�ximo
 */
public class NSueldos {
	// main
	public static void main(String[] args) {
		// Declaracion de variables
		int numero; // n�mero de sueldos
		int contador = 1;// contador a 1 para que empieze a contar con ese
							// numero
		int sueldo = 0 ; // iniciamos sueldo
		int sueldoMayor = 0 ; // iniciamos sueldo
		//pedir datos y calcular
		/*
		 * Pedir datos llamamos a la clase scanner usamos do while para que pida
		 * los datos y tambi�n por si hay negativo para que pueda meter otro
		 */
		do {
			System.out.print("Pon el n�mero de sueldos : ");
			Scanner sc = new Scanner(System.in);
			numero = sc.nextInt();
			if (numero > 0) {
				for (contador = 1; contador <= numero; contador++) {
					System.out.print("Pon el sueldo del trabajador " + contador
							+ " : ");
					sueldo = sc.nextInt();			
					//if anidado para sueldos negativos
					if (sueldo < 1) {
						System.out
								.print("El sueldo es cero o negativo. Pon otro sueldo del trabajador " + contador + " : ");
						sueldo = sc.nextInt();
					} // fin if anidado
					if (sueldo > 0) {
						if (sueldo > sueldoMayor) {
							sueldoMayor = sueldo ;				                          
			             }
					}			
				}// fin for                        
			} else if (numero < 1) {
				System.out.print("El n�mero es cero o negativo. Pon otro: ");
			} // fin if
			// contador
			contador++;
		} while (contador <= numero || numero < 1);//fin do while
		
		System.out.println("El sueldo " + sueldoMayor + " es el mayor");
		
	}// fin del main
}// fin de la clase
