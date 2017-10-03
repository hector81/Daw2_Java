/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_recordatorios;


import java.util.Scanner;

/**
 *
 * @author PROF_VESPERTINO
 */
public class OpcionesMenu {
    //atributos
    private Scanner sc;
    private Archivador archivador;
    //constructor
    public OpcionesMenu() {
        sc = new Scanner(System.in);
        archivador = new Archivador();
    }
    //metodos
    public void añadir_carpeta() {
        String nombre;
        nombre = sc.nextLine();
        Carpeta carpeta = new Carpeta(nombre);
        archivador.añadirCarpeta(carpeta);//añadimos objeto a la coleccion
        System.out.println("La carpeta ha sido creada correctamente");
    }

    public void añadir() {

        String asunto, descripcion, nombre_carpeta;
        Carpeta aux;
        Apunte apunte = new Apunte();

        System.out.println("CREACION DE APUNTE:\nIntroduce un asunto:");
        asunto = sc.nextLine();
        apunte.setAsunto(asunto);
        System.out.println("Introduce una descripcion:");
        descripcion = sc.nextLine();
        apunte.setDescripcion(descripcion);

        do {
            System.out.println("¿En que carpeta quieres guardar el apunte?");
            archivador.muestraArrayList();
            nombre_carpeta = sc.nextLine();
            aux = archivador.dameCarpeta(nombre_carpeta);
            if (aux == null) {
                System.out.println("La carpeta no existe");
            } else {
                System.out.println("El apunte ha sido añadido correctamente");
                aux.añadirApunte(apunte);
            }
        } while (aux == null);

    }

    public void borrar() {
        String nombre_carpeta;
        

    }

    public boolean salir() {
        return false;
    }

    public void modificar() {
        // Pedimos al usuario el asunto del apunte a buscar
        // Pedimos al usauior todos los datos para el apunte nuevo
        // Llamamos a modificar de carpeta

    }

    public void listtado2() {
        
        String nombre;
        
        System.out.println("¿Que carpeta quieres listar?");
        archivador.muestraArrayList();
        nombre = sc.nextLine();
        System.out.println("Lista de apuntes:");
        archivador.dameCarpeta(nombre).listadoHoras();
    }

    public void listado1() {
        
        String nombre;
        
        System.out.println("¿Que carpeta quieres listar?");
        archivador.muestraArrayList();
        nombre = sc.nextLine();
        archivador.dameCarpeta(nombre).listadoNatural();
    }

    void ver() {
        String asunto;
        
        System.out.println("¿Que carpeta quieres abrir");
        
    }

}
