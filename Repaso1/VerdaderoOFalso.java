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
public class VerdaderoOFalso extends Pregunta {

    public VerdaderoOFalso(String enunciado, String respuesta) {
        super(enunciado, respuesta);
    }


    @Override
    public Collection opcionesValidas() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Verdadero");
        lista.add("Falso");
        return lista;
    }

    @Override
    public int calculaPuntuacion(String respuesta) {
        if(getRespuesta().equalsIgnoreCase(respuesta))
            return 1;
        else
            return -1;}
    
}
