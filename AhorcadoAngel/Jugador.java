package AhorcadoAngel;

import java.util.Scanner;

public class Jugador {

    private Scanner sc ;
    private String nombre;

    public Jugador() {
        sc = new Scanner(System.in);
    }
    
    public void pedirNombre() {
        System.out.println("Introduzca su nombre:");
        nombre = sc.nextLine();
    }

    public String dameLetra() {
        String letra;
        System.out.println("Introduzca una letra para comprobar " + nombre);
        letra = sc.nextLine();
        return letra;
    }

}
