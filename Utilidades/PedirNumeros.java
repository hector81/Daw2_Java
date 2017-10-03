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
public class PedirNumeros {
    //ATRIBUTOS
    private static int numero1;
    private static int numero2;
    private static long valorInicial;
    private static long valorFinal;
    //METODOS
    
    
    
    
    
    //metodo DAME ALEATORIO
    public int dameAleatorio(long valorInicial, long valorFinal){
        int numero;
        numero = (int) (Math.random()*valorFinal+valorInicial);
        return numero;
    }//FIN METODO
}
