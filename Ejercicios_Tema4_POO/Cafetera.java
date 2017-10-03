package Ejercicios_Tema4_POO;


public class Cafetera {
    private int capacidadMaxima; // Tamaño de la cafatera
    private int cantidadActual; // Cantidad de cafe que hay en la cafetera
    
    //CONSTRUCTOR PREDETERMINADO O POR DEFECTO: ESTBALECE LA CANTIDAD MAXIMA EN 1000 Y LA ACTUAL EN CERO
    public Cafetera(){
    	capacidadMaxima = 1000;
    	cantidadActual = 0;
    }
    
    //CONSTRUCTOR CON LA CAPACIDAD MAXIMA DE LA CAFETERA: INICIALIZA LA CANTIDAD ACTUAL
    //DE CAFE IGUAL A LA CAPACIDAD MAXIMA
    public Cafetera(int pCapacidadMaxima){ //LA CANTIDAD DE CAFE QUE ME PASAN
        capacidadMaxima = pCapacidadMaxima; //inicializa la cantidad en donde la cantidad es la cantidad que queremos maxima
    	cantidadActual = capacidadMaxima; // inicializa la cantidad actual a la cantidad maxima que nosotros queremos pasarlo
    }
    
    //CONSTRUCTOR CON LA CAPACIDAD MAXIMA Y LA CANTIDAD ACTUAL. SI LA CANTIDAD ACTUAL ES MAYOR
    //QUE LA CAPACIDAD MAXIMA DE LA CAFETERA, LA AJUSTARA AL MAXIMO
    public Cafetera(int pCapacidadMaxima, int pCantidadActual){//LA CANTIDADES DE CAFE QUE ME PASAN
    	if(pCantidadActual > pCapacidadMaxima){
            capacidadMaxima = pCantidadActual; //Si queremos la cantidad maxima sea ej mayor que la actual y que la actual maxima no sea tan grande               
            cantidadActual = pCantidadActual;
        } else {
            capacidadMaxima = pCapacidadMaxima; //Si queremos la cantidad maxima ACTUAL sea ej IGUAL que la MAXIMA QUE QUEREMOS METER
            cantidadActual = pCantidadActual;
        }
        cantidadActual = pCantidadActual; //ESTO POR DEFECTO SEE QUEDA ASI 
        
        
    }
    
  //METODOS GETTERS AND SETTERS
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int pCapacidadMaxima) {
        this.capacidadMaxima = pCapacidadMaxima;
    }
    
    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int pCantidadActual) {
        if(pCantidadActual > cantidadActual){
            cantidadActual = capacidadMaxima; //la llenamos hasta arriba
            System.out.println("No cabe tanto");
        }else{
            capacidadMaxima = capacidadMaxima; //pCapacidadMaxima
        }
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
    	if((cantidadActual + cantidadCafe)< capacidadMaxima){
    		System.out.println("Se añade a la cafetera " + cantidadCafe + " centilitros");
    		cantidadActual = cantidadActual + cantidadCafe;
    	} else if(cantidadActual > capacidadMaxima){
    		System.out.println("No se puede añadir mas cafe");
    		cantidadActual = cantidadActual;
    	}
    }
}
