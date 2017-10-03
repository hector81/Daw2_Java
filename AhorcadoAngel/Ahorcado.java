
package AhorcadoAngel;

public class Ahorcado {

    public void jugar() {
        String v;
        Palabra palabra = new Palabra("murcielago");
        Horca horca = new Horca();
        Jugador jugador = new Jugador();
        ListaFallos lista = new ListaFallos();

        jugador.pedirNombre();
        do {
            palabra.mostrarPalabraOculta();
            horca.mostrar();
            v = jugador.dameLetra();
            if (!palabra.comprueba(v)) {
                horca.ponItem();
                lista.ponLetra(v);
            }        
            lista.mostrarListaDeFallos();
        } while (horca.estaVivo() != false && palabra.noEstaCompleta() != true);

        
        if (horca.estaVivo() == true) {
            System.out.println("Usted ha ganado!!!");
        } else {
            System.out.println("Usted ha sido ahorcado");
        }
    }
}
