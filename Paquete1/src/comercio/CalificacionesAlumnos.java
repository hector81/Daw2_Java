package Paquete1.src.comercio;

import java.util.Scanner;

/*
18.	 Pedir 5 calificaciones de alumnos y decir al final si hay algun suspenso.
 */
public class CalificacionesAlumnos {
	public static void main(String[] args) {
		// DECLARAMOS ATRIBUTO
		int nota;
		int contadorAlumnos = 1; // lo inicializamos a 1 para que empieze a
									// contar en 1
		int numeroSuspensos = 0;
		int numeroAprobados = 0;
		// PEDIMOS DATOS
		do {
			// ESTO LO REPITE 5 VECES
			Scanner sc = new Scanner(System.in);
			System.out.println("Pon la nota del alumno " + contadorAlumnos + " : ");
			// A SU VEZ ESTO LO REPITE 5 VECES
			nota = sc.nextInt();
			// contador para que aumente hasta 5 alumnos
			contadorAlumnos++;
			// usamos el if para contar las veces que son multiplos de 3 o no
			for (nota = 0; nota > 11; nota++) {
				if (nota < 5) {
					numeroSuspensos++;
				} // fin if
				else if (nota > 5) {
					numeroAprobados++;
				} // fin else if				
			} // fin for			
		} while (contadorAlumnos < 6);
		// IMPRIMIR
		System.out.println("Los alumnos no aprobados son : " + numeroSuspensos);
		System.out.println("Los  alumnos aprobados son: " + numeroAprobados);
	}// fin main
}// fin clase


/*


if (nota < 5) {
System.out.println("El alumno " + contadorAlumnos + " ha sacado un suspenso");
} // fin if
else if (nota > 4) {
numeroAprobados++;
String notaNOTA;
//switch anidado para notas calificaciones:
switch(nota){

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
	}//fin switch
System.out.println("El alumno: " + numeroAprobados + " ha sacado " + notaNOTA);
} // fin else if	

*/