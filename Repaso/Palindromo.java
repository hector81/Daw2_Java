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
public class Palindromo {
    public static boolean palindromo1(String cadena){
        StringBuilder se= new StringBuilder("");
        for (int i = cadena.length()-1; i >= 0; i--) {
            se.append(cadena.charAt(i));
        }
        String sb = se.toString();
        if(sb.equals(cadena)){ return true;}else{return false;}
        
    }
    
    
    public static void main(String[] args) {
        String palabra= "5oso";
        Palindromo pal = new Palindromo();
        System.out.println(palindromo1(palabra));
    }
}
