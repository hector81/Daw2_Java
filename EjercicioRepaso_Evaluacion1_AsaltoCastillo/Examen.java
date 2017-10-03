/*
Hacer un scanner que llame a 2 numeros y que luego llame a dos metodos de
la clase PruebaMetodo
 */
package EjercicioRepaso_Evaluacion1_AsaltoCastillo;

import java.util.Scanner;

/**
 *
 * @author Hector Garcia
 */
public class Examen {
    //main
    public static void main(String[] args) {
        //atributos
        int N;
        int M;
        
        //pedir datos N
        do{
            System.out.println("Pon el numero N");
            Scanner sc = new Scanner(System.in);
            N = sc.nextInt();
            if(N < 1){
                System.out.println("No valen numeros negativos ni ceros. Pon otro. ");
            }
        }while(N < 1);
        //pedir datos M
        do{
            System.out.println("Pon el numero M");
            Scanner sc = new Scanner(System.in);
            M = sc.nextInt();
            if(M < 1){
                System.out.println("No valen numeros negativos ni ceros. Pon otro. ");
            }
        }while(M < 1);
        
        //llamar metodos connobjeto instanciado
        PruebaMetodo pm = new PruebaMetodo();
        System.out.println("Primer metodo");
        pm.metodo1(N, M);
        System.out.println("Segundo metodo");
        pm.metodo2(N, M);
        
        
    }//fin main
}//fin clase
