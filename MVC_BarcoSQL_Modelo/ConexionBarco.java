/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_BarcoSQL_Modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class ConexionBarco {
    //atributos
    private String driver;
    private String BD;
    private String ipMaquina;
    private int puerto;
    private String usuario;
    private String password;
    
    private static Connection conexion;
    
    private BufferedReader br;
    private FileReader fr;
    
    public ConexionBarco(){
        String linea;
        
        try {
            fr = new FileReader("configuracion.ini");
            br = new BufferedReader(fr);
            linea = br.readLine();
            while(linea != null){
                int punto;
                punto = linea.valueOf(linea).indexOf("=");
                if(linea.substring(0,punto-1).equals("driver")){
                    this.driver = linea.substring(punto+1, linea.length()-1);
                }else if(linea.substring(0,punto-1).equals("BD")){
                    this.BD = linea.substring(punto+1, linea.length()-1);
                }else if(linea.substring(0,punto-1).equals("ipMaquina")){
                    this.ipMaquina = linea.substring(punto+1, linea.length()-1);
                }else if(linea.substring(0,punto-1).equals("puerto")){
                    this.puerto = Integer.parseInt(linea.substring(punto+1, linea.length()-1));
                }else if(linea.substring(0,punto-1).equals("usuario")){
                    this.usuario = linea.substring(punto+1, linea.length()-1);
                }else if(linea.substring(0,punto-1).equals("password")){
                    this.password = linea.substring(punto+1, linea.length()-1);
                }
            
            }
            Class.forName("com.mysql.jdbc.Driver");
            String aux = "" + this. driver + ":" + this.BD + "://" + this.ipMaquina + ":" + this.puerto + "/mysql?zeroDateTimeBehavior=convertToNull"  ;
            conexion = DriverManager.getConnection(aux, this.usuario ,this.password);       
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConexionBarco.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ConexionBarco.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionBarco.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBarco.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(ConexionBarco.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    //metodos
    public static Connection getConnection(){
        if(conexion == null){
            new ConexionBarco();
        } 
            return conexion;      
    }
    
    public static void cerrarConexion(){
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBarco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
