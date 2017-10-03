/*
 
 */
package iescomercioejerciciostema3;

import java.util.Scanner;

public class SwitchNotas {
    //main
    public static void main(String[] args) {
        //declarar variables
        byte nota;
        Scanner sc = new Scanner(System.in);
        //pedir datos
        System.out.print("Dime la nota que has sacado: ");
        nota = sc.nextByte();
        //calculamos nota
        if(nota < 0 || nota > 10 ){
            System.out.println("LA NOTA NO ES CORRECTA");
        } else {
        
            switch(nota){
                case 0:
                        System.out.println("MUY DEFICIENTE ");
                        break;
                case 1:
                        System.out.println("MUY DEFICIENTE ");
                        break;
                case 2:
                        System.out.println("DEFICIENTE ");
                        break;
                case 3:
                        System.out.println("DEFICIENTE ");
                        break;
                case 4:
                        System.out.println("DEFICIENTE ");
                        break;
                case 5:
                        System.out.println("SUFICIENTE ");
                        break;
                case 6:
                        System.out.println("BIEN ");
                        break;
                case 7:
                        System.out.println("NOTABLE");
                        break;
                case 8:
                        System.out.println("NOTABLE");
                        break;
                case 9:
                        System.out.println("SOBRESALIENTE");
                        break;
                default:                           
                        System.out.println("SOBRESALIENTE");
                        break;             
                }//fin del switch
            }//fin del else
    }//fin del main
}//fin de la clase
