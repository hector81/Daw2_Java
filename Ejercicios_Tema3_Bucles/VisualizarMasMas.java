/*
5.	Realizar un programa en Java que visualiza el resultado de la serie 8+10+12+14+....+50
 */
package Ejercicios_Tema3_Bucles;

public class VisualizarMasMas {
    // main

    public static void main(String[] args) {
        // declarar variables
        int contador = 6;// lo pongo en 6 para que empieze en 8
        int sumaTotal = 0;
        // while para que recorra hasta 50
        while (contador < 50) {
            // acumulador
            contador = contador + 2;
            System.out.print(contador + " ");
            // acumulador
            sumaTotal += contador;
        }
        // IMPRIMIR
        System.out.println("resultado: " + sumaTotal);
    }// fin del main
}// fin de la clase
