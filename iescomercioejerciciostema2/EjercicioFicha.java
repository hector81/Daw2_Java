
//IMPLEMENTAR UN PROGRAMA EN JAVA QUE PIDA EL NOMBRE, EL TELEFONO, LOS APELLIDOS Y LA EDAD, Y QUE MUESTRE POR PANTALLA CON EL SIGUIENTE ASPECTO.
//**************
//*NOMBRE:
//*APELLIDOS:
//*TELEFONO:
//*EDAD:
//**************
package iescomercioejerciciostema2;

import java.util.Scanner;

public class EjercicioFicha {
    public static void main(String arg[]){
 
  Scanner entrada1=new Scanner(System.in);// se declara e inicializa una instancia  de la clase Scanner.
  Scanner entrada2=new Scanner(System.in);
  Scanner entrada3=new Scanner(System.in);
  Scanner entrada4=new Scanner(System.in);
  
  int edad ;
  String nombre ;
  String apellidos;
  int telefono;
  
  System.out.println("INTRODUCE DATOS");
  System.out.println("*********************");
  System.out.print("*Introduce Nombre: ");
  nombre= entrada1.nextLine();
  System.out.print("*Introduce Apellidos: ");
  apellidos = entrada2.nextLine();
  System.out.print("*Introduce Teléfono: ");
  telefono = entrada3.nextInt();
  System.out.print("*Introduce Edad: ");
  edad = entrada4.nextInt(); 
  System.out.println("*********************");
      
  
  System.out.println("FICHA");
  System.out.println("*********************");
  System.out.println("*Nombre: "+ nombre);
  System.out.println("*Apellidos: "+ edad);
  System.out.println("*Teléfono: "+ telefono);
  System.out.println("*Edad: "+ edad);
  System.out.println("*********************");
  
   
 }
}
