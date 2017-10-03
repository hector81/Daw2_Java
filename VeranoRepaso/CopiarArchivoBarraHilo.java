/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VeranoRepaso;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class CopiarArchivoBarraHilo implements Runnable {
    private CopiarArchivoBarra c;

    public CopiarArchivoBarraHilo(CopiarArchivoBarra c) {
        this.c = c;
    }
    
    
    
    @Override
    public void run() {
        
        long lecturaBytes;
        int tamaño, numeroVueltas, porcentaje;
        byte datos[] = new byte[1024];
        File file = null;
        FileInputStream fi = null;
        FileOutputStream fo = null;
        try {
            file = new File(c.getFileleer().getAbsolutePath());
            tamaño = (int) file.length();
            numeroVueltas = tamaño / 1024;
            porcentaje = numeroVueltas / 100;
            
            fi = new FileInputStream(c.getFileleer());
            fo = new FileOutputStream(c.getFileescribir());
            
            lecturaBytes= fi.read(datos);
            
            for (int i = 0; i < numeroVueltas; i++) {
                lecturaBytes= fi.read(datos);
                fo.write(datos);
                c.getBarra().setValue(c.getBarra().getValue() + porcentaje);
                
            }
            int aux= tamaño - numeroVueltas/1024;
            lecturaBytes= fi.read(datos);
            fo.write(datos, 0, aux);
            c.getBarra().setValue(100);
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CopiarArchivoBarraHilo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CopiarArchivoBarraHilo.class.getName()).log(Level.SEVERE, null, ex);
        }

            
    }
    
}
