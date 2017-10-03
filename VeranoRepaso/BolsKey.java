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
import static java.lang.Thread.sleep;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class BolsKey extends JFrame implements KeyListener, Runnable{

    private JLabel jlbola;
    private JPanel panel;
    private int x=300;
    private int y=500;
    private Bola bola;
    private String aux;

    public BolsKey() {
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
        BolsKey bola= new BolsKey();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
            if(e.getKeyCode()== e.VK_RIGHT){
                aux = "derecha";
            }else if(e.getKeyCode()== e.VK_DOWN){
                aux = "abajo";
            }else if(e.getKeyCode()== e.VK_UP){
                aux = "arriba";
            }else if(e.getKeyCode()== e.VK_LEFT){
                aux = "izquierda";
            }
        }
    

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if(aux.equals("derecha")){
                if(jlbola.getLocation().x >570){
                    jlbola.setLocation(jlbola.getLocation().x +0,jlbola.getLocation().y +0);
                }else{
                    try {
                        jlbola.setLocation(jlbola.getLocation().x +i,jlbola.getLocation().y +0);
                        sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(BolsKey.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }else if(aux.equals("abajo")){
                if(jlbola.getLocation().y > 500){
                    jlbola.setLocation(jlbola.getLocation().x +0,jlbola.getLocation().y +0);
                }else{
                    try {
                        jlbola.setLocation(jlbola.getLocation().x +0,jlbola.getLocation().y+i );
                        sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(BolsKey.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }else if(aux.equals("arriba")){
                if(jlbola.getLocation().y < 30){
                    jlbola.setLocation(jlbola.getLocation().x +0,jlbola.getLocation().y +0);
                }else{
                    try {
                        jlbola.setLocation(jlbola.getLocation().x +0,jlbola.getLocation().y -i);
                        sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(BolsKey.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }else if(aux.equals("izquierda")){
                if(jlbola.getLocation().x <30){
                    jlbola.setLocation(jlbola.getLocation().x +0,jlbola.getLocation().y +0);
                }else{
                    try {
                        jlbola.setLocation(jlbola.getLocation().x -i,jlbola.getLocation().y+0 );
                        sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(BolsKey.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }

    public String getAux() {
        return aux;
    }

    public void setAux(String aux) {
        this.aux = aux;
    }



    
}