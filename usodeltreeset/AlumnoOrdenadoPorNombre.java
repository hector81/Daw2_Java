package usodeltreeset;
import java.util.Comparator;
public class AlumnoOrdenadoPorNombre implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Alumno a1 = (Alumno)o1;
        Alumno a2 = (Alumno)o2;
        int aux;
        aux=a1.getNombre().compareTo(a2.getNombre());
        return aux;
    }
    //como es un string, comparar los dos, con el compare to, no restándolos.
    
}
