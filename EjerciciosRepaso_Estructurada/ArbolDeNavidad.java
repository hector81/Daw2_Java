/*
Clase para dibujar figuras
 */
package EjerciciosRepaso_Estructurada;

import java.util.Scanner;

/**
 *
 * @author Hector Garcia
 */
public class ArbolDeNavidad {

    //atributos
    private int numeroAsteriscosCopa;
    private int numeroAsteriscosTronco;
    private int contador1 = 0;
    private int contador2 = 0;
    private char asterisco = '*';
    Scanner num = new Scanner(System.in);

    //constructor
    public ArbolDeNavidad(int numeroAsteriscosCopa, int numeroAsteriscosTronco) {
        this.numeroAsteriscosCopa = numeroAsteriscosCopa;
        this.numeroAsteriscosTronco = numeroAsteriscosTronco;
    }

    //getter and setter
    public int getNumeroAsteriscosCopa() {
        return numeroAsteriscosCopa;
    }

    public void setNumeroAsteriscosCopa(int numeroAsteriscosCopa) {
        this.numeroAsteriscosCopa = numeroAsteriscosCopa;
    }

    public int getNumeroAsteriscosTronco() {
        return numeroAsteriscosTronco;
    }

    public void setNumeroAsteriscosTronco(int numeroAsteriscosTronco) {
        this.numeroAsteriscosTronco = numeroAsteriscosTronco;
    }

    public int getContador1() {
        return contador1;
    }

    public void setContador1(int contador1) {
        this.contador1 = contador1;
    }

    public int getContador2() {
        return contador2;
    }

    public void setContador2(int contador2) {
        this.contador2 = contador2;
    }

    public char getAsterisco() {
        return asterisco;
    }

    public void setAsterisco(char asterisco) {
        this.asterisco = asterisco;
    }

    public Scanner getNum() {
        return num;
    }

    public void setNum(Scanner num) {
        this.num = num;
    }

    //metodo para pedir datos
    public void pedirDatos() {
        //pedir datos numeroAsteriscosCopa
        do {
            System.out.println("Pon un número de asteriscos de la copa: ");
            numeroAsteriscosCopa = num.nextInt();
            if (numeroAsteriscosCopa <= 0 || numeroAsteriscosCopa%2 == 0) {
                System.out.println("El número no puede ser negativo, ni cero ni"
                        + " par porque el rombo no saldría bien. ");
            }
        } while (numeroAsteriscosCopa <= 0 || numeroAsteriscosCopa%2 == 0);
        //pedir datos numeroAsteriscosTronco
        do {
            System.out.println("Pon un número de asteriscos del tronco del arbol: ");
            numeroAsteriscosTronco = num.nextInt();
            if (numeroAsteriscosTronco <= 0) {
                System.out.println("El número no puede ser negativo, ni cero. ");
            }
        } while (numeroAsteriscosTronco <= 0);

    }//fin metodo

    //metodo dibujarRombo
    public void dibujarArbolNavidad() {
        //este for es para la mitad superior del arbol o lo que llamaremos copa
        //ponemos el contador a cero para que dibuje la primera estrella de arriba y luego baje
        for (int contador1 = 0; contador1 <= getNumeroAsteriscosCopa()-1; contador1++) {
            //este for es para mover con espacios los asteriscos hacia la derecha
            for (int espacios = getNumeroAsteriscosCopa() - 1; espacios >= contador1; espacios--) {
                System.out.print(" ");
            }
            //este for es para pintar los asteriscos de la copa del arbol
            //(contador1 + contador1) es para que los ponga a los dos lados, sino sale la mitad
            for (int asteriscos = 0; asteriscos <= (contador1 + contador1); asteriscos++) {
                System.out.print(asterisco);
            }
            //este sout imprime en blanco los espacios del lado derecho del arbol
            System.out.println();

        }
        //este for es para la mitad inferior del arbol o lo que llamaremos tronco
        //getNumeroAsteriscosTronco()-1 para que el ancho y el largo coincidan
        for (int contador2 = 0; contador2 <= getNumeroAsteriscosTronco()-1; contador2++) {
            //Este for pone espacios en lado izquierdo del tronco
            for (int espacios = 1; espacios <= getNumeroAsteriscosCopa()-2; espacios++) {
                //con print para que los espacios esten en linea
                System.out.print(" ");
            }
            //este for imprime los asteriscos del tronco del arbol
            for (int asteriscos = 1; asteriscos <= getNumeroAsteriscosTronco(); asteriscos++) {
                System.out.print(asterisco);
            }
            System.out.println();

        }
    }

    //Main
    public static void main(String[] args) {
        //Creamos objeto instanciandolo
        ArbolDeNavidad rombo = new ArbolDeNavidad(0, 0);

        rombo.pedirDatos();
        rombo.dibujarArbolNavidad();

    }//fin main
} //fin clase
