/*
4. Crea un método que dado un String leído por teclado retorna un string convertido en
contraseña con las siguientes modificaciones (tanto mayúsculas como minúsculas).
 * A → @, E → 3, I → 1, O → 0 y U → \ /
 */
package Ejercicios_Tema6_String;



/**
 *
 * @author Hector
 */
import java.util.Scanner;
public class StringContraseña {
     //main
    public static void main(String[] args) {
    //ATRIBUTOS
    String cadena;   
    //metodo pedir datos    
    Scanner sc = new Scanner(System.in);
    System.out.print("Pon palabra para cambiar : ");
    cadena = sc.nextLine();

    MetodosString.replaceWord(cadena);
    }//fin main
}//fin clase
