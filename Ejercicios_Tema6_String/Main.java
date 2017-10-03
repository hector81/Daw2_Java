/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema6_String;

import java.util.Scanner;
import Utilidades.PedirStrings.*;
/**
 *
 * @author Hector Garcia
 */
public class Main {
    
    public static void main(String[] args) {
        String cadena = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon un String : ");
        cadena = sc.nextLine(); 
//        1. Implementa la clase StringTest vista en la diapositiva 4 probando los distintos
//        métodos ya implementados.
//        MetodosString probar1 = new MetodosString();
//        probar1.probarTestString();
/******************************************************************************************************/
//        //1-Implementa la clase StringTest vista en la diapòsitiva 4 probandpo los distintos metodos ya 
//        //implementados
//        MetodosString probar11 = new MetodosString();
//        probar11.ImplementarClaseString();
/******************************************************************************************************/        
//        //2-Realiza un método dentro de la clase StringII que reciba un string leido por teclado(desde la clasee
//        //prueba) y retorne un booleanao indicnado si es o no palindromo

//        String cadena = "oso";
//        System.out.println("Palabra vuelta del reves ");
//        MetodosString.volverReves(cadena);
//        System.out.println("¿Es palindromo? : " + MetodosString.esPalindromo(cadena));
/******************************************************************************************************/
         //3-Crea una clase llamada TesteoDeStringBuffer con dos metodos cuyo codigo sea el que
         //aparece en la diapositiva 1 y 2 de la pagina 8 de teoria. Crea la clase main para llamar
        //a dichos metodos. Se deja al alumno que juege con los metodos de la clase StringBuffer


//        //CREAMOS objeto
//        MetodosString probar = new MetodosString();
//        System.out.println("*********PROBAR PRIMEROS METODOS con string***************** ");
//        probar.probarMetodosStringBuffer1();
//        System.out.println("*********PROBAR SEGUNDOS METODOS con string declarado de tamaño n***************** ");
//        probar.probarMetodosStringBuffer2();
/******************************************************************************************************/  
/*
4. Crea un método que dado un String leído por teclado retorna un string convertido en
contraseña con las siguientes modificaciones (tanto mayúsculas como minúsculas).
 * A → @, E → 3, I → 1, O → 0 y U → \ /
 */

//        MetodosString password = new MetodosString();
//        password.replaceWord(cadena);
/******************************************************************************************************/ 

/*
5- Realizar un método en la clase StringII que reciba un String con números enteros
 positivos + 0 y de una cifra y muestre dichos números en el siguiente orden: el
 primero, el último, el segundo, el penúltimo, el tercero etc. (el String que se recibe 
 debe tener una longitud par comprobar ese hecho).
 1342
 1234
 */  

        
//        System.out.println(MetodosString.ordenarNumeros(cadena));

/******************************************************************************************************/
           // 6. Realizar un nuevo método que dado dos Strings con números enteros y positivos, 
           //retorne un String con una mezcla de la forma: el 1o de A, 1o de B, el 2o de A, el 2o
           //de B etc. (suponemos que el tamaño de ambos es el mismo, aunque será 
           //necesario comprobarlo)
           //EJEMPLO1:
           //135
           //246
           //123456

//            System.out.println("(CREANDO OBJETO)Resultado: " + MetodosString.juntarStrings(primerString,segundoString));
//            System.out.println("(CREANDO OBJETO)Resultado: " + MetodosString.JuntarDosStringsEnOrdenPosicion1(primerString,segundoString));
//            //sin crear objeto
//            System.out.println("(SIN CREAR OBJETO)Resultado " + JuntarDosStringsEnOrdenPosicion.juntarStrings(primerString,segundoString));

/******************************************************************************************************/
        //7. Idem a ejercicio 6 pero retorna: tres números de A, tres de B ... suponemos que el 
        //tamaño de ambos es múltiplo de tres y del mismo tamaño (comprobad)
        //EJEMPLO 1:
        //1ºSTRING: 111222333
        //2ºSTRING: 444555666
        //RESULTADO: 111444222555333666
        //Pon primer String : 374625
        //Pon segundo String : 543278
        //Resultado: 374543746432
        
        //creamos objeto
//        MetodosString pa = new MetodosString();
//        pa.pedirDat();
//        System.out.println("Resultado: " + pa.juntar3(primerString,segundoString));
/******************************************************************************************************/
/*
8-Realizar un método que reciba dos número N y M (entero positivo + 0). Rellene un
String con 10 números aleatorios de una cifra y añada en el String de aleatorios N 
asteriscos a partir de la posición M del String, retornando el resultado.
Ejemplo
String: 8956234567
N: 3   (asteriscos)
M: 4   (n º posicines)
Resultado: 8956***234567
 */

//        //creamos objeto
//        MetodosString pa = new MetodosString();
//        pa.pedirDat();
//        System.out.println("Resultado: " + pa.ponerAsteriscosString(primerString,N,M));

/******************************************************************************************************/
/*
9. Realizar un método que reciba un número N (entero positivo + 0) y retorne un 
String. El método rellenará inicialmente un String del 0 al 9. Posteriormente 
recorrerá dicho String insertando el número N de forma ordenada en el String y 
retornándolo.
EJEMPLO: GENERA 0123456789
PONG0 N EL 3
RESULTADO: 01233456789
 */

//        MetodosString mio = new MetodosString();
//        System.out.println("resultado:" + mio.insertarNumeroIgual(cadena, N));

/******************************************************************************************************/
/*
10. Realizar un método que recibe un número N (entero + 0) y devuelve un String. El
método creará inicialmente un String con números entre 1 y 100 y posteriormente
eliminará el número N del String retornándolo.
 */

//        MetodosString mio = new MetodosString();
//        System.out.println(mio.quitarN(N));

/******************************************************************************************************/
/*
11. Realizar un método que recibe un String con números pares e impares de una cifra
y retorna dos Strings con los números pares por un lado y los impares por otro.
 */ 
 
//        System.out.println(MetodosString.detectarParesImparesString(cadena));   
    
    
/******************************************************************************************************/
        //13.Realiza una comprobación del rendimiento de las clases StringBuffer y 
         //StringBuilder para un programa en Java que concatene (método append) en una 
         //cadena inicialmente vacía un millón de string con la palabra “hola”. Calcula y 
         //muestra por pantalla cuando tardan ambas clases en realizar esa concatenación. 
         //NOTA: No es necesario sacar el resultado de la concatenación por pantalla.
         //y caclular elt tiempo que tarda //usar nanoTime y currentTimeMillis
        
//        //creamos objeto
//        MetodosString cr = new MetodosString();
//        ///llamamos metodo
//        cr.appendMillonHola(cadena);

/******************************************************************************************************/
/*
14-Dado un texto leido por pantalla, desde la clase MAIN realiza un metodo que retorne un entero
indicando el numero de palabras,vocales, consonantes, simbolos que contiene
 */    
    
//        MetodosString calcularN = new MetodosString();
//        System.out.println("Numero palabras del texto: " + calcularN.calcularPalabras(cadena));
//        System.out.println("Numero vocales del texto: " + calcularN.calcularVocales(cadena));
//        System.out.println("Numero consonantes del texto: " + calcularN.calcularConsonantes(cadena));
//        System.out.println("Numero simbolos del texto: " + calcularN.calcularSimbolos(cadena));
        
 /******************************************************************************************************/
//        //15-Haciendo uso de la clase Stringtokenizer realiza un método en Java que lea po
//        //teclado una cadena de números enteros separados por comas y calcule y muestre
//        //por pantalla el maximo y la media de dichos números  ej: "8,2,5,6,7"

//        MetodosString maxMedia = new MetodosString();
//        System.out.println(maxMedia.calculosMediaMax(cadena));



    }//fin main
}//fin clase

