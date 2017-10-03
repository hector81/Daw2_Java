/*
13.Realiza una comprobación del rendimiento de las clases StringBuffer y 
StringBuilder para un programa en Java que concatene (método append) en una 
cadena inicialmente vacía un millón de string con la palabra “hola”. Calcula y 
muestra por pantalla cuando tardan ambas clases en realizar esa concatenación. 
NOTA: No es necesario sacar el resultado de la concatenación por pantalla.
y caclular elt tiempo que tarda //usar nanoTime y currentTimeMillis
 */
package Ejercicios_Tema6_String;

/**
 *
 * @author Hector Garcia
 */
public class ComprobacionRendimiento {

    public static void main(String[] args) {
        String cadena = "hola";
        MetodosString.appendMillonHola(cadena);
    }//fin main
}//fin clase
