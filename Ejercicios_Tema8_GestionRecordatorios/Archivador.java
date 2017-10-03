/*
(1) Nos creamos una nueva clase llamada Archivador
(2) Tendrá un ArrayList de tipo Carpeta
(3) Añadir una nueva opción en el menú "Añadir carpeta"
 */
package Ejercicios_Tema8_GestionRecordatorios;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Hector Garcia
 */
public class Archivador {

    //Atributos o campos
    private ArrayList<Carpeta> archivador;

    //CONTSTRUCOTR
    public  Archivador() {
        archivador = new ArrayList();
    }
    
    //METODOS
    //añadir carpeta
    public void anadirCarpeta(Carpeta carpeta) {
        archivador.add(carpeta);//añadimos objeto a la coleccion

    }//fin metodo

    public Carpeta dameCarpeta(String nombreCarpeta) {
        Carpeta aux = new Carpeta(nombreCarpeta);
        int indice = archivador.indexOf(aux);
        if (indice == -1) {
            return null;
        } else {
            return archivador.get(indice);
        }
    }
    
    public void muestraCarpetas(){
        int contador =1;
        Iterator it = archivador.iterator();
        while(it.hasNext()){
            System.out.println(contador + " - " + it.next());
            contador++;
        }
    
    }
   

    
    
}//fin clase
