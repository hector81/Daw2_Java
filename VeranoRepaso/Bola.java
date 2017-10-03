/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VeranoRepaso;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class Bola extends JFrame implements KeyListener{

    private JLabel jlbola;
    private JPanel panel;
    private int x=300;
    private int y=500;
    private Bola bola;

    public Bola() {
        this.getContentPane().setLayout(new FlowLayout());
        this.setPreferredSize(new Dimension(600, 600));
        
        this.panel = new JPanel(new FlowLayout());
        panel.setPreferredSize(new Dimension(600, 600));
        
        
        URL url =getClass().getResource("/gfx/bomb.png");
        ImageIcon image = new ImageIcon(url);
        this.jlbola = new JLabel(image);
        jlbola.setSize(jlbola.getWidth(), jlbola.getHeight());
        jlbola.setLocation(x, y);
        
        panel.addKeyListener(this);
        panel.setFocusable(true);
        panel.add(jlbola);
        
        this.add(panel);
        
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    
    
    public static void main(String[] args) {
        Bola bola= new Bola();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        for (int i = 0; i < 10; i++) {
            if(e.getKeyCode()== e.VK_RIGHT){
                if(jlbola.getLocation().x >570){
                    jlbola.setLocation(jlbola.getLocation().x +0,jlbola.getLocation().y +0);
                }else{
                    jlbola.setLocation(jlbola.getLocation().x +i,jlbola.getLocation().y +0);
                }
            }else if(e.getKeyCode()== e.VK_DOWN){
                if(jlbola.getLocation().y > 500){
                    jlbola.setLocation(jlbola.getLocation().x +0,jlbola.getLocation().y +0);
                }else{
                    jlbola.setLocation(jlbola.getLocation().x +0,jlbola.getLocation().y+i );
                }
            }else if(e.getKeyCode()== e.VK_UP){
                if(jlbola.getLocation().y < 30){
                    jlbola.setLocation(jlbola.getLocation().x +0,jlbola.getLocation().y +0);
                }else{
                    jlbola.setLocation(jlbola.getLocation().x +0,jlbola.getLocation().y -i);
                }
            }else if(e.getKeyCode()== e.VK_LEFT){
                if(jlbola.getLocation().x <30){
                    jlbola.setLocation(jlbola.getLocation().x +0,jlbola.getLocation().y +0);
                }else{
                    jlbola.setLocation(jlbola.getLocation().x -i,jlbola.getLocation().y+0 );
                }
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    
}
