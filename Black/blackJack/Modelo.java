package Black.blackJack;

import java.util.ArrayList;

public class Modelo {

    Jugador jugador;
    Crupier crupier;

    public Modelo() {
        crupier = new Crupier("Crupier");
    }

    public void crearJugador(float saldo, String nombre) {
        jugador = new Jugador(saldo, nombre);
    }

    public boolean setApuesta(float apuesta) {
        return jugador.apostar(apuesta);
    }

    public ArrayList<Carta> cogerCartaJugador() {//cogela carta y devuelve la carta que es y su puntuacion
        jugador.getMano().añdirCarta();
        return jugador.getMano().getCartas();
    }

    public ArrayList<Carta> cogerCartaCrupier() {//lo mismo que del de arriba
        crupier.getMano().añdirCarta();
        return crupier.getMano().getCartas();
    }

    public ArrayList<Carta> crupuierJugar() {//Al plantarse el crupier juega su ronda
        crupier.jugar();
        return crupier.getMano().getCartas();
    }

    public int puntosJugador() {
        return jugador.getMano().puntuacionActual();
    }

    public int puntosCrupier() {
        return crupier.getMano().puntuacionActual();
    }
    

            
    public int quienHaGanado() {//1 gana jugador, 2 gana crupier, 3 empatados
        int puntuacioCrupier = puntosCrupier();
        int puntuacioJugador = puntosJugador();
        int aux;
        if (puntuacioCrupier > 21 && puntuacioJugador <= 21) {
            aux = 1;
        } else if (puntuacioJugador > 21 && puntuacioCrupier <= 21) {
            aux = 2;
        } else if (puntuacioCrupier > puntuacioJugador && puntuacioCrupier <= 21) {
            aux = 2;
        } else if (puntuacioCrupier == puntuacioJugador) {
            aux = 3;
        } else if (puntuacioCrupier < puntuacioJugador && puntuacioJugador <= 21) {
            aux = 1;
        } else {
            aux = 3;
        }
        return aux;
    }
}
