/*
Hacer un programa que dado un número impar por scanner, en primer lugar hacer una
serie que vaya desde ese número hasta 1 restando 2 en cada paso y luego sumando dos
vuelva al número original de ese número
EJEMPLO 1: 5 3 1 3 5
Y en segundo lugar, hacer otra serie que sea en sentido inverso, que vaya desde 1 
hasta hasta el número dado sumando 2, y luego vuelva al 1 desde ese número restando
de dos en dos.
EJEMPLO 2: 1 3 5 3 1
Por último junta esas dos series y que de este resultado.
EJEMPLO 3: 1 5 3 1 3 5 3 1 5 3 1


 */
/**
 *
 * @author Hector Garcia
 */
package RepasoDavid;

import EjerciciosRepaso_Estructurada.*;
import java.util.Scanner;

public class ImprimirSerieNumeros {

    //metodos
    private static void muestraCaracter(int n, char c) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }
    
    //metodo de N a 1 y de 1 a N
    public static void imprimirNumeros1(int N) {
        for (int numeros1 = N; numeros1 > 0; numeros1 -= 2) {
            //NOTA: valdría igual if ( numeros1 > -1) 
            if (numeros1 !=0) {
                muestraCaracter(numeros1, ' ');
                if (numeros1 == 1) {
                    int numeros2 = numeros1 + 2;
                    while (numeros2 <= N + 1) {
                        muestraCaracter(numeros2, '*');
                        numeros2 += 2;
                    }//fin while
                }
            }
            System.out.println("");
        }//fin for

    }//FIN METODO
    //metodo de 1 a N y de N a 1
    public static void imprimirNumeros2(int N) {
        for (int numeros3 = 1; numeros3 <= N; numeros3 += 2) {
            //NOTA: valdría igual if ( numeros3 <= N)   
            if (numeros3 !=0) {
                muestraCaracter(numeros3, ' ');
                if (numeros3 == N) {
                    int numeros4 = numeros3 - 2;
                    while (numeros4 >= 1) {
                        muestraCaracter(numeros4, '*');
                        numeros4 -= 2;
                    }//fin while
                }
            }
            System.out.println("");
        }//fin for

    }//fin metodo
 
    //metodo juntar series 
    public static void juntarSeries(int N) {
        for (int numeros5 = 1; numeros5 <= N; numeros5 += 2) {
            //Ponemos numeros5 !=N en vez de numeros5 !=0
            //porque sino en la tercera vuelta del bucle
            //cogeria el 5 y el resultado sería asi:
            //1 5 3 1 3 5 3 1 5 5 3 1. Se repetiría el 5
            if (numeros5 !=N) {
                muestraCaracter(numeros5, ' ');;
            }//fin if
            for (int numeros6 = N; numeros6 > 0; numeros6 -= 2) {
                if (numeros6 !=0) {
                    muestraCaracter(numeros6, '*');                    
                }//fin if
                System.out.println("");
            }//fin for anidado
            System.out.println("");
        }//fin for
    }//fin metodo

    //MAIN
    public static void main(String[] args) {
        //atributos o propiedades O OBJETOS
        ImprimirSerieNumeros impNum = new ImprimirSerieNumeros();
        int N;
        Scanner sc;
        sc = new Scanner(System.in);
        //pedir datos
        do {
            System.out.println("Pon el numero  ");
            N = sc.nextInt();
            if (N < 2) {
                System.out.println("El numero debe ser mayor de 1. Pon otro. ");
            }   //fin if    
        } while (N < 2);
        System.out.println("EJEMPLO 1 ");
        impNum.imprimirNumeros1(N);
        System.out.println();//SALTO DE LINEA
        System.out.println("EJEMPLO 2 ");
        impNum.imprimirNumeros2(N);
        System.out.println();//SALTO DE LINEA
        System.out.println("EJEMPLO 3 ");
        impNum.juntarSeries(N);

    }//fin main
}//fin clase


