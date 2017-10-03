/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack_MVC_Modelo;

/**
 *
 * @author VESPERTINO
 */
public class Crupier extends Persona {   
    //atributos
    private int puntos;
    
    //constructor
    public Crupier(int puntos) {
        this.puntos= puntos;
    }
    public int getPuntos() {    
        return puntos;
    }

    //getters and setters
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    //no tiene
    //metodos
    public Carta pedirCarta() {
        Baraja bar = new Baraja();//creamos objeto de baraja
        Carta carta = bar.darCarta();//le pedimos una carta a la baraja
        return carta;
    }
    
    
    
    
}
