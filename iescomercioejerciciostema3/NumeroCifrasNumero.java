/*
Pedir un número entre 0 y 99999 mostrando por pantalla cuantas
cifras tiene.
 */
package iescomercioejerciciostema3;

import java.util.Scanner;

public class NumeroCifrasNumero {
      //main
    public static void main(String[] args) {  
        // Declaracion de variables
		int numero;
		Scanner sc = new Scanner(System.in);
	//Pedir datos
		System.out.print("Pon el número: ");
		numero = sc.nextInt();	
                
        //calculamos
                 if(numero <= 99999 && numero > 10000){
                    System.out.println("El número tiene 5 cifras");                
                }else if(numero<10000 && numero>999){
                    System.out.println("El número tiene 4 cifras");
                }else if(numero<1000 && numero>99){
                    System.out.println("El número tiene 3 cifras");
                }else if(numero<100 && numero>9){
                    System.out.println("El número tiene 2 cifras");
                }else if(numero<10 && numero >= 0){
                    System.out.println("El número tiene 1 cifra");
                }else {
                    System.out.println("El número es mayor de 99999 o es negativo");
                }

    }//fin del main
}//fin de la clase
