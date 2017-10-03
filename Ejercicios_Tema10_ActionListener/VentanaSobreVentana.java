/*
////3 paneles dentro del mismo panel cadrdlayouyt
//con 3 paneles  y gridlayout
//uno detras de otro
//con nombre   --------------- 2 labels y 2 jtextflied
//y apellidos   -------------
 */
/**
 *
 * @author user
 */
package Ejercicios_Tema10_ActionListener;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class VentanaSobreVentana extends JFrame{
    //propiedades
    private javax.swing.JPanel cardPanel, panelGrid1, panelGrid2, panelGrid3;
    //PARA PANEL 1
    private javax.swing.JLabel nombre, apellidos, titulo1;
    private javax.swing.JTextField texto1, texto2;   
    //PARA PANEL 2
    private javax.swing.JLabel edad, telefono, titulo2;
    private javax.swing.JTextField texto3, texto4;   
    //PARA PANEL 3
    private javax.swing.JLabel domicilio,coche, titulo3;
    private javax.swing.JTextField texto5;
    private javax.swing.JCheckBox cocheCHECK;
    //PARA EL PANEL DE LOS BOTONES
    private javax.swing.JPanel buttonPanel = new JPanel();
    private javax.swing.JButton boton1,boton2,boton3;
    //contador 
    private int contador = 1;
    
    //constructor
    public VentanaSobreVentana() {
        panelGrid1 = new JPanel(new GridLayout(3,2));//2 filas y dos columnas       
        panelGrid2 = new JPanel(new GridLayout(3,2));//2 filas y dos columnas
        panelGrid3 = new JPanel(new GridLayout(3,2));//2 filas y dos columnas
        cardPanel = new JPanel();
        //poner el layoit que queramos utilizar. CardLayout
        //creamos el panel instanciando el objeto        
        CardLayout cl = new CardLayout();
        cardPanel.setLayout(cl);
        
        //añadimos  paneles al JFrame  
        getContentPane().add(cardPanel, BorderLayout.NORTH);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);  
  
        //LA ESTRUCTURA YA ESTA HECHA AHORA LOS PONDREMOS EN ORDEN CRONOLOGICO
        //ponemos colores a los paneles
        panelGrid1.setBackground(Color.yellow);
        panelGrid2.setBackground(Color.pink);
        panelGrid3.setBackground(Color.green);       
        
        //primer panel
        titulo1 = new JLabel("Panel 1");
        //primer elemento
        nombre = new JLabel("NOMBRE:");
        texto1 = new JTextField(20);       
        //segundo elemento
        apellidos = new JLabel("APELLIDOS:");
        texto2 = new JTextField(20);
        
        //segundo panel
        //primer elemento
        edad = new JLabel("EDAD:");
        texto3 = new JTextField(20);
        //segundo elemento
        telefono = new JLabel("TELEFONO:");
        texto4 = new JTextField(20);        
        
        //tercer panel
        //primer elemento
        domicilio = new JLabel("EDAD:");
        texto5 = new JTextField(20);
        //segundo elemento
        coche = new JLabel("TELEFONO:");
        cocheCHECK = new JCheckBox();
        
        
        //añadimos los campos a los paneles
        panelGrid1.add(nombre);
        panelGrid1.add(texto1);
        panelGrid1.add(apellidos);
        panelGrid1.add(texto2);
        panelGrid2.add(edad);
        panelGrid2.add(texto3);
        panelGrid2.add(telefono);
        panelGrid2.add(texto4);
        panelGrid3.add(domicilio);
        panelGrid3.add(texto5);
        panelGrid3.add(coche);
        panelGrid3.add(cocheCHECK);

        //añadimos paneles al panel principal
        cardPanel.add(panelGrid1, "PANEL1");//añadimos el panel y el nombre del panel
        cardPanel.add(panelGrid2, "PANEL2");//añadimos el panel y el nombre del panel
        cardPanel.add(panelGrid3, "PANEL3");//añadimos el panel y el nombre del panel
   
        //Creamos botones
        boton1 = new JButton(">>>");
        boton2 = new JButton("<<<");
        boton3 = new JButton("Cerrar");
        

        //añadimos al panel de botones los botones
        buttonPanel.add(boton2);
        buttonPanel.add(boton1);
        buttonPanel.add(boton3);
        
        //usamos objeto ActionListener
        //accion para pasar ventana
        boton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {               
                if (contador < 3) {
                    contador += 1;//para que coincida con el contador con el panel
                    cl.show(cardPanel, "PANEL" + contador);
                }
            }
        });
        //accion para ir atras en ventana
        boton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (contador > 1) {
                    contador -= 1;//para que coincida con el contador con el panel
                    cl.show(cardPanel, "PANEL" + (contador));
                }
            }
        });
        //accion de boton para cerrar ventana
        boton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {                
                System.exit(0);//cerramos
            }
        });

        pack();//emapaquetamos       
        setBounds(75,75,400,200);
        setVisible(true);//mostramos la ventana
        setTitle("PANEL PRINCIPAL");//titulo
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//para cerrar ejecucion      
        
    }//fin constructor
    
}//fin clase