/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema11_Conexion;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VESPERTINO
 */
public class ImplementacionDAOVeleros implements InterfazDao{
    //Atributos
    private Connection con;
    private Statement stm;
    // private Statement stm;
    //constructor
    public ImplementacionDAOVeleros() {
        try {
        this.con = ConexionBaseDatos.getConnection();
        stm = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ImplementacionDAOVeleros.class.getName()).log(Level.SEVERE, null, ex);
        }

    
    }
    
    //implementacion metodos
    @Override
    public boolean darAltaVeleros(Object velero) {
        Veleros vel = (Veleros) velero;//creamos objetos
        boolean aux = false;
        try {
            stm.executeUpdate("INSERT INTO Veleros VALUES(" + vel.getMatricula() + "," + vel.getDescripcion() + "," + vel.getEslora() + "," + vel.getManga() + "," + vel.getPuntal() + "," + vel.getMaxTripulacion() + "," + vel.getAño() + "," + vel.getNumMas() +  ");");
            aux = true;
        } catch (SQLException ex) {
            Logger.getLogger(ImplementacionDAOVeleros.class.getName()).log(Level.SEVERE, null, ex);
            aux = false;
        } finally {

            try {
                stm.close();//Cerramos
            } catch (SQLException ex) {
                Logger.getLogger(ImplementacionDAOVeleros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return aux;
    }

    @Override
    public boolean darBajaVeleros(Object velero) {
        Veleros vel = (Veleros) velero;//creamos objetos
        boolean aux = false;
        try {
            stm.executeUpdate("DELETE FROM Veleros WHERE Veleros.matricula = " + vel.getMatricula());
            aux = true;
        } catch (SQLException ex) {
            Logger.getLogger(ImplementacionDAOVeleros.class.getName()).log(Level.SEVERE, null, ex);
            aux = false;
        } finally {
            try {
                stm.close();//Cerramos
            } catch (SQLException ex) {
                Logger.getLogger(ImplementacionDAOVeleros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return aux;
    }

    @Override
    public boolean modificarVeleros(Object veleroViejo, Object veleroNuevo) {
        Veleros velOld = (Veleros) veleroViejo;//creamos objetos
        Veleros velNew = (Veleros) veleroNuevo;//creamos objetos
        boolean aux = false;
        try {
              stm.executeUpdate("UPDATE Veleros SET "
                    + "matricula = " + velNew.getMatricula() + ", "
                    + "materialConstruccion =" + velNew.getMaterialConstruccion() + ", "
                    + "descripcion = " + velNew.getDescripcion() + ", "
                    + "eslora =" + velNew.getEslora() + ", "
                    + "manga = " + velNew.getManga() + ", "
                    + "puntal =" + velNew.getPuntal() + ", "
                    + "maxTripulacion = " + velNew.getMaxTripulacion() + ", "
                    + "año =" + velNew.getAño() + ", "
                    + "numMas = " + velNew.getNumMas() + ", "
                    + " WHERE Veleros.matricula = " + velOld.getMatricula());
            aux = true;
        } catch (SQLException ex) {
            Logger.getLogger(ImplementacionDAOVeleros.class.getName()).log(Level.SEVERE, null, ex);
            aux = false;
        } finally {
            try {
                stm.close();//Cerramos
            } catch (SQLException ex) {
                Logger.getLogger(ImplementacionDAOVeleros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return aux;

    }

    @Override
    public String recorrerVeleros(Object velero) {
        Veleros vel = (Veleros) velero;//creamos objetos
        StringBuilder sb = new StringBuilder("");
        boolean aux = false;
        try {
            ResultSet rs = null;
            rs = stm.executeQuery("SELECT matricula,materialConstruccion,descripcion,eslora"
                    + ",manga,puntal,maxTripulacion,año,numMas FROM veleros ");

            //RECORREMOS
            while (rs.next()) {
                String matricula = rs.getString("matricula");//pasamos a string el elemento
                String materialConstruccion = rs.getString("materialConstruccion");//pasamos a string el elemento
                String descripcion = rs.getString("descripcion"); //pasamos a string el elemento
                int eslora = rs.getInt("eslora"); //pasamos a string el elemento
                int manga = rs.getInt("manga"); //pasamos a string el elemento
                int puntal = rs.getInt("puntal"); //pasamos a string el elemento
                int maxTripulacion = rs.getInt("maxTripulacion"); //pasamos a string el elemento
                int año = rs.getInt("año"); //pasamos a string el elemento
                int numMas = rs.getInt("numMas"); //pasamos a string el elemento
                //imprimos las filas
                sb.append("MATRICULA: " + matricula + " MATERIAL CONSTRUCCCION: " + materialConstruccion
                        + "DESCRIPCION: " + descripcion + "ESLORA: " + eslora + "MANGA: " + manga
                        + "PUNTAL: " + puntal + "MAXIMO TRIPULACION: " + maxTripulacion
                        + "AÑO: " + año + "NUMERO MASTILES: " + numMas);
//                System.out.println("MATRICULA: " + matricula + " MATERIAL CONSTRUCCCION: " + materialConstruccion
//                        + "DESCRIPCION: " + descripcion + "ESLORA: " + eslora + "MANGA: " + manga
//                        + "PUNTAL: " + puntal + "MAXIMO TRIPULACION: " + maxTripulacion
//                        + "AÑO: " + año + "NUMERO MASTILES: " + numMas + "CLASE VELERO: " + claseVelero);
            }
            return sb.toString();
        } catch (SQLException ex) {
            Logger.getLogger(ImplementacionDAOVeleros.class.getName()).log(Level.SEVERE, null, ex);
            return "Fallo";
        } 
    }


}