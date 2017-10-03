/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso1;

import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class MostrarExamen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String enunciado = null;
        String respuesta = null;
        String nombreExamen = null;
        int numeroOpciones = 0;
        
        
        
        //pedir datos
        //pedir nombre de examen
        System.out.println("Pasame un nombre de examen");
        nombreExamen = sc.nextLine();
        Examen examen= new Examen(nombreExamen);
        
        //pedir datos pregunta
        System.out.println("Pasame un enunciado de examen");//Enunciado\na.1\nb.2","b"
        enunciado = sc.nextLine();
        System.out.println("Pasame una respuesta al enunciado");
        enunciado = sc.nextLine(); 
        System.out.println("Pasame un numero de opciones");
        numeroOpciones = sc.nextInt();
        Test test = new Test(enunciado,respuesta,numeroOpciones);
        
        examen.añadirPregunta(test);
        TestRespuestaMultiple tesml= new TestRespuestaMultiple("Enunciado\na.1\nb.2","b",2);
        examen.añadirPregunta(tesml);
        //VerdaderoOFalso
        
        examen.mostrar();
        
//        Pregunta_Test p1 = new Pregunta_Test("¿Cual es el valor decimal del numero binario 0010? \n a. 1 \n b. 2 \n c. 3 \n", "b", 3);
//        Pregunta_Respuesta_Multiple p2 = new Pregunta_Respuesta_Multiple("¿Cuales son protocolos de URL?\n a. http \n b. ftp \n c. coco", "a b", 3, 2);
//        Pregunta_Verdadero_Falso p3 = new Pregunta_Verdadero_Falso("Un bite equivale a 16 bits", "falso");
    }

    public MostrarExamen() {
    }
}
