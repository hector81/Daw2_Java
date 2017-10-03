/*
4.	Realizar un programa en Java que visualice 100 números aleatorios entre 5 y 40
y posteriormente visualice 70 números aleatorios entre 7 y 70.
 */
package Ejercicios_Tema3_Bucles;

public class NumerosAleatorios {
    //main
    public static void main(String[] args) {
        //declarar valores        
        int numerosAleatorios5_40;        
        int numerosAleatorios7_70;
        int contador1 = 1;// para que el contador1 empieze en 1
        int contador2 = 1;// para que el contador2 empieze en 1
        //para separar
        System.out.println("100 números aleatorios en un rango de 5 a 40");
        while(contador1 <= 100){
            numerosAleatorios5_40 = (int)(Math.random()*40)+5; // Esto da valores entre 5 y 40
            System.out.println("Número " + contador1 + " : " + numerosAleatorios5_40 );
            contador1++;
        }    
        //para separar
        System.out.println("70 números aleatorios en un rango de 7 a 70");
        while(contador2 <= 70){
            numerosAleatorios7_70 = (int)(Math.random()*70)+7; // Esto da valores entre 7 y 70
            System.out.println("Número " + contador2 + " : " + numerosAleatorios7_70 );
            contador2++;
        }  
    }//fin del main
}//fin de la clase
