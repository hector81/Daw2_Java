/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema6_EjemplosInterfaces;

/**
 *
 * @author user
 */
public class Test {
    public static void main(String[] args) {
        Perro animalPerro = new Perro("Foto","carne","Asia","grande");        
        
        
        System.out.println("El perro come " + animalPerro.comer());
        animalPerro.dormir();
        animalPerro.vacunar();
        animalPerro.jugar();
        animalPerro.comer();
        System.out.println("¿El perro hace arrr cuuando ruge ? ");
        animalPerro.rugir();
        
    }//fin main    
}//fin clase
