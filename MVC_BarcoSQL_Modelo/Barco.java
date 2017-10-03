/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_BarcoSQL_Modelo;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author user
 */
public class Barco implements Serializable{
    //atributos
    private String matricula;
    private int eslora;
    private int precio;
    
    //constructores
    public Barco(String matricula, int eslora, int precio) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.precio = precio;
    }
    
    public Barco(String matricula) {
          this.matricula = matricula;
    }
    
    //getters and setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

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
        final Barco other = (Barco) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return true;
    }
    
    
    
}