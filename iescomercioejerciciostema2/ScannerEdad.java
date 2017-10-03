package iescomercioejerciciostema2;
import java.util.Scanner; // se importa la clase Scanner

public class ScannerEdad {
 public static void main(String arg[]){
 
  Scanner entrada=new Scanner(System.in);// se declara e inicializa una instancia  de la clase Scanner.
  int edad;
   
  edad = entrada.nextInt();
  
  int NuevaEdad;
  NuevaEdad = edad - 10;
   
  System.out.println("Tengo: "+edad);
  System.out.println("Pues aparentas: "+NuevaEdad);
  //System.out.println("Pues aparentas: "+ (edad -10));
   
 }
  
}
