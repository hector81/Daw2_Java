/*
3-Programa en Java que muestra por pantalla los números de la serie  7,14,21,28,35 … hasta 7000
CON WHILE O DO WHILE
 */
package Ejercicios_Tema3_Bucles;

public class EjercicioMultiplos7 {
    //main
    public static void main(String[] args) {
        //declarar variable
        int inicio = 7; int xFinal=7000 ; int contador =7;
        
        //BUCLE DO WHILE
        do{           
            System.out.printf("numero %d\n", inicio);
            inicio = inicio +contador;
        }while(inicio < (xFinal +contador));
        
        System.out.printf("*******************************************************");
        
        //bucle while
        while(inicio < 7007){
            System.out.printf("numero %d\n", inicio);
            inicio = inicio +contador;
        }
        
        
        
    }//fin main
}//fin clase
