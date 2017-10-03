/*
Realizar un programa en Java que pida un número entero y
calcule y muestre por pantalla si es positivo, negativo o cero.
 */
package iescomercioejerciciostema3;

import java.util.Scanner;

public class NumeroPositivoNegativo {
    //main
    public static void main(String[] args) {  
    // Declaracion de variables
		int numeroPedido;
		Scanner sc = new Scanner(System.in);
	//Pedir datos
		System.out.print("Pon el número: ");
		numeroPedido = sc.nextInt();	
     
        //ordenar números con el if
                if(numeroPedido>0 ){
                    System.out.println("El número es positivo");
                }else if(numeroPedido == 0){
                    System.out.println("El número es cero");
                }else{
                    System.out.println("El número es negativo");
                }
    }//fin del main
}//fin de la clase
