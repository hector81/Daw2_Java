/*
Realizar un programa en java que pida al usuario los 3 numeros (x,y, z). Comprobar 
que la suma de x+y+z es igual a 100. Posteriormente llama a un método que recibe 
un array de tamaño 15 y tambien recibe los 3 porcentajes anteriores. Dicho array 
será rellenado con 1, x y 2. Dependendiendo los porcentajes introducidos por el usuario.

Ejemplo
Si x=70 -> Indica 70% de 1
Si y=20 -> Indica 30% de X
si z=10 -> Indica 10% de 2
 */
package Ejercicios_Tema7_Array;

import java.util.Scanner;

/**
 *
 * @author Hector Garcia
 */
public class Quiniela {

    public static void main(String[] args) {
    //atributos 
    int numero1;
    int numero2;
    int numero3;
    char[]arrayQuiniela;
    arrayQuiniela = new char[15];
    
    //pedir daros
    do{
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon numero 1 : " );
        numero1 = sc.nextInt();
        System.out.print("Pon numero 2 : " );
        numero2 = sc.nextInt();
        System.out.print("Pon numero 3 : " );
        numero3 = sc.nextInt();
    }while(UtilidadesArray.comprobarSumaIgual(numero1, numero2, numero3) == false);
    
 
    System.out.println("MI QUINIELA" );
    UtilidadesArray.rellenaQuiniela(arrayQuiniela, numero1, numero2, numero3);
    
    }//fin main
}//fin clase
