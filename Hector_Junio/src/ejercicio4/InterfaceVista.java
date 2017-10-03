/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author VESPERTINO
 */
public interface InterfaceVista {
    //metodos abstractos
    public abstract void getNumeroCarta(int numero);
    
    public abstract void getPaloCarta(String carta);
    
    public abstract String paloQuitar();
        
    public abstract void setControlador(Controlador obj);
}
