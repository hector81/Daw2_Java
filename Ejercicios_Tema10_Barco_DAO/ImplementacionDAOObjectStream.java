/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema10_Barco_DAO;

import Ejercicios_Tema10_Barco_Modelo.Barco;
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
 * @author VESPERTINO
 */
public class ImplementacionDAOObjectStream implements InterfazDAO{
//atributos  
    private ArrayList<Barco> coleccionBarcos;

    public ImplementacionDAOObjectStream() {
        coleccionBarcos = new ArrayList<Barco>();
        salvarBarco("lista");
    }
    
    

    @Override
    public boolean darAltaBarco(Barco barco) {
        boolean comprobar = false;
       //comprobamos que el cliente exista
        if (!coleccionBarcos.contains(barco) && existeBarco(barco) == 1) {
            coleccionBarcos.add(barco);
            comprobar = true;
            //jTexto1.setText
        } else {
           comprobar = false;
        }
        return comprobar;
    }//fin metodo

    @Override
    public boolean darBajaBarco(Barco barco) {
       boolean comprobar = false;
        int posicion = coleccionBarcos.indexOf(barco);
        if (posicion != -1) {//si el cliente existe
            coleccionBarcos.remove(coleccionBarcos.indexOf(barco));
            comprobar = true;
        } else {
            comprobar = false;
        }
        return comprobar;
    }//fin metodo

    @Override
    public boolean modificarBarco(Barco barcoViejo, Barco barcoNuevo) {
        boolean comprobar = false;
        int indice = coleccionBarcos.indexOf(barcoViejo);
        if (indice != -1) {//si el cliente existe
            coleccionBarcos.set(indice, barcoNuevo);//lo cambiamos
            comprobar = true;
        } else {
            comprobar = false;
        }
        return comprobar;
    }//fin metodo

    @Override
    public Barco recorrerBarco(Barco barco) {
        int indice = coleccionBarcos.indexOf(barco);
        if (indice == -1) {
            return null;
        } else {
            return coleccionBarcos.get(indice);
        }
    }//fin metodo

    @Override //metodo para comprobar que existe barco
    public int existeBarco(Barco barco) {
        int indice = coleccionBarcos.indexOf(barco);
        if(indice != -1){
            return coleccionBarcos.indexOf(barco); 
        }else{
            return -1;
        }
    }//fin metodo

    @Override
    public void salvarBarco(String nombreFichero) {
        // Guardar  la coleccion coleccionBarcos en un fichgero
        // utilizando objectoutputStrean
        ObjectOutputStream salida = null;
        FileOutputStream ficheroSalida = null;
        File fsalida;
        try {
            fsalida = new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Hector_Proyecto\\src\\"
                    + "Ejercicios_Tema10_Barco_DAO\\" + nombreFichero + ".obj");
            ficheroSalida = new FileOutputStream(nombreFichero);
            salida = new ObjectOutputStream(ficheroSalida);
            salida.writeObject(coleccionBarcos);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ImplementacionDAOObjectStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ImplementacionDAOObjectStream.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(ImplementacionDAOObjectStream.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
      
    }//fin metodo

    @Override  ///"C:\\clientesBarco.txt"
    public void cargarBarco(String nombreFichero) {
      // Leer del fichero y cargar la informnacion leida en la coleccion llamada coleccionBarcos
      // usando ObjerctInputStream
        ObjectInputStream entrada = null;
        File fentrada;
        try {
            fentrada = new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Hector_Proyecto\\src\\"
                    + "Ejercicios_Tema10_Barco_DAO\\" + nombreFichero + ".obj");
            entrada =new ObjectInputStream(new FileInputStream(nombreFichero));
            //machacamos la coleccionBarcos con el array list cargado
            coleccionBarcos = (ArrayList<Barco>)entrada.readObject();
            entrada.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ImplementacionDAOObjectStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ImplementacionDAOObjectStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ImplementacionDAOObjectStream.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }//fin metodo
    
}//fin clase
