/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema10_Barco_DAO;

import Ejercicios_Tema10_Barco_Modelo.Barco;

/**
 *
 * @author VESPERTINO
 */
public interface InterfazDAO  {
    //LOS METDODOS DEBEN SER ABSTRACTOS
    //metodo que comprueba si se ha dado de alta un cliente
    public abstract boolean darAltaBarco(Barco barco);
    
    //metodo
    public abstract boolean darBajaBarco(Barco barco);
    
    //metodo para comprobar
    public abstract boolean modificarBarco(Barco barcoViejo, Barco barcoNuevo);
    
    //metodo recorrer cliente
    public abstract Barco recorrerBarco(Barco barco);
    
    //metodo para comprobar que el cliente ya existe
    public abstract int existeBarco(Barco barco);
   
    //metodo para cargar y mostrar los datos del cliente
    public abstract void salvarBarco(String nombreFichero);
    
    //metodo para guardar el cliente
    public abstract void cargarBarco(String nombreFichero);
}//fin clase
