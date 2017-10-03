package Ejercicios_Tema3_IfElse;

import java.util.Scanner;

/*
 16. �dem que el ej. 17, suponiendo que cada mes tiene un n�mero distinto de d�as
 (suponer que febrero tiene siempre 28 d�as).
 17-Pedir dos fechas y mostrar el n�mero de d�as que hay de diferencia. 
 Suponiendo todos los meses de 30 d�as.
 */
import java.util.Scanner;
public class DosFechasDiferencia1 {
    // main

    public static void main(String[] args) {
        // Declaracion de variables
        // variables del a�o1
        int ano1;
        int mes1;
        int dia1;
        // variables del a�o2
        int ano2;
        int mes2;
        int dia2;
        // variables para calcular numero dias
        int ano;
        int mes = 0;
        int dia;
        int resultado;

        // Pedir datos
        // hacemos un do while para posibles errores y que solo se metan los
        // datos una sola vez
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Pon el a�o de la primera fecha: ");
            ano1 = sc.nextInt();
            // if para comprobar que el a�o de la primera fecha es correcto
            if (ano1 < 0 || ano1 > 2016) {
                System.out
                        .println("El a�o de la primera fecha esta equivocado. ");
            }
            System.out.print("Pon el mes de la primera fecha: ");
            mes1 = sc.nextInt();
            // if para comprobar que el mes de la primera fecha es correcto
            if (mes1 < 1 || mes1 > 12) {
                System.out
                        .println("El mes de la primera fecha esta equivocado. ");
            }
            System.out.print("Pon el d�a de la primera fecha: ");
            dia1 = sc.nextInt();
            // if para comprobar que el d�a de la primera fecha es correcto
            if (dia1 < 1 || dia1 > 31) {
                System.out
                        .println("El dia de la segunda fecha esta equivocado. ");
            }
            System.out.print("Pon el a�o de la segunda fecha: ");
            ano2 = sc.nextInt();
            // if para comprobar que el a�o de la segunda fecha es correcto
            if (ano2 < 1 || ano2 > 2016) {
                System.out
                        .println("El a�o de la primera fecha esta equivocado. ");
            }
            System.out.print("Pon el mes de la segunda fecha: ");
            mes2 = sc.nextInt();
            // if para comprobar que el mes de la segunda fecha es correcto
            if (mes2 < 1 || mes2 > 12) {
                System.out
                        .println("El mes de la segunda fecha esta equivocado. ");
            }
            System.out.print("Pon el d�a de la segunda fecha: ");
            dia2 = sc.nextInt();
            // if para comprobar que el d�a de la segunda fecha es correcto
            if (dia2 < 1 || dia2 > 31) {
                System.out
                        .println("El dia de la segunda fecha esta equivocado. ");
            }

            // IF PARA aviso error
            if ((ano1 < 1 || ano1 > 2015 || mes1 < 1 || mes1 > 12 || dia1 < 1
                    || dia1 > 31 || ano2 < 1 || ano2 > 2015 || mes2 < 1
                    || mes2 > 12 || dia2 < 1 || dia2 > 31)) {
                System.out
                        .println("HAS METIDO DATOS ERRONEOS. TODOS LOS DATOS DEBEN SER"
                                + " CORRECTOS. VUELVE A INTRODUCIRLOS. ");
            }
        } while ((ano1 < 1 || ano1 > 2015) || (mes1 < 1 || mes1 > 12)
                || (dia1 < 1 || dia1 > 30) || (ano2 < 1 || ano2 > 2015)
                || (mes2 < 1 || mes2 > 12) || (dia2 < 1 || dia2 > 30));
        // fin do while

        // realizar calculos
        dia = dia1 - dia2;
        // si la diferencia es negativa , la multiplicamos por -1 para que sea
        // positiva
        if (dia < 0) {
            dia = dia * -1;
        }
        if (mes1 < 13) {
            if (mes1 == 2) {
                mes = (mes1 * 28) - (mes2 * 28);
                if (mes < 0) {
                    // si la diferencia es negativa , la multiplicamos por -1
                    // para que sea positiva
                    mes = mes * -1;
                }
            } else if (mes1 == 4 || mes1 == 6 || mes1 == 9 || mes1 == 11) {
                mes = (mes1 * 30) - (mes2 * 30);
                if (mes < 0) {
                    // si la diferencia es negativa , la multiplicamos por -1
                    // para que sea positiva
                    mes = mes * -1;
                }
            } else if (mes1 == 1 || mes1 == 3 || mes1 == 5 || mes1 == 7
                    || mes1 == 8 || mes1 == 10 || mes1 == 12) {
                mes = (mes1 * 31) - (mes2 * 31);
                if (mes < 0) {
                    // si la diferencia es negativa , la multiplicamos por -1
                    // para que sea positiva
                    mes = mes * -1;
                }
            }
        }
        // si la diferencia es negativa , la multiplicamos por -1 para que sea
        // positiva
        ano = (ano1 * 365) - (ano2 * 365);
        if (ano < 0) {
            ano = ano * -1;
        }

        // sumamos los dias
        resultado = dia + mes + ano;

        // sacamos fuera para imprimir
        System.out.println("Primera fecha : " + dia1 + "-" + mes1 + "-" + ano1);
        System.out.println("Segunda fecha : " + dia2 + "-" + mes2 + "-" + ano2);
        System.out.println("La diferencia en d�as entre las 2 fechas es : "
                + resultado);

    }// fin main
}// fin clase
