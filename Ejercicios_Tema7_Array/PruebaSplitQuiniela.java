/*
REALIZAR UN PROGRAMA O METODO QUE CALCULE Y GUARDE EN UN ARRAY DE TAMAÑO 6 , 6 NUMEROS ALEATORIOS DE
LA PRIMITIVA (NUMEROS DIFERENTES DEL 1 AL 49). POSTERIORMENTE PIDE 6 NUMEROS AL USUARIO 
DIFERENTES (NO REPETIDOS Y SI NO VOLVER A PEDIRLOS comprobar si hay 1 repetido es otro metodo)
POSTERIORMENTE AVERIGUARA CUNATOS NUMEROS HA ACERTADO EL USUARIO DEL SORTEO. 
 */
package Ejercicios_Tema7_Array;



/**
 *
 * @author Alumno 10
 */
import java.util.Arrays;
import java.util.Scanner;

public class PruebaSplitQuiniela {
    
    //Metodo para generar aleatorios int 
    public static int generarAleatorios(int min, int max) {
        int numeroAleatorio;
        //generamos
        numeroAleatorio = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return numeroAleatorio;
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
    
    ///recorrer array
    public static void muestraTQuiniela(int[] tablero) {
         //recorrer e imprimir ARRAY. A significa agua
        for (int i = 0; i < tablero.length; i++) {
                System.out.print(tablero[i] + " ");
        }
    }

    //metodo para rellenar mi primitiva
    public static int[] rellenarPrimitiva() {
        String numerosString;
        String arrayString[] = new String[6];
        int arrayInt[] = new int[6];
        Scanner numero = new Scanner(System.in);
        System.out.print("Introduce tu numeros de primitiva : ");
        numerosString = numero.next();
        arrayString = numerosString.split(",");        
        for (int i = 0; i < arrayString.length; i++) {
            arrayInt[i] = Integer.parseInt(arrayString[i]);
        }
        return arrayInt;
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
    
    //generar quiniela aleatoria
    public static int[] rellenarPrimitivas(int[] arrayInt) {
        int numeroAleatorios;
        //recorrer e imprimir ARRAY
        for (int i = 0; i < arrayInt.length; i++) {//filas
                //generamos numero aleatorio
                numeroAleatorios = PruebaSplitQuiniela.generarAleatorios(1, 49);
                arrayInt[i] = numeroAleatorios;
                if (comprobarRepeticiones(arrayInt, numeroAleatorios) != true) {
                    arrayInt[i] = numeroAleatorios;
                    i++;
                }
        }//fin for
        return arrayInt;
    }//fin metodo
    
    //metodo para detectar numeros repetidos en la quiniela aleatoria
    public static boolean comprobarRepeticiones(int[] arrayInt ,int numeroAleatorios) {
        boolean comprueba = false;
        for (int j = 0; j < arrayInt.length; j++) {
            if (arrayInt[j] == numeroAleatorios) {
                comprueba = true;
                break;
            }
        }
        return comprueba;
    }//fin metodo
    
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

    //main
    public static void main(String[] args) {
        //atributos
        int arrayInt[];
        arrayInt = new int[6];
        int quiniela[];
        quiniela = new int[6];
        PruebaSplitQuiniela ps = new PruebaSplitQuiniela();
        //PEDIR DATOS
        System.out.println("RELLENAR PRIMITIVA: ");
        do {
            arrayInt = ps.rellenarPrimitiva();           
            if (comprobarNumerosRango(arrayInt, 1, 49) == false) {
                System.out.println("NO PUEDE SER MAS DE 49 Y MENOS DE 1"
                        + " INTRODUCE OTROS. ");
            }
            if (comprobarRepetidosPrimitiva(arrayInt) == true) {
                System.out.println("HAY REPETIDOS" 
                        + " INTRODUCE OTROS. ");
            }
        } while (comprobarNumerosRango(arrayInt, 1, 49) == false
                || comprobarRepetidosPrimitiva(arrayInt) == true);
        
        System.out.println();//SALTO DE LINEA
        
        System.out.println("MI BILLETE DE PRIMITIVA");
        ps.muestraTQuiniela(arrayInt);
        
        System.out.println();//SALTO DE LINEA
        
        System.out.println("MI BILLETE DE PRIMITIVA ORDENADO");
        ordenarArrays(arrayInt);
        
        System.out.println();//SALTO DE LINEA
        
        System.out.println("RESULTADO LOTERIA");
        quiniela = rellenarPrimitivas(quiniela);
        ordenarArrays(quiniela);
        
        System.out.println();//SALTO DE LINEA
        
        System.out.println("RESULTADO APUESTA");
        System.out.print("ACIERTOS: " + numerosCoincidenciasDosArrays(arrayInt,quiniela));
    }//fin main
}//fin clase
