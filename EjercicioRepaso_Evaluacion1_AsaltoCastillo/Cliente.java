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
public class Cliente {
//ATRIBUTOS 
    private String nombre;
    private String dni;
    
    //Constructor completo
    public Cliente(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }//fin constructor
    //metodos getters
    public String getNombre() {
        return nombre;
    }
    
    public String getDni() {
        return dni;
    }
    //metodos setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setDni(String dni) {
            this.dni = dni;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }

    

    
    
}//fin clase