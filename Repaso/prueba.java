/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class prueba {
    public static void main(String[] args) {
        StringBuilder yu = new StringBuilder();
        
        String frase = "Esto es una prueba%% .LLamame 12";
        int frases=1;
        int palabras=0;
        int letras=0;
        int consonantes=0;
        int vocales=0;
        int numeros=0;
        int simbolos=0;
        for(int i= 0; i<frase.length(); i++){
            char t = '.';
            if( frase.charAt(i)== t ){
                    frases++;
            }
            if( frase.charAt(i)== 'a' || frase.charAt(i)== 'e' ||frase.charAt(i)== 'i' ||
                    frase.charAt(i)== 'o' ||frase.charAt(i)== 'u'){
                    vocales++;
            }
            int o = Character.getNumericValue(frase.charAt(i));
            if( frase.charAt(i)== o ){
                    numeros++;
            }
        }
        System.out.println("frases " + frases);
        System.out.println("numeros " + numeros);
        
    }
}
