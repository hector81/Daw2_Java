/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosRepaso_Estructurada;

import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class Reloj_1 {

    // variables de la hora dada
    private int horaDada;
    private int minutoDado;
    private int segundoDado;
    //variables de la hora recibida
    private int hora = 0;
    private int minuto = 0;
    private int segundo = 0;

    public Reloj_1() {
        horaDada = minutoDado = segundoDado = 0;
    }

    public void pedirDatos() {
        // datos una sola vez
        do {
            // Pedir datos
            Scanner sc = new Scanner(System.in);
            System.out.print("Pon la hora: ");
            horaDada = sc.nextInt();
            System.out.print("Pon el minuto: ");
            minutoDado = sc.nextInt();
            System.out.print("Pon el segundo: ");
            segundoDado = sc.nextInt();
            //if para enviar mensaje de eror en caso de que supere 23 horas
            if (horaDada > 23 || horaDada < 0) {
                System.out.println("Error. La hora debe ser mayor o igual de 0 y menor de 23. ");
            }
            if (minutoDado > 59 || minutoDado < 0) {
                System.out.println("Error. El minuto debe ser mayor o igual de 0 y menor de 59. ");
            }
            if (segundoDado > 59 || segundoDado < 0) {
                System.out.println("Error. El segundo debe ser mayor o igual de 0 y menor de 59. ");
            }
        } while ((horaDada > 23 || horaDada < 0) || (minutoDado > 59 || minutoDado < 0)
                || (segundoDado > 59 || segundoDado < 0));
    }

    public void muestraHoraCompleta() {
        System.out.println("La hora dada es " + ponerCeroHora(horaDada) + ":"
                + ponerCeroMinuto(minutoDado)
                + ":" + ponerCeroSegundo(segundoDado));
    }

    public void sumarSegundo() {
        segundoDado = (segundoDado + 1) % 60;
        if (segundoDado == 0) { // Ha pasado a otro minuto
            minutoDado = (minutoDado + 1) % 60;
            if (minutoDado == 0) { // Ha pasado a otra hora
                horaDada = (horaDada + 1) % 24;
            }
        }
        System.out.println("La hora dada es " + ponerCeroHora(horaDada) + ":"
                + ponerCeroMinuto(minutoDado)
                + ":" + ponerCeroSegundo(segundoDado));
    }

    public String ponerCeroHora(int horaDada) {
        if (horaDada < 10) {
            return "0" + horaDada;
        } else {
            return "" + horaDada;
        }
    }//fin metodo

    public String ponerCeroMinuto(int minutoDado) {
        if (minutoDado < 10) {
            return "0" + minutoDado;
        } else {
            return "" + minutoDado;
        }
    }//fin metodo

    private String ponerCeroSegundo(int segundoDado) {
        if (segundoDado < 10) {
            return "0" + segundoDado;
        } else {
            return "" + segundoDado;
        }
    }//fin metodo

}//fin clase

    
    