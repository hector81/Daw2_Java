/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema8_TreeSet;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


/**
 *
 * @author Hector Garcia
 */
public class Menu {

    //atributos, objetos

    private TreeSet listaAlumnos;
    private Scanner scInt;
    private Scanner scLine;

    //isntacniar objetos constructor
    public Menu() {
        listaAlumnos = new TreeSet();
        //hacemos dos scanner para int para line
        scInt = new Scanner(System.in);
        scLine = new Scanner(System.in);
    }

    //metodos
    public void mostrarMenu() {
        System.out.println("1. Añadir datos alumno");
        System.out.println("2. Borrar por posición");
        System.out.println("3. Mostrar listado ");
        System.out.println("4. Mostrar listado numero expediente ");
        System.out.println("5. Mostrar listado nota ");
        System.out.println("6. Mostrar listado nombre");
        System.out.println("7. Mostrar listado telefono");
        System.out.println("8. Salir del programa");
    }

    public void ejecutaOpcion(int numero) {
        //depende del numero ejecuta una opcion llamando a metodo
        switch (numero) {
            case 1:
                anadelistaAlumnos();
                break;
            case 2:
                borrarlistaAlumnos();
                break;
            case 3:
                mostrarListado();
                break;
            case 4:
                mostrarListadoNumExp();
                break;
            case 5:
                mostrarListadoNota();
                break;
            case 6:
                mostrarListadoNombre();
                break;
            case 7:
                mostrarListadonTelefono();
            //break;
        }//fin switch 
    }//fin metod

    //METODOS PARA IMPLEMETAR
    private void anadelistaAlumnos() {
        int nExpediente;
        String nombre; 
        String apellido;
        int edad;
        int nota;
        long telefono;
        //pedimos los datos
        System.out.println("Pon el nombre del alumno: ");
        nombre = scLine.nextLine();
        System.out.println("Pon el apellido del alumno: ");
        apellido = scLine.nextLine();
        System.out.println("Pon el numero de expediente del alumno : ");
        nExpediente = scInt.nextInt();
        System.out.println("Pon la edad del alumno : ");
        edad = scInt.nextInt();
        System.out.println("Pon la nota del alumno : ");
        nota = scInt.nextInt();
        System.out.println("Pon el telefono del alumno : ");
        telefono = scInt.nextInt();
        //alum.setCurso(alum.curso);

        Alumno alum = new Alumno(nExpediente, nombre, apellido,edad,nota,telefono);
        //Tambien se podría usar (!listaAlumnos.add(alum))
        if (listaAlumnos.add(alum) == false) {
            System.out.println("el alumno ya ha sido introducicdo");
        }
        listaAlumnos.add(alum);
        //ponemos alumnos
        //listaAlumnos.add("Nombre" + alum.getNombre() + "Apellido "  + alum.getApellido() + "Curso "  +alum.getCurso() );     
    }//fin metodo

    private void borrarlistaAlumnos() {
        int pos;
        System.out.println("Pedimos posicion a borrar");
        pos = scInt.nextInt();
        //BORRAR alumnos.
        int contador = 0;
        for (Object listaAlumno : listaAlumnos) {
            if (contador == pos) {
                listaAlumnos.remove(listaAlumno);
                break;
            }
            contador++;
        }
        System.out.println("Borrado ejecutado ");
    }

    private void mostrarListado() {
        Iterator it = listaAlumnos.iterator();
        int contador = 1;
        while (it.hasNext()) {
            System.out.println(contador + " - " + it.next());
            contador++;

        }
    }

    private void mostrarListadoNumExp() {
        mostrarListado();
    }

    private void mostrarListadoNota() {
        //crearse un objeto de la lista
        //crearse una lista de treeset  meter ese orden 
        //añadir los alumnos a la lista nueva y dp un iterator
        AlumnoOrdenadoPorNota a = new AlumnoOrdenadoPorNota();
        TreeSet lista = new TreeSet(a);//el orden se lo indicas en el objeto
        lista.addAll(listaAlumnos);
        Iterator i = lista.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }//fin metodo

    private void mostrarListadonTelefono() {
        //crearse un objeto de la lista
        //crearse una lista de treeset  meter ese orden 
        //añadir los alumnos a la lista nueva y dp un iterator
        AlumnoOrdenadoPorTelefono a = new AlumnoOrdenadoPorTelefono();
        TreeSet lista = new TreeSet(a);//el orden se lo indicas en el objeto
        lista.addAll(listaAlumnos);
        Iterator i = lista.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }//fin metodo

    private void mostrarListadoNombre() {
        //crearse un objeto de la lista
        //crearse una lista de treeset  meter ese orden 
        //añadir los alumnos a la lista nueva y dp un iterator
        AlumnoOrdenadoPorNombre a = new AlumnoOrdenadoPorNombre();
        TreeSet lista = new TreeSet(a);//el orden se lo indicas en el objeto
        lista.addAll(listaAlumnos);
        Iterator i = lista.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }//fin metodo

}//fin clase
