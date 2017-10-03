/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_Barco_Controlador;

import MVC_Barco_Modelo.Barco;
import MVC_Barco_Modelo.ImplementacionBarcoDAO;
import MVC_Barco_Vista.VistaSwingBarco;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ControladorBarco implements ActionListener {
    //Creamos objetos de vista-modelo separados 
    private ImplementacionBarcoDAO modelo;
    private VistaSwingBarco vista;
         
    public ControladorBarco(ImplementacionBarcoDAO modelo,VistaSwingBarco vista ) {
        this.vista = vista;
        this.modelo = modelo;
        vista.setControlador(this);//le pasamos como parametro el objeto Controlador
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String boton = e.getActionCommand();
        if(boton.equals("BotonAlta")){             
            String m = vista.getMatricula();
            int es = vista.getEslora();
            int p = vista.getPrecio();
            Barco b = new Barco(m,es,p);  
            if(modelo.darAltaBarco(b) == true){
                vista.vaciarCampos();
                JOptionPane.showMessageDialog(vista,"Barco añadido.");
            }else{
                JOptionPane.showMessageDialog(vista,"Barco no añadirdo.");
            }
      
        }else if(boton.equals("BotonBaja")){
            String m = vista.getMatricula();
            if(!modelo.darBajaBarco(m) == true){
                vista.vaciarCampos();
                JOptionPane.showMessageDialog(vista,"Barco borrado.");
            }else{
                JOptionPane.showMessageDialog(vista,"Barco no borrado.");
            }
           
        }
        else if(boton.equals("BotonModificar")){
            String m = vista.getMatricula();
            int es = vista.getEslora();
            int p = vista.getPrecio();
            Barco b = new Barco(m,es,p);            
            if(!modelo.darModificarBarco(m,b) == true){
                vista.vaciarCampos();
                JOptionPane.showMessageDialog(vista,"Barco modificado.");
            }else{
                JOptionPane.showMessageDialog(vista,"Barco no modificado.");
            }
          
        }else if(boton.equals("BotonConsultar")){
            String m = vista.getMatricula();
            Barco b = new Barco(m);
            Barco aux;
            if(b != null){
                aux = modelo.setConsulta(b);
                vista.setDatosBarco(aux.getMatricula(), aux.getEslora(), aux.getPrecio());
            }else{
                JOptionPane.showMessageDialog(vista,"Barco no esta en la lista.");
            }
        }
        else if(boton.equals("BotonSiguiente")){
            String m = vista.getMatricula();
            Barco b = new Barco(m);
            
            
            Barco aux;
            if(b != null){
            aux = modelo.avanzarBarco(b);
            vista.setDatosBarco(aux.getMatricula(), aux.getEslora(), aux.getPrecio());
            }
        }
        else if(boton.equals("BotonAtras")){
            String m = vista.getMatricula();
            Barco b = new Barco(m);
          
            Barco aux;
            if(b != null){
            aux = modelo.avanzarBarco(b);
            vista.setDatosBarco(aux.getMatricula(), aux.getEslora(), aux.getPrecio());
            }
        }
    }
    


}
