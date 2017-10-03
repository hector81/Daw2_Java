/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoRecordatorio;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Archivador {
    //atributos
    private ArrayList<Carpeta> archivador;
    //constructores

    public Archivador(ArrayList<Carpeta> archivador) {
        this.archivador = new ArrayList<>();
    }
    //getters setters

    public ArrayList<Carpeta> getArchivador() {
        return archivador;
    }

    public void setArchivador(ArrayList<Carpeta> archivador) {
        this.archivador = archivador;
    }
    
    //metodos
    public Carpeta dameCarpeta(String nombreCarpeta){
        Carpeta nueva = new Carpeta(nombreCarpeta);
        int indice;
        indice= archivador.indexOf(nueva);
                if(indice !=-1){
                    return archivador.get(archivador.indexOf(nueva));
                }else{
                    return null;
                }
    }
    
    public void añadirCarpeta(Carpeta carpeta){
        if(archivador.add(carpeta)==false){
            System.out.println("no existe carpeta");
        }
        archivador.add(carpeta);
    }
  
    
}
