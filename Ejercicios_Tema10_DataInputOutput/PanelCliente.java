/*
La clase DataInputStream / DataOutputStream
Dada la clase Cliente implementada en la aplicación de “Alquiler de Amarres”
del tema de Herencia y haciendo uso de las clases DataInputStream y
DataOutputStream, realizar ABMC de la clase Cliente teniendo en cuenta los
siguientes requerimientos:

 El fichero donde guardaremos los datos le llamaremos clientes.dat.
 En el paquete creado para el ejercicio, nos crearemos la clase Cursor-
Cliente que tendrá una colección de tipo ArrayList.
 En dicha clase creamos los métodos: alta, baja, modificación y consulta
que permitirán realizar dichas operaciones
 La aplicación nada mas abrirse cargara los registros de Clientes del fi-
chero en la colección y al cerrarse volcará el contenido del ArrayList
en el fichero pertinente.
 Realizaremos un Jframe para recoger o visualizar los atributos de
cliente. Dicho Jframe usará un borderLayout con panel top y center
únicamente.
 Existirán botones en una barra de herramientas (panel top) en dicha
ventana que cuando se pulsen permitirán hacer operaciones de Altas,
bajas, modificaciones y consultas sobre esa colección
 */
package Ejercicios_Tema10_DataInputOutput;

import java.awt.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class PanelCliente extends JFrame implements ActionListener {
    //atributos    
    //creamos objeto 
    CursorCliente cursor = new CursorCliente();
    private JButton jbConsulta, jbBorrar, jbModificar, jbAñadir, jbAdelante, jbAtras, jbCerrar,jbAceptarAñadir,
            jbAceptarBorrar,jbAceptarModificar ,jbAceptarConsulta;
    private JPanel jpBotonera, jpConsulta, jpBorrar, jpModificar, jpAñadir, jpCard, jpBotonesSur,
            jpBorrarNorte,jpBorrarCentro, jpBorrarSur, jpModificarNorte, jpModificarCentro, jpModificarSur, 
            jpConsultaNorte, jpConsultaSur;
    //JLABEL PARA AÑADIR
    private JLabel jlbNombreAñadir, jlbApellidosAñadir, jlbDniAñadir, jlbEdadAñadir, jlbTituloAñadir;
    //JLABEL PARA BORRAR
    private JLabel jlbDniBorrar, jlbTituloBorrar;
    //JLABEL PARA MODIFICAR
    private JLabel jlbDniModificar, jlbTituloModificar;
    //JLABEL PARA CONSULTA
    private JLabel jlbDniConsulta, jlbTituloConsulta;
    //JTEXTFIELD PARA AÑADIR
    private JTextField jtfNombreAñadir, jtfApellidosAñadir, jtfDniAñadir, jtfEdadAñadir;
    //JTEXTFIELD PARA BORRAR
    private JTextField jtfDniBorrar;
    //JTEXTFIELD PARA MODIFICAR
    private JTextField jtfDniModificar;
    //JTEXTFIELD PARA CONSULTA
    private JTextArea jtaConsulta;
    private JScrollPane jscrollPanelConsulta;

    public PanelCliente() {    
        //CREAMOS LOS PANELES
        jpBotonera = new JPanel(new FlowLayout());
        jpAñadir = new JPanel();
        jpBorrar = new JPanel(new BorderLayout());
        jpBorrarNorte = new JPanel();
        jpBorrarCentro = new JPanel();
        jpBorrarSur = new JPanel();
        
        jpBorrar.add(jpBorrarNorte, BorderLayout.NORTH);
        jpBorrar.add(jpBorrarCentro, BorderLayout.CENTER);
        jpBorrar.add(jpBorrarSur, BorderLayout.SOUTH);
        
        jpModificar = new JPanel(new BorderLayout());
        jpModificarNorte = new JPanel();
        jpModificarCentro = new JPanel();
        jpModificarSur = new JPanel();
        
        jpModificar.add(jpModificarNorte, BorderLayout.NORTH);
        jpModificar.add(jpModificarCentro, BorderLayout.CENTER);
        jpModificar.add(jpModificarSur, BorderLayout.SOUTH);  
        
        jpConsulta = new JPanel(new BorderLayout());
        jpConsultaNorte = new JPanel();
        jpConsultaSur = new JPanel();
        jpConsulta.add(jpConsultaNorte, BorderLayout.NORTH);
        jpConsulta.add(jpConsultaSur, BorderLayout.SOUTH);    
        jpBotonesSur = new JPanel();
        jpCard = new JPanel(new CardLayout());
        
        //ponemos colores a los paneles
//        jpBotonera.setBackground(Color.white);
//        jpBotonesSur.setBackground(Color.white);
//        jpAñadir.setBackground(Color.yellow);
//        jpBorrar.setBackground(Color.pink);
//        jpModificar.setBackground(Color.green);
//        jpConsulta.setBackground(Color.magenta);
            
        //CREAMOS LOS BOTONES PARA EL PANEL NORTE  
        jbAñadir = new JButton("AÑADIR");
        jbBorrar = new JButton("BORRAR");
        jbModificar = new JButton("MODIFICAR");
        jbConsulta = new JButton("CONSULTA");

        //CREAMOS LOS BOTONES PARA EL PANEL SUR        
        jbAtras = new JButton("<<<");
        jbAdelante = new JButton(">>>");
        jbAceptarAñadir = new JButton("AÑADIR CLIENTE");
        jbAceptarBorrar= new JButton("BORRAR CLIENTE");
        jbAceptarModificar = new JButton("MODIFICAR CLIENTE");
        jbAceptarConsulta = new JButton("CONSULTAR CLIENTE");
        jbCerrar = new JButton("CERRAR");

 
        //CREAMOS LOS LABEL POR PANEL AÑADIR
        jlbTituloAñadir = new JLabel("AÑADIR");//PANEL AÑADIR
        jlbNombreAñadir = new JLabel("NOMBRE:");//PANEL AÑADIR
        jlbApellidosAñadir = new JLabel("APELLIDOS:");//PANEL AÑADIR
        jlbEdadAñadir = new JLabel("EDAD:");//PANEL AÑADIR
        jlbDniAñadir = new JLabel("DNI:");//PANEL AÑADIR

        jlbTituloBorrar = new JLabel("PON EL DNI PARA BORRAR");//PANEL BORRAR
        jlbDniBorrar = new JLabel("DNI:");//PANEL BORRAR

        jlbTituloModificar = new JLabel("PON EL DNI PARA PARA MODIFICAR");//PANEL MODIFICAR
        jlbDniModificar = new JLabel("DNI:");//PANEL MODIFICAR

        jlbTituloConsulta = new JLabel("CONSULTA CLIENTES:");//PANEL CONSULTA
        jlbDniConsulta = new JLabel("DNI:");//PANEL CONSULTA

        //CREAMOS LOS JTEXTFIELD POR PANEL AÑADIR
        jtfNombreAñadir = new JTextField();//PANEL AÑADIR
        jtfApellidosAñadir = new JTextField();//PANEL AÑADIR
        jtfEdadAñadir = new JTextField();//PANEL AÑADIR
        jtfDniAñadir = new JTextField();//PANEL AÑADIR

        jtfDniBorrar = new JTextField();//PANEL BORRAR

        jtfDniModificar = new JTextField();//PANEL MODIFICAR
        
        jtaConsulta = new JTextArea();//PANEL CONSULTA
        jscrollPanelConsulta = new JScrollPane(jtaConsulta);

        //PONEMOS LOS LAYOUT DEL JFRAME
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(jpBotonera, BorderLayout.NORTH);
        getContentPane().add(jpCard, BorderLayout.CENTER);
        getContentPane().add(jpBotonesSur, BorderLayout.SOUTH);

        //AÑADIMOS LOS PANALES AL PANEL CENTRO
        jpCard.add(jpAñadir, "Panel añadir");
        jpCard.add(jpBorrar, "Panel borrar");
        jpCard.add(jpModificar, "Panel modificar");
        jpCard.add(jpConsulta, "Panel consultar");

        //añadimos al panel de botones los botones        
        jpBotonesSur.add(jbAtras);
        jpBotonesSur.add(jbAdelante);
        jpBotonesSur.add(jbCerrar);

        //AÑADIMOS LOS BOTONES AL PANEL NORTE
        jpBotonera.add(jbAñadir);
        jpBotonera.add(jbBorrar);
        jpBotonera.add(jbModificar);
        jpBotonera.add(jbConsulta);

        //AÑADIMOS JLABEL Y JTEXTFIELD AL PANEL AÑADIR
        jpAñadir.setLayout(new GridLayout(5, 2));
        jpAñadir.add(jlbTituloAñadir);
        jpAñadir.add(jbAceptarAñadir);
        jpAñadir.add(jlbDniAñadir);
        jpAñadir.add(jtfDniAñadir);
        jpAñadir.add(jlbNombreAñadir);
        jpAñadir.add(jtfNombreAñadir);
        jpAñadir.add(jlbApellidosAñadir);
        jpAñadir.add(jtfApellidosAñadir);
        jpAñadir.add(jlbEdadAñadir);
        jpAñadir.add(jtfEdadAñadir);
        //AÑADIMOS JLABEL Y JTEXTFIELD AL PANEL BORRAR
        jpBorrarNorte.setLayout(new FlowLayout());
        jpBorrarNorte.add(jlbTituloBorrar);
        jpBorrarCentro.setLayout(new GridLayout(1, 2));
        jpBorrarCentro.add(jlbDniBorrar);
        jpBorrarCentro.add(jtfDniBorrar);
        jpBorrarSur.setLayout(new FlowLayout());
        jpBorrarSur.add(jbAceptarBorrar);       
        //AÑADIMOS JLABEL Y JTEXTFIELD AL PANEL MODIFICAR
        jpModificarNorte.setLayout(new FlowLayout());       
        jpModificarNorte.add(jlbTituloModificar);   
        jpModificarCentro.setLayout(new GridLayout(1, 2));
        jpModificarCentro.add(jlbDniModificar);
        jpModificarCentro.add(jtfDniModificar);
        jpModificarSur.setLayout(new FlowLayout());
        jpModificarSur.add(jbAceptarModificar);
        //AÑADIMOS JLABEL Y JTEXTFIELD AL PANEL CONSULTA
        jpConsultaNorte.setLayout(new FlowLayout());       
        jpConsultaNorte.add(jlbTituloModificar);
        jpConsultaSur.setLayout(new FlowLayout());
        jpConsultaSur.add(jscrollPanelConsulta);        
        jpConsultaSur.add(jtaConsulta);
        jpConsultaSur.add(jbAceptarConsulta);
        //jpConsultaSur.add(jscrollPanel);

        //AÑADIMOS ACCION A LOS BOTONES   
        jbAñadir.addActionListener(this);
        jbBorrar.addActionListener(this);
        jbModificar.addActionListener(this);
        jbConsulta.addActionListener(this);
        jbAtras.addActionListener(this);
        jbAdelante.addActionListener(this);
        jbCerrar.addActionListener(this);
        jbAceptarAñadir.addActionListener(this);
        jbAceptarBorrar.addActionListener(this);
        jbAceptarModificar.addActionListener(this);
        jbAceptarConsulta.addActionListener(this);

        //adecuarlos al tamaño
        pack();
        //mostramos la ventana
        this.setVisible(true);//visualizar
        this.setTitle("clientes");//titulo
        this.setLocationRelativeTo(null);//lo centra
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//paramos ejecucion
    }//fin constructor

    //main
    public static void main(String[] args) {
        new PanelCliente();
    }

    @Override//metodo para boton añadir
    public void actionPerformed(ActionEvent e) {
        CardLayout cl = (CardLayout) (jpCard.getLayout());
        if (e.getSource() == jbAñadir) {
            cl.show(jpCard, "Panel añadir");           
        }
        if (e.getSource() == jbBorrar) {
            cl.show(jpCard, "Panel borrar");
        }
        if (e.getSource() == jbModificar) {
            cl.show(jpCard, "Panel modificar");
        }
        if (e.getSource() == jbConsulta) {
            cl.show(jpCard, "Panel consultar");
        }
        if (e.getSource() == jbAdelante) {
            cl.next(jpCard);//adelante
        }
        if (e.getSource() == jbAtras) {
            cl.previous(jpCard);//atras
        }
        
        if (e.getSource() == jbCerrar) {
            System.exit(0);//cerramos
        }
        //si damos al boton añadir
        if (e.getSource() == jbAceptarAñadir) {
            //creamos un cliente auxiliar con los datos pasados en JTEXTFIELD
            Cliente auxCliente = new Cliente();
            auxCliente.setNombre(jtfNombreAñadir.getText());
            auxCliente.setApellidos(jtfApellidosAñadir.getText());
            auxCliente.setDni(Long.valueOf(jtfDniAñadir.getText()));
            auxCliente.setEdad(Integer.parseInt(jtfEdadAñadir.getText()));
            try {
                if (!cursor.darAltaCliente(auxCliente)) {                   
                    JOptionPane.showMessageDialog(this, "Cliente añadido con exito", "OK", 1);
                } else {
                    JOptionPane.showMessageDialog(this, "Ya existe el cliente con este DNI", "Error", 2);
                }
            } catch (IOException ex) {
                Logger.getLogger(PanelCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            ponerEnBlanco();//ponemos en blanco los jtext
        }
        //si damos el boton borrar
        if (e.getSource() == jbAceptarBorrar) {
            //creamos un cliente auxiliar con los datos pasados en JTEXTFIELD
            Cliente auxCliente = new Cliente();
            auxCliente.setDni(Long.valueOf(jtfDniBorrar.getText()));
                //si el cliente existe
                if (!cursor.darBajaCliente(auxCliente)) {
                    JOptionPane.showMessageDialog(this, "Cliente borrado con exito", "OK", 1);
                } else {
                    JOptionPane.showMessageDialog(this, "No existe el cliente con este DNI", "Error", 2);
                }
            //ponemos en blanco los jtext
            ponerEnBlanco();           
        }
        //si damos al boton modificar
        if (e.getSource() == jbAceptarModificar) {
            int dniAUX;
            Cliente aux = new Cliente();
            dniAUX = Integer.parseInt(jtfDniModificar.getText());
            aux.setDni(dniAUX);
            int posicion = cursor.existeCliente(aux);
            ponerEnBlanco();  
            if (posicion != -1) {
                jpAñadir.setComponentZOrder(jpAñadir, 1);
                jpAñadir.setVisible(true);
            }
        }
        //si damos al boton consulta
        if (e.getSource() == jbAceptarConsulta) {
            //jscrollPanel = new JScrollPane(jtaConsulta);
            jtaConsulta.setText(cursor.recorrerCliente());//rellenar el tex Area con lso datos del fichero
            jscrollPanelConsulta.setVisible(false);
            
        }
    }//FIN METODO actionPerformed
    
    public void ponerEnBlanco() {
        jtfNombreAñadir.setText("");
        jtfApellidosAñadir.setText("");
        jtfEdadAñadir.setText("");
        jtfDniAñadir.setText("");
        jtfDniBorrar.setText("");
        jtfDniModificar.setText("");
    }


}//fin clase
