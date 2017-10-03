/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.util.Scanner;

/**
 *
 * @author Alumno 10
 */
public class PedirStrings {
    //atributos 
    private static String primerString; 
    private static String segundoString;
    private static String cadena;
    
    //METODOS
    //metodo pedir una cadena
    public static void pedirUnaCadena() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Pon un String : ");
            primerString = sc.nextLine();            
    }//fin metodo
    
    //metodo pedir un dato string
    public static void pedirUnDatoString(String primerString) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Pon un String : ");
            primerString = sc.nextLine();            
    }//fin metodo
    
    //metodo pedir dos datos strings
    public static void pedirDosDatoString() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Pon un String : ");
            primerString = sc.nextLine();  
            System.out.print("Pon un String : ");
            primerString = sc.nextLine();
    }//fin metodo
    
    //comprobar 1 dato positivo
    public static boolean comprobarUnDatoPositivoString() {
        for (int i = 0; i <= cadena.length(); i++) {
            if (cadena.charAt(i) < '0' || cadena.charAt(i) < '9') {
                System.out.println("Error. Número no debe ser negativo . ");
                return false;
            }
        }
        return true;
    }//fin metodo
    
    //comprobar 2 dato positivo
    public static boolean comprobarDosDatosPositivoString() {
        for (int i = 0; i <= cadena.length(); i++) {
            if ((primerString.charAt(i) < '0' || primerString.charAt(i) < '9') 
                    || (segundoString.charAt(i) < '0' || segundoString.charAt(i) < '9')) {
                System.out.println("Error. Número no debe ser negativo . ");
                return false;
            }
        }
        return true;
    }//fin metodo
    
    //comrpueba si las longitudes son o no son iguales
    public boolean mismoTamano(String primerString, String segundoString){
        if(primerString.length() != segundoString.length()){
            System.out.println("LAS LONGITUDES DE LOS DOS STRINGS DEBEN SER IGUALES ");
        }
        return true;
    }
    
    //comprobar que los numeros sean positivos o cero
    public boolean compruebaNumerosEnterosyCero(String str){   
        for (int i = 0; i < primerString.length(); i++) {
                if (primerString.charAt(i) < '0' || primerString.charAt(i) < '9' || segundoString.charAt(i) < '0'||segundoString.charAt(i) < '9') {
                    System.out.println("Error. Número no debe ser negativo . ");
                    return false;
                }
            }
    return true;
    }
}
