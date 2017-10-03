package Ejercicios_Tema5_Herencia_Instituto;
/*
Desarrollar una clase llamada Alumno que:
 Tenga los atributos private de tipo int (el número de expediente), el tipo String (nombre 
completo del alumno) y tres asignaturas.
 Tenga un constructor con un parámetro de tipo int.
 Tenga un constructor con un parámetro de tipo int y un String
 Tenga un getter para cada uno de los atributos.
 Tenga un setter para el nombre del alumno
 Tenga un setter para cada asignatura
 */
public class Alumno {
    //ATRIBUTOS

    private int numeroExpediente;
    private String nombreAlumno;
    private Asignatura asignatura1;
    private Asignatura asignatura2;
    private Asignatura asignatura3;

    //CONSTRUCTORES
    //Tenga un constructor con un parámetro de tipo int.
    public Alumno(int pNumeroExpediente) {
        numeroExpediente = pNumeroExpediente;
    }
    //Tenga un constructor con un parámetro de tipo int y un String

    public Alumno(int pNumeroExpediente, String pNombreAlumno) {
        numeroExpediente = pNumeroExpediente;
        nombreAlumno = pNombreAlumno;
    }
    //M�TODOS GETTERS AND SETTERS

    public int getNumeroExpediente() {
        return numeroExpediente;
    }

    public void setNumeroExpediente(int pNumeroExpediente) {
        this.numeroExpediente = pNumeroExpediente;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String pNombreAlumno) {
        this.nombreAlumno = pNombreAlumno;
    }

    public Asignatura getAsignatura1() {
        return asignatura1;
    }

    public Asignatura setAsignatura1(Asignatura asignatura1) {
        return asignatura1;
    }

    public Asignatura getAsignatura2() {
        return asignatura2;
    }

    public Asignatura setAsignatura2(Asignatura asignatura2) {
        return asignatura2;
    }

    public Asignatura getAsignatura3() {
        return asignatura3;
    }

    public Asignatura setAsignatura3(Asignatura asignatura3) {
        return asignatura3;
    }
}
