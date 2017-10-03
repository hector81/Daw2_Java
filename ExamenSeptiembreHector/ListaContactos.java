/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenSeptiembreHector;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author VESPERTINO
 */
public class ListaContactos implements Serializable {
    //atributos que contendra los contactos
    private ArrayList<Contacto> listaContactos;
    
    //constructor

    public ListaContactos() {
        this.listaContactos = new ArrayList();
    }
    
    public ArrayList darListaContactosAModelo(){
         return listaContactos;
    }
    
}
