/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_BarcoSQL_Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class ImplementacionDaoBarcoSql implements InterfaceDaoBarco {
    //atributos
    private Connection conexion;
    private Statement st;

    public ImplementacionDaoBarcoSql() {
        try {
            this.conexion = ConexionBarco.getConnection();
            this.st = conexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ImplementacionDaoBarcoSql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    @Override
    public boolean darAlta(Object barco) {
        boolean comprobar = false;
        Barco aux = (Barco) barco; 
        if(comprobar(aux)){
            try {
                st.executeUpdate("INSERT INTO Barco VALUES(" + aux.getMatricula() + ", "
                        + aux.getEslora() + ", " + aux.getPrecio() + ";");
                comprobar = true;
            } catch (SQLException ex) {
                Logger.getLogger(ImplementacionDaoBarcoSql.class.getName()).log(Level.SEVERE, null, ex);
                comprobar = false;
            }
        }
        return comprobar;
    }

    @Override
    public boolean darBaja(Object barco) {
        boolean comprobar = false;
        Barco aux = (Barco) barco;
        
        try {          
            st.executeUpdate("DELETE FROM Barco WHERE Barco.matricula =" + aux.getMatricula() +  ";");
            comprobar = true;
        } catch (SQLException ex) {
            Logger.getLogger(ImplementacionDaoBarcoSql.class.getName()).log(Level.SEVERE, null, ex);
            comprobar = false;
        }
        return comprobar;
    }

    @Override
    public boolean darModificar(Object barcoNuevo) {
        boolean comprobar = false;
        Barco aux = (Barco) barcoNuevo;
        try {
            st.executeUpdate("UPDATE Barco SET matricula =" + aux.getMatricula() + ", eslora ="
                    + aux.getEslora() + ",precio= " + aux.getPrecio() + ";");
            comprobar = true;
        } catch (SQLException ex) {
            Logger.getLogger(ImplementacionDaoBarcoSql.class.getName()).log(Level.SEVERE, null, ex);
            comprobar = false;
        }
        return comprobar;
    }

    @Override
    public Object darConsulta(Object barco) {
        Barco aux = (Barco) barco;
        try {

            ResultSet rs = st.executeQuery("SELECT * FROM barcos WHERE barcos.matricula" + aux.getMatricula());
            while (rs.next()) {
                aux.setMatricula(rs.getString(1));
                aux.setEslora(rs.getInt(2));
                aux.setPrecio(rs.getInt(3));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ImplementacionDaoBarcoSql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return aux;
    }

    @Override
    public boolean comprobar(Object barco) {
        Barco aux= (Barco)barco;
        boolean comprobar= false;
        try {
            st.executeQuery("select * from barcos where barcos.matricula =" + aux.getMatricula() + ";").first();
            comprobar = true;
        } catch (SQLException ex) {
            Logger.getLogger(ImplementacionDaoBarcoSql.class.getName()).log(Level.SEVERE, null, ex);
            comprobar = false;
        }
        return comprobar;
    }

  

   
    
}

   
