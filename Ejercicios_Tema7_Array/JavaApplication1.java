package javaapplication1;

import com.sun.javafx.geom.AreaOp;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* System.out.print("Iniciando");
        // TODO code application logic here
        Conexion con = new Conexion();
        con.Conectar();*/
       
       System.out.println("Introduzca un numero entre 1 y 49");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        primitiva(num);
        
    }
    
    public static void primitiva (int num){
        int tablero[][] = new int[num][6];
         int aleatorio;
        
        for (int i=0; i<tablero.length; i++){
            for (int j=0; j<tablero[i].length; j++){
                aleatorio = random(1, 49);
               
                while (Arrays.asList(tablero[i]).contains(aleatorio)){                    
                    aleatorio = random(1, 49);
                    //System.out.println("Numero generado: "+ aleatorio);
                }
                 tablero[i][j] = aleatorio;
            }          
        }
        imprimirMatriz(tablero);
    }
    
    
    public static void imprimirMatriz ( int matriz[][]){
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                 System.out.print("["+matriz[i][j]+"]");
            } 
            System.out.println();
        }
    }
    
    private static int random (int min, int max){
        int numero = 0;
        Random random = new Random();
        
        numero = random.nextInt(max - min + 1) + min;
        return numero;
    }
    
}
