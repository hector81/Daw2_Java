/*
 EJERCICIO: Realizar un método llamado lanzar que reciba un entero. Si el entero
es mayor que 5, mostraremos la tabla de multiplicar de ese número. Si es 1 o 3
provocaremos una excepcion mostrando el mensaje "NO QUIERO IMPARES PEQUEÑOS".
Si es 2 o 4 mostraremos "PARES TAMPOCO". Y si es 0 lanzaremos una excepción tipo
SQL-EXCEPTION.
 */
package Ejercicios_Tema9_TryCatch;
/**
 *
 * @author Hector Garcia
 */
import java.sql.SQLException;

public class Multiplicacion {
    //metodo lanzar
    public void lanzar(int numero) {
        try {
            if (numero > 5) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i + " x " + numero + " = " + (i * numero));
                }
            } else if (numero == 1 || numero == 3) {
                throw new PruebaException("NO QUIERO IMPARES PEQUEÑOS");//lanza objeto
            } else if (numero == 2 || numero == 4) {
                throw new PruebaException("NO QUIERO PARES PEQUEÑOS");//lanza objeto
            } else if (numero == 0) {
                throw new SQLException("ERROR SQL");
            }
            //capturamos excepciones
        } catch (SQLException ex) {//primero la mas especifica
            System.out.println("ERROR SQL");
        } catch (Exception ex) {//luego mas generica
            System.out.println(ex.getMessage());//nos da la información técnica
        }
    }//fin metodo
}//fin clase
