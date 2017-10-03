/*
todos los numeros de las series siguientes :
 6 9 12 ........ 60---con while
 5 50 500 ....... 5000000 -- con do while    

 Luego ,mostrar los resutlado 
6*9*12*
5+50+100
 */
package EjercicioRepaso_Evaluacion1_AsaltoCastillo;

import java.util.Scanner;

/**
 *12.	Realizar un programa en Java que pida un número entero entre 1 y 12
y calcule y muestre por pantalla el mes correspondiente (no es posible utilizar switch)author user
 */
public class PRUEBA {
    public static void main(String[] args) {
        int numero;
        Scanner er = new Scanner(System.in);
        numero=er.nextInt();
        
        for(int contador =0;contador<13;contador++){
            switch(numero){
                case 1:
                    System.out.println("wer");
                    break;
                case 2:
                    System.out.println("3333edd");
                    break;
                default:
                        System.out.println("fffffffffffff");
                    break;
            }
        
        }
        
        
    }
    
}
