package ejercicio4;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VESPERTINO
 */
public class VistaSwing extends JFrame implements InterfaceVista{
    //atributos
    private JPanel panelNorte, panelCentro, panelEste;
    private JButton botonDameCarta, botonBarajar, botonGuardarCarta, botonQuitarPalo, botonSalir2;
    private JComboBox jcomboPalo;   
    private JLabel labelPalo,labelNumero;
    
    //constructor
    public VistaSwing(){
        this.getContentPane().setLayout(new BorderLayout());
        panelNorte = new JPanel(new FlowLayout());
        panelCentro = new JPanel(new GridLayout(2, 1));        
        panelEste = new JPanel();
        panelEste.setLayout(new BoxLayout(panelEste, BoxLayout.Y_AXIS));
        
        botonDameCarta = new JButton("DAME CARTA");
        botonBarajar = new JButton("BARAJAR");
        botonGuardarCarta  = new JButton("Guardar Carta");
        
        panelNorte.add(botonDameCarta);
        panelNorte.add(botonBarajar);
        panelNorte.add(botonGuardarCarta);
        
        botonQuitarPalo = new JButton("QUITAR POR PALO");
        botonSalir2 = new JButton("SALIR");
        
        jcomboPalo = new JComboBox();
        jcomboPalo.addItem("Picas");
        jcomboPalo.addItem("Diamantes");
        jcomboPalo.addItem("Corazones");
        jcomboPalo.addItem("Treboles");
        
        panelEste.add(jcomboPalo);
        panelEste.add(botonQuitarPalo);
        panelEste.add(botonSalir2);
        
        labelPalo = new JLabel();//////////
        labelNumero = new JLabel();/////////
        
        panelCentro.add(labelPalo);
        panelCentro.add(labelNumero);
        
        this.add(panelNorte, BorderLayout.NORTH);
        this.add(panelCentro, BorderLayout.CENTER);
        this.add(panelEste, BorderLayout.EAST);
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
       
    }//fin constructor
    
    //main
    public static void main(String[] args) {
        VistaSwing e = new VistaSwing();
    }//fin main

    @Override
    public void getNumeroCarta(int numero) {
        String numeroString;
        numeroString = Integer.toString(numero);
        labelNumero.setText(numeroString);
    }

    @Override
    public void getPaloCarta(String palo) {
        labelPalo.setText(palo);
    }

    @Override
    public void setControlador(Controlador obj) {
        botonDameCarta.setActionCommand("DAMECARTA");
        botonDameCarta.addActionListener(obj);
        botonBarajar.setActionCommand("BARAJAR");
        botonBarajar.addActionListener(obj);
        botonGuardarCarta.setActionCommand("GUARDARCARTA");
        botonGuardarCarta.addActionListener(obj);
        botonQuitarPalo.setActionCommand("QUITARPALO");
        botonQuitarPalo.addActionListener(obj);
        botonSalir2.setActionCommand("SALIR");
        botonSalir2.addActionListener(obj);
    }

    @Override
    public String paloQuitar() {
        return jcomboPalo.getSelectedItem().toString();
    }
}


