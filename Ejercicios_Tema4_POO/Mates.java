/*
Desarrollar las clase Mates implementando los métodos que se detallan a continuación:  
- Tendrá una propiedad de tipo entero llamado numero  
- Tendrá un constructor completo  
- Setter y getter de dicho atributo  
- esPerfecto: devuelve VERDAD o FALSO dependiendo de si el número es perfecto o no.
Un número se dice que es perfecto cuando es igual a la suma de sus divisores (excepto él mismo). 
Por ejemplo 6 es un número perfecto porque los divisores de 6 son 1,2   y 3 y estos suman 6  
- esPrimo: devuelve VERDAD o FALSO dependiendo de si el número es primo o no..  
- listaPerfectos: visualiza todos los números perfectos menores que el valor del número.  
- listaNumeros: visualiza todos los números menores o iguales que el valor del número .  
- sumaCifras: devuelve la suma de las cifras del valor del número .   
- numDivisores: devuelve el número de divisores que tiene el número .  
- base2: devuelve una cadena que es el resultado de pasar a binario el número en decimal.
 */
package Ejercicios_Tema4_POO;

/**
 *
 * @author Hector Garcia
 */
public class Mates {

	// atributos
	private int numero = 0;

	// constructor completo
	public Mates(int numero) {
		this.numero = numero;
	}// fin constructor

	// getters y setters
	public int getNumero() {
		return numero;
	}// fin metodo

	public void setNumero(int numero) {
		this.numero = numero;
	}// fin metodo

	// metodos
	// esPerfecto: devuelve VERDAD o FALSO dependiendo de si el número es
	// perfecto o no.
	public boolean esPerfecto() {
		int aux = 0;
		// recorremos de 0 hasta numero
		for (int contador = 1; contador < numero; contador++) {
			// si el dividido es igual a 0, declaro aux para que recoga el
			// acumulado
			if (numero % contador == 0) {
				// acumulador
				aux += contador;
				// if anidado
				if (aux == numero) {
					return true;
				} // fin if anidado
			} // fin if
		} // fin for
		return false;
	}// fin metodo

	// esPrimo: devuelve VERDAD o FALSO dependiendo de si el número es primo o
	// no.
	public boolean esPrimo() {
		int resto;
		boolean esPrimo = true;
		for (int contador = 2; contador < numero; contador++) {
			// declaramos variable local numeroPrimo para sea el resto
			// hacemos esto para que el numero sea dividido por el contador y de
			// un resto
			// el primo solo puede dividirse por si mismo
			resto = numero % contador;
			// si esa variable es igual a 0 o distinta al contador
			if (resto == 0) {
				esPrimo = false;

			} // fin if
		} // fin for
		return esPrimo;
	}// fin metodo

	// listaPerfectos: visualiza todos los números perfectos menores que el
	// valor del número.
	public void listaPerfectos() {
		// recorremos de 0 hasta numero
		for (int contador = 1; contador < this.getNumero(); contador++) {
			// si el numero da true en el metodo esPerfecto()
			// contruimos un nuevo numero para el metodo
			Mates num = new Mates(contador);
			if (num.esPerfecto() == true) {
				System.out.print(contador + " ");

			} // fin if
		} // fin for
	}// fin metodo

	// listaNumeros: visualiza todos los numeros menores o iguales que el valor
	// del numero .
	public void listaNumeros() {
		// recorremos de 0 hasta numero
		for (int contador = 0; contador < this.getNumero(); contador++) {
			System.out.print(contador + " ");
		} // fin for
	}// fin metodo

	// sumaCifras: devuelve la suma de las cifras del valor del número .
	public void sumaCifras() {
		// recorremos de 0 hasta numero
		for (int contador = 0; contador < numero; contador++) {
			int cifras = 0;
                        int suma = 0;
			cifras += numero % 10;
			numero = numero / 10;
                        suma = cifras + numero;
                        System.out.println(suma);
		} // fin for

	}// fin metodo

	// numDivisores: devuelve el numero de divisores que tiene el numero .
	public void numDivisores() {
		// recorremos de 0 hasta numero
		for (int contador = 1; contador < numero; contador++) {
			// si el dividido es igual a 0, imprimo el contador
			if (numero % contador == 0) {
				System.out.print(contador + " ");
			} // fin if
		} // fin for
	}// fin metodo

	// base2: devuelve una cadena que es el resultado de pasar a binario el
	// numero en decimal.
	public void base2() {
            //int resto;       
            String binario = "";            
                //para que vaya añadiendo binarios
                while(numero != 0){
                     //resto = numero%2;
                     if(numero%2 == 1){
                         //acumulador para asignar uno a la variable mas el siguiente binario
                         binario += "1" + binario;                   
                     } else if(numero%2 == 0){
                         //acumulador para asignar cero a la variable mas el siguiente binario
                         binario += "0" + binario;             
                    }                 
                        numero = numero/2;
                }
                 //contador para que cada vez el siguiente numero sea dividido por 2         
                 System.out.print(binario);          
	}// fin metodo 
        
	// main
	public static void main(String[] args) {
		// Instanciamos creando objeto numero que sea ...
		Mates n1 = new Mates(17);

		// imprimir
		System.out.println("Numero: " + n1.getNumero());
		System.out.println("�El numero es perfecto? " + n1.esPerfecto());
		System.out.println("�El numero es primo? " + n1.esPrimo());
		System.out.println("Lista perfectos");
		n1.listaPerfectos();
		System.out.println("\nLista numeros menores o iguales que el valor del numero");
		n1.listaNumeros();
		System.out.println("\nLista divisores ");
		n1.numDivisores();
		System.out.println("\nSuma cifras numero ");
		n1.sumaCifras();
		System.out.println("\nResultado de pasar a binario el numero en decimal ");
                System.out.println("TIENE: " + n1.getNumero());
		n1.base2();
	}// fin main
}// fin clase


/*
//metodo perfecto sobrecargado
private boolean esPerfecto(int otroNumero) {
		int aux = 0;
		// recorremos de 0 hasta numero
		for (int contador = 1; contador < otroNumero; contador++) {
			// si el dividido es igual a 0, declaro aux para que recoga el
			// acumulado
			if (otroNumero % contador == 0) {
				// acumulador
				aux += contador;
				// if anidado
				if (aux == otroNumero) {
					return true;
				} // fin if anidado
			} // fin if
		} // fin for
		return false;
	}// fin metodo


*/

/*

// listaPerfectos: visualiza todos los números perfectos menores que el
	// valor del número.
	public void listaPerfectos() {
		// recorremos de 0 hasta numero
		for (int contador = 1; contador < this.getNumero(); contador++) {
			// si el numero da true en el metodo esPerfecto()
			if (esPerfecto(contador)) {
				System.out.print(contador + " ");
			} // fin if
		} // fin for
	}// fin metodo

*/