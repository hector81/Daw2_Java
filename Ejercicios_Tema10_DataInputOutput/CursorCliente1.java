/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Tema10_DataInputOutput;

/**
 *
 * @author user
 */
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CursorCliente1 {

    private ArrayList<Cliente1> coleccion;
    private File fichero;

    public CursorCliente1() {
        coleccion = new ArrayList();
        fichero = new File("D:\\clientes.dat");
        cargarFichero();
    }

    //cargar los datos del fihcero en la coleccion
    public void cargarFichero() {
        if (fichero.exists()) {//Si el archivo no existe no hace nada, asi que luego al guardar datos lo creara
            DataInputStream lector = null;
            try {//abrir el fichero para su lectura y carga
                lector = new DataInputStream(new FileInputStream(fichero));
                while (true) {
                    añadirCliente(new Cliente1(lector.readUTF(), lector.readUTF(),
                            lector.readInt(), lector.readInt()));
                }
            } catch (EOFException ex) {
                System.out.println("Fichero ha sido leido");
            } catch (FileNotFoundException ex) {
                System.out.println("No se a ha encontrado el fichero");
            } catch (IOException ex) {
                System.out.println("Final del Archivo ");
            } finally {
                try {
                    lector.close();
                } catch (IOException ex) {
                    Logger.getLogger(CursorCliente1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    //guardar datos al cerrar la ventana
    public void guardarDatos() {
        DataOutputStream escritor = null;
        try {
            escritor = new DataOutputStream(new FileOutputStream(fichero));
            for (int i = 0; i < coleccion.size(); i++) {
                escritor.writeUTF(coleccion.get(i).getNombre());
                escritor.writeUTF(coleccion.get(i).getApellido());
                escritor.writeInt(coleccion.get(i).getDni());
                escritor.writeInt(coleccion.get(i).getEdad());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CursorCliente1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CursorCliente1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                escritor.close();
            } catch (IOException ex) {
                Logger.getLogger(CursorCliente1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public boolean añadirCliente(Cliente1 cliente) {
        int valido = userExists(cliente);
        if (valido == -1) {//si no esta
            System.out.println("añadido");
            return coleccion.add(cliente);
        } else {
            return false;
        }
    }

    public boolean delete(Cliente1 cliente) {
        int valido = userExists(cliente);
        if (valido != -1) {
            System.out.println("borrado");
            return coleccion.remove(cliente);
        } else {
            return false;
        }
    }

    //comprobar que ese usuario existe o no
    public int userExists(Cliente1 cliente) {
        return coleccion.indexOf(cliente);
    }

    public String mostrarDatos() {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < coleccion.size(); i++) {
            sb.append(coleccion.get(i) + "\n");
        }
        return sb.toString();
    }

    public boolean cambiarDatos(int posicion, Cliente1 nuevo) {
        if (posicion != -1) {
            System.out.println("cambido");
            coleccion.set(posicion, nuevo);
            return true;
        } else {
            return false;
        }
    }
}
