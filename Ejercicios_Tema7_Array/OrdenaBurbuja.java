/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema7_Array;

/**
 *
 * @author user
 */
class OrdenaAlgoritmo {

    public static void ordenar(int[] arreglo) {
        int pasadas = 0;
        int comparaciones = 0;
        for (int i = 0; i < arreglo.length; i++) {
            ++pasadas;
            for (int j = 0; j < arreglo.length - 1; j++) {
                ++comparaciones;
                if (arreglo[j] > arreglo[j + 1]) {
                    intercambiar(arreglo, j, j + 1);
                }
            }
        }
        estadisticas(pasadas, comparaciones);
    }

    public static void ordenarMejorado(int[] arreglo) {
        int pasadas = 0;
        int comparaciones = 0;
        boolean hayCambios = true;
        for (int i = 0; hayCambios; i++) {
            ++pasadas;
            hayCambios = false;
            for (int j = 0; j < arreglo.length - 1; j++) {
                ++comparaciones;
                if (arreglo[j] > arreglo[j + 1]) {
                    intercambiar(arreglo, j, j + 1);
                    hayCambios = true;
                }
            }
        }
        estadisticas(pasadas, comparaciones);
    }

    private static void intercambiar(int[] arreglo, int a, int b) {
        int tmp = arreglo[a];
        arreglo[a] = arreglo[b];
        arreglo[b] = tmp;
    }

    private static void estadisticas(int pasadas, int comparaciones) {
        System.out.println("Pasadas: " + pasadas);
        System.out.println("Comparaciones: " + comparaciones);
    }
}

public class OrdenaBurbuja {

    public static void main(String args[]) {

        int[] valores = {15, 35, 01, 05, 04, 03, 19, 45, 13, 02, 55, 8,
            78, 997, 451, 546, 12, 16, 24, 103, 99, 784,
            4541, 15};

        //OrdenaAlgoritmo.ordenar(valores);
        OrdenaAlgoritmo.ordenarMejorado(valores);
        // Mostrar arreglo.
        for (int i = 0; i < valores.length; i++) {
            System.out.println("valores[" + i + "]: " + valores[i]);
        }

    }
}
