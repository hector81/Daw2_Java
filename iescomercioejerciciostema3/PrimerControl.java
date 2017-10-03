package iescomercioejerciciostema3;

import java.util.Scanner;

/*Realizar un programa en java que pìda al usuario el radio de un circulo y que calcule y muestre por pantalla el area
y el perimetro de dicho circulo
*/

public class PrimerControl 
{
    public static void main(String arg[])
    {
        // Declaracion de variables
        float PI=(float)3.1416;
        double radioCirculo, areaCirculo, perimetroCirculo;
        Scanner entrada=new Scanner(System.in);
        
        //Pedir datos
        System.out.println("Introduce radio del circulo : ");
        radioCirculo = entrada.nextDouble();
        
        // Realizar los calculos        
        areaCirculo = PI*radioCirculo*radioCirculo;
        perimetroCirculo = 2*PI*radioCirculo;      
        
        // Mostrar resultados        
        System.out.printf("El area es: %.2f \n" , areaCirculo);
        System.out.printf("El perimetro es: %.2f\n" , perimetroCirculo);
    }
}