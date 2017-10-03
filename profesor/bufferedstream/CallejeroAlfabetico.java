/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferedstream;

import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.*;

/**
 *
 * @author Mai
 */
public class CallejeroAlfabetico extends JFrame implements ActionListener, WindowListener {

    private JPanel jpColumna;
    private JLabel jlOrigen, jlORuta, jlDestino, jlDRuta;
    private JFileChooser jfOrigen, jfDestino;
    private JButton jbGo, jbOrigen, jbDestino;
    private File fileLectura;
    private BufferedReader brLector;
    private BufferedWriter[] bwEscritor;

    //constructor
    public CallejeroAlfabetico() {

        jpColumna = new JPanel(new GridLayout(2, 3));
        jfOrigen = new JFileChooser();
        jfDestino = new JFileChooser();
        //SELECCIONAR DIRECTORIOS
        jfDestino.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileLectura = new File("");
        //Para poder elegir solo el directorio
//        jfDestino.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        jlOrigen = new JLabel("Origen");

        jlORuta = new JLabel("");
        jlORuta.setBackground(Color.WHITE);

        jlDestino = new JLabel("Destino");

        jlDRuta = new JLabel("");
        jlDRuta.setBackground(Color.WHITE);

        jbOrigen = new JButton("Selecionar");
        jbOrigen.addActionListener(this);
        jbOrigen.setAlignmentX(CENTER_ALIGNMENT);

        jbDestino = new JButton("Guardar donde");
        jbDestino.addActionListener(this);
        jbDestino.setAlignmentX(CENTER_ALIGNMENT);

        jbGo = new JButton("Aceptar");
        jbGo.setAlignmentX(CENTER_ALIGNMENT);
        jbGo.addActionListener(this);

        jpColumna.add(jlOrigen);
        jpColumna.add(jlORuta);
        jpColumna.add(jbOrigen);
        jpColumna.add(jlDestino);
        jpColumna.add(jlDRuta);
        jpColumna.add(jbDestino);

        this.addWindowListener(this);
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        getContentPane().add(jpColumna);

        getContentPane().add(jbGo);

        //encabezado e icono de la ventana
        setTitle("Callejero");
        Image logo = new ImageIcon(getClass().getResource("/bufferedstream/pin.png")).getImage();
        this.setIconImage(logo);
        
        //
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    //getters / setters
    public JFileChooser getJfOrigen() {
        return jfOrigen;
    }

    public void setJfOrigen(JFileChooser jfOrigen) {
        this.jfOrigen = jfOrigen;
    }

    public JFileChooser getJfDestino() {
        return jfDestino;
    }

    public void setJfDestino(JFileChooser jfDestino) {
        this.jfDestino = jfDestino;
    }

    public File getFileLectura() {
        return fileLectura;
    }

    //métodos y eventos
    @Override
    public void actionPerformed(ActionEvent e) {
        //botón origen
        if (e.getSource() == jbOrigen) { 
            asignarOrigen();
            
        } else if (e.getSource() == jbDestino) { //botón destino
            asignarDestino();
        
        } else if ((jlORuta.getText() != "") && (jlDRuta.getText() != "")) {
            //si las rutas de origen y destino NO están vacías, ejecutar código
            ejecutar();

        } else { //error de rutas vacias
            JOptionPane.showMessageDialog(this, "Rellene primero las rutas de origen y destino");
        }
    }

    private void asignarOrigen() {
        int returnVal;
        returnVal = jfOrigen.showOpenDialog(this);
        //botón "aceptar" del jfchooser
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                fileLectura = jfOrigen.getSelectedFile();
                jlORuta.setText(fileLectura.getPath());
                brLector = new BufferedReader(new FileReader(fileLectura.getPath()));
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "No se encontró el archivo de lectura");
            }
        } else if (returnVal == JFileChooser.CANCEL_OPTION) { //botón "cancelar"
            
        } else {
            JOptionPane.showMessageDialog(this, "Error");
        }
    }

    private void asignarDestino() {
        int returnVal;
        returnVal = jfDestino.showSaveDialog(this);
        //aceptar
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                String destino = "";
                destino = jfDestino.getSelectedFile().toString();
                jlDRuta.setText(destino);
                bwEscritor = new BufferedWriter[26];
                char letra = 65;
                for (int i = 0; i < bwEscritor.length; i++) {
                    bwEscritor[i] = new BufferedWriter(new FileWriter(destino + "//" + letra + ".txt"));
                    letra++;
                }

            } catch (IOException ex) {
                Logger.getLogger(CallejeroAlfabetico.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (returnVal == JFileChooser.CANCEL_OPTION) { //cancelar

        } else {
            JOptionPane.showMessageDialog(this, "Error");
        }
    }

    private void ejecutar() {
        int aux;
        try {
            //coger primera línea del archivo de lectura
            String linea = brLector.readLine();
            char letraLinea; // letra de la calle
            while (linea != null) { //comprobar que linea es distinto de null
                letraLinea = linea.charAt(10); //coger primera letra de la calle
                if (Character.isLetter(letraLinea)) { //si es una letra del alfabeto:
                    letraLinea = Character.toUpperCase(letraLinea); //convertir en mayus
                    aux = letraLinea - 65; 
                    bwEscritor[aux].write(linea);
                    bwEscritor[aux].newLine();
                }
                //asignar a linea la siguiente linea de texto del archivo de lectura
                linea = brLector.readLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(CallejeroAlfabetico.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this, "Fin");
    }

    //main
    public static void main(String[] args) {
        CallejeroAlfabetico ca = new CallejeroAlfabetico();
    }

    //window
    @Override
    public void windowOpened(WindowEvent we) {
        System.out.println("windowOpened");
    }

    @Override
    public void windowClosing(WindowEvent we) {
        try {
            brLector.close();
            for (int i = 0; i<bwEscritor.length ; i++) {
                bwEscritor[i].close();
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error");
        } catch (NullPointerException np) {
            JOptionPane.showMessageDialog(this, "Error al cerrar el buffer");
        }
    }

    @Override
    public void windowClosed(WindowEvent we) {
        System.out.println("WindowClosed");
    }

    @Override
    public void windowIconified(WindowEvent we) {
        System.out.println("windowIconified");
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        System.out.println("windowDeiconified");
    }

    @Override
    public void windowActivated(WindowEvent we) {
        System.out.println("windowActivated");
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        System.out.println("windowDeactivated");
    }

}
