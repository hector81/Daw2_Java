/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_BarcoSQL_Vista;

import MVC_BarcoSQL_controlador.ControladorBarcoSql;

/**
 *
 * @author user
 */
public interface InterfazVistaBarco {
    //metodos abstractos
    public abstract String getMatricula();

    public abstract int getEslora();

    public abstract int getPrecio();

    public void setDatosBarco(String m, int eslora, int precio);

    public abstract void setControlador(ControladorBarcoSql obj);
}
