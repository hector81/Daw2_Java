/*
La clase Modelo tendrá un método llamado realizaOperacion que reciba
3 Strings (operando1, operando2 y operador) y que según el operador
realice y retorne el resultado de la operación
 */
package MVC_modelo;

/**
 *
 * @author Hector Garcia
 */
public class Modelo {

    //metodo realizar la operacion que es independiente de como se reciban los datos
    public double realizaOperacion(String operador1, String operador2, String operador){
        double resultado = 0;
        int op1 = Integer.parseInt(operador1);
        int op2 = Integer.parseInt(operador2);
        switch(operador){
            case "+":
                resultado = op1 + op2;
                break;
            case "-":
                resultado = op1 - op2;
                break;
            case "x":
                resultado = op1 * op2;
                break;
            case "/":
                resultado = op1 / op2;
                break;
        }
        
        
        return resultado;
    }
    
    
}
