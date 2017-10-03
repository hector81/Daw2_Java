/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import static ejercicio4.Utilidades.dameAleatorio;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author VESPERTINO
 */
public class Baraja implements Serializable{
    //atributos
    private ArrayList<Carta> listaCartas;
    
    //constructor
    public Baraja() {
        rellenaBaraja(listaCartas);
    }
    
 
    public ArrayList rellenaBaraja(ArrayList<Carta> listaCartas) {
        String diamantes = "diamantes";
        String picas = "picas";
        String treboles = "treboles";
        String corazones = "corazones";
        Carta carta = null;
        for (int j = 1; j <= 4; j++) {
            switch (j) {
                case 1:
                    carta.setPalo(diamantes);
                    break;
                case 2:
                    carta.setPalo(picas);
                    break;
                case 3:
                    carta.setPalo(treboles);
                    break;
                default:
                    carta.setPalo(corazones);
                    break;
                
            }
            for (int i = 1; i < 13; i++) {
                carta.setNumero(i);
            }
            listaCartas.add(carta);
        }
        return listaCartas;
    }//fin metodo
    
    
    
}
