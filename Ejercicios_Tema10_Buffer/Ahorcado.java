package Ejercicios_Tema10_Buffer;

import static java.lang.System.*;
import java.io.IOException;
import java.util.*;

public class Ahorcado {
    // Metodo para mostrar las rayas segun el tamaño de la palabra del array////
    public static char[] inicializarPalabra(char[] palabra) {
        int indiceArray = palabra.length;//ponemos la longitud del array
        char[] palabraAdivinar = new char[indiceArray];//inicamos array con ese tamaño
        for (int i = 0; i < palabraAdivinar.length; i++) {
            //para la pista
            if (i == 0) {
                palabraAdivinar[i] = palabra[0];
            } else {
                palabraAdivinar[i] = '_';
            }
            System.out.print(palabraAdivinar[i] + " ");
        }
        System.out.println("\n ");
        return palabraAdivinar;
    }//fin metodo

    // Metodo para pedir letra////
    public static char introducirLetra() {
        Scanner entrada = new Scanner(in);
        System.out.print("Introduzca la letra: ");
        char letraIntroducida = entrada.next().charAt(0);
        return letraIntroducida;
    }//fin metodo

    //metodo para quitar vidas en caso de que falle
    public static void quitaVida(int intentos) {
        intentos--;
        System.out.println("Te quedan " + intentos + " vidas");
    }

    // Metodo para comparar letra introducida con una palabra del array de
    // palabras///////
    public static boolean coincide(char charIntroducido, char[] palabra) {
        boolean aux = false;
        for (int i = 0; i < palabra.length; i++) {
            if (charIntroducido == palabra[i]) {
                aux = true;
                break;
            }
        }
        return aux;
    }//fin metodo
    
    public void acumularLetrasAcertadas(char charIntroducido){
        int contador = 0;
        char[] totalLetras ;
        totalLetras = new char[contador];
        
    }


    // Metodo para cambiar la raya por la letra correspondiente
    public static void intercambiarLetra(char charIntroducido, char[] palabra) {
        String pasarCharAString = "";
        for (int i = 0; i < palabra.length; i++) {
            char c = palabra[i];
            pasarCharAString += Character.toString(c);        
        }
        for (int i = 0; i < pasarCharAString.length(); i++) {
            if (pasarCharAString.charAt(i) == charIntroducido) {
                System.out.print(pasarCharAString.charAt(i));
            } else {
                System.out.print(" _ ");
            }   
        }
//        char[]LetrasAdivinadas;
//        int pos = 0;
//        do {
//            LetrasAdivinadas = new char[pos];
//            pos = palabra.indexOf(introducido, pos);
//            if (pos = -1) {
//                LetrasAdivinadas[pos] = introducido;
//                pos++;
//            }
//
//        } while (pos = -1);
        
    }//fin metodo
    
    

    //MAIN
    public static void main(String[] args) throws IOException {
        //atributos    
        int contador =0;
        int intentos = 8;
        char[] palabra = {'m','u','r','c','i','e','l','a','g','o'};
        char[] charIntroducido;
        char letra;
        //imprimimos y asignamos
        System.out.println("ADIVINE LA PALABRA COLOCANDO LAS LETRAS");
        char[]palabraLetrasAdivinadas = inicializarPalabra(palabra);
        //ponemos una pista
        System.out.println("PISTA: SIEMPRE HAY UNA VOCAL");
        //
        do {
            letra = introducirLetra();
            coincide(letra, palabra);
            if (coincide(letra, palabra) == false) {
                quitaVida(intentos);
                //mostrar las letras falladas
                charIntroducido = new char[contador];
                charIntroducido[contador] = letra ;
                for (int i = 0; i < charIntroducido.length; i++) {
                    System.out.println (
                "Letras falladas que ya introduciste: " + charIntroducido[contador] + " ");
                }
                
                contador++;
            } else if (coincide(letra, palabra) == true) {
                intercambiarLetra(letra, palabra);
                
            }

        } while (intentos > 0);

        if (intentos < 1) {
            System.out.println("GAME OVER ");
        }

    }//Fin main
}//fin clase

