/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack_MVC_Main;

import BlackJack_MVC_Controlador.Controlador;
import BlackJack_MVC_Modelo.ImplementacionDaoBlackJack;
import BlackJack_MVC_Vista.VistaSwingBlackJack;




/**
 *
 * @author VESPERTINO
 */
public class MainBlackJack {
    public static void main(String[] args) {
        VistaSwingBlackJack vista = new VistaSwingBlackJack();
        ImplementacionDaoBlackJack modelo = new ImplementacionDaoBlackJack();
        
        Controlador control = new Controlador(vista, modelo);
    }
}
