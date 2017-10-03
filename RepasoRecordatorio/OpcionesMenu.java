/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoRecordatorio;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class OpcionesMenu {
   //atributos
    private Scanner sc;
    private Archivador archivador;
    
    //constructores
    public OpcionesMenu() {
        this.sc = new Scanner(System.in);
        this.archivador = archivador;
    }
    
    public Carpeta existeCarpeta(){
        String nombre;
        System.out.println("PON CARPETA");
        nombre= sc.nextLine();
        return archivador.dameCarpeta(nombre);
    }
    
    public void añadirCarpeta(){
        String nombre;
        System.out.println("AÑADE CARPETA");
        nombre= sc.nextLine();
        Carpeta carpeta= new Carpeta(nombre);
        
        archivador.añadirCarpeta(carpeta);
    }
    
    public void añadirApunte(){
        String asunto = "";
        String descripcion="";
        Carpeta auxiliar;
        Apunte apunte = new Apunte();
        auxiliar = existeCarpeta();
        if(auxiliar!=null){
            System.out.println("pon asunto");
            apunte.setAsunto(sc.nextLine());
            System.out.println("pon descripcion");
            apunte.setDescripcion(sc.nextLine());
            auxiliar.añadirApunte(apunte);
        }else{
            System.out.println("no EXISTE CARPETA");
        }
    }
    
    public void modificarApunte(){
        String asunto="";
        Carpeta auxiliar;
        Apunte apunte = new Apunte();
        auxiliar = existeCarpeta();
        if(auxiliar!=null){
            System.out.println("pon asunto a modificar");
            asunto = sc.nextLine();
            System.out.println("pon asunto");
            apunte.setAsunto(sc.nextLine());
            System.out.println("pon descripcion");
            apunte.setDescripcion(sc.nextLine());
            auxiliar.modificarApunte(asunto, apunte);
        }else{
            System.out.println("no EXISTE CARPETA");
        }
    
    }
    
    public void borrarApunte(){
        String asunto;
        Carpeta aux;
        Apunte apunte = new Apunte();
        aux= existeCarpeta();
        if(aux!=null){
            System.out.println("pon asunto a borrar");
            asunto = sc.nextLine();
            aux.borrarApunte(asunto);
            }else{
            System.out.println("no EXISTE CARPETA");
        
        }
    
    }
    
    public void verApunte(){
        Carpeta auxiliar;
        String asunto;
        auxiliar= existeCarpeta();
        if(auxiliar!= null){
            System.out.println("PON ASUNTO");
            asunto = sc.nextLine();
            auxiliar.verApunte(asunto);
        }else{
            System.out.println("no EXISTE CARPETA");
        }
    
    }
    
    public void verFecha(){
        Carpeta auxiliar;
        auxiliar= existeCarpeta();
        if(auxiliar != null){
            auxiliar.recorrerFecha();
        }else{
            System.out.println("no EXISTE CARPETA");
        }
    
    }
    
    public void verHora(){
        Carpeta auxiliar;
        auxiliar= existeCarpeta();
        if(auxiliar != null){
            auxiliar.recorrerFechaHora();
        }else{
            System.out.println("no EXISTE CARPETA");
        }
    
    }
    
    public void salir(){
        System.out.println("fin");
    }
    
}
