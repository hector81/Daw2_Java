/*
Los animales

1. Realiza la implementaciÃ³n de las clases Animal, Canino, Lobo y Test si-
guiendo el diagrama de clases que aparece en la pÃ¡gina 9 de teorÃ­a.
2. Dentro de todos los mÃ©todos escribe un mensaje para mostrarlo por
pantalla de tipo â€œEstoy comiendo como los lobosâ€� o â€œAuuuuuuuâ€� en caso de
rugir.
3. Comprueba que realmente desde la clase Test se estÃ¡ llamando al mÃ©todo
que viene indicado con las flechas.
4. Realiza una segunda clase Test llamada Test2 con el primer ejemplo de la
pÃ¡gina 10 y comprueba que aquÃ­ tambiÃ©n estÃ¡ funcionando como indican las
flechas.
 */
package Ejercicios_Tema5_Herencia_Animal;

/**
 * @author Hector Garcia
 */
public class Animales {
    //ATRIBUTOS
    private String foto;
    private String tipo_comida;
    private String localizacion;
    private String tamanio;
    
    //metodos
    public void hacerRuido(){
    	System.out.println("El animal hace ruido");
    }
    
    public void comer(){
    	System.out.println("El animal come vegetales y carne");
    }
    
    public void dormir(){
    	System.out.println("El animal duerme");
    }
    
    public void rugir(){
    	System.out.println("El animal hace arghhh");
    }
}
