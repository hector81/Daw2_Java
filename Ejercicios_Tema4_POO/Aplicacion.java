package Ejercicios_Tema4_POO;

public class Aplicacion {
	/*MAIN. m�todo main que, tras crear una instancia de la nueva clase 
	JuegoAdivinaNumero que se ha creado, llama al m�todo juega().
	*/
	public static void main(String[] args) {
		//Declaramos nuevo objeto
		Juego jugada = new JuegoAdivinaNumero(8);
		//Con el nuevo objeto llamamos al m�todo juega de la clase JuegoAdivinaNumero
		jugada.juega();
		
	}//FIN DEL MAIN		
}//FIN DE LA CLASE	