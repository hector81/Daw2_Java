/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema6_AnimalAbstracto;



/**
 *
 * @author Hector Garcia
 */
import java.util.Objects;
public abstract class Animal {
    //atributos
    private String foto;
    private String tipo_comida;
    private String localizacion;
    private String tamanio;
    
    //constructor
    public Animal(String foto, String tipo_comida, String localizacion, String tamanio) {
        this.foto = foto;
        this.tipo_comida = tipo_comida;
        this.localizacion = localizacion;
        this.tamanio = tamanio;
    }
    
    //getters and setters
    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTipo_comida() {
        return tipo_comida;
    }

    public void setTipo_comida(String tipo_comida) {
        this.tipo_comida = tipo_comida;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    
    //metodo abstracto comer
    public abstract String comer();
    //metodo dormir
    public void dormir(){
        System.out.println("zzzzzz");
    }
    //metodo abstracto rugir
    public abstract String rugir();
    
    //metodo toString
    @Override
    public String toString() {
        return "Animal{" + "foto=" + foto + ", tipo_comida=" + tipo_comida + ", localizacion=" + localizacion + ", tamanio=" + tamanio + '}';
    }
    
    //metodo equals
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
        final Animal other = (Animal) obj;
        if (!Objects.equals(this.foto, other.foto)) {
            return false;
        }
        if (!Objects.equals(this.tipo_comida, other.tipo_comida)) {
            return false;
        }
        if (!Objects.equals(this.localizacion, other.localizacion)) {
            return false;
        }
        if (!Objects.equals(this.tamanio, other.tamanio)) {
            return false;
        }
        return true;
    }
    
}
