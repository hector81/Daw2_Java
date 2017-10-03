/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema9_TryCatch;

import java.util.LinkedList;

/**
 *
 * @author Hector Garcia
 */
public class ControlDeErrores {

    /*
    Crea un método llamado metodo1 que reciba dos números enteros (di-
    videndo y divisor) y retorne el cociente y el resto. Se deberá com-
    probar que el divisor no es cero -> Compruébalo que funciona ha-
    ciendo uso de Junit
    */
    public static int[] metodo1(int dividendo, int divisor) {        
        int resultado[] = new int[2];
        //si el divisor es 0
        if (divisor == 0) {
            return null;
        }
        resultado[0] = dividendo / divisor;
        resultado[1] = dividendo % divisor;
        
        return resultado;
    }
    
    /*
    Crear un método llamado metodo2 que haga uso del try/catch y que
    se una copia del método1 pero sin las condiciones de comprobación.
    */   
    public int[] metodo2(int dividendo, int divisor) {
        //BLOQUE 1 PARA DECLARACION DE VARIABLES
        int resultado[];
        //excepcion metodo1
        try {
            resultado = new int[2];
            resultado[0] = dividendo / divisor;
            resultado[1] = dividendo % divisor;
            return resultado;
        } catch (ArithmeticException ex) {
            return null;

        } catch (ArrayIndexOutOfBoundsException ex) {
            return null;
        } finally {

            System.out.println("Operación ejecutada");
        }

    }

    
    /*
    Crea un método llamada metodo3 que lance y capture una excepción
    de tipo Exception. El método recibirá un entero “indice”, internamente
    rellenará un LinkedList con 100 objetos de tipo Integer aleatorios y
    retornará el objeto que este en la posicion “indice”. La excepción será
    provocada por el alumno cuando indice esté fuera del rango.
    */
    public Integer metodo3(int indice) {
        //bloque1
        int posicion = 0; // iniciamos posicion
        LinkedList lista;
        //excepcion   
        try {
            lista = new LinkedList();//creamos objeto de linkedlist
            //introducimos 100 numeros en el LinkedList
            for (int i = 1; i <= 100; i++) {
                lista.add(Ejercicios_Tema7_Array.UtilidadesArray.generarAleatorios(1, 100));
            }
            posicion = (Integer)lista.get(indice); //asignamos a la posicion el indice indexof casteandolo a objeto
            //devolvemos
            return posicion;            
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("El indice " + indice + " se ha salido de rango");
            System.out.println("Información tecnica");
            System.out.println(ex.getMessage());//sacara la informacion tecnica
            return null;//no devuelve ningun objeto
        } finally {
            System.out.println("Operación ejecutada");
        }
        
    }
    
}//fin clase
