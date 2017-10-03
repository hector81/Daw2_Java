/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoDavid;

import EjerciciosRepaso_Estructurada.*;

/**
 *
 * @author user
 */
public class Hexagono {
    int espacios;
    int asteriscos;
    //3 2 1 0 1 2 3
    public void primeroN(int espacios){
        for (int i = espacios; i >= 0; i--) {
            System.out.print(i + " ");
            if(i == 0){
                for (int j = 0; j <= espacios; j++) {
                    if(j != 0){
                        System.out.print(j + " ");
                    }
                }
            }
        }
    }
    //4 6 8 10 8 6 4
    public void segundoN(int asteriscos){
        for (int i = 4; i <= asteriscos; i += 2) {
            System.out.print(i + " ");
            if(i == asteriscos){
                for (int j = asteriscos; j >= 4; j -= 2) {
                    if(j != asteriscos){
                        System.out.print(j + " ");
                    }
                }
            }
        }
    }
    
    //3 4 2 6 1 8 0 10 1 8 2 6 3 4
    public void terceroN(int espacios, int asteriscos){
        asteriscos = 4;
        while (espacios >= 0) {
            System.out.print(espacios + " ");
            System.out.print(asteriscos + " ");

            asteriscos = asteriscos + 2;
            espacios--;            
        }
        espacios =espacios+1;
        asteriscos = asteriscos-2 ;
        while (espacios < 3) {
            espacios++;
            asteriscos = asteriscos - 2;
            System.out.print(espacios + " ");
            System.out.print(asteriscos + " ");
        }
            
    }
    
    //2 1 0 1 2 
    public void cuartoN(int espacios){
        for (int i = espacios; i >= 0; i--) {
            System.out.print(i + " ");
            if(i == 0){
                for (int j = 0; j <= espacios; j++) {
                    if(j != 0){
                        System.out.print(j + " ");
                    }
                }
            }
        }
    }
    //3 5 7 5 3
    public void quintoN(int asteriscos){
        for (int i = 3; i <= asteriscos; i += 2) {
            System.out.print(i + " ");
            if(i == asteriscos){
                for (int j = asteriscos; j >= 3; j -= 2) {
                    if(j != asteriscos){
                        System.out.print(j + " ");
                    }
                }
            }
        }
    }
    
    //2 3 1 5 0 7 1 5 2 3
    public void sextoN(int espacios, int asteriscos){
        asteriscos = 3;
        while (espacios >= 0) {
            System.out.print(espacios + " ");
            System.out.print(asteriscos + " ");

            asteriscos = asteriscos + 2;
            espacios--;            
        }
        espacios =espacios+1;
        asteriscos = asteriscos-2 ;
        while (espacios < 3) {
            espacios++;
            asteriscos = asteriscos - 2;
            System.out.print(espacios + " ");
            System.out.print(asteriscos + " ");
        }
            
    }
    
    public void septimoN(int N){
        asteriscos = N+1;
        while (espacios >= 0) {
            System.out.print(" ");
            System.out.print("*");
            System.out.println("");
            asteriscos = asteriscos + 2;
            espacios--;            
        }
        espacios =espacios+1;
        asteriscos = asteriscos-2 ;
        while (espacios < 3) {
            espacios++;
            asteriscos = asteriscos - 2;
            System.out.print(" ");
            System.out.print("*");
            System.out.println("");
        }
            
    }
    
    //main
    public static void main(String[] args) {
        Hexagono hex = new Hexagono();
        hex.primeroN(3);
        System.out.println();
        hex.segundoN(10);
        System.out.println();
        hex.terceroN(3,10);
        System.out.println();
        hex.cuartoN(2);
        System.out.println();
        hex.quintoN(7);
        System.out.println();
        hex.sextoN(2,7);
        System.out.println();
        hex.septimoN(3);
    }
}
