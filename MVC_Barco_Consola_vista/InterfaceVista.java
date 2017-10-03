/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_Barco_Consola_vista;

import MVC_Barco_Consola_Controlador.ControladorBarco;
import MVC_Barco_Consola_Modelo.Barco;



/**
 *
 * @author user
 */
public interface InterfaceVista {
    public abstract String getMatricula();
    
    public abstract String getViejaMatricula();
       
    public abstract int getEslora();
    
    public abstract int getPrecio();
    
    public abstract Barco setDatosBarco(String matricula, int eslora, int precio);
    
    public abstract void setControlador(ControladorBarco control);
}
