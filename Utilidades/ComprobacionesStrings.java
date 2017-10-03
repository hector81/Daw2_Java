/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

/**
 *
 * @author Alumno 10
 */
public class ComprobacionesStrings {
    //atributos 
    private static String primerString; 
    private static String segundoString;
    private static String cadena;
    
    //METODOS
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
    public static boolean comprobarDatosImpares(String cadena) {
        int longitud = cadena.length();
        if (longitud%2 == 0) {
            System.out.println("Error. La longitud debe ser impar. ");
            return false;
        }
        return true;
    }//fin metodo
    
    //comprueba que la longitud sea multiplo de N
    public boolean compruebaMultiploN(String str, int multiplo){
        if(primerString.length()%multiplo !=0 || segundoString.length()%multiplo !=0){
            System.out.println("El string pasado no es multiplo de " + multiplo);
            return false;
        }
        return false;
    }
    
    //comprobar 2 dato positivo
    public static boolean comprobarDosDatosPositivoString(String primerString,String segundoString) {
        for (int i = 0; i <= primerString.length(); i++) {
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
}
