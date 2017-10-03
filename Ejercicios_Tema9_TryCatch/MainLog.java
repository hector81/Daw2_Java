package Ejercicios_Tema9_TryCatch;
/**
 *
 * @author Hector Garcia
 */
import java.util.GregorianCalendar;

public class MainLog {
    public static void main(String[] args) {
        Log log = new Log("mensaje1");
        
        log.añadir("mensaje2");
        // Perdida de tiempo
        for (int i = 0; i < 1000; i++) {
            System.out.println(" ");
        }
        log.añadir("ksdhfkjdshkjhf");
        // Perdida de tiempo
        for (int i = 0; i < 1000; i++) {
            System.out.println(" ");
        }
        log.añadir("aaaaaaaaaaaaaa");
        System.out.println(log.devolverMensajesDiaConcreto("17/2/2016"));
//        
//        GregorianCalendar aux1 = new GregorianCalendar();
//        for (int i = 0; i < 10000; i++) {
//            System.out.println("*");
//        }
//         System.out.println("");
//        GregorianCalendar aux2 = new GregorianCalendar();
//        System.out.println(aux1.equals(aux2));
//        
        
      
    }
}
