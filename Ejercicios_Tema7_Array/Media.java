/*
RELLENAR ARRAY DE FLOAT CON ALEATORIOS DE 0 A 10 Y DE TAMAÑO 20. DAR MEDIA
 */
package Ejercicios_Tema7_Array;

/**
 *
 * @author Hector Garcia
 */
public class Media {
    public static void main(String[] args) {
        float nAleatorio[]; // declaracion        
        nAleatorio = new float[20]; // Inicializacion
        double media;
        
        UtilidadesArray.rellenaArrayConAleatoriosFloat (nAleatorio, 0, 10);
        media = UtilidadesArray.calculaMedia(nAleatorio);
        System.out.println("La media es: " + media);
        
        
    }
}
