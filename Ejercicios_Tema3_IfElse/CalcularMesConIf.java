/*
12.	Realizar un programa en Java que pida un número entero entre 1 y 12
y calcule y muestre por pantalla el mes correspondiente (no es posible utilizar switch)
 */
package Ejercicios_Tema3_IfElse;

import java.util.Scanner;

public class CalcularMesConIf {

    public static void main(String[] args) {
        // Declaracion de variables
        int mes;
        // Pedir datos //do while para repetir en caso de error
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Pon el número del mes: ");
            mes = sc.nextInt();
            if (mes < 1 || mes > 12) {
                System.out.print("N�mero mes negativo o mayor de 12. ");
            }// fin if
        } while (mes < 1 || mes > 12);
        // Realizar los calculos
        if (mes == 1) {
            System.out.printf("Enero\n");
        } else if (mes == 2) {
            System.out.printf("Febrero\n");
        } else if (mes == 3) {
            System.out.printf("Marzo\n");
        } else if (mes == 4) {
            System.out.printf("Abril\n");
        } else if (mes == 5) {
            System.out.printf("Mayo\n");
        } else if (mes == 6) {
            System.out.printf("Junio\n");
        } else if (mes == 7) {
            System.out.printf("Julio\n");
        } else if (mes == 8) {
            System.out.printf("Agosto\n");
        } else if (mes == 9) {
            System.out.printf("Septiembre\n");
        } else if (mes == 10) {
            System.out.printf("Octubre\n");
        } else if (mes == 11) {
            System.out.printf("Noviembre\n");
        } else if (mes == 12) {
            System.out.printf("Diciembre\n");
        }

    }// fin del main
}// fin de la clase
