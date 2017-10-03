/*
dado un array de 10000 aleatorios
de 0 a 25000 numeros aleatorios
calcular tiempo con mi metodo
luego con metodo sort

 */
package Ejercicios_Tema7_Array;

import java.util.Arrays;

/**
 *
 * @author VESPERTINO
 */
public class PruebaArray {
    public static void main(String[] args) {
        int arrayPrueba[]; // declaracion        
        arrayPrueba = new int[10]; // Inicializacion
        int[] destinationArray1 = new int[arrayPrueba.length];
        long t1, t2, t3, t4;
        int key = 5;
        
        //rellenar
        UtilidadesArray.rellenaArrayConAleatoriosIntArray(arrayPrueba,0,10);
        System.out.println(Arrays.toString(arrayPrueba)); 
        System.out.println("\n");
        t1 = System.currentTimeMillis();
        System.arraycopy(arrayPrueba, 0, destinationArray1, 0, arrayPrueba.length);
        System.out.println(Arrays.toString(destinationArray1)); 
        Arrays.sort(destinationArray1);    
        System.out.println(Arrays.toString(destinationArray1)); 
//        
//        System.out.println(Arrays.toString(destinationArray1));  
//        
//        t2 = System.currentTimeMillis();      
//        int [] destinationArray2 = Arrays.copyOf(arrayPrueba, 25000);//copiamos
//        UtilidadesArray.ordenarVectorSort(destinationArray2);
//    
//        System.out.println(""); 
//        t3 = System.currentTimeMillis();
        System.out.println(Arrays.binarySearch(destinationArray1, key));
//        
//        
//        t4 = System.currentTimeMillis();
//        System.out.println("Tiempo metodo nuestro : " + (t2 - t1));
//        System.out.println("Tiempo metodo sort : " + (t3 - t2)); 
//        System.out.println("busqueda : " + (t4 - t3)); 
//        
        
        
    }
}


//usar array copy
