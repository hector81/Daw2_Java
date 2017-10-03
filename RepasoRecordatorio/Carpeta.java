/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoRecordatorio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;




/**
 *
 * @author user
 */
public class Carpeta {
    //atributos
    private String nombreCarpeta;
    private ArrayList<Apunte> carpetas;
    
    //constructores

    public Carpeta(String nombreCarpeta) {
        this.nombreCarpeta = nombreCarpeta;
        carpetas = new ArrayList<>();
    }
    
    public Carpeta() {
       
    }

    //getters sters
    public String getNombreCarpeta() {
        return nombreCarpeta;
    }

    public void setNombreCarpeta(String nombreCarpeta) {
        this.nombreCarpeta = nombreCarpeta;
    }

    public ArrayList<Apunte> getCarpetas() {
        return carpetas;
    }

    public void setCarpetas(ArrayList<Apunte> carpetas) {
        this.carpetas = carpetas;
    }
    
    public void añadirApunte(Apunte apunte){
        if(carpetas.add(apunte) == false){
            System.out.println("apunte no existe");
        }
        carpetas.add(apunte);
    }
    
    public Apunte dameAsunto(String asunto){
        Apunte auxiliar = new Apunte();
        int indice;
        indice= carpetas.indexOf(auxiliar);
        if(indice!=-1){
            return carpetas.get(indice);
             
        }else{
            return null;
        }
    }
    
    public boolean borrarApunte(String asunto){
        Apunte auxiliar = new Apunte();
        auxiliar.setAsunto(asunto);
        int indice;
        indice= carpetas.indexOf(auxiliar);
        if(indice!=-1){
            carpetas.remove(auxiliar);
             return true;
        }else{
            return false;
        }
    }
    
    public boolean modificarApunte(String asunto, Apunte nuevo){
        Apunte auxiliar = new Apunte();
        auxiliar.setAsunto(asunto);
        int indice;
        indice= carpetas.indexOf(auxiliar);
        if(indice!=-1){
            carpetas.set(indice, nuevo);
             return true;
        }else{
            return false;
        }
    
    }
    
    public Apunte verApunte(String asunto){
        Apunte auxiliar = new Apunte();
        auxiliar.setAsunto(asunto);
        int indice;
        indice= carpetas.indexOf(auxiliar);
        if(indice!=-1){
            return carpetas.get(indice);
             
        }else{
            return null;
        }
    }
    
    public void recorrerApunte(){
        Iterator it = carpetas.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            
        }
    }
    
    public void recorrerFecha(){
        Collections.sort(carpetas);
        recorrerApunte();
    }
    
    public void recorrerFechaHora(){
        OrdenarHoraAsunto by = new OrdenarHoraAsunto();
        Collections.sort(carpetas, by);
        recorrerApunte();
    }
    
    //toequals

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
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
    
    //
    
    
    
}
