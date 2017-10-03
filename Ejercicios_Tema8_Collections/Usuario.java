/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema8_Collections;



/**
 *
 * @author VESPERTINO
 */
import java.util.Scanner;
public class Usuario {
    //atributos y objetos
    Scanner sc = new Scanner(System.in);
    
    //metodo pedir opcion o numero de opcion
    public int pedirOpcion(){
        int numero;
        System.out.println("Pulsa el numero del menu que quieras ejecutar ");
        numero = sc.nextInt();
        return numero;
    }//fin metodo
    
}
