/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema6_String;

import java.util.Scanner;
//Utilidades.MetodComptrobar.get()
/**
 *
 * @author VESPERTINO
 */
public class Utilidades {
    //atributos 
    private static String primerString; 
    private static String segundoString;
    private static String cadena;
    private static int numero1;
    private static int numero2;
    
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
    
    //metodos comprobar
    
    //comprobar datos pares
    public static boolean comprobarDatosPares(String cadena) {
        int longitud = cadena.length();
        if (longitud%2 != 0) {
            System.out.println("Error. La longitud debe ser par. ");
            return false;
        }
        return true;
    }//fin metodo
    
    //comprobar datos impares
    public static boolean comprobarDatosImpares() {
        int longitud = cadena.length();
        if (longitud%2 == 0) {
            System.out.println("Error. La longitud debe ser impar. ");
            return false;
        }
        return true;
    }//fin metodo
    
    //comprobar 1 dato positivo
    public static boolean comprobarUnDatoPositivoString(String cadena) {
        for (int i = 0; i <= cadena.length(); i++) {
            if (cadena.charAt(i) < '0' || cadena.charAt(i) < '9') {
                System.out.println("Error. Número no debe ser negativo . ");
                return false;
            }
        }
        return true;
    }//fin metodo
    
    //comprobar 2 dato positivo
    public static boolean comprobarDosDatosPositivoString(String primerString, String segundoString) {
        for (int i = 0; i <= cadena.length(); i++) {
            if ((primerString.charAt(i) < '0' || primerString.charAt(i) > '9') 
                    || (segundoString.charAt(i) < '0' || segundoString.charAt(i) > '9')) {
                System.out.println("Error. Número no debe ser negativo . ");
                return false;
            }
        }
        return true;
    }//fin metodo
    
    //comrpueba si las longitudes son o no son iguales
    public static boolean mismoTamano(String primerString, String segundoString){
        if(primerString.length() != segundoString.length()){
            System.out.println("LAS LONGITUDES DE LOS DOS STRINGS DEBEN SER IGUALES ");
            return false;
        }
        return true;
    }
    
    //comprobar que los numeros sean positivos o cero
    public static boolean compruebaNumerosEnterosyCero(String str){   
        for (int i = 0; i < primerString.length(); i++) {
                if (primerString.charAt(i) < '0' || primerString.charAt(i) < '9' || segundoString.charAt(i) < '0'||segundoString.charAt(i) < '9') {
                    System.out.println("Error. Número no debe ser negativo . ");
                    return false;
                }
            }
    return true;
    }
    
    //comprueba que la longitud sea multiplo de N
    public static boolean compruebaMultiploN(String str, int multiplo){
        if(primerString.length()%multiplo !=0 || segundoString.length()%multiplo !=0){
            System.out.println("El string pasado no es multiplo de " + multiplo);
            return false;
        }
        return false;
    }
    
    //metodo
    public int dameAleatorio(long valorInicial, long valorFinal){
        int numero;
        numero = (int) (Math.random()*valorFinal+valorInicial);
        return numero;
    }//FIN METODO
    
    
    //comprueba que la longitud sea multiplo de N
    public static boolean comprobarRango(int N, int min, int max){
        if(N > max || N < min){
                System.out.println("Numero no puede ser menor de" + min + " ni mayor de " + max);
                return false;                     
        }
        return true;
    }//FIN METODO
    
    
    
}//fin clase


/* import static Ejercicios_Tema6_String.Utilidades.pedirUnaCadena;
if(!mismoTamano(primerString, segundoString) || !compruebaNumerosEnterosyCero(primerString) 
        || !compruebaNumerosEnterosyCero(segundoString) ||
        !compruebaMultiploN(primerString, 3) ) || !compruebaMultiploN(primerString, 3) );

    System.out.println("Las cadenas recibidad no son adecuadas");
return null;*/
///
/////resolver probela
///dar 3 vueltas