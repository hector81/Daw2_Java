package Paquete1;


public class Cafetera {
    //este es un atributo de TIPO MOTOR
    private int capacidadMaxima;
    private int cantidadActual;
    
    //CONSTRUCTOR PREDTERMINADO: ESTBALECE LA CANTIDAD MAXIMA EN 1000 Y LA ACTUAL EN CERO
    public Cafetera(){
    	capacidadMaxima = 1000;
    	cantidadActual = 0;
    }
    
    //CONSTRUCTOR CON LA CAPACIDAD MAXIMA DE LA CAFETERA: INICIALIZA LA CANTIDAD ACTUAL
    //DE CAFE IGUAL A LA CAPACIDAD MAXIMA
    public Cafetera(int cact){
    	cantidadActual = capacidadMaxima;
    }
    
    //CONSTRUCTOR CON LA CAPACIDAD MAXIMA O ACTUAL. SI LA CANTIDAD ACTUAL ES MAYOR
    //QUE LA CAPACIDAD MAXIMA DE LA CAFETERA, LA AJUSTARA AL MAXIMO
    public Cafetera(int cact, int ccapmax){
    	if(cantidadActual > capacidadMaxima){
    		cantidadActual = capacidadMaxima;
    	}
    }
    
  //METODOS GETTERS AND SETTERS
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int ccapmax) {
        this.capacidadMaxima = ccapmax;
    }
    
    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cact) {
        this.cantidadActual = cact;
    }
    
    //METODOS
    
    //llenarCafetera() . hace que la cantidad actual sea igual a la capacidad maxima
    public void llenarCafetera(){
    	cantidadActual = capacidadMaxima;
    }
    //servirTaza(int) . Simula la acci�n de servir una taza con la capacidad indicada.
    //Si la cantidad actual de cafe "no alcanza", para llenar la taza, se sirve lo que quede.
    public void servirTaza(int contenidoTaza){
    	if(cantidadActual > contenidoTaza){
    		System.out.println("Se sirve de la cafetera " + contenidoTaza + " centilitros");
    		cantidadActual = cantidadActual - contenidoTaza;
    	} else if(cantidadActual < contenidoTaza){
    		System.out.println("Solo se puede servir en la taza " + cantidadActual
    				+ " centilitros");
    		cantidadActual = 0;
    	}
    }
    
    //vaciarCafetera() . Pone la cantidad actual de caf� en cero.
    public void vaciarCafetera() {
        cantidadActual = 0;
    }
    
    //agregarCafe(int) . A�ade a la cafetera la cantidad de cafe indicada.
    public void agregarCafe(int cantidadCafe) {
    	if(cantidadActual < capacidadMaxima){
    		System.out.println("Se a�ade a la cafetera " + cantidadCafe + " centilitros");
    		cantidadActual = cantidadActual + cantidadCafe;
    	} else if(cantidadActual > capacidadMaxima){
    		System.out.println("No se puede a�adir m�s caf�");
    		cantidadActual = cantidadActual;
    	}
    }
}
