/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_Barco_Modelo;

import MVC_Barco_Controlador.ControladorBarco;
import MVC_Barco_Modelo.Barco;

/**
 *
 * @author Hector Garcia
 */
public interface InterfazBarcoDAO {

    public abstract Barco avanzarBarco(Barco barco);
    
    public abstract Barco retrocederBarco(Barco barco);
    
    public abstract boolean darAltaBarco(Barco barco);
            
    public abstract boolean darBajaBarco(String matricula);
     
    public abstract boolean darModificarBarco(String matricula, Barco barcoNuevo);
    
    public abstract Barco setConsulta(Barco barco);
    

}
