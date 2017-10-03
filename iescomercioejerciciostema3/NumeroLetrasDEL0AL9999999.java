package iescomercioejerciciostema3;

import java.util.Scanner;

public class NumeroLetrasDEL0AL9999999 {
    //main
    public static void main(String[] args) {
    // Declaracion de variables
        int numero;
        Scanner sc = new Scanner(System.in);

    //variables para calcular int
        int numeroDiezMillones;
        int numeroUnMillon;
        int numeroCienMil;
        int numeroDiezMil ;
        int numeroMil ;
        int numeroCien;
        int numeroDiez;
        int numeroUno;
        
    //variables para poner numeros en string
        String numeroDiezMillonesX ="";
        String numeroUnMillonX ="";
	String numeroCienMilX = "";
	String numeroDiezMilX = "";
	String numeroMilX = "";
        String numeroCienX = "";
        String numeroDiezX = "";
        String numeroUnoX = "";
        
    //Pedir datos
        System.out.print("Pon un número: ");
        numero = sc.nextInt();	
        
    //realizar calculos para separar numeros y al ser int solo devolvera el entero no los decimales
        numeroDiezMillones = numero/10000000;
	numeroUnMillon= numero/1000000;
	numeroCienMil = numero/100000;
	numeroDiezMil = numero/10000;
	numeroMil = numero/1000;
        numeroCien = (numero - numeroMil*1000)/100;
        numeroDiez = (numero - numeroMil*1000 - numeroCien*100)/10;
        numeroUno = numero - numeroMil*1000 - numeroCien*100 - numeroDiez*10;
                
    //calculamos los números que hemos puesto en string
    if(numero >= 0 && numero <= 99999999) { 
            /*
        // empezamos del 10000000 al 100000000 // del diez millones a cien millones -1
		switch(numeroDiezMillones){
            case 0:
                numeroDiezMillonesX ="";
                break;
            case 1:
                if(numero == 10000000 ) numeroDiezMillonesX="Diez millones";
				if(numero == 11000000 ) numeroDiezMillonesX="Once millones";
				if(numero == 12000000 ) numeroDiezMillonesX="Doce millones";
				if(numero == 13000000 ) numeroDiezMillonesX="Trece millones";
				if(numero == 14000000 ) numeroDiezMillonesX="Catorce millones";
				if(numero == 15000000 ) numeroDiezMillonesX="Quince millones";
				if(numero == 16000000 ) numeroDiezMillonesX="Dieciseis millones";
				if(numero == 17000000 ) numeroDiezMillonesX="Diecisiete millones";
				if(numero == 18000000 ) numeroDiezMillonesX="Dieciocho millones";
				if(numero == 19000000 ) numeroDiezMillonesX="Diecinueve millones";
				if(numero == 10000000 && numero > 100000000 ) numeroDiezMillonesX="diez millones";
				if(numero == 11000000 && numero > 100000000 ) numeroDiezMillonesX="once millones";
				if(numero == 12000000 && numero > 100000000 ) numeroDiezMillonesX="doce millones";
				if(numero == 13000000 && numero > 100000000 ) numeroDiezMillonesX="trece millones";
				if(numero == 14000000 && numero > 100000000 ) numeroDiezMillonesX="catorce millones";
				if(numero == 15000000 && numero > 100000000 ) numeroDiezMillonesX="quince millones";
				if(numero == 16000000 && numero > 100000000 ) numeroDiezMillonesX="dieciseis millones";
				if(numero == 17000000 && numero > 100000000 ) numeroDiezMillonesX="diecisiete millones";
				if(numero == 18000000 && numero > 100000000 ) numeroDiezMillonesX="dieciocho millones";
				if(numero == 19000000 && numero > 100000000 ) numeroDiezMillonesX="diecinueve millones";
				if(numero > 10000000 && numero < 200000000 ) numeroDiezMillonesX="Diez millones";			
                break;
            case 2:
                if(numero == 20000000 ) numeroDiezMillonesX="Veinte millones";
				if(numero > 20000000 && numero < 30000000 ) numeroDiezMillonesX="Veinte millones";
				if(numero > 100000000 ) numeroDiezMillonesX="veinte millones";
                break;
            case 3:
                if(numero == 30000000 ) numeroDiezMillonesX="Treinta millones";
				if(numero > 30000000 && numero < 40000000 ) numeroDiezMillonesX="Treinta millones";
				if(numero > 100000000 ) numeroDiezMillonesX="treinta millones";
                break;
            case 4:
                if(numero == 40000000 ) numeroDiezMillonesX="Cuarenta millones";
				if(numero > 40000000 && numero < 50000000 ) numeroDiezMillonesX="Cuarenta millones";
				if(numero > 100000000 ) numeroDiezMillonesX="cuarenta millones";
                break;
            case 5:
                if(numero == 50000000 ) numeroDiezMillonesX="Cincuenta millones";
				if(numero > 50000000 && numero < 60000000 ) numeroDiezMillonesX="Cincuenta millones";
				if(numero > 100000000 ) numeroDiezMillonesX="cincuenta millones";
                break;
            case 6:
                if(numero == 60000000 ) numeroDiezMillonesX="Sesenta millones";
				if(numero > 60000000 && numero < 70000000 ) numeroDiezMillonesX="Sesenta millones";
				if(numero > 100000000 ) numeroDiezMillonesX="sesenta millones";
                break;
            case 7:
                if(numero == 70000000 ) numeroDiezMillonesX="Setenta millones";
				if(numero > 70000000 && numero < 80000000 ) numeroDiezMillonesX="Setenta millones";
				if(numero > 100000000 ) numeroDiezMillonesX="setenta millones";
                break;
            case 8:
                if(numero == 80000000 ) numeroDiezMillonesX="Ochenta millones";
				if(numero > 80000000 && numero < 90000000 ) numeroDiezMillonesX="Ochenta millones";
				if(numero > 100000000 ) numeroDiezMillonesX="ochenta millones";
                break;
            case 9:
                if(numero == 90000000 ) numeroDiezMillonesX="Noventa millones";
				if(numero > 90000000 && numero < 100000000 ) numeroDiezMillonesX="Noventa millones";
				if(numero > 100000000 ) numeroDiezMillonesX="noventa millones";
                break;
        }//fin switch   
            */
        /*
                // empezamos del 1000000 al 10000000 // del millon a diez millones -1
		switch(numeroUnMillon){
            case 0:
                numeroUnMillonX ="";
                break;
            case 1:
                if(numero == 1000000 ) numeroUnMillonX="Un millón";
                if(numero > 1000000 && numero < 20000000 ) numeroUnMillonX="Un millón";			
                if(numero > 10000000 ) numeroUnMillonX="millones";
                break;
            case 2:
                if(numero == 2000000 ) numeroUnMillonX="Dos millones";
                if(numero > 2000000 && numero < 3000000 ) numeroUnMillonX="Dos millones";
                if(numero > 10000000 ) numeroUnMillonX="dos millones";
                break;
            case 3:
                if(numero == 3000000 ) numeroUnMillonX="Tres millones";
                if(numero > 3000000 && numero < 4000000 ) numeroUnMillonX="Tres millones";
                if(numero > 10000000 ) numeroUnMillonX="tres millones";
                break;
            case 4:
                if(numero == 4000000 ) numeroUnMillonX="Cuatro millones";
                if(numero > 4000000 && numero < 5000000 ) numeroUnMillonX="Cuatro millones";
                if(numero > 10000000 ) numeroUnMillonX="cuatro millones";
                break;
            case 5:
                if(numero == 5000000 ) numeroUnMillonX="Cinco millones";
                if(numero > 5000000 && numero < 6000000 ) numeroUnMillonX="Cinco millones";
                if(numero > 10000000 ) numeroUnMillonX="cinco millones";
                break;
            case 6:
                if(numero == 6000000 ) numeroUnMillonX="Seis millones";
                if(numero > 6000000 && numero < 7000000 ) numeroUnMillonX="Seis millones";
                if(numero > 10000000 ) numeroUnMillonX="seiscientos";
                break;
            case 7:
                if(numero == 7000000 ) numeroUnMillonX="Siete millones";
                if(numero > 7000000 && numero < 8000000 ) numeroUnMillonX="Siete millones";
                if(numero > 10000000 ) numeroUnMillonX="siete millones";
                break;
            case 8:
                if(numero == 8000000 ) numeroUnMillonX="Ocho millones";
                if(numero > 8000000 && numero < 9000000 ) numeroUnMillonX="Ocho millones";
                if(numero > 10000000 ) numeroUnMillonX="ocho millones";
                break;
            case 9:
                if(numero == 9000000 ) numeroUnMillonX="Nueve millones";
                if(numero > 9000000 && numero < 10000000 ) numeroUnMillonX="Nueve millones";
                if(numero > 10000000 ) numeroUnMillonX="nueve millones";
                break;
            }//fin switch
           */     
            /*
            //empezamos del 100000 al 999999 
            switch(numeroCienMil){
            case 0:
                numeroCienMilX ="";
                break;
            case 1:
                if(numero == 100000 ) numeroCienMilX="Cien mil";
                if(numero > 100000 && numero < 2000000 ) numeroCienMilX="Ciento";			
                if(numero > 1000000 ) numeroCienMilX="ciento";
                break;
            case 2:
                if(numero == 200000 ) numeroCienMilX="Doscientos mil";
                if(numero > 200000 && numero < 300000 ) numeroCienMilX="Doscientos";
                if(numero > 1000000 ) numeroCienMilX="doscientos";
                break;
            case 3:
                if(numero == 300000 ) numeroCienMilX="Trescientos mil";
                if(numero > 300000 && numero < 400000 ) numeroCienMilX="Trescientos";
                if(numero > 1000000 ) numeroCienMilX="trescientos";
                break;
            case 4:
                if(numero == 400000 ) numeroCienMilX="Cuatrocientos mil";
                if(numero > 400000 && numero < 500000 ) numeroCienMilX="Cuatrocientos";
                if(numero > 1000000 ) numeroCienMilX="cuatrocientos";
                break;
            case 5:
                if(numero == 500000 ) numeroCienMilX="Quinientos mil";
                if(numero > 500000 && numero < 600000 ) numeroCienMilX="Quinientos";
                if(numero > 1000000 ) numeroCienMilX="quinientos";
                break;
            case 6:
                if(numero == 600000 ) numeroCienMilX="Seiscientos mil";
                if(numero > 600000 && numero < 700000 ) numeroCienMilX="Seiscientos";
                if(numero > 1000000 ) numeroCienMilX="seiscientos";
                break;
            case 7:
                if(numero == 700000 ) numeroCienMilX="Setecientos mil";
                if(numero > 700000 && numero < 800000 ) numeroCienMilX="Setecientos";
                if(numero > 1000000 ) numeroCienMilX="setecientos";
                break;
            case 8:
                if(numero == 800000 ) numeroCienMilX="Ochocientos mil";
                if(numero > 800000 && numero < 900000 ) numeroCienMilX="Ochocientos";
                if(numero > 1000000 ) numeroCienMilX="ochocientos";
                break;
            case 9:
                if(numero == 900000 ) numeroCienMilX="Novecientos mil";
                if(numero > 900000 && numero < 1000000 ) numeroCienMilX="Novecientos";
                if(numero > 1000000 ) numeroCienMilX="novecientos";
                break;
        }//fin switch
        */
        //del 10000 al 99999
        switch(numeroDiezMil){
            case 0:
                numeroDiezMilX ="";
                break;
            case 1:
                if(numero == 10000 )  numeroDiezMilX="Diez mil";
                if(numero > 20000 && numero != 11000 && numero != 12000
                         && numero != 13000 && numero != 14000 && numero != 15000 && numero != 16000
                         && numero != 17000 && numero != 18000 && numero != 19000) numeroDiezMilX="diez mil";                                                               
                if(numero == 11000)  numeroDiezMilX="Once mil";
                if(numero > 11000 && numero < 12000)  numeroDiezMilX="Once mil";
                if(numero > 20000 && numeroDiezMil == 1 && numeroMil == 1 ) numeroDiezMilX="once mil";                         
                if(numero == 12000 )  numeroDiezMilX="Doce mil";
                if(numero > 12000 && numero < 13000)  numeroDiezMilX="Doce mil";
                if(numero > 20000 && numeroDiezMil == 1 && numeroMil == 2  ) numeroDiezMilX="doce mil";                          
                if(numero == 13000 )  numeroDiezX="Trece mil";
                if(numero > 13000 && numero < 14000)  numeroDiezMilX="Trece mil";
                if(numero > 20000 && numeroDiezMil == 1 && numeroMil == 3  ) numeroDiezMilX="trece mil";                       
                if(numero == 14000 )  numeroDiezMilX="Catorce mil";
                if(numero > 14000 && numero < 15000)  numeroDiezMilX="Catorce mil";
                if(numero > 20000 && numeroDiezMil == 1 && numeroMil == 4  ) numeroDiezMilX="catorce mil";               
                if(numero == 15000 )  numeroDiezMilX="Quince mil";
                if(numero > 15000 && numero < 16000)  numeroDiezMilX="Quince mil";
                if(numero > 20000 && numeroDiezMil == 1 && numeroMil == 5  ) numeroDiezMilX="quince mil";                       
                if(numero == 16000 )  numeroDiezMilX="Dieciseis mil";
                if(numero > 16000 && numero < 17000)  numeroDiezMilX="Dieciseis mil";
                if(numero > 20000 && numeroDiezMil == 1 && numeroMil == 6  ) numeroDiezMilX="dieciseis mil";                          
                if(numero == 17000 )  numeroDiezMilX="Diecisiete mil";
                if(numero > 17000 && numero < 18000)  numeroDiezMilX="Diecisiete mil";
                if(numero > 20000 && numeroDiezMil == 1 && numeroMil == 7  ) numeroDiezMilX="diecisiete mil";                    
                if(numero == 18000 )  numeroDiezMilX="Dieciocho mil";
                if(numero > 18000 && numero < 19000)  numeroDiezMilX="Dieciocho mil";
                if(numero > 20000 && numeroDiezMil == 1 && numeroMil == 8  ) numeroDiezMilX="dieciocho mil";                     
                if(numero == 19000 )  numeroDiezMilX="Diecinueve mil";
                if(numero > 19000 && numero < 20000)  numeroDiezMilX="Diecinueve mil";
                if(numero > 20000 && numeroDiezMil == 1 && numeroMil == 9  ) numeroDiezMilX="diecinueve mil";                  
                break;  
            case 2:
                if(numero == 20000 ) numeroDiezMilX="Veinte mil";
                if(numero > 20000 && numero <= 20999 ) numeroDiezMilX="Veinte mil";
                if(numero > 20999 && numero < 30000) numeroDiezMilX="Veinti";
                if(numero > 100000 && numeroDiezMil == 2 ) numeroDiezMilX="veinti";
                break;
            case 3:
                if(numero == 30000 ) numeroDiezMilX="Treinta mil";
                if(numero > 30000 && numero <= 30999 ) numeroDiezMilX="Treinta mil";
                if(numero > 30999 && numero < 40000) numeroDiezMilX="Treinta y ";
                if(numero > 100000 && numeroDiezMil == 3) numeroDiezMilX="treinta";
                break;
            case 4:
                if(numero == 40000 ) numeroDiezMilX="Cuarenta mil";
                if(numero > 40000 && numero <= 40999 ) numeroDiezMilX="Cuarenta mil";
                if(numero > 40999 && numero < 50000) numeroDiezMilX="Cuarenta y";
                if(numero > 100000 && numeroDiezMil == 4) numeroDiezMilX="cuarenta";
                break;
            case 5:
                if(numero == 50000 ) numeroDiezMilX="Cincuenta mil";
                if(numero > 50000 && numero <= 50999 ) numeroDiezMilX="Cincuenta mil";
                if(numero > 50999 && numero < 60000 ) numeroDiezMilX="Cincuenta y";
                if(numero > 100000 && numeroDiezMil ==5) numeroDiezMilX="cincuenta";
                break;
            case 6:
                if(numero == 60000 ) numeroDiezMilX="Sesenta mil";
                if(numero > 60000 && numero <= 60999 ) numeroDiezMilX="Sesenta mil";
                if(numero > 60999 && numero < 70000 ) numeroDiezMilX="Sesenta y";
                if(numero > 100000 && numeroDiezMil == 6) numeroDiezMilX="sesenta";
                break;
            case 7:
                if(numero == 70000 ) numeroDiezMilX="Setenta mil";
                if(numero > 70000 && numero <= 70999 ) numeroDiezMilX="Setenta mil";
                if(numero > 70999 && numero < 80000) numeroDiezMilX="Setenta y";
                if(numero > 100000 && numeroDiezMil == 7) numeroDiezMilX="setenta";
                break;
            case 8:
                if(numero == 80000 ) numeroDiezMilX="Ochenta mil";
                if(numero > 80000 && numero <= 80999 ) numeroDiezMilX="Ochenta mil";
                if(numero > 80999 && numero < 900000) numeroDiezMilX="Ochenta y";
                if(numero > 100000 && numeroDiezMil == 8) numeroDiezMilX="ochenta";
                break;
            case 9:
                if(numero == 90000 ) numeroDiezMilX="Noventa mil";
                if(numero > 90000 && numero <= 90999 ) numeroDiezMilX="Noventa mil";
                if(numero > 90999 && numero < 100000) numeroDiezMilX="Noventa y";
                if(numero > 100000 && numeroDiezMil == 9) numeroDiezMilX="noventa";
                break;
        }//fin switch  
        //empezamos del 1000 al 9999
            switch(numeroMil){
            case 0:
                numeroMilX ="";
                break;
            case 1:
                if(numero == 1000 ) numeroMilX="Mil";
                if(numero > 1000 && numero < 2000 ) numeroMilX="Mil";
                if(numero > 10000 && numeroMil == 1) numeroMilX="mil";
                break;
            case 2:
                if(numero == 2000 ) numeroMilX="Dos mil";
                if(numero > 2000 && numero < 3000 ) numeroMilX="Dos mil";
                if(numero > 10000 && numeroMil == 2) numeroMilX="dos mil";
                break;
            case 3:
                if(numero == 3000 ) numeroMilX="Tres mil";
                if(numero > 3000 && numero < 4000 ) numeroMilX="Tres mil";
                if(numero > 10000 && numeroMil == 3) numeroMilX="tres mil";
                break;
            case 4:
                if(numero == 4000 ) numeroMilX="Cuatro mil";
                if(numero > 4000 && numero < 5000 ) numeroMilX="Cuatro mil";
                if(numero > 10000 && numeroMil == 4) numeroMilX="cuatro mil";
                break;
            case 5:
                if(numero == 5000 ) numeroMilX="Cinco mil";
                if(numero > 5000 && numero < 6000 ) numeroMilX="Cinco mil";
                if(numero > 10000 && numeroMil == 5) numeroMilX="cinco mil";
                break;
            case 6:
                if(numero == 6000 ) numeroMilX="Seis mil";
                if(numero > 6000 && numero < 7000 ) numeroMilX="Seis mil";
                if(numero > 10000 && numeroMil == 6) numeroMilX="seis mil";
                break;
            case 7:
                if(numero == 7000 ) numeroMilX="Siete mil";
                if(numero > 7000 && numero < 8000 ) numeroMilX="Siete mil";
                if(numero > 10000 && numeroMil == 7) numeroMilX="siete mil";
                break;
            case 8:
                if(numero == 8000 ) numeroMilX="Ocho mil";
                if(numero > 8000 && numero < 9000 ) numeroMilX="Ocho mil";
                if(numero > 10000 && numeroMil == 8) numeroMilX="ocho mil";
                break;
            default:
                if(numero == 9000 ) numeroMilX="Nueve mil";
                if(numero > 9000 && numero < 10000 ) numeroMilX="Nueve mil";
                if(numero > 10000 && numeroMil == 9 ) numeroMilX="nueve mil";
                break;
        }//fin switch
        //empezamos del 100 al 999
            switch(numeroCien){
            case 0:
                numeroCienX="";
                break;
            case 1:
                if(numero == 100 ) numeroCienX="Cien";
                if(numero > 100 && numero < 200 ) numeroCienX="Ciento";
                if(numero > 1000 ) numeroCienX="ciento";
                break;
            case 2:
                if(numero == 200 ) numeroCienX="Doscientos";
                if(numero > 200 && numero < 300 ) numeroCienX="Doscientos";
                if(numero > 1000 ) numeroCienX="doscientos";
                break;
            case 3:
                if(numero == 300 ) numeroCienX="Trescientos";
                if(numero > 300 && numero < 400 ) numeroCienX="Trescientos";
                if(numero > 1000 ) numeroCienX="trescientos";
                break;
            case 4:
                if(numero == 400 ) numeroCienX="Cuatrocientos";
                if(numero > 400 && numero < 400 ) numeroCienX="Cuatrocientos";
                if(numero > 1000 ) numeroCienX="cuatrocientos";
                break;
            case 5:
                if(numero == 500 ) numeroCienX="Quinientos";
                if(numero > 500 && numero < 600 ) numeroCienX="Quinientos";
                if(numero > 1000 ) numeroCienX="quinientos";
                break;
            case 6:
                if(numero == 600 ) numeroCienX="Seiscientos";
                if(numero > 600 && numero < 700 ) numeroCienX="Seiscientos";
                if(numero > 1000 ) numeroCienX="seiscientos";
                break;
            case 7:
                if(numero == 700 ) numeroCienX="Setecientos";
                if(numero > 700 && numero < 800 ) numeroCienX="Setecientos";
                if(numero > 1000 ) numeroCienX="setecientos";
                break;
            case 8:
                if(numero == 800 ) numeroCienX="Ochocientos";
                if(numero > 800 && numero < 900 ) numeroCienX="Ochocientos";
                if(numero > 1000 ) numeroCienX="ochocientos";
                break;
            default:
                if(numero == 900 ) numeroCienX="Novecientos";
                if(numero > 900 && numero < 1000 ) numeroCienX="Novecientos";
                if(numero > 1000 ) numeroCienX="novecientos";
                break;
        }//fin switch
        ////empezamos del 10 al 99     
        switch(numeroDiez){
            case 0:
                numeroDiezX="";
                break;
            case 1:     
                if(numero == 10 )  numeroDiezX="Diez";
                if(numero > 20 && numero != 11 && numero != 12
                         && numero != 13 && numero != 14 && numero != 15 && numero != 16
                         && numero != 17 && numero != 18 && numero != 19) numeroDiezX="diez";                                                               
                if(numero == 11)  numeroDiezX="Once";
                if(numero > 20 && numeroDiez == 1 && numeroUno == 1 ) numeroDiezX="once";                         
                if(numero == 12 )  numeroDiezX="Doce";
                if(numero > 20 && numeroDiez == 1 && numeroUno == 2  ) numeroDiezX="doce";                          
                if(numero == 13 )  numeroDiezX="Trece";
                if(numero > 20 && numeroDiez == 1 && numeroUno == 3  ) numeroDiezX="trece";                       
                if(numero == 14 )  numeroDiezX="Catorce";
                if(numero > 20 && numeroDiez == 1 && numeroUno == 4  ) numeroDiezX="catorce";               
                if(numero == 15 )  numeroDiezX="Quince";
                if(numero > 20 && numeroDiez == 1 && numeroUno == 5  ) numeroDiezX="quince";                       
                if(numero == 16 )  numeroDiezX="Dieciseis";
                if(numero > 20 && numeroDiez == 1 && numeroUno == 6  ) numeroDiezX="dieciseis";                          
                if(numero == 17 )  numeroDiezX="Diecisiete";
                if(numero > 20 && numeroDiez == 1 && numeroUno == 7  ) numeroDiezX="diecisiete";                    
                if(numero == 18 )  numeroDiezX="Dieciocho";
                if(numero > 20 && numeroDiez == 1 && numeroUno == 8  ) numeroDiezX="dieciocho";                     
                if(numero == 19 )  numeroDiezX="Diecinueve";
                if(numero > 20 && numeroDiez == 1 && numeroUno == 9  ) numeroDiezX="diecinueve";                  
                break;                
            case 2:
                if(numero == 20 ) numeroDiezX="Veinte";
                if(numero > 20 && numero < 29 ) numeroDiezX="Veinti";
                if(numero > 100 ) numeroDiezX="veinti";
                break;
            case 3:
                if(numero == 30 ) numeroDiezX="Treinta";
                if(numero > 30 && numero < 39 ) numeroDiezX="Treinta y ";
                if(numero > 100 ) numeroDiezX="treinta y ";
                if(numero > 100 && numeroUno == 0 ) numeroDiezX="treinta";
                break;
            case 4:
                if(numero == 40 ) numeroDiezX="Cuarenta";
                if(numero > 40 && numero < 50 ) numeroDiezX="Cuarenta y ";            
                if(numero > 100 ) numeroDiezX="cuarenta y ";
                if(numero > 100 && numeroUno == 0 ) numeroDiezX="cuarenta";
                break;
            case 5:
                if(numero == 50 ) numeroDiezX="Cincuenta";
                if(numero > 50 && numero < 60 ) numeroDiezX="Cincuenta y ";
                if(numero > 100 ) numeroDiezX="cincuenta y ";
                if(numero > 100 && numeroUno == 0 ) numeroDiezX="cincuenta";
                break;
            case 6:
                if(numero == 60 ) numeroDiezX="Sesenta";
                if(numero > 60 && numero < 70 ) numeroDiezX="Sesenta y ";
                if(numero > 100 ) numeroDiezX="sesenta y ";
                if(numero > 100 && numeroUno == 0 ) numeroDiezX="sesenta";
                break;
            case 7:
                if(numero == 70 ) numeroDiezX="Setenta";
                if(numero > 70 && numero < 80 ) numeroDiezX="Setenta y ";
                if(numero > 100 ) numeroDiezX="setenta y ";
                if(numero > 100 && numeroUno == 0 ) numeroDiezX="setenta";
                break;
            case 8:
                if(numero == 80 ) numeroDiezX="Ochenta";
                if(numero > 80 && numero < 90 ) numeroDiezX="Ochenta y ";
                if(numero > 100 ) numeroDiezX="ochenta y ";
                if(numero > 100 && numeroUno == 0 ) numeroDiezX="ochenta";
                break;
            default:
                if(numero == 90 ) numeroDiezX="Noventa";
                if(numero > 90 && numero < 100 ) numeroDiezX="Noventa y ";
                if(numero > 100 ) numeroDiezX="noventa y ";
                if(numero > 100 && numeroUno == 0 ) numeroDiezX="noventa";
                break;
        }//fin switch 
        //del 0 al 9
        switch(numeroUno){
            case 0:
                numeroUnoX="";
                break;
            case 1:
		if(numero == 1 ) numeroUnoX="Uno";
                if(numero > 10 && numeroUno == 1 && numeroDiez == 1 ) numeroUnoX="";
                if(numero > 10 && numeroDiez != 1 ) numeroUnoX="uno";
                break;
            case 2:
                if(numero == 2 ) numeroUnoX="Dos";
                if(numero > 10 && numeroUno == 2 && numeroDiez == 1 ) numeroUnoX="";
                if(numero > 10 && numeroDiez != 1 ) numeroUnoX="dos";
                break;
            case 3:
                if(numero == 3 ) numeroUnoX="Tres";
                if(numero > 10 && numeroUno == 3 && numeroDiez == 1 ) numeroUnoX="";
                if(numero > 10 && numeroDiez != 1 ) numeroUnoX="tres";
                break;
            case 4:
                if(numero == 4 ) numeroUnoX="Cuatro";
                if(numero > 10 && numeroUno == 4 && numeroDiez == 1 ) numeroUnoX="";
                if(numero > 10 && numeroDiez != 1 ) numeroUnoX="cuatro";
                break;
            case 5:
                if(numero == 5 ) numeroUnoX="Cinco";
                if(numero > 10 && numeroUno == 5 && numeroDiez == 1 ) numeroUnoX="";
                if(numero > 10 && numeroDiez != 1 ) numeroUnoX="cinco";
                break;
            case 6:
                if(numero == 6 ) numeroUnoX="Seis";
                if(numero > 10 && numeroUno == 6 && numeroDiez == 1 ) numeroUnoX="";
                if(numero > 10 && numeroDiez != 1 ) numeroUnoX="seis";
                break;
            case 7:
                if(numero == 7 ) numeroUnoX="Siete";
                if(numero > 10 && numeroUno == 7 && numeroDiez == 1 ) numeroUnoX="";
                if(numero > 10 && numeroDiez != 1 ) numeroUnoX="siete";
                break;
            case 8:
                if(numero == 8 ) numeroUnoX="Ocho";
                if(numero > 10 && numeroUno == 8 && numeroDiez == 1 ) numeroUnoX="";
                if(numero > 10 && numeroDiez != 1 ) numeroUnoX="ocho";
                break;          
            default:
                if(numero == 9 ) numeroUnoX="Nueve";
                if(numero > 10 && numeroUno == 9 && numeroDiez == 1 ) numeroUnoX="";
                if(numero > 10 && numeroDiez != 1 ) numeroUnoX="nueve";
                break;                                          
        }//fin siwtch
        ///////////////////////////////////////////////////////////////////////////////   
            //imprimimos
			System.out.println("El número es " + /*numeroUnMillonX + numeroCienMilX +*/ numeroDiezMilX + numeroMilX 
			+ " " + numeroCienX + " "
                    + numeroDiezX + " " + numeroUnoX );
}//fin del if 
    else {
            System.out.println("El número es superior a 9999 o es negativo");
        }//fin else 
   
    }//fin del main
}//fin de la clase