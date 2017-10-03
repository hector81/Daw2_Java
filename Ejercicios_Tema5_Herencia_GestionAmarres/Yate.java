/*
Sin embargo ahora se pretende diferenciar la información de algunos tipos
de barcos:
Potencia de CV y número de camarotes para yates de lujo. El precio
del amarre para este tipo de embarcaciones seŕa igual al de embarba-
ciones deportivas a motor, pero además le sumaremos el no de cama-
rotes * 20 €.
 */
package Ejercicios_Tema5_Herencia_GestionAmarres;


/**
 *
 * @author Hector Garcia
 */
public class Yate extends EmbarcacionesDeportivasMotor {
    //ATRIBUTOS
    private int numeroCamarotes;

    public Yate(String matricula, int esloraMetros, int yearFabricacion,int potenciaCV, int numeroCamarotes) {
        super(matricula, esloraMetros, yearFabricacion, potenciaCV);
        this.numeroCamarotes = numeroCamarotes;
    }

    //METODOS GETTERS AND SETTERS
    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }
    
    public void setNumeroCamarote(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }
    
    
    @Override
    public int precioAmarre(){
        return getEsloraMetros()*10 + 2  + this.getPotenciaCV()*1 + getNumeroCamarotes()*20;
    }//FIN METODO
}
