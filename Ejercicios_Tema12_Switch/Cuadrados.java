package Ejercicios_Tema12_Switch;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


public class Cuadrados extends JFrame {

    //atributos propiedades , paneles y botones
    private JFrame frame = new JFrame();
    private JLayeredPane lpane = new JLayeredPane();
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
    public Cuadrados() {     
        frame.setPreferredSize(new Dimension(1100, 700));
        frame.setLayout(null);//sin layout
        frame.add(lpane, BorderLayout.CENTER);
        lpane.setBounds(0, 0, 1000, 650);
        
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
        lpane.add(panelBlue, new Integer(0), 0);
        lpane.add(panelGreen, new Integer(1), 0);
        lpane.add(panelYellow, new Integer(2), 0);
        lpane.add(panelMagenta, new Integer(3), 0);
        lpane.add(panelPink, new Integer(4), 0);
        lpane.add(panelOrange, new Integer(5), 0);
        lpane.add(panelGray, new Integer(6), 0);
        lpane.add(panelRed, new Integer(7), 0);
        lpane.add(panelWhite, new Integer(8), 0);
        lpane.add(panelCyan, new Integer(9), 0);
        

        frame.pack();//para empaquetar//aprieta los compnentes lo mas posibles para que se vea lo mejor posible
        frame.setTitle("CUADRADOS DENTRO DE CUADRADOS");//ENVIAMOS TITULO
        frame.setLocationRelativeTo(null);//centrar
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//CERRAMOS EJECUCION
        frame.setVisible(true);

    }//fin constructor
    
    //main
    public static void main(String[] args) {
        Cuadrados paneles = new Cuadrados();
        paneles.setVisible(true);
    }//fin main
}//fin clase
