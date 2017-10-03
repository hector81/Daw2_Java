package iescomercioejerciciostema3;

public class OperacionesPrioridad {
    public static void main(String arg[]){
        //CALCULAR OPERACIONES
        int operacion1 = 7 % 5 + 2 * 3;
        //2+2*3//2+6
        int operacion2 = 9/2*2*9/2;
        //4*2*9/2// 8*9/2 // 72/2      9/2 dara 4 porque es int
        int operacion3 = (int) Math.pow((2 * 3 + (4 * 8 + 4) / 6) , 2) + 6;
        //(2*3+(32+4)/6)^2+ 6//(2*3+(36)/6)^2+ 6//(2*3+6)^2+ 6//(6+6)^2+ 6//(12)^2+ 6//144+6
        int operacion4 = 118 + 12 - 5 * 2 * 10 / 5 % 5;
        //118+12 -0*0*0/0 // se aplica el %5 primero en prioridad el cual es 0
        int operacion5 = 3 *(int) Math.pow(2, 4)-5*(int) Math.pow(2, 3)+2*12-17;
        //3*16-5*8+2*12-17 // 48-40+2*12-17 //8+2*12-17 //8+24-17 // se aplica primero math pow
        int operacion6 = (15 - 4) + 3 - (12 - 5 * 2) + (5 + 16 / 4) - 5 + (10 - (int) Math.pow(2, 3));
        //(11)+3-(12-10)+(5+4)-5+(10-8) // Primero resolvemos los parentesis y dentro de estos los / y *
        
        //IMPRIMIR
        System.out.println("El resultado de operacion 1 (7 % 5 + 2 * 3)  vale: " + operacion1);
        System.out.println("El resultado de operacion 2 (9 / 2 * 2 * 9 / 2)  vale: " + operacion2);
        System.out.println("El resultado de operacion 3 ((2 * 3 + (4 * 8 + 4) / 6) ^ 2 + 6)  vale: " + operacion3);
        System.out.println("El resultado de operacion 4 (118 + 12 – 5 * 2 * 10 / 5 % 5)  vale: " + operacion4);
        System.out.println("El resultado de operacion 5 (3 * 2 ^ 4 – 5 * 2 ^ 3 + 2 * 12 – 17)  vale: " + operacion5);
        System.out.println("El resultado de operacion 6 ((15 - 4) + 3 – (12 – 5 * 2) + (5 + 16 / 4) – 5 + (10 – 2 ^ 3))  vale: " + operacion6);
    }
}