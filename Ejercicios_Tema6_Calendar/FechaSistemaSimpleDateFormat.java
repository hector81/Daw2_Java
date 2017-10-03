/*
//REALIZAR FECHA SISTEMA CON DISTINTOD FORMATOS CON SIMPLE DATE FORMAT
 */
package Ejercicios_Tema6_Calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author hetor garcia
 */
public class FechaSistemaSimpleDateFormat {
    public static void main(String[] args) {
        //creamos objeto de simple date format
        SimpleDateFormat sdf = new SimpleDateFormat();
        //CREAMOS OBJETO CALENDAR
        Calendar calendar1 = new GregorianCalendar();	
	System.out.println("FECHA 1: Logroño A " + sdf.format(calendar1.getTime()));
        
        //otra forma
        Calendar calendar2 = new GregorianCalendar();
        int year       = calendar2.get(GregorianCalendar.YEAR);
	int month      = calendar2.get(Calendar.MONTH);
        int dayOfMonth = calendar2.get(Calendar.DAY_OF_MONTH); 
	int dayOfWeek  = calendar2.get(Calendar.DAY_OF_WEEK);      
        System.out.println("FECHA 2: Logroño, " + dayOfWeek + " , " + dayOfMonth + " de " + month +  " de " + year );
        
        //Otra forma
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("'FECHA 3, LOGROÑO A 'EEEE' DE ' dd' de 'MMMM' de ' yyyy");
        System.out.println(dateFormat1.format(new Date()));
        
        //Otra forma con horas y segundos
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("'FECHA 4, LOGROÑO ,SON LAS  ' hh ' horas ' mm ' minutos ' ss ' segundos'");
        System.out.println(dateFormat2.format(new Date()));
	
        Calendar calendar5 = new GregorianCalendar();
         calendar5.set(2000, Calendar.AUGUST, 31);
         int year1       = calendar5.get(GregorianCalendar.YEAR);
	int month1      = calendar5.get(Calendar.MONTH);
        int dayOfMonth1 = calendar5.get(Calendar.DAY_OF_MONTH); 
	int dayOfWeek1  = calendar5.get(Calendar.DAY_OF_WEEK); 
        System.out.println("FECHA 5: Logroño, " + dayOfWeek1 + " , " + dayOfMonth1 + " de " + month1 +  " de " + year1 );
        
        
    }
}
