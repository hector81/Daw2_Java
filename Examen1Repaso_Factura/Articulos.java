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
public class Articulos {
    //atributos
    private String nombreProducto;
    private double precioProducto;
    private int numeroArticulo;
    private int iva;
    
    //constructor
    public Articulos(String nombreProducto, double precioProducto, int numeroArticulo, int iva) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.numeroArticulo = numeroArticulo;
        this.iva = iva;
    }
    
    //getters and setters
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getNumeroArticulo() {
        return numeroArticulo;
    }

    public void setNumeroArticulo(int numeroArticulo) {
        this.numeroArticulo = numeroArticulo;
    }
    
    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }
    //metodo toString
    @Override
    public String toString() {
        return "El nombre del articulo es " + nombreProducto + " su precio es " + precioProducto + 
                " y su numero de artículo es " + numeroArticulo + " y su iva es " + iva;
    }
    
    
}//fin clase
