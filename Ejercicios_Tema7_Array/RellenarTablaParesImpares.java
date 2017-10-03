/*
2. Rellenar una tabla de NxM con números aleatorios entre X e Y. Posteriormente
recorrer la tabla sacando la cantidad de números pares e impares
que hay.
 */
package Ejercicios_Tema7_Array;

import java.util.Scanner;

/**
 *
 * @author Hector Garcia
 */
public class RellenarTablaParesImpares {
    //MAIN
    public static void main(String[] args) {
    //declaramos x y N
    int x;
    int y;
    int N;
    int M;
    //pedimos numeros
    do{
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon x: ");
        x = sc.nextInt();
        System.out.print("Pon y: ");
        y = sc.nextInt();
        System.out.print("Pon N (filas): ");
        N = sc.nextInt();
        System.out.print("Pon M (columnas): ");
        M = sc.nextInt();
    }while(UtilidadesArray.comprobar4NumerosNegativos(x, y, N, M) == false);
    
    //Iniciamos array
    int[][]arrayMultiple;
    arrayMultiple = new int[N][M];
    
    //Rellenamos las filas y las columnas con numeros aleatorios
    UtilidadesArray.rellenamMultiArrayConAleatoriosIntArray(arrayMultiple, x, y,N,M);
    
    //Sacamos los pares e imparea sacarParesMultiArray
    System.out.println("NUMEROS PARES: " + UtilidadesArray.sacarParesMultiArray(arrayMultiple) );
    
    //Sacamos los pares e imparea sacarParesMultiArray
    System.out.println("NUMEROS IMPARES: " + UtilidadesArray.sacarImparesMultiArray(arrayMultiple) );
           
    }//fin main
}//fin clase
