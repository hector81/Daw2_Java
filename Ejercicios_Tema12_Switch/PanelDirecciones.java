/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema12_Switch;



/**
 *
 * @author VESPERTINO
 */
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class PanelDirecciones extends JFrame{
    //atributos propiedades
    private javax.swing.JPanel[] botones;
    //constructor
    public PanelDirecciones(){
        botones = new JPanel[5];
        //poner el layoit que queramos utilizar. BorderLayout
        this.getContentPane().setLayout(new BorderLayout());
        
        //iniciamos botones
        JButton Norte = new JButton("Norte");
        JButton Oeste = new JButton("Oeste");
        JButton Centro = new JButton("Centro");
        JButton Este = new JButton("Este");
        JButton Sur = new JButton("Sur");
        //ponemos los botones
        add(Centro, BorderLayout.CENTER);
        add(Norte, BorderLayout.NORTH);
        add(Sur, BorderLayout.SOUTH);
        add(Oeste, BorderLayout.WEST);
        add(Este, BorderLayout.EAST);
        
        //adecuarlos al tamaño
       pack();
       //mostramos la ventana
       this.setVisible(true);
       this.setTitle("DIRECCIONES CARDINALES");//titulo
       this.setLocationRelativeTo(null);//lo centra
       this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//paramos ejecucion
        
        
    }//fin constructor
    
    
}//fin clase


