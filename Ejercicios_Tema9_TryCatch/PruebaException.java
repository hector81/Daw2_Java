/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema9_TryCatch;

/**
 *
 * @author user
 */
public class PruebaException extends Exception {

    public PruebaException(int numero) {
        super("Se ha producido un error de tipo prueba");
    }

    public PruebaException(String message) {
        super(message);
    }

}
