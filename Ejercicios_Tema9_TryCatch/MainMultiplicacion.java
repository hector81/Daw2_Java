package Ejercicios_Tema9_TryCatch;

/**
 *
 * @author Hector Garcia
 */
import java.util.Scanner;

public class MainMultiplicacion {
    public static void main(String[] args) {
        //atributos y objetos
        Multiplicacion multiplo =new Multiplicacion();
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        Scanner sc = new Scanner(System.in);
        //pedir datos
        System.out.println("Pon 4 números a ver que pasa:");
        
        System.out.println("Pon número 1: " );
        numero1 = sc.nextInt();
        multiplo.lanzar(numero1);
        
        System.out.println("Pon número 2: " );
        numero2 = sc.nextInt();
        multiplo.lanzar(numero2);
        
        System.out.println("Pon número 3: " );
        numero3 = sc.nextInt();
        multiplo.lanzar(numero3);
        
        System.out.println("Pon número 4: " );
        numero4 = sc.nextInt();
        multiplo.lanzar(numero4);
    }//fin main 
}//fin clase
