/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_Barco_Consola_Modelo;

import MVC_Barco_Modelo.ImplementacionBarcoDAO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Modelo implements InterfazBarcoDAO{
    //atributos
    private ArrayList<Barco> coleccion;
    private int index;
    //cosntructor

    public Modelo() {
        this.coleccion = new ArrayList();
        guardarFichero("lista");
    }

    
    
    //metodo para guardar el fichero la coleccion
    public void guardarFichero(String nombreFichero){
        FileOutputStream archivoInput = null;
        ObjectOutputStream objetoInput = null;
        File archivoSalida = null;
        try {
            archivoSalida = new File("directorio\\" + nombreFichero + ".obj");        
            archivoInput = new FileOutputStream(archivoSalida);       
            objetoInput = new ObjectOutputStream(archivoInput);
            //escribimos el objeto o coleccion
            objetoInput.writeObject(coleccion);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ImplementacionBarcoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ImplementacionBarcoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }   finally{
            if(archivoSalida != null){
                try {
                    objetoInput.close();
                } catch (IOException ex) {
                    Logger.getLogger(ImplementacionBarcoDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public void cargarFichero(String nombreFichero) throws IOException{
        FileInputStream archivoInput = null;
        ObjectInputStream objetoInput = null ;
        File archivoSalida = null;
        
        try {
            archivoSalida = new File("/MVC_Barco_Modelo/" + nombreFichero + ".obj");
            archivoInput = new FileInputStream(archivoSalida);
            objetoInput = new ObjectInputStream(archivoInput);
            //machacamos la coleccionBarcos con el array list cargado
            coleccion = (ArrayList<Barco>)objetoInput.readObject();
            objetoInput.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ImplementacionBarcoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ImplementacionBarcoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ImplementacionBarcoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (archivoSalida != null) {
                    objetoInput.close();
                    
                }
        }
            
    }
    
    //metodo para modificar un barco
    @Override
    public boolean darAltaBarco(Barco barco) {
        int indice = coleccion.indexOf(barco);
        if (indice == -1) { //si el barco no existia previamente
            coleccion.add(barco);
            return true;
        } else {
            return false;
        }
    }//fin metodo
   
    //metodo para modificar un barco
    @Override
    public boolean darBajaBarco(String matricula) {
        Barco barco = new Barco(matricula);
        int indice = coleccion.indexOf(barco);
        if (indice != -1) {//si el barco existia previamente
            coleccion.remove(barco);
            return true;
        } else {
            return false;
        }
    }//fin metodo
    
    //metodo para modificar un barco
    @Override
    public boolean darModificarBarco(String matricula, Barco barcoNuevo){
        Barco barcoViejo = new Barco(matricula);
        int indice = coleccion.indexOf(barcoViejo);
        if(indice != -1){
            coleccion.set(indice, barcoNuevo);
            return true;
        }else{
            return false;
        }        
    }//fin metodo
    
    //metodo para consultar
    @Override
    public Barco setConsulta(Barco barco){
        
        int indice = coleccion.indexOf(barco);
        if(indice > -1){
            return coleccion.get(indice);
        }else{
            return null;
        }
    }//fin metodo

   


   
}
