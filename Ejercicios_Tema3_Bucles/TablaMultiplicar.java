package Ejercicios_Tema3_Bucles;
/*
15.	 Pide un numero (que debe estar entre 0 y 10) y mostrar 
la tabla de multiplicar de dicho numero.
 */
import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        //DECLARAMOS ATRIBUTO
        int numero;
        int resultado;
        //PEDIMOS DATOS
        do{
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Introduce un numero entero: ");
	        numero = sc.nextInt();
	        if (numero < 1 || numero > 10) {
				System.out.println("El numero es negativo, mayor de 10 o igual que cero. ");
			}
    	} while (numero < 1 || numero > 10);
        
        System.out.println("Tabla del " + numero);
        
        //USAMOS BUCLE FOR PARA RECORRER LOS 10 NUMEROS CON LOS QUE MULTIPLICAREMOS
        for(int i = 1; i<=10; i++){
        	//CALCULAMOS RESULTADO
            resultado = numero*i;
        	//IMPRIMIMOS
             System.out.println(numero + " X " + i + " = " + resultado);
        }
    }
}