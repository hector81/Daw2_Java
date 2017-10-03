/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack_MVC_Vista;

import BlackJack_MVC_Controlador.Controlador;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author VESPERTINO
 */
public class VistaSwingBlackJack extends JFrame implements InterfazVista{
    private JPanel panelNorte, panelCentro, panelEste;
    private JLabel saldoJugador, apuestaJugador, cartaPaloJugador, cartaNumeroJugador, 
            cartaPaloCrupier, cartaNumeroCrupier, puntosJugador, puntosCrupier;
    private JTextField jtAPUESTA, jtSALDO, jtcartaPaloJugador, jtcartaNumeroJugador, 
            jtcartaPaloCrupier, jtcartaNumeroCrupier, jtpuntosJugador, jtpuntosCrupier;
    private JButton botonOk, botonPedirCartaCrupier, botonPedirCartaJugador, 
            botonPlantarseJugador, botonPartida,botonSalir;
    private Controlador control;

    public VistaSwingBlackJack() {
        this.getContentPane().setLayout(new BorderLayout());
        
        this.panelNorte = new JPanel(new FlowLayout());
        this.panelCentro = new JPanel(new GridLayout(4, 2));
        this.panelEste = new JPanel();
        this.panelEste.setLayout(new BoxLayout(this.panelEste, BoxLayout.Y_AXIS));
        
        this.saldoJugador = new JLabel("SALDO JUGADOR");
        this.apuestaJugador = new JLabel("APUESTA JUGADOR");
        
        
        this.cartaPaloJugador = new JLabel("CARTA PALO JUGADOR");
        this.cartaNumeroJugador = new JLabel("CARTA NUMERO CRUPIER");
        this.cartaPaloCrupier = new JLabel("CARTA PALO JUGADOR");
        this.cartaNumeroCrupier = new JLabel("CARTA NUMERO CRUPIER");
        
        
        this.puntosJugador = new JLabel("PUNTOS JUGADOR");
        this.puntosCrupier = new JLabel("PUNTOS CRUPIER");
        
        
        this.jtSALDO = new JTextField(20);
        this.jtAPUESTA  = new JTextField(20);
        
        this.jtcartaPaloJugador = new JTextField(20);
        this.jtcartaNumeroJugador = new JTextField(20);
        this.jtcartaPaloCrupier = new JTextField(20);
        this.jtcartaNumeroCrupier = new JTextField(20);
        
        this.jtpuntosJugador = new JTextField(20);
        this.jtpuntosCrupier = new JTextField(20);
        
        this.botonOk = new JButton("OK");
        this.botonPedirCartaCrupier = new JButton("PEDIR CARTA CRUPIER");
        this.botonPedirCartaJugador = new JButton("PEDIR CARTA JUGADOR");
        this.botonPlantarseJugador = new JButton("PLANTARSE JUGADOR");
        this.botonPartida = new JButton("PARTIDA");  
        this.botonSalir = new JButton("SALIR");
        
        panelNorte.add(saldoJugador);
        panelNorte.add(jtSALDO);
        panelNorte.add(apuestaJugador);
        panelNorte.add(jtAPUESTA);
        panelNorte.add(botonOk);
        
        panelCentro.add(cartaPaloJugador);
        panelCentro.add(jtcartaPaloJugador);
        panelCentro.add(cartaNumeroJugador);
        panelCentro.add(jtcartaNumeroJugador);
        panelCentro.add(cartaPaloCrupier);
        panelCentro.add(jtcartaPaloCrupier);
        panelCentro.add(cartaNumeroCrupier);
        panelCentro.add(jtcartaNumeroCrupier);
        
        panelEste.add(puntosJugador);
        panelEste.add(jtpuntosJugador);
        panelEste.add(puntosCrupier);
        panelEste.add(jtpuntosCrupier);
        panelEste.add(botonPedirCartaCrupier);
        panelEste.add(botonPedirCartaJugador);
        panelEste.add(botonPlantarseJugador);
        panelEste.add(botonPartida);
        panelEste.add(botonSalir);
        
        
        this.add(panelNorte, BorderLayout.NORTH);
        this.add(panelCentro, BorderLayout.CENTER);
        this.add(panelEste, BorderLayout.EAST);
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        this.setVisible(true);
    }

    
    
    public static void main(String[] args) {
        VistaSwingBlackJack v = new VistaSwingBlackJack();
    }

    @Override
    public int getNumeroCartaJugador() {
        int numero;
        numero = Integer.parseInt(jtcartaNumeroJugador.getText());
        return numero;
    }

    @Override
    public String getPaloCartaJugador() {
        String palo;
        palo = jtcartaPaloJugador.getText();
        return palo;
    }

    @Override
    public int getNumeroCartaCrupier() {
        int numero;
        numero = Integer.parseInt(jtcartaNumeroJugador.getText());
        return numero;
    }

    @Override
    public String getPaloCartaCrupier() {
        String palo;
        palo = jtcartaPaloJugador.getText();
        return palo;
    }

    @Override
    public void setCartaJugador(int numero, String palo) {
        jtcartaNumeroJugador.setText(Integer.toString(numero));
        jtcartaPaloJugador.setText(palo);
    }

    @Override
    public void setCartaCrupier(int numero, String palo) {
        jtcartaNumeroCrupier.setText(Integer.toString(numero));
        jtcartaPaloCrupier.setText(palo);
    }

    @Override
    public int getSaldo() {
        int saldo;
        saldo = Integer.parseInt(jtSALDO.getText());
        return saldo;
    }

    @Override
    public int getApuesta() {
        int ap;
        ap = Integer.parseInt(jtAPUESTA.getText());
        return ap;
    }

    @Override
    public void setJugador(int saldo) {
        jtSALDO.setText(Integer.toString(saldo));
    }





    
    

    @Override
    public void setControlador(Controlador objeto) {
        control= objeto;
        
        botonOk.setActionCommand("OK"); 
        botonOk.addActionListener(objeto);
        botonPedirCartaCrupier.setActionCommand("PEDIR CARTA CRUPIER");
        botonPedirCartaCrupier.addActionListener(objeto);
        botonPedirCartaJugador.setActionCommand("PEDIR CARTA JUGADOR");
        botonPedirCartaJugador.addActionListener(objeto);
        botonPlantarseJugador.setActionCommand("PLANTARSE JUGADOR");
        botonPlantarseJugador.addActionListener(objeto);
        botonPartida.setActionCommand("PARTIDA");
        botonPartida.addActionListener(objeto);  
        botonSalir.setActionCommand("SALIR");
        botonSalir.addActionListener(objeto);
    }

    @Override
    public void setPuntuacionCrupier(int puntuacionCrupier) {
        jtpuntosCrupier.setText(Integer.toString(puntuacionCrupier));
    }

    @Override
    public void setPuntuacionJugador(int puntuacionJugador) {
        jtpuntosJugador.setText(Integer.toString(puntuacionJugador));
    }

   public void vaciarSaldoApuesta(){
       jtSALDO.setText("");
       jtAPUESTA.setText("");
   }
    
   public void vaciarApuesta(){
       jtAPUESTA.setText("");
   }
   
   public void vaciarTodoMenosSaldo(){
       jtAPUESTA.setText("");
       jtcartaNumeroCrupier.setText("");
       jtcartaPaloCrupier.setText("");
       jtcartaPaloJugador.setText("");
       jtcartaNumeroJugador.setText("");
       jtpuntosCrupier.setText("");
       jtpuntosJugador.setText("");
   }
   
   public void salir(){
        System.exit(0);
   }
}
