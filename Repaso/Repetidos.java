/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso;

/**
 *
 * @author user
 */
public class Repetidos {

    public static void main(String[] args) {
        boolean n = false;
        int numero1 = 0;
        int numero2 = 0;
        int h = 0;
        int[] array1 = {1, 5, 8, 9, 886};
        int[] array2 = {188, 6, 8, 9, 79, 76};
        for (int i = 0; i < array1.length; i++) {
            numero1 = array1[i];
            for (int j = 0; j < array2.length; j++) {
                numero2 = array2[j];
                if (array1[i] == array2[2]) {
                    n = true;
                    
                }
                if(numero1 == numero2){
                    h++;
                }
            }
            
        }
        System.out.println(" rep " + n);
        System.out.println(" rep1 " + h);
    }
}
