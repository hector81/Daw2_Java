/*
Pedir una nota numérica por pantalla (entera positivo más cero entre 0 y 10) y muestra por pantalla “cero”
, “uno”, “dos”...5.6.13.12
(que le ponga error en caso de que el número sea negativo)
 */
package iescomercioejerciciostema3;

import java.util.Scanner;

public class NotaNumerica {
    //main
    public static void main(String[] args) {
        //declarar variables
        int notaNumerica;
        Scanner sc = new Scanner(System.in);
        //pedir datos
        System.out.print("Dime la nota que has sacado: ");
        notaNumerica = sc.nextInt();
        
        //calcular
        if (notaNumerica < 0 || notaNumerica > 10){
            System.out.print("El número es mayor de diez o menor que 0 ");
        }else{
            switch(notaNumerica){
                case 0:
                        System.out.println("cero ");
                        break;
                case 1:
                        System.out.println("uno");
                        break;
                case 2:
                        System.out.println("dos");
                        break;
                case 3:
                        System.out.println("tres");
                        break;
                case 4:
                        System.out.println("cuatro");
                        break;
                case 5:
                        System.out.println("cinco");
                        break;
                case 6:
                        System.out.println("seis");
                        break;
                case 7:
                        System.out.println("siete");
                        break;
                case 8:
                        System.out.println("ocho");
                        break;
                case 9:
                        System.out.println("nueve");
                        break;
                default:                           
                        System.out.println("diez");
                        break;             
                }//fin del switch
        }//fin del else
        
    }//fin del main
}//fin de la clase
