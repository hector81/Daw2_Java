/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenSeptiembreHector;

import static ExamenSeptiembreHector.Utilidades.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VESPERTINO
 */
public class ModeloDAO implements InterfaceDAO{
    private ArrayList<Contacto>lista;
    private ListaContactos lc;

    public ModeloDAO() {
        this.lista = new ArrayList<>();
        cargarLeerContacto();
    }
        
    
    
    //damos de alta al contacto
    @Override
    public boolean darAltaContacto(Contacto contacto) {
        int index = lista.indexOf(contacto);
        if(index == -1){
            lista.add(contacto);
            return true;
        }else {
            return false;
        }
    }

    

    @Override
    public boolean comprobarProvinciaCCAAExiste(Contacto contacto) {
        boolean comp;
        Provincias p = contacto.getProvincia();
        String nombreProvincia = p.getProvincia();
        String nombreCCAA= p.getCcaa();
        comp = comprobarCCAAPROVINCIA(nombreProvincia, nombreCCAA);
        return comp;
    }

    @Override
    public void guardarEscribirContacto() {
        FileOutputStream fo = null;
        ObjectOutputStream oo= null;
        File file = null;      
            
        try {
            file = new File("directorio\\Contactos.txt");
            fo = new FileOutputStream(file);
            oo = new ObjectOutputStream(fo);
            
            oo.writeObject(lista);//guardamos la lista del arraylist
            
            
        } catch (IOException ex) {
            Logger.getLogger(ModeloDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oo.close();
                fo.close();
            } catch (IOException ex) {
                Logger.getLogger(ModeloDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
            
    }

    @Override
    public void cargarLeerContacto() {
        FileInputStream fi = null;
        ObjectInputStream oi= null;
        File file = null;
                
        try {
            file = new File("directorio\\Contactos.txt");
            fi = new FileInputStream(file);
            oi = new ObjectInputStream(fi);
            
            lista = (ArrayList<Contacto>) oi.readObject();
            
        } catch (IOException ex) {
            Logger.getLogger(ModeloDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ModeloDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oi.close();
                fi.close();
            } catch (IOException ex) {
                Logger.getLogger(ModeloDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    
    
}
