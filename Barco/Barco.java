/*
 Un BARCO se caracteriza por su matrícula, su eslora en metros
y año de fabricación.
 */
package Barco;

import java.io.Serializable;
import java.util.GregorianCalendar;

public class Barco implements Serializable{
    //atributos
    private int matricula, eslora;
    private String añoFabricacion;
    //constructor

    public Barco(int matricula, int eslora, String añoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoFabricacion = añoFabricacion;
    }

    public Barco(int matricula) {
        this.matricula=matricula;
    }
    
    
    //getters y setters

    public int getMatricula() {
        return matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public String getAñoFabricación() {
        return añoFabricacion;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public void setAñoFabricación(GregorianCalendar añoFabricación) {
        this.añoFabricacion = añoFabricacion;
    }
    
    
    /*se calcula multiplicando el número de días de ocupación (incluidos finicio y ffin
    por un módulo de función de cada barco (obteniendo simplemente mult por 10 los
    metros de eslora) y por el valor fijo (2€).
    */
   public double calculaAlquiler (){
       double aux;
       aux=getEslora()*10;
       return aux;
   }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Barco other = (Barco) obj;
        if (this.matricula != other.matricula) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Barco. Matrícula: " + matricula + ", eslora: " + eslora + ", Anio Fabricación " + añoFabricacion;
    }
    
   
    
}
