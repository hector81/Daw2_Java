/*
14.Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. 
Con meses de 28, 30 y 31 días. Sin años bisiestos.
 */
package Ejercicios_Tema3_IfElse;



/**
 *
 * Hector Garcia
 */
import java.util.Scanner;
public class FechasCorrectas1 {
    // main

    public static void main(String[] args) {
        // Declaracion de variables
        // variables del a�o1
        int ano1;
        int mes1;
        int dia1;

        // Pedir datos
        // hacemos un do while para posibles errores y que solo se metan los
        // datos una sola vez
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Pon el a�o de la fecha: ");
            ano1 = sc.nextInt();
            // if para comprobar que el a�o de la primera fecha es correcto
            if (ano1 < 1 || ano1 > 2015) {
                System.out
                        .println("El a�o de la fecha esta equivocado. "
                                + "No puede ser mayor de 2015 o menor de 0. Pon otro a�o: ");
                ano1 = sc.nextInt();
            }
            System.out.print("Pon el mes de la fecha: ");
            mes1 = sc.nextInt();
            // if para comprobar que el mes de la primera fecha es correcto
            if (mes1 < 1 || mes1 > 12) {
                System.out
                        .println("El mes de la fecha esta equivocado. "
                                + "No puede ser mayor de 12 o menor de 1. Pon otro mes: ");
                mes1 = sc.nextInt();
            }
            System.out.print("Pon el d�a de la fecha: ");
            dia1 = sc.nextInt();
            // if para comprobar que el d�a de la primera fecha es correcto
            if (dia1 < 1 || dia1 > 31) {
                System.out
                        .println("El dia de la fecha esta equivocado. "
                                + "No puede ser mayor de 31 o menor de 0. Pon otro d�a: ");
                dia1 = sc.nextInt();
            }//fin if

        } while ((ano1 < 1 || ano1 > 2015) || (mes1 < 1 || mes1 > 12) || (dia1 < 1
                || dia1 > 31));
        // fin do while

        // imprimir la fecha dada
        System.out.println("La fecha es: " + dia1 + "-" + mes1 + "-" + ano1);
        // if para comprobar si la fecha es correcta y poner la fecha correcta
        //para enero, marzo, mayo, julio, agosto, octubre y diciembre ,31 ser�a un dia correcto
        //pero para febrero, abril, junio, septiembre y noviembre no seria correcta
        if ((dia1 > 30) && (mes1 == 4 || mes1 == 6 || mes1 == 9 || mes1 == 11)) {
            System.out.println("La fecha no es correcta. Este mes tiene 30 d�as ");
        } else if (mes1 == 2) {
            //if anidado para comprobrar febreros de a�os bisiestos o no
            if ((ano1 % 4 == 0) && ((ano1 % 100 != 0) || (ano1 % 400 == 0)) && dia1 > 29) {
                System.out.println("La fecha no es correcta. Este mes tiene 29 d�as ");
            } else if ((ano1 % 4 != 0) && ((ano1 % 100 != 0) || (ano1 % 400 != 0)) && dia1 > 28) {
                System.out.println("La fecha no es correcta. Este mes tiene 28 d�as ");
            }//fin if anidado

        } else {
            System.out.println("La fecha es correcta.");
        }//fin if

    }//fin main
}//fin clase
