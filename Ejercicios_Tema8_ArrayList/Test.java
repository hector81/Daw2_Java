/*
Haciendo uso de la clase LinkedList crea dos clases Cola y Pila que imple-
menten los siguientes métodos:

• Constructor con el tamaño máximo de elementos
• Constructor con número infinito de elementos 
• Métodos estaLlena y estaVacia retornarán un booleano según el caso
• Método pop y push que permitir extraer e introducir en la estructura
según corresponda.
• Método imprimir muestra todos los elementos de la estructura sin sa-
carlos.
• Método cima retorna el elemento próximo en salir pero sin sacarlo de
la estructura.
• Método size retorna el número de elementos que hay en la estructura
correspondiente

Posteriormente realizar pruebas con ambas estructuras

Basándose en el fichero de JUnit "PilaTest":
(1) Añade un nuevo caso de prueba donde se comprueba que al hacer pop obtengo o3
(2) Crea ahora tu la bateria de pruebas para testear la cola (la llamaremos ColaTest)
 */
package Ejercicios_Tema8_ArrayList;

import java.util.LinkedList;

/**
 *
 * @author Hector Garcia
 */
public class Test {
    public static void main(String[] args) {
    LinkedList numeros = new LinkedList();

    numeros.add("o1");
    numeros.add("o2");
    numeros.add("o3");
    numeros.add("o4");
    numeros.add("o5");
    numeros.add("o6");
    
    //creamos objetos
    Cola cola = new Cola();
    Pila pila = new Pila();
    
    //probamos metodos cola
    cola.push("o7");
    cola.pop();
    cola.imprimir();
    System.out.println("El tamaño del elemento Cola es " + numeros.size());
    cola.cima();
    cola.imprimir();
    //probamos metodos pila
    pila.push("o7");
    pila.pop();
    pila.imprimir();
    System.out.println("El tamaño del elemento Cola es " + numeros.size());
    pila.cima();
    pila.imprimir();
    }//fin main
}//fin clase
