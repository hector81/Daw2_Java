/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author VESPERTINO
 */
public class Ejercicio3 {

    //1º forma
    public void muestraFlecha1(int n){
        int espacios = n-1;
        int asteriscos = 1;
        //para arriba
        while( espacios !=-1){
            muestraCaracter(espacios, ' ');
            muestraCaracter(asteriscos, '*');
            System.out.println("");
            espacios--;
            asteriscos +=2;
        }
        //para tronco
        for(int i = 0; i < n; i++) {
            int espacios1 = n-1;
            int asteriscos1 = 1;
            muestraCaracter(espacios1, ' ');
            muestraCaracter(asteriscos1, '*');
            System.out.println("");
        }



    }
    
    //2º forma
    public void muestraFlecha2(int n){
        for (int espacios = n-1,asteriscos = 1; espacios !=-1; espacios--,asteriscos +=2) {
            muestraCaracter(espacios, ' ');
            muestraCaracter(asteriscos, '*');
            System.out.println("");
        }

    }
    
    public void muestraCaracter(int n,char c){
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        Ejercicio3 ej = new Ejercicio3();
         System.out.println("PRIMERA FORMA");
        ej.muestraFlecha1(5);
        System.out.println("SEGUNDA FORMA");
        ej.muestraFlecha1(3);
    }
}
