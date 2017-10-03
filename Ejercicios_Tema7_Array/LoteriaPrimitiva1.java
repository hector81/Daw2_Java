package Ejercicios_Tema7_Array;

import java.util.Scanner;
import java.util.Random;

public class LoteriaPrimitiva1 {

    private static final int NUMERO_BOLAS = 49;
    private static int numeroSorteos;
    private static boolean[][] sorteosPrimitiva;
    private static boolean[] miBoletoPrimitiva;

    public static void main(String[] args) {
        System.out.println("Introduce el número de sorteos que quieres:");
        Scanner scInt = new Scanner(System.in);
        numeroSorteos = scInt.nextInt();

        sorteosPrimitiva = new boolean[numeroSorteos][NUMERO_BOLAS];
        inicializarBoletos();
        realizarSorteos();
        mostrarBoletos();

        System.out.println("Introduce los números de tu primitiva:");
        miBoletoPrimitiva = new boolean[NUMERO_BOLAS];
        inicializarMiBoleto();

        int misNumerosApostados = 0;
        int miNumero;

        do {
            System.out.println("Introduce un número válido del 1 al " + NUMERO_BOLAS + "\n"
                    + "Introduce el " + (misNumerosApostados + 1) + " número");
            miNumero = scInt.nextInt();
            if (miNumero > 0 && miNumero <= NUMERO_BOLAS && miBoletoPrimitiva[miNumero - 1] == false) {
                miBoletoPrimitiva[miNumero - 1] = true;
                misNumerosApostados++;
            }
        } while (misNumerosApostados <= 5);

        comprobarPremios();
    }

    private static void inicializarMiBoleto() {
        for (int i = 0; i < NUMERO_BOLAS; i++) { // recorre los números del bombo
            miBoletoPrimitiva[i] = false;
        }
    }

    private static void inicializarBoletos() {
        for (int i = 0; i < numeroSorteos; i++) { // recorre los sorteos
            for (int k = 0; k < NUMERO_BOLAS; k++) { // recorre los números del bombo
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
                    bolaAfortunada = generadorNumeros.nextInt(NUMERO_BOLAS);
                } while (sorteosPrimitiva[i][bolaAfortunada]);
                sorteosPrimitiva[i][bolaAfortunada] = true;
                bolasSorteadas++;
            }
        }
    }

    private static void mostrarBoletos() {
        for (int i = 0; i < numeroSorteos; i++) { // recorre los sorteos
            for (int k = 0; k < NUMERO_BOLAS; k++) { // recorre los números del bombo
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
            for (int k = 0; k < NUMERO_BOLAS; k++) { // recorre los números del bombo
                if (sorteosPrimitiva[i][k] && miBoletoPrimitiva[k]) {
                    aciertos++;
                }
            }
            System.out.println("Del sorteo " + (i + 1) + " ha habido " + aciertos + " aciertos");
        }
    }
}
