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
public class Usaurio {

    public Usaurio() {
    }
    public int introducirNumero(){
        int numero;
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        return numero;
    }
    
}
