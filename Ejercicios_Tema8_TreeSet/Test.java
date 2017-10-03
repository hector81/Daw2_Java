/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema8_TreeSet;

import Ejercicios_Tema8_Collections.Usuario;

/**
 *
 * @author Hector Garcia
 */
public class Test { 
    public static void main(String[] args) {
        //atributos y objetos
        int x;
        Alumno alumno = new Alumno();
        Menu menu = new Menu();
        Usuario usuario = new Usuario();
    
        //metdodos
        do{
            menu.mostrarMenu();
            x = usuario.pedirOpcion();
            if(x!=8){
                menu.ejecutaOpcion(x);// añadir//borrar//listado
            }
        }while(x!=8);
        
        System.out.println("FIN ");
        
    }//fin main
}//fin clase
