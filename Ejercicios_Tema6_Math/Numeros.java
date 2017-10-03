/*
1ºPARTE: Realiza un método que recibe tres enteros NEGATIVOS (por referencia) y los convierte en
positivos dentro del método (usando el método abs de la clase Math). Mostrar en el main 
el valor de los 3 enteros antes y después de llamar al método.
 */
package Ejercicios_Tema6_Math;



/**
 *
 * @author Hector
 */
import java.util.Scanner;
public class Numeros {

    //ATRIBUTOS  
    private int n1;
    private int n2;
    private int n3;
    
    public Numeros(int n1, int n2, int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
    

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }
    
            
    public Numeros() {
        this.n1 = n1; 
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    
    
}
