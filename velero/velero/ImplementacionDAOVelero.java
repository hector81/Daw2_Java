
package velero.velero;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ImplementacionDAOVelero implements InterfaceDAO {
    private Connection con;
    
    public ImplementacionDAOVelero() {
        con = ConexiónBD.getConexion();
    }
    
    @Override
    public boolean alta(Object obj) {
        try {
            Velero v = (Velero) obj;
            Statement st = con.createStatement();            
            
            if(comprobarObjeto(v) == false){
                if(comprobarMatricula(v) == true){
                    st.executeUpdate("insert into barcos.velero values ('"+v.getMatricula()+"','"+v.getMaterialConstruccion()+"','"+v.getDescripcion()+"',"+v.getEslora()+","+v.getManga()+","+v.getPuntal()+","+v.getMaxTripulacion()+","+v.getAño()+","+v.getNumMas()+",'"+v.getClaseVelero()+"')");
                    return true;
                }else{
                    JOptionPane.showMessageDialog(null, "No se admiten letras en la matricula", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            }else{
                JOptionPane.showMessageDialog(null, "Ya existe un velero con matricula "+v.getMatricula(), "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (SQLException ex) {
            System.out.println("Fallo en la inserción");
            return false;
        }
    }

    @Override
    public boolean baja(Object obj) {
        try {          
            Velero v = (Velero) obj;
            Statement st = con.createStatement();
            
            if(comprobarObjeto(v) == true){
                st.executeUpdate("delete from barcos.velero where matricula = "+v.getMatricula()); 
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }
    }

    @Override
    public boolean modificacion(Object viejo, Object nuevo) {
        try {
            Velero vViejo = (Velero) viejo;
            Velero vNuevo = (Velero) nuevo;
            Statement st = con.createStatement();
            
            if(comprobarObjeto(vViejo) == true){
                st.executeUpdate("update barcos.velero set matricula = '"+vNuevo.getMatricula()+"', materialConstrucion = '"+vNuevo.getMaterialConstruccion()+"', descripcion='"+vNuevo.getDescripcion()+"', eslora="+vNuevo.getEslora()+", manga="+vNuevo.getManga()+", puntal="+vNuevo.getPuntal()+", maxTripulacion="+vNuevo.getMaxTripulacion()+", año = "+vNuevo.getAño()+", numMas="+vNuevo.getNumMas()+", claseVelero='"+vNuevo.getClaseVelero()+"' where matricula = '"+vViejo.getMatricula()+"'");
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }
    }

    @Override
    public Object consulta(Object obj) {
        try {            
            Velero v = (Velero) obj;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from barcos.velero where matricula = '"+v.getMatricula()+"'");
            
            if(comprobarObjeto(v) == true){             
                while(rs.next()){
                    v.setMatricula(rs.getString(1));
                    v.setMaterialConstruccion(rs.getString(2));
                    v.setDescripcion(rs.getString(3));
                    v.setEslora(rs.getInt(4));
                    v.setManga(rs.getInt(5));
                    v.setPuntal(rs.getInt(6));
                    v.setMaxTripulacion(rs.getInt(7));
                    v.setAño(rs.getInt(8));
                    v.setNumMas(9);
                    v.setClaseVelero(rs.getString(10));
                }
                JOptionPane.showMessageDialog(null, v);
                return v;
            }else{
                JOptionPane.showMessageDialog(null, "No existe un velero con matricula "+v.getMatricula(), "Error", JOptionPane.ERROR_MESSAGE);
                return v;
            }
            
        } catch (SQLException ex) {
            System.out.println("No existe");
            return null;
        }
    }
    
    public boolean comprobarObjeto(Object obj){
        Velero v = (Velero) obj;
        boolean comprobar = true;
        try{
            Statement st = con.createStatement();
            if(st.executeQuery("select * from barcos.velero where matricula = '"+v.getMatricula()+"'").first()){
                comprobar = true;
            }else{
                comprobar = false;
            }
        }catch (SQLException e){
            System.out.println("Fallo");
        }
        return comprobar;
    }
    
    public boolean comprobarMatricula(Object obj) {
        Velero v = (Velero) obj;
        boolean comprobar = true;
        String matricula = v.getMatricula();
        
        for(int i=0;i<matricula.length();i++){
            if(matricula.charAt(i)<'9' && matricula.charAt(i)>'0'){
                comprobar = true;
            }else{
                comprobar = false;
                break;
            }
        }
        return comprobar;
    }
}
