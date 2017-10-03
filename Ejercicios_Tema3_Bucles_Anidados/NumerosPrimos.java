package Ejercicios_Tema3_Bucles_Anidados;

import java.util.Scanner;

/*
 5-Realizar un programa que pida un n�mero N y calcule y muestre por pantalla 
 cuantos n�meros de esos N son n�meros primos  
 */
public class NumerosPrimos {
    public static void main(String[] args) {
        // DECLARAMOS ATRIBUTO
        int numero;
        int contador1; //contador para recorrer todos los numeros
        int contador2; //contador para recorrer todos los numeros y divida al primer contador
        // operaci�n
        int numeroPrimo;
        do {
            // pedir numero
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce un n�mero entero: ");
            numero = sc.nextInt();
            if(numero < 1){
                    System.out.print("El n�mero es negativo o cero. ");
            }//fin if
        } while (numero < 1); // fin do while	

       // USAMOS BUCLE FOR PARA RECORRER HASTA EL N�MERO DADO

        for (contador1 = 2; contador1 < numero; contador1++) {   
            //for anidado 
            for(contador2 = 2;contador2 < numero;contador2++){
                //para el resto
                numeroPrimo = numero%contador2;
                // si esa variable es igual a 0 o distinta al contador
                if(numeroPrimo == 0 && contador2 == contador1){
                    // IMPRIMIMOS
                    System.out.print(contador2 + " ");
                }//fin if
            }//fin for anidado
        } // fin for
    }// fin main
}// fin clase
