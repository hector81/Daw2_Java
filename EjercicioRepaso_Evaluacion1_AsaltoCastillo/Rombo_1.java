/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioRepaso_Evaluacion1_AsaltoCastillo;

/**
 *
 * @author VESPERTINO
 */
public class Rombo_1 {
    //atributos
    private int x = 2;
    private int y = x * 2;
    private int contador1 = 0;
    private int contador2 = 0;
    private String asterisco = "*";
    
    //constructor
    public Rombo_1() {
    }

    //getter and setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
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

    public String getAsterisco() {
        return asterisco;
    }

    public void setAsterisco(String asterisco) {
        this.asterisco = asterisco;
    }
    
    //metodo
    public void rombo() {
        while (contador1 <= x) {
            for (int espacios = x - 1; espacios >= contador1; espacios--) {
                System.out.print(" ");
            }
            for (int asteriscos = 0; asteriscos <= (1 * contador1 + contador1); asteriscos++) {
                System.out.print(asterisco);
            }
            System.out.println();
            contador1++;
        }//fin while
        while (contador2 <= x - 1) {
            for (int espacios = 0; espacios <= contador2; espacios++) {
                System.out.print(" ");
            }
            for (int asteriscos = contador2 + 2 + contador2; asteriscos <= y; asteriscos++) {
                System.out.print(asterisco);
            }
            System.out.println();
            contador2++;
        }//fin while
    }//fin metodo

    //main
    public static void main(String[] args) {

        Rombo_1 rom = new Rombo_1();
        rom.rombo();
    }
}
