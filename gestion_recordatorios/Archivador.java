/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_recordatorios;

import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author VESPERTINO
 */
public class Archivador {
    //atributos
    private ArrayList <Carpeta> coleccion;
    //constructor
    public Archivador(){
        coleccion = new ArrayList();
    }
    //metodos
    public void añadirCarpeta(Carpeta carpeta){
        coleccion.add(carpeta);//añadimos objeto a la coleccion
    }

    public ArrayList<Carpeta> getColeccion() {
        return coleccion;
    }

    public Carpeta dameCarpeta(String nombre_carpeta) {
        Carpeta aux = new Carpeta(nombre_carpeta);
        int indice =coleccion.indexOf(aux);
        if(indice==-1)
            return null;
        else{  
            return coleccion.get(indice);
        }
    }
    
    public void muestraArrayList() {
        Iterator it = coleccion.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    
}
