/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema12_Switch;




/**
 *
 * @author Hector Garcia
 */
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class BoxLayoutBotones extends JFrame {
    //atributos
    private javax.swing.JButton jb1, jb2, jb3, jb4;
    //constructor
    public BoxLayoutBotones() {
        //poner el boxlayout que queramos utilizar . El primer paramaetro es el pnale y el segundo es la coordenada
        this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        //instanciar componentes
        //instanciar componentes
        jb1 = new JButton("Boton 1");
        jb2 = new JButton("Boton 2");
        jb3 = new JButton("Boton 3");
        jb4 = new JButton("Boton 4");
        //meter los botones
        add(jb1);add(jb2);add(jb3);add(jb4);
        
        //vamos a meter 4 botonoes, si no caben en la pantalla, los empaqueta el jframe
        //para que quepan ADAPTARLO A PANTALLA
        this.pack();//mirar si no hacemos pack
        //mostramos la ventana
        this.setVisible(true);
        //esta linea hay que ponerla para que cierre la ejecucion
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
