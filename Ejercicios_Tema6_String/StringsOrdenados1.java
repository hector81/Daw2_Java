/*
12-Realizar un método que recibe dos String con números de una cifra ordenados y
retorna un String con la fusión de ambos recibidos también ordenados
EJEMPLO
STRING 1: 123456
STRING 1: 456789
RESULTADO: 123456789

Pon primer String : 123456
Pon segundo String : 02789
0123456789
 */
package Ejercicios_Tema6_String;



/**
 *
 * @author Hector Garcia
 */
import java.util.Scanner;
public class StringsOrdenados1 {

    //ATRIBUTOS
    private static String primerString;
    private static String segundoString;

    //metodo pedir datos
    public static void pedirDat() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon primer String : ");
        primerString = sc.nextLine();
        System.out.print("Pon segundo String : ");
        segundoString = sc.nextLine();
    }//fin metodo
    
    //metodo juntarStrings
    public static String ordenarDosStringNumeros(String primerString, String segundoString) {
        //delcaramos dos string y dos stringbuilder
        String resultadoRepetido;
        String resultadoNoRepetido;
        StringBuilder sb = new StringBuilder();
        StringBuilder sc = new StringBuilder();
        //recorremos los 10 numeros posibles que pueden salir
        for (int numeros = 0; numeros < 10; numeros++) {
            //recorremos el primer string
            for (int i = 0; i < primerString.length(); i++) {
                if (Character.getNumericValue(primerString.charAt(i)) == numeros) {
                    sb.append(primerString.charAt(i));
                }
            }
            //recorremos el segundo string
            for (int j = 0; j < segundoString.length(); j++) {
                if (Character.getNumericValue(segundoString.charAt(j)) == numeros) {
                    sb.append(segundoString.charAt(j));
                }
            }
        }
        resultadoRepetido = sb.toString();
        for (int x = 0; x < resultadoRepetido.length(); x++) {
            //Usamo indexOf que devolvera la posición de la primera aparición de carácter
            //si la posicion es menor que 0 ,quiere decir que no se repite, NO HAY CONCURRENCIA
                if (sc.indexOf("" + resultadoRepetido.charAt(x)) < 0){
                    sc.append(resultadoRepetido.charAt(x));
                }
            }
        resultadoNoRepetido = sc.toString();
        return resultadoNoRepetido;
    
    }
            
  

    //main
    public static void main(String[] args) {
        //creamos objeto para llamar a los metodos
        StringsOrdenados1 pa = new StringsOrdenados1();
        pa.pedirDat();
        System.out.println(pa.ordenarDosStringNumeros(primerString, segundoString));
    }//fin main
}//fin clase

