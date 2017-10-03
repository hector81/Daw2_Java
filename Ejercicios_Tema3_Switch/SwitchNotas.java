/*
 1.	Realizar un programa que pida un nÃºmero (entero positivo mÃ¡s cero) 
y calcule y muestre por pantalla su nota de forma â€œBIENâ€�, â€œNOTABLEâ€�, â€œSUFICIENTEâ€� â€¦
 */
package Ejercicios_Tema3_Switch;

import java.util.Scanner;

public class SwitchNotas {
    // main

    public static void main(String[] args) {
        // declarar variables
        byte nota;
        //do while para repetir en caso de que la nota no sea correcta
        do {
            Scanner sc = new Scanner(System.in);
            // pedir datos
            System.out.print("Dime la nota que has sacado: ");
            nota = sc.nextByte();
            // if para mensaje erroneo
            if (nota < 0 || nota > 10) {
                System.out.println("LA NOTA NO ES CORRECTA");
            }
        } while (nota < 0 || nota > 10);
        //calculos
        switch (nota) {
            case 0:
                System.out.println("MUY DEFICIENTE ");
                break;
            case 1:
                System.out.println("MUY DEFICIENTE ");
                break;
            /*
		 * TambiÃ©n podemos usar esto para lo mismo case 0:case 1:
		 * System.out.println("MUY DEFICIENTE "); break;
             */
            case 2:
                System.out.println("DEFICIENTE ");
                break;
            case 3:
                System.out.println("DEFICIENTE ");
                break;
            case 4:
                System.out.println("DEFICIENTE ");
                break;
            case 5:
                System.out.println("SUFICIENTE ");
                break;
            case 6:
                System.out.println("BIEN ");
                break;
            case 7:
                System.out.println("NOTABLE");
                break;
            case 8:
                System.out.println("NOTABLE");
                break;
            case 9:
                System.out.println("SOBRESALIENTE");
                break;
            default:
                System.out.println("SOBRESALIENTE");
                break;
        }// fin del switch

    }// fin del main
}// fin de la clase
