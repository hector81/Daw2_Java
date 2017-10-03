/*
En un puerto se alquilan amarres para barcos de distinto tipo.
Para cada ALQUILER se guarda el nombre y DNI del cliente, las fechas inicial y final
de alquiler, la posición del amarre y el barco que lo ocupará
 */
package Ejercicios_Tema5_Herencia_GestionAmarres;



/**
 *
 * @author Hector Garcia
 */
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class Alquiler {
    //ATRIBUTOS
    private Cliente cliente;
    private GregorianCalendar fInicial;
    private GregorianCalendar fFinal;
    private Barco barco;
    
    //CONSTRUCTOR COMPLETO
    public Alquiler(Cliente cliente,GregorianCalendar fInicial,GregorianCalendar fFinal,Barco barco){
        this.cliente =  cliente;
        this.fInicial = fInicial;
        this.fFinal = fFinal ;
        this.barco = barco ;
    }//FIN CONSTRUCTOR

    //METODOS GETTERS
    public Cliente getCliente() {
        return cliente;
    }//FIN METODO

    public GregorianCalendar getfInicial() {
        return fInicial;
    }//FIN METODO
    
    public GregorianCalendar getfFinal() {
        return fFinal;
    }//FIN METODO
    
    public Barco getBarco() {
        return barco;
    }//FIN METODO
    
    //METODOS GETTERS
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }//FIN METODO

    public void setfInicial(GregorianCalendar fInicial) {
        this.fInicial = fInicial;
    }//FIN METODO

    public void setfFinal(GregorianCalendar fFinal) {
        this.fFinal = fFinal;
    }//FIN METODO

    public void setBarco(Barco barco) {
        this.barco = barco;
    }//FIN METODO
    
    public double calculaPrecio() {
        //creamos 2 fechas 
        GregorianCalendar fechaInicio = new GregorianCalendar();
        GregorianCalendar fechaFin = new GregorianCalendar();
        Date fi = fechaInicio.getTime();
        Date ff = fechaFin.getTime();     
        double diferenciaDias = (double) ((double)ff.getTime() - fi.getTime());
        return (barco.precioAmarre())*diferenciaDias;
    }
    
    //METODO AÑADIDO
    public int diasAlquiler() {
        //creamos 2 fechas 
        int diasTotales;
        diasTotales = ((int)getfInicial().getTimeInMillis() - (int)getfFinal().getTimeInMillis())/(1000/60/60/24);
        return diasTotales;
    }
    
}//fin clase




/*
1. En un puerto se alquilan amarres para barcos de distinto tipo. Para cada
ALQUILER se guarda el nombre y DNI del cliente, las fechas inicial y final
de alquiler, la posición del amarre y el barco que lo ocupará. Un BARCO se
caracteriza por su matrícula, su eslora en metros y año de fabricación.

Un alquiler se calcula multiplicando el número de días de ocupación (inclu-
yendo los días inicial y final) por un módulo función de cada barco (obte-
niendo simplemente multiplicando por 10 los metros de eslora) y por el valor
fijo (2 € en la actualidad).

Sin embargo ahora se pretende diferenciar la información de algunos tipos
de barcos:

- Número de mástiles para veleros. El precio de amarre de los veleros
será el precio de un barco general, mas la suma de número de másti-
les * 5 €.

- Potencia de CV para embarcaciones deportivas a motor. El precio de-
lamarre para este tipo de embarcaciones será la heredada mas la po-
tencia en CV * 1€.

- Potencia de CV y número de camarotes para yates de lujo. El precio
del amarre para este tipo de embarcaciones seŕa igual al de embarba-
ciones deportivas a motor, pero además le sumaremos el no de cama-
rotes * 20 €.

Nota 1:

- Las fechas serán de tipo GregorianCalendar.

- Se sobrescribirá el cálculo del alquiler en las tres clases hijas.

- Para averiguar como se calcula la diferencia entre dos fechas podéis
echar un vistazo a la url: http://txos.blogspot.com/2005/07/java-
diferencia-de-dias-entre-dos.html

http://chuwiki.chuidiang.org/index.php?title=Clase_Calendar_de_Java
Utilizando la herencia de forma apropiada, diseñe el diagrama de clases y
sus relaciones, con detalle de atributos y métodos necesarios. Realice el
programa adecuado a dicho diagrama.
 */

