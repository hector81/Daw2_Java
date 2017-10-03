// un panel y set border layout, meter 3 panales (add panel)(meter un panel
//dentro de un panel que tiene ya un layout metido)
package Ejercicios_Tema12_Switch;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class TresPaneles extends JFrame {
    //atributos propiedades
    private javax.swing.JPanel[] paneles;
    private javax.swing.JPanel panel1,panel2,panel3;
    private javax.swing.JButton[]botonesNorte;
    private javax.swing.JButton[]botonesOeste;
    private javax.swing.JButton botonesCentro;

    //constructor
    public TresPaneles(){
        //iniciamos botones
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        //creamos el panel instanciando el objeto
        BorderLayout bl = new BorderLayout();       
        //enviamos el tipo de layout que queremos
        this.getContentPane().setLayout(bl);

        //ponemos los paneles al panel JFRAME principal      
        getContentPane().add(panel1, BorderLayout.NORTH);
        getContentPane().add(panel2, BorderLayout.WEST);
        getContentPane().add(panel3, BorderLayout.CENTER);
    
        //ponemos colores
        panel1.setBackground(Color.red);
        panel2.setBackground(Color.pink);
        panel3.setBackground(Color.green);
        
        //colocamos el tercer panel porque si no no aparece en la ejecucion
        //ponemos boton central en el panel sin layout
        panel3.setLayout(null);
        botonesCentro = new JButton();
        botonesCentro.setText("Centro");      
        //Colocamos la posición y el tamaño
        botonesCentro.setBounds(135,150,130,50);
        panel3.add(botonesCentro); 
        
       //adecuarlos al tamaño
       pack();
       //mostramos la ventana
       this.setVisible(true);
       this.setTitle("TRES PANELES");//titulo
       this.setLocationRelativeTo(null);//lo centra
       this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//paramos ejecucion
       
       //vamos a crear los botones(9) en la parte norte, el panel norte
        panel1.setLayout(new FlowLayout());//enviamos el tipo de LAYOUT que van a ser los botones
        botonesNorte = new JButton[9];//los iniciamos en tamaño 10
        for (int i = 0; i < botonesNorte.length; i++) { //los creamos
            botonesNorte[i]= new JButton((i +1) + " ");
            panel1.add(botonesNorte[i]);           
        }
        
        //creamos 9 botones BUTTON PARTE OESTE, el panel oeste
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        botonesOeste = new JButton[9];//los iniciamos en tamaño 10
        for (int i = 0; i <= botonesOeste.length; i++) { //los creamos
            botonesOeste[i]= new JButton((i +1) + " ");
            panel2.add(botonesOeste[i]);           
        }
 
    }//fin constructor
}//FIN CLASE
