/*
 Entrada  
 El programa recibirá, por la entrada estandard, múltiples casos de prueba. Cada uno consiste en dos números,
 el primero indicando el número de días durante los cuales se ha emitido el GTS, y el segundo el número de
 emisoras que lo han hecho.  
 El último caso de prueba, que no deberá procesarse, tendrá 0 en ambos valores.  
 Salida  
 Para cada caso de prueba el programa escribirá, en una línea independiente, el tiempo dedicado por las
 emisoras a radiar el GTS. El formato será D:HH:MM:SS, donde D indica número de días, HH número de horas,
 MM número de minutos  y SS número de segundos totales.   
 Como es lógico, HH no deber a ser mayor que 23 y MM y SS no podrán ser mayores de 59. Además deberán
 escribirse siempre con dos dígitos. Para el número de días (D), que no será nunca mayor de 1.000, 
 no se deben escribir dígitos adicionales.
 */
package EjerciciosRepaso_Estructurada;

import java.util.Scanner;

/**
 *
 * @author Hector Garcia
 */
public class Pipipipipi {
        //variables
        private int numeroEmisoras; //número de emisoras
        private int numeroDias; //numero de días
        private int resultadoSegundos;//total segundos
        private int horas;
        private int minutos;
        private int segundos;
        private int dias;
        
        //DAR DATOS
        public void darDatos(){
            Scanner sc = new Scanner(System.in);
            //do while para errores
            do {
                System.out.println("Introduce el numero de días: ");
                numeroDias = sc.nextInt();
                if (numeroDias < 0) {
                    System.out.println("El numero de días no puede ser negativo ni cero , ni mayor de 1000. ");
                }
            } while (numeroDias < 0);
            do {
                System.out.println("Introduce el número de emisoras: ");
                numeroEmisoras = sc.nextInt();
                if (numeroEmisoras < 0) {
                    System.out.println("El número de emisoras no puede ser negativo ni cero. ");
                }
            } while (numeroEmisoras < 0);
            //do while para errores M
        }
        
        //metodo resultado en segundos
        public void resultadoSegundos(){
        //se multiplica el numero de emisoras por los dias y luego por 24 horas y por 6 segundos
        resultadoSegundos = numeroDias * numeroEmisoras * 24 * 6;
        System.out.println("El resultado son " + resultadoSegundos + " segundos en total");
        }
        
        public String ponerCeroHora(int horas){
        if (horas < 10) {
            return "0" + horas;
        }
        else {
            return "" + horas;
        }
    }//fin metodo
    
    public String ponerCeroMinuto(int minutos){        
        if (minutos < 10) {
            return "0" + minutos;
        }
        else {
            return "" + minutos;
        }
    }//fin metodo
    
    private String ponerCeroSegundo(int segundos){
        if (segundos < 10) {
            return "0" + segundos;
        }
        else {
            return "" + segundos;
        }
    }//fin metodo
    
    private int ponerDiasMasMil(int dias){
        if (dias >= 0 && dias < 1001) {
            return dias;
        }
        else if(dias > 1000){
            return 1000;
        }
        return 0;
    }//fin metodo
    
    public void realizarCalculos(){
        //Un días tiene 86400 segundos
        //Un dia tiene 24 horas
        //Un dia tiene 1440 minutos
        //Una hora tiene 3600 segundos
        //Una hora tiene 60 minutos
        //Un minuto tiene 60 segundos
        dias = resultadoSegundos / 86400;
        horas = (resultadoSegundos % 86400) / 3600;
        minutos = (((resultadoSegundos % 86400) % 3600) / 60);
        segundos = (((resultadoSegundos % 86400) % 3600) % 60);
        ///////////////////////
        System.out.println(ponerDiasMasMil(dias) + ":" + ponerCeroHora(horas) + ":" 
                + ponerCeroMinuto(minutos) + ":" + ponerCeroSegundo(segundos));

    }//fin metodo
}//fin clase
