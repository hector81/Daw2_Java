/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
import javax.swing.tree.TreeSelectionModel;

/**
 *
 * @author user
 */
public class Menu {

    TreeSet coleccion = new TreeSet();

    public Menu() {
    }

    public void mostrarOpciones() {
        System.out.println("1-Añadir alumno");
        System.out.println("2-borrar alumno");
        System.out.println("3-mostrar alumno");
        System.out.println("4-ordenar por expediente");
        System.out.println("5-ordenar por edad");
        System.out.println("6-ordenar por nombre");
        System.out.println("7-Salir");
    }

    public void escogerOpcion(int opcion) {
        switch (opcion) {
            case 1:
                añadirAlumno();
                break;
            case 2:
                borrarAlumno();
                break;
            case 3:
                mostrar();
                break;
            case 4:
                mostrarTexpediente();
                break;
            case 5:
                mostarEdad();
                break;
            case 6:
                mostrarNombre();
                break;

        }
    }

    public void añadirAlumno() {
        Scanner sc = new Scanner(System.in);
        int nExpediente;
        String nombre;
        String apellido;
        int edad;
        int nota;
        long telefono;

        System.out.println("1-PON NUMERO EXPEDIENTE");
        nExpediente = sc.nextInt();
        System.out.println("2-PON NOMBRE");
        nombre = sc.nextLine();
        System.out.println("3-APELLIDO");
        apellido = sc.nextLine();
        System.out.println("4-PON EDAD");
        edad = sc.nextInt();
        System.out.println("5-PON NOTA");
        nota = sc.nextInt();
        System.out.println("6-PON TELEFONO");
        telefono = sc.nextInt();
        Alumno alum = new Alumno(nExpediente,nombre,apellido,edad,nota,telefono);
        if (coleccion.add(alum) == false) {
            System.out.println("alumno repetido");
        }
        coleccion.add(alum);

    }//fin metodo

    public void borrarAlumno() {
        Scanner sc = new Scanner(System.in);
        int posicion = 0;
        System.out.println("2-PON POSICION");
        posicion = sc.nextInt();
        int contador = 0;
        for (Object o : coleccion) {
            if (posicion == contador) {
                coleccion.remove(coleccion);
                break;
            }
            contador++;
            System.out.println("borrado ejecutado");
        }
    }

    public void mostrar() {
        int contador = 0;
        Iterator it = coleccion.iterator();
        while (it.hasNext()) {
            System.out.println(contador + "- " + it.next());
            contador++;
        }
    }
     
    public void mostrarTexpediente() {
       mostrar();
    }
     
    
    public void mostarEdad() {
        int contador = 0;
       AlumnoEdad alum = new AlumnoEdad();
       TreeSet aux = new TreeSet(alum);
       aux.addAll(coleccion);
       Iterator it= aux.iterator();
       while (it.hasNext()) {
            System.out.println(contador + "- " + it.next());
            contador++;
        }
    }
    
    public void mostrarNombre() {
       int contador = 0;
       AlumnoNombre alum = new AlumnoNombre();
       TreeSet aux = new TreeSet(alum);
       aux.addAll(coleccion);
       Iterator it= aux.iterator();
       while (it.hasNext()) {
            System.out.println(contador + "- " + it.next());
            contador++;
        }
    }
     
    
}
