/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema6_StringTokenizer;

import java.util.StringTokenizer;

/**
 *
 * @author user
 */
public class MetodosStringTokenizer {
    /*
    //REALIZAR UN PROGRAMA QUE PIDA AL USUARIQO UNA CADENA Y CALCULE Y MUESTR POR PANTALLA EL Nº DE LETRAS Y PALABRAS
    //Y TAMBIEN  MUESTE POR PANTALLA EL NUMERO DE FRASES
     */
   //metodo juntarStrings
    public static void contarPalabrasLetras(String cadena) {
        String acumulado = "";
        long suma = 0;
        long resta = 0;
        long sumaTotal = 0;
        //declaramos un objeto de StringTokenizer para las palabras
        StringTokenizer cadenaPalabras = new StringTokenizer(cadena," ");//para contar el delimitador
        System.out.println("NUMERO PALABRAS : " + cadenaPalabras.countTokens());
        //declaramos un objeto de StringTokenizer para las frases
        StringTokenizer cadenaFrases = new StringTokenizer(cadena, ".");//para contar el delimitador      
        System.out.println("NUMERO FRASES : " + cadenaFrases.countTokens());
        //declaramos un objeto de StringTokenizer para las letras
        StringTokenizer cadenaLetras = new StringTokenizer(cadena, ".");//para contar el delimitador    
        //SEPARAMOS ELEMENTOS DEL OBJETO DEL STRINGTOKENIZER
        while (cadenaLetras.hasMoreTokens()) {
            //calcula nº de letras
            String letras = cadenaLetras.nextToken();
            //sumamos la longitud de cada letra
            suma += letras.length();                       
        }//fin while
        //recorremos cadena en busca de simbolo que no es letra para restar en la suma
        for (int i = 0; i < cadena.length(); i++) {
        //pasamos la posiciones a caracteres
                char c = cadena.charAt(i);
                //si es SIMBOLO
                if (c == '<' || c == '>' || c == '&' || c == '\"' || c == '\t' || c == '!'
                        || c == '#' || c == '*' || c == '+' || c == ',' || c == '-'
                        || c == '.' || c == '/' || c == ':' || c == ';'
                        || c == '=' || c == '?' || c == '@' || c == '['
                        || c == '\\' || c == ']' || c == '^' || c == '_'
                        || c == '`' || c == '{' || c == '|' || c == '}'
                        || c == '~' || c == ' ') {
                    resta++;
                }
        }
        //sumamos letras menos simbolos
        sumaTotal = suma-resta-1;
        System.out.println("NUMERO LETRAS FRASE O FRASES : " + sumaTotal);
        }//fin metodo
}
