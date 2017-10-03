/*
Dada la aplicación de “Alquiler de Amarres” implementado en el tema de

Herencia y haciendo uso de las clases ObjectInputStream y

ObjectOutputStream, realizar ABMC usando el patrón DAO explicado en

clase de la clase Barco teniendo en cuenta los siguientes requerimientos:

 Añadiremos aproximadamente 5-7 nuevos atributos para la clase Barco.

 Nos crearemos una Interfaz (llamada InterfazDAO) con las operaciones

alta, baja, modificación, consulta, dameSiguiente, dameAnterior, car-
garDatos y salvarDatos

 Implementaremos la interfaz (ImplementacionDAOObjectStream) creán-
donos además la colección que recoja todos los Barcos.

 Realizaremos un GUI similar a la realizada en el ejercicios de Clientes

pero esta vez usando un JinternaFrame dentro de una aplicación MDI

 La aplicación nada mas abrirse cargará los registros del fichero de

Barcos en una colección (método cargarDatos)

 Cuando el usuario cierre la ventana de gestión de Clientes se volcará

la información resultante en un fichero (método salvarDatos)
 */
package Ejercicios_Tema10_Barco_Modelo;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author VESPERTINO
 */
public class Barco implements Serializable{
    //ATRIBUTOS
    private String matricula;
    private int esloraMetros ;
    private int yearFabricacion;
    private double precio;
    private String nombre;
    private int mangaMetros;
    
    //constructor completo
    public Barco(String matricula, int esloraMetros, int yearFabricacion, double precio, String nombre, int mangaMetros) {
        this.matricula = matricula;
        this.esloraMetros = esloraMetros;
        this.yearFabricacion = yearFabricacion;
        this.precio = precio;
        this.nombre = nombre;
        this.mangaMetros = mangaMetros;
    }
    
    //constructor vacio
    public Barco(String matricula) {
        this.matricula = matricula;
    }
    
    //Métodos getters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEsloraMetros() {
        return esloraMetros;
    }

    public void setEsloraMetros(int esloraMetros) {
        this.esloraMetros = esloraMetros;
    }

    public int getYearFabricacion() {
        return yearFabricacion;
    }

    public void setYearFabricacion(int yearFabricacion) {
        this.yearFabricacion = yearFabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMangaMetros() {
        return mangaMetros;
    }

    public void setMangaMetros(int mangaMetros) {
        this.mangaMetros = mangaMetros;
    }
    
    
    
    //Método toString que hereda directamente de object

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", esloraMetros=" + esloraMetros + ", yearFabricacion=" + yearFabricacion + ", precio=" + precio + ", nombre=" + nombre + ", mangaMetros=" + mangaMetros + '}';
    }
    
    //Metod equals

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Barco other = (Barco) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return true;
    }
    
    
    
    
}//fin clase