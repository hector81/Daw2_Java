package Ejercicios_Tema5_Herencia_Instituto;

import Ejercicios_Tema3_Bucles.Aleatorios;

/*
Desarrollar una clase Profesor que:
 Tenga un método ponerNotas que recibe un parámetro de tipo Alumno y que no devuelve nada. 
Pondrá una calificación aleatorio a cada una de las asignaturas del alumno.
 Tenga un método calcularMedia que recibe un parámetro de tipo Alumno y devuelve un 
double.
 */
public class Profesor {
	//METODOS
	//método ponerNotas que recibe un parámetro de tipo Alumno y que no devuelve nada. 
	//Pondrá una calificación aleatorio a cada una de las asignaturas del alumno.
	public void ponerNotas(Alumno a){
        //creamos un objeto aleatorio instanciando el metodo Aleatorios del paquete Ejercicios_Tema3_Bucles
		//Aleatorios notaAleatorio = new Aleatorios(0,10);
		//encadenamos metodos. Cojo la asignatura y enviamos la calificacion con random Aleatorios
		//a.getAsignatura1().setCalificacion(notaAleatorio.dameAleatorio(0, 10));
                a.getAsignatura1().setCalificacion((int)(Math.random()*10 + 1));
		a.getAsignatura2().setCalificacion((int)(Math.random()*10 + 1));
		a.getAsignatura3().setCalificacion((int)(Math.random()*10 + 1));
	}
	//método calcularMedia que recibe un parámetro de tipo Alumno y devuelve un 
	//double.
	public double calcularMedia(Alumno a){
		double nota1 = (double)a.getAsignatura1().getCalificacion();
		double nota2 = (double)a.getAsignatura2().getCalificacion();
		double nota3 = (double)a.getAsignatura3().getCalificacion();
		double media = (nota1 + nota2 + nota3) / 3;
		return media;	
	}
}
