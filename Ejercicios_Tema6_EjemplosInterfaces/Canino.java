/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema6_EjemplosInterfaces;

/**
 *
 * @author user
 */
public abstract class Canino extends Animal { 
    //constructor completo
    public Canino(String foto, String tipo_comida, String localizacion, String tamanio) {
        super(foto, tipo_comida, localizacion, tamanio);
    }

    //metodo abstracto hacerRuido
    public abstract boolean hacerRuido();
}
