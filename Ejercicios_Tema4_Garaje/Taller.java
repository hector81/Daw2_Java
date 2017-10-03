/*
Desarrollar una clase llamada Taller que:

- Tenga tres atributos, un coche, un String con la avería asociada y el número de coches 
que ha ido atendiendo.
- El garaje solo podrá atender a un coche en cada momento. Controlar esta premisa.
- Tenga un método aceptarCoche que recibe un parámetro de tipo Coche y la avería asociada. 
- El garaje solo podrá atender a un coche en cada momento. Si ya está atendiendo uno que 
devuelva un false.
- Tenga un método devolverCoche que dejara al garaje en estado de aceptar un nuevo coche.
 */
package Ejercicios_Tema4_Garaje;

/**
 *
 * @author Hector Garcia hacer que pueda ociupar 4
 */
public class Taller {
    //ATRIBUTOS
    //tipo coche
    private Coche coche;
    private String averíaAsociada;
    private int numeroCoches;
    //private boolean ocupado;
    
    //constructores para inicializar
    public Taller() {
        coche = null;
        numeroCoches = 0;
        averíaAsociada =null;        
    }
    
    
    //METODOS
    //si el taller ya tiene mas coches no lo acepta, y si no te acepta y te marca el tipo de averia
    public  boolean aceptarCoche(Coche pcoche, String paveríaAsociada){        
        //declaramos aux para caso de aceite mas 10 litros
        int aux;
        if (coche==null) {// El garaje solo podrá atender a un coche en cada momento. Controlar esta premisa.       
            System.out.println("El taller esta libre puede usted pasar");
            //declaramos las plazas del coche, con los parametros los pasamos a mi objeto
            coche = pcoche;
            //declaramos el tipo de averia
            averíaAsociada = paveríaAsociada;
            //- Si la avería de coche es “aceite” incrementar en 10 los litros de aceite.
            if(averíaAsociada == "Aceite"){
                //aux , serie el coche , el motor donde se envia con el getAceite los litros de aceite
                aux = coche.getMotor().getLitrosAceite();
                aux = aux +10;
                coche.getMotor().setLitrosAceite(aux);
                //tambien podia hacerse aux = coche.getMotor().getLitrosAceite(coche.getMotor().setLitrosAceite(aux));          
            }
            return true;
        } else {
            System.out.println("El taller esta ocupado lo siento");
            return false;
        } 
             
    }
    
    //si el taller no tiene coche ,aumenta el numero de coches que hay en el
    public void devolverCoche(int numeroCoches){        
        Aleatorios aa = new Aleatorios(100,1000);
        numeroCoches++;
        System.out.println("El taller esta libre, cogemos otro coche"); 
        coche.acumularAvería(88.3);//AUMENTA FACTURA
        coche=null;
        
    }
    
    //creamos metodo para devolver un precio aleatorio hasta 1000
        public int devolverPrecioAleatorio(){
            int precioAleatorio = (int) (Math.random()*1000);
            return precioAleatorio;
        }
    
    
    
    
    
}
