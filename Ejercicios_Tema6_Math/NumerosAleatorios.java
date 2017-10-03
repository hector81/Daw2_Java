/*
1ºPARTE: Realizar un método que recibe un String con 10 números aleatorios entre 0 y 9, y
calcula y retorna la suma y la media de esos 10 números.
 */
package Ejercicios_Tema6_Math;

/**
 *
 * @author VESPERTINO
 */
public class NumerosAleatorios {
    //ATRIBUTOS 
    private String numeroAleatorio ;
    
    //constructor
    public NumerosAleatorios() {
        this.numeroAleatorio = generaNumeroAleatorio();
    }
    
    //getters y setters
    public String getNumeroAleatorio() {
        return numeroAleatorio;
    }
    
    public void setNumeroAleatorio(String numeroAleatorio) {
        this.numeroAleatorio = numeroAleatorio;
    }
    
    
    // Métodos  
    public String generaNumeroAleatorio() {
        for (int i = 1; i <= 10; i++) {
            int numero = (int) (Math.random() * 10);
            //acumulamos
            numeroAleatorio = numero + numeroAleatorio;
            System.out.println("el numero " + i + " es: " + numero);            
        }

        return numeroAleatorio;
    }

}//fin clase
