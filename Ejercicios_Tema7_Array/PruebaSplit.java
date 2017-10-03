/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema7_Array;

import java.util.Scanner;

/**
 *
 * @author Alumno 10
 */
public class PruebaSplit {
    
    //metodo para rellenar mi primitiva
    public int[] rellenarPrimitiva() {
        String numerosString;
        int contador1;
        int contador2;
        int num = 0;
        boolean bandera = false; 
        int arrayInt[] = new int[6];
        String arrayString[] = new String[6];
        //comprobar del 1 al 49
          do {
            Scanner numero = new Scanner(System.in);
            System.out.print("Introduce tu numeros de primitiva : ");
            numerosString = numero.next();            
            arrayString = numerosString.split(",");

            //convertimos los numeros del string a int
            //System.out.println("array string ");
            for (contador1 = 0; contador1 < arrayString.length; contador1++) {
                System.out.print(arrayString[contador1] + " ");
                num = Integer.parseInt(arrayString[contador1]);
                //Integer (arrayString[contador1]);//
                if (num >= 1 && num <= 49) {
                    arrayInt[contador1] = num;
                    bandera = false;
                } else {
                    System.out.println("Error. Los numeros deben ser entre 1 y 49");
                    bandera = true;
                }
            }
            //recorremos el array de enteros
            System.out.println("");
            System.out.println("array enteros ");

            for (contador2 = 0; contador2 < arrayString.length; contador2++) {
                System.out.println("num " + contador2 + " " + arrayInt[contador2]);
            }
             }while(bandera);
          System.out.println("");
          return arrayInt;
    }//fin metodo
 public  static void main(String[] args){
        
        String numerosString;
        Scanner numero = new Scanner(System.in);
        numerosString = numero.next();
        int arrayInt[] = new int[6];
        String arrayString[] = new String[6];
        arrayString = numerosString.split(" ");
        
        System.out.println("array string ");
        for (int contador1 = 0; contador1 < arrayString.length ; contador1++) {
            System.out.print( arrayString[contador1] + " ");
            arrayInt[contador1] = new Integer (arrayString[contador1]+"");//Integer.parseInt(strarray[count]);
        }
        System.out.println("");
        System.out.println("array enteros ");
        for (int contador2 : arrayInt) {            
            System.out.print(contador2  + " ");
        }
    }//fin main
}//fin clase