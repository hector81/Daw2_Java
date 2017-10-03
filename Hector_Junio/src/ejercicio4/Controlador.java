/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author VESPERTINO
 */
public class Controlador implements ActionListener{
    private VistaSwing vista;
    private Modelo modelo;

    public Controlador(VistaSwing vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.setControlador(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("DAMECARTA")){
            Carta auxCarta;
            auxCarta =  modelo.dameCarta();//cogemos la carta
            
            int numeroCarta = modelo.darNumeroCarta(auxCarta) ;
            String palo = modelo.darPaloCarta(auxCarta);
            
            vista.getNumeroCarta(numeroCarta);
            vista.getPaloCarta(palo);
            
        }else if (e.getActionCommand().equals("BARAJAR")){
        
        
        }else if (e.getActionCommand().equals("GUARDARCARTA")){
            modelo.guardarCartas();           
        }else if (e.getActionCommand().equals("QUITARPALO")){
            String palo;
            palo= vista.paloQuitar();
            modelo.quitarPorPalo(palo);       
        }else if (e.getActionCommand().equals("SALIR")){
            System.exit(0);
             }
    }
    
    
    
    
}
