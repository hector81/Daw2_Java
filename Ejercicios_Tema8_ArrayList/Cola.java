/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema8_ArrayList;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Hector Garcia
 */
public class Cola {

    //propiedad, creamos objeto de LinkedList
    private LinkedList link;
    private int cantidad;//por defecto sera cero

    //CONSTRUCTORES   
    //Constructor con el tamaño máximo de elementos
    public Cola(int capacidadMax) {
        this.cantidad = capacidadMax;
        link = new LinkedList();
    }

    //Constructor con número infinito de elementos
    public Cola() {
        link = new LinkedList();
    }

    //Métodos estaLlena 
    public boolean estaLlena() {
        boolean check;
        if (link.size() == cantidad) {
            check = true;
        }else{
            //System.out.println("Esta llena");
            check = false;
        }
        return check;
    }//fin metodo

    //metodo estaVacia
    public boolean estaVacia() {
        if (cantidad == 0) {
            return true;
        }
        //System.out.println("Esta vacia");
        return false;
    }//fin metodo

    //Método push que permite introducir//llenar en la estructura
    public boolean push(Object aux) {
        if (this.estaLlena()) {//llamamos al metodo estaLlena para compribar si esta llena
            System.out.println("Esta llena");
            return false;
        } else {
            //cantidad++;
            //meter el objeto
            link.addLast(aux);
            return true;
        }
    }//fin metodo

    //Método pop que permite extraer/vaciar en la estructura
    public Object pop() {
        /*
        Object aux;
        if (this.estaVacia()) {//llamamos al metodo estaVacia para compribar si esta vacia
            System.out.println("Esta vacia");
            return null;
        } else {
            cantidad--;
            //sacar el objeto
            aux = link.removeLast();
            return aux;
        }
        */
        return link.pollLast();
    }//fin metodo

    //Método imprimir muestra todos los elementos de la estructura sin sacarlos.
    public void imprimir() {
        Iterator it = link.iterator();
        while (it.hasNext()) {
            System.out.println("Elemento Cola: " + it.hasNext());
        }
    }//fin metodo

    //Método cima retorna el elemento próximo en salir pero sin sacarlo de la estructura.
    public Object cima() {
        //return link.getFirst();    //no devuelve null no vale
        return link.peekFirst();
    }

    //Método size retorna el número de elementos que hay en la estructura correspondiente
    public int size() {
        return link.size();
    }//fin metodo

}//FIN Clase
