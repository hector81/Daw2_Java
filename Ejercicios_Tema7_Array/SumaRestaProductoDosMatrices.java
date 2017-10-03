/*
3. Realizar un programa que rellena los componentes de 2 matrices (A y B)
de tamaño N y calcula y muestra por pantalla la suma, resta y producto
de las dos matrices.
 */
package Ejercicios_Tema7_Array;

import java.util.Scanner;

/**
 *
 * @author Hector Garcia
 */
public class SumaRestaProductoDosMatrices {
    public static void main(String[] args) {
        //atributos
        int N;
        int x;
        int y;
        
        //pedir datos
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Pon el tamaño de los arrays N: ");
            N = sc.nextInt();
        }while(UtilidadesArray.comprobar1NumeroNegativo(N) ==false);
        //comprobar que sea cuadrado
        
        //iniciar array
        int[][]arrayA;
        int[][]arrayB;
        arrayA= new int[N][N];
        arrayB= new int[N][N];
   
        //rellenamos array
        System.out.println("ARRAY A: ");
        UtilidadesArray.rellenamMultiArrayConAleatoriosIntArray(arrayA,1,9,N,N);
        System.out.println("ARRAY B: ");
        UtilidadesArray.rellenamMultiArrayConAleatoriosIntArray(arrayB,1,9,N,N);
        
        //Sumamos los arrays
        System.out.println("SUMAR ARRAYS: ");
        UtilidadesArray.sumarDosMultiArray(arrayA, arrayB,N);
        //Restamos los arrays
        System.out.println("RESTAR ARRAYS: ");
        UtilidadesArray.restarDosMultiArray(arrayA, arrayB,N);
        //Multiplicamos los arrays
        System.out.println("MULTIPLICAR ARRAYS: ");
        UtilidadesArray.multiplicarDosMultiArray(arrayA, arrayB,N);
        
        //System.out.println("El multiarray  A es cuadrado " + UtilidadesArray.comprobarArrayCuadrado(arrayA));
        //System.out.println("El multiarray  B es cuadrado " + UtilidadesArray.comprobarArrayCuadrado(arrayB));
        
    }//fin main
}//fin main
