/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema6.eje2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Usuario {
    Scanner sc = new Scanner(System.in);
  
    public int ponerOpcion(){
        
        int numero;
        System.out.println("Pulsa el numero del menu que quieras ejecutar ");
        numero = sc.nextInt();
        return numero;
    }
}
