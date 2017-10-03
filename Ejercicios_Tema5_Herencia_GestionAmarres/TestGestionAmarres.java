/*
probamos test
 */
package Ejercicios_Tema5_Herencia_GestionAmarres;



/**
 *
 * @author HÃƒÂ©ctor Garcia
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
public class TestGestionAmarres {
    //fin main
    public static void main(String[] args) {
    
    System.out.println("*************CLIENTE******************");
    //instanciamos clase creando objeto. Creamos dos clientes
    Cliente hector = new Cliente("Hector Garcia","16691663-C");
    Cliente david = new Cliente("David Perz","15915912-K");
    
    //llamamos al metodo toString
    //hector.toString();
    //david.toString();
    System.out.println("El nombre del cliente 1 es " + hector.getNombre() + 
            " y su dni es " + hector.getDni());
    System.out.println("El nombre del cliente 2 es " + david.getNombre() + 
            " y su dni es " + david.getDni());
    
    
    System.out.println("*************BARCO******************");
    //instanciamos la clase creando objetos con dos barcos
    Barco barco1 = new Barco("231miab", 20, 1985);
    Barco barco2 = new Barco("28nazga", 26, 1984);
    
    System.out.println("La matrÃ­cula del primer barco es " + barco1.getMatricula() + 
            " y su eslora es " + barco1.getEsloraMetros() + " y su fecha de construccion es " 
            + barco1.getYearFabricacion());
    
    System.out.println("La matrÃ­cula del segundo barco es " + barco2.getMatricula() + 
            " y su eslora es " + barco2.getEsloraMetros() + " y su fecha de construccion es " 
            + barco2.getYearFabricacion());
    
    
    //instanciamos la clase creando objetos con dos alquileres
    //Creo las dos instancias de fecha
    GregorianCalendar finicial1 = new GregorianCalendar(2015,3,15);
    GregorianCalendar ffinal1 = new GregorianCalendar(2015,3,19);
    //Creo las dos instancias de fecha
    GregorianCalendar finicial2 = new GregorianCalendar(2015,4,15);
    GregorianCalendar ffinal2 = new GregorianCalendar(2015,4,19);
    Alquiler alquiler1 = new Alquiler(hector,finicial1,ffinal1,barco1);
    Alquiler alquiler2 = new Alquiler(david,finicial2,ffinal2,barco2);
    
    System.out.println("*************ALQUILER BARCO******************");
    System.out.println("El cliente " + alquiler1.getCliente().getNombre() + 
            " alquila el barco de la fecha " + alquiler1.getfInicial().getGregorianChange() + " hasta fecha " 
            + alquiler1.getfFinal().getGregorianChange() + " y la matricula barco es "
            + alquiler1.getBarco().getMatricula());
    
    System.out.println("El cliente " + alquiler2.getCliente().getNombre() + 
            " alquila el barco de la fecha " + alquiler2.getfInicial().getGregorianChange() + " hasta fecha " 
            + alquiler2.getfFinal().getGregorianChange() + " y la matricula barco es "
            + alquiler2.getBarco().getMatricula());
    
    
    System.out.println("El cliente " + alquiler1.getCliente().getNombre() + " paga esto por el barco amarrado "
    + barco1.precioAmarre());
    System.out.println("El cliente " + alquiler2.getCliente().getNombre() + " paga esto por el barco amarrado "
    + barco2.precioAmarre());
    
    
    System.out.println("*************ALQUILER EMBARCACIONES A MOTOR******************");
    //creamos 2 embarcaciones a motor
    EmbarcacionesDeportivasMotor embarcacionDeportiva1 = new EmbarcacionesDeportivasMotor("789ppp", 26, 2004, 230);
    EmbarcacionesDeportivasMotor embarcacionDeportiva2 = new EmbarcacionesDeportivasMotor("989bbb", 30, 2000, 265);
    
    System.out.println("El cliente " + alquiler1.getCliente().getNombre() + " paga esto por la embarcación amarrada "
    + embarcacionDeportiva1.precioAmarre());
    System.out.println("El cliente " + alquiler2.getCliente().getNombre() + " paga esto por la embarcación amarrada "
    + embarcacionDeportiva2.precioAmarre());
    
    
    System.out.println("*************ALQUILER VELEROS******************");
    //creamos 2 veleros
    Veleros velero1 = new Veleros("333eee", 21, 1989, 2);
    Veleros velero2 = new Veleros("555rrr", 23, 1897, 3);
    
    System.out.println("El cliente " + alquiler1.getCliente().getNombre() + " paga esto por el velero amarrado "
    + velero1.precioAmarre());
    System.out.println("El cliente " + alquiler2.getCliente().getNombre() + " paga esto por el velero amarrado "
    + velero2.precioAmarre());
    
    
    System.out.println("*************ALQUILER YATES******************");
    //creamos 2 yates
    Yate yate1 = new Yate("555rrr", 23, 1988, 300,12);
    Yate yate2 = new Yate("667uuu", 26, 1983, 250,15);
    
    System.out.println("El cliente " + alquiler1.getCliente().getNombre() + " paga esto por el yate amarrado "
    + yate1.precioAmarre());
    System.out.println("El cliente " + alquiler2.getCliente().getNombre() + " paga esto por el yate amarrado "
    + yate2.precioAmarre());
    
    
    Cliente hector1 = new Cliente("Hector Garcia","16691663-C");
    Alquiler a = new Alquiler(hector1,finicial1,ffinal1,yate1);
    
    System.out.println(a.calculaPrecio());
    }//fin main
}//fin clase