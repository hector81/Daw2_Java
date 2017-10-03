/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_BarcoSQL_controlador;

import MVC_BarcoSQL_Modelo.Barco;
import MVC_BarcoSQL_Modelo.ConexionBarco;
import MVC_BarcoSQL_Modelo.ImplementacionDaoBarcoSql;
import MVC_BarcoSQL_Vista.VistaSwingBarco;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ControladorBarcoSql implements ActionListener, WindowListener{
    ImplementacionDaoBarcoSql modelo = new ImplementacionDaoBarcoSql();
    VistaSwingBarco vista = new VistaSwingBarco(); 
    
    public ControladorBarcoSql(ImplementacionDaoBarcoSql modelo,VistaSwingBarco vista  ){
        modelo = new ImplementacionDaoBarcoSql();
        vista = new VistaSwingBarco();   
        vista.setControlador(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String boton = e.getActionCommand();
        if(boton.equals("ALTA")){
            String m = vista.getMatricula();
            int es = vista.getEslora();
            int p = vista.getPrecio();
            Barco barco = new Barco(m,es,p);
            if(modelo.darAlta(barco) == true){
                JOptionPane.showMessageDialog(vista,"Barco añadido.");
            }else{
                JOptionPane.showMessageDialog(vista,"Barco no añadido.");
            }
        }else if(boton.equals("BAJA")){
            String m = vista.getMatricula();
            Barco barco = new Barco(m);
            if(modelo.darAlta(barco) == true){
                JOptionPane.showMessageDialog(vista,"Barco eliminado.");
            }else{
                JOptionPane.showMessageDialog(vista,"Barco no eliminado.");
            }
        }else if(boton.equals("MODIFICAR")){
            String m = vista.getMatricula();
            Barco barco = new Barco(m);
            if(modelo.darAlta(barco) == true){
                JOptionPane.showMessageDialog(vista,"Barco modificado.");
            }else{
                JOptionPane.showMessageDialog(vista,"Barco no modificado.");
            }
        }else if(boton.equals("CONSULTAR")){
        
        }

    }

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
        ConexionBarco.cerrarConexion();
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
