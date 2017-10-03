/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoExamen3;



/**
 *
 * @author Alumno 10
 */
import java.util.Scanner;
public class Dibujar {
    //MAIN
    public static void main(String[] args) {
        //atributos o propiedades O OBJETOS
        MedioRombo medioR = new MedioRombo();
        int N;
        Scanner sc;
        sc = new Scanner(System.in);
        //pedir datos
        do {
            System.out.println("Pon el numero de filas que tendra el rombo: ");
            N = sc.nextInt();
            if (N < 2) {
                System.out.println("El numero debe ser mayor de 1. Pon otro. ");
            }   //fin if    
        } while (N < 2);
        System.out.println("DIBUJO ROMBO ");
        medioR.dibujarRombo(N);

        System.out.println("DIBUJO MEDIO ROMBO ALTO ");
        medioR.dibujarMedioRomboAlto(N);
        
        System.out.println("DIBUJO MEDIO ROMBO BAJO ");
        medioR.dibujarMedioRomboBajo(N);
        
    }//fin main
}//fin clase
