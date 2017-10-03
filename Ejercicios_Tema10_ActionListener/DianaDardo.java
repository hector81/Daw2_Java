package Ejercicios_Tema10_ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import javax.swing.*;


/**
 *
 * @author Hector Garcia
 */
public class DianaDardo extends JFrame implements MouseListener{
    //atributos
    private JLabel jLabelDiana, jLabelDardo, jLabelResultado, jLabelPuntuacion;
    private JPanel panelPrincipal, panelDardo;
    private int puntuacionAcumulada =0;
    //constructor
    public DianaDardo(){
        //CREAMOS EL PANEL CON NULL LAYOUT
        panelPrincipal = new JPanel();//instanciamos panel
        panelPrincipal.setLayout(null);//nuul layout
        //panelPrincipal.setBackground(Color.yellow);//ponemos color fondo
        panelPrincipal.setFocusable(true);
        
        //creamos la DIANA
        URL url1 = getClass().getResource("/gfx/diana.png");
        ImageIcon imagenDiana = new ImageIcon(url1);
        jLabelDiana = new JLabel(imagenDiana);
        jLabelDiana.setBounds(60, 60, imagenDiana.getIconWidth(), imagenDiana.getIconHeight());//posicionamos
        
        //CREAMOS EL TEXTO de arriba
        jLabelResultado = new JLabel("mensaje");
        jLabelResultado.setBackground(Color.white);//enviamos color fondo
        jLabelResultado.setBounds(0, 0, 400, 100);//posicionamos    
        
        //CREAMOS EL TEXTO de abajo
        jLabelPuntuacion = new JLabel("Puntuacion: " + puntuacionAcumulada);
        jLabelPuntuacion.setBackground(Color.white);//enviamos color fondo
        jLabelPuntuacion.setBounds(0, 45, 400, 100);//posicionamos
        
        //añadiumos evento
        jLabelDiana.addMouseListener(this);
        
        ///añadimos jlabel
        panelPrincipal.add(jLabelDiana);
        panelPrincipal.add(jLabelResultado);
        panelPrincipal.add(jLabelPuntuacion);
        //añadimos panel principal a JFRAME
        this.add(panelPrincipal);
        panelPrincipal.setSize(500, 500);
        
        
        //ventana
        //this.setComponentZOrder(jLabelDiana, 1);//por defecto pone la diana delante asi que esto
        //es para que salga la diana por detras y el dardo por delante
        //pack();//para empaquetar// NO HACE FALTA
        this.setSize(800, 800);//enviar tamaño
        this.setVisible(true);//para visualizar
        this.setLocationRelativeTo(null);//centramos
        //cambiar icono y ponemos otro
        Image icon = new ImageIcon(getClass().getResource("/gfx/award_star_gold_1.png")).getImage();
        setIconImage(icon);
        //y que salga maximizado
        setMaximumSize(null);
        //Para centrar un JFrame en el medio de la ventana podeis utilizar el código:
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//para cerrar
        
        
    }//fin

    //metodos del mouseraton
    @Override
    public void mouseClicked(MouseEvent e) {      
       jLabelResultado.setText("Has dado en : coordenada X : " + e.getX() + " coordenada Y ; " + e.getY());
       //this.setComponentZOrder(jLabelResultado, 0);
  
        //creamos DARDO dentro del metodo porque sino no apareceria mas que un dardo
        URL url2 = getClass().getResource("/gfx/dardo1.png");
        ImageIcon imagenDardo = new ImageIcon(url2);
        jLabelDardo = new JLabel(imagenDardo);

        //ponemos dardo en el panel
        jLabelDardo.setBounds(e.getX(), e.getY(), 55, 55);
        panelPrincipal.add(jLabelDardo);
        this.setComponentZOrder(jLabelDardo, 0);

        repaint();

        if( ( (e.getX() < 315 && e.getY() > 60) || (e.getX() > 330 && e.getY() < 600) 
              || (e.getX() > 65 && e.getY() > 300  ) || (e.getX() < 585 && e.getY() < 280  )  )   ) {
            puntuacionAcumulada += 10;
            jLabelPuntuacion.setText("Puntuacion : " + puntuacionAcumulada);
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
      jLabelResultado.setText("Has lanzado el dardo"); 
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       jLabelResultado.setText("Has dejado el dardo"); 
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        jLabelResultado.setText("Estas sobre la diana"); 
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        jLabelResultado.setText("No estas sobre la diana"); 
    }
    ////fin metodos del mouseraton
    
    //main
    public static void main(String[] args) {
            new DianaDardo();//llamamos
    }//fin main
    
}//fin clase
