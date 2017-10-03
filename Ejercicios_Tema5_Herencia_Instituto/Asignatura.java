/*
Desarrollar las clases Asignatura, Alumno, Profesor y Practica7 siguiendo los requerimientos
 que 
se indican a continuación:
Desarrollar una clase llamada Asignatura:
 Tenga dos atributos private de tipo int (el identificador) y de tipo double (la 
calificación).
 Tenga un constructor con un parámetro de tipo int.
 Tenga un getter para cada uno de los atributos.
 Tenga un setter para la calificación.
 */
package Ejercicios_Tema5_Herencia_Instituto;

/**
 *
 * @author H�ctor Garc�a
 */
public class Asignatura {
    //ATRIBUTOS
	private int identificador;
	private int calificacion;
	
	//constructor con un parámetro de tipo int. lee pasamos el parametro de id
	public Asignatura(int identificador){
                super(); 
		this.identificador = identificador;
                this.calificacion = calificacion;
	}
	
	//m�todos getters y setters
	//m�todos getters 
	public int getIdentificador(){
        return this.identificador;
    }//fin metodo
	
	public int getCalificacion(){
        return this.identificador;
    }//fin metodo
    
    //metodos setters
    public void setCalificacion(int calificacion){
        this.calificacion = calificacion;
    }//fin metodo
}//fin clase
