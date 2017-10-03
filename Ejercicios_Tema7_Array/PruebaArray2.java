/*
Dado el método de ordenación que usa CalculaMax y dado el método sort de la clase Arrays.
Realizar un programa que rellene un vector de tamaño 10.000 (llamado v1) con numeros
entre [0,50.000], realice una copia de este (vector v2) y calcule y muestre por pantalla 
el tiempo que tarda vuestro método de ordenación y método short en realizar la ordenación
 */
package Ejercicios_Tema7_Array;

import java.util.Arrays;

/**
 *
 * @author VESPERTINO
 */
public class PruebaArray2 {
    public static void main(String[] args) {
        int arrayPrueba[]; // declaracion        
        arrayPrueba = new int[10000]; // Inicializacion
        long t1, t2, t3, t4;
        int key = 99;
     
        //rellenar
        UtilidadesArray.rellenaArrayConAleatoriosInt(arrayPrueba,0,25000);
        
        //iniciamos cronometro
        Cronometro.CronometroMetodo.iniciar();
        int [] destinationArray1 = Arrays.copyOf(arrayPrueba, 25000);//copiamos
        UtilidadesArray.ordenarVectorANGEL(destinationArray1);       
        //parar cronometro
        Cronometro.CronometroMetodo.parar();
        System.out.println("");
        System.out.println("Tiempo metodo nuestro : " + (Cronometro.CronometroMetodo.total()));
          
        
        
        //reiniciar cronometro
        Cronometro.CronometroMetodo.reiniciar();
        
        
        //iniciamos cronometro
        Cronometro.CronometroMetodo.iniciar();     
        int [] destinationArray2 = Arrays.copyOf(arrayPrueba, 25000);//copiamos
        UtilidadesArray.ordenarVectorSort(arrayPrueba);
        //parar cronometro
        Cronometro.CronometroMetodo.parar();
        System.out.println(""); 
        System.out.println("Tiempo metodo sort : " + Cronometro.CronometroMetodo.total()); 
        
        //reiniciar cronometro
        Cronometro.CronometroMetodo.reiniciar();
        
        
        //iniciamos cronometro
        Cronometro.CronometroMetodo.iniciar();
        System.out.println(Arrays.binarySearch(destinationArray1, key));
        //parar cronometro
        Cronometro.CronometroMetodo.parar();
        System.out.println("busqueda : " + Cronometro.CronometroMetodo.total()); 
        
        
        
        
        
        
    }
}


/*

QUINIELA

RELLENAR ARRAY CON 1,2,X 
15 POSICIONES

GUARDAR LOS PORCENTAJES
70 POR CIENTO EN CASA---1
20 POR CIENTO EMPATE --X
10 POR CIENTO FUERA DE CASA --2

GENERAMOS NUMEROS ALEATORIOS DEL  1 AL 100 . RELLENAMOS EN FUNCION DEL NUMERO ALEATORIO
HASTA 70 POR CIENTO --1
HASTA 90 POR CIENTO --X
HASTA 100 POR CIENTO --2

GENERAMOS UN SOLO ARRAY 1X2
PEDIMOS LOS PORCENTAJES POR NUMERO


*/
