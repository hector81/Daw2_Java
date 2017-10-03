/*
Sin embargo ahora se pretende diferenciar la información de algunos tipos
de barcos:
- Número de mástiles para veleros. El precio de amarre de los veleros
será el precio de un barco general, mas la suma de número de másti-
les * 5 €.
 */
package Ejercicios_Tema5_Herencia_GestionAmarres;


/**
 *
 * @author Hector Garcia
 */
public class Veleros extends Barco {
    //ATRIBUTOS
    private int numeroMastiles;
    
    //CONSTRUCTOR COMPLETO
    public Veleros(String matricula, int esloraMetros, 
            int yearFabricacion, int numeroMastiles) {
        super(matricula, esloraMetros, yearFabricacion);
        this.numeroMastiles = numeroMastiles;
    }
    
    //METODOS GETTERS AND ASETTERS
    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }
    
    @Override
    public int precioAmarre(){        
        return getEsloraMetros()*10 + 2 + getNumeroMastiles()*5;
    }//FIN METODO

    
    
}
