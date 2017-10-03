package Paquete1;
/*
15.	 Pide un n�mero (que debe estar entre 0 y 10) y mostrar 
la tabla de multiplicar de dicho n�mero.
 */
import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        //DECLARAMOS ATRIBUTO
        int numero;
        int resultado;
        //PEDIMOS DATOS
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un n�mero entero: ");
        numero = sc.nextInt();
        System.out.println("Tabla del " + numero);
        //USAMOS BUCLE FOR PARA RECORRER LOS 10 N�MEROS CON LOS QUE MULTIPLICAREMOS
        for(int i = 1; i<=10; i++){
        	//CALCULAMOS RESULTADO
            resultado = numero*i;
        	//IMPRIMIMOS
             System.out.println(numero + " X " + i + " = " + resultado);
        }
    }
}