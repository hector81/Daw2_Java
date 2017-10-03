/*
Sin embargo ahora se pretende diferenciar la información de algunos tipos
de barcos:
- Potencia de CV para embarcaciones deportivas a motor. El precio de-
lamarre para este tipo de embarcaciones será la heredada mas la po-
tencia en CV * 1€.
 */
package Ejercicios_Tema5_Herencia_GestionAmarres;

/**
 *
 * @author Hector Garcia
 */
public class EmbarcacionesDeportivasMotor extends Barco {
    //ATRIBUTOS
    private int potenciaCV;
    
    //constructor completo llamando a clase superior
    public EmbarcacionesDeportivasMotor(String matricula, int esloraMetros, int yearFabricacion, int potenciaCV) {
        super(matricula, esloraMetros, yearFabricacion);
        this.potenciaCV = potenciaCV;
    }
    
    //Metodos getters and setters
    public int getPotenciaCV() {
        return potenciaCV;
    }
   
    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    
    
    @Override
    public int precioAmarre(){   
        return getEsloraMetros()*10 + 2 + getPotenciaCV()*1;
    }//FIN METODO
 
}//fin clase
