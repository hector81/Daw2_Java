/*
sacar resultado acumulado de la serie 5.50.50.........5000000
 */
package Ejercicios_Tema3_Bucles_For;

/**
 *
 * @author VESPERTINO
 */
public class SacarResultadoAcumulado {
    
//main
    public static void main(String[] args) {
        int i;
        int j;
        long acumulador1 = 0;
        long acumulador2 = 0;
        
        for(i =6; i <= 60 ; i +=3){
            System.out.print("" + i + " ");
            //acumulador
            acumulador1 = i*i;
        }
        System.out.print("");
        System.out.println("Resultado de la serie 6: " + acumulador1);
        
        System.out.println("****************************************");
        
        for(j =5; j <= 5000000 ; j*=10){
            System.out.print("" + j + " ");
            //acumulador
            acumulador2 += j;
        }
        
        System.out.print("");
        System.out.println("Resultado de la serie 5: " + acumulador2);
    }//fin main
}//fin clase
