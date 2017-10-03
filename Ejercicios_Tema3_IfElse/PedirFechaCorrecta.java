/*
10-Pedir el día, mes y año de una fecha e indicar si esta es
correcta (no tendremos en cuenta meses bisiestos)
 */
package Ejercicios_Tema3_IfElse;

import java.util.Scanner;

public class PedirFechaCorrecta {

    //main
    public static void main(String[] args) {
        // Declaracion de variables
        int dia;
        int mes;
        int anyo;

        //do whule
        do {
            Scanner sc = new Scanner(System.in);
            //Pedir datos
            System.out.print("Pon el dia: ");
            dia = sc.nextInt();
            System.out.print("Pon el mes: ");
            mes = sc.nextInt();
            System.out.print("Pon el a�o: ");
            anyo = sc.nextInt();

            if (dia > 31 || dia < 0) {
                System.out.println("El d�a es incorrecto");
            } //fin if
            if (mes > 13 || mes < 0) {
                System.out.println("El mes es incorrecto");
            } //fin if
            if (anyo < 0) {
                System.out.println("El a�o es incorrecto");
            } //fin if
            if (anyo < 0 && (mes > 13 || mes < 0)) {
                System.out.println("El a�o y el mes son incorrectos");
            } //fin if
            if (anyo < 0 && (dia > 31 || dia < 0)) {
                System.out.println("El a�o y el d�a son incorrectos");
            } //fin if
            if (anyo < 0 && (mes > 13 || mes < 0) && (dia > 31 && dia < 0)) {
                System.out.println("El a�o ,el mes y el d�a son incorrectos");
            } //fin if
            if ((mes > 13 || mes < 0) && (dia > 31 && dia < 0)) {
                System.out.println("El mes y el d�a son incorrectos");
            }//fin if
        } while ((dia > 31 || dia < 0) || (mes > 13 || mes < 0) || anyo < 0);//fin do while

        //calculamos con if e imprimimos
        //fin if
        if (dia <= 31 && mes <= 12 && anyo >= 0) {
            System.out.println("La fecha es: " + dia + "-" + mes + "-" + anyo);
        }
    }//fin del main
}//fin de la clase
