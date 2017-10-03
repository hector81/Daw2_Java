package usodeltreeset;
import java.util.Iterator;
import java.util.TreeSet;
public class ListaAlumnos {
    private TreeSet lista;
    
    public ListaAlumnos() {
        lista = new TreeSet();
        
    }
    
    public boolean guardaAlumno(Alumno a) {
        if (!lista.add(a)) {
            System.out.println("Alumno " + a.toString() +" esta repetido");
            return false;
        }
        return true;        
    }
    
    public void muestraPorNumeroDeExpediente() {
        Iterator i = lista.iterator();
        // Mostraremos listado haciendo uso del "orden natural"
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
    //ahora mostraremos por orden no natural
    
    
    
    
}
