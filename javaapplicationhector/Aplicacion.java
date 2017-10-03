package javaapplicationhector;
/*
Contiene un método main que, tras crear una instancia de la nueva clase 
JuegoAdivinaNumero que se ha creado, llama al método juega().
*/
public class Aplicacion {
    //main
    public static void main(String[] args) {
        //creamos objeto y le pasamos en numero de vidas iniciales
        Juego j2 = new JuegoAdivinaNumero(8);
        j2.juega();
    }//fin main
}//fin clase
