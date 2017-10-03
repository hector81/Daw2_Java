/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosRepaso_Estructurada;

import java.util.Scanner;

/**
 *
 * @author Alumno 10
 */
public class Dalton {

    //main
    public static void main(String[] args) {
        //atributos
        int numeroHermanos = 0;
        int alturasPersonas;
        int contador = 1;
        int diferencia = 0;
        int ultimaAltura;
        int anteriorAltura = 0;
        boolean dalton = true;
        //pedir datos
        Scanner sc = new Scanner(System.in);

        do {
            //pedir datos  
            System.out.println("Pon numeros hermanos");
            numeroHermanos = sc.nextInt();
            //limitamos 
            if (numeroHermanos < 3) {
                System.out.println("Numero no valido");
            }//fin if
        } while (numeroHermanos < 3);

        while (contador <= numeroHermanos) {
            alturasPersonas = sc.nextInt();
            if (contador == 1) {
                anteriorAltura = alturasPersonas;
            }
            else if (contador == 2) {
                diferencia = alturasPersonas - anteriorAltura;
                anteriorAltura = alturasPersonas;
            }
            else if (contador > 2) {
//                System.out.println("diferencia: " + diferencia);
//                System.out.println("alturasPersonas: " + alturasPersonas);
//                System.out.println("anteriorAltura: " + anteriorAltura);
                if (diferencia != alturasPersonas - anteriorAltura) {
                    dalton = false;
                }
                anteriorAltura = alturasPersonas;
            }//fin if
            //contador
            contador++;
        }//fin while    
        
        if (dalton) {
            System.out.println("SON DALTON");
        }else {
            System.out.println("no SON DALTON");
        }
    }//fin main
}//fin clase 