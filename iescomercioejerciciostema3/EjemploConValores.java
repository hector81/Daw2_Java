package iescomercioejerciciostema3;

/*Realizar un programa en java que se declare una variable de numero entero inicializada con el valor "878953",
y que saque ese numero en decimal, octal y hexadecimal , y sacar nombre ,edad y sueldo usando printf*/

//mirar porcentajes
//http://www.it.uc3m.es/labas/course_notes/input_output_printf_es.html
//o
//https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html
public class EjemploConValores {
    public static void main(String arg[]){
    
    int valor = 87953;  
    
  
    System.out.printf("El valor del número en decimal es : %o Decimal",valor);
    System.out.printf("\n El valor del número en octal es : %d Octal",valor);
    System.out.printf("\n El valor del número en hexadecimal es : %x Hexadecimal",valor);
    
    String nombre= "Pepe";
    byte edad= 34;
    float sueldo= (float) 810.57;
    //.2f para que slga sin ceros, si solo sería %f  810.5700000
    System.out.printf("\nNombre:%s ;\nEdad:%d ;\nSueldo:%.2f",nombre,edad,sueldo);
    }
}
