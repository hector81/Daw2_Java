/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VeranoTraduccion;

import java.util.HashMap;

/**
 *
 * @author user
 */
public class ListaPalabras {
    private HashMap<Integer, Palabra> lista;
    private int index;

    public ListaPalabras(HashMap<Integer, Palabra> lista) {
        this.lista = lista;
        this.index = 0;
    }

    
    public void añadirPalabra(Palabra palabra){
        index++;
        lista.put(index, palabra);
    }
    
    public Palabra mostrarPalabraAleatoria(){
        int numeroAleatorio;
        numeroAleatorio = (int) Math.floor(Math.random() * (lista.size() - 1 + 1) + 1);
        return lista.get(numeroAleatorio);
    }
    
}
