/*
REALIZAR UN PROGRAMA O METODO QUE CALCULE Y GUARDE EN UN ARRAY DE TAMAÑO 6 , 6 NUMEROS ALEATORIOS DE
LA PRIMITIVA (NUMEROS DIFERENTES DEL 1 AL 49). POSTERIORMENTE PIDE 6 NUMEROS AL USUARIO 
DIFERENTES (NO REPETIDOS Y SI NO VOLVER A PEDIRLOS comprobar si hay 1 repetido es otro metodo)
POSTERIORMENTE AVERIGUARA CUNATOS NUMEROS HA ACERTADO EL USUARIO DEL SORTEO. 

 */
package Ejercicios_Tema7_Array;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Primitiva {
     //main
    public static void main(String[] args) {       
//        //rellenar mi primitiva
//        int numero1 ;
//        int numero2 ;
//        int numero3 ;
//        int numero4 ;
//        int numero5 ;
//        int numero6 ;
//        //PARA LOS NUMEROS DE MI PRIMITIVA
//        int arrayInt[]; // declaracion        
//        arrayInt = new int[6]; // Inicializacion
//        //PARA LOS NUMEROS ACERTANTES DE LA PRIMITIVA
//        int arrayNumAleatorio[]; // declaracion        
//        arrayNumAleatorio = new int[6]; // Inicializacion
//        
//        Scanner numero = new Scanner(System.in);
//        System.out.print("Introduce numero 1: ");
//        numero1 = numero.nextInt();
//        arrayInt[0] = numero1;
//        System.out.print("Introduce numero 2: ");
//        numero2 = numero.nextInt(); 
//        arrayInt[1] = numero2;
//        System.out.print("Introduce numero 3: ");
//        numero3 = numero.nextInt(); 
//        arrayInt[2] = numero3;
//        System.out.print("Introduce numero 4: ");
//        numero4 = numero.nextInt(); 
//        arrayInt[3] = numero4;
//        System.out.print("Introduce numero 5: ");
//        numero5 = numero.nextInt(); 
//        arrayInt[4] = numero5;
//        System.out.print("Introduce numero 6: ");
//        numero6 = numero.nextInt();
//        arrayInt[5] = numero6;
        
        //////////////////////////////////////
        String numerosString;
        int contador1;
        int contador2;
        int num = 0;
        boolean bandera = false; 
        int arrayInt[] = new int[6];
        String arrayString[] = new String[6];
        int arrayNumAleatorio[]; // declaracion        
        arrayNumAleatorio = new int[6]; // Inicializacion
        //comprobar del 1 al 49
          do {
            Scanner numero = new Scanner(System.in);
            System.out.print("Introduce tu numeros de primitiva : ");
            numerosString = numero.next();            
            arrayString = numerosString.split(",");

            //convertimos los numeros del string a int
            //System.out.println("array string ");
            for (contador1 = 0; contador1 < arrayString.length; contador1++) {
                System.out.print(arrayString[contador1] + " ");
                num = Integer.parseInt(arrayString[contador1]);
                //Integer (arrayString[contador1]);//
                if (num >= 1 && num <= 49) {
                    arrayInt[contador1] = num;
                    bandera = false;
                } else {
                    System.out.println("Error. Los numeros deben ser entre 1 y 49");
                    bandera = true;
                }
            }
            //recorremos el array de enteros
            System.out.println("");        

             }while(bandera);
          System.out.println("");
        //////////////////////////////////////
        
        //recorrer array
        System.out.println("MI BILLETE DE PRIMITIVA ");
        UtilidadesArray.recorrerArray(arrayInt);
        
        System.out.println(" ");//salto de linea
        //ordenar array
        System.out.println("MI BILLETE DE PRIMITIVA ORDENADO");
        UtilidadesArray.ordenarArrays(arrayInt);
        
        
        System.out.println(" ");//salto de linea
        //metodo para comprobar si hay repetidos en mi primitiva
        System.out.println("¿Hay repetidos en mi primitiva? ");
        UtilidadesArray.comprobarRepetidos(arrayInt);
    
        //metodo para generar los numeros que salen en el sorteo
        System.out.println("NUMEROS DE LA PRIMITIVA ");
        UtilidadesArray.rellenaArrayConAleatoriosInt(arrayNumAleatorio, 1, 49);
        
        System.out.println(" ");//salto de linea
        //metodo para comprobar si hay repetidos en los aleatorios
        System.out.println("¿Hay repetidos en los aleatorios de mi primitiva? ");
        UtilidadesArray.comprobarRepetidos(arrayNumAleatorio);
        
        //metodo para contar los aciertos
        System.out.print("Numero aciertos " + 
                UtilidadesArray.numerosCoincidenciasDosArrays(arrayInt, arrayNumAleatorio));
        
        
        int array[] = new int[]{2,56,49,7,8};
        int array2[] = new int[]{1,2,6,49,58};
        System.out.println("\nresultado " + UtilidadesArray.numerosCoincidenciasDosArrays(array, array2));
        
    }
}
