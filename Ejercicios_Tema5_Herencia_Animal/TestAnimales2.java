package Ejercicios_Tema5_Herencia_Animal;


/**
 *
 * @author VESPERTINO
 */
public class TestAnimales2 {
    //main
   public static void main(String[] args) {
	 //Creamos objeto animal instanciandolo
       Animales animal = new Lobo();//UPCASTING
	   animal.hacerRuido();
	   animal.rugir();
	   animal.comer();
	   animal.dormir();
   }//fin main   
}//fin clase