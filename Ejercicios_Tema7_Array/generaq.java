/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema7_Array;

/**
 *
 * @author Alumno 10
 */
public class generaq {

    public static void main(String[] args) {
        int m = 10;
        int[] numeros;
        numeros = new int[m];
        boolean aux = false;

        do {
            //generamos los numeros
            for (int i = 0; i <= numeros.length - 1; i++) {
                numeros[i] = (int) Math.floor(Math.random() * (30 - 1 + 1) + 1);
                for (int y = 0; y <= numeros.length - 1; y++) {
                    if (numeros[i] != numeros[y]) {
                        aux = true;
                    } else {
                        aux = false;
                    }
                }
            }
        } while (aux == false);

        //recorro el resultado
        for (int i = 0; i <= numeros.length - 1; i++) {
            System.out.print(numeros[i] + " ");
        }

    }
}
