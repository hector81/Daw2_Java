/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VESPERTINO
 */
public class Prueba2 {

    public static void main(String[] args) {
        Connection con;
        try {
            //cargar driver
            Class.forName("com.mysql.jdbc.Driver");
            //Hacer conexión
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "");
            //Crear Instrucción JDBC
            Statement stmt = con.createStatement();
            //Crear instrucción
            PreparedStatement prueba2 = con.prepareStatement("UPDATE negocios2011.distritos SET nomdistrito = ? WHERE iddistrito = ?");
            //cambiar los tokens "?"
            prueba2.setString(1, "Polígono Cantabria");
            prueba2.setInt(2, 2);
            //ejecutar update
            prueba2.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Prueba2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Prueba2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
