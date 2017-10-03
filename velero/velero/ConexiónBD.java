
package velero.velero;

import java.sql.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexiónBD {
    private String driver, bd, maquina, puerto, user, pass;
    private static Connection con;

    public ConexiónBD() {
        String tira;
        try {
            BufferedReader br = new BufferedReader(new FileReader("Configuracion.ini"));
            String texto = br.readLine();
            int num;
            String id, palabra;
            while(texto != null){
                num = texto.indexOf("=");
                id = texto.substring(0, num);
                palabra = texto.substring(num + 1, texto.length());
                palabra.trim();
                
                if("driver".equals(id)){                   
                    driver = palabra;
                }
                if("bd".equals(id)){
                    bd = palabra;
                }
                if("maquina".equals(id)){
                    maquina = palabra;
                }
                if("puerto".equals(id)){
                    puerto = palabra;
                }
                if("user".equals(id)){
                    user = palabra;
                }
                if("pass".equals(id)){
                    pass = palabra;
                }
                
                texto = br.readLine();
            }
            
            Class.forName(driver);
            tira = "jdbc:"+bd+"://"+maquina+":"+puerto+"/mysql?zeroDateTimeBehavior=convertToNull";
            con = DriverManager.getConnection(tira, user, pass);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConexiónBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ConexiónBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexiónBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog (null, "No existe conexión con la base de datos", "Error", JOptionPane.WARNING_MESSAGE);
        }
        
    }
    
    
    public static Connection getConexion() {
        if(con == null){
            new ConexiónBD();
        } 
        return con;
    }

    public String getDriver() {
        return driver;
    }

    public String getBd() {
        return bd;
    }

    public String getMaquina() {
        return maquina;
    }

    public String getPuerto() {
        return puerto;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public static Connection getCon() {
        return con;
    }
}
