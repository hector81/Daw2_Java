/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema10_FlujosStream;

/**
 *
 * @author Alumno 10
 */
public class RunLeerYSumarNumerosFicheros {

    public static void main(String[] args) {
        int dato;
        LeerYSumarNumerosFicheros n;

        n = new LeerYSumarNumerosFicheros();
        n.abrirFichero();
        dato = n.leerDatos();
        System.out.println("La suma es: " + dato);
    }
}
