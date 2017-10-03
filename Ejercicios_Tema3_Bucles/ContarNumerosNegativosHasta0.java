/*
 8.	Pedir números hasta que se teclee uno negativo y mostrar cuántos números se han
  introducido
 */
package Ejercicios_Tema3_Bucles;

import java.util.Scanner;

public class ContarNumerosNegativosHasta0 {

    //main
    public static void main(String[] args) {
        // Declaracion de variables
        int numero;  //para números introducidos
        int contador = 0; //para contador
        Scanner sc = new Scanner(System.in);

        /* CON WHILE */
        //Pedir datos while ,mientras numero sea mas o igual que 0
//        System.out.println("Pon número : ");
//        numero = sc.nextInt();
//        while (numero >= 0) {
//            //esto repetira indefinidamente hasta que introduzcas un numero negativo           
//            contador++;
//            System.out.println("Pon número : ");
//            numero = sc.nextInt();
//        }
//        System.out.println("Se han introducido: " + contador + " números");
        /* CON DO...WHILE */

        do {
            //esto repetira indefinidamente hasta que introduzcas un numero negativo
            System.out.println("Pon número : ");
            numero = sc.nextInt();
            if (numero > -1) {
                //y esto ira sumando los numeros
                contador++;
            }//fin del if
        } while (numero >= 0);

        //IMPRIMIR
        System.out.println("Se han introducido: " + contador + " números");

    }//fin main
}//fin clase
