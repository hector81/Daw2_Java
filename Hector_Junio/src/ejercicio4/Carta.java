/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Objects;

/**
 *
 * @author VESPERTINO
 */
public class Carta {
    //atributos
    private int numero;
    private String palo;
    
    //constructor
    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }
    
    //getter setter

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
    
    //equals

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Carta other = (Carta) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if (!Objects.equals(this.palo, other.palo)) {
            return false;
        }
        return true;
    }
    
    //toString

    @Override
    public String toString() {
        return "Carta{" + "numero=" + numero + ", palo=" + palo + '}';
    }
    
    
}
