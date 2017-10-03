/*
Desarrollar una clase Titular

- Atributos nombre, apellidos y edad
- setter y getters
- Constructor completo
- Método toString completo
 */
package Ejercicios_Tema5_Herencia_CuentasBancarias;

/**
 *
 * @author Héctor García
 */
public class Titular {
    //ATRIBUTOS
    private String nombre;
    private String apellidos;
    private int edad;
    
    //Constructor completo
    public Titular(String nombre ,String apellidos, int edad){
    	this.nombre = nombre;
    	this.apellidos = apellidos;
    	this.edad = edad;
    }
    
    //Métodos getters 
    public String getNombre(){
        return this.nombre;
    }//fin metodo
    
    public String getApellidos(){
        return this.apellidos;
    }//fin metodo
    
    public int getEdad(){
        return this.edad;
    }//fin metodo
    
    
    //Métodos setters 
    public void setNombre(String nombre){
        this.nombre = nombre;
    }//fin metodo
    
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }//fin metodo
    
    public void setEdad(int apellidos){
        this.edad = apellidos;
    }//fin metodo
    
    //Método toString completo
    @Override // SOBREESCRIBE OBJECT
    public String toString(){
        return "El nombre es " + this.nombre + " y los apellidos son " + this.apellidos + 
                " y su edad es " + this.edad;
    }//fin metodo
    
}//fin clase
