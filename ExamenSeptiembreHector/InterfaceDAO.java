/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenSeptiembreHector;

import java.util.ArrayList;

/**
 *
 * @author VESPERTINO
 */
public interface InterfaceDAO {
    //metodos abstractos
    public abstract boolean darAltaContacto(Contacto contacto);    
    
    public abstract boolean comprobarProvinciaCCAAExiste(Contacto contacto);
    
    public abstract void guardarEscribirContacto();
    
    public abstract void cargarLeerContacto();
    
}
