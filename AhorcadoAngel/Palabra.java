/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AhorcadoAngel;

/**
 *
 * @author VESPERTINO
 */
public class Palabra {

    private String palabraScondida, palabraMostrar;
    StringBuilder sb = new StringBuilder("");
    
    //Constructor
    public Palabra(String palabraScondida) {
        this.palabraScondida = palabraScondida;//inicializa la  palabra escondida con la plabra enviada
        for (int i = 0; i < palabraScondida.length(); i++) {
            sb.append("-"); //inicializa la palabra a mostrar con la cantidad de guiones que letras tiene palabra escondida
        }
        this.palabraMostrar=sb.toString();
    }

    //metodo
    public void mostrarPalabraOculta() {
        for (int i = 0; i < palabraMostrar.length(); i++) {
            System.out.print(palabraMostrar.charAt(i)+" ");// esto es solo para mostrarlo bonito con espacios
        }
    }

    //comprobar que la palabra enviada sea acerta o erronea
    public boolean comprueba(String v) {
        StringBuilder sb = new StringBuilder(palabraMostrar);
        boolean letra= false;
        for (int i = 0; i < palabraScondida.length(); i++) {
            if(palabraScondida.charAt(i)==v.charAt(0)){
                letra=true;
                sb.replace(i, i+1, v);
            }
        }
        this.palabraMostrar=sb.toString();
        return letra;
    }

    public boolean noEstaCompleta() {// metodo para saber si la palabra esta correcta o no
        if (palabraMostrar.equals(palabraScondida)) {
            return true;
        } else {
            return false;
        }
    }

}
