/*
 clientes   x
nombre  poner campo texto
apellidos  poner campo texto
edad    poner combo box
telefono poner jlist
 */

/**
 *
 * @author hECTOR gARCIA
 */
package Ejercicios_Tema12_Switch;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.WindowConstants;

public class Clientes extends JFrame {
    //propiedades
    private JPanel panel, panelNombre,panelApellidos, panelEdad, panelTelefono ;
    private JLabel nombre, apellidos,edad, telefono;
    private JTextField texto1, texto2;
    private JComboBox edadCombo;
    //creación de los elememtos que componen la lista 
    String[] elementos = {"UNO","DOS","TRES","CUATRO", 
    "CINCO","SEIS","SIETE","OCHO"};      
    private JList telefonoJList;

    //constructor

    public Clientes() {
        panel = new JPanel(new GridLayout(4,2));//4 filas y dos columnas
        //LA ESTRUCTURA YA ESTA HECHA AHORA LOS PONDREMOS EN ORDEN CRONOLOGICO
        //ponemos los paneles
        panelNombre = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelApellidos = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelEdad = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelTelefono = new JPanel(new FlowLayout(FlowLayout.LEFT));
        //nombre
        nombre = new JLabel("NOMBRE:");
        texto1 = new JTextField(20);
        //apellidos
        apellidos = new JLabel("APELLIDOS:");
        texto2 = new JTextField(20);
        
        //edad
        edad = new JLabel("EDAD:");
        // Creacion del JComboBox y añadir los items.
        edadCombo = new JComboBox();
        edadCombo.addItem("1");
        edadCombo.addItem("2");
        edadCombo.addItem("3");
        edadCombo.addItem("4");
        edadCombo.addItem("5");
        edadCombo.addItem("6");
        
        //telefono
        telefono = new JLabel("TELEFONO:");
        //instanciamos la lista creando el objeto
        telefonoJList = new JList(elementos);//se cambia la orientación de presentación y el ajuste 
        telefonoJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); 
        //selecciona un elemento de la lista 
//        Object[] seleccion = telefonoJList.getSelectedValues(); 
        //recoge el indice de los seleccionados 
        int[] indices = telefonoJList.getSelectedIndices(); 
        // aquí se crea el objeto, es decir la barra de desplazamiento 
        JScrollPane barraDesplazamiento = new JScrollPane(telefonoJList); 
        barraDesplazamiento.setBounds(10,30,200,110); 
        
        
        //PANELES
        //añadimos los paneles al panel principal
        panel.add(panelNombre);
        panel.add(panelApellidos);
        panel.add(panelEdad);
        panel.add(panelTelefono);
        
        //añadimos los campos a los paneles
        panelNombre.add(nombre);
        panelNombre.add(texto1);
        panelApellidos.add(apellidos);
        panelApellidos.add(texto2);
        panelEdad.add(edad);
        panelEdad.add(edadCombo);
        panelTelefono.add(telefono);
        panelTelefono.add(barraDesplazamiento);
        
        //añadimos el panel al JFrame
        this.add(panel);
 
        pack();
        //mostramos la ventana
        setVisible(true);
        setTitle("CLIENTES      X");//titulo
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//para cerrar ejecucion

    }//fin main
}//fin clase
