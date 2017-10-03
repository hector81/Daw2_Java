package Ejercicios_Tema3_Bucles;

import java.util.Scanner;

/*
 18.	 Pedir 5 calificaciones de alumnos y decir al final si hay alg�n suspenso.
 */
public class CalificacionesAlumnos {
	public static void main(String[] args) {
		// DECLARAMOS ATRIBUTO
		int nota;
		int contadorAlumnos = 1; // lo inicializamos a 1 para que empieze a
									// contar en 1
		int numeroSuspensos = 0;
		int numeroAprobados = 0;
		String notaNOTA = "";

		// PEDIMOS DATOS. Usamos do while para que pida la informaci�n 5 veces
		do {
			// ESTO LO REPITE 5 VECES
			Scanner sc = new Scanner(System.in);
			System.out.print("Pon la nota del alumno " + contadorAlumnos
					+ " : ");
			// A SU VEZ ESTO LO REPITE 5 VECES
			nota = sc.nextInt();
			// si la nota es menor de 11 o mayor que -1 puede seguir
			if (nota < 11 && nota > -1) {
				// switch anidado para notas calificaciones:
				switch (nota) {
				case 0:
					notaNOTA = "Suspenso";
					break;
				case 1:
					notaNOTA = "Suspenso";
					break;
				case 2:
					notaNOTA = "Suspenso";
					break;
				case 3:
					notaNOTA = "Suspenso";
					break;
				case 4:
					notaNOTA = "Suspenso";
					break;
				case 5:
					notaNOTA = "Suficiente";
					break;
				case 6:
					notaNOTA = "Bien";
					break;
				case 7:
					notaNOTA = "Notable";
					break;
				case 8:
					notaNOTA = "Notable";
					break;
				case 9:
					notaNOTA = "Sobresaliente";
					break;
				default:
					notaNOTA = "Sobresaliente";
					break;
				}// fin switch

				System.out.println("El alumno " + contadorAlumnos
						+ " ha sacado " + notaNOTA);

				// contador para que aumente hasta 5 alumnos
				contadorAlumnos++;

				// este if anidado 1- es para decir si todos han aprobado o no y
				// decir el numero
				if (nota < 5) {
					numeroSuspensos++;
					// if anidado 2- para alertar de que todos son suspensos
					if (numeroSuspensos == 5) {
						System.out.println("ALERTA, TODOS SUSPENSOS");
					} // fin if anidado 2
				} // fin if anidado 1
				else if (nota > 4) {
					numeroAprobados++;
					// if anidado 1- para alertar de que todos son aprobados
					if (numeroAprobados == 5) {
						System.out.println("ALERTA, TODOS APROBADOS");
					} // fin if anidado 1
				} // fin if anidado 1 y else
					// este else if es para en caso de meter numero erroneo.
					// tengas que meter otro y lo tenga en cuenta
			} else if (nota > 10 && nota < 0) {
				nota = sc.nextInt();
			} // fin else if
		} while (contadorAlumnos < 6);// fin del do while

		// if para alerta de que hay suspensos
		if (numeroSuspensos > 0) {
			System.out.println("ALERTA, HAY SUSPENSOS");
		} // fin if

		// lo imprimimos fuera del while
		System.out.println("Los alumnos no aprobados son : " + numeroSuspensos);
		System.out.println("Los  alumnos aprobados son: " + numeroAprobados);

	}// fin main
}// fin clase