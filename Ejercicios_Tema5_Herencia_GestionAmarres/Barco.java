/*
Un BARCO se
caracteriza por su matrícula, su eslora en metros y año de fabricación.
 */
package Ejercicios_Tema5_Herencia_GestionAmarres;


/**
 *
 * @author Héctor Garcia
 */
public class Barco {
    //ATRIBUTOS
    private String matricula;
    private int esloraMetros ;
    private int yearFabricacion;
    
    //constructor completo
    public Barco(String matricula, int esloraMetros,int yearFabricacion ){
        this.matricula = matricula;
        this.esloraMetros = esloraMetros;
        this.yearFabricacion = yearFabricacion;
    }
    
    //Métodos getters
    public String getMatricula(){
        return this.matricula;
    }//fin metodo
    
    public int getEsloraMetros(){
        return this.esloraMetros;
    }//fin metodo
    
    public int getYearFabricacion(){
        return this.yearFabricacion;
    }//fin metodo
    
    //Métodos setters 
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }//fin metodo
    
    public void setEsloraMetros(int esloraMetros){
        this.esloraMetros = esloraMetros;
    }//fin metodo
    
    public void setYearFabricacion(int yearFabricacion){
        this.yearFabricacion = yearFabricacion;
    }//fin metodo

    //Método toStrong que hereda directamente de object
    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", esloraMetros=" +
                esloraMetros + ", yearFabricacion=" + yearFabricacion + '}';
    }
    
    /*METODO PRECIO AMMARRE
    Un alquiler se calcula multiplicando el número de días de ocupación (inclu-
    yendo los días inicial y final) por un módulo función de cada barco (obte-
    niendo simplemente multiplicando por 10 los metros de eslora) y por el valor
    fijo (2 € en la actualidad).*/
    public int precioAmarre(){  
        return getEsloraMetros()*10 +2;
    }//FIN METODO
    
}
