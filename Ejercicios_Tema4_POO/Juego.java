package Ejercicios_Tema4_POO;

public abstract class Juego {
	/*ATRIBUTOS - Tiene 3 par�metros privados de tipo entero. Indicar que el record es de tipo est�tico
	  y por defecto, est� inicializado a 0.
	 */
	private int vidasRestantes;
	int vidasIniciales;
	private int record = 0;

	/*  constructor al cu�l se le pasa el n�mero de vidas iniciales como par�metro.
		Adem�s de dar valor a dicho atributo, el constructor deber� de llamar al 
		m�todo reiniciaPartida().
	*/
	Juego(int vidasIniciales) {
		this.vidasIniciales = vidasIniciales;
		this.reiniciarPartida();
		//El resto se inicializa por defecto
	}//Fin del metodo

	// METODOS

	/* METODO GETVIDASRESTANTES
	      getVidasRestantes() devuelve el valor del atributo
	 */
	public int getVidasRestantes() {
		//RESTARA VIDAS A LAS INICIALES CADA VEZ QUE FALLE
		this.vidasRestantes = vidasIniciales - this.vidasRestantes;
		return this.vidasRestantes;

	}//Fin del metodo

	/* METODO MUESTRA VIDAS RESTANTES
		m�todo muestraVidasRestastes() imprime el valor del atributo.
	*/
	public void muestraVidasRestantes() {
		System.out.println("Vidas restantes=" + getVidasRestantes());
	}//Fin del metodo

	/* METODO QUITA VIDA
		Implementa el m�todo quitaVida(), a partir del cual:
		�	Se disminuir� en una unidad el valor del n�mero de vidas restantes.
		�	Se comprobar� si quedan vidas. En caso afirmativo, el m�todo devolver� true. 
			En caso contrario, devolver� false y adem�s se imprimir� �Juego Terminado�.
	*/
	public boolean quitaVida() {
			this.vidasRestantes = this.vidasRestantes -1;
			if(this.vidasRestantes > 0) {
				return true;
			} else {
				System.out.println("Juego terminado");
			}
			return false;
	}//Fin del metodo

	/* METODO REINICIAR PARTIDA
		El m�todo reiniciaPartida(), sirve para reiniciar el valor de las vidas restantes 
	    con el n�mero de vidas iniciales. 
	 */
		public void reiniciarPartida() {
			//VOLVERA A PONER EL CONTADOR A 8 CUANDO REINICIE
			this.vidasRestantes = this.vidasIniciales;
			return;
		}//Fin del metodo
	
	/* METODO ACTUALIZAR RECORD
		Implementa el m�todo actualizaRecord(), el cual en caso de que el valor de las vidas
		restantes sea mayor al record, el record se actualizar� con el valor de las vidas 
		restantes y se imprimir� un mensaje indicando el valor del nuevo record.
	*/
	public void actualizarRecord() {
		record = vidasRestantes;
		if (vidasRestantes > record) {		
			System.out.println("Nuevo record = " + vidasRestantes + " puntos");			
		}
		else if (vidasRestantes < record) {
			System.out.println("No hay record");
		}
	}//Fin del metodo

	/* METODO ABSTRACTO JUEGA
	 	El m�todo juega() de la clase Juego, es abstracto.
	 */
	abstract void juega();

}//FIN DE LA CLASE	
