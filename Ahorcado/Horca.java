/*
JUEGO AHORCADO
 */
package Ahorcado;

/**
 *
 * @author Hector Garcia
 */
public class Horca {
    //atributos
    private int vidas;

    //construcotres
    public Horca(){
        vidas=0;
    }
    
    public void mostrarVidas(){
        switch(vidas){
            case 0:
                System.out.println("te quedan 4 vidas");
                break;
            case 1:
                System.out.println("te quedan 3 vidas");
                break;
            case 2:
                System.out.println("te quedan 2 vidas");
                break;
            case 3:
                System.out.println("te quedan 1 vidas");
                break;
            case 4:
                System.out.println("MUERTO");
                break;
        
        }
    }
    
    //metodos para quitar vida
    public int ponItem(){
        return vidas++;
    }
    //metodo para saber si esta vivo
    public boolean estaVivo(){
        return vidas<4;
    }
    
}//fin clase
