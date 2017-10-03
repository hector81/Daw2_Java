/*
JUEGO AHORCADO
 */
package Ahorcado;

/**
 *
 * @author Hector Garcia
 */
public class Ahorcado {

    //metodos
    public void jugar() {
        String letra;
        //objetos
        Jugador jugador = new Jugador();
        Horca horca = new Horca();
        Palabra palabra = new Palabra("murcielago");
        ListaFallos lista = new ListaFallos();
        //empezamos juego
        jugador.pedirNombre();
        do {
            palabra.mostrarPalabraEscondida();
            horca.mostrarVidas();
            letra = jugador.dameLetra();
            if (!palabra.comprobrarLetra(letra)) {
                horca.ponItem();
                lista.cogerLetra(letra);
            }
            lista.ponerLetraFallo();
        } while (palabra.estaCompleta() != false && horca.estaVivo() != false);

        if (horca.estaVivo() == true) {
            System.out.println("ganaste");
        } else {
            System.out.println("perdiste");
        }

    }//fin metodo

}//fin clase
