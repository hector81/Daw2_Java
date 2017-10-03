/*
15-Haciendo uso de la clase Stringtokenizer realiza un método en Java que lea po
teclado una cadena de números enteros separados por comas y calcule y muestre
por pantalla el maximo y la media de dichos números  ej: "8,2,5,6,7".
 */
package Ejercicios_Tema6_StringTokenizer;



/**
 *
 * @author Hector Garcia
 */
import java.util.Scanner;
import java.util.StringTokenizer;
public class CalcularMaximoMediaStringNumeros {
    //atributos
    private static String cadena;

    //metodo pedir una cadena
    public static void pedirUnaCadena() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon un String : ");
        cadena = sc.nextLine();
    }//fin metodo

    //metodo calcular media y maxima
    public String calculosMediaMax(String cadena) {
        //declaramos variables internas
        int maximo = 0;
        double media = 0;
        int suma = 0;
        String acumulado = "";
        //declaramos un objeto de StringTokenizer
        StringTokenizer calculo = new StringTokenizer(cadena, ",");
        //recorremos los elementos separandolos 
        while (calculo.hasMoreElements()) {
            //los acumulamos en una nuevaa cadena de char
            acumulado += calculo.nextElement();
            //AVERIGUAR MAXIMO
            //recorremos la nueva cadena
            for (int i = 0; i < acumulado.length(); i++) {
                //pasamos de char a int
                int s = Character.getNumericValue(acumulado.charAt(i));               
                // s es mas que maximo adjudica
                if (s > maximo) {
                    maximo = s;
                }                 
            }//fin for  
            //AVERIGUAR MEDIA
            //recorremos de nuevo la cadena por su tamaño
            for (int i = 0; i < acumulado.length(); i++) {  //recorre la cadena 
                if (Character.isDigit(cadena.charAt(i))){  //si el caracter es digito
                suma +=  Character.getNumericValue(cadena.charAt(i));  //suma caracter        
            }  
                }
                media = suma/acumulado.length();
        
        }

        return "\nEl máximo de la cadena es " + maximo
                + " y la media es " + media;
    }//fin metodo

    //main
    public static void main(String[] args) {
        //creamos objeto
        CalcularMaximoMediaStringNumeros maxMedia = new CalcularMaximoMediaStringNumeros();
        maxMedia.pedirUnaCadena();
        System.out.println(maxMedia.calculosMediaMax(cadena));
    }//fin main
}//fin clase
