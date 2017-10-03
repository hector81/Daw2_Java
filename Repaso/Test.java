/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso;

import Ejercicios_Tema8_TreeSet.Alumno;
import Ejercicios_Tema8_TreeSet.Menu;



/**
 *
 * @author user
 */
public class Test {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        Menu menu = new Menu();
        Usaurio usuario = new Usaurio();
        int numero=0;
        do{
            menu.mostrarMenu();
            numero= usuario.introducirNumero();
            if(numero !=8){
                menu.ejecutaOpcion(numero);
            }
        }while(numero !=8);
    }
}