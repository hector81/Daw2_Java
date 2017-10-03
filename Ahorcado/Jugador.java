/*
JUEGO AHORCADO
 */
package Ahorcado;
/**
 *
 * @author Hector Garcia
 */
import java.util.Scanner;
public class Jugador {

    //atributos y objetos   
    private Scanner sc;
    private String nombre;

    //constructor
    public Jugador() {
        sc = new Scanner(System.in);
    }

    //METODOS
    //metodo para pedir el nombre
    public void pedirNombre() {
        System.out.print("Pon un nombre: ");
        nombre = sc.nextLine();
    }//fin metodo

    //metodo para pedir la letra
    public String dameLetra() {
        String letra;
        System.out.print("Pon una letra: ");
        letra = sc.nextLine();
        return letra;
    }//fin metodo

}//fin clase
