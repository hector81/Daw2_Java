/*
 3-Pedir una nota numÃ©rica por pantalla (entera positivo mÃ¡s cero entre 0 y 10) y muestra por pantalla â€œceroâ€�
 , â€œunoâ€�, â€œdosâ€�...5.6.13.12
 (que le ponga error en caso de que el nÃºmero sea negativo)
 */
package Ejercicios_Tema3_Switch;

import java.util.Scanner;

public class NotaNumerica {

    //main
    public static void main(String[] args) {
        //declarar variables
        int notaNumerica;
        Scanner sc = new Scanner(System.in);

        //pedir datos //EL DO WHILE ES PARA QUE SE REPITA EN CASO DE FALLO DEL USUARIO
        do {
            System.out.print("Dime la nota numÃ©rica: ");
            notaNumerica = sc.nextInt();
            if (notaNumerica < 0 || notaNumerica > 10) {
                System.out.print("El nÃºmero es mayor de diez o menor que 0 \n");
            }
        } while (notaNumerica < 0 || notaNumerica > 10);

        //calcular
        switch (notaNumerica) {
            case 0:
                System.out.println("Cero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Cuatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Seis");
                break;
            case 7:
                System.out.println("Siete");
                break;
            case 8:
                System.out.println("Ocho");
                break;
            case 9:
                System.out.println("Nueve");
                break;
            default:
                System.out.println("Diez");
                break;
        }//fin del switch

    }//fin del main

}//fin de la clase
