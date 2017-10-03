package Ejercicios_Tema4_POO;

import java.util.Scanner;

//Deriva de la clase Juego.
public class JuegoAdivinaNumero extends Juego {
    // Declaramos atributos
    private int numeroSecreto;

    /* constructores
            constructor que toma un par�metro: el n�mero de vidas que, a su vez, se lo pasar� al constructor 
            de la clase base. Para dar valor al atributo numeroSecreto, hay que llamar 
            al m�todo obtenerNumeroSecreto().
    */
    JuegoAdivinaNumero(int vidasIniciales) {
            super(vidasIniciales);
            numeroSecreto = obtenerNumeroSecreto();
    }// Fin del constructor

    /* METODO OBTENER NUMERO SECRETO
            El m�todo obtenerNumeroSecreto(), devuelve un n�mero entero aleatorio entre 0 y 10.
    */
    public int obtenerNumeroSecreto() {
            this.numeroSecreto = (int) (Math.random() * 10);
            return this.numeroSecreto;
    }// Fin del metodo

    /* METODO VALIDA NUMERO
            El m�todo validaNumero, que recibe un entero como par�metro, analizar� dicha variable bajo la siguiente condici�n:
            -Si el n�mero est� entre 0 y 10, el m�todo devuelve true.
            En caso contrario, se imprime el siguiente mensaje "El n�mero que has introducido, no est� entre 0 y 10", y
             el m�todo devuelve false.
    */
    public boolean validaNumero(int numeroIntroducido) {
            if (numeroIntroducido >= 0 && numeroIntroducido <= 10) {
                    return true;
            } else if (numeroIntroducido > 10 || numeroIntroducido < 0) {
                    return false;
            }
            return false;
    }// Fin del metodo

    /*M�TODO REINICIAR PARTIDA, en su implementaci�n llama al m�todo reiniciaPartida() 
      de la clase base, y asigna al atributo del n�mero secreto el valor obtenido de la llamada al m�todo 
      obtenerNumeroSecreto().
     */

    @Override
    public void reiniciarPartida() {
            numeroSecreto = obtenerNumeroSecreto();
            return;
    }// Fin del metodo

    //M�TODO JUEGA.Implementa el m�todo juega() de la clase base
    @Override
    public void juega() {
        // DECLARAMOS VARIABLE INT NumeroIntroducido
        int NumeroIntroducido;
        // PEDIMOS EL NUMERO POR SCANNER
        System.out.println(numeroSecreto);
        //Muestra un mensaje al usuario pidiendo que adivine un n�mero entre el 0 y el 10.
        System.out.println("Adivina un numero del 0 al 10. Tienes "
                        + vidasIniciales + " vidas iniciales");
        //do while para casos en que el número sea menor de o mayor de 10
        do{

        Scanner in = new Scanner(System.in);
        NumeroIntroducido = in.nextInt();
            //Comprueba que el n�mero introducido sea v�lido (llamando al m�todo validaNumero), 
            //sino haz que el usuario introduzca otro n�mero.
            if(validaNumero(NumeroIntroducido) == false){
                    System.out.println("El n�mero es mayor de 10 o menor que 0. Introduce otro : ");	
        }
        }while(validaNumero(NumeroIntroducido) == false);

        if(validaNumero(NumeroIntroducido) == true){
        //Si el n�mero es v�lido, comprueba si coincide con el n�mero secreto y en
        //caso afirmativo, muestra un mensaje �Acertaste!!� y, tras llamar a actualizaRecord(),
        //sale del m�todo juega().
            if(numeroSecreto == NumeroIntroducido){
                    System.out.println("Acertaste");
                    actualizarRecord();
                    System.out.println("Vuelva a jugar");
                    reiniciarPartida();
                    //NumeroIntroducido = in.nextInt();
            } else{//Si el n�mero es v�lido, comprueba si coincide con el n�mero secreto y en
                    //caso afirmativo, muestra un mensaje �Acertaste!!� y, tras llamar a actualizaRecord(),
                    //sale del m�todo juega().
                    do{
                        /*	Mientras no se acierte el n�mero y le sigan quedando vidas al usuario
                                Lee el n�mero introducido por teclado.*/
                        /*	Si el n�mero es v�lido, comprueba si coincide con el n�mero secreto. 
                            En caso de que sea diferente, llama al m�todo quitaVida() heredado y
                            si el m�todo quitaVida() devuelve true, significa que a�n le quedan m�s vidas 
                            al jugador y puede seguir jugando.
                         */
                        if(getVidasRestantes() > 0){
                            quitaVida();
                            System.out.println("Fallaste"
                            + " una vida menos .Te quedan " + getVidasRestantes()	
                            + " vidas. Introduce otro : ");
                            // COMO HEMOS FALLADO SE REPITE LA INSTRUCCION DE INTRODUCIR
                            // EL NUMERO
                            //NumeroIntroducido = in.nextInt();
                        }else if(getVidasRestantes() == 0){
                            System.out.println("No puede seguir jugando. Ha agotado sus vidas");
                            System.out.println("El n�mero secreto era : "+ numeroSecreto);
                            System.out.println("Vuelva a jugar");
                            reiniciarPartida();
                        }
                        /*	Si el n�mero es v�lido, comprueba si coincide con el n�mero secreto. 
                        En caso de que sea diferente, llama al m�todo quitaVida() heredado y
                        si el m�todo quitaVida() devuelve false significa que ya no le quedan m�s 
                        vidas al jugador, con lo que sale del m�todo juega().*/                 
                    }while((NumeroIntroducido != numeroSecreto) && (getVidasRestantes() > 0
                            || getVidasRestantes() == 0));
            }
        }//fin if
    }// Fin del metodo
}// FIN DE LA CLASE
