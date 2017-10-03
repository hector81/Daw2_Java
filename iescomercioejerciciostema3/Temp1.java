package iescomercioejerciciostema3;

public class Temp1 {
    public static void main(String[] args){
        int x = 1;
        //mientras x sea menor que 10
        while(x<10){
            /*no compila bien, se queda infinito, hay que meter dentro del
            ambito del while otra vez la variable x para que aumente de valor*/
            x= x+1;
            //mientras x sea menor que 10 y mayor que 3, son 7 veces hola
            if(x>3){
                System.out.println("Hola");
                    }
                    }
    }
}


