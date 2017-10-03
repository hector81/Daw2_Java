/*
Probar clase TesteoDeStringBuffer
 */
package Ejercicios_Tema6_String;

/**
 *
 * @author Hector Garcia
 */
public class MainTesteoDeStringBuffer {
    //Main
    public static void main(String[] args) {
        //CREAMOS objeto
        TesteoDeStringBuffer probar = new TesteoDeStringBuffer();
        System.out.println("*********PROBAR PRIMEROS METODOS con string***************** ");
        probar.probarMetodosStringBuffer1();
        System.out.println("*********PROBAR SEGUNDOS METODOS con string declarado de tamaño n***************** ");
        probar.probarMetodosStringBuffer2();
    }//fin main
}//fin clase
