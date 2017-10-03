/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema3_Bucles_For;

/**
 *
 * @author VESPERTINO
 */
public class IfBReak {
//main
    public static void main(String[] args) {
        int i;
        
        for(i =6; i <= 60 ; i +=3){
            System.out.print("" + i + " ");
            if(i == 30)
            break;
            else if(i == 36)
            continue;
        }
        System.out.print("");
    }//fin main
}//fin clase