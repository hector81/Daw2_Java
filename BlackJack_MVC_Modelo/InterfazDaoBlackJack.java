package BlackJack_MVC_Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import BlackJack_MVC_Modelo.Carta;

/**
 *
 * @author user
 */
public interface InterfazDaoBlackJack {
    //metodos abstractos
    
    public abstract Carta pedirCartaJugador();
    
    public abstract Carta pedirCartaCrupier();
    
    public abstract int enseñaCartaNumero(Carta carta);
    
    public abstract String enseñaCartaPalo(Carta carta);
            
    public abstract int damePuntuacionManoCrupier(Carta carta);
    
    public abstract int damePuntuacionManoJugador(Carta carta);
    
    public abstract boolean comprobarSaldo();
    
    public abstract boolean comprobarPuntuacionesGanaCruiper(int puntosJugador, int puntosCrupier);
    
    public abstract boolean comprobarPuntuacionesGanaJugador(int puntosJugador, int puntosCrupier);
    
    public abstract boolean plantarseJugador();
    
    public abstract boolean plantarseCrupier(int puntuacionCrupier);
    
    public abstract int sumarPuntosJugador(int puntos);
    
    public abstract int sumarPuntosCrupier(int puntos);
    
    public abstract int restarSaldo(int cantidad);
    
    public abstract int sumarSaldo(int cantidad);
}
