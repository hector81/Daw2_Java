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
public class ImplementacionDaoBlackJack implements InterfazDaoBlackJack{
    private Baraja baraja;
    private Crupier crupier;
    private Jugador jugador;
    private ArrayList<Carta> coleccion;
    private int saldo;
    private int puntoJugador;
    private int puntoCrupier;

    public ImplementacionDaoBlackJack() {
        this.baraja = new Baraja();
        this.crupier = new Crupier(0);
        this.jugador= new Jugador(saldo, 0,0);
        this.puntoCrupier=0;
        this.puntoJugador=0;
    }

    @Override
    public Carta pedirCartaJugador() {
        Baraja bar = new Baraja();
        Carta carta = jugador.pedirCarta();
        return carta;
    }
    
    @Override
    public Carta pedirCartaCrupier() {
        Baraja bar = new Baraja();
        Carta carta = crupier.pedirCarta();
        return carta;
    }

    @Override
    public int enseñaCartaNumero(Carta carta) {
        int miNumero = 0;
        miNumero = carta.getNumero();        
        return miNumero;
    }

    @Override
    public String enseñaCartaPalo(Carta carta){
        String miPalo = "";
        miPalo = carta.getPalo();        
        return miPalo;
    }
    
    @Override
    public int damePuntuacionManoJugador(Carta carta) {
        int resultado = 0;
        int valor = 0;
        int numero = 0;

        numero = carta.getNumero();//capturamos el numero del array
        switch (numero) {
            case 1:
                valor = 1;
                break;
            case 11: //principe
                valor = 10;
                break;
            case 12: //reina
                valor = 10;
                break;
            case 13: //rey
                valor = 10;
                break;
            default:
                valor = numero;
                break;
        }//fin switch
        resultado += valor;

        return resultado;
    }
    
    @Override
    public int damePuntuacionManoCrupier(Carta carta) {
        int resultado = 0;
        int valor = 0;
        int numero = 0;

        numero = carta.getNumero();//capturamos el numero del array
        switch (numero) {
            case 1:
                valor = 1;
                break;
            case 11: //principe
                valor = 10;
                break;
            case 12: //reina
                valor = 10;
                break;
            case 13: //rey
                valor = 10;
                break;
            default:
                valor = numero;
                break;
        }//fin switch
        resultado += valor;

        return resultado;
    }

    @Override
    public boolean comprobarSaldo() {
        if(jugador.getSaldo() >=0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean plantarseJugador() {
        return true;
    }
    
    @Override
    public boolean plantarseCrupier(int puntuacionCrupier) {
        if(puntuacionCrupier >=17){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int sumarPuntosJugador(int puntos) {
        return puntoJugador+puntos;
    }

    @Override
    public int sumarPuntosCrupier(int puntos) {
        return puntoCrupier+puntos;
    }

    @Override
    public boolean comprobarPuntuacionesGanaCruiper(int puntosJugador, int puntosCrupier) {
        boolean comp= false;
        if(21 < puntosJugador || puntosCrupier == 21){
            comp = true;
        }
        return comp;
    }

    @Override
    public boolean comprobarPuntuacionesGanaJugador(int puntosJugador, int puntosCrupier) {
        boolean comp= false;
        if(21 < puntosCrupier || puntosJugador == 21){
            comp = true;
        }
        return comp;
    }

    @Override
    public int restarSaldo(int cantidad) {
        return saldo -cantidad;
    }

    @Override
    public int sumarSaldo(int cantidad) {
        return saldo +cantidad;
    }
    
    public boolean volverAJugar(){
        return true;
    }

    
   

 
    
}
