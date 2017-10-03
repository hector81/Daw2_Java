/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema6.eje2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author user
 */
public class Menu {
    private TreeSet operacion ;
    
    public Menu() {
        operacion = new TreeSet();
    
    }
    
    public void enseñarMenu(){
        System.out.println("1-Añadir alumno ");
        System.out.println("2-Borrar alumno ");
        System.out.println("3-Enseñar lista");
        System.out.println("4-Enseñar lista dni");
        System.out.println("5-Salir ");
    }
    
    public void escogeOpcion(int numero){
        switch(numero){
            case 1:
                añadirAlumno();
                break;
            case 2:
                borrarAlumno();
                break;
            case 3:
                recorrerFichas();
                break;
            case 4:
                recorrerFichasDni();
                break;
        
        }
    
    }
    
    public void añadirAlumno(){
        Scanner sc= new Scanner(System.in);
        Alumno alum= new Alumno();
        String nombre;
        int dni;
        int telefono;
        
        System.out.println("Pon nombre");
        nombre= sc.nextLine();
        System.out.println("Pon telefono");
        telefono= sc.nextInt();
        System.out.println("Pon dni");
        dni= sc.nextInt();
        
        if(operacion.add(alum) == false){
        System.out.println("eL ALUMNO ESTA REPETIDO");
        }
        
        operacion.add(alum);
    
    }
    
    public void borrarAlumno(){
         Scanner sc= new Scanner(System.in);
        int pos;
        System.out.println("Pedimos posicion a borrar");       
        pos = sc.nextInt(); 
        int contador = 0;
        for (Object listaAlumno : operacion) {
            if (contador == pos) {
                operacion.remove(listaAlumno);
                break;
            }
            contador++;
        }
    }
    
    public void recorrerFichas(){
        Iterator it = operacion.iterator();
        int contador=1;
        while(it.hasNext()){
            System.out.println(contador + " " + it.next());
            contador++;
        }
    
    }
    
    public void recorrerFichasDni(){
        OrdenarDni dni= new OrdenarDni();
        TreeSet aux= new TreeSet((Collection) dni);
        aux.addAll(operacion);
        Iterator it= aux.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        }
    
    
    
    
    
    
}
