/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_BarcoSQL_Main;

import MVC_BarcoSQL_Modelo.ImplementacionDaoBarcoSql;
import MVC_BarcoSQL_Vista.VistaSwingBarco;
import MVC_BarcoSQL_controlador.ControladorBarcoSql;

/**
 *
 * @author user
 */
public class MainBarcoSql {
    public static void main(String[] args) {
        ImplementacionDaoBarcoSql modelo = new ImplementacionDaoBarcoSql();
        VistaSwingBarco vista = new VistaSwingBarco();
        ControladorBarcoSql control = new ControladorBarcoSql(modelo, vista);
    }
}
