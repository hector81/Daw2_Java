/*
Realizar o implementar un programa en java que cree e inicialize en instrucciones separadas
un array de tipo float de tamaño 20. Rellene dicho array con numeros aleatorios entre 0 y 10, 
y calcule y muestre por pantalla posteriormente la nota media
de los elementos del array .
 */
package Ejercicios_Tema7_Array;

/**
 *
 * @author Hector Garcia
 */
public class GenerarArrayFloatAleatorios {

    //metodo
    public void genera20Float() {
        //Declaramos array     
        float[] arrayFloatAleatorio = new float[20];
        float suma = 0;
        float media = 0;
        for (int contador = 0; contador <= arrayFloatAleatorio.length-1; contador++) {
            arrayFloatAleatorio[contador] = (float) (Math.random()*10);
            //acumulamos
            System.out.println("La posicion " + contador + " tiene el numero " + arrayFloatAleatorio[contador]);
            suma = arrayFloatAleatorio[contador] + suma;           
        }
        media = suma / arrayFloatAleatorio.length;
        int tamañoArray=  arrayFloatAleatorio.length;
        System.out.println("El tamaño del array " + tamañoArray);
        System.out.println("La suma es " + suma);
        System.out.println("La media es " + media);
    }//fin metodo

}//fin clase
