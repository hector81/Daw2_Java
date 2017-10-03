/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VeranoRepaso;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class AsteriscoDiagonal extends JFrame implements ActionListener{
    private JPanel panelNorte, panelSur;
    private JButton botonNorte, botonNoreste, botonNoroeste, botonSur,botonSureste,botonSuroeste
            ,botonOeste, botonEste;
    private JLabel jlasterisco;
    private int x = 300;
    private int y = 300;

    public AsteriscoDiagonal() {
        this.getContentPane().setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(600, 600));
        
        this.panelNorte = new JPanel(null);
        this.panelNorte.setPreferredSize(new Dimension(600, 600));
        
        URL url = getClass().getResource("/gfx/bola.gif");
        ImageIcon image = new ImageIcon(url);
        this.jlasterisco = new JLabel(image);
        jlasterisco.setSize(100, 100);
        jlasterisco.setLocation(x, y);
        panelNorte.add(jlasterisco);
        
        this.panelSur = new JPanel();
        this.panelSur.setPreferredSize(new Dimension(600, 100));
        panelSur.setLayout(new FlowLayout());
        
        
        this.botonNorte = new JButton("Norte");
        this.botonNoreste = new JButton("Noreste");
        this.botonNoroeste = new JButton("Noroeste");
        this.botonSur = new JButton("Sur");
        this.botonSureste = new JButton("Sureste");
        this.botonSuroeste = new JButton("Suroeste");
        this.botonOeste = new JButton("Oeste");
        this.botonEste = new JButton("Este");
        
        this.botonNorte.addActionListener(this);
        this.botonNoreste.addActionListener(this);
        this.botonNoroeste.addActionListener(this);
        this.botonSur.addActionListener(this);
        this.botonSureste.addActionListener(this);
        this.botonSuroeste.addActionListener(this);
        this.botonOeste.addActionListener(this);
        this.botonEste.addActionListener(this);
        
        panelSur.add(botonNorte);
        panelSur.add(botonNoreste);
        panelSur.add(botonNoroeste);
        panelSur.add(botonSur);
        panelSur.add(botonSureste);
        panelSur.add(botonSuroeste);
        panelSur.add(botonOeste);
        panelSur.add(botonEste);
        
       
        
        
        this.add(panelNorte,BorderLayout.NORTH);
        this.add(panelSur,BorderLayout.SOUTH);
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    
    
    public static void main(String[] args) {
        AsteriscoDiagonal ad= new AsteriscoDiagonal();
                
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object boton = e.getSource();
        if(boton == botonNorte){
            for (int i = 0; i < 10; i++) {
                if (jlasterisco.getLocation().y < 25) {
                    jlasterisco.setLocation(jlasterisco.getLocation().x + 0, jlasterisco.getLocation().y +0);
                }else{
                    jlasterisco.setLocation(jlasterisco.getLocation().x + 0, jlasterisco.getLocation().y - i);
                }
                repaint();
            }
        }else if(boton == botonSur){
            for (int i = 0; i < 10; i++) {
                if (jlasterisco.getLocation().y > 500) {
                    jlasterisco.setLocation(jlasterisco.getLocation().x + 0, jlasterisco.getLocation().y +0);
                }else{
                    jlasterisco.setLocation(jlasterisco.getLocation().x + 0, jlasterisco.getLocation().y + i);
                }
                repaint();
            }
        }else if(boton == botonOeste){
            for (int i = 0; i < 10; i++) {
                if (jlasterisco.getLocation().x < 25) {
                    jlasterisco.setLocation(jlasterisco.getLocation().x + 0, jlasterisco.getLocation().y +0);
                }else{
                    jlasterisco.setLocation(jlasterisco.getLocation().x - i, jlasterisco.getLocation().y + 0);
                }
                repaint();
            }
        }else if(boton == botonEste){
            for (int i = 0; i < 10; i++) {
                if (jlasterisco.getLocation().x > 575) {
                    jlasterisco.setLocation(jlasterisco.getLocation().x + 0, jlasterisco.getLocation().y +0);
                }else{
                    jlasterisco.setLocation(jlasterisco.getLocation().x + i, jlasterisco.getLocation().y + 0);
                }
                repaint();
            }
        }else if(boton == botonNoreste){
            for (int i = 0; i < 10; i++) {
                if (jlasterisco.getLocation().x > 575 || jlasterisco.getLocation().y < 25) {
                    jlasterisco.setLocation(jlasterisco.getLocation().x + 0, jlasterisco.getLocation().y +0);
                }else{
                    jlasterisco.setLocation(jlasterisco.getLocation().x + i, jlasterisco.getLocation().y - i);
                }
                repaint();
            }
        }else if(boton == botonNoroeste){
            for (int i = 0; i < 10; i++) {
                if (jlasterisco.getLocation().x < 25 || jlasterisco.getLocation().y < 25) {
                    jlasterisco.setLocation(jlasterisco.getLocation().x + 0, jlasterisco.getLocation().y +0);
                }else{
                    jlasterisco.setLocation(jlasterisco.getLocation().x - i, jlasterisco.getLocation().y - i);
                }
                repaint();
            }
        }else if(boton == botonSureste){
            for (int i = 0; i < 10; i++) {
                if (jlasterisco.getLocation().x > 575 || jlasterisco.getLocation().y > 575) {
                    jlasterisco.setLocation(jlasterisco.getLocation().x + 0, jlasterisco.getLocation().y +0);
                }else{
                    jlasterisco.setLocation(jlasterisco.getLocation().x + i, jlasterisco.getLocation().y + i);
                }
                repaint();
            }
        }else if(boton == botonSuroeste){
            for (int i = 0; i < 10; i++) {
                if (jlasterisco.getLocation().x < 25 || jlasterisco.getLocation().y > 575) {
                    jlasterisco.setLocation(jlasterisco.getLocation().x + 0, jlasterisco.getLocation().y +0);
                }else{
                    jlasterisco.setLocation(jlasterisco.getLocation().x - i, jlasterisco.getLocation().y + i);
                }
                repaint();
            }
        }

    }
    
}
