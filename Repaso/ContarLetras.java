/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso;

import java.util.StringTokenizer;

/**
 *
 * @author user
 */
public class ContarLetras {

    public static void contarFrases(String cadena) {
        String espacio = " ";
        String acumuladorPalbras = "";
        int sumaVocales = 0;
        int sumaConsonantes = 0;
        int sumaNumeros = 0;
        int sumaSimbolos = 0;
        int sumaPalabras = 0;
        StringTokenizer st = new StringTokenizer(cadena, ".");
        System.out.println("frases " + st.countTokens());
        while (st.hasMoreTokens()) {
            acumuladorPalbras += st.nextToken(espacio);
            sumaPalabras = acumuladorPalbras.length();
            
            for (int i = 0; i < acumuladorPalbras.length(); i++) {
                if (Character.isLetter(acumuladorPalbras.charAt(i))) {
                    if (acumuladorPalbras.charAt(i) == 'a' || acumuladorPalbras.charAt(i) == 'e'
                            || acumuladorPalbras.charAt(i) == 'i' || acumuladorPalbras.charAt(i) == 'o'
                            || acumuladorPalbras.charAt(i) == 'u') {
                        sumaVocales++;
                    }
                } else {
                    sumaConsonantes++;
                }

                if (!Character.isLetter(acumuladorPalbras.charAt(i))) {
                    if (acumuladorPalbras.charAt(i) == '8' || acumuladorPalbras.charAt(i) == '9'
                            || acumuladorPalbras.charAt(i) == '7'
                            || acumuladorPalbras.charAt(i) == '6'
                            || acumuladorPalbras.charAt(i) == '5'
                            || acumuladorPalbras.charAt(i) == '4'
                            || acumuladorPalbras.charAt(i) == '3'
                            || acumuladorPalbras.charAt(i) == '2'
                            || acumuladorPalbras.charAt(i) == '1'
                            || acumuladorPalbras.charAt(i) == '0') {
                        sumaNumeros++;
                    } else {
                        sumaSimbolos++;
                    }
                }
            }
           
        }
        System.out.println("numero letras " + sumaPalabras);
        System.out.println("numero sumaVocales " + sumaVocales);
            System.out.println("numero sumaConsonantes " + sumaConsonantes);
            System.out.println("numero sumaNumeros " + sumaNumeros);
            System.out.println("numero sumaSimbolos " + sumaSimbolos);
    }

    public static void main(String[] args) {
        String cadena = "gola esto es. una frase";
        ContarLetras cc = new ContarLetras();
        contarFrases(cadena);

    }
}
