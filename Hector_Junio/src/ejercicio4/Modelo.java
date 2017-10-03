/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import static ejercicio4.Utilidades.dameAleatorio;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VESPERTINO
 */
public class Modelo {
    private ArrayList<Carta> listaCartas;
    
    

    //metodos
    public Carta dameCarta() {
        int indice = dameAleatorio(1, 52);
        //cogemos la carta de la baraja
        Carta cartaAuxiliar = listaCartas.get(indice);
        //borramos la carta
        listaCartas.remove(indice);
        return cartaAuxiliar;
    }
    
    public int darNumeroCarta(Carta carta){
        return carta.getNumero();
    
    }
    
    public String darPaloCarta(Carta carta){
        return carta.getPalo();
    
    }
    
    public void Barajar(ArrayList<Carta> listaCartas){
    
    }
    
    public ArrayList quitarPorPalo(String palo){          
          Iterator it = listaCartas.iterator();
          while(it.hasNext()){
              Carta carta = (Carta) it.next();
              if (palo == carta.getPalo()){
                listaCartas.remove(carta.getPalo().equals(palo));
            }
          }
            
        
        return listaCartas;
    }
    
    public void guardarCartas(){
        File file = null;
        FileOutputStream archivoSalida= null;
        ObjectOutputStream objetoSalida= null;   
                
        try {
            file = new File("RestoCartas.txt");
            archivoSalida = new FileOutputStream(file);
            objetoSalida = new ObjectOutputStream(archivoSalida);
            //escribimos el objeto serializable en el texto
            objetoSalida.writeObject(listaCartas);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                archivoSalida.close();
                objetoSalida.close();
            } catch (IOException ex) {
                Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }         
    }//fin clase
    
}//fin metodo
