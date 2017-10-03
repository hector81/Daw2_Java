/*
JUEGO AHORCADO
 */
package Ahorcado;



/**
 *
 * @author Hector Garcia
 */
public class ListaFallos {
    //atributos
    private StringBuilder sb= new StringBuilder("");
    //metodo que pone las letras falladas
    public void ponerLetraFallo(){
        System.out.println("Letras falladas ");
        System.out.println(sb.toString());
    }
    //metodo que coge las letras falladas
    public void cogerLetra(String letra){
        sb.append(letra);
    }
    
    
}//fin clase
