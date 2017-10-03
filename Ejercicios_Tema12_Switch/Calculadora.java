/*
 calculadora  x
1   2   3
4   5   6
7   8   9
0   +   -
hacer tabla con grid
 */
/**
 *
 * @author Hector Garcia
 */
package Ejercicios_Tema12_Switch;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Calculadora extends JFrame{
   private javax.swing.JButton[] botones;
   public Calculadora(){
 	
      botones = new JButton [12];//SON 12 ELEMENTOS
      getContentPane().setLayout(new GridLayout(4,3,5,5)); //5 pixeles y 5 pixeles
      //LA ESTRUCTURA YA ESTA HECHA AHORA LOS PONDREMOS EN ORDEN CRONOLOGICO
      //primeros pondremos los primeros 9
      for (int i = 0; i < 9; i++) {
            botones[i] = new JButton((i+1) + " ");
            //botones[i]= JButton
            add(botones[i]);
        }  
      //PONEMOS LOS 3 ULTIMOS ELEMENTOS
      botones[9] = new JButton("0");
      botones[10] = new JButton("+");
      botones[11]= new JButton("-");
      add(botones[9]);add(botones[10]);add(botones[11]);
      //adecuarlos al tamaño
      pack();
      //mostramos la ventana
      setVisible(true);
      setTitle("calculadora");//titulo
      setLocationRelativeTo(null);//lo centra
      setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      
   }
}
