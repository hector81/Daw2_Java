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

/**
 *
 * @author Hector Garcia
 */
public class VistaControlador {
    //atributos
    private int operador1;
    private int operador2;
    private String operando;
    private double resultado;
    
    //constructor
    public VistaControlador(int operador1, int operador2, String operando, double resultado) {
        this.operador1 = operador1;
        this.operador2 = operador2;
        this.operando = operando;
        this.resultado = resultado;
    }//fin constructor
    
    //getters setters
    public int getOperador1() { 
        return operador1;
    }

    public void setOperador1(int operador1) {
        this.operador1 = operador1;
    }

    public int getOperador2() {
        return operador2;
    }

    public void setOperador2(int operador2) {
        this.operador2 = operador2;
    }

    public String getOperando() {
        return operando;
    }

    public void setOperando(String operando) {
        this.operando = operando;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    
}//fin clase
