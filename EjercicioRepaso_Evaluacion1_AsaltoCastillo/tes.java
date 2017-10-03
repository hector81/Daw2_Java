/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioRepaso_Evaluacion1_AsaltoCastillo;

/**
 *
 * @author user
 */
public class tes {
    public static void main(String[] args) {
        Barco barco1 = new Barco(15,1987);
        Cliente cliente1 = new Cliente("isaac","w332233");
        Alquiler alquiler1 = new Alquiler(6,cliente1,barco1);
        
        System.out.println(cliente1.toString());
        System.out.println(barco1.toString());
        System.out.println(alquiler1.toString());
    }
}
