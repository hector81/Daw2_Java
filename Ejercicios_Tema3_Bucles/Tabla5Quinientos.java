 /*
2- realizar un programa en java que muestre los números de la tabla del 5 hasta 500
empezando en el numero 100
 */
package Ejercicios_Tema3_Bucles;

public class Tabla5Quinientos {
    //main
    public static void main(String[] args) {
        //declarar variable
        int contador = 95;//lo declaramos asi para la primera suma de 100       
        //bucle while
        //mejor usar >  que >= porque consume menos cpu
        //ponemos a 94 porque el contador esta iniciado a 95
        while(contador > 94 && contador < 500){
            contador = contador +5;
            System.out.println(contador);            
        }      
    }//fin main
}//fin clase


