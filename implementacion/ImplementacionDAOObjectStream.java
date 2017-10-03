package implementacion;

import Barco.Barco;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ImplementacionDAOObjectStream implements InterfazDAO {

    private ArrayList barcos;
    private File fentrada;
    private File fsalida;
    private ObjectInputStream lectura = null;
    private ObjectOutputStream escritura = null;

    //constructor
    public ImplementacionDAOObjectStream() {
        barcos = new ArrayList();
    }

    @Override
    public boolean añadir(Object b) {
        if (!barcos.contains(b)) {
            barcos.add(b);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean modificaBarco(Object viejo, Object nuevo) {
        int indice = barcos.indexOf(viejo);
        if (indice == -1) {
            return false;
        } else {
            barcos.set(indice, nuevo);
            return true;
        }
    }

    @Override
    public boolean borrar(Object b) {
        int indice = barcos.indexOf(b);
        if (indice == -1) {
            return false;
        } else {
            barcos.remove(b);
            return true;
        }
    }

    @Override
    public Object consulta(Object b) {
        int indice = barcos.indexOf(b);
        if (indice == -1) {
            return null;
        } else {
            return barcos.get(indice);
        }
    }

    @Override
    public Object dameAnterior(Object b) {
        /*que te de el elemento anterior al parámetro de entrada. coges el indice de ese elemento, y coges el anterior... restarle -1 al indice??*/
        int indiceAnterior = dameElindice(b) - 1;
        return barcos.get(indiceAnterior);

    }

    @Override
    public Object dameSiguiente(Object b) {
        int indiceSiguiente = dameElindice(b) + 1;
        return barcos.get(indiceSiguiente);
    }

    @Override
    public void cargarDatos(String nombreFichero) {

        try {
            //abrir el fichero
            fentrada = new File("G:\\DAW\\Programación\\ClaseBarco\\" + nombreFichero + ".obj");
            if (fentrada.exists()) {
                lectura = new ObjectInputStream(new FileInputStream(fentrada));
                //coger la coleccion y meterla en el fichero
                barcos = (ArrayList<Barco>) lectura.readObject();
                lectura.close();
            }

        } catch (IOException ex) {
            Logger.getLogger(ImplementacionDAOObjectStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ImplementacionDAOObjectStream.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                lectura.close();
            } catch (IOException ex) {
                Logger.getLogger(ImplementacionDAOObjectStream.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    @Override
    public void guardarDatos(String nombre) {
        try {
            //abrirse el ficher
            fsalida = new File("G:\\DAW\\Programación\\ClaseBarco\\" + nombre + ".obj");
            escritura = new ObjectOutputStream(new FileOutputStream(fsalida));
            //escribir la coleccion en el fichero
            escritura.writeObject(barcos);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ImplementacionDAOObjectStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ImplementacionDAOObjectStream.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                escritura.close();
            } catch (IOException ex) {
                Logger.getLogger(ImplementacionDAOObjectStream.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private int dameElindice(Object b) {
        int indice = barcos.indexOf(b);
        if (indice == -1) {
            return -1;
        } else {
            return indice;
        }
    }

    public  Object dameBarco(int mat) {
        Barco b = new Barco(mat);
        int indice = barcos.indexOf(b);
        if (indice == -1) {
            return null;
        } else {
            return barcos.get(indice);
        }
    }

  

}
