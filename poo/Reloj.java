/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class Reloj {

    // variables de la hora dada
    private int horaDada;
    private int minutoDado;
    private int segundoDado;
    //variables de la hora recibida
    private int hora;
    private int minuto;
    private int segundo;

    public Reloj() {
        horaDada = minutoDado = segundoDado = 0;
        hora = minuto = segundo = 0;
    }

    
    
    public void pedirDatos() {
        // datos una sola vez
        do {
            // Pedir datos
            Scanner sc = new Scanner(System.in);
            System.out.print("Pon la hora: ");
            horaDada = sc.nextInt();
            System.out.print("Pon el minuto: ");
            minutoDado = sc.nextInt();
            System.out.print("Pon el segundo: ");
            segundoDado = sc.nextInt();
            //if para enviar mensaje de eror en caso de que supere 23 horas
            if (horaDada > 23 || horaDada < 0) {
                System.out.println("Error. La hora debe ser mayor o igual de 0 y menor de 23. ");
            }
            if (minutoDado > 59 || minutoDado < 0) {
                System.out.println("Error. El minuto debe ser mayor o igual de 0 y menor de 59. ");
            }
            if (segundoDado > 59 || segundoDado < 0) {
                System.out.println("Error. El segundo debe ser mayor o igual de 0 y menor de 59. ");
            }
        } while ((horaDada > 23 || horaDada < 0) || (minutoDado > 59 || minutoDado < 0)
                || (segundoDado > 59 || segundoDado < 0));
    }
    
    public void muestraHoraCompleta() {
        	//imprimir hora dada con ceros si corresponde
        //para caso ejemplo 23:13:04
        if (segundoDado < 10 && minutoDado > 9 && horaDada > 9) {
            //imprimir
            System.out.println("La hora dada es: " + horaDada + ":"
                    + minutoDado + ":" + "0" + segundoDado);
            //para caso ejemplo 23:03:04
        } else if (segundoDado < 10 && minutoDado < 10 && horaDada > 9) {
            //imprimir
            System.out.println("La hora dada es: " + horaDada + ":"
                    + "0" + minutoDado + ":" + "0" + segundoDado);
            //para caso ejemplo 03:04:08
        } else if (segundoDado < 10 && minutoDado < 10 && horaDada < 10) {
            //imprimir
            System.out.println("La hora dada es: " + "0" + horaDada + ":"
                    + "0" + minutoDado + ":" + "0" + segundoDado);
            //para caso ejemplo 03:12:03//////////////
        } else if (segundoDado < 10 && minutoDado > 9 && horaDada < 10) {
            //imprimir
            System.out.println("La hora dada es: " + "0" + horaDada + ":"
                    + minutoDado + ":" + "0" + segundoDado);
            //para caso ejemplo 03:04:14
        } else if (segundoDado > 9 && minutoDado < 10 && horaDada < 10) {
            //imprimir
            System.out.println("La hora dada es: " + "0" + horaDada + ":"
                    + "0" + minutoDado + ":" + segundoDado);
            //para caso ejemplo 03:23:12
        } else if (segundoDado > 9 && minutoDado > 9 && horaDada < 10) {
            //imprimir
            System.out.println("La hora dada es: " + "0" + horaDada + ":"
                    + minutoDado + ":" + segundoDado);
            //para caso ejemplo 13:03:12	
        } else if (segundoDado > 9 && minutoDado < 10 && horaDada > 9) {
            //imprimir
            System.out.println("La hora dada es: " + horaDada + ":"
                    + "0" + minutoDado + ":" + segundoDado);
        }//fin if 

    }
    
    public void mostrarResultados() {
        
		//Realizar calculos con if
        //para caso de 23:59:59
        if (segundoDado == 59 && minutoDado == 59 && horaDada == 23) {
            segundo = 0;
            minuto = 0;
            hora = 0;
            //imprimir
            System.out.println("La hora en el segundo siguiente es: " + hora + "0" + ":"
                    + minuto + "0" + ":" + segundo + "0");
            //para caso ejemplo 22:59:59 o 07:59:59
        } else if (segundoDado == 59 && minutoDado == 59 && horaDada < 23) {
			//if anidado para ceros 
            //para caso ejemplos 22:59:59
            if (segundoDado == 59 && minutoDado == 59 && horaDada < 23 && horaDada > 9) {
                segundo = 0;
                minuto = 0;
                hora = horaDada + 1;
                //imprimir
                System.out.println("La hora en el segundo siguiente es: " + hora + ":"
                        + "0" + minuto + ":" + "0" + segundo);
                //para caso ejemplos 07:59:59
            } else if (segundoDado == 59 && minutoDado == 59 && horaDada < 10) {
                segundo = 0;
                minuto = 0;
                hora = horaDada + 1;
                //imprimir
                System.out.println("La hora en el segundo siguiente es: " + "0" + hora + ":"
                        + "0" + minuto + ":" + "0" + segundo);
            }//fin if anidado
            //para caso ejemplo 21:58:59 o 05:56:59
        } else if (segundoDado == 59 && minutoDado < 59 && horaDada < 24) {
				//if anidado 
            //para caso ejemplo 21:58:59
            if (segundoDado == 59 && minutoDado < 59 && horaDada < 24 && horaDada > 9) {
                segundo = 0;
                minuto = minutoDado + 1;
                hora = horaDada;
                //imprimir
                System.out.println("La hora en el segundo siguiente es: " + hora + ":"
                        + minuto + ":" + segundo + "0");
            } //para caso ejemplo 07:56:59
            else if (segundoDado == 59 && minutoDado < 59 && horaDada < 10) {
                segundo = 0;
                minuto = minutoDado + 1;
                hora = horaDada;
                //imprimir
                System.out.println("La hora en el segundo siguiente es: " + "0" + hora + ":"
                        + minuto + ":" + segundo + "0");
            }//fin if anidado
            //para caso ejemplo 15:13:16
        } else if (segundoDado < 59 && minutoDado < 59 && horaDada < 24) {
            segundo = segundoDado + 1;
            minuto = minutoDado;
            hora = horaDada;
				//if anidado para calcular los ceros
            //para caso ejemplo 23:12:03
            if (segundo < 10 && minuto > 9 && hora > 9) {
                //imprimir
                System.out.println("La hora en el segundo siguiente es: " + hora + ":"
                        + minuto + ":" + "0" + segundo);
                //para caso ejemplo 23:03:04
            } else if (segundo < 10 && minuto < 10 && hora > 9) {
                //imprimir
                System.out.println("La hora en el segundo siguiente es: " + hora + ":"
                        + "0" + minuto + ":" + "0" + segundo);
                //para caso ejemplo 03:04:08
            } else if (segundo < 10 && minuto < 10 && hora < 10) {
                //imprimir
                System.out.println("La hora en el segundo siguiente es: " + "0" + hora + ":"
                        + "0" + minuto + ":" + "0" + segundo);
                //para caso ejemplo 03:12:03
            } else if (segundo < 10 && minuto > 9 && hora < 10) {
                //imprimir
                System.out.println("La hora en el segundo siguiente es: " + "0" + hora + ":"
                        + minuto + ":" + "0" + segundo);
                //para caso ejemplo 03:04:14
            } else if (segundo > 9 && minuto < 10 && hora < 10) {
                //imprimir
                System.out.println("La hora en el segundo siguiente es: " + "0" + hora + ":"
                        + "0" + minuto + ":" + segundo);
                //para caso ejemplo 03:23:12
            } else if (segundo > 9 && minuto > 9 && hora < 10) {
                //imprimir
                System.out.println("La hora en el segundo siguiente es: " + "0" + hora + ":"
                        + minuto + ":" + segundo);
                //para caso ejemplo 13:03:12	
            } else if (segundo > 9 && minuto < 10 && hora > 9) {
                //imprimir
                System.out.println("La hora en el segundo siguiente es: " + hora + ":"
                        + "0" + minuto + ":" + segundo);
            }//fin if anidado
        }//fin if
    }

}
