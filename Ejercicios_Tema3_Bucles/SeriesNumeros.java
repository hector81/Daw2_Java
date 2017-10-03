/*Implementar realizar un programa que calcule y muestre por pantalla 
 todos los numeros de las series siguientes :
 6 9 12 ........ 60---con while
 5 50 500 ....... 5000000 -- con do while    

 Luego ,mostrar los resutlado 
6*9*12*
5+50+100
 */
package Ejercicios_Tema3_Bucles;

public class SeriesNumeros {

    //main

    public static void main(String[] args) {
        //declaración de variables
        int numeroSerie3 = 3;
        int numeroSerie10 = 10;
        /*lo pongo en +0 para que empieze en para que la 1ºmultiplicacion sea 1*2
         en el while porque si no sería un bucle infinito 0*2 = 0*0*0*0*0...*/
        long contador1 = 3;
        double contador2 = 0.5;
        
        long acumulador1 = 0;
        long acumulador2 = 0;

        //calcular con while
        while (contador1 < 60) {
            //Acumulador para que sume 3 hasta llegar al limite de 60 del while
            contador1 = contador1 + numeroSerie3;
            //para mostrar los numeros que multiplican
            System.out.print(contador1 + " ");
            //acumulador 1
            acumulador1 = contador1*contador1;
            
        }

        System.out.println("\n***********************************************************");
        //calcular con do while
        do {
            //Acumulador para que multiplique por 10 hasta llegar al limite de 5000000 del do while
            contador2 = contador2 * numeroSerie10;
            //para mostrar los numeros que multiplican
            System.out.print(contador2 + " ");
            //acumulador 2
            acumulador2 += contador2;
        } while (contador2 > 0 &&contador2 < 5000000);

        //imprimir
        System.out.println("\n***********************************************************");
        System.out.println("Resultado Serie 3 : " + acumulador1);
        System.out.println("Resultado Serie 10 : " + acumulador2);

    }//fin main
}//fin clase
