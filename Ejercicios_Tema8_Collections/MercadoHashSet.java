/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema8_Collections;

/**
 *
 * @author Hector Garcia
 */
import java.util.*;

public class MercadoHashSet {

    public static void main(String args[]) {
// Definir 5 instancias de la Clase Producto 
        Producto pan = new Producto("Pan", 6);
        Producto leche = new Producto("Leche", 2);
        Producto manzanas = new Producto("Manzanas", 5);
        Producto brocoli = new Producto("Brocoli", 2);
        Producto carne = new Producto("Carne", 2);
        Producto res = new Producto("Carne", 3);

// Definir un HashSet 
        HashSet lista = new HashSet();
        lista.add(pan);
        lista.add(leche);
        lista.add(manzanas);
        lista.add(brocoli);
        lista.add(carne);
        lista.add(res);

// Imprimir contenido de HashSet 
// Aunque son insertados 6 elementos, el HashSet solo contiene 5 
// Se debe a que un Set no permite elementos duplicados. 
        System.out.println(" Lista del mercado con " + lista.size()
                + " productos");

// Definir Iterator para extraer e imprimir valores 
        for (Iterator it = lista.iterator(); it.hasNext();) {
            Object objeto = it.next();
            Producto producto = (Producto) objeto;
            System.out.println(producto);
        }

// No es posible eliminar elementos por indice 
// En un HashSet solo se elimina por valor de Objeto 
        lista.remove(manzanas);
        System.out.println(" Lista del mercado con " + lista.size()
                + " productos");
        for (Iterator it2 = lista.iterator(); it2.hasNext();) {
            Producto producto = (Producto) it2.next();
            System.out.println(producto);
        }

// Eliminar todos los valores del ArrayList 
        lista.clear();
        System.out.println(" Lista del mercado con " + lista.size()
                + " productos");
    }
}

