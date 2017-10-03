/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_BarcoSQL_Modelo;

/**
 *
 * @author user
 */
public interface InterfaceDaoBarco {
    //metodos abstracto
    public abstract boolean darAlta(Object barco);
    
    public abstract boolean darBaja(Object barco);
    
    public abstract boolean darModificar(Object barcoNuevo);
    
    public abstract Object darConsulta(Object barco);
    
    public abstract boolean comprobar(Object barco);
    
 //   public abstract boolean existeBarco(Object barco);
    
}
