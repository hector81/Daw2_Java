/*
 crear las 10 tablas de multiplicar del 1 al 10 con 2 for 
 */
package Ejercicios_Tema3_Bucles;

public class TablasMultiplicarBucles {
 //main
    public static void main(String[] args) {
        //declarar variables
        int numero;
        int multiplicador;
        int multiplicacion;
        
        //for para el primer numero
       for(numero = 1 ; numero <= 10; numero++){
           System.out.println("***********TABLA DEL " + numero );
            //FOR ANIDADO
            for(multiplicador = 1 ; multiplicador <= 10; multiplicador++){
               //calculamos la multiplicacion
               multiplicacion = numero * multiplicador;
               //imprime
               System.out.println(numero + " X " + multiplicador + " : " + multiplicacion ); 
           
           }//fin del for anidado   
       }//fin del for
    }//fin del main
}//fin de la clase

