package iescomercioejerciciostema3;

public class Bucles {
    public static void main(String[] args){
        //inicializamos el contador1 a 0
        int cont1 = 0;
        //mientras el contador sea menor que 3 aumentara
        while(cont1 < 3){
            System.out.println(cont1);
            cont1++;
        }
        //inicializamos el contador2 a 0
        int cont2 = 0;
        //haz esto o suma al contador2 mientras el contador sea menor que 3
        do {
            System.out.println(cont2);
            cont2++;
            }
        while(cont2 < 3);
        /*inicializa dentro del bucle for el contador 3 a o, y sumara mientras
        el contador sea menor que 3
        */
        for(int cont3 = 0; cont3 < 3; cont3++){
            System.out.println(cont3);
                }
        }//cierre del main
}
