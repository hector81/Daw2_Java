/*
CREAR 25 BOTONES CON UN ARRAY
 */
package Ejercicios_Tema12_Switch;

/**
 *
 * @author Hector Garcia
 */
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class BotonesArray extends JFrame {
    //atributos para crear los botones Jbuton
    private javax.swing.JButton[] botones;
    //constructor
    public BotonesArray() {
        //Iniciamos el tamaño
        botones = new JButton[25];
        //poner el layoit que queramos utilizar. En este caso FlowLayout
        this.getContentPane().setLayout(new FlowLayout());
        for (int i = 0; i < 25; i++) {
            botones[i] = new JButton((i+1) + " ");
            add(botones[i]);
        }
        //vamos a meter 25 botonoes, si no caben en la pantalla, los empaqueta el jframe
        //para que quepan ADAPTARLO A PANTALLA
        pack();//mirar si no hacemos pack
        //mostramos la ventana
        this.setVisible(true);
        //esta linea hay que ponerla para que cierre la ejecucion cuando cerremos 
        //el panel dando a cerrar
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }//fin constructor
    
}//fin clase
