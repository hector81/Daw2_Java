/*
1-Realizar un programa que rellene un vector de N números aleatorios entre
X e Y (los tres datos serán introducidos por pantalla). Posteriormente,
una vez rellenado, recorrer el vector para calcular y mostrar por pantalla
el número máximo, mínimo y la media.
 */
package Ejercicios_Tema7_Array;

import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class DarTamñoArrayMedia {

    public static void main(String[] args) {
        int arrayN []; // Inicializacion
        //declaramos numeros   
        int x, y, nAleatorios;
        
        //pedir datos x,y,n 
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("PON NUMERO x : ");
            x = sc.nextInt();
            System.out.print("PON NUMERO y : ");
            y = sc.nextInt();
            System.out.print("PON NUMERO n : ");
            nAleatorios = sc.nextInt();
        }while(UtilidadesArray.comprobar3NumerosNegativos(x, y, nAleatorios) == false);
        
        //PONEMOS tamaño array
        arrayN = new int[nAleatorios];

        //rellenar array
        UtilidadesArray.rellenaArrayConAleatoriosInt(arrayN, x,y);
           
        System.out.println();
        //calcular max
        System.out.println("MAXIMO: " + UtilidadesArray.max(arrayN)); 
        //fin metodo       
        
        //calcular min
        System.out.println("MINIMO:" + UtilidadesArray.min(arrayN)); 
        //fin metodo

        //calcularMedia
        System.out.println("MEDIA: " + UtilidadesArray.calculaMediaDouble(arrayN)); 
    }//fin main
}//fin clase



