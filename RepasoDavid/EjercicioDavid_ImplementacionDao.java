/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoDavid;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VESPERTINO
 */
public class EjercicioDavid_ImplementacionDao implements EjercicicioDavid_Dao{

    @Override
    public int consultarPorCaracteres(char c, int numeroLineas) {
        File file ;
        FileReader lector = null;
        BufferedReader filtroLector = null;
        String linea;
        String lineaCaracteres;
        int contador = 0; 
        int contadorLineas=0;
        int resultado =0;
        try {
            file = new File("quijote.txt");
            lector = new FileReader(file);
            filtroLector = new BufferedReader(lector);
            
            while( filtroLector.readLine() != null && contador < numeroLineas){
                linea = filtroLector.readLine();
                //recorremos
                for (int i = 0; i < linea.length(); i++) {
                    char letra= linea.charAt(i);
                    if(letra == c){
                        contadorLineas++;
                    }
                }
                contador++;
            }

            resultado += contadorLineas;
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EjercicioDavid_ImplementacionDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EjercicioDavid_ImplementacionDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                lector.close();
                filtroLector.close();
            } catch (IOException ex) {
                Logger.getLogger(EjercicioDavid_ImplementacionDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return resultado;
        
    }

    @Override
    public int consultarPorNumeroPalabras(int numeroLineas) {
        File file ;
        FileReader lector = null;
        BufferedReader filtroLector = null;
        String linea;
        int contador = 0;
        int contadorPalabrasLineas = 0;
        int masuna=0;
        int contadorTotal = 0;
        int resultado =0;
        try {
            file = new File("quijote.txt");
            lector = new FileReader(file);
            filtroLector = new BufferedReader(lector);
            
            while( filtroLector.readLine() != null && contador < numeroLineas){
                linea = filtroLector.readLine();
                //recorremos
                for (int i = 0; i < linea.length(); i++) {
                    char letra= linea.charAt(i);
                    if(letra == ' '){
                        contadorPalabrasLineas++;
                    }
                }
                
                masuna = contadorPalabrasLineas+1;
                contador++;
            }
            contadorTotal += masuna;
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EjercicioDavid_ImplementacionDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EjercicioDavid_ImplementacionDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                lector.close();
                filtroLector.close();
            } catch (IOException ex) {
                Logger.getLogger(EjercicioDavid_ImplementacionDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return contadorTotal;
    
    }

    @Override
    public boolean alta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean borrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modificar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean consultar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
