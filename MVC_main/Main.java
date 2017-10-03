/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_main;

import MVC_controlador.CalculadoraControlador;
import MVC_modelo.Modelo;
import MVC_vista.VistaConsola;
import MVC_vista.VistaSwing;

/**
 *
 * @author Hector Garcia
 */
public class Main {
    public static void main(String[] args) {
        //VistaSwing vista = new VistaSwing();
        VistaConsola vista = new VistaConsola();
        Modelo modelo = new Modelo();
        CalculadoraControlador calcu = new CalculadoraControlador(vista, modelo);
        vista.iniciarPrograma();
    }
}
