/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VeranoTraduccion;

import java.util.Objects;

/**
 *
 * @author user
 */
public class Palabra {
    private String castellano;
    private String ingles;
    private String euskera;

    public Palabra(String castellano, String ingles, String euskera) {
        this.castellano = castellano;
        this.ingles = ingles;
        this.euskera = euskera;
    }

    public String getCastellano() {
        return castellano;
    }

    public void setCastellano(String castellano) {
        this.castellano = castellano;
    }

    public String getIngles() {
        return ingles;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }

    public String getEuskera() {
        return euskera;
    }

    public void setEuskera(String euskera) {
        this.euskera = euskera;
    }

    @Override
    public String toString() {
        return "Palabra{" + "castellano=" + castellano + ", ingles=" + ingles + ", euskera=" + euskera + '}';
    }

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
        final Palabra other = (Palabra) obj;
        if (!Objects.equals(this.castellano, other.castellano)) {
            return false;
        }
        return true;
    }
    
    
}
