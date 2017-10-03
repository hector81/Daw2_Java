package iescomercioejerciciostema3;

import java.util.Scanner;

/*IMPLEMENTAR UN PROGRAMNAMEN JAV A QUE PIDA A 3 ALUMNOS SU EDAD Y CALCULE Y
MUESTRE POR PANTALLA LA MEDIA DE EDAD DE ESOS 3 ALUMNOS*/
public class SegundoControl 
{
    public static void main(String arg[])
    {
        //declarar atributos
        int edadAlumno1, edadAlumno2,edadAlumno3;
        float mediaEdadAlumnos;
        int totalEdad;
        int totalAlumnos = 3;
        Scanner entrada=new Scanner(System.in);
        
        //introducir datos con scanner
        System.out.println("Introduce edad alumno 1 : ");      
        edadAlumno1 = entrada.nextInt();
        System.out.println("Introduce edad alumno 2 : ");      
        edadAlumno2 = entrada.nextInt();
        System.out.println("Introduce edad alumno 3 : ");      
        edadAlumno3 = entrada.nextInt();
        
        //realizar los calculos
        totalEdad = edadAlumno1 + edadAlumno2 + edadAlumno3;
        mediaEdadAlumnos = (float) totalEdad/totalAlumnos;
        
        
        //imprimir resultados
        System.out.printf("La edad media de los alumnos es : %1.2f \n",mediaEdadAlumnos); 
        //System.out.printf("La edad media de los alumnos es : %.2f \n",mediaEdadAlumnos); 
        //con 25 espacios: System.out.printf("La edad media de los alumnos es : %25.2f \n",mediaEdadAlumnos); 
    }
}
