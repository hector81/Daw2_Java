package Ejercicios_Tema3_IfElse;
import java.util.Scanner;
/*
15-.	Pedir el d�a, mes y a�o de una fecha correcta y mostrar 
la fecha del d�a siguiente. suponer que todos los meses tienen 30 d�as.
 */
public class FechaDiaSiguiente {
    // main

    public static void main(String[] args) {
        // Declaracion de variables
        // variables de la fecha 1
        int ano1;
        int mes1;
        int dia1;
        // variables de la fecha 1
        int ano2;
        int mes2;
        int dia2;
        // Pedir datos
        // hacemos un do while para posibles errores y que solo se metan los
        // datos una sola vez
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Pon el a�o de la primera fecha: ");
            ano1 = sc.nextInt();
            System.out.print("Pon el mes de la primera fecha: ");
            mes1 = sc.nextInt();
            System.out.print("Pon el d�a de la primera fecha: ");
            dia1 = sc.nextInt();
            // if para comprobar que el a�o de la primera fecha es correcto
            if (ano1 < 1 || ano1 > 2015) {
                System.out
                        .println("El a�o de la primera fecha esta equivocado. "
                                + "No puede ser mayor de 2015 o menor de 0. ");
            }
            // if para comprobar que el mes de la primera fecha es correcto
            if (mes1 < 1 || mes1 > 12) {
                System.out
                        .println("El mes de la primera fecha esta equivocado. "
                                + "No puede ser mayor de 12 o menor de 1. ");
            }
            // if para comprobar que el d�a de la primera fecha es correcto
            if (dia1 < 1 || dia1 > 31) {
                System.out
                        .println("El dia de la segunda fecha esta equivocado. "
                                + "No puede ser mayor de 31 o menor de 0. ");
            }//fin if

        } while ((ano1 < 1 || ano1 > 2015) || (mes1 < 1 || mes1 > 12) || (dia1 < 1
                || dia1 > 31));
        // fin do while

        // imprimir la fecha dada
        System.out.println("La fecha es: " + dia1 + "-" + mes1 + "-" + ano1);
        // if para calcular el dia siguiente
        //para 31-12-2011
        if (mes1 == 12 && dia1 == 30) {
            ano2 = ano1 + 1;
            mes2 = 1;
            dia2 = 1;
            //imprimir
            System.out.println("La fecha el d�a siguiente es: " + dia2 + "-"
                    + mes2 + "-" + ano2);
        } //para 30-05-2011
        else if ((mes1 < 12 || mes1 > 0) && dia1 == 30) {
            ano2 = ano1;
            mes2 = mes1 + 1;;
            dia2 = 1;
            //imprimir
            System.out.println("La fecha el d�a siguiente es: " + dia2 + "-"
                    + mes2 + "-" + ano2);
        } //para 17-05-2011
        else if ((mes1 < 12 || mes1 > 0) && (dia1 < 31 || dia1 > 0)) {
            ano2 = ano1;
            mes2 = mes1;
            dia2 = dia1 + 1;
            //imprimir
            System.out.println("La fecha el d�a siguiente es: " + dia2 + "-"
                    + mes2 + "-" + ano2);
        }

    }//fin main
}//fin clase
