/*
Rellenamos una encuestacon N personas con 3 tipos de respuesta, una si es hombre o mujer(1-2),
trabaja o no trabaja(1-2), su sueldo(600-2000). Utilizar estos metodos:
NOTA: HAY QUE USAR ALGÚN TIPO DE COLLECTION.

*Porcentaje de hombre(tengan o no trabajo)---con iterator
*Porcentaje de mujeres(tengan o no trabajo)---con for/in
*Porcentaje de hombres que trabajen---con for
*Porcentaje de mujeres que trabajen---con do/while
*El sueldo promedio de los hombres que trabajen---con while
*El sueldo promedio de los mujeres que trabajen---como se quiera
 */
package RepasoExamen2;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hector Garcia
 */
public class MainEncuesta {
    //main
    public static void main(String[] args) {
        //atributos
        int N;
        ArrayList<Persona> auxiliar1 = new ArrayList<>();
        Persona p = new Persona();
        Encuesta e = new Encuesta();
        Scanner sc= new Scanner(System.in);
        //PEDIR NUMERO PERSONAS
        do{
            System.out.println("Introduce numero : ");
            N= sc.nextInt();
            if(Utilidades.comprobarNegativos(N)== false){
                System.out.println("Numero negativo .Introduzca otro");
            }
        }while(Utilidades.comprobarNegativos(N)== false);
  
        //Llamamos a los metodos
        auxiliar1 = e.añadir(p, N);
        e.mostrarListado(auxiliar1);
        
        
        
        System.out.println("Porcentaje de hombre(tengan o no trabajo)---con iterator = " + e.porcentajeHombres(auxiliar1) + "%");
        System.out.println("Porcentaje de mujeres(tengan o no trabajo)---con for/in = " + e.porcentajeMujeres(auxiliar1) + "%");
        System.out.println("Porcentaje de hombres que trabajen---con for = " + e.porcentajeHombresTrabajo(auxiliar1) + "%");
        System.out.println("Porcentaje de mujeres que trabajen---con do/while = " + e.porcentajeMujeresTrabaja(auxiliar1) + "%");
        System.out.println("El sueldo promedio de los hombres que trabajen---con while = " + e.sueldoHombresTrabajo(auxiliar1) + "€");
        System.out.println("El sueldo promedio de los mujeres que trabajen---como se quiera = " + e.sueldoMujeresTrabajo(auxiliar1) + "€");


        
    }//fin main  
}//fin clase
