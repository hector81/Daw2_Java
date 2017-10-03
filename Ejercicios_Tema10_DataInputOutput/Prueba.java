/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema10_DataInputOutput;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class Prueba extends JFrame implements ActionListener{
    private JPanel NORTE,  AÑADIR, BORRAR, MODIFICAR, CONSULTAR;
    
    private JPanel AÑADIRnorte, AÑADIRcentro, AÑADIReste;
    private JPanel BORRARnorte, BORRARcentro, BORRAReste;
    private JPanel MODIFICARnorte, MODIFICARcentro, MODIFICAReste;
    private JPanel CONSULTARnorte, CONSULTARcentro, CONSULTAReste;
    
    private JLabel jlnombreAÑADIR, jlapellidosAÑADIR,jledadAÑADIR, jldniAÑADIR;
    private JLabel jldniBORRAR;
    private JLabel jlnombreMODIFICAR, jlapellidosMODIFICAR,jledadMODIFICAR, jldniMODIFICAR;
    private JLabel jlnombreCONSULTAR, jlapellidosCONSULTAR,jledadCONSULTAR, jldniCONSULTAR;
    
    private JTextField jtnombreAÑADIR, jtapellidosAÑADIR,jtedadAÑADIR, jtdniAÑADIR; 
    private JTextField jtnombreBORRAR, jtapellidosBORRAR, jtedadBORRAR, jtdniBORRAR;
    private JTextField jtnombreMODIFICAR, jtapellidosMODIFICAR,jtedadMODIFICAR, jtdniMODIFICAR;
    private JTextField jtnombreCONSULTAR, jtapellidosCONSULTAR,jtedadCONSULTAR, jtdniCONSULTAR;
    
    private JButton botonAÑADIR , botonBORRAR, botonMODIFICAR, botonCONSULTAR
            , botonOKAÑADIR , botonOKBORRAR ,botonOKMODIFICAR , botonOKCONSULTAR,
            botonCONSULTARadelantar, botonCONSULTARdetras;
    private JPanel JPCARDPANEL;
    
    CursorCliente cursor = new CursorCliente();

    public Prueba() {
        this.getContentPane().setLayout(new BorderLayout());
        /////////////////////////
        this.NORTE = new JPanel(new FlowLayout());
        
        ////////////////////////////////////
        this.botonAÑADIR = new JButton("AÑADIR");
        this.botonBORRAR = new JButton("BORRAR");
        this.botonMODIFICAR = new JButton("MODIFICAR");
        this.botonCONSULTAR = new JButton("CONSULTAR ");
        this.botonOKAÑADIR = new JButton("OK AÑADIR");
        this.botonOKBORRAR = new JButton("OK BORRAR");
        this.botonOKMODIFICAR = new JButton("OK MODIFICAR");
        this.botonOKCONSULTAR = new JButton("OK CONSULTAR ");
        this.botonCONSULTARadelantar = new JButton("ADELANTE");
        this.botonCONSULTARdetras = new JButton("ATRAS");
        
        //////////////////////////////////////
        this.NORTE.add(botonAÑADIR);
        this.NORTE.add(botonBORRAR);
        this.NORTE.add(botonMODIFICAR);
        this.NORTE.add(botonCONSULTAR);
        /////////////////////////

        
        this.AÑADIR = new JPanel(new BorderLayout());
        this.BORRAR = new JPanel(new BorderLayout());
        this.MODIFICAR = new JPanel(new BorderLayout());
        this.CONSULTAR = new JPanel(new BorderLayout());
        
        

        this.AÑADIRcentro = new JPanel(new GridLayout(4, 2));
        this.AÑADIReste = new JPanel();
        this.AÑADIReste.setLayout(new BoxLayout(AÑADIReste, BoxLayout.Y_AXIS));
 
        this.BORRARcentro = new JPanel(new GridLayout(1, 2));
        this.BORRAReste = new JPanel();
        this.BORRAReste.setLayout(new BoxLayout(BORRAReste, BoxLayout.Y_AXIS));

        this.MODIFICARcentro = new JPanel(new GridLayout(4, 2));
        this.MODIFICAReste = new JPanel();
        this.MODIFICAReste.setLayout(new BoxLayout(MODIFICAReste, BoxLayout.Y_AXIS));

        this.CONSULTARcentro = new JPanel(new GridLayout(4, 2));
        this.CONSULTAReste = new JPanel();
        this.CONSULTAReste.setLayout(new BoxLayout(CONSULTAReste, BoxLayout.Y_AXIS));
        
        
        ////////////////
        this.AÑADIR.add(AÑADIRcentro, BorderLayout.CENTER);
        this.AÑADIR.add(AÑADIReste, BorderLayout.EAST);

        this.BORRAR.add(BORRARcentro, BorderLayout.CENTER);
        this.BORRAR.add(BORRAReste, BorderLayout.EAST);

        this.MODIFICAR.add(MODIFICARcentro, BorderLayout.CENTER);
        this.MODIFICAR.add(MODIFICAReste, BorderLayout.EAST);

        this.CONSULTAR.add(CONSULTARcentro, BorderLayout.CENTER);
        this.CONSULTAR.add(CONSULTAReste, BorderLayout.EAST);
        ///////////
        
        this.jlnombreAÑADIR = new JLabel("NOMBRE: ");
        this.jlapellidosAÑADIR = new JLabel("APELLIDOS: ");
        this.jledadAÑADIR = new JLabel("EDAD:");
        this.jldniAÑADIR = new JLabel("DNI:");
        
        this.jldniBORRAR = new JLabel("DNI:");
        
        this.jlnombreMODIFICAR = new JLabel("NOMBRE:");
        this.jlapellidosMODIFICAR = new JLabel("APELLIDOS:");
        this.jledadMODIFICAR = new JLabel("EDAD:");
        this.jldniMODIFICAR = new JLabel("DNI:");
        
        this.jlnombreCONSULTAR = new JLabel("NOMBRE:");
        this.jlapellidosCONSULTAR = new JLabel("APELLIDOS:");
        this.jledadCONSULTAR = new JLabel("EDAD:");
        this.jldniCONSULTAR = new JLabel("DNI:");
        
        this.jtnombreAÑADIR = new JTextField(20);
        this.jtapellidosAÑADIR = new JTextField(20);
        this.jtedadAÑADIR = new JTextField(20);
        this.jtdniAÑADIR = new JTextField(20);
        
        this.jtnombreBORRAR = new JTextField(20);
        this.jtapellidosBORRAR = new JTextField(20);
        this.jtedadBORRAR = new JTextField(20);
        this.jtdniBORRAR = new JTextField(20);
        
        this.jtnombreMODIFICAR = new JTextField(20);
        this.jtapellidosMODIFICAR = new JTextField(20);
        this.jtedadMODIFICAR = new JTextField(20);
        this.jtdniMODIFICAR = new JTextField(20);
        
        this.jtnombreCONSULTAR = new JTextField(20);
        this.jtapellidosCONSULTAR = new JTextField(20);
        this.jtedadCONSULTAR = new JTextField(20);
        this.jtdniCONSULTAR = new JTextField(20);

        this.botonOKAÑADIR = new JButton("OK AÑADIR");
        this.botonOKBORRAR = new JButton("OK BORRAR");
        this.botonOKMODIFICAR = new JButton("OK MODIFICAR");
        this.botonOKCONSULTAR = new JButton("OK CONSULTAR ");
        this.botonCONSULTARadelantar = new JButton("ADELANTE");
        this.botonCONSULTARdetras = new JButton("ATRAS");
        
        this.botonAÑADIR.addActionListener(this);
        this.botonBORRAR.addActionListener(this);
        this.botonMODIFICAR.addActionListener(this);
        this.botonCONSULTAR.addActionListener(this);
        this.botonOKAÑADIR.addActionListener(this);
        this.botonOKBORRAR.addActionListener(this);
        this.botonOKMODIFICAR.addActionListener(this);
        this.botonOKCONSULTAR.addActionListener(this);
        this.botonCONSULTARadelantar.addActionListener(this);
        this.botonCONSULTARdetras.addActionListener(this);
        
        this.AÑADIRcentro.add(jlnombreAÑADIR);
        this.AÑADIRcentro.add(jtnombreAÑADIR);
        this.AÑADIRcentro.add(jlapellidosAÑADIR);
        this.AÑADIRcentro.add(jtapellidosAÑADIR);
        this.AÑADIRcentro.add(jledadAÑADIR);
        this.AÑADIRcentro.add(jtedadAÑADIR);
        this.AÑADIRcentro.add(jldniAÑADIR);
        this.AÑADIRcentro.add(jtdniAÑADIR);
        
        this.AÑADIReste.add(botonOKAÑADIR);
        
        ///

        this.BORRARcentro.add(jldniBORRAR);
        this.BORRARcentro.add(jtdniBORRAR);
        
        this.BORRAReste.add(botonOKBORRAR);
        
        //
        
        this.MODIFICARcentro.add(jlnombreMODIFICAR);
        this.MODIFICARcentro.add(jtnombreMODIFICAR);
        this.MODIFICARcentro.add(jlapellidosMODIFICAR);
        this.MODIFICARcentro.add(jtapellidosMODIFICAR);
        this.MODIFICARcentro.add(jledadMODIFICAR);
        this.MODIFICARcentro.add(jtedadMODIFICAR);
        this.MODIFICARcentro.add(jldniMODIFICAR);
        this.MODIFICARcentro.add(jtdniMODIFICAR);
        
        this.MODIFICAReste.add(botonOKMODIFICAR);
        //
        
        this.CONSULTARcentro.add(jlnombreCONSULTAR);
        this.CONSULTARcentro.add(jtnombreCONSULTAR);
        this.CONSULTARcentro.add(jlapellidosCONSULTAR);
        this.CONSULTARcentro.add(jtapellidosCONSULTAR);
        this.CONSULTARcentro.add(jledadCONSULTAR);
        this.CONSULTARcentro.add(jtedadCONSULTAR);
        this.CONSULTARcentro.add(jldniCONSULTAR);
        this.CONSULTARcentro.add(jtdniCONSULTAR);
        
        this.CONSULTAReste.add(botonOKCONSULTAR);
        this.CONSULTAReste.add(botonCONSULTARadelantar);
        this.CONSULTAReste.add(botonCONSULTARdetras);
        
        ///////////
        this.JPCARDPANEL = new JPanel(new CardLayout());
        JPCARDPANEL.add(AÑADIR, "PANEL AÑADIR");
        JPCARDPANEL.add(BORRAR, "PANEL BORRAR");
        JPCARDPANEL.add(MODIFICAR, "PANEL MODIFICAR");
        JPCARDPANEL.add(CONSULTAR, "PANEL CONSULTAR");
        
        this.JPCARDPANEL.add(AÑADIR);
        this.JPCARDPANEL.add(BORRAR);
        this.JPCARDPANEL.add(MODIFICAR);
        this.JPCARDPANEL.add(CONSULTAR);
        
        this.add(NORTE, BorderLayout.NORTH);
        this.add(JPCARDPANEL, BorderLayout.CENTER);

        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        this.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CardLayout cl = (CardLayout) (JPCARDPANEL.getLayout());
        if (e.getSource() == botonAÑADIR) {
            cl.show(JPCARDPANEL, "PANEL AÑADIR");           
        }else if(e.getSource() == botonAÑADIR) {
            cl.show(JPCARDPANEL, "PANEL BORRAR");           
        }else if(e.getSource() == botonAÑADIR) {
            cl.show(JPCARDPANEL, "PANEL MODIFICAR");           
        }else if(e.getSource() == botonAÑADIR) {
            cl.show(JPCARDPANEL, "PANEL CONSULTAR");           
        }else if(e.getSource() == botonOKAÑADIR) {
            
        }else if(e.getSource() == botonOKBORRAR) {
                   
        }else if(e.getSource() == botonOKMODIFICAR) {
                   
        }else if(e.getSource() == botonOKCONSULTAR) {
           
        }else if(e.getSource() == botonCONSULTARadelantar) {
               
        }else if(e.getSource() == botonCONSULTARdetras) {
                    
        }
    }
    
    public static void main(String[] args) {
        Prueba cc = new Prueba();
    }
    
}