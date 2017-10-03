/*
5. Realizar un programa que genera N sorteos de la primitiva y los guarda
en una matriz. Posteriormente lee por pantalla la combinación ganadora y
presenta por pantalla en numero combinaciones que han obtenido 3,4,5 y 6
aciertos.
 */
package Ejercicios_Tema7_Array;

import java.util.Scanner;

/**
 *
 * @author Hector Garcia
 */
public class SorteoPrimitiva {
    public static void main(String[] args) {
        //variables
        int N;
        int columnas = 6;
        
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Pon el numero N (filas): ");
            N = sc.nextInt(); 
        }while(UtilidadesArray.comprobar1NumeroNegativo(N) == false);
        
        //iniciar array
        int[ ][ ] primitivasAleatorias = new int[N][columnas];
        int[ ] loteria = new int[6];
        //rellenamos N primitivas de forma aleatoria
        UtilidadesArray.rellenarPrimitivas(primitivasAleatorias);
        //mostramos las tablas
        UtilidadesArray.muestraTablaInt(primitivasAleatorias);
        
        //introducimos nuestro numero de loteria. 
        System.out.println("Introduce tu numeros de primitiva : ");   
        do{ 
            loteria = UtilidadesArray.rellenoPrimitivaArray();
            System.out.println("MIS NUMEROS : "); 
            UtilidadesArray.recorrerArray(loteria);
            if(UtilidadesArray.comprobarRepetidosPrimitiva(loteria) == true){
                System.out.println("Hay numeros repetidos, vuelve a rellenar ");
            }
        }while(UtilidadesArray.comprobarRepetidosPrimitiva(loteria) == true);

        System.out.println();//salto de linea
        //Buscamos los aciertos por sorteo    
        UtilidadesArray.comprobrarAciertosPrimitiva(primitivasAleatorias,loteria);
        
        UtilidadesArray.numeroAciertosPrimitiva(primitivasAleatorias,loteria);
    }
}


/*

/// rellenaColumnasConNfilasAleatoriasSinRepeticion  hindir flota disparo rellenoPrimitivaArray
UtilidadesArray.comprobarRepetidos(loteria);
*/
