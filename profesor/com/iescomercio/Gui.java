/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

/**
 *
 * @author PROF_VESPERTINO
 */
public class Gui extends JFrame implements ActionListener{
    private JProgressBar jpBarra;
    private JButton jbGo;

    public Gui() {
        jpBarra = new JProgressBar(0,100);
        
        jbGo = new JButton("Copiar");
        jbGo.setAlignmentX(CENTER_ALIGNMENT);
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        getContentPane().add(jpBarra);
        getContentPane().add(jbGo);
        jbGo.addActionListener(this);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        Gui maria = new Gui();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        HiloBarraprogreso hp = new HiloBarraprogreso(this);
        Thread t = new Thread(hp);
        t.start();
    }

    public JProgressBar getBarra() {
        return jpBarra;
    }

  
}
