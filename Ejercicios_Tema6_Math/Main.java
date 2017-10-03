/*
3ºPARTE: Realiza un método que recibe tres enteros NEGATIVOS (por referencia) y los convierte en
positivos dentro del método (usando el método abs de la clase Math). Mostrar en el main 
el valor de los 3 enteros antes y después de llamar al método.
 */
package Ejercicios_Tema6_Math;



/**
 *
 * @author user
 */
import static Ejercicios_Tema6_Math.ReferenciaPositivos.*;

public class Main {

    public static void main(String[] args) {

        //creamos objeto con numeros
        Numeros numero = new Numeros(-9, -8, -3);
        System.out.println(numero.getN1());
        System.out.println(numero.getN2());
        System.out.println(numero.getN3());
        //creamos objeto y llamamos metodo
        System.out.println("NUMEROS POSITIVIZADOS");
        cambiarPositivizar(numero);
        System.out.println(numero.getN1());
        System.out.println(numero.getN2());
        System.out.println(numero.getN3());

    }
}
