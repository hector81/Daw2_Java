/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoRecordatorio;
import Ejercicios_Tema8_OpcionesMenu.*;
/**
 *
 * @author user
 */
public class Test {
    public static void main(String[] args) {
        // Inicializamos menu
        Menu menu = Menu.init();
        OpcionesMenu op = new OpcionesMenu();
        
        // Añadimos las opciones 
        menu.addOpcionMenu("Añadir Carpeta", () -> op.añadirCarpeta());
        menu.addOpcionMenu("Añadir Apunte", () -> op.añadirApunte());
	menu.addOpcionMenu("Borrar Apunte", () -> op.borrarApunte());
        menu.addOpcionMenu("Modificar Apunte", () -> op.modificarApunte());
        menu.addOpcionMenu("Ver Apunte", () -> op.verApunte());
        menu.addOpcionMenu("Ver listado fechas", () -> op.verFecha());
        menu.addOpcionMenu("Ver listado horas", () -> op.verHora());
        menu.addOpcionMenu("Salir del Menu", () -> op.salir());
        
        // Mostrar menu
        menu.mostrarMenu();
    }
}
