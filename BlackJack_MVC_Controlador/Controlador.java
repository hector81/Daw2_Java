/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack_MVC_Controlador;

import BlackJack_MVC_Modelo.Carta;
import BlackJack_MVC_Modelo.ImplementacionDaoBlackJack;
import BlackJack_MVC_Modelo.Jugador;
import BlackJack_MVC_Vista.VistaSwingBlackJack;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author VESPERTINO
 */
public class Controlador implements ActionListener{
    //atributos
    private VistaSwingBlackJack vista;
    private ImplementacionDaoBlackJack modelo;
    private int apuesta;
    private boolean comprobarJugadorCreado= false;
    private boolean plantarJugador= false;
    private boolean plantarCrupier= false;
    private boolean jugar= false;
    private int puntosJugador=0;
    private int puntosCrupier=0;
    private int puntuacionJ =0;
    private int puntuacionC =0;
    //constructor

    public Controlador(VistaSwingBlackJack vista, ImplementacionDaoBlackJack modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.setControlador(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        int apuesta = vista.getApuesta();
        int saldoJugador = vista.getSaldo();
        if (e.getActionCommand().equals("PARTIDA")) {
            jugar = modelo.volverAJugar();
            JOptionPane.showMessageDialog(vista, "JUGADOR QUIERE JUGAR");
        }
        if (jugar == true) {

            if (e.getActionCommand().equals("OK")) {
                String comprobarApuesta = Integer.toString(apuesta);
                String comprobarSaldo = Integer.toString(apuesta);
                if (apuesta <= saldoJugador) {
                    JOptionPane.showMessageDialog(vista, "JUGADOR CREADO");
                    comprobarJugadorCreado = true;
                } else {
                    JOptionPane.showMessageDialog(vista, "NO PUEDES APOSTAR MAS DE TU SALDO");
                    vista.vaciarSaldoApuesta();
                }
            }//vaciarApuesta
            if (comprobarJugadorCreado == true) {//cuando el jugador este creado
                if (e.getActionCommand().equals("SALIR")) {
            vista.salir();
            JOptionPane.showMessageDialog(vista, "JUGADOR ABANDONA PARTIDA");
        }
                
                if(Integer.toString(vista.getApuesta())!= ""){
                if (modelo.comprobarPuntuacionesGanaCruiper(puntosJugador, puntosCrupier) == false
                        && modelo.comprobarPuntuacionesGanaJugador(puntosJugador, puntosCrupier) == false
                        ) {
                    if (plantarCrupier != true) {
                        if (e.getActionCommand().equals("PEDIR CARTA CRUPIER")) {
                            Carta aux;
                            aux = modelo.pedirCartaCrupier();
                            int numero = aux.getNumero();
                            String palo = aux.getPalo();
                            vista.setCartaCrupier(numero, palo);
                            puntuacionC = modelo.damePuntuacionManoCrupier(aux);
                            puntosCrupier += puntuacionC;
                            vista.setPuntuacionCrupier(puntosCrupier);
                            plantarCrupier = modelo.plantarseCrupier(puntosCrupier);
                            if (puntosCrupier >= 17) {
                                JOptionPane.showMessageDialog(vista, "EL CRUPIER SE PLANTA");
                            }
                        }
                    }
                    if (plantarJugador != true) {
                        if (e.getActionCommand().equals("PEDIR CARTA JUGADOR")) {
                            Carta aux;
                            aux = modelo.pedirCartaJugador();
                            int numero = aux.getNumero();
                            String palo = aux.getPalo();
                            vista.setCartaJugador(numero, palo);
                            puntuacionJ = modelo.damePuntuacionManoJugador(aux);
                            puntosJugador += puntuacionJ;
                            vista.setPuntuacionJugador(puntosJugador);

                        }
                    }//
                    if (e.getActionCommand().equals("PLANTARSE JUGADOR")) {
                        plantarJugador = modelo.plantarseJugador();
                        JOptionPane.showMessageDialog(vista, "EL JUGADOR SE PLANTA");
                    }

                }
                }else{
                    JOptionPane.showMessageDialog(vista, "DEBES APOSTAR ANTES");
                }

                if (modelo.comprobarPuntuacionesGanaCruiper(puntosJugador, puntosCrupier) == true
                        && ((plantarJugador == true || plantarJugador == false)
                        || (plantarCrupier == true || plantarCrupier == false))) {
                    JOptionPane.showMessageDialog(vista, "CRUPIER GANA PARTIDA");
                    saldoJugador = saldoJugador - apuesta;
                    vista.setJugador(saldoJugador);
                    vista.vaciarApuesta();
                    vista.vaciarTodoMenosSaldo();
                    puntosJugador = 0;
                    plantarJugador = false;
                    plantarCrupier = false;
                }
                if (modelo.comprobarPuntuacionesGanaJugador(puntosJugador, puntosCrupier) == true
                        && ((plantarJugador == true || plantarJugador == false)
                        || (plantarCrupier == true || plantarCrupier == false))) {
                    JOptionPane.showMessageDialog(vista, "JUGADOR GANA PARTIDA");
                    saldoJugador = saldoJugador + apuesta;
                    vista.setJugador(saldoJugador);
                    vista.vaciarApuesta();
                    vista.vaciarTodoMenosSaldo();
                    puntosCrupier = 0;
                    plantarCrupier = false;
                }
                //fin comprobar puntos ganadores

            } else {
                JOptionPane.showMessageDialog(vista, "No puedes empezar la partida hasta que tengas saldo y des"
                        + " a OK"
                        + " y apuestes");
            }
        } else {
            JOptionPane.showMessageDialog(vista, "NO PUEDES EMPEZAR A JUGAR HASTA DAR A PARTIDA");
        }

    }//fin metodo



}
