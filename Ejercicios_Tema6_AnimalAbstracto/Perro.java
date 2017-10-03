/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema6_AnimalAbstracto;

/**
 *
 * @author user
 */
public class Perro extends Canino implements Mascota {
    //constructor
    public Perro(String foto, String tipo_comida, String localizacion, String tamanio) {
        super(foto, tipo_comida, localizacion, tamanio);
    }

    //metodos sobreescritos e implementados
    @Override
    public boolean hacerRuido() {
        if(rugir() == "Arrrr"){
            return true;
        } 
        else {
            return false;
        }
    }

    @Override
    public String comer() {
        return getTipo_comida();
    }

    @Override
    public String rugir() {
        String rugir = "Arrrr";
        return rugir; 
    }

    @Override
    public void jugar() {
        System.out.println("El perro juega");
    }

    @Override
    public void vacunar() {
        System.out.println("El perro se vacuna");
    }
    
    //toString sobreescrito

    @Override
    public String toString() {
        return "El perro hace " + rugir() + " y el perro come " + comer();
    }
    
}
