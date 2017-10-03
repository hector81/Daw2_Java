/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen1Repaso_Factura;

/**
 *
 * @author Hector Garcia
 */
public class Test {
    //fin main
    public static void main(String[] args) {
        //instanciamos creando 2 objetos clientes
        Cliente hector = new Cliente("Hector Garcia", "Calle Benavides 5", 369);
        Cliente isabel = new Cliente("Isabel Gonzalez", "Calle Rioja 3", 214);
        System.out.println("********CLIENTE************");
        
        System.out.println(hector);
        System.out.println(isabel);
        
        //instanciamos creando 3 objetos Articulos
        Articulos pan = new Articulos("PAN", 0.89, 4,5);        
        Articulos leche = new Articulos("LECHE", 1.58, 2,6);
        Articulos tomate = new Articulos("TOMATES", 1.28, 8,9);
        
        System.out.println("********ARTICULOS************");
        
        System.out.println(pan);
        System.out.println(leche);
        System.out.println(tomate);
        
        System.out.println("********FACTURA************");
        Factura facturaHector = new Factura(hector,pan,leche, tomate, 9,5,6);
        Factura facturaIsabel = new Factura(isabel, pan,leche, tomate, 8,3,7);
        
        System.out.println(facturaHector.toString());
        System.out.println(facturaIsabel.toString());
        System.out.println("La factura de los tomates de Hector con IVA es: " + facturaHector.calculoFacturaConIva(pan,leche, tomate));
        System.out.println("La factura de los tomates  de Hector sin IVA es: " + facturaHector.calculoFacturaSinIva(pan,leche, tomate) );
        System.out.println("La factura de los tomates  de Isabel con IVA es: " + facturaIsabel.calculoFacturaConIva(pan,leche, tomate) );
        System.out.println("La factura de los tomates  de Isabel sin IVA es: " + facturaIsabel.calculoFacturaSinIva(pan,leche, tomate) );
        
    }//fin main
}//fin clase
