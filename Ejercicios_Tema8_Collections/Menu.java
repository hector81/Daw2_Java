/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema8_Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


/**
 *
 * @author Hector Garcia
 */
public class Menu {
    //atributos, objetos
    private HashSet listaAlumnos = new HashSet();
    private Scanner sc = new Scanner(System.in);
    
    //isntacniar objetos construct

    public Menu() {
    }
    
    
    //metodos
    public void mostrarMenu(){
        System.out.println("1. Añadir datos alumno");
        System.out.println("2. Borrar por posición");
        System.out.println("3. Mostrar listado ");
        System.out.println("4. Salir del programa");
    }
    
    public void ejecutaOpcion(int numero){
        //depende del numero ejecuta una opcion llamando a metodo
        switch(numero){
            case 1:
                anadelistaAlumnos();
                break;
            case 2:
                // Pedir la posicion del objeto a borrar al alumno
                //System.out.println("Pedimos posicion a borrar");       
                //pos = sc.nextInt(); 
                borrarlistaAlumnos();
                break;
            case 3:
                mostrarListado();
                //break;
            
        
        }//fin switch 
    }//fin metod

    //METODOS PARA IMPLEMETAR
    private void anadelistaAlumnos() {
        String nombre;
        String apellido;
        String curso;
        //pedimos los datos
        System.out.println( "Pon el nombre del alumno: " );   
        nombre = sc.nextLine(); 
        //alum.setNombre(alum.nombre);
        System.out.println( "Pon el apellido del alumno: " );    
        apellido = sc.nextLine();     
        //alum.setApellido(alum.apellido);       
        System.out.println( "Pon el curso del alumno: " ); 
        curso = sc.nextLine();     
        //alum.setCurso(alum.curso);
        Alumno alum= new Alumno(nombre,apellido,curso);
        if(listaAlumnos.add(alum)== false) {
        System.out.println( "el alumno ya ha sido introducicdo" ); 
        }
        listaAlumnos.add(alum);
        
        //ponemos alumnos
        //listaAlumnos.add("Nombre" + alum.getNombre() + "Apellido "  + alum.getApellido() + "Curso "  +alum.getCurso() );     
    }//fin metodo

    private void borrarlistaAlumnos() {
        int pos;
        System.out.println("Pedimos posicion a borrar");       
        pos = sc.nextInt(); 
        //BORRAR alumnos.
        int contador = 1;
        for (Object listaAlumno : listaAlumnos) {
            if(contador==pos){
                listaAlumnos.remove(listaAlumno);
                break;
            }
            contador++;
        }
//        //creamos un hashset auxiliar
//        HashSet auxiliarH = new HashSet();
//        //creamos objeto de tipo iterator
//        Iterator it;
//        //Creamos objeto a de TIPO ALUMNO
//        Alumno a;
//        //recorremos posicion creando el objeto del iterator
//        it = listaAlumnos.iterator();
//        //Los recorremos
//        while(it.hasNext()) {
//            //AL a le damos el valor de los objetos que recorre
//            a = (Alumno)it.next();
//            //Si el contador coincide con la posicion que le pasamos
//            if (contador == pos) {
//                listaAlumnos.remove(a);//hay que pasarle el objeto que queremos borrar
//                break;//para salir del bucle
//            }
//            contador++;
//        }        
        System.out.println("Borrado ejecutado ");        
    }

    private void mostrarListado() {
        /*
        //creamos un objeto Iterator
        Iterator it = listaAlumnos.iterator();
        int contador = 1;
        //creamos un objeto del tipo Alumno
        Alumno aux;
        //con el while recorremos los elementos mientras los tenga
        while(it.hasNext())  {
                //Los imprimimos los que tanga
                //System.out.println(it.hasNext());
                //creamos un objeto aux para guardar el objeto
                aux=(Alumno)it.next();
                System.out.println(contador + " - " + aux.toString());  
                contador++;///iniciamos contador
        }
        */
        //creamos un objeto Iterator
        Iterator it = listaAlumnos.iterator();
        int contador = 1;
        while (it.hasNext()) {
            System.out.println(contador + " - " + it.next());
            contador++;
   
        }
    }
    
    
}//fin clase
