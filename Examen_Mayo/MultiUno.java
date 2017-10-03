/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen_Mayo;

/**
 *
 * @author user
 */
public class MultiUno {
    
    public static boolean comprobar(int[][]array){
        boolean comp = false;
        int contador1=0;
        int numero0 =0;
        int numero1=0;
        int suma0 =0;
        int suma1 =0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i!= j ){
                    numero0=array[i][j];
                    suma0 += numero0;
                }
                if(i== j ){
                    numero1=array[i][j];
                    suma1 += numero1;
                }
            }
            
        }
        if(suma0 == 0 && suma1 == array.length){
            comp= true;
        }
        return comp ;
    }
    
    
    public static void main(String[] args) {
        int[][] array= {{1,0,0,0,0},{0,1,0,0,0},{0,0,1,0,0},{0,0,0,1,0},{0,0,0,0,1}};
        System.out.println("es " + comprobar(array));
    }
}
