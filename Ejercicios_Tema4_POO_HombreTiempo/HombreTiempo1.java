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
package ejercicios_tema4_poo_hombretiempo;



/**
 *
 * @author Hector Garcia
 */
import java.util.Scanner;
public class HombreTiempo1 {

    public static void main(String[] args) {
        //atributos
        int dia = 0;
        int mes = 0;
        int anio = 0;
        int temperatura;
        int numeroEntradas;
        int contador = 1;
        //VARIABLES PARA Acumular las temperaturas por mes
        int sumaTemperaturasMes1 = 0;
        int sumaTemperaturasMes2 = 0;
        int sumaTemperaturasMes3 = 0;
        int sumaTemperaturasMes4 = 0;
        int sumaTemperaturasMes5 = 0;
        int sumaTemperaturasMes6 = 0;
        int sumaTemperaturasMes7 = 0;
        int sumaTemperaturasMes8 = 0;
        int sumaTemperaturasMes9 = 0;
        int sumaTemperaturasMes10 = 0;
        int sumaTemperaturasMes11 = 0;
        int sumaTemperaturasMes12 = 0;
        //estas variables para calcular las repeticiones del mes
        int numeroTemperaturasMes1 = 0;
        int numeroTemperaturasMes2 = 0;
        int numeroTemperaturasMes3 = 0;
        int numeroTemperaturasMes4 = 0;
        int numeroTemperaturasMes5 = 0;
        int numeroTemperaturasMes6 = 0;
        int numeroTemperaturasMes7 = 0;
        int numeroTemperaturasMes8 = 0;
        int numeroTemperaturasMes9 = 0;
        int numeroTemperaturasMes10 = 0;
        int numeroTemperaturasMes11 = 0;
        int numeroTemperaturasMes12 = 0;

        //Como  entrada  se  reciben  una  serie  de  fechas  (día/mes/año), 
        //acompañadas  de  una cifra que  indica  la  temperatura  media  de  ese día.   
        Scanner sc = new Scanner(System.in);

        do {
            //pedir datos  
            System.out.print("Pon numero fechas: ");
            numeroEntradas = sc.nextInt();
            //limitamos 
            if (numeroEntradas < 1) {
                System.out.println("Numero no valido");
            }//fin if
        } while (numeroEntradas < 1);

        while (contador <= numeroEntradas) {
            System.out.println("ENTRADA");
            System.out.println("Fecha " + contador + ": ");
            System.out.print("Día: ");
            dia = sc.nextInt();
            System.out.print("Mes: ");
            mes = sc.nextInt();
            System.out.print("Año: ");
            anio = sc.nextInt();
            System.out.print("Temperatura de ese día: ");
            temperatura = sc.nextInt();

            //usamos acumuladores para calcular el numero de veces que sale el mes
            switch (mes) {
                case 1:
                    numeroTemperaturasMes1++;
                    sumaTemperaturasMes1 += temperatura;
                    break;
                case 2:
                    numeroTemperaturasMes2++;
                    sumaTemperaturasMes2 += temperatura;
                    break;
                case 3:
                    numeroTemperaturasMes3++;
                    sumaTemperaturasMes3 += temperatura;
                    break;
                case 4:
                    numeroTemperaturasMes4++;
                    sumaTemperaturasMes4 += temperatura;
                    break;
                case 5:
                    numeroTemperaturasMes5++;
                    sumaTemperaturasMes5 += temperatura;
                    break;
                case 6:
                    numeroTemperaturasMes6++;
                    sumaTemperaturasMes6 += temperatura;
                    break;
                case 7:
                    numeroTemperaturasMes7++;
                    sumaTemperaturasMes7 += temperatura;
                    break;
                case 8:
                    numeroTemperaturasMes8++;
                    sumaTemperaturasMes8 += temperatura;
                    break;
                case 9:
                    numeroTemperaturasMes9++;
                    sumaTemperaturasMes9 += temperatura;
                    break;
                case 10:
                    numeroTemperaturasMes10++;
                    sumaTemperaturasMes10 += temperatura;
                    break;
                case 11:
                    numeroTemperaturasMes11++;
                    sumaTemperaturasMes11 += temperatura;
                    break;
                default:
                    numeroTemperaturasMes12++;
                    sumaTemperaturasMes12 += temperatura;
                    break;
            }// fin del switch

            //contador
            contador++;
        }//fin while

        System.out.println("SALIDA");
        for (mes = 1; mes < 13; mes++) {
            switch (mes) {
                case 1:
                    if (numeroTemperaturasMes1 > 0) { // Ha habido toma de temperatura
                        System.out.print("ENERO " + (sumaTemperaturasMes1 / numeroTemperaturasMes1) + " ");
                    } else {
                        System.out.print("ENERO ");
                    }
                    break;
                case 2:
                    if (numeroTemperaturasMes2 > 0) { // Ha habido toma de temperatura
                        System.out.print("FEBRERO " + (sumaTemperaturasMes2 / numeroTemperaturasMes2) + " ");
                    } else {
                        System.out.print("FEBRERO ");
                    }
                    break;
                case 3:
                    if (numeroTemperaturasMes3 > 0) { // Ha habido toma de temperatura
                        System.out.print("MARZO " + (sumaTemperaturasMes3 / numeroTemperaturasMes3) + " ");
                    } else {
                        System.out.print("MARZO ");
                    }
                    break;
                case 4:
                    if (numeroTemperaturasMes4 > 0) { // Ha habido toma de temperatura
                        System.out.print("ABRIL " + (sumaTemperaturasMes4 / numeroTemperaturasMes4) + " ");
                    } else {
                        System.out.print("ABRIL ");
                    }
                    break;
                case 5:
                    if (numeroTemperaturasMes5 > 0) { // Ha habido toma de temperatura
                        System.out.print("MAYO " + (sumaTemperaturasMes5 / numeroTemperaturasMes5) + " ");
                    } else {
                        System.out.print("MAYO ");
                    }
                    break;
                case 6:
                    if (numeroTemperaturasMes6 > 0) { // Ha habido toma de temperatura
                        System.out.print("JUNIO " + (sumaTemperaturasMes6 / numeroTemperaturasMes6) + " ");
                    } else {
                        System.out.print("JUNIO ");
                    }
                    break;
                case 7:
                    if (numeroTemperaturasMes7 > 0) { // Ha habido toma de temperatura
                        System.out.print("JULIO " + (sumaTemperaturasMes7 / numeroTemperaturasMes7) + " ");
                    } else {
                        System.out.print("JULIO ");
                    }
                    break;
                case 8:
                    if (numeroTemperaturasMes8 > 0) { // Ha habido toma de temperatura
                        System.out.print("AGOSTO " + (sumaTemperaturasMes8 / numeroTemperaturasMes8) + " ");
                    } else {
                        System.out.print("AGOSTO ");
                    }
                    break;
                case 9:
                    if (numeroTemperaturasMes9 > 0) { // Ha habido toma de temperatura
                        System.out.print("SEPTIEMBRE " + (sumaTemperaturasMes9 / numeroTemperaturasMes9) + " ");
                    } else {
                        System.out.print("SEPTIEMBRE ");
                    }
                    break;
                case 10:
                    if (numeroTemperaturasMes10 > 0) { // Ha habido toma de temperatura
                        System.out.print("OCTUBRE " + (sumaTemperaturasMes10 / numeroTemperaturasMes10) + " ");
                    } else {
                        System.out.print("OCTUBRE ");
                    }
                    break;
                case 11:
                    if (numeroTemperaturasMes11 > 0) { // Ha habido toma de temperatura
                        System.out.print("NOVIEMBRE " + (sumaTemperaturasMes11 / numeroTemperaturasMes11) + " ");
                    } else {
                        System.out.print("NOVIEMBRE ");
                    }
                    break;
                case 12:
                    if (numeroTemperaturasMes12 > 0) { // Ha habido toma de temperatura
                        System.out.print("DICIEMBRE " + (sumaTemperaturasMes12 / numeroTemperaturasMes12) + " ");
                    } else {
                        System.out.print("DICIEMBRE ");
                    }
                    break;
            }// fin del switch
        }//fin for
    }//fin main
}//fina clase

