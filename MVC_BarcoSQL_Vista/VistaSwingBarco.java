/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_BarcoSQL_Vista;

import MVC_BarcoSQL_controlador.ControladorBarcoSql;
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
    private ControladorBarcoSql controlador;
    
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
        int eslora = Integer.parseInt(jtEslora.getText());
        return eslora;
    }

    @Override
    public int getPrecio() {
        int precio = Integer.parseInt(jtPrecio.getText());
        return precio;
    }

    @Override
    public void setDatosBarco(String m, int eslora, int precio) {
        jtMatricula.setText(m);
        jtEslora.setText(eslora + "");
        jtPrecio.setText(precio + "");
    }

    @Override
    public void setControlador(ControladorBarcoSql obj) {
        controlador = obj;
        jbAlta.setActionCommand("ALTA");
        jbAlta.addActionListener(obj);
        jbBaja.setActionCommand("BAJA");
        jbBaja.addActionListener(obj);
        jbModificar.setActionCommand("MODIFICAR");
        jbModificar.addActionListener(obj);       
        jbConsulta.setActionCommand("CONSULTAR");
        jbConsulta.addActionListener(obj); 
    }
    
    public void vaciarCampos(){
        jtMatricula.setText("");
        jtEslora.setText("");
        jtPrecio.setText("");
    }
}
