/*
 ENCUESTA
 PREGUTNA
 DOS
 */
package Ejercicios_Tema10_ActionListener;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author VESPERTINO
 */
public class EncuestaAddListener1 extends JFrame {

    //atributos
    private JLabel jlabelPregunta, jlabelSies, jlabelnoes;
    private JButton JbuttonSi, JbuttonNo;
    private JPanel jPanelSiNo;
    private int contadorSi, contadorNo;

    //constructor
    public EncuestaAddListener1() {
        //ENVIAR LAYOUT
        //this.getContentPane().setLayout(new BoxLayout);
        
        //instanciar objetos
        jlabelPregunta = new JLabel("¿SABES PROGRAMAR?");
        jlabelSies = new JLabel("SIES ...");
        jlabelnoes = new JLabel("NOES...");
        JbuttonSi = new JButton("SI");
        JbuttonNo = new JButton("NO");
        //panel instanciar
        jPanelSiNo = new JPanel(new FlowLayout(FlowLayout.CENTER), true);

        //configurar ventana
        getContentPane().setLayout(new GridLayout(4, 1, 10, 10));//metemos el panel
        getContentPane().add(jlabelPregunta);//metemos los label
        getContentPane().add(jlabelSies);//metemos los label
        getContentPane().add(jlabelnoes);//metemos los label

        //metemos los botones
        jPanelSiNo.add(JbuttonSi);
        jPanelSiNo.add(JbuttonNo);

        getContentPane().add(jPanelSiNo);//metemos los label

        //ACCIONES de los botones
        JbuttonSi.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                metodoHacerClickSi();
            }

        });

        JbuttonNo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                metodoHacerClickNo();
            }
        });

        //para  hacer ventana 
        setLocationRelativeTo(null);//para centrar
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        //poner titulo
        setTitle("ENCUESTA PROGRAMACION");
        //cambiar icono
        Image icon = new ImageIcon(getClass().getResource("/gfx/award_star_gold_1.png")).getImage();
        setIconImage(icon);    
        //y que salga maximizado
        setMaximumSize(null);
        
        setVisible(true);

    }//fin constructor

    //metodos para hacer las accioones de los bototnes
    //los metemos fuera del constructor
    private void metodoHacerClickSi() {
        contadorSi++; //sumamos sies
        jlabelSies.setText("SI " + contadorSi);
    }//fin metodo

    private void metodoHacerClickNo() {
        contadorNo++; //sumamos noes
        jlabelnoes.setText("NO " + contadorNo);
    }//fin metodo

    //main
    public static void main(String[] args) {
        EncuestaAddListener1 encuesta = new EncuestaAddListener1();
        encuesta.setVisible(true);

    }//fin main

}//fin clase
