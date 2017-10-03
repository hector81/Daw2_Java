/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VeranoRepaso;

import java.io.File;

/**
 *
 * @author user
 */
public class RandomAccesFileBarraHilo implements Runnable{
    private RandomAccesFileBarra r;

    public RandomAccesFileBarraHilo(RandomAccesFileBarra r) {
        this.r = r;
    }

    @Override
    public void run() {
        long lectura, numeroVueltas, porcentaje;
        File file = new File(r.getFileleer().getAbsolutePath());
        lectura =  file.length();
        numeroVueltas = lectura/1024;
        porcentaje= numeroVueltas/100;
        
        for (int i = 0; i < numeroVueltas; i++) {
            r.getBarra().setValue((int) (r.getBarra().getValue() + porcentaje));
        }
        r.getBarra().setValue(100);
    }
    
    
}
