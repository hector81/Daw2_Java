package Paquete1.src.comercio;

import java.util.Scanner;

/*
19- Pedir 5 numeros e indicar si alguno es multiplo de 3.
 */
public class NumerosMultiplos3 {
	public static void main(String[] args) {
		// DECLARAMOS ATRIBUTO
		int numero;
		int contador = 1; // lo inicializamos a 1 para que empieze a contar en 1
		int numeroMultiploTres = 0;
		int numeroNoMultiploTres = 0;
		// PEDIMOS DATOS
		do {
			// ESTO LO REPITE 5 VECES
			Scanner sc = new Scanner(System.in);
			System.out.println("Pon el numero " + contador + " : ");
			// A SU VEZ ESTO LO REPITE 5 VECES
			numero = sc.nextInt();
			// contador
			contador++;
			// usamos el if para contar las veces que son multiplos de 3 o no
			if (numero % 3 == 0) {
				numeroMultiploTres++;
			} // fin if
			else if (numero % 3 != 0) {
				numeroNoMultiploTres++;
			} // fin else if
		} while (contador < 6);

		// IMPRIMIR
		System.out.println("Los numeros multiplos de 3 son : " + numeroMultiploTres);
		System.out.println("Los numeros no multiplos de 3 son: " + numeroNoMultiploTres);

	}// fin main
}// fin clase
