/*
13.	 Programa que pide los 10 sueldos de los empleados de una empresa y 
calcula y muestra por pantalla la suma de todos ellos y cuántos hay mayores de 1000€.
 */
package Ejercicios_Tema3_Bucles;

import java.util.Scanner;

public class Sueldos {

    //main
    public static void main(String[] args) {
        // Declaracion de variables
        int sueldo;
        int numeroTrabajadores = 1;
        int sueldoMayorMil = 0;
        int sueldoHastaMil = 0;
        int totalSueldos = 0;

        //while y pedir los datos dentro para que no te pida más de 10
        while (numeroTrabajadores < 11) {
            do {
                Scanner sc = new Scanner(System.in);
                //ESTO LO REPITE 10 VECES
                System.out.print("Pon el sueldo del trabajador " + numeroTrabajadores + " : ");
                //A SU VEZ ESTO LO REPITE 10 VECES
                sueldo = sc.nextInt();
                //if para sueldos negativos
                if (sueldo < 1) {
                    System.out.print("El sueldo es 0 o negativo. Pon otra vez el sueldo del trabajador "
                            + numeroTrabajadores + " : ");
                    sueldo = sc.nextInt();
                }
                //usamos un acumulador para sumar el total de sueldos // totalSueldos = sueldo + sueldo;
                totalSueldos += sueldo;
                //usamos el if para contar las veces que son mayores de 1000 o menores de 1000
                if (sueldo > 1000) {
                    sueldoMayorMil++;
                } else if (sueldo <= 1000) {
                    sueldoHastaMil++;
                }
                //suma contador //ACUMULADOR// esto sumara el contador hasta el limite de 10
                numeroTrabajadores++;
            } while (sueldo < 1);
        }
        //IMPRIMIR
        System.out.println("La cantidad de trabajadores con sueldo mayor de 1000 es: " + sueldoMayorMil);
        System.out.println("La cantidad de trabajadores con sueldo menor o igual a 1000 es: " + sueldoHastaMil);
        System.out.println("La cantidad del total de sueldos es: " + totalSueldos);
    }//fin main
}//fin clase


