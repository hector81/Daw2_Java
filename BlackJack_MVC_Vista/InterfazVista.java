/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack_MVC_Vista;

import BlackJack_MVC_Controlador.Controlador;



/**
 *
 * @author VESPERTINO
 */
public interface InterfazVista {
  
    //carta
    public abstract int getNumeroCartaJugador();
    
    public abstract String getPaloCartaJugador();
    
    public abstract int getNumeroCartaCrupier();
    
    public abstract String getPaloCartaCrupier();
    
    public void setCartaJugador(int numero, String palo);
    
    public void setCartaCrupier(int numero, String palo);
    
    //jugador
    
    public abstract int getSaldo();
    
    public abstract int getApuesta();
    
    public void setJugador(int saldo);

    //puntuaciones
    public abstract void setPuntuacionCrupier(int puntuacionCrupier);
    
    public abstract void setPuntuacionJugador(int puntuacionJugador);
    
    //para controlador
    public void setControlador(Controlador objeto);
}
