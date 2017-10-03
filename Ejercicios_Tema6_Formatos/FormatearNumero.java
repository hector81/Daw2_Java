/*
Usar format 
82755637
827.556,37
 */
package Ejercicios_Tema6_Formatos;


/**
 *
 * @author VESPERTINO
 */
import java.text.NumberFormat;
import java.util.Locale;
public class FormatearNumero {

    public static void main(String[] args) {
        double importe = -1234.56;
        NumberFormat formatoImporte = NumberFormat.getCurrencyInstance();
        //Si se desea forzar el formato español:
        //formatoImporte = NumberFormat.getCurrencyInstance(new Locale("es","ES"));
        System.out.println(formatoImporte.format(importe));
        //Muestra -1.234,56 €

        double porcentaje = 1.6345;
        NumberFormat formatoPorcentaje = NumberFormat.getPercentInstance();
        System.out.println(formatoPorcentaje.format(porcentaje));
        //Muestra 163%
        formatoPorcentaje.setMinimumFractionDigits(2);
        System.out.println(formatoPorcentaje.format(porcentaje));
        //Muestra 163,45%

        double numero = 4874647.0/3;
        NumberFormat formatoNumero = NumberFormat.getNumberInstance();
        System.out.println(formatoNumero.format(numero));
        //Muestra 1.624.882,333
        formatoNumero.setMaximumFractionDigits(1);
        System.out.println(formatoNumero.format(numero));
        //Muestra 1.624.882,3
        
    }
}
