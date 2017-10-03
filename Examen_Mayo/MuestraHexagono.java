/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen_Mayo;

/**
 *
 * @author VESPERTINO
 */
public class MuestraHexagono {

    //metodos
    public void muestraHexagono1(int numero, char C) {
        int asterisco = numero;
        int vacio = numero;
        
        while(vacio != 1){
            rellenaCaracter(vacio, ' ');
            rellenaCaracter(asterisco, '*');
            asterisco+=2;
            vacio--;
            System.out.println("");
        }
        
        while(vacio != numero+1){
            rellenaCaracter(vacio, ' ');
            rellenaCaracter(asterisco, '*');
            asterisco-=2;
            vacio++;
            System.out.println("");
        }
                
    }
 
    public void rellenaCaracter(int N, char C){
        for (int i = 0; i < N; i++) {
            System.out.print(C + "");
            
        }
    }

    //main
    public static void main(String[] args) {
        //CREAMOS OBJETO Y LLAMAMOS
        MuestraHexagono mh = new MuestraHexagono();
        mh.muestraHexagono1(4, '*');

    }//FIN MAIN
}//FIN CLASE
