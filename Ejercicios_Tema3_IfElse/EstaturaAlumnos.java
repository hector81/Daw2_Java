package Ejercicios_Tema3_IfElse;



/*
 14.	 Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, 
 la cantidad de alumnos mayores de 18 a�os, y la cantidad de alumnos que miden m�s de 1.75. 
 */// hacerlo con fpor y solo 18 o 1.75
import java.util.Scanner;
public class EstaturaAlumnos {

    //main
    public static void main(String[] args) {
        // Declaracion de variables
        double estatura;
        int edad;
        int numeroAlumnos = 1;
        int mayorEdad = 0;
        int menorEdad = 0;
        int mayorEstatura = 0;
        int menorEstatura = 0;
        int totalEstatura = 0;
        int totalEdad = 0;
        double mediaEdad = 0;
        double mediaEstatura = 0;

        Scanner sc = new Scanner(System.in);

        //while y pedir los datos dentro para que no te pida m�s de 10
        while (numeroAlumnos < 6) {
            //ESTO LO REPITE 5 VECES
            System.out.println("Pon la edad del alumno " + numeroAlumnos + " : ");
            //A SU VEZ ESTO LO REPITE 5 VECES
            edad = sc.nextInt();
            //ESTO LO REPITE 5 VECES
            System.out.println("Pon la estatura del alumno " + numeroAlumnos + " : ");
            //A SU VEZ ESTO LO REPITE 5 VECES
            estatura = sc.nextDouble();

            //usamos un acumulador para sumar el total de estaturas
            totalEstatura += estatura;

            //usamos el if para contar las veces que son mayores o menores de edad
            if (edad > 17) {
                mayorEdad++;
            } else if (edad < 18) {
                menorEdad++;
            }
            //usamos el if para contar las veces que son mayores o menores de edad
            if (estatura > 1.75) {
                mayorEstatura++;
            } else if (estatura < 1.75) {
                menorEstatura++;
            }
            //suma contador hasta 5
            numeroAlumnos++;
            //calculamos media estaturas
            mediaEstatura = (double) totalEstatura / numeroAlumnos;
            mediaEdad = (double) totalEdad / numeroAlumnos;
        }//fin while

        //IMPRIMIR
        System.out.println("La cantidad de alumnos mayores de edad es : " + mayorEstatura);
        System.out.println("La cantidad de alumnos menores de edad es: " + menorEstatura);
        System.out.println("La cantidad de alumnos mayores de 1.75 metros es : " + mayorEdad);
        System.out.println("La cantidad de alumnos menores de 1.75 metros es: " + menorEdad);
        System.out.println("La cantidad del total de estaturas es: " + totalEstatura);
        System.out.println("La media de las estaturas es: " + mediaEstatura);
    }//fin main
}//fin clase
