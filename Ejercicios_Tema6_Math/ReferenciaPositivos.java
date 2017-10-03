/*
2ºPARTE: Realiza un método que recibe tres enteros NEGATIVOS (por referencia) y los convierte en
positivos dentro del método (usando el método abs de la clase Math). Mostrar en el main 
el valor de los 3 enteros antes y después de llamar al método.
 */
package Ejercicios_Tema6_Math;


/**
 *
 * @author Hector 
 */
public class ReferenciaPositivos {
    //metodo
    public static void cambiarPositivizar(Numeros n){
        //encadenamos metodos
        int tmp1 = n.getN1();
        int tmp2 = n.getN2();
        int tmp3 = n.getN3();
        n.setN1(Math.abs(tmp1));          
        n.setN2(Math.abs(tmp2));     
        n.setN3(Math.abs(tmp3));
        
        
    }//FIN metodo
   
}//fin clase
