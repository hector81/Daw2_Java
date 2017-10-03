/*
Dada la aplicación de “Alquiler de Amarres” implementado en el tema de Ficheros y

haciendo uso de las clases JDBC, realizar ABMC de la clase Velero teniendo en cuenta

los siguientes requerimientos:

 Añadiremos aproximadamente 3 nuevos atributos para la clase Velero

 Realizaremos un JInternalFrame para recoger o visualizar los atributos de Velero

 Existirán botones en una barra de herramientas para hacer operaciones de Altas,

bajas, modificaciones y consultas sobre esa colección

 Se debe implementar el patrón DAO visto en clase y se dejará sin implementar el

método cargaDatos y salvaDatos ya NO SE DEBE UTILIZAR UNA COLECCIÓN internamente

(las operaciones se harán con instrucciones SQL)

 La SQL de creación de la tabla será la siguiente:

CREATE TABLE "Velero"

( "matricula" VARCHAR2(25),

"materialConstruccion" VARCHAR2(25),

"descripcion" VARCHAR2(25),

"eslora" NUMBER,

"manga" NUMBER,

"puntal" NUMBER,

"maxTripulacion" NUMBER,

"año" NUMBER,

"numMas" NUMBER,

"claseVelero" VARCHAR2(25) ) ;

Un año es bisiesto si es divisible entre 4, a menos que sea divisible entre 100. Sin embargo, si un año es divisible entre 100 y además es divisible entre 400, también resulta bisiesto. Obviamente, esto elimina los años finiseculares (últimos de cada siglo, que ha de terminar en 00) divisibles sólo entre 4 y entre 100
 */
package Ejercicios_Tema11_Conexion;

import java.util.Objects;

/**
 *
 * @author VESPERTINO
 */
public class Veleros {
    //ATRIBUTOS
    private String matricula;
    private String materialConstruccion;
    private String descripcion;
    private int eslora;
    private int manga;
    private int puntal;
    private int maxTripulacion;
    private int año;
    private int numMas;
          
    //CONSTRUCTOR COMPLETO
    public Veleros(String matricula, String materialConstruccion, String descripcion, int eslora, int manga, int puntal, int maxTripulacion, int año, int numMas) {
        this.matricula = matricula;
        this.materialConstruccion = materialConstruccion;
        this.descripcion = descripcion;
        this.eslora = eslora;
        this.manga = manga;
        this.puntal = puntal;
        this.maxTripulacion = maxTripulacion;
        this.año = año;
        this.numMas = numMas;
    }

    public Veleros(String matricula) {
        this.matricula = matricula;
    }
    
    //METODOS GETTERS AND ASETTERS
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMaterialConstruccion() {
        return materialConstruccion;
    }

    public void setMaterialConstruccion(String materialConstruccion) {
        this.materialConstruccion = materialConstruccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getManga() {
        return manga;
    }

    public void setManga(int manga) {
        this.manga = manga;
    }

    public int getPuntal() {
        return puntal;
    }

    public void setPuntal(int puntal) {
        this.puntal = puntal;
    }

    public int getMaxTripulacion() {
        return maxTripulacion;
    }

    public void setMaxTripulacion(int maxTripulacion) {
        this.maxTripulacion = maxTripulacion;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getNumMas() {
        return numMas;
    }

    public void setNumMas(int numMas) {
        this.numMas = numMas;
    }

  

    //to string

    @Override
    public String toString() {
        return "Veleros{" + "matricula=" + matricula + ", materialConstruccion=" + materialConstruccion + ", descripcion=" + descripcion + ", eslora=" + eslora + ", manga=" + manga + ", puntal=" + puntal + ", maxTripulacion=" + maxTripulacion + ", a\u00f1o=" + año + ", numMas=" + numMas + ", claseVelero=" + '}';
    }
    
    
    //equals

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Veleros other = (Veleros) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return true;
    }
    
    
}
