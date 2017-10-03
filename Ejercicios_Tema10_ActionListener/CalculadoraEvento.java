package Ejercicios_Tema10_ActionListener;

/*
 CALCULADORES

 JLABEL CON FONDO BLANCO
 
 0 1 2
 3 4 5
 6 7 8
 9 + - 
 =         ESTE BOTON OCUPARIA LOS 3 ESPACIOS?
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.Image;

public class CalculadoraEvento extends JFrame implements ActionListener {

    //atributos propiedades , paneles y botones
    private JLabel jLabelResultado;//donde iran los numeros, restas, etc ...
    private JButton[] botonesjButton;//para los botones centrales
    private JButton jButtonIgual;//el boton de abajo
    private JPanel jPanel1, jPanel2, jPanel3;//3 paneles
    private int operando1, operando2;
    private char operador;

    //constructor
    public CalculadoraEvento() {
        contruyePanelSuperior();
        contruyePanelCentro();
        contruyePanelInferior();
        construyeBotones();
        contruyeVentana();
    }//fin constructor

    //METODOS PARA CONSTRUIR LOS PANELES
    //PANEL SUPERIOR
    public void contruyePanelSuperior() {
        //instanciamos los objetos
        jPanel1 = new JPanel();
        jPanel1.setLayout(new GridLayout(1, 1,20,20));
        jPanel1.setBackground(Color.WHITE);//ponemos colores a los paneles
        jLabelResultado = new JLabel();
        jLabelResultado.setBackground(Color.WHITE);//ponemos colores a los jlabel
        jLabelResultado = new JLabel("0", SwingConstants.RIGHT);   //Inicalizamos el JLabel a 0 y que aparezca en la derecha
        jPanel1.add(jLabelResultado);
        this.add(jPanel1);//añadimos al panel JFRAME
    }//fin metodo

    //PANEL CENTRAL
    public void contruyePanelCentro() {
        //instanciamos los objetos
        jPanel2 = new JPanel(new GridLayout(4, 3, 10, 10));//4 filas y 3 columnas, 10 PIXELES Y 10 PIXELES
        this.add(jPanel2);//añadimos al panel JFRAME        
    }//fin metodo

    //PANEL INFERIOR
    public void contruyePanelInferior() {
        //instanciamos los objetos
        jPanel3 = new JPanel(new GridLayout(1, 1, 10, 10));//4 filas y 3 columnas, 10 PIXELES Y 10 PIXELES
        this.add(jPanel3);//añadimos al panel JFRAME
    }//fin metodo
    
    //PONEMOS LOS BOTONES
    public void construyeBotones(){
        ////////////////para el segundo panel///////////////////////
        //instanciamos botones del panel central
        botonesjButton = new JButton[12];
        //primeros pondremos los primeros 9
        for (int i = 0; i < 9; i++) {
            botonesjButton[i] = new JButton(Integer.toString(i));
            //botonesjButton[i] = new JButton(i + " ");
            //botones[i]= JButton
            jPanel2.add(botonesjButton[i]);
        }
        //PONEMOS LOS 3 ULTIMOS ELEMENTOS
        botonesjButton[9] = new JButton("9");
        botonesjButton[10] = new JButton("+");
        botonesjButton[11] = new JButton("-");
        jPanel2.add(botonesjButton[9]);
        jPanel2.add(botonesjButton[10]);
        jPanel2.add(botonesjButton[11]);
        jPanel2.setBackground(Color.gray);//ponemos colores a los paneles

        //OTRA FORMA DE PONER BOTONES
        //botonesjButton[0].setText("1");
        //ACCIONES de los botones NUMEROS
        for (int i = 0; i < 12; i++) {
            botonesjButton[i].addActionListener(this);
            //fin listener       
        }//fin for
        
        //////////////////////para el tercer panel///////////////////////
        //instanciamos botones del panel inferior
        jButtonIgual = new JButton("=");
        jButtonIgual.addActionListener(this);
        //añadimos boton al tercer panel
        jPanel3.add(jButtonIgual);
    }

    public void contruyeVentana() {
//        //creamos objeto
//        BorderLayout bl = new BorderLayout();
//        //creamos el panel instanciando el objeto
//        this.getContentPane().setLayout(bl);
//        //colocamos los objetos o paneles en las posiciones
//        //agregamos los paneles al frame principal
//        this.getContentPane().add(jPanel1, BorderLayout.NORTH);
//        this.getContentPane().add(jPanel2, BorderLayout.CENTER);
//        this.getContentPane().add(jPanel3, BorderLayout.SOUTH);
        //Configuramos el frame
        this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.add(jPanel1);   //Añadimos el JPanel al Layout
        this.add(jPanel2);   //Añadimos el JPanel al Layout
        this.add(jPanel3);   //Añadimos el JPanel al Layout
        
        //PARA SACAR LA VENTANA
        //cambiar icono y ponemos otro
        Image icon = new ImageIcon(getClass().getResource("/gfx/award_star_gold_1.png")).getImage();
        this.setIconImage(icon);
        //Para centrar un JFrame en el medio de la ventana podeis utilizar el código:
        this.setLocationRelativeTo(null);//lo centra
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//Cierra la ejecucion
        //adecuarlos al tamaño
        this.pack();
        this.setTitle("Calculadora");//titulo
        //mostramos la ventana
        this.setVisible(true);
        this.setSize(200, 250); //Dimensiones de la ventana
        this.setResizable(false); //Hacemos que no se pueda ampliar
   
        //y que salga maximizado
        //setMaximumSize(null);
        //Para centrar un JFrame en el medio de la ventana podeis utilizar el código:
        //this.setLocationRelativeTo(null);
        //Para abrir para maximizado
        //this.setExtendedState(this.MAXIMIZED_BOTH);
        
    }//fin metodo
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //Creamos un objeto de tipo JButton que reciba el boton pulsado
        //Cada uno de los ifs hara que al clicar en cada boton, aparezca en el JLabel su número correspondiente o
        //su simbolo
        JButton aux = (JButton) e.getSource();
        //System.out.println(aux.getText());
        //cojo el texto
        //String s = jLabelResultado.getText();
        //jLabelResultado.setText(s + aux.getText());

        ////Hacemos la suma
        if (aux.getText().equals("+")) {
            //guardamos el primer operando
            operando1 = Integer.parseInt(jLabelResultado.getText());//cambiamos a int estring recibido
            operador = '+';
            //limpiuo el label
            jLabelResultado.setText("");//ponemos el label a 0
        }
        ////Hacemos la resta
        else if (aux.getText().equals("-")) {
            //guardamos el primer operando
            operando1 = Integer.parseInt(jLabelResultado.getText());//cambiamos a int estring recibido
            operador = '-';
            //limpiuo el label
            jLabelResultado.setText("");//ponemos el label a 0
            
        }else if (aux.getText().equals("=")) {
            if (operador == '+') {
                int dato = operando1 + Integer.parseInt(jLabelResultado.getText());
                jLabelResultado.setText(dato+"");
                operando1 = 0;
                operando2 = 0;
            }else if(operador ==  '-'){
                int dato = operando1 - Integer.parseInt(jLabelResultado.getText());
                jLabelResultado.setText(dato+"");
                operando1 = 0;
                operando2 = 0;
            }
        } else {
            String s = jLabelResultado.getText();
            jLabelResultado.setText(s + aux.getText());
        }

    }//fin metodo
    
    //main
    public static void main(String[] args) {
        CalculadoraEvento ce = new CalculadoraEvento();
        ce.setVisible(true);
    }//fin main

}//fin clase


/*


*/

/*esta es la tercera forma
public void actionPerformed (ActionEvent e);
{
   Object fuente = e.getSource();
   if (fuente==boton1)
      metodoParaBoton1();
   else if (fuente==boton2)
      metodoParaBoton2();
   else if (fuente==boton3)
      metodoParaBoton3();

}
*/