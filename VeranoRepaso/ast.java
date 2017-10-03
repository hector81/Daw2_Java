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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class ast extends JFrame implements ActionListener, Runnable{
    private JLabel asterisco;
    private JPanel panel1,panel2;
    private JButton boton;
    private static ast a;
    
    public ast(){
        this.getContentPane().setLayout(new BorderLayout());
        asterisco = new JLabel("*");
        panel1 = new JPanel(null);
        panel1.setPreferredSize(new Dimension(600, 600));
        
        asterisco.setBounds(55, 55, 20, 20);
        panel1.add(asterisco);
        
        panel2  = new JPanel(new FlowLayout());
        boton= new JButton("ok");
        boton.addActionListener(this);
        
        panel2.add(boton);
        
        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.SOUTH);
        
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }    
        
    @Override
    public void actionPerformed(ActionEvent e) {
        Thread u= new Thread(a);
        u.start();
    }
    
    public static void main(String[] args) {
        a = new ast();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {

                asterisco.setLocation(asterisco.getLocation().x + i, asterisco.getLocation().y);
                repaint();
                sleep(50);

            }
        } catch (InterruptedException ex) {
            Logger.getLogger(ast.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
