 
   /*
//realizar un programa en java que muestre los números de la tabla del 5 hasta 500
//empezando en el numero 100
 */
package iescomercioejerciciostema3;

public class Tabla5Quinientos {
    //main
    public static void main(String[] args) {
        //declarar variable
        int contador = 100;

        
        //bucle while
        //mejor usar >  que >= porque consume menos cpu
        while(contador > 95 && contador < 500){
            contador = contador +5;
            System.out.println(contador);
            
        }
        
        
    }//fin main
}//fin clase


