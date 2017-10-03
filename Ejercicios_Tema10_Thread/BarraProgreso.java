/*
EJECUTARSE EN UN HILO
JPRGORESBARR

origen   jlabel   buscar
destiono jlabel   destino
    copiar
barra progreso 50%

jfilechooser
 */
package Ejercicios_Tema10_Thread;

import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

/**
 *
 * @author PROF_VESPERTINO
 */
public class BarraProgreso extends JFrame implements ActionListener{
    private JProgressBar jpBarra;
    private JButton jbGo;

    public BarraProgreso() {
        jpBarra = new JProgressBar(0,100);
        jpBarra.setStringPainted(true);
        
        jbGo = new JButton("Copiar");
        jbGo.setAlignmentX(CENTER_ALIGNMENT);
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        getContentPane().add(jpBarra);
        getContentPane().add(jbGo);
        jbGo.addActionListener(this);
        
        //ventana
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        BarraProgreso maria = new BarraProgreso();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        HiloBarraprogreso hp = new HiloBarraprogreso(this);
        Thread t = new Thread(hp);
        t.start();
    }

    public JProgressBar getBarra() {
        return jpBarra;
    }

  
}
