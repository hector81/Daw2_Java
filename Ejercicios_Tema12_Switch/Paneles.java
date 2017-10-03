/**
 *
 * @author Hector Garcia
 */

package Ejercicios_Tema12_Switch;

import java.awt.*;
import javax.swing.*;

public class Paneles extends JFrame {
    //atributos propiedades , paneles y botones
    private javax.swing.JPanel jPanelNorte, jPanelSur, jPanelOeste, jPanelEste,jPanelCentral;
    //para el norte
    private javax.swing.JButton[]botonesNorte;
    //para el oeste
    private javax.swing.JLabel[]botonesOeste;
    //para el este
    private javax.swing.JCheckBox[]botonesEste;
    //botones parte sur
    private javax.swing.JRadioButton botonesSur1;
    private javax.swing.JRadioButton botonesSur2;
    private javax.swing.JRadioButton botonesSur3;
    //para el centro
    private javax.swing.JButton botonesCentro1;
    private javax.swing.JButton botonesCentro2;
    private javax.swing.JButton botonesCentro3;
    private javax.swing.JButton botonesCentro4;
    private javax.swing.JButton botonesCentro5;
    
    //constructor
    public Paneles(){
        this.contruyePanelInferior();
        this.contruyePanelIzquierdo();
        this.contruyePanelDerecho();
        this.contruyePanelSuperior();
        this.contruyePanelCentro();
        this.contruyeVentana();
    }//fin constructor
    
    //METODOS
    //creamos 10 botones LABEL que ponga opcion1, opcion2...opcion10 . oeste box layour 
    public void contruyePanelIzquierdo(){
        jPanelOeste = new JPanel();//INSTANCIAMOS OBJETO WEST
        jPanelOeste.setBackground(Color.yellow);//ponemos colores a los paneles       
        jPanelOeste.setLayout(new BoxLayout(jPanelOeste, BoxLayout.Y_AXIS));
        botonesOeste = new JLabel[10];//los iniciamos en tamaño 10
        for (int i = 0; i < botonesOeste.length; i++) { //los creamos
            botonesOeste[i]= new JLabel("Opcion" + (i+1));
            jPanelOeste.add(botonesOeste[i]);           
        }
    }

    //crear 5 check, con check1,,,check9-   este  boxlayout
    public void contruyePanelDerecho(){
        jPanelEste = new JPanel();//INSTANCIAMOS OBJETO EAST
        jPanelEste.setBackground(Color.blue);//ponemos colores a los paneles
        jPanelEste.setLayout(new BoxLayout(jPanelEste, BoxLayout.Y_AXIS));
        botonesEste = new JCheckBox[10];//los iniciamos en tamaño 10
        for (int i = 0; i < botonesEste.length; i++) { //los creamos
            botonesEste[i]= new JCheckBox("Check" + (i+1));
            jPanelEste.add(botonesEste[i]);           
        }
    }

    //creamos 3 botones x 0 1 de tipo button null layout sur
    public void contruyePanelInferior(){
        jPanelSur = new JPanel();//INSTANCIAMOS OBJETO SOUTH
        //iniciamos los botones
        botonesCentro1= new JButton();
        botonesCentro2= new JButton();
        botonesCentro3= new JButton();
        //enviamos texto
        botonesCentro1.setText("X");
        botonesCentro2.setText("O");
        botonesCentro3.setText("Y");
        jPanelSur.setLayout(new FlowLayout());
        jPanelSur.setBackground(Color.green);//ponemos colores a los paneles
        jPanelSur.add (botonesCentro1); // Añadimos el botón1                
        jPanelSur.add (botonesCentro2); // Añadimos el botón2
        jPanelSur.add (botonesCentro3); // Añadimos el botón3   
    }
    
    //vamos a crear los botones(10) en la parte norte
    public void contruyePanelSuperior(){
        jPanelNorte = new JPanel();//INSTANCIAMOS OBJETO NORTH
        jPanelNorte.setBackground(Color.red);//ponemos colores a los paneles       
        jPanelNorte.setLayout(new FlowLayout());//enviamos el tipo de LAYOUT que van a ser los botones
        botonesNorte = new JButton[10];//los iniciamos en tamaño 10
        for (int i = 0; i < botonesNorte.length; i++) { //los creamos
            botonesNorte[i]= new JButton((i+1) + " ");
            jPanelNorte.add(botonesNorte[i]);           
        }
    }
  
    public void contruyePanelCentro(){
        //para el centro cardlayout-se podria crear borderlayout para hacer 5 botones
        //en el centro,norte ,sur,este oeste
        //jPanelCentral.setLayout(new CardLayout());//enviamos el tipo de LAYOUT que van a ser los botones
        jPanelCentral = new JPanel();//INSTANCIAMOS OBJETO CENTER
        jPanelCentral.setBackground(Color.pink);//ponemos colores a los paneles
        jPanelCentral.setLayout(null);// Eliminamos el layout
        botonesCentro1= new JButton();
        botonesCentro2= new JButton();
        botonesCentro3= new JButton();
        botonesCentro4= new JButton();
        botonesCentro5= new JButton();
        //enviamos texto
        botonesCentro1.setText("Norte");
        botonesCentro2.setText("Sur");
        botonesCentro3.setText("Este");
        botonesCentro4.setText("Oeste");
        botonesCentro5.setText("Centro");
        //posicionamos
        botonesCentro1.setBounds(600,50,100,50);
        botonesCentro2.setBounds(600,550,100,50);
        botonesCentro3.setBounds(50,300,100,50);
        botonesCentro4.setBounds(1050,300,100,50);
        botonesCentro5.setBounds(600,300,100,50);
        //añadimos al panel
        jPanelCentral.add(botonesCentro1);
        jPanelCentral.add(botonesCentro2); 
        jPanelCentral.add(botonesCentro3); 
        jPanelCentral.add(botonesCentro4); 
        jPanelCentral.add(botonesCentro5); 
        jPanelCentral.setPreferredSize(getMaximumSize());
    }
    
    
    public void contruyeVentana(){
        //creamos el panel principal
        //JFrame frame = new JFrame();
        //creamos objeto
        BorderLayout bl = new BorderLayout();       
        //creamos el panel instanciando el objeto
        this.setLayout(bl);
        //colocamos los objetos o paneles en las posiciones
        //agregamos los paneles al frame principal
        this.getContentPane().add(jPanelNorte,BorderLayout.NORTH);
        this.getContentPane().add(jPanelCentral, BorderLayout.CENTER);
        this.getContentPane().add(jPanelOeste,BorderLayout.WEST);
        this.getContentPane().add(jPanelEste,BorderLayout.EAST);
        this.getContentPane().add(jPanelSur,BorderLayout.SOUTH);
        //Configuramos el frame
        this.pack();//para empaquetar//aprieta los compnentes lo mas posibles para que se vea lo mejor posible
        this.setVisible(true);//para ver
        setLocationRelativeTo(null);//centrar
        this.setTitle("CINCO PANELES. USO DEL BORDERLAYOUT");//ENVIAMOS TITULO
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//CERRAMOS EJECUCION
    }

}//fin clase



