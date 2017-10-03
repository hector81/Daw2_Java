/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_Barco_Vista;

import MVC_Barco_Controlador.ControladorBarco;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class VistaSwingBarco extends JFrame implements InterfazVistaBarco{
    //atributos
    private JLabel jlMatricula, jlEslora, jlPrecio;
    private JTextField jtMatricula, jtEslora, jtPrecio;
    private JPanel jpanelNorte, jpanelCentro, jpanelSur, jpanelMatricula, jpanelEslora, jpanelPrecio;
    private JButton jbAlta, jbBaja, jbModificar, jbConsulta, jbSiguiente, jbAtras;
    private ControladorBarco controlador;
    
    //constructor
    public VistaSwingBarco() {
        //instanciamos los paneles y ponemos layout
        this.getContentPane().setLayout(new BorderLayout());
        jpanelNorte = new JPanel(new FlowLayout());
        jpanelCentro = new JPanel(new GridLayout(3, 2)); //3 filas ,2 columnas
        jpanelSur = new JPanel();
        jpanelSur.setLayout(new BoxLayout(jpanelSur, BoxLayout.Y_AXIS));
        
        jpanelMatricula = new JPanel(new FlowLayout());
        jpanelEslora = new JPanel(new FlowLayout());
        jpanelPrecio = new JPanel(new FlowLayout());
        
        //instanciamos los elementos jlabel y y jtexfield
        jlMatricula = new JLabel("MATRICULA"); 
        jlEslora = new JLabel("ESLORA"); 
        jlPrecio = new JLabel("PRECIO");
        jtMatricula = new JTextField(20);
        jtEslora = new JTextField(20);
        jtPrecio = new JTextField(20); 
        
        //instanciamos los botones
        jbAlta = new JButton("ALTA");
        jbBaja = new JButton("BAJA"); 
        jbModificar = new JButton("MODIFICAR"); 
        jbConsulta = new JButton("CONSULTAR"); 
        jbSiguiente = new JButton("SIGUIENTE"); 
        jbAtras = new JButton("ATRAS");
        
        //añadimos a paneles
        jpanelMatricula.add(jlMatricula);
        jpanelMatricula.add(jtMatricula);
        jpanelEslora.add(jlEslora);
        jpanelEslora.add(jtEslora);
        jpanelPrecio.add(jlPrecio);
        jpanelPrecio.add(jtPrecio);
        
        jpanelCentro.add(jpanelMatricula);
        jpanelCentro.add(jpanelEslora);
        jpanelCentro.add(jpanelPrecio);
        
        jpanelNorte.add(jbAlta);
        jpanelNorte.add(jbBaja);
        jpanelNorte.add(jbModificar);
        jpanelNorte.add(jbConsulta);
        
        jpanelSur.add(jbSiguiente);
        jpanelSur.add(jbAtras);
                
        //añadimos al jframe
        this.add(jpanelNorte, BorderLayout.NORTH);
        this.add(jpanelCentro, BorderLayout.CENTER);
        this.add(jpanelSur, BorderLayout.EAST);
        
        //visualizamos
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
    }//fin constructor

    @Override
    public String getMatricula() {
         return jtMatricula.getText();
    }

    @Override
    public int getEslora() {
        int resultado = Integer.parseInt(jtEslora.getText());
        return resultado;
    }

    @Override
    public int getPrecio() {
        int resultado = Integer.parseInt(jtPrecio.getText());
        return resultado;
    }

    @Override
    public void setControlador(ControladorBarco obj) {
        controlador = obj;
        
        jbAlta.setActionCommand("BotonAlta");
        jbAlta.addActionListener(obj);
        jbBaja.setActionCommand("BotonBaja");
        jbBaja.addActionListener(obj);
        jbModificar.setActionCommand("BotonModificar");
        jbModificar.addActionListener(obj);
        jbConsulta.setActionCommand("BotonConsultar");
        jbConsulta.addActionListener(obj);
        jbSiguiente.setActionCommand("BotonSiguiente");
        jbSiguiente.addActionListener(obj);
        jbAtras.setActionCommand("BotonAtras");
        jbAtras.addActionListener(obj);
    }

    @Override
    public void setDatosBarco(String m, int eslora, int precio) {
        jtMatricula.setText(m);
        jtEslora.setText(eslora+"");
        jtPrecio.setText(precio+"");
    }
    
    public void vaciarCampos(){
        jtMatricula.setText("");
        jtEslora.setText("");
        jtPrecio.setText("");
    }

}//fin clase
