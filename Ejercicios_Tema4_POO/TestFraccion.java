package Ejercicios_Tema4_POO;

public class TestFraccion {

    //main
    public static void main(String[] args) {
        // Se crean las fracciones creando nuevos objetos
        Fraccion fraccion1 = new Fraccion(2, 4); //CALCULAR PRIMERA FRACCION
        Fraccion fraccion2 = new Fraccion(3, 2); //CALCULAR SEGUNDA FRACCION         
        Fraccion aux;

        aux = fraccion1.suma(fraccion2);
        aux.print();
        aux = fraccion1.multiplicacion(fraccion2);
        aux.print();
        System.out.println("Son iguales: " + fraccion1.compararFraccional(fraccion2));

        aux = fraccion1.copia();
        aux.print();

        System.out.println("El resultado es: " + fraccion2.calculaReal());
    }//fin del main
}//fin de la clase
