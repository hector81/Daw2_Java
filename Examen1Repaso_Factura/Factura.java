/*
CREAMOS 2 FACTURAS CON IVA Y SIN IVA
 */
package Examen1Repaso_Factura;

/**
 *
 * @author Hector Garcia
 */
public class Factura {
    //Atributos
    private Cliente cliente;
    private Articulos articulo1;
    private Articulos articulo2;
    private Articulos articulo3;
    private int cantidadPan;
    private int cantidadLeche;
    private int cantidadTomates;
    
    //constructor
    public Factura(Cliente cliente, Articulos articulo1, Articulos articulo2, Articulos articulo3,
            int cantidadPan,int cantidadLeche,int cantidadTomates) {
        this.cliente = cliente;
        this.articulo1 = articulo1;
        this.articulo2 = articulo2;
        this.articulo3 = articulo3;
        this.cantidadPan = cantidadPan; 
        this.cantidadLeche = cantidadLeche; 
        this.cantidadTomates = cantidadTomates; 
    }
    //getters and setters 
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Articulos getArticulo1() {
        return articulo1;
    }

    public void setArticulo1(Articulos articulo1) {
        this.articulo1 = articulo1;
    }
    
    public Articulos getArticulo2() {
        return articulo2;
    }

    public void setArticulo2(Articulos articulo2) {
        this.articulo2 = articulo2;
    }
    
    public Articulos getArticulo3() {
        return articulo3;
    }

    public void setArticulo3(Articulos articulo3) {
        this.articulo3 = articulo3;
    }

    public int getCantidadPan() {
        return cantidadPan;
    }

    public void setCantidadPan(int cantidad) {
        this.cantidadPan = cantidadPan;
    }
    
    public int getCantidadLeche() {
        return cantidadLeche;
    }

    public void setCantidadLeche(int cantidadLeche) {
        this.cantidadLeche = cantidadLeche;
    }
    
    public int getCantidadTomates() {
        return cantidadTomates;
    }

    public void setCantidadTomates(int cantidadTomates) {
        this.cantidadTomates = cantidadTomates;
    }

    //metodo calculo factura sin IVA
    public double calculoFacturaSinIva(Articulos articulo1,Articulos articulo2,Articulos articulo3){
        double facturaSinIVA;
        double compraPan = articulo1.getPrecioProducto() * getCantidadPan();
        double compraLeche = articulo2.getPrecioProducto() * getCantidadLeche();
        double compraTomate = articulo3.getPrecioProducto() * getCantidadTomates();
        facturaSinIVA = compraPan + compraLeche + compraTomate;
        return facturaSinIVA;
    }
    //metodo calculo factura CON IVA
    public double calculoFacturaConIva(Articulos articulo1,Articulos articulo2,Articulos articulo3){
        double facturaConIVA;
        double compraPan = (articulo1.getPrecioProducto() + (articulo1.getPrecioProducto()*articulo1.getIva()/100)) * getCantidadPan();
        double compraLeche = (articulo2.getPrecioProducto() + (articulo2.getPrecioProducto()*articulo2.getIva()/100)) * getCantidadLeche();
        double compraTomate = (articulo3.getPrecioProducto() + (articulo3.getPrecioProducto()*articulo3.getIva()/100)) * getCantidadTomates();
        facturaConIVA = compraPan + compraLeche + compraTomate;
        return facturaConIVA;
    }
    
    //toString

    @Override
    public String toString() {
        return "Factura: El cliente " + cliente.getNombre() + " ha comprado del " + articulo1.getNombreProducto() + " " + getCantidadPan() + " kg"
                 + ", ha comprado del " + articulo2.getNombreProducto() + " " + getCantidadLeche() + " litros"
                + ", ha comprado del " + articulo3.getNombreProducto() + " " + getCantidadTomates() + " kg";
    }
    
}//fin clase
