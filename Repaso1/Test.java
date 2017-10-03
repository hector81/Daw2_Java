/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso1;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author VESPERTINO
 */
public class Test extends Pregunta{
    //atributos
    private int numeroOpciones;
    //construcotres
    public Test(String enunciado, String respuesta, int numeroOpciones) {
        super(enunciado, respuesta);
        this.numeroOpciones= numeroOpciones;
    }
    //getter setterr 

    public int getNumeroOpciones() {
        return numeroOpciones;
    }

    public void setNumeroOpciones(int numeroOpciones) {
        this.numeroOpciones = numeroOpciones;
    }
    
    
    //metodos
    @Override
    public Collection opcionesValidas() {
        ArrayList<String>lista= new ArrayList<>();
        for (int i = 0; i < this.numeroOpciones; i++) {
            lista.add("" + (char)('a'+1));
        }
        return lista;
    }

    @Override
    public int calculaPuntuacion(String respuesta) {
        if(getRespuesta().equalsIgnoreCase(respuesta)){
            return 1;
        }else{
            return 1/this.numeroOpciones;
            
        }
    }
    
}
