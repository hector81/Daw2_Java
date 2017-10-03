/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema8_GestionRecordatorios;


import java.util.Scanner;

/**
 *
 * @author VESPERTINO
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
        System.out.println("Crea una carpeta");
        String nombre;
        nombre = sc.nextLine();       
        Carpeta carpeta = new Carpeta(nombre);
        archivador.anadirCarpeta(carpeta);//añadimos objeto a la coleccion
        System.out.println("La carpeta ha sido creada correctamente");
    }

    //añadir un apunte en una carpeta
    public void añadirNota() {
        Apunte apunte = new Apunte();
        Carpeta aux;
        System.out.println("Pasame el asunto del apunte");
        apunte.setAsunto(sc.nextLine());
        System.out.println("Pasame es texto del apunte");
        apunte.setTextoDescripcion(sc.nextLine());

        aux = existeCarpeta();
        if (aux != null) {
            aux.añadeApunte(apunte);
        } else {
            System.out.println("La carpeta no existe");
        }

    }

    //Comprobar existencia de dicha carpeta
    public Carpeta existeCarpeta() {
        String nombreCarpeta;
        System.out.println("Pasame el nombre de la carpeta");
        nombreCarpeta = sc.nextLine();
        return archivador.dameCarpeta(nombreCarpeta);
    }

    //Borrar un apunte en concreto
    public void borrarApunte() {
        Carpeta aux;
        String asuntoApunte;
        aux = existeCarpeta();
        if (aux != null) {
            System.out.println("Pasame el asunto del apunte a borrar");
            asuntoApunte = sc.nextLine();
            aux.borrarNota(asuntoApunte);
        } else {
            System.out.println("La carpeta no existe");
        }
    }

    //Ver un apunte en concreto
    public void verApunte() {
        Carpeta aux;
        String asuntoApunte;
        aux = existeCarpeta();
        if (aux != null) {
            System.out.println("Pasame el asunto del apunte a ver");
            asuntoApunte = sc.nextLine();
            System.out.println(aux.verNota(asuntoApunte));
        } else {
            System.out.println("La carpeta no existe");
        }
    }

    //modificar un apunte por otro apunte
    public void modificarApunte() {
        Carpeta aux;
        Apunte auxApunte = new Apunte();
        String asuntoApunteOld;
        aux = existeCarpeta();
        if (aux != null) {
            System.out.println("Pasame el asunto del apunte a borrar");
            asuntoApunteOld = sc.nextLine();
            System.out.println("Pasame un asunto para el nuevo apunte");
            auxApunte.setAsunto(sc.nextLine());
            System.out.println("Pasame el texto");
            auxApunte.setTextoDescripcion(sc.nextLine());
            System.out.println(aux.modificarNota(asuntoApunteOld, auxApunte));

        } else {
            System.out.println("La carpeta no existe");
        }
    }

    public void natural() {
        Carpeta aux;
        aux = existeCarpeta();
        if (aux != null) {
            aux.listadoNatural();
        } else {
            System.out.println("La carpeta no existe");
        }

    }

    public void horas() {
        Carpeta aux;
        aux = existeCarpeta();
        if (aux != null) {
            aux.listadoHora();
        } else {
            System.out.println("La carpeta no existe");
        }
    }

    public void salir() {
        System.out.println("salir apunte");
    }

}
