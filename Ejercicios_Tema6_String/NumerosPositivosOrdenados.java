/*
5- Realizar un método en la clase StringII que reciba un String con números enteros
 positivos + 0 y de una cifra y muestre dichos números en el siguiente orden: el
 primero, el último, el segundo, el penúltimo, el tercero etc. (el String que se recibe 
 debe tener una longitud par comprobar ese hecho).
 1342
 1234
 */
package Ejercicios_Tema6_String;

import java.util.Scanner;

/**
 *
 * @author Hector Garcia
 */
public class NumerosPositivosOrdenados {

    public static void main(String[] args) {
        //aatributos
        String cadena;

        //pedir datos
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("Pon numeros : ");
            cadena = sc.nextLine();
        }while(Utilidades.comprobarDatosPares(cadena)== false);
        
        System.out.println(MetodosString.ordenarNumeros(cadena));
    }//fin main
}//fin clase

