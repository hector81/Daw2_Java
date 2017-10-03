/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioRepaso_Evaluacion1_AsaltoCastillo;

/**
 *
 * @author user
 */
public class Cuadrado {

    public static void main(String[] args) {
        int n = 5;
        System.out.println("cuadrado relleno");
        for (int filas = 1; filas < n+1; filas++) {
            for (int columnas = 1; columnas < n+1; columnas++) {
                System.out.print("*");

                if (((filas != 1) && (filas != n - 1)) && ((columnas != 1) && (columnas != n - 1)))             
                    System.out.print("*");
                else
                    System.out.print("");
            }
            System.out.println(" ");
        }
    }
}


