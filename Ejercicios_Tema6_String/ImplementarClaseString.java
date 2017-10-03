/*
1-Implementa la clase StringTest vista en la diapòsitiva 4 probandpo los distintos metodos ya 
implementados
 */
package Ejercicios_Tema6_String;

/**
 *
 * @author Hector Garcia
 */
public class ImplementarClaseString {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
