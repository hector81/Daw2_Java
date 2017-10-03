/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VeranoRepaso;

import Ejercicios_Tema10_ActionListener.BolaDirecciones1;
import com.sun.webkit.event.WCKeyEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.lang.Thread.sleep;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.omg.SendingContext.RunTime;

/**
 *
 * @author user
 */
public class Tenis extends JFrame implements Runnable, KeyListener{
    private JPanel panel;
    private JLabel bola, barra;
    private int xBola = 300;
    private int yBola = 300;
    private int xBarra = 300;
    private int yBarra = 400;

    public Tenis() {
        this.getContentPane().setLayout(null);        
        this.setPreferredSize(new Dimension(600, 600));       
        this.setBackground(Color.PINK);
        this.setFocusable(true);
        this.addKeyListener(this);
        
        URL url1 = getClass().getResource("/gfx/bomb.png");
        ImageIcon image1 = new ImageIcon(url1);      
        this.bola = new JLabel(image1);
        bola.setBounds(xBola, yBola, 25, 25);

        URL url2 = getClass().getResource("/gfx/barraInferior.png");
        ImageIcon image2 = new ImageIcon(url2);      
        this.barra = new JLabel(image2);
        barra.setBounds(xBarra, yBarra, 60, 20);
        
        this.add(bola);        
        this.add(barra);
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    
    
    public static void main(String[] args) {
        Tenis te = new Tenis();
        Thread t = new Thread(te);//creamos objeto de hilo y le pasamos objeto bola
        t.start();//para que se ejeCute nada mas correr el programa
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getKeyCode() == e.VK_RIGHT) {
                if (barra.getLocation().x > 550) {
                    barra.setLocation(barra.getLocation().x + 0, barra.getLocation().y + 0);
                } else {
                    barra.setLocation(barra.getLocation().x + i, barra.getLocation().y + 0);
                    repaint();
                }
            }else if (e.getKeyCode() == e.VK_LEFT) {
                if (barra.getLocation().x < 35) {
                    barra.setLocation(barra.getLocation().x + 0, barra.getLocation().y + 0);
                } else {
                    barra.setLocation(barra.getLocation().x - i, barra.getLocation().y + 0);
                    repaint();
                }
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    @Override
    public void run() {
        while(true){
            int i = 0;
            i++;
                if (bola.getLocation().x > 550) {
                    xBola = xBola +i;
                } 
                if (bola.getLocation().x > 550) {
                    xBola = xBola +i;
                }
                if (bola.getLocation().x < 35) {
                    xBola = xBola +i;
                } 
                if (bola.getLocation().x > 550) {
                    xBola = xBola +i;
                }
            }
        
    }
}
