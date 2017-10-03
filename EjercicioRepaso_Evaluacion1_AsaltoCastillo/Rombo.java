/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioRepaso_Evaluacion1_AsaltoCastillo;

/**
 *
 * @author user
 */
public class Rombo {

    public static void main(String[] args) {
// TODO Auto-generated method stub 
        int x = 2;
        int y = x * 2;
        for (int contador = 0; contador <= x; contador++) {
            for (int espacios = x - 1; espacios >= contador; espacios--) {
                System.out.print(" ");
            }
            for (int asteriscos = 0; asteriscos <= (1 * contador + contador); asteriscos++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int contador = 0; contador <= x - 1; contador++) {
            for (int espacios = 0; espacios <= contador; espacios++) {
                System.out.print(" ");
            }
            for (int asteriscos = contador + 2 + contador; asteriscos <= y; asteriscos++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

}
