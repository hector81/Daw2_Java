/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen_Mayo;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Hexagono {

    public static void muestrHexagono(int tamano, String relleno) {
        if (tamano % 2 == 0) {
            tamano++;
        }
        int espacios = tamano;
        int fondo = tamano;

        for (int i = 0; i < tamano; i++) {//Parte de arriba
            for (int j = 0; j < espacios; j++) {//espacios
                System.out.print(" ");
            }
            for (int j = 0; j < fondo; j++) {
                System.out.print(relleno);
            }
            System.out.println("");
            if (i < tamano - 1) {
                espacios--;
                fondo += 2;
            } else {
                espacios++;
                fondo -= 2;
            }
        }
        for (int i = 1; i < tamano; i++) {//Parte de abajo
            for (int j = 0; j < espacios; j++) {//espacios
                System.out.print(" ");
            }
            for (int j = 0; j < fondo; j++) {
                System.out.print(relleno);
            }
            System.out.println("");
            espacios++;
            fondo -= 2;
        }
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamano;
        String caracter;
        System.out.println("Pasame el tamaño del hexagono que quieres: ");
        tamano = sc.nextInt();
        System.out.println("Pasame el caracter del relleno: ");
        sc.nextLine();
        caracter = sc.nextLine();
 
        muestrHexagono(tamano, caracter);
    }

}
