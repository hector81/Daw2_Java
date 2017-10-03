/*
1-Realizar un programa que realize los primeros cien números naturales
 */
package Ejercicios_Tema3_Bucles;

public class PrimerosCienNumeros {
    // main
    public static void main(String[] args) {
        // declarar variable
        int contador = 0;
        // bucle while
        while (contador < 100) {
            // mientras el contador sea menos que 100 seguira sumando
            contador++;
            System.out.println(contador);
        }//fin while
    }// fin main
}// fin clase
