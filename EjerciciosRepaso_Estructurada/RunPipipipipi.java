/*
Entrada  
El programa recibirá, por la entrada estandard, múltiples casos de prueba. Cada uno consiste en dos números,
el primero indicando el número de días durante los cuales se ha emitido el GTS, y el segundo el número de
emisoras que lo han hecho.  
El último caso de prueba, que no deberá procesarse, tendrá 0 en ambos valores.  
Salida  
Para cada caso de prueba el programa escribirá, en una línea independiente, el tiempo dedicado por las
emisoras a radiar el GTS. El formato será D:HH:MM:SS, donde D indica número de días, HH número de horas,
MM número de minutos  y SS número de segundos totales.   
Como es lógico, HH no deber a ser mayor que 23 y MM y SS no podrán ser mayores de 59. Además deberán
escribirse siempre con dos dígitos. Para el número de días (D), que no será nunca mayor de 1.000, 
no se deben escribir dígitos adicionales.
 */
package EjerciciosRepaso_Estructurada;

import java.util.Scanner;

/**
 *
 * @author Hector Garcia
 */
public class RunPipipipipi {
    //main
    public static void main(String[] args) {
        //Crear objeto
        Pipipipipi objeto = new Pipipipipi();

        //llamar metodos
        objeto.darDatos();
        objeto.resultadoSegundos();
        objeto.realizarCalculos();
    }//fin main
}//fin clase
