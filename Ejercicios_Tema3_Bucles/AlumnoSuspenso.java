package Ejercicios_Tema3_Bucles;

import java.util.Scanner;

/*
18- Pedir 5 calificaciones de alumnos y decir al final si hay alg�n suspenso.
 */
public class AlumnoSuspenso {
    // main

    public static void main(String[] args) {
        // atributos
        int nota;
        int alumnosSuspensos = 0;
        int alumnosAprobados = 0;
        int contador = 1;
        //esto para que pida datos 5 veces y por si hay errores
        do {
            // Hacemos el for para que recorra las 5 notas
            for (contador = 1; contador < 6; contador++) {
                System.out.print("Introduce nota del alumno " + contador + " : ");
                // esto es para pedir los datos con la clase scanner
                Scanner sc = new Scanner(System.in);
                nota = sc.nextInt();
                // usamos el primer if en caso de que sea mayor de 10 o menor que 0
                if (nota < 5) {
                    alumnosSuspensos++;
                } else if (nota > 4) {
                    alumnosAprobados++;
                    // if anidado, si el numero de aprobados es igual a 5 no hay suspensos
                    if (alumnosAprobados == 5) {
                        System.out.println("No hay alumnos suspensos");
                    } else if (alumnosSuspensos == 5) {
                        System.out.println("No hay alumnos aprobados");
                    }//fin if anidado
                }// fin if else	
            }// fin for
        } while (contador < 6);
        // imprimir
        System.out.println("Hay alumnos suspensos y su n�mero es " + alumnosSuspensos);
        System.out.println("Hay alumnos aprobados y su n�mero es " + alumnosAprobados);
    }// fin main
}// fin clase
