package VeranoRepaso;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Dardo extends JFrame implements MouseListener{
    private JLabel diana, dardo, puntos;
    private JPanel panelNorte, panelSur;
    private Dardo d;

    public Dardo() {
        this.getContentPane().setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(600, 700));
        
        this.panelNorte = new JPanel(new FlowLayout());
        this.panelSur = new JPanel(new FlowLayout());
        panelNorte.setPreferredSize(new Dimension(600, 600));
        panelSur.setPreferredSize(new Dimension(600, 100));
        
        panelNorte.setFocusable(true);
        panelNorte.addMouseListener(this);
        
        URL url= getClass().getResource("/gfx/diana.png");
        ImageIcon im= new ImageIcon(url);       
        this.diana = new JLabel(im);

        this.setComponentZOrder(diana, 1);
        panelNorte.add(diana);
        
        
        this.dardo = dardo;
        
        this.d = d;
        
        this.add(panelNorte, BorderLayout.NORTH);
        this.add(panelSur, BorderLayout.SOUTH);
        
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    
    
    public static void main(String[] args) {
        Dardo d = new Dardo();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
