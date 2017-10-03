package usodeltreeset;
import java.util.Comparator;
public class AlumnoMuestraPorNota implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        int aux;
        double nota;
        Alumno a1 = (Alumno) o1;
        Alumno a2= (Alumno) o2;
        nota=a1.getNota()-a2.getNota();
        aux=(int) nota;
        return aux;
    }
    
}
