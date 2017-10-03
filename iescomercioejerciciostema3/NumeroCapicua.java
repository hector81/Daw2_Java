/*
Pedir un número entre 0 y 9999 mostrando por pantalla si es o no capicúa.
 */
package iescomercioejerciciostema3;
import java.util.Scanner;
   
public class NumeroCapicua {
     //main
    public static void main(String[] args) {
        //declarar variables
        int numero;
        int numeroVuelto;
        int numeroMil;
        int numeroCien;
        int numeroDiez;
        int numeroUno;
        Scanner sc = new Scanner(System.in);
        //pedir datos
        System.out.print("Dime un número: ");
        numero = sc.nextInt();
        //realizar calculos// al ser int solo devolvera el entero no los decimales
        numeroMil = numero/1000;
        numeroCien = (numero - numeroMil*1000)/100;
        numeroDiez = (numero - numeroMil*1000 - numeroCien*100)/10;
        numeroUno = numero - numeroMil*1000 - numeroCien*100 - numeroDiez*10;
        
        //volver numero del reves y comparar //el numero vuelto tiene ambito solo dentro de cada if
        if (numero >= 1000 && numero >= 9999){
            numeroVuelto = numeroUno*1000 + numeroDiez*100 + numeroCien*10 + numeroMil*1;
            System.out.println("El número vuelto es : " + numeroVuelto);
                //if anidado
                if (numero == numeroVuelto){
                System.out.println("El número es capicua");
                }else{
                    System.out.println("El número no es capicua");
                }//cierre if anidado
        } else if(numero >= 100 && numero >= 999){
            numeroVuelto = numeroUno*100 + numeroDiez*10 + numeroCien*1;
                System.out.println("El número vuelto es : " + numeroVuelto);
                    //if anidado
                    if (numero == numeroVuelto){
                    System.out.println("El número es capicua");
                    }else{
                        System.out.println("El número no es capicua");
                    }//cierre if anidado
        } else if(numero >= 10 && numero >= 99){
            numeroVuelto = numeroUno*10 + numeroDiez*1;
                System.out.println("El número vuelto es : " + numeroVuelto);
                    //if anidado
                    if (numero == numeroVuelto){
                    System.out.println("El número es capicua");
                    }else{
                        System.out.println("El número no es capicua");
                    }//cierre if anidado
        } else if(numero >= 0 && numero >= 9){
                numeroVuelto = numero ;
                System.out.println("El número vuelto es : " + numeroVuelto);
                System.out.println("El número es capicua");
        } else {
                System.out.println("El número es superior a 9999 o es un número negativo");
        }//cierre if else
        
    }//fin del main
}//fin de la clase
