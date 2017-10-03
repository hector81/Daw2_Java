/*
Escribir todos los números del 100 al 0 de 7 en 7
 */
package EjercicioRepaso_Evaluacion1_AsaltoCastillo;

/**
 *
 * @author user
 */
public class Numeros7_100 {
    //main
    public static void main(String[] args) {
        //atributo
        int numero = 7 ;
        int limite = 0;
        
        //calcular
        for(int contador =100; contador>=limite;contador--){
            if(contador%7 == 0){
                System.out.print(contador + " ");
            }
        }
    }//fin main   
}//fin clase
