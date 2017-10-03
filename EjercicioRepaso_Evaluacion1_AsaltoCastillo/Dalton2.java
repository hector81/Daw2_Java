/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioRepaso_Evaluacion1_AsaltoCastillo;

import java.util.Scanner;

/**
 *
 * @author Alumno 10
 */
public class Dalton2 {

    //main
    public static void main(String[] args) {
        //atributos
        int numeroHermanos = 0;
        int alturasPersonas;
        int contador = 1;
        int diferencia = 0;
        int ultimaAltura;
        int anteriorAltura = 0;
        boolean dalton;
        //pedir datos
        Scanner sc = new Scanner(System.in);

        do {
            //pedir datos  
            System.out.println("Pon numeros hermanos");
            numeroHermanos = sc.nextInt();
            //limitamos numero hermanos a 8
            if (numeroHermanos < 3 || numeroHermanos > 8) {
                System.out.println("Numero no valido");
            }//fin if
        } while (numeroHermanos < 3 || numeroHermanos > 8);

        while (contador <= numeroHermanos) {
            alturasPersonas = sc.nextInt();
            if (contador == 1) {
                anteriorAltura = alturasPersonas;
            }
            if (contador == 2) {
                diferencia = alturasPersonas - anteriorAltura;
                anteriorAltura = alturasPersonas;
            }
            if (contador > 2) {
                System.out.println("diferencia: " + diferencia);
                System.out.println("alturasPersonas: " + alturasPersonas);
                System.out.println("anteriorAltura: " + anteriorAltura);
                if (diferencia == alturasPersonas - anteriorAltura) {
                    System.out.println("SON DALTON");
                }else if (diferencia != alturasPersonas - anteriorAltura) {
                    System.out.println("no SON DALTON");
                }
                anteriorAltura = alturasPersonas;
            }//fin if
            //contador
            contador++;
        }//fin while           
    }//fin main
}//fin clase 
