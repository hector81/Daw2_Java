/*
PATRON SINGLETON
Craer clae conexion
Usarlos como el ejemplo
Invocamos donde lo necesitemos, en esta caso ej JFRAME
Incluir fiero configuracion.ini
//  http://www.arquitecturajava.com/ejemplo-de-java-singleton-patrones-classloaders/
 */
package Ejercicios_Tema11_Conexion;

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
 * @author Hector Garcia
 */
public class ConexionBaseDatos {
    //atributos
    private String driver;
    private String BD;
    private String ipMaquina;
    private int puerto;
    private String usuario;
    private String password;
    //para la conexion
    private static Connection conexion;
    //para leer archivo
    private FileReader fileLeer;
    private BufferedReader br;

    //constructor privado para que no sea posible que acceda todo el mundo
    //esta vacio porque le pasaremos los datos leidos de un archivo
    private ConexionBaseDatos() {
        String aux;
        //que lea los datos y pase lo necesario para conectar
        try {
            String linea;
            /// "E:\\Users\\VESPERTINO\\Documents\\NetBeansProjects\\Hector_Proyecto1\\src\\Ejercicios_Tema11_Conexion\\configuracion.ini";
            fileLeer = new FileReader("configuracion.ini");
            br = new BufferedReader(fileLeer);
            linea = br.readLine();
         
            int punto;
            while(linea != null){//mientras haya lineas                
                punto = String.valueOf(linea).indexOf("=");//ponemos el punto de ruptura
                if(linea.substring(0, punto-1) == "driver"){//si antes del punto de ruptura es igual a X, cogemos lo que hay despues del punto
                    this.driver = String.valueOf(linea).substring(punto + 1, String.valueOf(linea).length());
                }else if (linea.substring(0, punto-1) == "."){//si antes del punto de ruptura es igual a X, cogemos lo que hay despues del punto
                    this.BD = String.valueOf(linea).substring(punto + 1, String.valueOf(linea).length());
                }else if (linea.substring(0, punto-1) == "ipMaquina"){//si antes del punto de ruptura es igual a X, cogemos lo que hay despues del punto
                    this.ipMaquina = String.valueOf(linea).substring(punto + 1, String.valueOf(linea).length());
                }else if (linea.substring(0, punto-1) == "puerto"){//este lo pasamos a int //si antes del punto de ruptura es igual a X, cogemos lo que hay despues del punto
                    this.puerto = Integer.parseInt(String.valueOf(linea).substring(punto + 1, String.valueOf(linea).length()));
                }else if (linea.substring(0, punto-1) == "usuario"){//si antes del punto de ruptura es igual a X, cogemos lo que hay despues del punto
                    this.usuario = String.valueOf(linea).substring(punto + 1, String.valueOf(linea).length());
                }else if (linea.substring(0, punto-1) == "password"){//si antes del punto de ruptura es igual a X, cogemos lo que hay despues del punto
                    this.password = String.valueOf(linea).substring(punto + 1, String.valueOf(linea).length());
                }  
            }//fin while
            
            //abrimos el driver
            Class.forName("com.mysql.jdbc.Driver");
            //aux = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull";
            aux = "" + this. driver + ":" + this.BD + "://" + this.ipMaquina + ":" + this.puerto + "/mysql?zeroDateTimeBehavior=convertToNull"  ;
            conexion = DriverManager.getConnection(aux, this.usuario ,this.password);
           
        } catch (FileNotFoundException ex) {//archivo no encontrado
            Logger.getLogger(ConexionBaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {//si linea no existe
            Logger.getLogger(ConexionBaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {//problemas con el driver
            Logger.getLogger(ConexionBaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {//problemas con el sql
            Logger.getLogger(ConexionBaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileLeer.close();
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(ConexionBaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }

    public static void closeConexion(){
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //metodo getConection que devuelve la conexion
    public static Connection getConnection() {
        //primero mira que exista la conexion
        if (conexion == null) {
           new ConexionBaseDatos();
        }//si la conexion existe ya, entonces directamente nos devuelve el objeto sin necesidad de crear uno nuevo
        return conexion;
    }
   

}//fin clase