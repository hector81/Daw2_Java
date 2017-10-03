/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_Barco_Consola_Main;

import MVC_Barco_Consola_Controlador.ControladorBarco;
import MVC_Barco_Consola_Modelo.Modelo;
import MVC_Barco_Consola_vista.Vista;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        Vista vista = new Vista();
        Modelo modelo = new Modelo();
        ControladorBarco control= new ControladorBarco(modelo, vista);
        vista.iniciarPrograma();
        
    }
}
