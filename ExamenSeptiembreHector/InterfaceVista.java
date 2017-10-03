/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenSeptiembreHector;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author VESPERTINO
 */
public interface InterfaceVista {
    //METODOS ABSTRACTOS
    public abstract String getNombre();
    
    public abstract String getApellidos();
    
    public abstract String getDireccion();
    
    public abstract void limpiarCampos();
    
    public abstract String getSelectedProvincia();
    
    public abstract String getSelectedCCAA();
    
    public abstract void setControlador(Controlador objeto);
    
    public abstract ArrayList provinciasPoner();
    
    public abstract ArrayList ccaaPoner();
}
