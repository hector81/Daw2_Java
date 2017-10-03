/*
Generamos clase cliente 
 */
package Ejercicios_Tema10_DataInputOutput;

/**
 *
 * @author Hector Garcia
 */
public class Cliente {

    //ATRIBUTOS 
    private String nombre;
    private String apellidos;
    private int edad;
    private long dni;

    //Constructor completo
    public Cliente(String nombre, String apellidos, int edad, long dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;

    }//fin constructor

    //constructor  vacio
    public Cliente() {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;

    }//fin constructor

    //metodos getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", dni=" + dni + '}';
    }

}//fin clase
