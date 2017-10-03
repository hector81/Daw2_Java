package javaapplicationhector;

import java.util.Scanner;

//Hereda de la clase Juego.
public class JuegoAdivinaNumero extends Juego {

    //atributos
    private int numeroSecreto;

    // constructores
    //Tiene un constructor que toma un parámetro: el número de vidas que, a su 
    //vez, se lo pasará al constructor de la clase base. Para dar valor
    //al atributo numeroSecreto, hay que llamar al 
    //método obtenerNumeroSecreto().
    JuegoAdivinaNumero(int vidasIniciales) {
        super(vidasIniciales);
        numeroSecreto = obtenerNumeroSecreto();
    }//FIN METODO

    // METODOS
    // METODO OBTENER NUMERO SECRETO
    //El método obtenerNumeroSecreto(), devuelve un número entero aleatorio entre 0 y 10.
    public int obtenerNumeroSecreto() {
        this.numeroSecreto = (int) (Math.random() * 10);
        return this.numeroSecreto;
    }//FIN METODO

    // METODO VALIDA NUMERO
    //El método validaNumero, que recibe un entero como parámetro,
    //analizará dicha variable bajo la siguiente condición:
    //Si el número está entre 0 y 10, el método devuelve true.
    //En caso contrario, se imprime el siguiente mensaje "El número que has
    //introducido, no está entre 0 y 10", y el método devuelve false.
    public boolean validaNumero(int numeroIntroducido) {
        boolean validaNumero = false;//iniciamos variable local
        if (numeroIntroducido >= 0 && numeroIntroducido <= 10) {
            validaNumero = true;
        } else if (numeroIntroducido > 10) {
            System.out.println("El numero introducido no esta entre 0 y 10");
            validaNumero = false;
        }
        return validaNumero;
    }//FIN METODO

    // METODO REINICIAR PARTIDA
    //Para el método reiniciaPartida() de la clase JuegoAdivinaNumero, en su 
    //implementación llama al método reiniciaPartida() de la clase base, y 
    //asigna al atributo del número secreto el valor obtenido de la llamada 
    //al método obtenerNumeroSecreto().
    @Override
    public void reiniciarPartida() {
        super.reiniciarPartida();
        numeroSecreto = obtenerNumeroSecreto();
    }//FIN METODO

    //METODO JUEGA
    //Implementa el método juega() de la clase base:
    //Muestra un mensaje al usuario pidiendo que adivine un número entre el 0 y el 10.
    //Mientras no se acierte el número y le sigan quedando vidas al usuario:
    //Lee el número introducido por teclado.
    //Comprueba que el número introducido sea válido (llamando al método validaNumero), sino haz que el usuario introduzca otro número.
    //Si el número es válido, comprueba si coincide con el número secreto. 
    //En caso afirmativo, muestra un mensaje “Acertaste!!” y, tras llamar a actualizaRecord(), sale del método juega().
    //En caso de que sea diferente, llama al método quitaVida() heredado.
    //Si el método quitaVida() devuelve true, significa que aún le quedan más vidas al jugador y puede seguir jugando.
    //Si el método quitaVida() devuelve false significa que ya no le quedan más vidas al jugador, con lo que sale del método juega().
    @Override
    public void juega() {
        //variablee locales
        int NumeroIntroducido;
        int respuesta;
        boolean juegoTerminado = false;//por si queremos terminar de jugar
        boolean juegoNuevo = true;//por si queremos jugar otra vez
        //pedimos al usuario que adivine un numero del 0 al 10 y le ponemos sus vidas iniciales
        System.out.println("Adivina un numero del 0 al 10");
        //System.out.println("El número es: " + numeroSecreto);
        System.out.println("Tienes " + super.getVidasIniciales() + " vidas iniciales");
        //pedimos datos      
        do {
            do {//pedimos al usuario que introduzca un numero correcto
                System.out.print("Pon numero: ");
                Scanner numero = new Scanner(System.in);
                NumeroIntroducido = numero.nextInt();
            } while (validaNumero(NumeroIntroducido) == false);
            //si el numero es correcto ,actualiza el record
            if (NumeroIntroducido == numeroSecreto) {
                System.out.println("Acertaste");
                actualizarRecord();
                //ahora le preguntamos si quiere volver a jugar
                System.out.println("¿Quieres jugar otra partida? Pon 1 si es que SI y 2 si es que NO");
                //pediremos la respuesta
                do {
                    Scanner letra = new Scanner(System.in);
                    respuesta = letra.nextInt();
                    if (respuesta != 1 && respuesta != 2) {
                        System.out.println("No se puede poner otra respuesta que no sea 1 (SI) o 2 (NO). ");
                    }
                } while (respuesta != 1 && respuesta != 2);
                //si la respuesta es si, reiniciamos la partida
                if (respuesta == 1) {
                    juegoNuevo = true;
                    reiniciarPartida();
                    //Volvemos a pedir al usuario que adivine un numero del 0 al 10 y 
                    //le ponemos sus vidas iniciales
                    System.out.println("VOLVEMOS A JUGAR. Adivina un numero del 0 al 10");
                    //System.out.println("El número es: " + numeroSecreto);
                    System.out.println("Tienes " + super.getVidasIniciales() + " vidas iniciales");
                    //si la respuesta es no ponemos el booleano juegoTerminado a true y con esto se acaba
                    //la partida. Ponemos el record final
                } else if (respuesta == 2) {
                    juegoTerminado = true;
                    System.out.println("TU RECORD FINAL ES " + getRecord());
                }
                //si el numero no es correcto, resta una vida mientras te queden
            } else if (numeroSecreto != NumeroIntroducido && getVidasRestantes() > 0) {
                quitaVida();
                muestraVidasRestantes();
            }
        } while (!juegoTerminado && getVidasRestantes() > 0);//hace esto mientras queden vidas
        //si las vidas llegan a 0 ,acaba el juego. Ponemos el record final
        if (getVidasRestantes() == 0) {
            System.out.println("El número secreto era el " + numeroSecreto);
            System.out.println("TU RECORD FINAL ES " + getRecord());
            System.out.println("GAME OVER");
        }//FIN IF

    }//FIN METODO

}//fin clase


/*
if (numeroSecreto == numeroIntroducido) {
                System.out.println("Has acertado, número correcto: " + numeroIntroducido);
                System.out.println("¿Quieres jugar otra partida? [y/n]");
                
                if (in.next().equalsIgnoreCase("y")){
                    System.out.println("jugar otra partida");
                    juegoNuevo = true;
                } else {
                    System.out.println("no jugar otra partida");
                    juegoTerminado = true;
                }
            }
*/