package Ejercicios_Tema5_Herencia_Punto2D;

/**
--1. Cree dos objetos de tipo Punto
--2. Prueba los métodos realizados: 2 x equals, toString etc...
 */
public class TestPunto2D {
    //main
    public static void main(String[] args) {
       //Cree dos objetos de tipo Punto // CONSTRUCTOR COMPLETO
       Punto2D punto1 = new Punto2D(1,3);
       Punto2D punto2 = new Punto2D(1,4);
        
       //probamos metodos con CONSTRUCTOR COMPLETO
        System.out.println(punto1.toString());
        System.out.println(punto1.equals(3,8));
        System.out.println(punto1.equals(2,5));
       
        System.out.println(punto2.toString());
        System.out.println(punto2.equals(1,5));
        System.out.println(punto2.equals(4,9));
       
    }//fin main
}//fin clase
