/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Primitivas {
    
    public static void rellenarPrimitivas(int[][] tablero) {
        int numeroAleatorios;
        //recorrer e imprimir ARRAY
        for (int i = 0; i < tablero.length; i++) {//filas
            for (int j = 0; j < tablero[i].length;) {//columnas 6
                //generamos numero aleatorio
                numeroAleatorios = generarAleatorio(1, 49);
                if (compruebaNum(tablero, i, numeroAleatorios) == false) {
                    tablero[i][j] = numeroAleatorios;
                    j++;
                }
            }//fin for
        }//fin for
    }//fin metodo

    public static boolean compruebaNum(int[][] array, int i, int aleatorio) {
        boolean comprueba = false;
        for (int j = 0; j < array[i].length; j++) {
            if (array[i][j] == aleatorio) {
                comprueba = true;
                break;
            }
        }
        return comprueba;
    }
    
    public static void recorrerArray(int [][]array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
            System.out.println();
            }
    }
    
    public static int generarAleatorio(int min, int max){
        int numero;
        numero= (int) (Math.random()*max+min);
        return numero;
    }
    
    public static void comprobarAcierto(int[][]array, int[]resultado){
        int i = 0;
        int acierto =0;
        int apuesta0=0;
        int apuesta1=0;
        int apuesta2=0;
        int apuesta3=0;
        int apuesta4=0;
        int apuesta5=0;
        int apuesta6=0;
        while (i < array.length) {
            System.out.println("SORTEO " + i);
            for (int j = 0; j < array[i].length; j++) {
                for (int m = 0; m < resultado.length; m++) {
                   if(array[i][j] == resultado[m]){
                       acierto++;                       
                    }                   
                }
            }
            if (acierto == 0) {
                            apuesta0++;                            
                        }
                   if (acierto == 1) {
                            apuesta1++;                            
                        }
                   if (acierto == 2) {
                            apuesta2++;                            
                        }
                   if (acierto == 3) {
                            apuesta3++;                            
                        }
                   if (acierto == 4) {
                            apuesta4++;                            
                        }
                   if (acierto == 5) {
                            apuesta5++;                            
                        }
                   if (acierto == 6) {
                            apuesta6++;                            
                        }
            System.out.println("aciertos " + acierto);
            acierto=0;
            i++;
            
        }
        System.out.println("RESULTADOS 0 : " + apuesta0);
            System.out.println("RESULTADOS 1 :  " + apuesta1);
            System.out.println("RESULTADOS 2 :  " + apuesta2);
            System.out.println("RESULTADOS 3 :  " + apuesta3);
            System.out.println("RESULTADOS 4 :  " + apuesta4);
            System.out.println("RESULTADOS 5 :  " + apuesta6);
            System.out.println("RESULTADOS 6 :  " + apuesta6);
    }
    
    
    //main
    public static void main(String[] args) {
        int N;
        int M =6;
        
        Primitivas numeros = new Primitivas();
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon numero filas");
        N =sc.nextInt();
        int [][]array1;
        array1= new int [N][M];
        int[]resultado= {1,5,9,17,2,3};
   
        Primitivas.rellenarPrimitivas(array1);
        Primitivas.recorrerArray(array1);
        comprobarAcierto(array1,resultado);
    }
}
