/*
1 3 5 3 1

 */
package EjerciciosRepaso_Estructurada;

import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class RunRombo {
    //atributos

    private int numero;

    //metodo pedir datos
    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);
        do {
            //pedir datos  
            System.out.println("Pon numero impar");
            numero = sc.nextInt();
            //limitamos 
            if (numero%2 == 0) {
                System.out.println("Numero no valido");
            }//fin if
        } while (numero%2 == 0);
    }//fin metodo

    public void hacerNumeros() {
        for (int x = 0; x <= numero; x =+2) {
            // for anidado para columnas
            for (int y = 0; y < numero; y++) {
                System.out.print("*");
            } 
            System.out.println("*");
           
        } // fin del for
    }//fin metodo

    public static void main(String[] args) {
        RunRombo romo = new RunRombo();

        romo.pedirDatos();
        romo.hacerNumeros();
    }//fin main
}//fin clase
