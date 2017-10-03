/*
 Desarrollar una clase llamada Práctica3 que en su método main:

 - Cree un garaje.
 - Cree 2 coches.
 - El garaje irá cogiendo los coches y devolviéndolos, acumulando un importe aleatorio 
 (Math.random()) de la avería tratada.
 - Si la avería de coche es “aceite” incrementar en 10 los litros de aceite.
 - Los coches entrarán al menos 2 veces en el garaje.
 - Mostrar la información de los coches al final del main.
 */
package Ejercicios_Tema4_Garaje;

/**
 *
 * @author VESPERTINO
 */
public class Practica3 {

    public static void main(String[] args) {
        //creamos nuevos objetos  
        //, en este caso un taller
        Taller taller1 = new Taller();
        //y dos coches
        Coche coche1 = new Coche("seat","ibiza");
        Coche coche2 = new Coche("Ford","Fiesta");
        
        // taller1(coche1.getMotor.getaceite());
        
        //imprimir coche se acerca al taller usando los objetos y lo métodos propios de la clase Coche
       System.out.println("Un coche se acerca al taller, es el " + coche1.getMarca() + " " +coche1.getModelo());
       
       // aceptarCoche , número de coche y tipo averia
       taller1.aceptarCoche(coche1,"Aceite");      
       //puede aceptar otro coche en este momento
       taller1.aceptarCoche(coche2,"Neumaticos"); //no lo aceptara
       //taller devuelve coche
       taller1.devolverCoche(1);
       //taller coge otro coche
       taller1.aceptarCoche(coche2,"Neumaticos");
       //taller devuelve coche
       taller1.devolverCoche(1);
        
       coche1.acumularAvería(11.3);
       coche1.acumularAvería(11.3);
       coche2.acumularAvería(11.3);
       System.out.println("La factura de coche 1 asciende a " + coche1.getPrecioAcumulado());
       System.out.println("La factura de coche 2 asciende a " + coche2.getPrecioAcumulado());
       
    }//fin del main
}//fin de la clase
