package usodeltreeset;
import java.util.Comparator;

public class AlumnoMuestraPorTlf implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        long aux;
        int r;
        Alumno a=(Alumno)o1;
        Alumno b=(Alumno)o2;
        aux=a.getTelefono()-b.getTelefono();
        r=(int)aux;
        return r;
        
    }
    
}
