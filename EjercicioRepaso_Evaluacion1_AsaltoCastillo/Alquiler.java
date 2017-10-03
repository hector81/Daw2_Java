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
public class Alquiler {
    //ATRIBUTOS
    private int dias;
    private Cliente cliente;
    private Barco barco;
    
     public Alquiler(int dias, Cliente cliente, Barco barco) {
        this.dias = dias;
        this.cliente = cliente;
        this.barco = barco;
    }
     
    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Barco getBarco() {
        return barco;
    }

    
    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
    public int calcularAlquiler(){
        
        return this.getDias()*10*barco.getEslora();
    }

    @Override
    public String toString() {
        return "Alquiler{" + "dias=" + dias + ", cliente=" + cliente + ", barco=" + barco + '}';
    }
   
}
