/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author VESPERTINO
 */
public class Utilidades {
    public static int dameAleatorio(int min, int max) {
        int numeroAleatorio;
        numeroAleatorio = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return numeroAleatorio;
    }
}
