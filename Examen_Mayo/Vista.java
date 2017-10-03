/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen_Mayo;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author user
 */
public class Vista extends JFrame {
private JPanel jpMain, jpTop, jpBottonLeft, jpBottonRight;
    private JButton jbSelect, jbGo;
    private JLabel jlbfich1, jlbfich2;
    private JTextArea jtbfich1, jtbfich2;
    private JCheckBox jcbFirst, jcbSecond, jcbThrid;
    private JFileChooser jfcSelect;
    private File fcOrigen;

    public Vista() {
        jpMain = new JPanel(new BorderLayout());
        getContentPane().add(jpMain);
        jlbfich1 = new JLabel("Fichero 1: ");
        jlbfich2 = new JLabel("Fichero 2: ");
        jtbfich1 = new JTextArea("                 ");
        jtbfich2 = new JTextArea("                 ");
        jbSelect = new JButton("   Seleccionar   ");
        jpTop = new JPanel(new GridLayout(0, 3, 5, 5));
        jpTop.add(jlbfich1);
        jpTop.add(jtbfich1);
        jpTop.add(jbSelect);
        jpTop.add(jlbfich2);
        jpTop.add(jtbfich2);
        jpMain.add(jpTop, BorderLayout.NORTH);

        jbGo = new JButton("    Go!    ");
        jpBottonLeft = new JPanel(new FlowLayout(FlowLayout.CENTER));
        jpBottonLeft.add(jbGo);
        jpMain.add(jpBottonLeft, BorderLayout.WEST);

        jcbFirst = new JCheckBox("Realizacion método FiltrandoNumeros");
        jcbSecond = new JCheckBox("Realizacion método FiltrandoColección");
        jcbThrid = new JCheckBox("Realizacion método FiltrandoColección");
        jpBottonRight = new JPanel();
        jpBottonRight.setLayout(new BoxLayout(jpBottonRight, BoxLayout.Y_AXIS));
        jpBottonRight.add(jcbFirst);
        jpBottonRight.add(jcbSecond);
        jpBottonRight.add(jcbThrid);

        jpMain.add(jpBottonRight, BorderLayout.EAST);

        jfcSelect = new JFileChooser();

        this.setSize(300, 300);
        this.setVisible(true);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setTitle("Ejercicio4 - MVC");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void selecionarFichero() {
        int aux = jfcSelect.showOpenDialog(this);
        if (aux == JFileChooser.APPROVE_OPTION) {
            fcOrigen = jfcSelect.getSelectedFile();
            jtbfich1.setText(fcOrigen.getPath());
            jtbfich2.setText(fcOrigen.getPath());
        }
    }
    
    

    public File getFcOrigen() {
        return fcOrigen;
    }

    public String getRuta() {
        String aux = fcOrigen.getParent();
        return aux;
    }

    public String getFcDestinoNombre() {
        return jtbfich2.getText().trim();
    }

    public void setOpcion1() {
        jcbFirst.setSelected(true);
    }

    public void setOpcion2() {
        jcbSecond.setSelected(true);
    }

    public void setOpcion3() {
        jcbThrid.setSelected(true);
    }

    public void setControlador(Controlador c) {
        jbSelect.setActionCommand("BotonBuscar");
        jbSelect.addActionListener(c);
        jbGo.setActionCommand("BotonGo");
        jbGo.addActionListener(c);
    }

    
    public static void main(String[] args) {
        Vista v = new Vista();
    }
}
