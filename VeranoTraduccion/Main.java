/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VeranoTraduccion;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        Palabra palabra1= new Palabra("casa", "house", "etxea");
        Palabra palabra2= new Palabra("hola", "hello", "kaixo");
        Palabra palabra3= new Palabra("adios", "bye", "agur");
        Palabra palabra4= new Palabra("socorro", "help", "lagundu");
        
        Scanner sc = new Scanner(System.in);
        
        HashMap<Integer, Palabra> nuevo= new HashMap<>();
        
        ListaPalabras lp = new ListaPalabras(nuevo);
        
        lp.añadirPalabra(palabra1);
        lp.añadirPalabra(palabra2);
        lp.añadirPalabra(palabra3);
        lp.añadirPalabra(palabra4);
        
        Vidas v = new Vidas();
        
        Palabra aux;
        int contador=0;
        String r1 ,r2 = "";
        
        while(contador < 4){
            aux = lp.mostrarPalabraAleatoria();
            System.out.println("La palabra en castellano es " + aux.getCastellano());
            System.out.println("Dime la palabra en ingles");
            r1 = sc.nextLine();
            System.out.println("Dime la palabra en euskera");
            r2 = sc.nextLine();
            v.sumarAciertos(r1, aux.getIngles(), r2, aux.getEuskera());
            System.out.println("TIENES " + v.sumarPuntos() + " puntos");
            contador++;
        }
        
    }
}
