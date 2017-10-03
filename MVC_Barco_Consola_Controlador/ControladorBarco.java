/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_Barco_Consola_Controlador;

import MVC_Barco_Consola_Modelo.Modelo;
import MVC_Barco_Consola_vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author user
 */
public class ControladorBarco implements ActionListener{
    private Modelo modelo;
    private Vista vista;

    public ControladorBarco(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setControlador(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String boton = e.getActionCommand();
        //
        if (boton.equals("alta")) {
            
            
        } else if (boton.equals("baja")) {
          
        }
        else if (boton.equals("baja")) {
            
        }else if (boton.equals("baja")) {
           
        }else if (boton.equals("cerra")) {
            System.exit(0);//cerramos
        }
    }
    
}
