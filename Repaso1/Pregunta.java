/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/**
 *
 * @author Hector Garcia
 */
public abstract class Pregunta {
    //atributos
    private String enunciado;
    private String respuesta;
    private int dificultad;
    
    //construcotres
    public Pregunta(String enunciado, String respuesta) {
        this.enunciado = enunciado;
        this.respuesta = respuesta;
        this.dificultad=0;
    }
    
    //getters and setters
    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }
    //metods
    public abstract Collection opcionesValidas();
    
    public abstract  int calculaPuntuacion(String respuesta);

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Pregunta other = (Pregunta) obj;
        if (!Objects.equals(this.enunciado, other.enunciado)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pregunta{" + "enunciado=" + enunciado + ", respuesta=" + respuesta + ", dificultad=" + dificultad + '}';
    }
  
    
}//fin clase
