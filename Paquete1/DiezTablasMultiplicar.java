package Paquete1;
/*
3. Realizar un programa en java que muestre las 10 tablas de multiplicar.
 */
import java.util.Scanner;

public class DiezTablasMultiplicar {
	 public static void main(String[] args) {
	        //DECLARAMOS ATRIBUTO
	        int resultado;
	        //USAMOS BUCLE FOR PARA RECORRER LOS 10 N�MEROS CON LOS QUE MULTIPLICAREMOS
	        for(int i = 1; i<=10; i++){
	        	//imprimir por tabla
	        	System.out.println("Tabla del " + i);
	        	//for anidado para recorrer los 10 numeros a los que multiplicaremos
	        	for(int numero = 1; numero<=10; numero++){	
	        	//CALCULAMOS RESULTADO
	            resultado = numero*i;
	        	//IMPRIMIMOS
	             System.out.println(numero + " X " + i + " = " + resultado);
	        }//fin for anidado
	        }//fin for
	    }//fin main
}//fin clase
