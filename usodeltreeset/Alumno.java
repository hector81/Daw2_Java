package usodeltreeset;
import java.util.Iterator;
import java.util.Scanner;
public class Alumno implements Comparable {
    private int nExpediente;
    private String nombre, apellido;
    private int edad;
    private double nota;
    private long telefono;

    public Alumno(int nExpediente, String nombre, double nota, long telefono) {
        this.nExpediente = nExpediente;
        this.nombre = nombre;
        this.nota = nota;
        this.telefono = telefono;
    }

    public Alumno() {}
    public double getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }    
    
    public int getnExpediente() {
        return nExpediente;
    }

    public void setnExpediente(int nExpediente) {
        this.nExpediente = nExpediente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Numero Expediente: " + nExpediente + "Nombre: " + nombre + "Nota: " + nota + "Telefono: " + telefono;
    }

    @Override
    public boolean equals(Object obj) {//los objetos alumno se podrán comparar por si metes uno igual. REPASO
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.nExpediente != other.nExpediente) {
            return false;
        }
        return true;
    }
    

    @Override
    public int compareTo(Object o) { // Yujuuuu he establecido el "orden natural" de Alumno
        int aux;
        Alumno alumno = (Alumno)o;
        aux = this.getnExpediente()-alumno.getnExpediente();
        return aux;        
    }
    
    
    
    public int pedirOpcion() {        
        // Pedir un numero entre 1 y 4
        Scanner t = new Scanner(System.in);
        int x;
        System.out.println("Seleccione la opción que desee");
        x=t.nextInt();
        return x;
    }
    
    
    
    
    
}
