/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema11_Conexion;

/**
 *
 * @author VESPERTINO
 */
public interface InterfazDao {
    //LOS METDODOS DEBEN SER ABSTRACTOS
    //metodo que comprueba si se ha dado de alta un cliente
    public abstract boolean darAltaVeleros(Object velero);
    
    //metodo
    public abstract boolean darBajaVeleros(Object velero);
    
    //metodo para comprobar
    public abstract boolean modificarVeleros(Object veleroViejo, Object veleroNuevo);
    
    //metodo recorrer cliente
    public String recorrerVeleros(Object velero);

}
