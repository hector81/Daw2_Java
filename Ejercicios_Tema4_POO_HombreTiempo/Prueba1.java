package Ejercicios_Tema4_POO_HombreTiempo;

import java.util.Scanner;

/**
 *
 * @author Hector Garcia
 */
public class Prueba1 {
 public static void main(String[] args) {
        //atributos
        int dia = 0;
        int mes = 0;
        int year = 0;
        int temperatura;      
        int numeroEntradas;
        int contador =1 ;
        boolean cero= true;
        //VARIABLES PARA Acumular las temperaturas por mes
        int temperaturaMedia = 0;
    
        //estas variables para calcular las repeticiones del mes
        int temperaturaMes = 0;
        
        //Como  entrada  se  reciben  una  serie  de  fechas  (día/mes/año), 
        //acompañadas  de  una cifra que  indica  la  temperatura  media  de  ese día.   
        Scanner sc = new Scanner(System.in);
        
        do {
            //pedir datos  
            System.out.print("Pon numero fechas ");
            numeroEntradas = sc.nextInt();
            //limitamos 
            if (numeroEntradas < 1) {
                System.out.println("Numero no valido");
            }//fin if
        } while (numeroEntradas < 1);
        
       while(contador<=numeroEntradas ){                   
               System.out.println("ENTRADA");
               System.out.println("Fecha " + contador + ": " + (dia = sc.nextInt()) + "/" +
                       (mes = sc.nextInt()) + "/" + (year = sc.nextInt()));
               System.out.println("Temperatura de ese día " + (temperatura = sc.nextInt()));

               //usamos acumuladores para calcular el numero de veces que sale el mes
               if(mes == 1){
                   temperaturaMes++; 
                   temperaturaMedia += temperatura;
                   System.out.println("ENERO: " + (temperaturaMedia/temperaturaMes));
               }
               if(mes == 2){
                   temperaturaMes++; 
                   temperaturaMedia += temperatura;
                   System.out.println("FEBRERO: " + (temperaturaMedia/temperaturaMes));
               }
               if(mes == 3){
                   temperaturaMes++; 
                   temperaturaMedia += temperatura;
                   System.out.println("MARZO: " + (temperaturaMedia/temperaturaMes));
               }
               if(mes == 4){
                   temperaturaMes++; 
                   temperaturaMedia += temperatura;
                   System.out.println("ABRIL: " + (temperaturaMedia/temperaturaMes));
               }
               if(mes == 5){
                   temperaturaMes++; 
                   temperaturaMedia += temperatura;
                   System.out.println("MAYO: " + (temperaturaMedia/temperaturaMes));
               }
               if(mes == 6){
                   temperaturaMes++; 
                   temperaturaMedia += temperatura;
                   System.out.println("JUNIO: " + (temperaturaMedia/temperaturaMes));
               }
               if(mes == 7){
                   temperaturaMes++; 
                   temperaturaMedia += temperatura;
                   System.out.println("JULIO: " + (temperaturaMedia/temperaturaMes));
               }
               if(mes == 8){
                   temperaturaMes++; 
                   temperaturaMedia += temperatura;
                   System.out.println("AGOSTO: " + (temperaturaMedia/temperaturaMes));
               }
               if(mes == 9){
                   temperaturaMes++; 
                   temperaturaMedia += temperatura;
                   System.out.println("SEPTIEMBRE: " + (temperaturaMedia/temperaturaMes));
               }
               if(mes == 10){
                   temperaturaMes++; 
                   temperaturaMedia += temperatura;
                   System.out.println("OCTUBRE: " + (temperaturaMedia/temperaturaMes));
               }
               if(mes == 11){
                   temperaturaMes++; 
                   temperaturaMedia += temperatura;
                   System.out.println("NOVIEMBRE: " + (temperaturaMedia/temperaturaMes));
               }
               if(mes == 12){
                   temperaturaMes++; 
                   temperaturaMedia += temperatura;
                   System.out.println("DICIEMBRE: " + (temperaturaMedia/temperaturaMes));
               }
             
            //contador
            contador++;
       }//fin while
        
    }//fin main
}//fina clase
