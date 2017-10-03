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
package Ejercicios_Tema6_Polimorfismo;

/**
 * @author Hector Garcia
 */
public class Animales {
    //ATRIBUTOS
    private String foto;
    private String tipo_comida;
    private String localizacion;
    private String tamanio;
    public final static int numeroOjos = 2;
    
    //metodos 
    public final void rugir(){
    	System.out.println("El animal hace arghhh");
    }
    
    public static final void hacerRuido(String ruido){
        ruido = "oooooooooooooooooooo";
    	System.out.println(ruido);
    }
    
    public final void comer(String estomago){
        estomago = "glugluglu";
    	System.out.println(estomago);
    }
}
