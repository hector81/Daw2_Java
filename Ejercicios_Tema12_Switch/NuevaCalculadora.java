/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema12_Switch;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/**
 *
 * @author VESPERTINO
 */
public class NuevaCalculadora extends JFrame {

    private JPanel norte, centro, este;
    private JButton[] botonesCentro;
    private JButton botonesOeste1, botonesOeste2, botonesOeste3, botonesOeste4, botonesOeste5, botonesOeste6;
    private JLabel jLabelResultado;

    //panel norte
    public void contruyePanelSuperior() {
        norte = new JPanel();
        //creamos los paneles con layout
        norte.setLayout(new GridLayout(1, 1));      
        jLabelResultado = new JLabel("0", SwingConstants.RIGHT);   //Inicalizamos el JLabel a 0 y que aparezca en la derecha
        norte.setBackground(Color.WHITE);//ponemos colores a los jlabel
        norte.add(jLabelResultado);
        this.add(norte);
    }

    //panel centro
    public void contruyeCentro() {
        centro = new JPanel();
        //creamos los paneles con layout
        centro.setLayout(new GridLayout(4, 3));       
        this.add(centro);
    }

    //panel sur
    public void contruyeEste() {
        este = new JPanel();
        //creamos los paneles con layout
        este.setLayout(new BoxLayout(este, BoxLayout.Y_AXIS));
        
        this.add(este);
    }
    
    public void contruyeVentana() {
        //layout jframe
        this.getContentPane().setLayout(new BorderLayout());
        
        //añadir paneles 
        this.getContentPane().add(norte, BorderLayout.NORTH);
        this.getContentPane().add(centro, BorderLayout.CENTER);
        this.getContentPane().add(este, BorderLayout.EAST);

        //adecuarlos al tamaño
        pack();
        //mostramos la ventana
        setVisible(true);
        setTitle("calculadora");//titulo
        setLocationRelativeTo(null);//lo centra
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    //PONEMOS LOS BOTONES
    public void construyeBotones(){
        ////////////////para el segundo panel///////////////////////
        //creamos los botones, añadimos botones centro
        botonesCentro = new JButton[11];
        for (int i = 0; i < 9; i++) {
            botonesCentro[i] = new JButton((i + 1) + " ");
            //botones[i]= JButton
            centro.add(botonesCentro[i]);
            
        }
        botonesCentro[9] = new JButton("0");
        botonesCentro[10] = new JButton(",");
        centro.add(botonesCentro[9]);
        centro.add(botonesCentro[10]);
        //////////////////////para el tercer panel///////////////////////
        botonesOeste1 = new JButton("*");
        botonesOeste2 = new JButton("+");
        botonesOeste3 = new JButton("-");
        botonesOeste4 = new JButton("/");
        botonesOeste5 = new JButton("=");
        botonesOeste6 = new JButton("CE");
        //añadimos botones 
        este.add(botonesOeste1);
        este.add(botonesOeste2);
        este.add(botonesOeste3);
        este.add(botonesOeste4);
        este.add(botonesOeste5);
        este.add(botonesOeste6);
    }
    //constructor
    public NuevaCalculadora() {
        //llamada a metodo
        this.contruyePanelSuperior();
        this.contruyeCentro();
        this.contruyeEste();
        this.construyeBotones();
        this.contruyeVentana();
    }//fin constructor

    //main
    public static void main(String[] args) {
        NuevaCalculadora n = new NuevaCalculadora();
        n.setVisible(true);
    }//fin main

}//fin clase
