/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema10_Buffer;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.lang.Thread.sleep;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class BolaRebote extends JFrame implements ActionListener, KeyListener, Runnable {

    //Atributos

    private JPanel jPanelNorte , jPanelCentral, jPanelSur;
    private JLabel jLabelBola, jLabelBarra, jLabelPuntuacion, jLabelGameOver, JLabelFondo, JlabelIcono
            , JLabelTitulo, JLabelImagenIzquierda,JLabelImagenDerecha,JLabelFondoNorte,JLabelFondoSur;
    private int puntuacionAcumulada = 0;
    private static BolaRebote bola;
    private boolean infinito = true; //lo iniciamos a true para que el movimiento
    //en principio sea infinito
    //Coordenadas bola
    private int posicionXBola = 150;
    private int posicionYBola = 145;
    private int velocidadXBola = 20;
    private int velocidadYBola = 20;
    //Coordenadas barra
    private int posicionXBarra = 325;
    private int posicionYBarra = 565;
    private int velocidadXBarra = 0;
    private int velocidadYBarra = 0;

    //CONSTRUCTOR
    public BolaRebote() {
        //instamos 3 paneles
        jPanelNorte = new JPanel();
        jPanelCentral = new JPanel();
        jPanelSur = new JPanel();
        
        //Creamos el titulo
        JLabelTitulo = new JLabel("GOLPEA LA BOLA CON EL TACO");
        JLabelTitulo.setFont(new Font("Courier New", Font.ITALIC, 25));
        JLabelTitulo.setForeground(Color.magenta);
        JLabelTitulo.setAlignmentX(LEFT_ALIGNMENT);//alineamos al centro
        
        //añadimos jlabels a panel
        jPanelNorte.add(JLabelTitulo);//añadimos bola al panel central
        
        //Creamos icono
        URL url4 = getClass().getResource("/gfx/billar-imagen-animada-0003.gif");
        ImageIcon imagenTitulo = new ImageIcon(url4);
        JlabelIcono = new JLabel(imagenTitulo);
        JlabelIcono.setAlignmentX(RIGHT_ALIGNMENT);//alineamos al centro
        
        //añadimos jlabels a panel
        jPanelNorte.add(JlabelIcono);//añadimos el fondo
               
        //creamos la bola con una imagen en el jlabel
        URL url1 = getClass().getResource("/gfx/bolaBillar.gif");
        ImageIcon imagenBola = new ImageIcon(url1);
        jLabelBola = new JLabel(imagenBola);
        //ponemos coordenadas x e y , y tambien height y width a la bola
        jLabelBola.setBounds(posicionXBola, posicionYBola, imagenBola.getIconWidth(), imagenBola.getIconHeight());
        
        //añadimos jlabels a panel
        jPanelCentral.add(jLabelBola);//añadimos bola al panel central
        
        //creamos la borra con una imagen en el jlabel
        URL url2 = getClass().getResource("/gfx/tacoBillar3.png");
        ImageIcon imagenBarra = new ImageIcon(url2);
        jLabelBarra = new JLabel(imagenBarra);
        jLabelBarra.setSize(125, 29);
        //ponemos coordenadas x e y , y tambien height y width a la barra
        jLabelBarra.setBounds(posicionXBarra, posicionYBarra, imagenBarra.getIconWidth(), imagenBarra.getIconHeight());
        
        //añadimos jlabels a panel
        jPanelCentral.add(jLabelBarra);//añadimos barra al panel
        
        //CREAMOS EL TEXTO de abajo
        jLabelPuntuacion = new JLabel("Puntuacion: " + puntuacionAcumulada);
        jLabelPuntuacion.setBackground(Color.white);//enviamos color fondo
        jLabelPuntuacion.setBackground(Color.WHITE);
        jLabelPuntuacion.setAlignmentX(CENTER_ALIGNMENT);//alineamos al centro
        
        //añadimos jlabels a panel
        jPanelSur.add(jLabelPuntuacion);//añadimos puntuacion al panel
        
        //creamos el fondo centro
        URL url3 = getClass().getResource("/gfx/fondos1.jpg");
        ImageIcon imagenFondo = new ImageIcon(url3);
        JLabelFondo = new JLabel(imagenFondo);
        JLabelFondo.setBounds(0, 0, imagenFondo.getIconWidth(), imagenFondo.getIconHeight());//posicionamos
        
        //añadimos jlabels a panel
        jPanelCentral.add(JLabelFondo);//añadimos el fondo
        
        //creamos el fondo norte
        URL url5 = getClass().getResource("/gfx/sss.png");
        ImageIcon imagenFondoNorte = new ImageIcon(url5);
        JLabelFondoNorte = new JLabel(imagenFondoNorte);
        JLabelFondoNorte.setBounds(0, 0, imagenFondoNorte.getIconWidth(), imagenFondoNorte.getIconHeight());//posicionamos
        //añadimos jlabels a panel
        this.add(JLabelFondoNorte);//añadimos el fondo
              
        
        //creamos el game over que saltara cuando se acabe el juego
        jLabelGameOver = new JLabel();
        jLabelGameOver.setBounds(300, 300, 400, 100); 
        jLabelGameOver.setFont(new Font("Courier New", Font.ITALIC, 25));
        jLabelGameOver.setForeground(Color.magenta);
        jLabelGameOver.setAlignmentX(LEFT_ALIGNMENT);//alineamos al centro
        jPanelCentral.add(jLabelGameOver);
        
        //enviamos el layout a jframe
        getContentPane().setLayout(new BorderLayout());        
        this.getContentPane().add(jPanelNorte,BorderLayout.NORTH);
        this.getContentPane().add(jPanelCentral, BorderLayout.CENTER);
        this.getContentPane().add(jPanelSur,BorderLayout.SOUTH);
        
        //CARACTERISTICAS PANEL NORTE
        jPanelNorte.setLayout(new BoxLayout(jPanelNorte, BoxLayout.X_AXIS));
        //CARACTERISTICAS PANEL CENTRAL
        jPanelCentral.setPreferredSize(new Dimension(960, 606));//ponemos dimensiones al panel frame
        jPanelCentral.setLayout(null);//ponemos null layout al panel
        jPanelCentral.addKeyListener(this);//añadimos accion al panel
        //para que ala arrrancar la aplicacion ya se quede marcado la accion el evento que ejecuta la accion
        //donde se va a centrar la accion
        jPanelCentral.setFocusable(true);
        
        //CARACTERISTICAS PANEL SUR
        jPanelSur.setLayout(new FlowLayout());

        //para la ventana
        this.pack();//empaquetamos
        Image icon = new ImageIcon(getClass().getResource("/gfx/bomb.png")).getImage();
        this.setIconImage(icon);
        this.setTitle("JUEGO PELOTA BILLAR");//titulo
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cerrar despues de cerrar la ejecucion
        this.setLocationRelativeTo(null);//centrar
        this.setVisible(true);//visualizar
    }

    public static void main(String[] args) {
        //instanciamos objeto
        bola = new BolaRebote();
        Thread t = new Thread(bola);//creamos objeto de hilo y le pasamos objeto bola
        t.start();//para que se ejeCute nada mas correr el programa

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Thread t = new Thread(bola);//creamos objeto de hilo y le pasamos objeto bola
        //t.start();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //Thread t = new Thread(bola);//creamos objeto de hilo y le pasamos objeto bola
        //t.start();
    }//FIN keyTyped

    @Override  //Se ejecuta cuando el usuario presiona una tecla.
    public void keyPressed(KeyEvent e) {
        //try {

        if (e.getKeyCode() == 37) {//significa mover a la izquierda

            if (posicionXBarra > 0) {
                posicionXBarra = posicionXBarra - 10;
            }
            if (posicionXBarra < 0) {
                posicionXBarra = posicionXBarra + 10;   //poner la velocidad de la barra                 
            }

            //sleep(20);
            jLabelBarra.setLocation(posicionXBarra, posicionYBarra);
        } else if (e.getKeyCode() == 39) {//significa mover a la derecha  

            if (posicionXBarra < this.getWidth() - jLabelBarra.getWidth()) {
                posicionXBarra = posicionXBarra + 10;
            }
            if (posicionXBarra > this.getWidth() - jLabelBarra.getWidth()) {
                posicionXBarra = posicionXBarra - 10;
            }
            //sleep(20);
            jLabelBarra.setLocation(posicionXBarra, posicionYBarra);
        }
//        } catch (InterruptedException ex) {
//            Logger.getLogger(BolaRebote1.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//FIN  keyPressed

    @Override //Se ejecuta cuando el usuario libera una tecla
    public void keyReleased(KeyEvent e) {

    }//FIN keyReleased

    @Override
    public void run() {
        try {
            while (infinito) {//esto lo ponemos para que el movimiento sea infinito
                //si la posicion de X es mayor que el limite de height x menos el tamaño de
                //bola rebota, lo del tamaño de la bola se lo ponemos porque si no se sale
                //ESTO PARA CUANDO LA BOLA GOLPEE LAS PAREDES
                if (posicionXBola >= this.getWidth() - (jLabelBola.getWidth()+20)) { // x++ * y++ GOLPEA ARRIBA
                    velocidadXBola = -20;//disminuimos X
                } 
                if (posicionXBola <= 0) {         // x++ - y--  GOLPEA IZQUIERDA
                    velocidadXBola = 20; //aumentamos X
                }
                if (posicionYBola > this.getHeight() - (jLabelBola.getHeight()+110)) { // x-- * y++  GOLPEA ABAJO
                    velocidadYBola = -20;//disminuimos Y
                    //                    infinito = false;
                    //jLabelGameOver.setText("GAME OVER");
                } 
                if (posicionYBola <= 0 ) {
                    velocidadYBola = 20; //disminuimos Y
                }
                
                //ESTO PARA CUANDO LA BOLA SEA INTERCEPTADA POR LA BARRA
                if (posicionXBola  + jLabelBarra.getHeight()/2  >= posicionXBarra && posicionYBola == posicionYBarra ){
                    velocidadYBola = -50;
                    velocidadXBola = -50;
                }
                if (posicionXBola  + jLabelBarra.getHeight()/2  >= posicionXBarra && posicionYBola  == posicionYBarra ){
                    velocidadYBola = -50;
                    velocidadXBola = 50;
                } 
                

///if (jLabelBola.getLocation().y + jLabelBarra.getHeight() == jLabelBarra.getLocation().y + 40
////comprobar que choquen en altura
////comprobar que choca dentro del rango de la barra
//&& jLabelBola.getLocation().x + jLabelBarra.getHeight()/ 2 > jLabelBarra.getLocation().x
//&& jLabelBola.getLocation().x + jLabelBarra.getHeight() / 2 < jLabelBarra.getLocation().x 
//+ jLabelBarra.getWidth()) 
                
                //USAMOS ACUMULADORES PARA CAMBIAR LA VELOCIDAD HACIA ARRIBA O ABAJO
                posicionXBola += velocidadXBola;
                posicionYBola += velocidadYBola;
                jLabelBola.setLocation((jLabelBola.getLocation().x + velocidadXBola), jLabelBola.getLocation().y + velocidadYBola);
                //repintamos
                //repaint();
                sleep(100);
                //ira sumando puntos mientras la pelota siga moviendose
                if (infinito = true) {
                    puntuacionAcumulada += 1;
                } else {
                    puntuacionAcumulada += 0;
                }
                //enviamos la puntuacion
                jLabelPuntuacion.setText("Puntuacion : " + puntuacionAcumulada);
            }//fin while
        } catch (InterruptedException ex) {
            Logger.getLogger(BolaRebote.class.getName()).log(Level.SEVERE, null, ex);
        }//fin catch

    }//fin run
}//fin clase