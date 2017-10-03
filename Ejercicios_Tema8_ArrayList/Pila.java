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
 * @author VESPERTINO
 */
public class Pila {

    //propiedad
    private LinkedList link;
    private int cantidad;

    //CONSTRUCTORES   
    //Constructor con el tamaño máximo de elementos
    public Pila(int capacidadMax) {
        this.cantidad = capacidadMax;
        link = new LinkedList();
    }

    //Constructor con número infinito de elementos
    public Pila() {
        link = new LinkedList();
    }

    //Método booleano estaLlena 
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

    //metodo booleano estaVacia
    public boolean estaVacia() {
        if (cantidad == 0) {
            return true;
        }
        System.out.println("Esta vacia");
        return false;
    }//fin metodo

    //Método push que permite introducir//llenar en la estructura
    public boolean push(Object aux) {//lno podemos paarle un tipo primitivo
        if (this.estaLlena()) {
            System.out.println("Esta llena");
            return false;
        } else {
            //cantidad++;
            //meter el objeto
            link.addFirst(aux);
            return true;
        }
    }//fin metodo

    //Método pop que permite extraer/vaciar en la estructura
    public Object pop() {
        /*
        Object aux;
        if (this.estaVacia()) {//si la list esta vacia no tiene ningun objeto que apuntar
            System.out.println("Esta vacia");
            return null;
        } else {
            //cantidad--;
            //sacar el objeto
            //aux = link.removeFirst();
            aux = link.pollLast();
            return aux;
        }
                */
        return link.pollFirst();
    }//fin metodo

    //Método imprimir muestra todos los elementos de la estructura sin sacarlos.
    public void imprimir() {
        Iterator it = link.iterator();
        while (it.hasNext()) {
            System.out.println("Elemento Pila: " + it.hasNext());
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
