/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema6_EjemplosInterfaces;



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
    //metodo abstracto rugir
    public abstract String rugir();
    
    //metodo dormir
    public void dormir(){
        System.out.println("zzzzzz");
    }
   
    
    //metodo toString
    @Override
    public String toString() {
        return "Animal{" + "foto=" + foto + ", tipo_comida=" + tipo_comida + ", localizacion=" + localizacion + ", tamanio=" + tamanio + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.foto);
        hash = 79 * hash + Objects.hashCode(this.tipo_comida);
        hash = 79 * hash + Objects.hashCode(this.localizacion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Animal other = (Animal) obj;
        if (this.foto!=other.foto || !Objects.equals(this.tipo_comida, other.tipo_comida) || !Objects.equals(this.localizacion, other.localizacion) ) {
            return false;
        }
            return true;
    }
    
  
}
