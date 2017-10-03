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
public class Barco {

    
    //atributos
    private int eslora;
    private int ano;

    
    
    public Barco(int eslora, int ano) {
        this.eslora = eslora;
        this.ano = ano;
    }
    
    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int calcularAlquiler(){
        
        return 2;
    }
    
    @Override
    public String toString() {
        return "Barco{" + "eslora=" + eslora + ", ano=" + ano + '}';
    }
}
