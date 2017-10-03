/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.eventos;


import java.awt.event.*;
import java.net.URL;
import javax.swing.*;

/**
 *
 * @author PROF_VESPERTINO
 */
public class EventosRaton extends JFrame implements MouseListener{
    private JLabel jlbImagen, jlbTexto;

    public EventosRaton() {
        URL url = getClass().getResource("/com/iescomercio/gfx/homer.jpg");
        ImageIcon aux = new ImageIcon(url);
        jlbImagen = new JLabel(aux);
        jlbTexto = new JLabel("Juega con el raton");
        
        getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        getContentPane().add(jlbImagen);
        getContentPane().add(jlbTexto);
        
        jlbImagen.addMouseListener(this);        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);     
    }
    
    public static void main(String[] args) {
        new EventosRaton();
    }
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        jlbTexto.setText("Has hecho click con el ratón");        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        jlbTexto.setText("Has apretado el botón");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        jlbTexto.setText("Has soltado el botón");        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        jlbTexto.setText("Estas sobre homer");        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        jlbTexto.setText("Fuera de homer");        
    }
    
}
