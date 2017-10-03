/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen_Mayo;


import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author VESPERTINO
 */
public interface InterFaceVista {
    //metodo abstractos
    public abstract File getFileNumeros();//para el archivo que manejaremos
        
    public abstract void selecionarFichero() ;
        
    
    public abstract void setControlador(Controlador control);//para el controlador
}
