/*
HAREMOS UN ARRAYLIST DE CLIENTES
Hay que hacer 4 metodos
--alta al que le pasaremos un parametro de tipo cliente
--baja al que le pasaremos un parametro de tipo cliente
--modificar al que le pasaremos un parametro de tipo clienteNuevo, clienteViejo
--lista clientes al que le pasaremos un parametro de tipo cliente

--salvar
--cargar

--los que leen de fichero
 */
package Ejercicios_Tema10_DataInputOutput;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VESPERTINO
 */
public class CursorCliente {
    //atributos  
    private ArrayList<Cliente> coleccionClientes;
    FileWriter fr = null;
    BufferedWriter br = null;
    //creamos fichero
    private File fichero;
    //constructor

    public CursorCliente() {
        this.coleccionClientes = new ArrayList();
        //PONEMOS el fichero donde queremos poner la lista
        this.fichero = new File("D:\\archivoPrueba.txt");
        cargarCliente();
    }

    //metodo que comprueba si se ha dado de alta un cliente
    public boolean darAltaCliente(Cliente cliente) throws IOException{
        boolean comprobar = false;
       //comprobamos que el cliente exista
        if (cliente != null && existeCliente(cliente) == 1) {
            coleccionClientes.add(cliente);
            comprobar = true;
            //jTexto1.setText
        } else {
           comprobar = false;
        }
        return comprobar;
    }
    
    //metodo
    public boolean darBajaCliente(Cliente cliente){
        boolean comprobar = false;
        int posicion = coleccionClientes.indexOf(cliente);
        if (posicion != -1) {//si el cliente existe
            coleccionClientes.remove(coleccionClientes.indexOf(cliente));
            comprobar = true;
        } else {
            comprobar = false;
        }
        return comprobar;
    }
    
    //metodo para comprobar
    public boolean modificarCliente(Cliente clienteNuevo, Cliente clienteViejo) {
        boolean comprobar = false;
        int indice = coleccionClientes.indexOf(clienteViejo);
        if (indice != -1) {//si el cliente existe
            coleccionClientes.set(indice, clienteNuevo);//lo cambiamos
            comprobar = true;
        } else {
            comprobar = false;
        }
        return comprobar;
    }
    
    //metodo recorrer cliente
    public String recorrerCliente(){
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < coleccionClientes.size(); i++) {
            sb.append(coleccionClientes.get(i) + "\n");
        }
        return sb.toString();
        
    }
    
    //metodo para comprobar que el cliente ya existe
    public int existeCliente(Cliente cliente){
            return coleccionClientes.indexOf(cliente);  //devuelve indice   
    }
   
    //metodo para cargar y mostrar los datos del cliente
    public void salvarCliente(File fichero) {
        //atributos
        FileOutputStream ficheroEntrada = null;
        DataOutputStream flujoEntrada = null;   
        try {
            //creamos un archivo de entrada al que le pasamos un archivo de texto creado como parametro
            ficheroEntrada = new FileOutputStream(fichero);
            //creamos un flujo de salida 
            flujoEntrada = new DataOutputStream(ficheroEntrada); 
            //recorremos el arraylist
            for (int i = 0; i < coleccionClientes.size(); i++) {
                //escribimos las variables en el fichero
                flujoEntrada.writeUTF(coleccionClientes.get(i).getNombre());
                flujoEntrada.writeUTF(coleccionClientes.get(i).getApellidos());
                flujoEntrada.writeInt(coleccionClientes.get(i).getEdad());
                flujoEntrada.writeLong(coleccionClientes.get(i).getDni());
            }          
            //cerramos 
            ficheroEntrada.close();          
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        try {
            if (ficheroEntrada != null) {
                ficheroEntrada.close();//cerramos   
            }
            if (flujoEntrada != null) {//cerramos   
                flujoEntrada.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }//fin metodo
    
    //metodo para guardar el cliente
    public void cargarCliente(){
        //Comprobamos que el fichero exista
        if (fichero.exists()) {
            //atributos
            FileInputStream ficheroSalida = null;
            DataInputStream flujoSalida = null;
            try {
                //creamos un archivo de salida al que le pasamos un archivo de texto creado como parametro
                ficheroSalida = new FileInputStream(fichero);
                //creamos un flujo de entrada 
                flujoSalida = new DataInputStream(ficheroSalida);
                while (true) {//bucle infinito MIENTRAS SE LEE EL FICHERO
                    darAltaCliente(new Cliente(flujoSalida.readUTF(), flujoSalida.readUTF(), flujoSalida.readInt(),
                            flujoSalida.readInt()));
                }
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
                System.out.println("No se a ha encontrado el fichero");
            } catch (EOFException e) {
                System.out.println(e.getMessage());
                System.out.println("Fin de fichero");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } finally {
                try {
                    if (ficheroSalida != null) {
                        ficheroSalida.close();
                    }
                    if (flujoSalida != null) {
                        flujoSalida.close();
                    }
                } catch (IOException ex) {
                    Logger.getLogger(CursorCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }//fin if
    }//fin metodo
    
}//fin clae
