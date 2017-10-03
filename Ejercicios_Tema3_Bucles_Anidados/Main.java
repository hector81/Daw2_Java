package Ejercicios_Tema3_Bucles_Anidados;

public class Main {
	public static void main(String[] args) {
		//declaramos atributos
		int suma;
		//primer for recorrera del 1 al 3
		for (int i = 0; i < 4; i++) {
			//for anidado, recorrera del 3 al 1
			for (int j = 3; j > 0; j--) {
				//hacemos calculo de la suma con las dos variables
				suma = i * 10 + j;
				//imprimimos
				System.out.println(i + " x 10 + " + j + " = " + suma);
			}
		}//fin del for
		
	}//fin del main
}//fin de la clase

////////////////////////////////traza////////////////

//for (int i = 0; i < 4; i++) -- i ---for (int j = 3; j > 0; j--)--j-- suma = i * 10 + j ---print
//0             v                0              3                         3
//
//
//
//
//
//
//
//
