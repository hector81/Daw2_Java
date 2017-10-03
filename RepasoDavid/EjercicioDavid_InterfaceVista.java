/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoDavid;

/**
 *
 * @author VESPERTINO
 */
public interface EjercicioDavid_InterfaceVista {
    //metodo abstractos
    public abstract char getCaracter();    
    public abstract int getLineas();
    public abstract void ponTotalCaracteres(int t);
    public abstract void ponTotalPalabras(int t);
    
    public abstract  void setControlador(Controlador objeto);
}
