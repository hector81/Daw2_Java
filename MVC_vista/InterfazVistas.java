/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_vista;

import MVC_controlador.CalculadoraControlador;


/**
 *
 * @author Hector Garcia
 */
public interface InterfazVistas {
    //metodos abstractos
    public abstract String getOperando1();

    public abstract String getOperando2();

    public abstract String getOperador();

    public abstract void setResultado(String dato);
    
    public abstract void iniciarPrograma();

    public void setControlador(CalculadoraControlador objeto);//le pasara el this a la vista
    //recibe un objeto de tipo actionlistener
}
