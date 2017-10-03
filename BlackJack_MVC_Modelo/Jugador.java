/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack_MVC_Modelo;

import java.util.ArrayList;

/**
 *
 * @author VESPERTINO
 */
public class Jugador extends Persona {

    //atributos
    private int saldo;
    private int apuesta;
    private int puntos;
    //constructor

    public Jugador(int saldo, int apuesta,int puntos) {
        this.saldo = saldo;
        this.apuesta = 0;
        this.puntos = 0;
    }
    
    
    

    //getters and setters
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getApuesta() {
        return apuesta;
    }

    public void setApuesta(int apuesta) {
        this.apuesta = apuesta;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    

    //metodos
    public Carta pedirCarta() {
        Baraja bar = new Baraja();//creamos objeto de baraja
        Carta carta = bar.darCarta();//le pedimos una carta a la baraja
        return carta;
    }

   
    
}
