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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class Asterisco extends JFrame implements ActionListener{
    private JLabel jlAsterisco;
    private int x = 300;
    private int y = 300;
    private JPanel panelNorte, panelSur;
    private JButton botonDerecha, botonIzquierda, botonArriba, botonAbajo;
    private Asterisco a;
    
    public Asterisco(){
        this.getContentPane().setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(600, 650));
        
        panelNorte = new JPanel(new FlowLayout());
        panelNorte.setPreferredSize(new Dimension(600, 50));
        
        panelSur= new JPanel(null);
        panelSur.setBackground(Color.PINK);
        panelSur.setPreferredSize(new Dimension(600, 600));
        
        botonDerecha = new JButton("derecha");
        botonIzquierda = new JButton("izquierda");
        botonArriba = new JButton("arriba");
        botonAbajo = new JButton("abajo");
        
        botonDerecha.addActionListener(this);
        botonIzquierda.addActionListener(this);
        botonArriba.addActionListener(this);
        botonAbajo.addActionListener(this);
        
        panelNorte.add(botonDerecha);
        panelNorte.add(botonIzquierda);
        panelNorte.add(botonArriba);
        panelNorte.add(botonAbajo);
        
        URL url = getClass().getResource("/gfx/bomb.png");
        ImageIcon image= new ImageIcon(url);
        jlAsterisco = new JLabel(image);
        jlAsterisco.setBounds(x, y, 50,50);
        
        panelSur.add(jlAsterisco);
        
        this.add(panelNorte, BorderLayout.NORTH);
        this.add(panelSur, BorderLayout.SOUTH);
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object boton = e.getSource();
        if (boton == botonAbajo) {
            for (int i = 0; i < 10; i++) {
                if(jlAsterisco.getLocation().y > 560){
                    jlAsterisco.setLocation(jlAsterisco.getLocation().x+0, jlAsterisco.getLocation().y+0);
                    repaint(100);
                }
                else{
                    jlAsterisco.setLocation(jlAsterisco.getLocation().x+0, jlAsterisco.getLocation().y+i);
                    repaint(100);
                }
            }
        } else if (boton == botonArriba) {
            for (int i = 0; i < 10; i++) {
                if(jlAsterisco.getLocation().y < 40){
                    jlAsterisco.setLocation(jlAsterisco.getLocation().x+0, jlAsterisco.getLocation().y+0);
                    repaint(100);
                }
                else{
                    jlAsterisco.setLocation(jlAsterisco.getLocation().x+0, jlAsterisco.getLocation().y-i);
                    repaint(100);
                }
            }
        } else if (boton == botonDerecha) {
            for (int i = 0; i < 10; i++) {
                if(jlAsterisco.getLocation().x > 560){
                    jlAsterisco.setLocation(jlAsterisco.getLocation().x+0, jlAsterisco.getLocation().y+0);
                    repaint(100);
                }
                else{
                    jlAsterisco.setLocation(jlAsterisco.getLocation().x+i, jlAsterisco.getLocation().y+0);
                    repaint(100);
                }
            }
        } else if (boton == botonIzquierda) {
            for (int i = 0; i < 10; i++) {
                if(jlAsterisco.getLocation().x < 40){
                    jlAsterisco.setLocation(jlAsterisco.getLocation().x+0, jlAsterisco.getLocation().y+0);
                    repaint(100);
                }
                else{
                    jlAsterisco.setLocation(jlAsterisco.getLocation().x-1, jlAsterisco.getLocation().y+0);
                    repaint(100);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Asterisco a = new Asterisco();
    }
}
