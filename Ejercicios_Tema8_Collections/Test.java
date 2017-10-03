/*
Reutilizando la clase Alumno implementada en ejercicios anteriores. Realizar un
programa en Java que:

- Realiza un menú que muestre las siguientes opciones:
1. Añadir datos alumno
2. Borrar por posición
3. Mostrar listado 
4. Salir del programa
- “Añadir datos alumno” Pedirá al usuario los datos del alumno e introdúcelos en 
la colección.
- “Borrar por posición”. Indicará el alumno la posición del que desea borrar y se 
eliminará este.
- “Mostrar listado”: Muestra todos los elementos de la colección utilizando un 
itereator
1. ¿Los muestra según fueron introducidos? 
2. Crea un objeto de tipo Alumno con los mismos datos que uno ya introducido 
previamente en la colección. ¿Está el objeto duplicado dentro de la colección o lo 
ha eliminado? 
3. Añade la funcionalidad necesaria en la clase Alumno para que no permita la inserción 
de Alumnos repetidos.
 */
package Ejercicios_Tema8_Collections;

/**
 *
 * @author Hector Garcia
 */
public class Test { 
    public static void main(String[] args) {
        //atributos y objetos
        int x;
        //Alumno alumno = new Alumno();
        Menu menu = new Menu();
        Usuario usuario = new Usuario();
    
        do{
            menu.mostrarMenu();
            x = usuario.pedirOpcion();
            if(x!=4){
                menu.ejecutaOpcion(x);// añadir//borrar//listado
            }
        }while(x!=4);
        
        System.out.println("FIN ");
        
    }//fin main
}//fin clase
