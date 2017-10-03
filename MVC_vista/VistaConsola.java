/*
Realiza ahora la clase VistaConsola con las siguientes consideraciones:
◦ Constructor: Muestra menú (1) Realizar operación y (2) Salir
◦ En el método setControlador llamaremos al método actionPerformed
pasándole un objeto de tipo ActionEvent → Pregunta a tu
profesor
NOTA: Es obligatorio NO TOCAR TAMPOCO el CONTROLADOR de forma
que sólo sea la vista la que cambiemos y se reutilice tanto Modelo
como Controlador
 */
package MVC_vista;

import MVC_controlador.CalculadoraControlador;
import MVC_modelo.Modelo;
import java.awt.event.ActionEvent;
import java.util.Scanner;

/**
 *
 * @author Hector Garcia
 */
public class VistaConsola implements InterfazVistas {
    //atributos
    private String operador1;
    private String operador2;
    private String operando;
    private String resultado;
    private Scanner sc;
    private Modelo mod;
    private CalculadoraControlador cal;

    public VistaConsola() {
        this.sc = new Scanner(System.in);
    }

    
    
    public void muestraMenu() {

        while (true) {
            System.out.println("Pasame el primer operando: ");
            operador1 = sc.nextLine();
            System.out.println("Pasame el segundo operando: ");
            operador2 = sc.nextLine();
            System.out.println("Pasame el operador: ");
            operando = sc.nextLine();
            cal.actionPerformed(new ActionEvent(cal, 1, "BotonCalcular"));

            System.out.println("Calculo: ");
            System.out.println(resultado);
            String respuesta;
            System.out.println("Acabado. QUIERES SALIR O REINICIAR. s/n");
            respuesta = sc.nextLine();
            if (respuesta.equals("s")) {

            } else if (respuesta.equals("n")) {

                cal.actionPerformed(new ActionEvent(cal, 2, "BotonCerrar"));
            }
        }
    }
    
   
    //METODOS implementados
    @Override
    public String getOperando1() {
        return operador1 ;
    }

    @Override
    public String getOperando2() {
        return operador2;
    }

    @Override
    public String getOperador() {
        return operando;
    }

    @Override
    public void setResultado(String dato) {
        resultado = dato;
    }

    @Override
    public void setControlador(CalculadoraControlador objeto) {
        cal=objeto;
      // muestraMenu();
    }

    @Override
    public void iniciarPrograma() {
        muestraMenu();
    }
}
