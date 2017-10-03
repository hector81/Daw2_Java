/*
2-Realizar un programa que pida un número entero y calcule muestre por pantalla 
ese mismo número pero con letras. Hatsa 9999
Ejemplo: -214 → memos doscientos catorce 
 */

package Ejercicios_Tema3_Switch;

import java.util.Scanner;

public class NumeroLetrasDEL0AL9999 {

    //main
    public static void main(String[] args) {
        // Declaracion de variables
        int numero;
        Scanner sc = new Scanner(System.in);

        //variables para calcular int
        int numeroMil;
        int numeroCien;
        int numeroDiez;
        int numeroUno;

        //variables para poner numeros en string
        String numeroMilX = "";
        String numeroCienX = "";
        String numeroDiezX = "";
        String numeroUnoX = "";

        //Pedir datos
        System.out.print("Pon un número: ");
        numero = sc.nextInt();

        //realizar calculos para separar numeros y al ser int solo devolvera el entero no los decimales
        numeroMil = numero / 1000;
        numeroCien = (numero - numeroMil * 1000) / 100;
        numeroDiez = (numero - numeroMil * 1000 - numeroCien * 100) / 10;
        numeroUno = numero - numeroMil * 1000 - numeroCien * 100 - numeroDiez * 10;

        //calculamos los números que hemos puesto en string
        if (numero >= 0 && numero <= 9999) {
            ////empezamos del 0 al 9
            switch (numeroUno) {
                case 0:
                    numeroUnoX = "";
                    break;
                case 1:
                    if (numero == 1) {
                        numeroUnoX = "Uno";
                    }
                    if (numero > 10 && numeroUno == 1 && numeroDiez == 1) {
                        numeroUnoX = "";
                    }
                    if (numero > 10 && numeroDiez != 1) {
                        numeroUnoX = "uno";
                    }
                    break;
                case 2:
                    if (numero == 2) {
                        numeroUnoX = "Dos";
                    }
                    if (numero > 10 && numeroUno == 2 && numeroDiez == 1) {
                        numeroUnoX = "";
                    }
                    if (numero > 10 && numeroDiez != 1) {
                        numeroUnoX = "dos";
                    }
                    break;
                case 3:
                    if (numero == 3) {
                        numeroUnoX = "Tres";
                    }
                    if (numero > 10 && numeroUno == 3 && numeroDiez == 1) {
                        numeroUnoX = "";
                    }
                    if (numero > 10 && numeroDiez != 1) {
                        numeroUnoX = "tres";
                    }
                    break;
                case 4:
                    if (numero == 4) {
                        numeroUnoX = "Cuatro";
                    }
                    if (numero > 10 && numeroUno == 4 && numeroDiez == 1) {
                        numeroUnoX = "";
                    }
                    if (numero > 10 && numeroDiez != 1) {
                        numeroUnoX = "cuatro";
                    }
                    break;
                case 5:
                    if (numero == 5) {
                        numeroUnoX = "Cinco";
                    }
                    if (numero > 10 && numeroUno == 5 && numeroDiez == 1) {
                        numeroUnoX = "";
                    }
                    if (numero > 10 && numeroDiez != 1) {
                        numeroUnoX = "cinco";
                    }
                    break;
                case 6:
                    if (numero == 6) {
                        numeroUnoX = "Seis";
                    }
                    if (numero > 10 && numeroUno == 6 && numeroDiez == 1) {
                        numeroUnoX = "";
                    }
                    if (numero > 10 && numeroDiez != 1) {
                        numeroUnoX = "seis";
                    }
                    break;
                case 7:
                    if (numero == 7) {
                        numeroUnoX = "Siete";
                    }
                    if (numero > 10 && numeroUno == 7 && numeroDiez == 1) {
                        numeroUnoX = "";
                    }
                    if (numero > 10 && numeroDiez != 1) {
                        numeroUnoX = "siete";
                    }
                    break;
                case 8:
                    if (numero == 8) {
                        numeroUnoX = "Ocho";
                    }
                    if (numero > 10 && numeroUno == 8 && numeroDiez == 1) {
                        numeroUnoX = "";
                    }
                    if (numero > 10 && numeroDiez != 1) {
                        numeroUnoX = "ocho";
                    }
                    break;
                default:
                    if (numero == 9) {
                        numeroUnoX = "Nueve";
                    }
                    if (numero > 10 && numeroUno == 9 && numeroDiez == 1) {
                        numeroUnoX = "";
                    }
                    if (numero > 10 && numeroDiez != 1) {
                        numeroUnoX = "nueve";
                    }
                    break;
            }//fin siwtch
            ////empezamos del 10 al 99     
            switch (numeroDiez) {
                case 0:
                    numeroDiezX = "";
                    break;
                case 1:
                    if (numero == 10) {
                        numeroDiezX = "Diez";
                    }
                    if (numero > 20 && numero != 11 && numero != 12
                            && numero != 13 && numero != 14 && numero != 15 && numero != 16
                            && numero != 17 && numero != 18 && numero != 19) {
                        numeroDiezX = "diez";
                    }
                    if (numero == 11) {
                        numeroDiezX = "Once";
                    }
                    if (numero > 20 && numeroDiez == 1 && numeroUno == 1) {
                        numeroDiezX = "once";
                    }
                    if (numero == 12) {
                        numeroDiezX = "Doce";
                    }
                    if (numero > 20 && numeroDiez == 1 && numeroUno == 2) {
                        numeroDiezX = "doce";
                    }
                    if (numero == 13) {
                        numeroDiezX = "Trece";
                    }
                    if (numero > 20 && numeroDiez == 1 && numeroUno == 3) {
                        numeroDiezX = "trece";
                    }
                    if (numero == 14) {
                        numeroDiezX = "Catorce";
                    }
                    if (numero > 20 && numeroDiez == 1 && numeroUno == 4) {
                        numeroDiezX = "catorce";
                    }
                    if (numero == 15) {
                        numeroDiezX = "Quince";
                    }
                    if (numero > 20 && numeroDiez == 1 && numeroUno == 5) {
                        numeroDiezX = "quince";
                    }
                    if (numero == 16) {
                        numeroDiezX = "Dieciseis";
                    }
                    if (numero > 20 && numeroDiez == 1 && numeroUno == 6) {
                        numeroDiezX = "dieciseis";
                    }
                    if (numero == 17) {
                        numeroDiezX = "Diecisiete";
                    }
                    if (numero > 20 && numeroDiez == 1 && numeroUno == 7) {
                        numeroDiezX = "diecisiete";
                    }
                    if (numero == 18) {
                        numeroDiezX = "Dieciocho";
                    }
                    if (numero > 20 && numeroDiez == 1 && numeroUno == 8) {
                        numeroDiezX = "dieciocho";
                    }
                    if (numero == 19) {
                        numeroDiezX = "Diecinueve";
                    }
                    if (numero > 20 && numeroDiez == 1 && numeroUno == 9) {
                        numeroDiezX = "diecinueve";
                    }
                    break;
                case 2:
                    if (numero == 20) {
                        numeroDiezX = "Veinte";
                    }
                    if (numero > 20 && numero < 29) {
                        numeroDiezX = "Veinti";
                    }
                    if (numero > 100) {
                        numeroDiezX = "veinti";
                    }
                    break;
                case 3:
                    if (numero == 30) {
                        numeroDiezX = "Treinta";
                    }
                    if (numero > 30 && numero < 39) {
                        numeroDiezX = "Treinta y";
                    }
                    if (numero > 100) {
                        numeroDiezX = "treinta y";
                    }
                    if (numero > 100 && numeroUno == 0) {
                        numeroDiezX = "treinta";
                    }
                    break;
                case 4:
                    if (numero == 40) {
                        numeroDiezX = "Cuarenta";
                    }
                    if (numero > 40 && numero < 50) {
                        numeroDiezX = "Cuarenta y";
                    }
                    if (numero > 100) {
                        numeroDiezX = "cuarenta y";
                    }
                    if (numero > 100 && numeroUno == 0) {
                        numeroDiezX = "cuarenta";
                    }
                    break;
                case 5:
                    if (numero == 50) {
                        numeroDiezX = "Cincuenta";
                    }
                    if (numero > 50 && numero < 60) {
                        numeroDiezX = "Cincuenta y";
                    }
                    if (numero > 100) {
                        numeroDiezX = "cincuenta y";
                    }
                    if (numero > 100 && numeroUno == 0) {
                        numeroDiezX = "cincuenta";
                    }
                    break;
                case 6:
                    if (numero == 60) {
                        numeroDiezX = "Sesenta";
                    }
                    if (numero > 60 && numero < 70) {
                        numeroDiezX = "Sesenta y";
                    }
                    if (numero > 100) {
                        numeroDiezX = "sesenta y";
                    }
                    if (numero > 100 && numeroUno == 0) {
                        numeroDiezX = "sesenta";
                    }
                    break;
                case 7:
                    if (numero == 70) {
                        numeroDiezX = "Setenta";
                    }
                    if (numero > 70 && numero < 80) {
                        numeroDiezX = "Setenta y";
                    }
                    if (numero > 100) {
                        numeroDiezX = "setenta y";
                    }
                    if (numero > 100 && numeroUno == 0) {
                        numeroDiezX = "setenta";
                    }
                    break;
                case 8:
                    if (numero == 80) {
                        numeroDiezX = "Ochenta";
                    }
                    if (numero > 80 && numero < 90) {
                        numeroDiezX = "Ochenta y";
                    }
                    if (numero > 100) {
                        numeroDiezX = "ochenta y";
                    }
                    if (numero > 100 && numeroUno == 0) {
                        numeroDiezX = "ochenta";
                    }
                    break;
                default:
                    if (numero == 90) {
                        numeroDiezX = "Noventa";
                    }
                    if (numero > 90 && numero < 100) {
                        numeroDiezX = "Noventa y";
                    }
                    if (numero > 100) {
                        numeroDiezX = "noventa y";
                    }
                    if (numero > 100 && numeroUno == 0) {
                        numeroDiezX = "noventa";
                    }
                    break;
            }//fin switch    
            //empezamos del 100 al 999
            switch (numeroCien) {
                case 0:
                    numeroCienX = "";
                    break;
                case 1:
                    if (numero == 100) {
                        numeroCienX = "Cien";
                    }
                    if (numero > 100 && numero < 200) {
                        numeroCienX = "Ciento";
                    }
                    if (numero > 1000) {
                        numeroCienX = "ciento";
                    }
                    break;
                case 2:
                    if (numero == 200) {
                        numeroCienX = "Doscientos";
                    }
                    if (numero > 200 && numero < 300) {
                        numeroCienX = "Doscientos";
                    }
                    if (numero > 1000) {
                        numeroCienX = "doscientos";
                    }
                    break;
                case 3:
                    if (numero == 300) {
                        numeroCienX = "Trescientos";
                    }
                    if (numero > 300 && numero < 400) {
                        numeroCienX = "Trescientos";
                    }
                    if (numero > 1000) {
                        numeroCienX = "trescientos";
                    }
                    break;
                case 4:
                    if (numero == 400) {
                        numeroCienX = "Cuatrocientos";
                    }
                    if (numero > 400 && numero < 400) {
                        numeroCienX = "Cuatrocientos";
                    }
                    if (numero > 1000) {
                        numeroCienX = "cuatrocientos";
                    }
                    break;
                case 5:
                    if (numero == 500) {
                        numeroCienX = "Quinientos";
                    }
                    if (numero > 500 && numero < 600) {
                        numeroCienX = "Quinientos";
                    }
                    if (numero > 1000) {
                        numeroCienX = "quinientos";
                    }
                    break;
                case 6:
                    if (numero == 600) {
                        numeroCienX = "Seiscientos";
                    }
                    if (numero > 600 && numero < 700) {
                        numeroCienX = "Seiscientos";
                    }
                    if (numero > 1000) {
                        numeroCienX = "seiscientos";
                    }
                    break;
                case 7:
                    if (numero == 700) {
                        numeroCienX = "Setecientos";
                    }
                    if (numero > 700 && numero < 800) {
                        numeroCienX = "Setecientos";
                    }
                    if (numero > 1000) {
                        numeroCienX = "setecientos";
                    }
                    break;
                case 8:
                    if (numero == 800) {
                        numeroCienX = "Ochocientos";
                    }
                    if (numero > 800 && numero < 900) {
                        numeroCienX = "Ochocientos";
                    }
                    if (numero > 1000) {
                        numeroCienX = "ochocientos";
                    }
                    break;
                default:
                    if (numero == 900) {
                        numeroCienX = "Novecientos";
                    }
                    if (numero > 900 && numero < 1000) {
                        numeroCienX = "Novecientos";
                    }
                    if (numero > 1000) {
                        numeroCienX = "novecientos";
                    }
                    break;
            }//fin switch
            //empezamos del 1000 al 9999
            switch (numeroMil) {
                case 0:
                    numeroMilX = "";
                    break;
                case 1:
                    if (numero == 1000) {
                        numeroMilX = "Mil";
                    }
                    if (numero > 1000 && numero < 2000) {
                        numeroMilX = "Mil";
                    }
                    if (numero > 10000) {
                        numeroMilX = "Mil";
                    }
                    break;
                case 2:
                    if (numero == 2000) {
                        numeroMilX = "Dos mil";
                    }
                    if (numero > 2000 && numero < 3000) {
                        numeroMilX = "Dos mil";
                    }
                    if (numero > 10000) {
                        numeroMilX = "Dos mil";
                    }
                    break;
                case 3:
                    if (numero == 3000) {
                        numeroMilX = "Tres mil";
                    }
                    if (numero > 3000 && numero < 4000) {
                        numeroMilX = "Tres mil";
                    }
                    if (numero > 10000) {
                        numeroMilX = "Tres mil";
                    }
                    break;
                case 4:
                    if (numero == 4000) {
                        numeroMilX = "Cuatro mil";
                    }
                    if (numero > 4000 && numero < 5000) {
                        numeroMilX = "Cuatro mil";
                    }
                    if (numero > 10000) {
                        numeroMilX = "Cuatro mil";
                    }
                    break;
                case 5:
                    if (numero == 5000) {
                        numeroMilX = "Cinco mil";
                    }
                    if (numero > 5000 && numero < 6000) {
                        numeroMilX = "Cinco mil";
                    }
                    if (numero > 10000) {
                        numeroMilX = "Cinco mil";
                    }
                    break;
                case 6:
                    if (numero == 6000) {
                        numeroMilX = "Seis mil";
                    }
                    if (numero > 6000 && numero < 7000) {
                        numeroMilX = "Seis mil";
                    }
                    if (numero > 10000) {
                        numeroMilX = "Seis mil";
                    }
                    break;
                case 7:
                    if (numero == 7000) {
                        numeroMilX = "Siete mil";
                    }
                    if (numero > 7000 && numero < 8000) {
                        numeroMilX = "Siete mil";
                    }
                    if (numero > 10000) {
                        numeroMilX = "Siete mil";
                    }
                    break;
                case 8:
                    if (numero == 8000) {
                        numeroMilX = "Ocho mil";
                    }
                    if (numero > 8000 && numero < 9000) {
                        numeroMilX = "Ocho mil";
                    }
                    if (numero > 10000) {
                        numeroMilX = "Ocho mil";
                    }
                    break;
                default:
                    if (numero == 9000) {
                        numeroMilX = "Nueve mil";
                    }
                    if (numero > 9000 && numero < 10000) {
                        numeroMilX = "Nueve mil";
                    }
                    if (numero > 10000) {
                        numeroMilX = "Nueve mil";
                    }
                    break;
            }//fin switch

            System.out.println("El número es " + numeroMilX + " " + numeroCienX + " "
                    + numeroDiezX + " " + numeroUnoX);

        } else {
            System.out.println("El número es superior a 9999 o es negativo");
        }//fin else 

    }//fin del main
}//fin de la clase
