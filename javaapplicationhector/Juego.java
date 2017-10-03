package javaapplicationhector;

public abstract class Juego {
    //atributos
    //Tiene 3 parámetros privados de tipo entero. Indicar que el record es de 
    //tipo estático y por defecto, está inicializado a 0.
    private int vidasRestantes;
    private int vidasIniciales;
    private static int record = 0;

    //constructor para establecer los valores del atributo
    //Existe un constructor al cuál se le pasa el número de vidas iniciales 
    //como parámetro. Además de dar valor a dicho atributo, el constructor 
    //deberá de llamar al método reiniciaPartida().
    public Juego(int vidasIniciales) {
        this.record = record;
        this.vidasIniciales = vidasIniciales;
        this.vidasRestantes = vidasRestantes;
        this.reiniciarPartida();	
    }//fin constructor

    //METODOS
    // METODO AÑADIDO GETVIDASINICIALES para saber el número de vidas iniciales
    public int getVidasIniciales() {
        return vidasIniciales;

    }//Fin del metodo
    
    // METODO AÑADIDO GETRECORD para saber el RECORD
    public int getRecord() {
        return record;

    }//Fin del metodo
    
    // METODO GETVIDASRESTANTES
    //getVidasRestantes() devuelve el valor del atributo
    public int getVidasRestantes() {
        return this.vidasRestantes;
    }//fin metodo
    
    // METODO REINICIAR PARTIDA
    //El método reiniciaPartida(), sirve para reiniciar el valor de las vidas restantes 
    //con el número de vidas iniciales.
    public void reiniciarPartida() {
        this.vidasRestantes = vidasIniciales;
    }//fin metodo

    // METODO MUESTRA VIDAS RESTANTES
    //metodo muestraVidasRestastes() imprime el valor del atributo.
    public void muestraVidasRestantes() {
        if (getVidasRestantes() > 0) {
            System.out.println("Numero no correcto. Te quedan " + this.getVidasRestantes()
                    + " vidas. Introduce otro numero");
        } else if (getVidasRestantes() == 0) {
            System.out.println("No te quedan vidas. ");
        }
    }//fin metodo

    // METODO QUITA VIDA
    //Implementa el método quitarVida(), a partir del cual:
    //Se disminuye en una unidad el valor del número de vidas restantes.
    //Se comprueba si quedan vidas. En caso afirmativo, el método devolvera true. 
    //En caso contrario, devolvera false y ademas se imprimira Juego Terminado.
    public boolean quitaVida() {
        this.vidasRestantes--;//Se disminuye en una unidad 
        boolean auxiliar = false;//se comprueba
        if (this.vidasRestantes > 0) {
            auxiliar = true;
        } else {
            System.out.println("Juego terminado");
            auxiliar = false;
        }
        return auxiliar;

    }//fin metodo

    // METODO ACTUALIZAR RECORD
    //Implementa el método actualizaRecord(), el cual en caso de que el valor de las vidas
    //restantes sea mayor al record, el record se actualizar con el valor de las vidas 
    //restantes y se imprimir un mensaje indicando el valor del nuevo record.
    public void actualizarRecord() {
        if (vidasRestantes > record) {
            record = vidasRestantes;
            System.out.println("Nuevo record=" + vidasRestantes);           
        }
        else if (vidasRestantes < record || vidasRestantes == record) {
            System.out.println("No hay record");
        }
    }//fin metodo

    // METODO ABSTRACTO JUEGA
    abstract void juega();

}//fin clase
