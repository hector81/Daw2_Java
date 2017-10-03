/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoDavid;

import java.awt.event.ActionEvent;
import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class VistaConsola implements EjercicioDavid_InterfaceVista {
    private String linea;
    private char caracterPedido;
    private int numeroLineas;
    private int resultado1;
    private int resultado2;
    private Scanner sc;
    private Controlador col;

    public VistaConsola() {
        this.sc = new Scanner(System.in);
    }

    public void muestraMenu(){
        System.out.println("Pasame el caracter: ");        
        linea = sc.nextLine();
        caracterPedido = linea.charAt(0);
        System.out.println("Pasame el numero de lineas: ");
        numeroLineas = sc.nextInt();
        col.actionPerformed(new ActionEvent(col,1,"EJECUTAR"));
        System.out.println("total caracteres" + resultado1);
        System.out.println("total palabras" +resultado2);
    }

    @Override
    public char getCaracter() {
        return caracterPedido;
    }

    @Override
    public int getLineas() {
        return numeroLineas;
    }

    @Override
    public void ponTotalCaracteres(int t) {
        int resultado1 = t;
    }

    @Override
    public void ponTotalPalabras(int t) {
        int resultado2 = t;
    
    }

    @Override
    public void setControlador(Controlador objeto) {
        col = objeto;
        muestraMenu();
    }

}
