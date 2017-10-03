/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema5_Herencia_CuentasBancarias;

/**
 *
 * @author VESPERTINO
 */
public class Run2 {
    public static void main(String[] args) {
        Titular t = new Titular("David", "Perez", 42);
        NumeroCuenta nc = new NumeroCuenta(1234, 2222, 11, 1234324323);
        
        CuentaAhorro ca = new CuentaAhorro(t, nc, 1000, 6.5);
        
        System.out.println("Saldo: " + ca.getSaldo());
        ca.calcularInteres();
        System.out.println("Saldo: " + ca.getSaldo());
        
        System.out.println("Saldo: " + ca.toString());
        
        System.out.println("El numero de cuenta es correcto: " + ca.equals(ca));
        
        
    }
    
}
