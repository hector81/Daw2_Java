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
public class Octogono {
    public static void main(String[] args) {
        int n= 3;
        char c= 'p';
        int vueltas = n*2 - 1;
        int nBlancos= n-1;
        int nCaracter = n;
        boolean cambio= false;
        
        for (int i = 0; i < vueltas; i++) {
            for (int j = 0; j < nBlancos; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < nCaracter; j++) {
                System.out.print(c);
            }
            if(cambio == true || nBlancos == 0){
                cambio = true;
                nBlancos++;
                nCaracter -=2;
            }else{
                nBlancos--;
                nCaracter +=2;
            }
            System.out.println("");
        }
        
    }
}
