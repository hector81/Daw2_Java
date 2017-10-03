/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loteriaprimitiva;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Alumno4-Mañana
 */
public class LoteriaPrimitiva3 {

    private static final int numeroBolas = 49;
    private static int numeroSorteos;
    private static boolean[][] sorteosPrimitiva;
    private static boolean[] miBoletoPrimitiva;

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

        System.out.println("Introduce los números de tu primitiva:");
        miBoletoPrimitiva = new boolean[numeroBolas];
        inicializarMiBoleto();

        int misNumerosApostados = 0;
        int miNumero = -1;
        do {
            System.out.println("Introduce un número válido del 1 al 49\n" +
                    "Introduce el " + (misNumerosApostados+1) + " número");
            miNumero = scInt.nextInt();
            if (miNumero > 0 && miNumero <=49 && miBoletoPrimitiva[miNumero - 1] == false) {
                miBoletoPrimitiva[miNumero - 1] = true;
                misNumerosApostados++;
            }
        } while (misNumerosApostados <= 5);

        comprobarPremios();
    }

    private static void inicializarMiBoleto() {
        for (int i = 0; i < numeroBolas; i++) { // recorre los números del bombo
            miBoletoPrimitiva[i] = false;
        }
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

    private static void comprobarPremios() {
        for (int i = 0; i < numeroSorteos; i++) { // recorre los sorteos
            int aciertos = 0;
            for (int k = 0; k < numeroBolas; k++) { // recorre los números del bombo
                if (sorteosPrimitiva[i][k] && miBoletoPrimitiva[k]) {
                    aciertos ++;                    
                }
            }
            System.out.println("Del sorteo " + (i + 1) + " ha habido " + aciertos + " aciertos");
        }
    }
}
