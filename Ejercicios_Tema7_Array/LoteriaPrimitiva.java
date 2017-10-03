/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema7_Array;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Hector Garcia
 */
public class LoteriaPrimitiva {

    private static final int numeroBolas = 49;
    private static int numeroSorteos;
    private static boolean[][] sorteosPrimitiva;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce el número de sorteos que quieres:");
        Scanner scInt = new Scanner(System.in);
        numeroSorteos = scInt.nextInt();

        sorteosPrimitiva = new boolean[numeroSorteos][numeroBolas];
        inicializarBoletos();
        realizarSorteos();
        mostrarBoletos();
    }

    private static void inicializarBoletos() {
        for (int i = 0; i < numeroSorteos; i++) { // recorre los sorteos
            for (int k = 0; k < numeroBolas; k++) { // recorre los números del bombo
                sorteosPrimitiva[i][k] = false;
            }
        }
    }

    private static void realizarSorteos() {
        Random generadorNumeros = new Random();
        for (int i = 0; i < numeroSorteos; i++) { // recorre los sorteos
            int bolasSorteadas = 0;
            while (bolasSorteadas < 6) {
                int bolaAfortunada = -1;
                do {
                    bolaAfortunada = generadorNumeros.nextInt(49);
                } while (sorteosPrimitiva[i][bolaAfortunada]);
                sorteosPrimitiva[i][bolaAfortunada] = true;
                bolasSorteadas++;
            }
        }
    }

    private static void mostrarBoletos() {
        for (int i = 0; i < numeroSorteos; i++) { // recorre los sorteos
            for (int k = 0; k < numeroBolas; k++) { // recorre los números del bombo
                if (sorteosPrimitiva[i][k]) {
                    System.out.print(k + 1 + " ");
                }
            }
            System.out.println("");
        }
    }
}


