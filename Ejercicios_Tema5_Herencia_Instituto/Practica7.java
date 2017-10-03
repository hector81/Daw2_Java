package Ejercicios_Tema5_Herencia_Instituto;
/*
Desarrollar una clase llamada Practica7 que en su método main: 
 Cree e inicialice tres Asignaturas.
 Cree un Alumno con las tres Asignaturas.
 Cree un Profesor que le ponga calificaciones al alumno y muestre por pantalla la media 
del Alumno. 
*/
public class Practica7 {
    //main

    public static void main(String[] args) {
        //creamos e incializamos 3 asignaturas
        Asignatura programacion = new Asignatura(1);
        Asignatura baseDatos = new Asignatura(2);
        Asignatura lenguajeMarcas = new Asignatura(3);

        //Cree un Alumno con las tres Asignaturas.
        Alumno hector = new Alumno(3, "Hector Garcia");
        hector.setAsignatura1(programacion);
        hector.setAsignatura1(baseDatos);
        hector.setAsignatura1(lenguajeMarcas);

        //Cree un Profesor que le ponga calificaciones al alumno y muestre por pantalla la media 
        //del Alumno. //probar getCalificacion//hereda es // tiene un
        Profesor profe = new Profesor();
        profe.ponerNotas(hector);
        System.out.println("La media del alumno es " + profe.calcularMedia(hector));
    }
}
