/*
Generamos clase cliente
Alt+Insertar 
 */
package Ejercicios_Tema5_Herencia_GestionAmarres;

/**
 *
 * @author Hector Garcia
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
    public boolean equals(Object obj) {
        Cliente aux = (Cliente)obj;
        
        if(aux.getDni() == this.getDni()){
            return true;
        }else {
            return false;
        }
    }

    
    
}//fin clase
