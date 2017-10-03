/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema10_ActionListener;


import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.lang.Thread.sleep;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Hector Garcia
 */
public class BolaDirecciones1 extends JFrame implements KeyListener, Runnable {
    //ATRIBUTOS Y PROPIEDADES
    private JPanel jpPanel;
    private JLabel jLabelBola;   
    private static BolaDirecciones1 bola;
    private int movimiento = 0;
    private int x = 300;
    private int y = 300;
    //constructor
    public BolaDirecciones1() {
        //ponemos el frame con flowlayout o BoxLayout para poner los componentes
        this.getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        //instanciamos panel y lo añadimos al JFRAME
        jpPanel = new JPanel();
        this.getContentPane().add(jpPanel);//añadimos panel principal al jframe
        this.getContentPane().setPreferredSize(new Dimension(600, 600));//le ponemos tamaño al jframe
        jpPanel.setLayout(null);//le damos un layout null
        jpPanel.addKeyListener(this);//añadimos accion al panel
        
        //creamos la bola con una imagen en el jlabel
        URL url1 = getClass().getResource("/gfx/bomb.png");
        ImageIcon imagenBola = new ImageIcon(url1);
        jLabelBola = new JLabel(imagenBola);
        jpPanel.add(jLabelBola);//añadimos bola al panel
        //jLabelBola.setBounds(300, 300, imagenBola.getIconWidth(), imagenBola.getIconHeight());//posicionamos
        jLabelBola.setSize(imagenBola.getIconWidth(), imagenBola.getIconHeight());
        jLabelBola.setLocation(x, y);
        //para que ala arrrancar la aplicacion ya se quede marcado la accion el evento que ejecuta la accion
        //donde se va a centrar la accion
        jpPanel.setFocusable(true);
        
        //para ventana
        this.pack();//empaquetamos
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//para cerrar despues de la ejecucion
        this.setLocationRelativeTo(null);//centramos        
        this.setVisible(true);//visualizar
       
    }//fin constructor

    

    //metodo para la accion del raton CON KEYLISTNER
    @Override
    public void keyTyped(KeyEvent e) {
//        Thread t = new Thread(bola);
//        t.start();
    }

    @Override //Se ejecuta cuando el usuario presiona una tecla.
    public void keyPressed(KeyEvent e) {
        try {
            for (int i = 0; i < 10; i++) {
                //int key = e.getKeyCode();
                //recorremos 10 posiciones
                if (e.getKeyCode() == 37) {//significa mover a la izquierda KeyEvent.VK_LEFT
                    if (jLabelBola.getLocation().x <= 0) {//ESTO ES PARA QUE NO SE SALGA LA BOLA
                        x = x - 0;
                    } else {
                        x = x - i;
                    }
                    repaint();
                    sleep(5);
                    jLabelBola.setLocation(x, y); 
                } else if (e.getKeyCode() == 38) {//significa mover arriba  KeyEvent.VK_UP
                    if (jLabelBola.getLocation().y <= 0) {//ESTO ES PARA QUE NO SE SALGA LA BOLA
                        y = y - 0;
                    } else {
                        y = y - i;
                    }
                    repaint();
                    sleep(5);
                    jLabelBola.setLocation(x, y);
                } else if (e.getKeyCode() == 39) {//significa mover a la derecha KeyEvent.VK_RIGHT
                    if (jLabelBola.getLocation().x >= jpPanel.getWidth() - jLabelBola.getWidth()) {
                    //ESTO ES PARA QUE NO SE SALGA LA BOLA
                        x = x + 0;
                    } else {
                        x = x + i;
                    }
                    repaint();
                    sleep(5);
                    jLabelBola.setLocation(x, y);
                } else if (e.getKeyCode() == 40) {//significa mover abajo  KeyEvent.VK_DOWN
                    if (jLabelBola.getLocation().y >= jpPanel.getWidth() - jLabelBola.getWidth()) {
                        //ESTO ES PARA QUE NO SE SALGA LA BOLA
                        y = y + 0;
                    } else {
                        y = y + i;
                    }
                    repaint();
                    sleep(5);
                    jLabelBola.setLocation(x, y);
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(BolaDirecciones1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override   //Se ejecuta cuando el usuario libera una tecla
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) { // x++;
            x = x + 0;//lo ponemos a cero para que se detenga la ejecucion
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) { // x--;
            x = x + 0;
        } else if (e.getKeyCode() == KeyEvent.VK_UP) { // y--;
            y = y + 0;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) { // y++;
            y = y + 0;
        }
        //para volver a mover
        repaint();
        
    }
    
    //keyTyped(KeyEvent e): Se ejecuta cuando el usuario presiona una tecla, pero solo
    //cuando la tecla corresponde a caractéres, teclas especiales como F1, F2 entre 
    //otras no son identificadas.
    
    //metodo para el multihilo  RUNNABLE
    @Override
    public void run() {
        try {
                jLabelBola.setLocation((jLabelBola.getLocation().x + movimiento), 
                        jLabelBola.getLocation().y + movimiento);
                repaint();
                sleep(5);          
        } catch (InterruptedException ex) {
            Logger.getLogger(BolaDirecciones1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    //main
    public static void main(String[] args) {
        bola = new BolaDirecciones1();//instanciamos objeto
    }//fin main

}//fin clase

    
/*

@Override //Se ejecuta cuando el usuario presiona una tecla.
    public void keyPressed(KeyEvent e) {
        //esto es para cada vez que se pulse una tecla se sume el movimiento
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) { // x++;
            movimiento = 1;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) { // x--;
            movimiento = -1;
        } else if (e.getKeyCode() == KeyEvent.VK_UP) { // y--;
            movimiento = -1;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) { // y++;
            movimiento = 1;
        }
        //para volver a mover
        repaint();
            
    }
*/



/*

//declaramos un int con el numero de la tecla pulsada
        int key = e.getKeyCode();
        if(key == 39 ){ //significa mover a la derecha
        
        } 
        
        if(key == 37 ){//significa mover a la izquierda
        
        } 
        
        if(key == 38 ){//significa mover arriba
        
        } 
        
        if(key == 40 ){//significa mover abajo
        
        } 


@Override
    public void keyPressed(KeyEvent e) {
        HiloBola hb = new HiloBola(this);
        Thread t = new Thread(hb);
        t.start();
    }

*/