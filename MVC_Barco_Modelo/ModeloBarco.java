///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package MVC_Barco_Modelo;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
///**
// *
// * @author user
// */
//public class ModeloBarco {
//    //atributos
//    private ArrayList<Barco> coleccion;
//    
//    //metodos
//    
//    //metodo para comprobar si existe un barco
//    public int existeBarco(Barco barco){
//        return coleccion.indexOf(barco);//devolvera la posicion si existe
//    }
//    
//    //metodo para avanzar
//    public Barco avanzarBarco(Barco barco){
//        int indice = coleccion.indexOf(barco) + 1;
//        return coleccion.get(indice);
//    }
//    
//    //metodo para retroceder
//    public Barco retrocederBarco(Barco barco){
//        int indice = coleccion.indexOf(barco) - 1;
//        return coleccion.get(indice);
//    }
//    
//    //metodo para guardar el fichero la coleccion
//    public void guardarFichero(String nombreFichero){
//        FileOutputStream archivoInput = null;
//        ObjectOutputStream objetoInput = null;
//        File archivoSalida = null;
//        try {
//            archivoSalida = new File("/MVC_Barco_Modelo/" + nombreFichero + ".obj");        
//            archivoInput = new FileOutputStream(archivoSalida);       
//            objetoInput = new ObjectOutputStream(archivoInput);
//            //escribimos el objeto o coleccion
//            objetoInput.writeObject(coleccion);
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(ModeloBarco.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(ModeloBarco.class.getName()).log(Level.SEVERE, null, ex);
//        }   finally{
//            if(archivoSalida != null){
//                try {
//                    objetoInput.close();
//                } catch (IOException ex) {
//                    Logger.getLogger(ModeloBarco.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        }
//    }
//    
//    public void cargarFichero(String nombreFichero) throws IOException{
//        FileInputStream archivoInput = null;
//        ObjectInputStream objetoInput = null ;
//        File archivoSalida = null;
//        
//        try {
//            archivoSalida = new File("/MVC_Barco_Modelo/" + nombreFichero + ".obj");
//            archivoInput = new FileInputStream(archivoSalida);
//            objetoInput = new ObjectInputStream(archivoInput);
//            //machacamos la coleccionBarcos con el array list cargado
//            coleccion = (ArrayList<Barco>)objetoInput.readObject();
//            objetoInput.close();
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(ModeloBarco.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(ModeloBarco.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(ModeloBarco.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            if (archivoSalida != null) {
//                    objetoInput.close();
//                    
//                }
//        }
//            
//    }
//    
//    //metodo para modificar un barco
//    public boolean darAltaBarco(Barco barco) {
//        int indice = existeBarco(barco);
//        if (indice == -1) { //si el barco no existia previamente
//            coleccion.add(barco);
//            return true;
//        } else {
//            return false;
//        }
//    }//fin metodo
//   
//    //metodo para modificar un barco
//    public boolean darBajaBarco(String matricula) {
//        Barco barco = new Barco(matricula);
//        int indice = existeBarco(barco);
//        if (indice != -1) {//si el barco existia previamente
//            coleccion.remove(barco);
//            return true;
//        } else {
//            return false;
//        }
//    }//fin metodo
//    
//    //metodo para modificar un barco
//    public boolean darModificarBarco(String matricula, Barco barcoNuevo){
//        Barco barcoViejo = new Barco(matricula);
//        int indice = existeBarco(barcoViejo);
//        if(indice != -1){
//            coleccion.set(indice, barcoNuevo);
//            return true;
//        }else{
//            return false;
//        }        
//    }//fin metodo
//    
//    //metodo para consultar
//    public String darConsultarBarco(String matricula){
//        Barco barco = new Barco(matricula);
//        int indice = existeBarco(barco);
//        if(indice != -1){
//            return coleccion.get(indice) + "";
//        }else{
//            return null;
//        }
//    }//fin metodo
//    
//}//fin clase
