/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cronometro;

/**
 *
 * @author VESPERTINO
 */
public class CronometroMetodo {
    private static long inicio;
    private static long timeFinal;
    private static long total;
    
    public static void iniciar(){
        inicio = System.currentTimeMillis(); 
        
    }
    
    public static void parar(){
        timeFinal = System.currentTimeMillis(); 
    }
    
    public static void reiniciar(){
        inicio = 0;
        timeFinal = 0;
    }
    
    public static long total(){
        long aux ;
        aux = (timeFinal - inicio);
        return aux;
    }
}


/*
metodo new
start
        metdo
final
reiniciar
total
*/