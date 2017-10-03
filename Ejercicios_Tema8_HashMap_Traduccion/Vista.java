/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema8_HashMap_Traduccion;

import java.util.Scanner;

/**
 *
 * @author VESPERTINO vista para consola
 */
public class Vista {

    public void jugar(ListaDePalabras lp) {
        //atributos
        Scanner sc = new Scanner(System.in);
        String ingles, frances;
        int aux = 0;
        Marcador m = new Marcador();
                
        while (true) {
            //crear objeto de lista de palabras
            Palabras palabra = lp.damePalabraCastellano();

            System.out.println("La palabra " + palabra.getPalabraCastellano() + " se dice en: ");
            System.out.println("Ingles: ");
            ingles = sc.nextLine();
            System.out.println("Frances: ");
            frances = sc.nextLine();
            if (ingles.equals(palabra.getPalabraIngles())) {
                aux++;
            }
            if (frances.equals(palabra.getPalabraFrances())) {
                aux++;
            }
            System.out.println("HAS ACERTADO " + aux + " palabras");
            m.numeroAciertos(aux);
            aux=0;
            System.out.println(m.toString());
        }
    }//fin metodo
    
}//fin clase
