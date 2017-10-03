/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema11_Conexion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class VelerosSwing extends JFrame implements ActionListener{
    private JPanel panelPrincipal , panelNorte, panelCentro ,panelSur ,panel1,panel2,panel3,panel4,panel5
            ,panel6,panel7,panel8,panel9;
    private JButton botonAlta, botonModificar, botonConsulta, botonAtras, botonSiguiente, botonBaja;
    private JLabel jlabelmatricula, jlabelmaterialConstruccion ,jlabeldescripcion
            ,jlabeleslora ,jlabelmanga , jlabelpuntal ,jlabelmaxTripulacion ,jlabelaño ,jlabelnumMas ;
    private JTextField jtmatricula, jtmaterialConstruccion ,jtdescripcion
            ,jteslora ,jtmanga , jtpuntal ,jtmaxTripulacion ,jtaño ,jtnumMas ;
    private ImplementacionDAOVeleros cursor;
                    
    public VelerosSwing(){
        panelPrincipal = new JPanel(new BorderLayout());
        panelNorte = new JPanel(new FlowLayout());
        panelCentro  = new JPanel(new GridLayout(9,2));
        panelSur = new JPanel(new FlowLayout());
        panel1 = new JPanel(new FlowLayout());  
        panel2 = new JPanel(new FlowLayout()); 
        panel3 = new JPanel(new FlowLayout()); 
        panel4 = new JPanel(new FlowLayout()); 
        panel5 = new JPanel(new FlowLayout()); 
        panel6 = new JPanel(new FlowLayout());
        panel7 = new JPanel(new FlowLayout()); 
        panel8 = new JPanel(new FlowLayout()); 
        panel9 = new JPanel(new FlowLayout()); 
        
        botonAlta = new JButton("ALTA");
        botonModificar = new JButton("MODIFICAR");
        botonConsulta = new JButton("CONSULTA");
        botonAtras = new JButton("ATRAS");
        botonSiguiente = new JButton("SIGUIENTE"); 
        botonBaja = new JButton("BAJA");
        
        botonAlta.addActionListener(this);
        botonModificar.addActionListener(this);
        botonConsulta.addActionListener(this);
        botonAtras.addActionListener(this);
        botonSiguiente.addActionListener(this);
        botonBaja.addActionListener(this);
        
        panelNorte.add(botonAlta);
        panelNorte.add(botonBaja);
        panelNorte.add(botonModificar);
        panelNorte.add(botonConsulta);
        panelSur.add(botonAtras);
        panelSur.add(botonSiguiente);
        
        jlabelmatricula = new JLabel("MATRICULA");
        jlabelmaterialConstruccion = new JLabel("MATERIAL");
        jlabeldescripcion = new JLabel("DESCRIPCION");
        jlabeleslora = new JLabel("ESLORA");
        jlabelmanga = new JLabel("MANGA"); 
        jlabelpuntal = new JLabel("PUNTAL");
        jlabelmaxTripulacion = new JLabel("MAXIMO TRIP"); 
        jlabelaño = new JLabel("AÑO");
        jlabelnumMas = new JLabel("MASTILES");
        
        jtmatricula = new JTextField(20);
        jtmaterialConstruccion = new JTextField(20);
        jtdescripcion = new JTextField(20);
        jteslora = new JTextField(20);
        jtmanga = new JTextField(20); 
        jtpuntal = new JTextField(20);
        jtmaxTripulacion = new JTextField(20);
        jtaño = new JTextField(20);
        jtnumMas = new JTextField(20);
        
        panel1.add(jlabelmatricula);
        panel1.add(jtmatricula);
        panel2.add(jlabelmaterialConstruccion);
        panel2.add(jtmaterialConstruccion);
        panel3.add(jlabeldescripcion);
        panel3.add(jtdescripcion);
        panel4.add(jlabeleslora);
        panel4.add(jteslora);
        panel5.add(jlabelmanga);
        panel5.add(jtmanga);
        panel6.add(jlabelpuntal);
        panel6.add(jtpuntal);
        panel7.add(jlabelmaxTripulacion);
        panel7.add(jtmaxTripulacion);
        panel8.add(jlabelaño);
        panel8.add(jtaño);
        panel9.add(jlabelnumMas);
        panel9.add(jtnumMas);
        
        panelCentro.add(panel1);
        panelCentro.add(panel2);
        panelCentro.add(panel3);
        panelCentro.add(panel4);
        panelCentro.add(panel5);
        panelCentro.add(panel6);
        panelCentro.add(panel7);
        panelCentro.add(panel8);
        panelCentro.add(panel9);
        
        this.add(panelPrincipal);
        
        panelPrincipal.add(panelNorte, BorderLayout.NORTH);
        panelPrincipal.add(panelCentro,BorderLayout.CENTER);
        panelPrincipal.add(panelSur,BorderLayout.SOUTH);
    
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == botonAlta ){
            String matricula = jtmatricula.getText();
            String materialConstruccion= jtmaterialConstruccion.getText();
            String descripcion = jtdescripcion.getText();
            int eslora = Integer.parseInt(jteslora.getText());
            int manga = Integer.parseInt(jtmanga.getText());
            int puntal = Integer.parseInt(jtpuntal.getText());
            int maxTripulacion = Integer.parseInt(jtmaxTripulacion.getText());
            int año = Integer.parseInt(jtaño.getText());
            int numMas = Integer.parseInt(jtnumMas.getText());
            
            //creamos barco
            Veleros aux = new Veleros(matricula,materialConstruccion,descripcion,eslora,manga
                    ,puntal,maxTripulacion,año,numMas);
            if(!cursor.darAltaVeleros(aux)){
                JOptionPane.showMessageDialog(this, "Barco añadido");
            } else{
                JOptionPane.showMessageDialog(this, "Barco no añadido");
            }
            
        }else if (e.getSource() == botonBaja ){
            String matricula = jtmatricula.getText();
            Veleros aux = new Veleros(matricula);
            if(cursor.darAltaVeleros(aux)){
                JOptionPane.showMessageDialog(this, "Barco modificado");
            } else{
                JOptionPane.showMessageDialog(this, "Barco no modificado");
            }
        }else if (e.getSource() == botonModificar ){
        
        }else if (e.getSource() == botonConsulta ){
        
        }else if (e.getSource() == botonAtras ){
        
        }else if (e.getSource() == botonSiguiente ){
        
        }
    }
    
    public static void main(String[] args) {
        VelerosSwing c = new VelerosSwing();
    }
}
