/*
Crear 4 botones con FlowLayout
 */
/**
 *
 * @author Hector Garcia
 */
package Ejercicios_Tema12_Switch;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class FlowBotones extends JFrame{
    //atributos, creamos 4 botones JButton
    private javax.swing.JButton jb1, jb2, jb3, jb4;
    //constructor
    public FlowBotones() {
        //poner el layoit que queramos utilizar. En este caso FlowLayout
        this.getContentPane().setLayout(new FlowLayout());
        //instanciar componentes
        jb1 = new JButton("Boton 1");
        jb2 = new JButton("Boton 2");
        jb3 = new JButton("Boton 3");
        jb4 = new JButton("Boton 4");
        //meter los botones
        add(jb1);add(jb2);add(jb3);add(jb4);
        //vamos a meter 4 botonoes, si no caben en la pantalla, los empaqueta el jframe
        //para que quepan ADAPTARLO A PANTALLA
        //pack();//mirar si no hacemos pack
        //mostramos la ventana
        this.setVisible(true);
        //esta linea hay que ponerla para que cierre la ejecucion
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }//fin constructor
    
}//fin clase
