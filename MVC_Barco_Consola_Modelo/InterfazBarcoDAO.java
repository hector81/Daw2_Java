/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_Barco_Consola_Modelo;

/**
 *
 * @author user
 */
public interface InterfazBarcoDAO {
    
    public abstract boolean darAltaBarco(Barco barco);
            
    public abstract boolean darBajaBarco(String matricula);
     
    public abstract boolean darModificarBarco(String matricula, Barco barcoNuevo);
    
    public abstract Barco setConsulta(Barco barco);
    

}
