/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenSeptiembreHector;
import static ExamenSeptiembreHector.Utilidades.*;
import Utilidades.Utilidades;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author VESPERTINO
 */
public class Vista extends JFrame implements InterfaceVista{
    private JPanel panelDatos, panelBotones;
    private JComboBox boxProvincias, boxComunidadesAutonomas;
    private JLabel jlNombre, jlApellidos, jlDireccion, jlCCAA, jlProvincia;
    private JTextField jtNombre, jtApellidos, jtDireccion;
    private JButton botonGuardar, botonLimpiar, botonSalir;
    private Controlador control;

    public Vista() {
        this.getContentPane().setLayout(new BorderLayout());
        
        this.panelDatos = new JPanel(new GridLayout(5, 2));
        this.panelBotones = new JPanel(new FlowLayout());
        
        
        this.jlNombre = new JLabel("Nombre");
        jlNombre.setAlignmentX(RIGHT_ALIGNMENT);
        this.jlApellidos = new JLabel("Apellidos");
        jlApellidos.setAlignmentX(RIGHT_ALIGNMENT);
        this.jlDireccion = new JLabel("Dirección");
        jlDireccion.setAlignmentX(RIGHT_ALIGNMENT);
        this.jlCCAA = new JLabel("C.Autónoma");
        jlCCAA.setAlignmentX(RIGHT_ALIGNMENT);
        this.jlProvincia = new JLabel("Provincia");
        jlProvincia.setAlignmentX(RIGHT_ALIGNMENT);
        
        this.jtNombre = new JTextField(20);
        this.jtApellidos = new JTextField(20);
        this.jtDireccion = new JTextField(20);
        
        //añadimos elementos
        this.boxProvincias = new JComboBox();
        ArrayList<String> listaProvincias = new ArrayList<>();
        listaProvincias = provinciasPoner();    
        
        for (int i = 0; i < listaProvincias.size(); i++) {
            boxProvincias.addItem(listaProvincias.get(i));           
        }
        
        
       
        this.boxComunidadesAutonomas = new JComboBox();
        ArrayList<String> listaCCAA1 = new ArrayList<>();//creamos un arraylist
        listaCCAA1 = ccaaPoner();//le pasamos las ccaa del archivo
        ArrayList<String> listaCCAA2 = new ArrayList<>();//creamos otro arraylist y con una hashsetlink en utilidades
        listaCCAA2 = ordenarCCAAAsinRepeticiones(listaCCAA1);//devolvemos el anterior sin repeticiones
        
        for (int i = 0; i < listaCCAA2.size(); i++) {
            boxComunidadesAutonomas.addItem(listaCCAA2.get(i));           
        }
        
        
        
        this.botonGuardar = new JButton("Guardar");
        this.botonLimpiar = new JButton("Limpiar");
        this.botonSalir = new JButton("Salir");
        
        //AÑADIMOS ELEMENTOS A LOS PANELES
        panelDatos.add(jlNombre);
        panelDatos.add(jtNombre);
        panelDatos.add(jlApellidos);
        panelDatos.add(jtApellidos);
        panelDatos.add(jlDireccion);
        panelDatos.add(jtDireccion);
        panelDatos.add(jlCCAA);
        panelDatos.add(boxProvincias);
        panelDatos.add(jlProvincia);
        panelDatos.add(boxComunidadesAutonomas);
        
        panelBotones.add(botonGuardar);
        panelBotones.add(botonLimpiar);
        panelBotones.add(botonSalir);
        
        //AÑADIMOS PANELES AL PRINCIPAL
        this.add(panelDatos,BorderLayout.NORTH);
        this.add(panelBotones,BorderLayout.CENTER);
        
        
        this.pack();//EMPAQUETAMOS
        this.setTitle("Contacto");//PONEMOS TITULO
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);//VISUALIZAMOS
    }

    @Override
    public String getNombre() {
        String nombre;
        nombre = jtNombre.getText();
        return nombre;
    }

    @Override
    public String getApellidos() {
        String apellidos;
        apellidos = jtApellidos.getText();
        return apellidos;
    }

    @Override
    public String getDireccion() {
        String direccion;
        direccion = jtDireccion.getText();
        return direccion;
    }

    @Override
    public void limpiarCampos() {
        jtNombre.setText("");
        jtApellidos.setText("");
        jtDireccion.setText("");
    }
   
    @Override
    public String getSelectedProvincia() {
        String provincia;
        provincia = boxProvincias.getSelectedItem().toString().trim();
        return provincia;
    }

    @Override
    public String getSelectedCCAA() {
        String ccaa;
        ccaa = boxComunidadesAutonomas.getSelectedItem().toString().trim();        
        return ccaa;
    }

    @Override
    public void setControlador(Controlador objeto) {
        control = objeto;
        
        this.botonGuardar.setActionCommand("Guardar");//enviamos accion
        this.botonGuardar.addActionListener(objeto);//añadimos addactionlistener
        this.botonLimpiar.setActionCommand("Limpiar");//enviamos accion
        this.botonLimpiar.addActionListener(objeto);//añadimos addactionlistener
        this.botonSalir.setActionCommand("Salir");//enviamos accion
        this.botonSalir.addActionListener(objeto);//añadimos addactionlistener
    }
    
    public void ponPP(String p){
        jtApellidos.setText(p);
    }

    @Override
    public ArrayList provinciasPoner() {
        FileReader fr = null;
        BufferedReader br= null;
        File file= null;
        String linea ="";
        String nombre="";
        ArrayList<String> listaProvincias = new ArrayList<>();
        try {
            file = new File("directorio\\Provincias");
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            
            linea = br.readLine();
            
            while(linea != null){
                nombre = separarProvincias(linea);//separamos con el metodo
                listaProvincias.add(nombre); //lo añadimos al has
                linea = br.readLine();//volvemos a leer
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Provincias.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Provincias.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                br.close();
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(Provincias.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
          return listaProvincias;
    }

    @Override
    public ArrayList ccaaPoner() {
        FileReader fr = null;
        BufferedReader br= null;
        File file= null;
        String linea ="";
        String nombre="";
        ArrayList<String> listaCCAA = new ArrayList<>();
        try {
            file = new File("directorio\\Provincias");
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            
            linea = br.readLine();
            
            while(linea != null){
                nombre = separarCCAA(linea);//separamos con el metodo
                listaCCAA.add(nombre); //lo añadimos al has
                linea = br.readLine();//volvemos a leer
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Provincias.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Provincias.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                br.close();
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(Provincias.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
          return listaCCAA;
    }

    
    
}
