/*
//REALIZAR UN PROGRAMA QUE PIDA AL USUARIQO UNA CADENA Y CALCULE Y MUESTR POR PANTALLA EL Nº DE LETRAS Y PALABRAS
//Y TAMBIEN  MUESTE POR PANTALLA EL NUMERO DE FRASES
 */
package Ejercicios_Tema6_StringTokenizer;



/**
 *
 * @author user
 */
import static java.lang.Character.isLetter;
import java.util.Scanner;
import java.util.StringTokenizer;
public class CadenaLetrasPalabrasNumeros {
//ATRIBUTOS

    private static String cadena;

    //metodo pedir datos
    public static void pedirDat() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon una frase o frases : ");
        cadena = sc.nextLine();
    }//fin metodo

    //metodo juntarStrings
    public static void contarPalabrasLetras(String cadena) {
        String acumulado = "";
        String total="";
        long suma = 0;
        //declaramos un objeto de StringTokenizer para las palabras
        StringTokenizer cadenaPalabras = new StringTokenizer(cadena," .,!¿?");//para contar varios delimitadores
        System.out.println("NUMERO PALABRAS : " + (cadenaPalabras.countTokens()));
        //declaramos un objeto de StringTokenizer para las frases
        StringTokenizer cadenaFrases = new StringTokenizer(cadena, ".");//para contar el delimitador      
        System.out.println("NUMERO FRASES : " + cadenaFrases.countTokens());
        //declaramos un objeto de StringTokenizer para las letras
        StringTokenizer cadenaLetras = new StringTokenizer(cadena);////para contar varios delimitadores    
        //SEPARAMOS ELEMENTOS DEL OBJETO DEL STRINGTOKENIZER
        while (cadenaLetras.hasMoreTokens()) {
            //calcula nº de letras
            String letras = cadenaLetras.nextToken();
            //acumulamos total
            total += letras;                       
        }//fin while
        //recorremos cadena en busca de simbolo que no es letra para sumar en la suma
        for (int i = 0; i < total.length(); i++) {
        //pasamos la posiciones a caracteres
                char c = total.charAt(i);
                //si es SIMBOLO
                if (isLetter(total.charAt(i) ) ) {
                    suma++;
                }
        }
        //sumamos letras menos simbolos
        System.out.println("NUMERO LETRAS FRASE O FRASES : " + suma);
        }//fin metodo

        //main
    public static void main(String[] args) {
        //creamos objeto
        CadenaLetrasPalabrasNumeros contar = new CadenaLetrasPalabrasNumeros();
        contar.pedirDat();
        contar.contarPalabrasLetras(cadena);
    }//fin main
}//fin clase