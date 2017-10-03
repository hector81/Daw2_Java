/*
1. Implementa la clase StringTest vista en la diapositiva 4 probando los distintos
métodos ya implementados.
 */
package Ejercicios_Tema6_String;

/**
 *
 * @author user
 */
public class StringTest {
    //main
    public static void main(String[] args) {
        //creamos 3 string
        String s1 = new String();
        String s2 = new String(" ababABAB "); // Tiene espacios en blanco.
        String s3 = "Ejemplo";
        //imprimimos
        //compara posición que en este caso no esta, da -1
        System.out.println(s1.compareTo(" ")); // “ “ es un espacio en blanco.
        //juntamos 2 string
        System.out.println(s2.concat((s3)));
        //damos la posicion de h que en este caso no esta, da -1
        System.out.println(s1.indexOf('h'));
        //devuelve la cadena sin espacios
        System.out.println(s2.trim());
        //pasa String a minuscula
        System.out.println(s2.toLowerCase());
        //pasa String a mayuscula
        System.out.println(s3.toUpperCase());
        //damos la posicion de b
        System.out.println(s2.indexOf('b'));
        //damos la ultima posicion de donde aparece b
        System.out.println(s2.lastIndexOf('b'));
        //damos la longitud
        System.out.println(s3.length());
        //pasa la posicion 1, en este caso j
        System.out.println(s3.charAt(1));
        //reemplaza
        System.out.println(s2.replace('A', 'x'));
    }//fin main
}//fin clase
