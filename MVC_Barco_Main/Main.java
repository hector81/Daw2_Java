/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_Barco_Main;

import MVC_Barco_Controlador.ControladorBarco;
import MVC_Barco_Modelo.Barco;
import MVC_Barco_Modelo.ImplementacionBarcoDAO;
import MVC_Barco_Vista.VistaSwingBarco;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {  
         ArrayList<Barco> coleccion = null;
    ImplementacionBarcoDAO modelo = new ImplementacionBarcoDAO(coleccion);
    VistaSwingBarco vista = new VistaSwingBarco();    
    ControladorBarco control= new ControladorBarco(modelo, vista);
    }
}
