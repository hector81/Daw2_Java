/*
6. Realizar un nuevo método que dado dos Strings con números enteros y positivos, 
retorne un String con una mezcla de la forma: el 1o de A, 1o de B, el 2o de A, el 2o
de B etc. (suponemos que el tamaño de ambos es el mismo, aunque será 
necesario comprobarlo)
EJEMPLO1:
//135
//246
//123456


 */
package Ejercicios_Tema6_String;

import java.util.Scanner;

/**
 *
 * @author Hector Garcia
 */
public class JuntarDosStringsEnOrdenPosicion {
    //main
    public static void main(String[] args) {
    //ATRIBUTOS
    String primerString; 
    String segundoString;  
    // pedir datos 
    do{
    Scanner sc = new Scanner(System.in);
    System.out.print("Pon primer String : ");
    primerString = sc.nextLine();
    System.out.print("Pon segundo String : ");
    segundoString = sc.nextLine();
    }while(Utilidades.mismoTamano(primerString,segundoString) == false
            //|| Utilidades.comprobarDosDatosPositivoString(primerString,segundoString) == false
            );

    System.out.println("Resultado 1: " + MetodosString.juntarStrings(primerString,segundoString));
    System.out.println("Resultado 2: " 
            + MetodosString.JuntarDosStringsEnOrdenPosicion1(primerString,segundoString));


    

    
   
    }//fin main
}//fin clase





