/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen_Mayo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;

/**
 *
 * @author user
 */
public class Controlador implements ActionListener {
 
    private Vista v;
    private Modelo m;
    private HashSet<Integer> coleccionInt;
    private HashSet<String> coleccionString;
    

    public Controlador(Vista v, Modelo m) {
        this.v = v;
        this.m = m;
        v.setControlador(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("BotonBuscar")) {
            v.selecionarFichero();
        } else if (e.getActionCommand().equals("BotonGo")) {
            coleccionInt = m.filtradoNumeros(v.getFcOrigen());//ok
            v.setOpcion1();
            coleccionString = m.filtraColeccion(coleccionInt);//ok
            v.setOpcion2();
            m.rellenaDestino(coleccionString, v.getRuta(), v.getFcDestinoNombre());
            v.setOpcion3();
        }

    }


}