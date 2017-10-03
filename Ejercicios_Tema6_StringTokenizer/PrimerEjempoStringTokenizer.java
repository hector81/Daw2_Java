package Ejercicios_Tema6_StringTokenizer;



/**
 *
 * @author VESPERTINO
 */
/*
PROBAR METODOS STRNGTOKENIZER
 */
import java.util.StringTokenizer;
public class PrimerEjempoStringTokenizer {

    public static void main(String[] args) {
        String cadena = "15;23;89";
        //declaramos un objeto de StringTokenizer
        StringTokenizer cadenast1 = new StringTokenizer(cadena, ";");//para contar el delimitador
        System.out.println("NUMERO ELEMENTOS : " + cadenast1.countTokens());
            while(cadenast1.hasMoreElements()){
                System.out.println("Imprimir : " + cadenast1.nextToken());
            }
            
        StringTokenizer cadenast2 = new StringTokenizer(cadena, ";",true);//para contar el delimitador
        System.out.println("NUMERO ELEMENTOS : " + cadenast2.countTokens());
            while(cadenast2.hasMoreElements()){
                System.out.println("Imprimir : " + cadenast2.nextToken());
            }
    }
}

