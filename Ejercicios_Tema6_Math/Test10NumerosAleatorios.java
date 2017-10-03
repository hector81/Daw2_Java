/*
Realizar un método que recibe un String con 10 números aleatorios entre 0 y 9, y
calcula y retorna la suma y la media de esos 10 números.
 */
package Ejercicios_Tema6_Math;

/**
 *
 * @author Hector Garcia
 */
public class Test10NumerosAleatorios {

    //metodo
    public static void sumaMediaAleatorios() {
        NumerosAleatorios n = new NumerosAleatorios();
        //pasamos los numeros aleatorios recibidos a un nuevo string
        String tmp = n.getNumeroAleatorio();
        int suma = 0;
        int limite = tmp.length();
        double media = 0;
        int numero = 0;
        for (int contador = 0; contador < tmp.length(); contador++) {
            //pasamos de char a int
            numero = Character.getNumericValue(tmp.charAt(contador));
            suma += numero;
        }

        media = (double) suma / limite;
        
        System.out.println("La suma de los 10 numeros es: " + suma);
        System.out.println("La media de los 10 numeros es: " + media);

//        n.setNumeroAleatorio(n.getNumeroAleatorio());
//        n.setNumeroAleatorio(tmp);
    }//fin metodo

    //main
    public static void main(String[] args) {
        Test10NumerosAleatorios oo = new Test10NumerosAleatorios();
        oo.sumaMediaAleatorios();
    }//fin main

}//fin clase


