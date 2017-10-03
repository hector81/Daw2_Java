/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VeranoRepaso;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class Asterisco1 extends JFrame implements ActionListener , Runnable{
    //atributos
    private JPanel panel1, panel2;
    private JLabel jasterisco;
    private JButton boton;
    private static Asterisco1 a;
    
    //constructor
    public Asterisco1() {    
        this.getContentPane().setLayout(new BorderLayout());
        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setPreferredSize(new Dimension(600, 600));
        panel2 = new JPanel(new FlowLayout());
        
        
        boton = new JButton("mover");
        boton.addActionListener(this);
        panel2.add(boton);
        
        URL url = getClass().getResource("/gfx/bolaBillar.gif");
        ImageIcon imagen = new ImageIcon(url);
        jasterisco= new JLabel(imagen);
        jasterisco.setBounds(50, 50, jasterisco.getWidth(), jasterisco.getHeight());
        panel1.add(jasterisco);
        jasterisco.setSize(imagen.getIconWidth(), imagen.getIconHeight());
        
       // panel1.setFocusable(true);
        
        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.SOUTH);
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    //main
    public static void main(String[] args) {
        a = new Asterisco1();
    }
    //metodos implementados
    @Override
    public void actionPerformed(ActionEvent e) {
            Thread t = new Thread(a);
            t.start();
        }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                if(jasterisco.getLocation().x <=600-50){
                    jasterisco.setLocation(jasterisco.getLocation().x + i, jasterisco.getLocation().y);
                }else if(jasterisco.getLocation().x >=600-50){
                    jasterisco.setLocation(jasterisco.getLocation().x + 0, jasterisco.getLocation().y);
                }
                repaint();
                sleep(100);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Asterisco1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
