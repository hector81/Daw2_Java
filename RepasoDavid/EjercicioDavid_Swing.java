/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoDavid;

import EjerciciosRepaso_Estructurada.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author VESPERTINO
 */
public class EjercicioDavid_Swing extends JFrame implements EjercicioDavid_InterfaceVista{
    
    private JPanel jpanelNorte, jpanelSur, jpanelCentro;
    private JLabel jlcaracter, jllineas, jltotalcaracter, jltotalPalabras, jtTotalCaracterNum, jtTotalPalabrasNum;
    private JTextField  jtCaracter, jtLineas;
    private JButton botonEjecutar;
    
    public EjercicioDavid_Swing(){
        this.getContentPane().setLayout(new BorderLayout());
        
        jpanelNorte = new JPanel(new GridLayout(2, 2));
        jpanelCentro  = new JPanel(new GridLayout(4, 1));
        jpanelSur  = new JPanel(new FlowLayout());
        
        jlcaracter = new JLabel("CARACTER");
        jllineas = new JLabel("LINEAS"); 
        jltotalcaracter = new JLabel("TOTAL CARACTERES"); 
        jltotalcaracter.setAlignmentX(CENTER_ALIGNMENT);
        jltotalPalabras = new JLabel("TOTAL PALABRAS");
        jltotalPalabras.setAlignmentX(CENTER_ALIGNMENT);
                
        jtTotalCaracterNum = new JLabel(); 
        jtTotalCaracterNum.setBackground(Color.WHITE);
        jtTotalPalabrasNum = new JLabel();
        jtTotalPalabrasNum.setBackground(Color.WHITE);
        jtCaracter = new JTextField(20); 
        jtLineas = new JTextField(20); 
    
        botonEjecutar = new JButton("EJECUTAR");
        
        jpanelNorte.add(jlcaracter);
        jpanelNorte.add(jtCaracter);
        jpanelNorte.add(jllineas);
        jpanelNorte.add(jtLineas);
        
        jpanelCentro.add(jltotalcaracter);
        jpanelCentro.add(jtTotalCaracterNum);
        jpanelCentro.add(jltotalPalabras);
        jpanelCentro.add(jtTotalPalabrasNum);
        
        jpanelSur.add(botonEjecutar);
        
        this.add(jpanelNorte, BorderLayout.NORTH);
        this.add(jpanelCentro, BorderLayout.CENTER);
        this.add(jpanelSur, BorderLayout.SOUTH);
        
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        EjercicioDavid_Swing esd = new EjercicioDavid_Swing();
        esd.setVisible(true);
    }

    @Override
    public char getCaracter() {
        String caracter1;
        char ca = 0 ;
        caracter1 = jtCaracter.getText();
        for (int i = 0; i < caracter1.length(); i++) {
            ca = caracter1.charAt(i);
            
        }
        return ca;
    }

    @Override
    public int getLineas() {
        int numeroLineas;
        numeroLineas = Integer.parseInt(jtLineas.getText());
        return numeroLineas;
    }

    @Override
    public void setControlador(Controlador objeto) {
        botonEjecutar.setActionCommand("EJECUTAR");
        botonEjecutar.addActionListener(objeto);
    
    }

    @Override
    public void ponTotalCaracteres(int t) {
        String resultado = Integer.toString(t);
        jtTotalCaracterNum.setText(resultado);
    }

    @Override
    public void ponTotalPalabras(int t) {
        String resultado = Integer.toString(t);
        jtTotalPalabrasNum.setText(resultado);
    }
    
}
