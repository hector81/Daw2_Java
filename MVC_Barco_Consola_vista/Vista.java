/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_Barco_Consola_vista;

import MVC_Barco_Consola_Controlador.ControladorBarco;
import MVC_Barco_Consola_Modelo.Barco;
import java.awt.event.ActionEvent;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Vista implements InterfaceVista{
    private String matricula;
    private String viejamatricula;
    private int eslora;
    private int precio;
    private int opcion;
    private ControladorBarco control;
    private Scanner sc;

    public Vista() {
        this.sc = new Scanner(System.in);
    }
    
    public void muestraMenu() {
        while (true) {
            System.out.println("1-alta ");
            System.out.println("2-baja ");
            System.out.println("3-modificar ");
            System.out.println("4-consulta ");
            System.out.println("5-salir ");
            System.out.println("Escoge opcion: ");
            opcion = sc.nextInt();
            while (opcion > 0 && opcion < 6) {
                switch (opcion) {
                    case 1:
                        System.out.println("mete matricula ");
                        matricula = sc.nextLine();
                        System.out.println("mete eslora ");
                        eslora = sc.nextInt();
                        System.out.println("mete precio ");
                        precio = sc.nextInt();
                        control.actionPerformed(new ActionEvent(control, 1, "alta"));
                        break;
                    case 2:
                        System.out.println("mete matricula para borrar");
                        matricula = sc.nextLine();
                        control.actionPerformed(new ActionEvent(control, 2, "baja"));
                        break;
                    case 3:
                        System.out.println("mete matricula para modificar");
                        viejamatricula = sc.nextLine();
                        System.out.println("mete matricula para nuevo barco ");
                        matricula = sc.nextLine();
                        System.out.println("mete eslora para nuevo barco  ");
                        eslora = sc.nextInt();
                        System.out.println("mete precio para nuevo barco ");
                        precio = sc.nextInt();
                        control.actionPerformed(new ActionEvent(control, 3, "modificar"));
                        break;
                    case 4:
                        System.out.println("mete matricula para cnsulta");
                        matricula = sc.nextLine();
                        control.actionPerformed(new ActionEvent(control, 4, "consultar"));
                        break;
                    case 5:
                        control.actionPerformed(new ActionEvent(control, 5, "cerrar"));
                        System.exit(0);
                        break;
                }
            }
        }
    }

    @Override
    public String getMatricula() {
        return matricula;
    }

    @Override
    public int getEslora() {
        return eslora;
    }
    
    public String getViejaMatricula() {
        return viejamatricula;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    

    @Override
    public void setControlador(ControladorBarco obj) {
        control = obj;
    }

    @Override
    public Barco setDatosBarco(String matricula, int eslora, int precio) {
        Barco b = new Barco(matricula, eslora, precio);
        return b;
    }
 
    public void iniciarPrograma() {
        muestraMenu();
    }
}
