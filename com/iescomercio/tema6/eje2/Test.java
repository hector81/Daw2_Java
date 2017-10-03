/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema6.eje2;

/**
 *
 * @author user
 */
public class Test {
    public static void main(String[] args) {
        
  
    Alumno alumno = new Alumno();
        Menu menu = new Menu();
        Usuario usuario = new Usuario();
        int x;
    
    
        do{
            menu.enseñarMenu();
            x = usuario.ponerOpcion();
            if(x!=5){
                menu.escogeOpcion(x);// añadir//borrar//listado
            }
        }while(x!=5);
        
        System.out.println("FIN ");
        
}
  }