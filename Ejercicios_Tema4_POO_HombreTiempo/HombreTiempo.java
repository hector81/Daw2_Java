/*
El  hombre  del  tiempo  
El  hombre  del  tiempo  te  ha  contratado  para  que  le  diseñes  una aplicación  que  le ayude  a  exponer   sus  cálculos  metereológicos  a sus  espectadores.  Él  recibe  de  la Agencia  Española  de Meteorología  la  temperatura  media  de  una  serie  de  fechas que  se han  tomado  como  muestras,  y  la  idea  es,  a  partir  de  esos  datos, extraer las  medias  para  los  meses del  año.  
El  mayor  inconveniente  a  la  hora  de  recoger  los  datos  es  que  estos  vienen totalmente  desordenados,  y  es  el  hombre  del  tiempo quién  tiene que  ordenarlos para  luego  calcular  la  media  por  mes.   
Es  por  ello  que  te  ha contratado,  para  que  le  diseñes  un programa  que  le  haga esa  tarea  de  forma  automática.  
Entrada Como  entrada  se  reciben  una  serie  de  fechas  (día/mes/año), acompañadas  de  una cifra que  indica  la  temperatura  media  de  ese día.  
Salida Como  salida  se  debe  generar  la  temperatura  media  para  cada mes  (nombre  del mes)  del  año  junto  con  su  temperatura  media.  Si  en  ese  mes  no  se  registraron datos,  sólo  se  mostrará  el  mes.    
Hay  que  tener  en  cuenta  que  sólo  se  admiten  valores  enteros, realizándose  el redondeo  siempre  a  la  baja.  
Entrada  de  ejemplo  
1/12/2014 4 1/2/2014  5 2/2/2014  -1 3/5/2014  18 1/9/2013 14 1/6/2014 25 2/6/2013 24  
Salida  de  ejemplo  
Enero Febrero 2 Marzo Abril Mayo 18 Junio 24 Julio Agosto Septiembre 14 Octubre Noviembre Diciembre 4
 */
package Ejercicios_Tema4_POO_HombreTiempo;



/**
 *
 * @author Hector Garcia
 */
import java.util.Scanner;
public class HombreTiempo {
// main

    public static void main(String[] args) {
        //atributos
        int dia = 0;
        int mes=0 ;
        int year = 0;
        int temperatura = 0;
        int numeroEntradas;
        int contador ;
        //VARIABLES PARA Acumular las temperaturas por mes
        int temperaturaMedia1 = 0 ;
        int temperaturaMedia2 = 0 ;
        int temperaturaMedia3 = 0 ;
        int temperaturaMedia4 = 0 ;
        int temperaturaMedia5 = 0 ;
        int temperaturaMedia6 = 0 ;
        int temperaturaMedia7 = 0 ;
        int temperaturaMedia8 = 0 ;
        int temperaturaMedia9 = 0 ;
        int temperaturaMedia10 = 0 ;
        int temperaturaMedia11 = 0 ;
        int temperaturaMedia12 = 0 ;
        //estas variables para calcular las repeticiones del mes
        int temperaturaMes1 = 0 ;
        int temperaturaMes2 = 0 ;
        int temperaturaMes3 = 0 ;
        int temperaturaMes4 = 0 ;
        int temperaturaMes5 = 0 ;
        int temperaturaMes6= 0 ;
        int temperaturaMes7 = 0 ;
        int temperaturaMes8= 0  ;
        int temperaturaMes9 = 0 ;
        int temperaturaMes10= 0  ;
        int temperaturaMes11 = 0 ;
        int temperaturaMes12 = 0 ;
        //pedir datos
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Pon el numero de fechas : ");
            
            numeroEntradas = sc.nextInt();
            
            if (numeroEntradas < 1) {
                System.out.print("El numero de fechas es incorrecto. Pon otro: ");
            } // fin if
        } while (numeroEntradas < 1);//fin do while
        
        //ENTRADA
        System.out.println("ENTRADA");
        if (numeroEntradas > 0) {
                for (contador = 1; contador <= numeroEntradas; contador++) {                
                    System.out.println("Fecha " + contador + ": " + (dia = sc.nextInt()) + "/"
                            + (mes = sc.nextInt()) + "/" + (year = sc.nextInt()));
                    System.out.println("Temperatura de ese día " + (temperatura = sc.nextInt()));
                    //para leer y acumular
                    //usamos acumuladores para calcular el numero de veces que sale el mes
                        if (mes == 1) {
                            temperaturaMes1++;
                            temperaturaMedia1 += temperatura;
                        }
                        if (mes == 2) {
                            temperaturaMes2++;
                            temperaturaMedia2 += temperatura;
                        }
                        if (mes == 3) {
                            temperaturaMes3++;
                            temperaturaMedia3 += temperatura;
                        }
                        if (mes == 4) {
                            temperaturaMes4++;
                            temperaturaMedia4 += temperatura;
                        }
                        if (mes == 5) {
                            temperaturaMes5++;
                            temperaturaMedia5 += temperatura;
                        }
                        if (mes == 6) {
                            temperaturaMes6++;
                            temperaturaMedia6 += temperatura;
                        }
                        if (mes == 7) {
                            temperaturaMes7++;
                            temperaturaMedia7 += temperatura;
                        }
                        if (mes == 8) {
                            temperaturaMes8++;
                            temperaturaMedia8 += temperatura;
                        }
                        if (mes == 9) {
                            temperaturaMes9++;
                            temperaturaMedia9 += temperatura;
                        }
                        if (mes == 10) {
                            temperaturaMes10++;
                            temperaturaMedia10 += temperatura;
                        }
                        if (mes == 11) {
                            temperaturaMes11++;
                            temperaturaMedia11 += temperatura;
                        }
                        if (mes == 12) {
                            temperaturaMes12++;
                            temperaturaMedia12 += temperatura;
                        }
                }//FIN FOR                                         
            }//fin if
        
        //SALIDA
        System.out.println("SALIDA ");
        for (int i = 1; i < 13; i++) {
            //usamos acumuladores para calcular el numero de veces que sale el mes
            switch (i) {
                case 1:                   
                     
                        if( temperaturaMes1>0){System.out.println("ENERO: " + Math.floor(temperaturaMedia1 / temperaturaMes1));}
                        else {System.out.println("ENERO: ");}
                        break;
                case 2: 
                 
                        if(temperaturaMes2 > 0){System.out.println("FEBRERO: " + Math.floor(temperaturaMedia2 / 
                                temperaturaMes2));}
                        else {System.out.println("FEBRERO: ");}
                        break;
                case 3:        
                        if(temperaturaMes3 > 0){System.out.println("MARZO: " + Math.floor(temperaturaMedia3 
                                / temperaturaMes3));}
                        else{System.out.println("MARZO: ");}
                        break;
                case 4:             
                        if(temperaturaMes4 > 0 ){System.out.println("ABRIL: " + Math.floor(temperaturaMedia4 / temperaturaMes4));}
                        else {System.out.println("ABRIL: ");}
                        break;
                case 5:        

                        if(temperaturaMes5 > 0 ){System.out.println("MAYO: " + Math.floor(temperaturaMedia5 / temperaturaMes5));}
                        else {System.out.println("MAYO: ");}
                        break;
                case 6:            
                        if(temperaturaMes6 > 0 ){System.out.println("JUNIO: " + Math.floor(temperaturaMedia6 / temperaturaMes6));}
                        else {System.out.println("JUNIO: ");}
                        break;
                case 7:        
       
                        if(temperaturaMes7 > 0 ){System.out.println("JULIO: " + Math.floor(temperaturaMedia7 / temperaturaMes7));}
                        else{System.out.println("JULIO: ");}
                        break;
                case 8:        

                        if(temperaturaMes8 > 0 ){System.out.println("AGOSTO: " + Math.floor(temperaturaMedia8
                                / temperaturaMes8));}
                        else{System.out.println("AGOSTO: ");}
                        break;
                case 9:       
                 
                        if(temperaturaMes9 > 0 ){System.out.println("SEPTIEMBRE: " + Math.floor(temperaturaMedia9
                                / temperaturaMes9));}
                        else{System.out.println("SEPTIEMBRE: ");}
                        break;
                case 10:        
 
                        if(temperaturaMes10 > 0 ){System.out.println("OCTUBRE: " + Math.floor(temperaturaMedia10
                                / temperaturaMes10));}
                        else{System.out.println("OCTUBRE: ");}
                        break;
                case 11:        
            
                        if(temperaturaMes11 > 0 ){System.out.println("NOVIEMBRE: " + Math.floor(temperaturaMedia11
                                / temperaturaMes11));}
                        else{System.out.println("NOVIEMBRE: ");}
                        break;
                case 12:        
        
                        if(temperaturaMes12 > 0 ){System.out.println("DICIEMBRE: " + Math.floor(temperaturaMedia12
                                / temperaturaMes12));}
                        else {System.out.println("DICIEMBRE: ");}
                        break;
            }//fin siwtch
        }//fin for
    }// fin del main
}// fin de la clase