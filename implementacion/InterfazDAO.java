package implementacion;

import Barco.Barco;


public interface InterfazDAO {
    
    //crud
    public abstract boolean añadir(Object b);
    public abstract boolean modificaBarco(Object viejo, Object nuevo);
    public abstract boolean borrar(Object b);
    public abstract Object consulta(Object b);
    public abstract Object dameAnterior(Object b);
    public abstract Object dameSiguiente(Object b);
    public abstract void cargarDatos(String n);
    public abstract void guardarDatos(String sdf);
   
    
}
