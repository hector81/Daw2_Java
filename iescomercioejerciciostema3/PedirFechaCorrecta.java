/*
Pedir el día, mes y año de una fecha e indicar si esta es
correcta (no tendremos en cuenta meses bisiestos)
 */
package iescomercioejerciciostema3;

import java.util.Scanner;

public class PedirFechaCorrecta {
    //main
    public static void main(String[] args) {  
        // Declaracion de variables
        int dia;
        int mes;
        int anyo;
        Scanner sc = new Scanner(System.in);
       //Pedir datos
        System.out.print("Pon el dia: ");
        dia = sc.nextInt();
        System.out.print("Pon el mes: ");
        mes = sc.nextInt();
        System.out.print("Pon el año: ");
        anyo = sc.nextInt();
                
        //calculamos 
        if (dia > 31){
            System.out.println("El día es incorrecto");
        } else if(mes > 13){
            System.out.println("El mes es incorrecto");
        } else if(anyo > 2015){
            System.out.println("El año es incorrecto");
        } else{
            System.out.println("La fecha es: " + dia + "-" + mes + "-" + anyo);
        }
        
    }//fin del main
}//fin de la clase
