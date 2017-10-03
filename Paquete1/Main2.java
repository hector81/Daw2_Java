package Paquete1;

public class Main2 {
	// main
	public static void main(String[] args) {
		// declaramos atributo
		int j;
		//el bucle recorre de 1 a 3
		for (int i = 0; i < 3; i++) {
			//realizamos calculo
			j = i + 1;
			//mientras j sea menor de 4
			while (j < 4) {
				//imprimir el resultado de j-i
				System.out.println(j - i);
				//aumentamos j
				j++;
			}//fin while
		}//fin for
	}//fin main
}//fin clase
