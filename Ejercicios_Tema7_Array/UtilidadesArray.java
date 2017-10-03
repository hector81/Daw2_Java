/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema7_Array;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author VESPERTINO
 */
public class UtilidadesArray {

    //comprobar suma
    public static boolean comprobarSumaIgual(int n1, int n2, int n3) {
        int suma = n1 + n2 + n3;
        if (suma != 100) {
            System.out.println("Error, la suma no es igual que 100. ");
            return false;
        }

        return true;
    }//fin metodo

    //Metodo para comprobar que los 3 numeros no son negativos ni ceros
    public static boolean comprobar1NumeroNegativo(int n1) {
        if (n1 < 1) {
            System.out.println("Error, el numero es negativo o cero. ");
            return false;
        }
        return true;
    }//fin metodo

    //Metodo para comprobar que los 3 numeros no son negativos ni ceros
    public static boolean comprobar3NumerosNegativos(int n1, int n2, int n3) {
        if (n1 < 1 || n2 < 1 || n3 < 1) {
            System.out.println("Error, uno de los numeros o los tres son negativos o cero. ");
            return false;
        }
        return true;
    }//fin metodo

    //Metodo para comprobar que los 4 numeros no son negativos ni ceros
    public static boolean comprobar4NumerosNegativos(int n1, int n2, int n3, int n4) {
        if (n1 < 1 || n2 < 1 || n3 < 1 || n4 < 1) {
            System.out.println("Error, uno de los numeros o los cuatro son negativos o cero. ");
            return false;
        }
        return true;
    }//fin metodo

    //Metodo para recorrer un array e imprimirlo
    public static void recorrerArray(int[] array) {
        //recorremos
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //Metodo para recorrer un array e imprimirlo
    public static void recorrerMultiArrayChar(char[][] array) {
        //recorremos
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; i++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();//salto de linea
        }
    }
    
    //Metodo para recorrer un array e imprimirlo
    public static void recorrerMultiArrayInt(int[][] array) {
        //recorremos
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; i++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();//salto de linea
        }
    }

    //Metodo para rellenar un array con numeros aleatorios de tipo float
    public static void rellenaArrayConAleatoriosFloat(float[] datos, int min, int max) {

        for (int i = 0; i < datos.length; i++) {
            datos[i] = (float) Math.floor(Math.random() * (max - min + 1) + min);
        }
    }//fin metodo
    
   
    
    //Metodo para rellenar un array con numeros aleatorios de tipo float
    public static void rellenaArrayConAleatoriosFloatnorepes(int[] datos, int min, int max) {
        int n;
        for (int i = 0; i < datos.length; i++) {
            n = (int) (Math.random() * (max) + min);
                do {
                    i--;
                } while (comprobarRepetidosArray(datos)== true);
                datos[i] = n;

            }
        

        }//fin metodo

    
    public static boolean buscarRepetidos(int[] datos, int numero) {
        boolean r = false;
        for (int k = 0; k <= datos.length; k++) {
            if (datos[k] == numero) {
                r = true;
                break;
            }
        }

        return r;

    }//fin metodo
    
    //Metodo para rellenar un array con numeros aleatorios de tipo int e imprimirlo
    public static void rellenaArrayConAleatoriosInt(int[] datos, int min, int max) {

        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
            System.out.print(datos[i] + " ");
        }

    }//fin metodo
    
    

    //Metodo para rellenar un array con numeros aleatorios de tipo int
    public static int[] rellenaArrayConAleatoriosIntArray(int[] datos, int min, int max) {

        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);

        }
        return datos;
    }//fin metodo

    //Metodo para rellenar un MULTIARRAY con numeros aleatorios de tipo int 
    public static int[][] rellenamMultiArrayConAleatoriosIntArray(int[][] datos, int min, int max,
            int filas, int columnas) {
        //recorremos las filas y las columnas
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                //insertamos en las filas
                datos[i][j] = (int) Math.floor(Math.random() * (max - min + 1) + min);
                System.out.print(datos[i][j] + " ");
            }
            //para salto linea
            System.out.println("");
        }
        return datos;
    }//fin metodo
    
    //Metodo para rellenar un MULTIARRAY con numeros aleatorios de tipo int 
    public static boolean comprobarArrayCuadrado(int[][] datos) {
        boolean aux = false;
        //recorremos las filas y las columnas
        for (int i = 0; i < datos.length-1; i++) {
            for (int j = 0; j < datos.length-1; j++) {
                if(i == j){
                    aux = true;
                } else {
                    aux = false;
                }
            }//fin for
        }//fin for
        return aux;
    }//fin metodo

    //Metodo para generar aleatorios int 
    public static int generarAleatorios(int min, int max) {
        int numeroAleatorio;
        //generamos
        numeroAleatorio = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return numeroAleatorio;
    }//fin metodo

    //Metodo para rellenar un MULTIARRAY con numeros aleatorios de tipo int 
    public static int sacarParesMultiArray(int[][] datos) {
        int pares = 0;
        //recorremos las filas y las columnas
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                //sacamos pares
                if (datos[i][j] % 2 == 0) {
                    pares++;
                }
            }
        }
        return pares;
    }//fin metodo

    //Metodo para rellenar un MULTIARRAY con numeros aleatorios de tipo int 
    public static int sacarImparesMultiArray(int[][] datos) {
        int impares = 0;
        //recorremos las filas y las columnas
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                //sacamos pares
                if (datos[i][j] % 2 != 0) {
                    impares++;
                }
            }
        }
        return impares;
    }//fin metodo

    //Metodo para sumar dos MULTIARRAY 
    public static int[][] sumarDosMultiArray(int[][] array1, int[][] array2, int N) {
        int suma[][] = new int[N][N];
        //recorremos las filas y las columnas
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                suma[i][j] = array1[i][j] + array2[i][j];
            }
        }
        //para imprimir
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma.length; j++) {
                System.out.print(suma[i][j] + " ");
            }
            System.out.println();
        }
        return suma;
    }//fin metodo 

    //Metodo para restar dos MULTIARRAY 
    public static int[][] restarDosMultiArray(int[][] array1, int[][] array2, int N) {
        int resta[][] = new int[N][N];
        //recorremos las filas y las columnas
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                resta[i][j] = array1[i][j] - array2[i][j];
            }
        }
        //para imprimir
        for (int i = 0; i < resta.length; i++) {
            for (int j = 0; j < resta.length; j++) {
                System.out.print(resta[i][j] + " ");
            }
            System.out.println();
        }
        return resta;
    }//fin metodo  

    //Metodo para multiplicar dos MULTIARRAY . CABA SIENDO UN ARREGLO MULTIDIMENSIONAL de 3 dimensiones
     //http://www.vitutor.com/algebra/matrices/producto.html
    public static int[][] multiplicarDosMultiArray(int[][] array1, int[][] array2, int N) {
        int producto[][] = new int[N][N];
        int acumulador[][] = new int[N][N];
        int aux[][] = new int[N][N];       
        //recorremos las filas y las columnas
        for (int y = 0; y < array1.length; y++) {
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1[i].length; j++) {
                    //multiplicamos posciiones
                    aux[i][j] = array1[i][j] * array2[i][j];
                    //acumulamos
                    acumulador[i][j] = aux[y][j] + aux[j][i];
                    producto[i][y] = acumulador[i][y];                   
                }//fin 3º for
                //ponemos el aux a cero para que en la siguiente vuelta este a cero
                aux[i][y] = aux[0][0] ;                
            }//fin 2º for
        }//fin 1º for
        //para imprimir
        for (int i = 0; i < producto.length; i++) {
            for (int j = 0; j < producto[i].length; j++) {
                System.out.print(producto[i][j] + " ");
            }
            System.out.println();
        }
        return producto;
    }//fin metodo

    public static int ponNumeroAleatorio(int datos, int min, int max) {

        return datos = (int) Math.floor(Math.random() * (max - min + 1) + min);

    }//fin metodo

    public static double calculaMedia(float[] nAleatorio) {
        double suma = 0;
        for (int i = 0; i < nAleatorio.length; i++) {
            suma = suma + nAleatorio[i];
        }
        return suma / nAleatorio.length;
    }//fin metodo

    public static double calculaMediaDouble(int[] nAleatorio) {
        double suma = 0;
        for (int i = 0; i < nAleatorio.length; i++) {
            suma = nAleatorio[i] + suma;
        }
        return suma / nAleatorio.length;
    }//fin metodo

    //calcular max
    public static int max(int[] arrayN) {
        //float maximo = Integer.MIN_VALUE;
        //for (int i : arrayN) {
        //    if( i == maximo){
        //        maximo = i;
        //    }
        int maximo = 0;
        for (int i = 0; i < arrayN.length; i++) {
            if (arrayN[i] > maximo) {
                maximo = (int) arrayN[i];
            }
        }
        return maximo;
    }//fin metodo
    //usar maxvalue
//aux = Integer.minValue

    //calcular min
    public static int min(int[] arrayN) {
        //int minimo = Integer.MAX_VALUE;
        //for (int i : arrayN) {
        //    if( i == minimo){
        //        minimo = i;
        //    }

        int minimo = arrayN[0];
        for (int i = 0; i < arrayN.length; i++) {
            if (arrayN[i] == 0) {
                minimo = (int) arrayN[i];
            } else {
                if (arrayN[i] < minimo) {
                    minimo = (int) arrayN[i];
                }
            }
        }

        /* int minimo = 0;          
         for (int i : arrayN) {
         if(arrayN[i] == 0){
         minimo = (int) arrayN[i];
         } else{
         if(arrayN[i]<minimo){
         minimo = (int) arrayN[i];               
         }
         }
         }*/
        return minimo;
    }//fin metodo

    //calcular min
    public static float mediaArrayNumeros(int[] arrayN) {
        float media = 0; //iniciamos media
        int suma = 0; //iniciamos suma
        //recorremos array
        for (int i = 0; i < arrayN.length; i++) {
            suma += arrayN[i];
        }
        media = suma / arrayN.length;
        return media;
    }//fin metodo

    //metodo para comprobar si hay repetidos
    public static boolean comprobarRepetidos(int[] arrayInt) {
        int[] nuevoA = arrayInt;
        boolean hayRepetidos = false;
        int j = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            int numero = arrayInt[i];
            while (j < nuevoA.length && !hayRepetidos) {
                if (j != i && numero == nuevoA[j]) {
                    hayRepetidos = true;
                } else {
                    j++;
                }
            }
        }

        /* for (int i = 0; i < arrayInt.length; i++) {
         for (int j = 0; j < nuevoA.length; j++) {
         if (arrayInt[i] == nuevoA[j]) {
         System.out.println(" REPETIDOS HAY");
         ;                           
         }else {
         System.out.println(" No hay REPETIDOS");     
         ;
         }   
         }        
         }*/
        return hayRepetidos;
    }//fin metodo
    
    //comprueba que la longitud sea multiplo de N
    public static boolean comprobarRango(int N, int min, int max){
        if(N > max || N < min){
                System.out.println("Numero no puede ser menor de" + min + " ni mayor de " + max);
                return false;                     
        }
        return true;
    }//FIN METODO

    //metodo para contar las coincidencias Dos Arrays
    public static int numerosCoincidenciasDosArrays(int[] array1, int[] array2) {
        int contador = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int y = 0; y < array2.length; y++) {
                if (array1[i] == array2[y]) {
                    contador++;
                }
            }
        }
        return (contador);
    }//fin metodo

    //ordenar arrays
    public static void ordenarArrays(int array[]) {
        //METODO BURBUJA
        //Usamos un bucle anidado
        for (int i = 0; i < (array.length - 1); i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    //Intercambiamos valores
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }//fin metodo

    //Comprueba los numeros entre min y max
    public static boolean comprobarNumerosRango(int[] array, int min, int max) {
        boolean aux = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min || array[i] > max) {
                aux = false;
            } else {
                aux = true;
            }

        }
        return aux;
    }//fin metodo

    //metodo para comprobar si hay repetidos
    public static boolean comprobarRepetidosArray(int[] arrayInt) {
        int[] nuevoA = arrayInt;
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < nuevoA.length; j++) {
                if (j != i) {
                    if (arrayInt[i] == nuevoA[j]) {
                        if (arrayInt[i] != arrayInt[i - 1]) {
                            //System.out.println(nuevoA[j] + " ");
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }//fin metodo

    //metodo para rellenar mi primitiva
    public static int[] rellenarPrimitiva() {
        String numerosString;
        int contador1;
        int contador2;
        int num = 0;
        boolean bandera = false;
        int arrayInt[] = new int[6];
        String arrayString[] = new String[6];
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
            System.out.println("array enteros ");

            for (contador2 = 0; contador2 < arrayString.length; contador2++) {
                System.out.println("num " + contador2 + " " + arrayInt[contador2]);
            }
        } while (bandera);
        System.out.println("");
        return arrayInt;
    }//fin metodo

    public static void ordenarVectorMiMetdodo(int[] array) {
        int minimo, maximo, indiceMinimo, n = 0;
        //declaramos longitud array
        int distancia = array.length;
        //creamos nuevo array con la extension del anterior
        int resultado[]; // declaracion        
        resultado = new int[distancia]; // Inicializacion
        //recorre el primer array
        for (int i = 0; i < array.length; i++) {
            //min y max
            minimo = UtilidadesArray.min(array);
            indiceMinimo = UtilidadesArray.minIndice(array);
            //detecta el minimo y comprueba que no este repetido 
            if (array[i] == minimo) {
                //pone la posicion en el nuevo array y suma al indice del nuevo array
                array[i] = minimo;
                resultado[n] = array[i];
                maximo = UtilidadesArray.max(array);
                array[i] = maximo;
                //indiceMinimo= UtilidadesArray.minIndice(array);
                //sumamos posiciones al indice del nuevo array
                n++;
            }
        }
        for (int i : resultado) {
            System.out.print(resultado[i] + " ");
        }
    }//fin metodo

    public static void ordenarVectorANGEL(int[] array) {
        //declaramos longitud array
        int distancia = array.length;
        //creamos nuevo array con la extension del anterior
        int resultado[]; // declaracion        
        resultado = new int[distancia]; // Inicializacion
        //recorre el primer array
        for (int i = 0; i < array.length; i++) {
            //DEVUELVE EL MINIMO DEL ARRAY
            resultado[i] = UtilidadesArray.min(array);
            //TE DEVUELVE EL INDICE MINIMO DEL ARRAY ORIGU¡I
            int indiceMinimo = UtilidadesArray.minIndice(array);
            //MACHACA EL INDICE
            array[indiceMinimo] = Integer.MAX_VALUE;

        }
        for (int i : resultado) {
            System.out.print(resultado[i] + " ");
        }
    }//fin metodo

    //calcular indice minimo 
    public static int minIndice(int[] array) {
        int minimo = array[0];
        int minIndice = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimo) {
                minimo = array[i];
                minIndice = i;
            }
        }

        return minIndice;
    }//fin metodo

    public static int[] ordenarVectorSort(int[] array) {
        //Ordena el array
        Arrays.sort(array);

        //Mostramos el array ya ordenado
        for (int i : array) {
            System.out.print(i + " ");

        }
        return array;
    }//fin metodo
    
    public static int[][] rellenaColumnasConNfilasAleatoriasSinRepeticion(int[][] array, int Nfilas, int Ncolumnas) {
        for(int i = 0 ; i< Nfilas; i++);
        return array;
    }//fin metodo

    public static void rellenaQuiniela(char[] array, int n1, int n2, int n3) {
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = (char)UtilidadesArray.generarAleatorios(0, 100);
            if (array[i] <= n1 && array[i] >= 0) {
                array[i] = '1';
                System.out.println(array[i]);
            } else if (array[i] > n1 && array[i] <= (n2 + n1)) {
                array[i] = 'X';
                System.out.println(" " + array[i]);
            } else if (array[i] > (n2 + n1) && array[i] <= (n2 + n1 + n3)) {
                array[i] = '2';
                System.out.println("  " + array[i]);
            }
        }

    }

    public static void rellenarTablero8x8(char[][] tablero, char dato) {
        //recorrer e imprimir ARRAY. A significa agua
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = dato;
            }
        }
    }//fin metodo

    public static void ponerBarcosAleatorios(char[][] tablero, char dato) {
        int n, m;
        ///poner asteriscos en posiciones aleatorias, * significa posicion barco
        for (int i = 0; i < tablero.length; i++) {
            n = UtilidadesArray.generarAleatorios(1, 7);
            m = UtilidadesArray.generarAleatorios(1, 7);
            if (tablero[n][m]==dato) 
                i--;
            else 
                tablero[n][m] = dato;
        }
       

    }//fin metodo

    public static void dispararBarcos(char[][] tablero, char dato, int x, int y) {
        //disparar, H significa hundido
        for (int i = 0; i < tablero.length - 1; i++) {
            for (int j = 0; j < tablero.length - 1; j++) {
                if (tablero[i][j] == tablero[x][y] && tablero[x][y] == '*') {
                    tablero[i][j] = dato;
                }
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }

    }//fin metodo

    public static void muestraTabla(char[][] tablero) {
         //recorrer e imprimir ARRAY. A significa agua
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void muestraTablaInt(int[][] tablero) {
         //recorrer e imprimir ARRAY. A significa agua
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int[] generarFilaAleatoria(){
        int contador=0;
        int []fila = new int[6];
        for (int i = 0; i < fila.length; i++) {//filas
            fila[i] =UtilidadesArray.generarAleatorios(1, 49);
            if(fila[i] == fila[contador])
            contador++;
            fila[i] =UtilidadesArray.generarAleatorios(1, 49);
        }
        return fila;
    }
    
    public static void rellenarPrimitivas(int[][] tablero) {
        int numeroAleatorios;
        //recorrer e imprimir ARRAY
        for (int i = 0; i < tablero.length; i++) {//filas
            for (int j = 0; j < tablero[i].length;) {//columnas 6
                //generamos numero aleatorio
                numeroAleatorios = UtilidadesArray.generarAleatorios(1, 49);
                if (compruebaNum(tablero, i, numeroAleatorios) != true) {
                    tablero[i][j] = numeroAleatorios;
                    j++;
                }
            }//fin for
        }//fin for
    }//fin metodo

    public static boolean compruebaNum(int[][] array, int i, int aleatorio) {
        boolean comprueba = false;
        for (int j = 0; j < array[i].length; j++) {
            if (array[i][j] == aleatorio) {
                comprueba = true;
                break;
            }
        }
        return comprueba;
    }
    
    public static boolean comprobarRepetidos2Array(int[][] array,int numeroAleatorios) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == numeroAleatorios) {
                    return true;                    
                }//fin if
            }//fin for       
        }//fin for
        return false;
    }//fin metodo
    
    public static int[] rellenoPrimitivaArray(){
        //atributos
        int[]primitiva;
        primitiva = new int[6];
        Scanner sc = new Scanner(System.in);
        int numero;
        int contador=0;
        do{
               
                System.out.print("Introduce numero " + (contador +1) + " : ");
                numero = sc.nextInt();
                primitiva[contador] = numero;

                if(UtilidadesArray.comprobarRango(numero,1,49)== false){
                    System.out.print("Error, los numeros deben ir del 1 al 49 ");
                }else{
                    contador++; 
                }
            }while(contador < 6);
  
        return primitiva;
    }
    
    public static boolean comprobarRepetidosPrimitiva(int[] array) {
        int aux = 0;
        boolean repite = false;
        Arrays.sort(array);
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] ==  array[i + 1]) 
                aux++;
            if (aux > 0){
                repite = true;
            }else{
                repite = false;
            }
        }
        return repite;
    }

    
    public static int[][] rellenarTableroNx8(int[][] tablero, int numeroFilas, int numeroColumnas) {
        //recorrer e imprimir ARRAY. A significa agua
        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                tablero[i][j] = UtilidadesArray.generarAleatorios(1, 49);
            }
        }
        return tablero;
    }//fin metodo
    
    //metodo para rellenar mi primitiva
    public static int[] introducirNumerosPrimitiva() {
        //valores y objetos
        Scanner numero = new Scanner(System.in);
        String arrayString[] = new String[6];
        int arrayInt[] = new int[6];
        int numeros;
        
        System.out.print("Introduce tu numeros de primitiva : ");
        String numerosString = numero.next();            
        arrayString = numerosString.split(",");

        //convertimos los numeros del string a int
        for (int contador1 = 0; contador1 < arrayString.length; contador1++) {
            //pasamos los numeros a int y los metemos en nuevo array int
            numeros = Integer.parseInt(arrayString[contador1]);
            arrayInt[contador1] = numeros;
        }
            
       return arrayInt;
    }//fin metodo
    
    public static void comprobrarAciertosPrimitiva(int[][] resultados, int[] apuesta) {
        int aciertos = 0;
        int n=0;
        //recorro los resultados
        while ( n < resultados.length) {
            System.out.println("\n APUESTA " + (n + 1));
            for (int columnas = 0; columnas < resultados[n].length; columnas++) {
                for (int i = 0; i < apuesta.length; i++) {
                    if (resultados[n][columnas] == apuesta[i]) {
                        aciertos++;
                       
                    }          
                }//fin for               
            }//fin for     
            System.out.println(" ACIERTOS " + aciertos);
            aciertos =0;
            n++;
        }//fin while
        
    }//fin metodo
    
    public static void numeroAciertosPrimitiva(int[][] resultados, int[] apuesta) {
        int aciertos = 0;
        int aciertos0 = 0;
        int aciertos1 = 0;
        int aciertos2 = 0;
        int aciertos3 = 0;
        int aciertos4 = 0;
        int aciertos5 = 0;
        int aciertos6 = 0;
        int n = 0;
        //recorro los resultados
        while (n < resultados.length) {
            for (int columnas = 0; columnas < resultados[n].length; columnas++) {
                for (int i = 0; i < apuesta.length; i++) {
                    if (resultados[n][columnas] == apuesta[i]) {
                        aciertos++;
                    }
                }//fin for               
            }//fin for  
            if (aciertos == 0) {
                aciertos0++;
            }
            if (aciertos == 1) {
                aciertos1++;
            }
            if (aciertos == 2) {
                aciertos2++;
            }
            if (aciertos == 3) {
                aciertos3++;
            }
            if (aciertos == 4) {
                aciertos4++;
            }
            if (aciertos == 5) {
                aciertos5++;
            }
            if (aciertos == 6) {
                aciertos6++;
            }
            aciertos = 0;//ponemos los aciertos a cero para la siguiente vuelta
            n++;
        }//fin while
        System.out.println("apuesta de 0 aciertos " + aciertos0);
        System.out.println("apuesta de 1 aciertos " + aciertos1);
        System.out.println("apuesta de 2 aciertos " + aciertos2);
        System.out.println("apuesta de 3 aciertos " + aciertos3);
        System.out.println("apuesta de 4 aciertos " + aciertos4);
        System.out.println("apuesta de 5 aciertos " + aciertos5);
        System.out.println("apuesta de 6 aciertos " + aciertos6);
    }//fin metodo

    public static int calculaIndiceMin(int[] aAleatorio) {
        int min = aAleatorio[0];
        if (aAleatorio.length > 1) {
            for (int i = 1; i < aAleatorio.length; i++) {
                if (aAleatorio[i] < min) {
                    min = i;
                }
            }
        }
        return  min;
    }
    
    //comprobar que el numero es negativo o no
    public static boolean comprobarNegativos(int N) {
        if (N < 1) {
            return false;
        } else {
            return true;
        }
    }//FIN METODO

    //generar numeros aleatorios entre dos rangos
    public static int generarNumerosAleatoriosRangos(int min, int max) {
        int numeroAleatorio;
        numeroAleatorio = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return numeroAleatorio;
    }//FIN METODO
    
    //generamos una fila con 3 numeros aleatorios entre distintos rangos
    public static int[] generarFilasEncuestasTresPreguntas(){
        int[]array = new int[3];
        //recorremos las posiciones del array y las rellenamos con nº aleatorios
        for (int i = 0; i < array.length; i++) {
            array[0] = generarNumerosAleatoriosRangos(1,2);
            array[1] = generarNumerosAleatoriosRangos(1,2);
            if(array[1] == 1){//si trabaja
                array[2] = generarNumerosAleatoriosRangos(600,2000);
            } else {
                array[2] = 0;//si no trabaja
            }
        }
        return array;
    }//FIN METODO
    
    //metemos unos arrays en otro
    public static int[][] rellenarArraysEnOtro(int N) {
        int[][] nuevoArray = new int[N][3];
        for (int i = 0; i < nuevoArray.length; i++) {
            nuevoArray[i] = generarFilasEncuestasTresPreguntas(); // metemos los array en otro array
            for (int j = 0; j < nuevoArray[i].length; j++) {
                nuevoArray[i][j] = nuevoArray[i][j];
            }
        }
        return nuevoArray;
    }
}//finn clase
