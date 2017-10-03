/*
8. Crea una clase llamada Log que contenga como propiedades: un mapa
de respete el orden de introducción de los elementos y un String con
el nombre del Log y con las siguientes características:

• Clave GregorianCalendar y como valor un String.
• Tendrá un método de añadir que recibirá un String y guardará el
elemento dentro del mapa
• Sobreescribe el método toString mostrará las lineas de Log guarda-
das en la EDD.
• Método almacenaFichero que volcará la información de la EDD en un
fchero llamado como la propiedad nombre Se implementará pos → -
teriormente

• Método leeFichero que volcará la información del fchero en la EDD.
→ Se implementará posteriormente
 */
package Ejercicios_Tema9_TryCatch;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 *
 * @author VESPERTINO
 */
public class Log {

    //mapa y atributo   
    private LinkedHashMap<GregorianCalendar, String> mapa;
    private String nombreLog;

    //constructor
    public Log(String nombreLog) {
        mapa = new LinkedHashMap();
        this.nombreLog = nombreLog;
    }

    //método de añadir que recibirá un String y guardará el
    //elemento dentro del mapa
    public void añadir(String mensaje) {
        GregorianCalendar fecha = new GregorianCalendar();
        mapa.put(fecha, mensaje);
    }//fin metodo

    //Sobreescribe el método toString mostrará las lineas de Log guarda-
    //das en la EDD.
    @Override
    public String toString() {
        // Obtenemos una coleccion de claves 
        Set s = mapa.keySet();
        Iterator it = s.iterator();
        GregorianCalendar aux;
        String mensaje;
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            // Cojo la primera clave de la coleccion Set
            aux = (GregorianCalendar) it.next();
            mensaje = mapa.get(aux);
            sb.append(mensaje + "\n");
        }
        return sb.toString();
    }

    //Método almacenaFichero que volcará la información de la EDD en un
    //fichero llamado como la propiedad nombre Se implementará pos → -
    //teriormente
    // Método almacenaFichero que volcará la información de la EDD 
    // en un fichero llamado como la propiedad nombre Se implementará posteriormente
    public void almacenaFichero() {
        Set s = mapa.keySet();
        Iterator it = s.iterator();
        GregorianCalendar aux;
        String mensaje;
        StringBuilder fecha = new StringBuilder();
        while (it.hasNext()) {
            // Cojo la primera clave de la coleccion Set
            aux = (GregorianCalendar) it.next();
            mensaje = mapa.get(aux);
            fecha.append(aux.get(Calendar.DAY_OF_MONTH) + "/" + aux.get(Calendar.MONTH) + "/" + aux.get(Calendar.YEAR)
                    + "/" + aux.get(Calendar.HOUR_OF_DAY) + "/" + aux.get(Calendar.MINUTE) + "/" + aux.get(Calendar.SECOND));
            // Metemos en fichero aux + mensaje

        }

    }
    //ABRE EL FICHERO Y CARGA TODA LA INFORMACION EN EL MAPA

    //Método leeFichero que volcará la información del fchero en la EDD.
    //→ Se implementará posteriormente
    public void leeFichero() {
        // abre el fichero
        // carga toda la informacion en el mapa
    }//fin metodo

    //METODO QUE DADA UNA FECHA DE TIPO dd/mm/yyyy (UN STRING) RETORNA   
    //TODOS LOS MENSAJES DE ESE DIA
    // Metodo que dada un String de tipo dd/mm/yyyy
    // Devuelve todos los mensajes de ese día
    public String devolverMensajesDiaConcreto(String fecha) {
        String fechaAux;
        StringBuilder sb = new StringBuilder();
        Set s = mapa.keySet();//para enviar la clave del mapa
        Iterator it = s.iterator();
        GregorianCalendar aux;
        while (it.hasNext()) {
            aux = (GregorianCalendar) it.next();//nos pasara la clave del siguiente eleemnto
            fechaAux = aux.get(Calendar.DAY_OF_MONTH) + "/" + aux.get(Calendar.MONTH) + "/" + aux.get(Calendar.YEAR);
            if (fechaAux.equals(fecha)) {
                sb.append(mapa.get(aux) + "\n");
            }
        }
        return sb.toString();

    }//fin metodo

}//fin clase
