/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack_MVC_Modelo;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Baraja {
    //atributo
    private ArrayList<Carta> baraja;
    //constructor

    public Baraja() {
        baraja = new ArrayList();
        barajar(); //esto es para que inicialize
    }///fin constructor

    
    //metodo barajar para rellenar baraja
    public void barajar() {
        //rellenamos baraja
        char diamantes = '\u2666';//caracter unicode
        char picas = '\u2660';//caracter unicode
        char corazones = '\u2665';//caracter unicode
        char treboles = '\u2663';//caracter unicode
        char[] palos = {diamantes, picas, corazones, treboles};
        baraja = new ArrayList<Carta>();
        for (char palo : palos) {//recorremos por palos
            for (int i = 1; i <= 13; i++) {
                baraja.add(new Carta( i,palo+"" ));
            }
        }
    }
    
    
    
    //metodo para dar carta
    public Carta darCarta() {
        if(baraja == null){
            new Baraja();// si no hay baraja la creamos
        }
        int numeroAleatorio = (int) (Math.random() * 52);
        Carta carta = baraja.get(numeroAleatorio);//me da una carta aleatoria
        baraja.remove(carta);//quitamos las cartas de la baraja original  
        return carta;
    }
    
}
