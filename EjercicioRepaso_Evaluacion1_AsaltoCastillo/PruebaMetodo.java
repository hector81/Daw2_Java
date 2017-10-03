/*
metodo1: hacer un rombo sin usar for
metodo2: hacer un metodo que permita recorrer un numero N de esta forma
,(N, N +1, N+2, .....,N+M)
 */
package EjercicioRepaso_Evaluacion1_AsaltoCastillo;

/**
 *
 * @author Hector Garcia
 */
public class PruebaMetodo {

    //metodos
    public void metodo1(int N, int M) {
        while (N <= M) {
            while (N <= M) {
                if(N == M/2 )
                System.out.print("*");
                System.out.print(" ");
                //contador
                N++;
            }//fin while anidado
            
            System.out.println("");
            //contador
            N++;
        }//fin while
    }//fin metodo

    public void metodo2(int N, int M) {
        for (int contador = N; contador <= M; contador++) {
            System.out.print(contador + " ");
        }
    }//fin metodo
}//fin clase
