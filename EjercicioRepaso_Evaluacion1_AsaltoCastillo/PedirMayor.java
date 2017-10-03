/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioRepaso_Evaluacion1_AsaltoCastillo;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class PedirMayor {
public static void main(String[] args) {
        //atributo
        int numero;
        int mayor=0;
        //pedir numeros
        do{
            System.out.println("numero ");
            Scanner num=new Scanner(System.in);
            numero = num.nextInt();
              
                
        }while(numero !=0);
        
       
            if( mayor>numero)
                mayor=numero;
                    System.out.println(mayor);
          
        
        
        
    }
}
