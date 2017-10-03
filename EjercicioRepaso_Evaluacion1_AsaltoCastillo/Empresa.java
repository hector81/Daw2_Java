/*
Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas.
En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro. 
Se pide de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del artículo 1 y 
cuantas facturas se emitieron de más de 600 €.
 */
package EjercicioRepaso_Evaluacion1_AsaltoCastillo;

import java.util.Scanner;

/**
 *
 * @author Hector Garcia
 */
public class Empresa {

    public static void main(String[] args) {
        //atributos
        int cantidadTotalLitros = 0;
        int codigoArticulo;
        int cantidadVendidaLitros;
        int precioLitros;
        int numeroFacturas = 5;
        int cantidad = 0;
        int cantidad1 = 0;
        int cantidadTotal = 0;
        int cantidad600 = 0;
        
        //do while para pedir datos
        do {
            for (int contador = 1; contador < numeroFacturas + 1; contador++) {
                System.out.print("Pon los litros vendidos, de que articulo y la cantidad de la factura " + contador + " = ");
                Scanner sc = new Scanner(System.in);
                cantidad = sc.nextInt();
                cantidadVendidaLitros = sc.nextInt();
                codigoArticulo = sc.nextInt();
                if (cantidad < 1) {
                    System.out.println("Error la factura es cero o negativa");
                }//fin if    
                if (cantidad > 0) {
                    System.out.println("Cantidad de la factura " + contador + " : " + cantidad + " ,litros: "
                            + cantidadVendidaLitros + " del articulo " + codigoArticulo);
                    cantidadTotalLitros += cantidadVendidaLitros;
                    cantidadTotal += cantidad;
                }
                
                if (cantidad > 600) {
                    cantidad600++;
                }
                
                if (codigoArticulo ==1) {
                    cantidad1++;
                }
            }
        } while ((cantidad < 1));

        System.out.println("Cantidad total de la factura " + cantidadTotal);
        System.out.println("Cantidad mas de 600= " + cantidad600);
        System.out.println("Cantidad total litros= " + cantidadTotalLitros);
        System.out.println("Cantidad articulos 1= " + cantidad1);
    }//fin main
}//fin clase
