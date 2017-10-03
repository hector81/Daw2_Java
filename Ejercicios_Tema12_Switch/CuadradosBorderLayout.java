/*
IMPLEMENTAR UN PROGRAMA HACIENDO USO DE SWING QUE MUESTRE UNA VENTANA CON UN BORDERLAYOUT
DONE EL PANEL NORTE, AMRILLO, OESTE VERDE, ESTE AZUL Y SUR NARANJA
POSTERIORMENTE EN EL PANEL CENTRAL MEDIANTE UN BORDER LAYOUT MOSTRARQA OTRA VEZ
INTERNAMENTE NORTE AUZUL Y HACER SUCSIVAMENTE 10 CON U BUCLE

APLICACIONES mdi
*/
package Ejercicios_Tema12_Switch;

/**
 *
 * @author Hector Garcia
 */
import java.awt.*;
import javax.swing.*;
 
public class CuadradosBorderLayout extends JFrame {
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
    //atributos propiedades , paneles y botones
    private JPanel panelBlue = new JPanel();
    private JPanel panelGreen = new JPanel();
    private JPanel panelYellow = new JPanel();
    private JPanel panelMagenta = new JPanel();
    private JPanel panelPink = new JPanel();
    private JPanel panelOrange = new JPanel();
    private JPanel panelGray = new JPanel();
    private JPanel panelRed = new JPanel();
    private JPanel panelWhite = new JPanel();
    private JPanel panelCyan = new JPanel();
     
    //constructor
    public CuadradosBorderLayout(){
        this.contruyePanelInferior();
        this.contruyePanelIzquierdo();
        this.contruyePanelDerecho();
        this.contruyePanelSuperior();
        this.contruyeVentana();
    }//fin constructor
     
    //METODOS
    //creamos 10 botones LABEL que ponga opcion1, opcion2...opcion10 . oeste box layour 
    public void contruyePanelIzquierdo(){
        jPanelOeste = new JPanel();//INSTANCIAMOS OBJETO WEST
        jPanelOeste.setBackground(Color.yellow);//ponemos colores a los paneles       
    }
 
    //crear   este  
    public void contruyePanelDerecho(){
        jPanelEste = new JPanel();//INSTANCIAMOS OBJETO EAST
        jPanelEste.setBackground(Color.black);//ponemos colores a los paneles   
    }
 
    //creamos 3 botones x 0 1 de tipo button null layout sur
    public void contruyePanelInferior(){
        jPanelSur = new JPanel();//INSTANCIAMOS OBJETO SOUTH
        jPanelSur.setBackground(Color.pink);//ponemos colores a los paneles 
    }
     
    //vamos a crear los botones(10) en la parte norte
    public void contruyePanelSuperior(){
        jPanelNorte = new JPanel();//INSTANCIAMOS OBJETO NORTH
        jPanelNorte.setBackground(Color.red);//ponemos colores a los paneles       
    }
   
    
     
     
    public void contruyeVentana(){
        //creamos el panel principal
        this.setPreferredSize(new Dimension(1100, 700));
        this.setLayout(null);//sin layout
        this.setBounds(0, 0, 1000, 650);
        //creamos objeto
        BorderLayout bl = new BorderLayout();       
        //creamos el panel instanciando el objeto
        this.setLayout(null);
        
        panelBlue = new JPanel();
        panelGreen = new JPanel();
        panelYellow = new JPanel();
        panelMagenta = new JPanel();
        panelPink = new JPanel();
        panelOrange = new JPanel();
        panelGray = new JPanel();
        panelRed = new JPanel();
        panelWhite = new JPanel();
        panelCyan = new JPanel();
        
        panelBlue.setLayout(bl);
        panelGreen.setLayout(bl);
        panelYellow.setLayout(bl);
        panelMagenta.setLayout(bl);
        panelPink.setLayout(bl);
        panelOrange.setLayout(bl);
        panelGray.setLayout(bl);
        panelRed.setLayout(bl);
        panelWhite.setLayout(bl);
        panelCyan.setLayout(bl);
        
        
        ////////////////////////////////////////
        ///////CREAMOS PANELES///////////
        ////////////////////////////////////////
        //PANEL 1
        panelBlue.setBackground(Color.BLUE);
        panelBlue.setBounds(0, -10, 1000, 650);
        
        //PANEL 2
        panelGreen.setBackground(Color.GREEN);
        panelGreen.setBounds(45, 15, 900, 600);
        
        //PANEL 3
        panelYellow.setBackground(Color.YELLOW);
        panelYellow.setBounds(95, 40, 800, 550);
        
        //PANEL 4
        panelMagenta.setBackground(Color.MAGENTA);
        panelMagenta.setBounds(140, 65, 700, 500);
        
        //PANEL 5    
        panelPink.setBackground(Color.PINK);
        panelPink.setBounds(190, 90, 600, 450);
        
        //PANEL 6
        panelOrange.setBackground(Color.ORANGE);
        panelOrange.setBounds(240, 115, 500, 400);
        
        //PANEL 7
        panelGray.setBackground(Color.GRAY);
        panelGray.setBounds(290, 140, 400, 350);
        
        //PANEL 8
        panelRed.setBackground(Color.RED);
        panelRed.setBounds(340, 165, 300, 300);
        
        //PANEL 9
        panelWhite.setBackground(Color.WHITE);
        panelWhite.setBounds(390, 190, 200, 250);
        
        //PANEL 10
        panelCyan.setBackground(Color.CYAN);
        panelCyan.setBounds(440, 215, 100, 200);
        
        
        //AÑADIR PANELES
        this.add(panelBlue, new Integer(0), 0);
        this.add(panelGreen, new Integer(1), 0);
        this.add(panelYellow, new Integer(2), 0);
        this.add(panelMagenta, new Integer(3), 0);
        this.add(panelPink, new Integer(4), 0);
        this.add(panelOrange, new Integer(5), 0);
        this.add(panelGray, new Integer(6), 0);
        this.add(panelRed, new Integer(7), 0);
        this.add(panelWhite, new Integer(8), 0);
        this.add(panelCyan, new Integer(9), 0);
        
        ////////////////////////////////////////
        ////////////////////////////////////////
        ////////////////////////////////////////
        
        
        
        //colocamos los objetos o paneles en las posiciones
        //agregamos los paneles al frame principal
        panelBlue.add(jPanelNorte,BorderLayout.NORTH);
        panelBlue.add(jPanelOeste,BorderLayout.WEST);
        panelBlue.add(jPanelEste,BorderLayout.EAST);
        panelBlue.add(jPanelSur,BorderLayout.SOUTH);
        
        panelGreen.add(jPanelNorte,BorderLayout.NORTH);
        panelGreen.add(jPanelOeste,BorderLayout.WEST);
        panelGreen.add(jPanelEste,BorderLayout.EAST);
        panelGreen.add(jPanelSur,BorderLayout.SOUTH);
        
        //para visualizar
        this.pack();//para empaquetar//aprieta los compnentes lo mas posibles para que se vea lo mejor posible
        this.setTitle("CUADRADOS DENTRO DE CUADRADOS");//ENVIAMOS TITULO
        this.setLocationRelativeTo(null);//centrar
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//CERRAMOS EJECUCION
        this.setVisible(true);
        
    }
    
 
}//fin clase




/*


public class NewClass {
    private javax.swing.JPanel[5] jPanelNorte;
    private javax.swing.JPanel[3] jPanelSur;
    private ArrayList<color> colores;
    private ArrayList<posiciones> posicion;
    
    //
    public NewClass(){
    
    //poner border layout
        //crear 5 paneles y en el ultimo poner borderlsoyut
        //volver a crear otros 5 paneles norte sur, oeste, este centro
    }
}

*/























/*



f = figure('Name', 'Complex Border Example');
p = uipanel;
set(p,'position',[.1 .1 .8 .8]);
set(p,'backgroundColor',[1 0 0]);
panels1 = BorderLayout(p,50,50,200,50);
set(panels1.North,'backgroundColor',[0 1 0]);
set(panels1.South,'backgroundColor',[0 0 1]);
set(panels1.East,'backgroundColor',[0 1 1]);
set(panels1.West,'backgroundColor',[1 0 1]);
set(panels1.Center,'backgroundColor',[1 1 0]);

panels2 = BorderLayout(panels1.Center,50,50,50,50);
set(panels2.North,'backgroundColor',[0 .7 0]);
set(panels2.South,'backgroundColor',[0 0 .7]);
set(panels2.East,'backgroundColor',[0 .7 .7]);
set(panels2.West,'backgroundColor',[.7 0 .7]);
set(panels2.Center,'backgroundColor',[.7 .7 0]);

panels3 = BorderLayout(panels1.East,50,50,50,50);
set(panels3.North,'backgroundColor',[0 .5 0]);
set(panels3.South,'backgroundColor',[0 0 .5]);
set(panels3.East,'backgroundColor',[0 .5 .5]);
set(panels3.West,'backgroundColor',[.5 0 .5]);
set(panels3.Center,'backgroundColor',[.5 .5 0]);

panels4 = BorderLayout(panels3.Center,15,15,15,15);
set(panels4.North,'backgroundColor',[0 .3 0]);
set(panels4.South,'backgroundColor',[0 0 .3]);
set(panels4.East,'backgroundColor',[0 .3 .3]);
set(panels4.West,'backgroundColor',[.3 0 .3]);
set(panels4.Center,'backgroundColor',[.3 .3 0]);

*/