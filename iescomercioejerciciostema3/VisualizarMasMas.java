/*
5.	Realizar un programa en Java que visualiza el resultado de la serie 8+10+12+14+....+50
 */
package iescomercioejerciciostema3;

public class VisualizarMasMas {
    //main
    public static void main(String[] args) {
    //declarar variables
    int contador = 6;//lo pongo en 6 para que empieze en 8
    int sumaTotal=0;   
        
        while(contador < 50){         
             contador = contador + 2 ; 
             System.out.print(contador + " ");
             sumaTotal += contador;
             
        }
        
    //IMPRIMIR
          System.out.println("resultado: " + sumaTotal);  
        
    }//fin del main
}//fin de la clase
