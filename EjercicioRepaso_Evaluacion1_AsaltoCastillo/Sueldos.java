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
public class Sueldos {
    public static void main(String[] args) {
        int numero = 10;
        int sueldo=0;
        int contador;
        int sueldoM = 0;
        int sueldoMayor = 0;
        
        do{
            for(contador = 1;contador<=numero; contador++){
            System.out.print("Pon sueldo " + contador + " : ");
            Scanner sc = new Scanner(System.in);
            sueldo= sc.nextInt();
            System.out.println("sueldo " + contador + " : " + sueldo);
                if(sueldo<0){System.out.println("SuELDO ERRONEO");
                    sueldo= sc.nextInt();
                    System.out.println("sueldo " + contador + " : " + sueldo);
                }
                
                if(sueldo>1000){
                    sueldoM++;
                }
                if(sueldo>0){
                    
                    if(sueldo>sueldoMayor){
                         sueldoMayor = sueldo;
        }
                }
                
                }
        }while(contador<=10 && sueldo<0);
        System.out.println("Sueldos mayores " + sueldoM);
        System.out.println("Sueldos MAYORCITO " + sueldoMayor);
        
    }
 
}
