/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoDavid;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author VESPERTINO
 */
public class Controlador implements ActionListener{
    private EjercicioDavid_ImplementacionDao modelo;
    private EjercicioDavid_Swing vista;
    private VistaConsola vista1;

    public Controlador(EjercicioDavid_ImplementacionDao modelo, EjercicioDavid_Swing vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setControlador(this);
    }
    
   
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("EJECUTAR")){
            char c;
            int numeroLineas;
            
            c = vista.getCaracter();
            numeroLineas =vista.getLineas();
            
            int primeraRespuesta;
            primeraRespuesta = modelo.consultarPorCaracteres(c, numeroLineas);
            vista.ponTotalCaracteres(primeraRespuesta);
            
            int segundaRespuesta;
            segundaRespuesta = modelo.consultarPorNumeroPalabras(numeroLineas);
            vista.ponTotalPalabras(segundaRespuesta);
        }
    
    }
    
}
