/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema8_GestionRecordatorios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

/**
 *
 * @author Hector Garcia
 */
public class Carpeta {   
    //campos o atributos
    private String nombreCarpeta;
    private ArrayList<Apunte> coleccion;
    //constructor 
    public Carpeta(String nombreCarpeta) {
        this.nombreCarpeta = nombreCarpeta;
        coleccion = new ArrayList();
    }

    public Carpeta() {
    }
    
    //getters and setters
    public String getNombreCarpeta() {
        return nombreCarpeta;
    }

    public void setNombreCarpeta(String nombreCarpeta) {
        this.nombreCarpeta = nombreCarpeta;
    }

    public ArrayList<Apunte> getColeccion() {
        return coleccion;
    }

    
    public void setColeccion(ArrayList<Apunte> coleccion) {
        this.coleccion = coleccion;
    }
    
    //metodos
    public void añadeApunte(Apunte apunte) {
        System.out.println(apunte);
        coleccion.add(apunte);
    }

    public Apunte dameApunte(String asunto) {
        Apunte aux = new Apunte();
        aux.setAsunto(asunto);
        int indice;
        indice = coleccion.indexOf(aux);
        if (indice != -1) {
            return coleccion.get(indice);
        } else {
            return null;
        }
    }

//borrar nota por su asunto
    public boolean borrarNota(String asunto) {
        Apunte aux = new Apunte();
        aux.setAsunto(asunto);
        if (coleccion.indexOf(aux) != -1) {
            coleccion.remove(coleccion.indexOf(aux));
            return true;
        } else {
            return false;
        }
    }

    //ver nota pos su asunto
    public Apunte verNota(String asunto) {
        Apunte aux = new Apunte();
        aux.setAsunto(asunto);
        if (coleccion.indexOf(aux) != -1) {
            return coleccion.get(coleccion.indexOf(aux));
        } else {
            return null;
        }
    }

    //modificar una nota
    public boolean modificarNota(String asunto, Apunte nuevo) {
        Apunte aux = new Apunte();
        aux.setAsunto(asunto);
        int indice = coleccion.indexOf(aux);

        if (indice != -1) {
            coleccion.set(indice, nuevo);
            return true;
        } else {
            return false;
        }
    }

    public void listadoNatural() { // Mostrar por orden natural, tambien se puede usar por indice
        Collections.sort(coleccion);
        muestraArray();
    }

    private void muestraArray() {
        Iterator it = coleccion.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void listadoHora() {//Mostrar por otro orden
        NotasOrdenadasHora lh = new NotasOrdenadasHora();
        Collections.sort(coleccion, lh);
        muestraArray();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nombreCarpeta);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carpeta other = (Carpeta) obj;
        if (!Objects.equals(this.nombreCarpeta, other.nombreCarpeta)) {
            return false;
        }
        return true;
    }

}
