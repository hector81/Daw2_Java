/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoDavid;

/**
 *
 * @author VESPERTINO
 */
public interface EjercicicioDavid_Dao {
    public abstract int consultarPorCaracteres(char c , int numeroLineas);
    
    public abstract int consultarPorNumeroPalabras(int numeroLineas);
    
    public abstract boolean alta();
    
    public abstract boolean borrar();
    
    public abstract boolean modificar();
    
    public abstract boolean consultar();
}
