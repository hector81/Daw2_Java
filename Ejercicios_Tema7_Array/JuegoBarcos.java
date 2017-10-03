/*
4. Realizar un programa en C que simule la batalla de los barcos sobre un
tablero de 8x8. Será una partida PC-Usuario. Sólo existirán 10 barcos de
un elemento. El ordenador elegirá de forma aleatoria la posición de los
barcos sin repeticiones. El usuario indicará las coordenadas.
 */
package Ejercicios_Tema7_Array;

/**
 *
 * @author Hector Garcia
 */
public class JuegoBarcos {

    public static void main(String[] args) {
        //declaramos array e iniciamos su tamaañ en 8x8
       
        char[][] tablero;
        tablero = new char[8][8];
        
        char asterisco = '*';
        char hundido = 'H';
        int x = 5;
        int y = 3;
        
        System.out.println("tablero de agua");
        //recorrer e imprimir ARRAY. A significa agua
        UtilidadesArray.rellenarTablero8x8(tablero, 'A');
         
        System.out.println("tablero con barcos");
        //poner asteriscos en posiciones aleatorias, * significa posicion barco
        UtilidadesArray.ponerBarcosAleatorios(tablero, '*');
        
        UtilidadesArray.muestraTabla(tablero);
////        
////        System.out.println("tablero con disparos");
////        //disparar, H significa hundido
////        UtilidadesArray.dispararBarcos(tablero, hundido, x ,y);

    }//fin main
}//fin clase
