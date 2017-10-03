/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoExamen3;

/**
 *
 * @author Hector Garcia
 */
public class MedioRombo {

    //metodos
    public static void dibujarRombo(int N) {
        for (int i = 1; i <= N; i = i + 2) {
            //Quitara espacios a ambos lados cada salto de linea
            for (int k = N + 1; k >= i; k = k - 2) {
                System.out.print(" ");
            }
            //Pondrá asteriscos a ambos lados cada salto de linea
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //parte inferior del rombo
        for (int i = N; i >= 1; i = i - 2) {
            //Pondrá espacios a ambos lados cada salto de linea
            for (int k = i; k <= N + 2; k = k + 2) {
                System.out.print(" ");
            }
            //Quitara asteriscos a ambos lados cada salto de linea
            for (int j = i - 2; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }//FIN METODO

    public static void dibujarMedioRomboAlto(int N) {
        for (int i = 1; i <= N; i = i + 2) {
            //Quitara espacios a ambos lados cada salto de linea
            for (int k = N ; k >= i; k = k - 2) {
                System.out.print(" ");
            }
            //Pondrá asteriscos a ambos lados cada salto de linea
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();//para saltos de linea
        }
    }//fin metodo

    public static void dibujarMedioRomboBajo(int N) {
        //cada vez que sume 1 espacio, quitara dos asteriscos de cada lado
        for (int espacios = 0, asteriscos = N; asteriscos > 0; espacios++, asteriscos -= 2) {
            //Pondrá espacios a ambos lados cada salto de linea
            for (int i = 0; i < espacios; i++) {
                System.out.print(" ");
            }
            //Quitara asteriscos a ambos lados cada salto de linea
            //NOTA: Lo ponemos distinto de cero porque la ultima pasada no lo cogeria
            for (int j = asteriscos; j !=0; j--) {
                System.out.print("*");
            }
            System.out.println("");//para saltos de linea
        }
    }//fin metodo

}//fin clase
