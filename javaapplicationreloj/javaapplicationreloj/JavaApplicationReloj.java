/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationreloj.javaapplicationreloj;

import java.util.Scanner;

/**
 *
 * @author Alumno4-Mañana
 */
public class JavaApplicationReloj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Pon la hora: ");
        Scanner sc = new Scanner(System.in);
        int hora = sc.nextInt();
        
        System.out.print("Pon el minuto: ");
        int minuto = sc.nextInt();
        
        System.out.print("Pon el segundo: ");
        int segundo = sc.nextInt();
        
        Reloj miReloj = new Reloj(hora, minuto, segundo);
       
        System.out.println("La hora actual: " + miReloj.getHora());
        miReloj.sumarSegundo();
        System.out.println("La hora después: " + miReloj.getHora());
    }
    
}
