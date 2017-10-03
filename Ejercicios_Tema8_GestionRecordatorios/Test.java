/*
Implementad una aplicación con IGU de escritorio, que permita la gestión de
anotaciones (recordatorios) teniendo en cuenta las siguientes consideracio-
nes:
• Existirá una clase Apunte con los campos: Asunto, fecha, hora y texto
(campo descripción). 
• Existirá una clase Carpeta con los campos: nombre de la carpeta, y
colección de notas (ArrayList).
• En la aplicación podremos realizar las siguientes funciones:
◦ Añadir una nota, en una carpeta.
◦ Borrar una nota de una carpeta.
◦ Ver Nota.
◦ Modificar Nota.
◦ Listado de notas ordenadas por fecha dada una carpeta. 
◦ Listado de notas ordenada por hora dada una carpeta.
• La IGU dispondrá de una barra de herramientas y de una barra de
menús con las opciones que el usuario considere.
NOTA:
• Los atributos Fecha y hora pueden ir agrupados en un objeto de tipo
GregorianCalendar
• Todos los métodos necesarios para la resolución del ejercicio irán en
las clases del modelo reduciendo al mínimo el código dentro de la IGU

(1) Nos creamos una nueva clase llamada Archivador
(2) Tendrá un ArrayList de tipo Carpeta
(3) Añadir una nueva opción en el menú "Añadir carpeta"
 */
package Ejercicios_Tema8_GestionRecordatorios;

import Ejercicios_Tema8_OpcionesMenu.*;

/**
 *
 * @author Hector Garcia
 */
public class Test {
    public static final void main(String[] args) {
        // Inicializamos menu
        Menu menu = Menu.init();
        OpcionesMenu op = new OpcionesMenu();
        
        // Añadimos las opciones 
        menu.addOpcionMenu("Añadir Carpeta", () -> op.añadir_carpeta());
        menu.addOpcionMenu("Añadir Apunte", () -> op.añadirNota());
	menu.addOpcionMenu("Borrar Apunte", () -> op.borrarApunte());
        menu.addOpcionMenu("Mostrar Nota", () -> op.verApunte());
        menu.addOpcionMenu("Modificar Nota", () -> op.modificarApunte());
        menu.addOpcionMenu("Ordenar Nota por fechas", () -> op.natural());
        menu.addOpcionMenu("Ordenar Notas por hora", () -> op.horas());        
        menu.addOpcionMenu("Salir del Menu", () -> op.salir());
        
        // Mostrar menu
        menu.mostrarMenu();
        
    }//fin main
}//fin clase
