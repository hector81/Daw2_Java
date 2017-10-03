/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class Examen {
    //atributos
    private Scanner sc;
    private String nombre;
    private ArrayList<Pregunta> preguntas;
    private int numeroPreguntas;

    public Examen(String nombre) {//int numero_preguntas
        this.nombre = nombre;
        preguntas = new ArrayList();
        this.numeroPreguntas = 0;
        sc = new Scanner(System.in);
    }
    
    //tamaño de la pregunta
    public int getNpreguntas() {
        return preguntas.size();
    }
    
    //metodo añadir preguntar al examen
    public void añadirPregunta(Pregunta pregunta){
        if (preguntas.contains(pregunta) == false) {            
            preguntas.add(pregunta);
        }   
        
        /*
        if (coleccion.size() != numPreguntas) {
            Pregunta aux = new Pregunta(enunciado, respuesta);
            String enunciado, respuesta;
            int dificultad;
            System.out.println("Pasame un enunciado");
            enunciado = sc.nextLine();
            aux.setEnunciado(enunciado);
            System.out.println("Pasame una respusta para el enunciado");
            respuesta = sc.nextLine();
            aux.setRespuesta(respuesta);
            System.out.println("Pasame el nivel de dificultad");
            dificultad = sc.nextInt();
            aux.setDificultad(dificultad);
            coleccion.add(aux);
        } else {
            System.out.println("El examen esta lleno");
        }
        */
    }
    
    //Obtiene las preguntas que hemos señalado
    public Pregunta obtenerPregunta(int indice) {
        return preguntas.get(indice);
        /*
        Pregunta aux = new Pregunta();
        String enunciado;
        int indice;
        System.out.println("Pasame el enuncaido de la pregunta que deseas ver");
        enunciado = sc.nextLine();
        aux.setEnunciado(enunciado);
        indice = coleccion.indexOf(aux);//pregunto si el apunte esta en la lista basandome en el enunciado ya que lo he elegido en el equals
        if (indice != -1) {//si es diferente de -1 quiere decir que esta
            return coleccion.get(indice); //muestro el apunte
        } else {
            return null;//como no esta muestro null
        }
        */
    }
    
    //borrar preguntas
    public void borrarPregutna(Pregunta pregunta) {
        if (preguntas.contains(pregunta)) {
            preguntas.remove(pregunta);
        }
        /*
        int indice;
        System.out.println("Pasame la posicion de la pregunta");
        indice = sc.nextInt();//guardo la posicion que me ha dado el usuario
        if (indice <= coleccion.size()) {//condicion por si pasan un indice mayor que el tamaño de la coleccion
            return coleccion.remove(indice);// el caso entra en el if borro  el apunte y lo devuelve
        }else{
            return null;//en el caso no entra en el if devuelve null como diciendo ese indice no existe
        }
        */
    }
 
    //Metodo para borrar la pregunta que se ha seleccionado
    public void moverPregunta(int viejo, int nuevo){
        Pregunta aux = preguntas.get(viejo);
        preguntas.set(viejo, preguntas.get(nuevo));
        preguntas.set(nuevo, aux);
     //listaPreguntas.remove(n);
     
     /*
     //mover pregunta
    public void moverPregunta(){
        int indice1, indice2;
        Pregunta aux1= new Pregunta();
        Pregunta aux2 = new Pregunta();
        String enunciado1, enunciado2;
        System.out.println("Pasame el enunciado del primera pregunta a cambiar");//esto es como en los otros metodos
        enunciado1=sc.nextLine();
        aux1.setEnunciado(enunciado1);
        System.out.println("Pasame el enunciado del pregunta a cambiar por la anterior");
        enunciado2=sc.nextLine();
        aux2.setEnunciado(enunciado2);
        indice1=coleccion.indexOf(aux1);//saco los dos indices
        indice2=coleccion.indexOf(aux2);
        if(indice1!=-1 && indice2!=-1){//comprobar que los 2 apuntes esten en el examen
            coleccion.set(indice2, aux1);//estos set modifican el apunte en su posicion debida en los 2
            coleccion.set(indice1, aux2);
             System.out.println("Los apuntes fueron cambiados de posicon");
        }else{
            System.out.println("Un apunte no se encontrada en el examen");
        }
    }
     */
    }
    //Muestra el enunciado de todas preguntas
    public void mostrar() {
        for (Iterator<Pregunta> iterator = preguntas.iterator(); iterator.hasNext();) {
            Pregunta next = iterator.next();
            System.out.println(next.getEnunciado());
        }
        
        /*
        
        int contador = 0;
        Iterator it = listaPreguntas.iterator();
        while (it.hasNext()) {
            System.out.println(contador + " Enunciado : " + preg.enunciado);
            contador++;
        }
        
        
        for (Pregunta coleccion1 : coleccion) {
            System.out.println(coleccion1);}
        */
    }
    
}//fin clase
