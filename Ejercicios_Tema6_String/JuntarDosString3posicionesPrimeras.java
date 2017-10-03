/*
6. Realizar un nuevo método que dado dos Strings con números enteros y positivos,
retorne un String con una mezcla de la forma: el 1o de A, 1o de B, el 2o de A, el 2o 
de B etc. (suponemos que el tamaño de ambos es el mismo, aunque será 
necesario comprobarlo)
7. Idem a ejercicio 6 pero retorna: tres números de A, tres de B ... suponemos que el 
tamaño de ambos es múltiplo de tres y del mismo tamaño (comprobad)
EJEMPLO 1:
1ºSTRING: 111222333
2ºSTRING: 444555666
RESULTADO: 111444222555333666
//Pon primer String : 374625
//Pon segundo String : 543278
//Resultado: 374543746432
 */
package Ejercicios_Tema6_String;

import java.util.Scanner;
import Utilidades.*;

/**
 *
 * @author Hector GARCIA
 */
public class JuntarDosString3posicionesPrimeras {
    public static void main(String[] args) {
    //ATRIBUTOS
    String primerString;
    String segundoString;

    //metodo pedir datos
    do{
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon primer String : ");
        primerString = sc.nextLine();
        System.out.print("Pon segundo String : ");
        segundoString = sc.nextLine();
    }while(Utilidades.mismoTamano(primerString,segundoString) == false
            || Utilidades.comprobarUnDatoPositivoString(primerString) == false
            || Utilidades.comprobarUnDatoPositivoString(segundoString) == false
            || Utilidades.compruebaMultiploN(primerString, 3) == false
            || Utilidades.compruebaMultiploN(segundoString, 3) == false
            );
    
    System.out.println("(CREANDO OBJETO)Resultado: " 
            + MetodosString.juntarStrings(primerString,segundoString));
    System.out.println("(SIN CREAR OBJETO)Resultado " + 
            MetodosString.juntarStrings(primerString,segundoString));

    
    
    }//fin main
}


    
    
   