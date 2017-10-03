package Ejercicios_Tema3_IfElse;
/*13.	Realizar un programa en Java que pide el aÃ±o de nacimiento de una persona y calcula
 y muestra por pantalla segÃºn el caso
 â€œEres mayor de edadâ€�, â€œEres un adultoâ€� y â€œEres un abuelitoâ€� (mayor de 67) segÃºn el caso.*/
import java.util.Scanner;

public class CalcularEdad {

    public static void main(String[] args) {
        // Declaracion de variables
        int edad;

        do {
            // Pedir datos
            Scanner sc = new Scanner(System.in);
            System.out.print("Pon tu edad: ");
            edad = sc.nextInt();
            // if para errores
            if (edad < 0) {
                System.out.print("No puede ser una edad negativa. ");
            }// fin if
        } while (edad < 0);

        // Realizar los calculos
        if (edad >= 0 && edad < 18) {
            System.out.printf("Eres menor de edad\n");
        } else if (edad >= 18 && edad < 25) {
            System.out.printf("Eres mayor de edad\n");
        } else if (edad >= 25 && edad < 67) {
            System.out.printf("Eres un adulto\n");
        } else if (edad > 67) {
            System.out.printf("Eres un abuelito\n");
        }

    }// fin del main
}// fin de la clase

