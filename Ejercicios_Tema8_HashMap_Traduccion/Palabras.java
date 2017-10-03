/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema8_HashMap_Traduccion;

/**
 *
 * @author VESPERTINO
 */
public class Palabras {
    //atributos
    private String palabraCastellano;
    private String palabraIngles;
    private String palabraFrances;
    
    //constructor

    public Palabras(String palabraCastellano, String palabraIngles, String palabraFrances) {
        this.palabraCastellano = palabraCastellano;
        this.palabraIngles = palabraIngles;
        this.palabraFrances = palabraFrances;
    }
    
    //getters an setters

    public String getPalabraCastellano() {
        return palabraCastellano;
    }

    public void setPalabraCastellano(String palabraCastellano) {
        this.palabraCastellano = palabraCastellano;
    }

    public String getPalabraIngles() {
        return palabraIngles;
    }

    public void setPalabraIngles(String palabraIngles) {
        this.palabraIngles = palabraIngles;
    }

    public String getPalabraFrances() {
        return palabraFrances;
    }

    public void setPalabraFrances(String palabraFrances) {
        this.palabraFrances = palabraFrances;
    }
    
}
