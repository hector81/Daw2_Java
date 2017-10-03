/*
Desarrollar una clase llamada Coche que:

- Tenga un atributo private de tipo Motor, un atributo de tipo String (marca), otro de tipo 
String modelo y otro de tipo double con el precio acumulado con las averías.
- Tenga un constructor con dos parámetros de tipo String que inicialice la marca y el 
modelo.
- Tenga un getter para cada uno de los atributos.
- Un método acumularAvería que incrementará el importe gastado en averías.
 */
package Ejercicios_Tema4_Garaje;

/**
 *
 * @author Hector Garcia
 */
public class Coche {
    //ATRIBUTOS
    //este es un atributo de TIPO MOTOR
    private Motor motor;
    private String marca;
    private String modelo;
    private double precioAcumulado;
    
    //CONSTRUCTORES
    public Coche(String marca, String modelo){
        //AQUI INSTANCIARIAMOS EL OBJETO MOTOR
        motor = new Motor(200); //instanciamos con un numero de caballos inicial.
        precioAcumulado = 0.0;
        marca = marca;
        modelo= modelo;
    }
    
    //GETTERS
    public Motor getMotor() {
        return motor;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public double getPrecioAcumulado() {
        return precioAcumulado;
    }

    //METODO: Un método acumularAvería que incrementará el importe gastado en averías.
    public void acumularAvería(double averia){
        precioAcumulado += averia;
    }//fin metodo
    
}
