
package velero.velero;

public interface InterfaceDAO {
    public boolean alta(Object obj);
    public boolean baja(Object obj);
    public boolean modificacion(Object viejo, Object nuevo);
    public Object consulta(Object obj);
}
