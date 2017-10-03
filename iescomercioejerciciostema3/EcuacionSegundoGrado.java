package iescomercioejerciciostema3;
import java.util.Scanner;
/*
IMPLEMENTAR UN PROGRAMA QUE PIDA LOS COEFICIENTES DE UNA ECUACION DE SEGUNDO
GRADO

 */
public class EcuacionSegundoGrado {
	public static void main(String[] args) {
	// Declaracion de variables
		double a;
		double b;
		double c;
		float x1; // +
		float x2; // -
		Scanner sc = new Scanner(System.in);
	//Pedir datos
		System.out.print("Ingrese el valor del coeficiente a: ");
		a = sc.nextDouble();	
		System.out.print("Ingrese el valor del coeficiente b: ");
		b = sc.nextDouble();
		System.out.print("Ingrese el valor del coeficiente c: ");
		c = sc.nextDouble();
	// Realizar los calculos //  usamos Math.sqrt para calcular la raiz cuadrada
		x1= (float)((-b + Math.sqrt((b*b)-(4*a*c)))/(2*a));
		x2= (float)((-b - Math.sqrt((b*b)-(4*a*c)))/(2*a));
    // Mostrar resultados        
        System.out.printf("El valor de X1 será: %.2f\n" , x1);
        System.out.printf("El valor de X2 será: %.2f\n" , x2);
	}//fin del main
}//fin de la clase




