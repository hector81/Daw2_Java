/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema10_DataInputOutput;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class pRUEBA2 extends JFrame implements ActionListener{
    private JPanel panelNorteCARD,panelsur, panelHola,panelAdios;
    private JLabel jlhola, jladios;
    private JButton botonhola, botonadios;

    public pRUEBA2() {
        this.getContentPane().setLayout(new BorderLayout());
        
        
        this.panelHola = new JPanel(new FlowLayout());
        this.panelAdios = new JPanel(new FlowLayout());
        this.panelsur = new JPanel(new FlowLayout());
        
        this.jlhola = new JLabel("HOLA");
        this.jladios = new JLabel("ADIOS");
        this.panelHola.add(jlhola);
        this.panelAdios.add(jladios);
        
        this.botonhola = new JButton("hola1");
        this.botonadios = new JButton("adios1");
        panelsur.add(botonhola);
        panelsur.add(botonadios);
        
        this.panelNorteCARD = new JPanel();
        CardLayout cl = new CardLayout();
        panelNorteCARD.setLayout(cl);
        panelNorteCARD.add(panelHola, "hola1");
        panelNorteCARD.add(panelAdios, "adios1");
        
        this.add(panelNorteCARD, BorderLayout.NORTH);
        this.add(panelsur, BorderLayout.SOUTH);
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        this.setVisible(true);
    }
    
    
    
    public static void main(String[] args) {
        pRUEBA2 p = new pRUEBA2();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        CardLayout cl = (CardLayout) (panelNorteCARD.getLayout());
        if (e.getSource() == botonhola) {
            cl.show(panelNorteCARD, "hola1");           
        }
        if (e.getSource() == botonadios) {
            cl.show(panelNorteCARD, "adios1");
        }
    }
    
}
