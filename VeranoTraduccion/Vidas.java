/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VeranoTraduccion;

/**
 *
 * @author user
 */
public class Vidas {
    private int puntos;
    private int aciertos;

    public Vidas() {
        this.puntos = 0;
        this.aciertos = 0;
    }
    
    public void sumarAciertos(String r1, String r2, String r3, String r4){
        if(r1.equals(r2)){
            aciertos++;
        }
        if(r3.equals(r4)){
            aciertos++;
        }
    }
    
    public int sumarPuntos(){
        if (aciertos == 1) {
            puntos = puntos + 50;
        }else if (aciertos == 2) {
            puntos = puntos + 100;
        }
        return puntos;
    }
}
