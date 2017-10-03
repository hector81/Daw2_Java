package Ejercicios_Tema3_Bucles;

/*
 16.	 Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
 */
import java.util.Scanner;

public class NotasAlumnos {
    // main

    public static void main(String[] args) {
        // atributos
        int nota;
        int contador = 1;
        int alumnosAprobados = 0;
        int alumnosSuspensos = 0;
        int alumnosCondicionados = 0;
        // Hacemos el do while para que pida los datos 6 veces
        do {
            System.out.print("Introduce nota del alumno " + contador + " : ");
            // esto es para pedir los datos con la clase scanner
            Scanner sc = new Scanner(System.in);
            nota = sc.nextInt();
            // usamos el primer if en caso de que sea mayor de 10 o menor que 0
            if (nota < 0 || nota > 10) {
                System.out.print("Error ,introduce nota correcta del alumno "
                        + contador + " : ");
                nota = sc.nextInt();
                // usamos else if para calcular las notas con los acumuladores
            }
            if (nota > 4 && nota < 11) {
                alumnosAprobados++;
            } else if (nota == 4) {
                alumnosCondicionados++;
            } else if (nota < 4 && nota > -1) {
                alumnosSuspensos++;
            } // fin del if y de los else
            // contador
            contador++;
        } while ((contador < 7) || (nota < 0 || nota > 10));// fin while

        // imprimir fuera del while porque si no se repite 6 veces
        System.out.println("El n�mero de aprobados es " + alumnosAprobados);
        System.out.println("El n�mero de condicionados es "
                + alumnosCondicionados);
        System.out.println("El n�mero de suspensos es " + alumnosSuspensos);
    }// fin main
}// fin clase
