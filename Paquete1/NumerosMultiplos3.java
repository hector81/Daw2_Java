package Paquete1;

import java.util.Scanner;

/*
19- Pedir 5 n�meros e indicar si alguno es m�ltiplo de 3.
 */
public class NumerosMultiplos3 {
    public static void main(String[] args) {
        //DECLARAMOS ATRIBUTO
        int numero;
        int numeroMultiploTres = 0;
        int numeroNoMultiploTres = 0;
        int numeroNumeros = 0;
       
        //while y pedir los datos dentro para que no te pida m�s de 10
        while(numeroNumeros < 6){        
            //ESTO LO REPITE 5 VECES
        	 //PEDIMOS DATOS
            Scanner sc = new Scanner(System.in);
            System.out.println("Pon el n�mero " + numeroNumeros + " : ");
            //A SU VEZ ESTO LO REPITE 5 VECES
            numero = sc.nextInt(); 
          //usamos un acumulador para sumar el total de estaturas
            numeroNumeros += numero;
            
            //usamos el if para contar las veces que son mayores o menores de edad
            if(numero%3 == 0){
            	numeroMultiploTres++;
                }//fin if
            else if (numero%3 != 0){
                	numeroNoMultiploTres++;
                }//fin else if
            //suma contador hasta 5
            numeroNumeros++;
        }//fin while
       
        //IMPRIMIR
        System.out.println("Los n�meros multiplos de 3 son : " + numeroMultiploTres);
        System.out.println("Los n�meros no multiplos de 3 son: " + numeroNoMultiploTres);
    
        
    }//fin main
}//fin clase
