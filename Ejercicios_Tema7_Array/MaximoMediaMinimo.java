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
 * @author Hector Garcia
 */
public class MaximoMediaMinimo {
    //MAIN
    public static void main(String[] args) {
    //declaramos x y N
    int x;
    int y;
    int N;
    
    //pedimos numeros
    do{
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon x: ");
        x = sc.nextInt();
        System.out.print("Pon y: ");
        y = sc.nextInt();
        System.out.print("Pon N: ");
        N = sc.nextInt();

    }while(UtilidadesArray.comprobar3NumerosNegativos(x, y, N) == false);
    
    //inicializamos array con tamaño N
    int[]array ;
    array = new int[N];
    //Rellenamo el array con numeros aleatorios
    UtilidadesArray.rellenaArrayConAleatoriosInt(array,x,y);
    
    //Averiguamos el maximo
    System.out.println("\nEl maximo " + UtilidadesArray.max(array));
    //Averiguamos el minimo
    System.out.println("El minimo " + UtilidadesArray.min(array));
    //Averiguamos la media
    System.out.println("La media " + UtilidadesArray.mediaArrayNumeros(array));
    }//fin main
}//fin clase