/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenSeptiembreHector;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author VESPERTINO
 */
public class Controlador implements ActionListener, WindowListener {
    //atributos
    private ModeloDAO modelo;
    private Vista vista;
    
    //constructor

    public Controlador(ModeloDAO modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.setControlador(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Guardar")){
            if(vista.getNombre() =="" && vista.getApellidos() =="" && vista.getDireccion() =="" ){
                JOptionPane.showMessageDialog(vista, "LOS CAMPOS NOMBRE , APELLIDOS Y DIRECCION NO PUEDEN ESTAR VACIOS");
            }else{
                String nombre;
                String apellidos;
                String direccion;
                String provincia;
                String ccaa;
                //sacamos los datos de la vista
                nombre = vista.getNombre();
                apellidos = vista.getApellidos();
                direccion = vista.getDireccion();
                provincia = vista.getSelectedProvincia();
                ccaa = vista.getSelectedCCAA();
                Provincias provinciaN = new Provincias(provincia, ccaa);
                //creamos contacto
                Contacto contactoNuevo = new Contacto(nombre, apellidos, direccion, provinciaN);
                if (modelo.darAltaContacto(contactoNuevo) == true) {
                    JOptionPane.showMessageDialog(vista, "EL CONTACTO HA SIDO AÑADIDO");
                } else {
                    JOptionPane.showMessageDialog(vista, "EL CONTACTO NO HA SIDO AÑADIDO");
                }
                if(modelo.comprobarProvinciaCCAAExiste(contactoNuevo) == true){
                    JOptionPane.showMessageDialog(vista, "LA CCAA Y LA PROVINCIA COINCIDEN");
                } else {
                    JOptionPane.showMessageDialog(vista, "LA CCAA Y LA PROVINCIA NO COINCIDEN");
                }
            }
        }else if(e.getActionCommand().equals("Limpiar")){
            vista.limpiarCampos();
        }else if(e.getActionCommand().equals("Salir")){            
            System.exit(0);     
            modelo.guardarEscribirContacto();//cada vez que salgamos guardara el archivo 
            JOptionPane.showMessageDialog(vista, "LA LISTA SE GUARDA");
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
        modelo.guardarEscribirContacto();//cada vez que salgamos guardara el archivo 
        JOptionPane.showMessageDialog(vista, "LA LISTA SE GUARDA");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
