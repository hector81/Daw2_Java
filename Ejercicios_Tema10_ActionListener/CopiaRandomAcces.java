/*
Implementar una aplicación en Java haciendo uso de la clase
RandomAccessFile, teniendo en cuenta los siguientes requerimientos:
• La aplicación permitirá transferir un fichero binario trozo a trozo
según lo indique el usuario.
• En la IGU habrá tres cajas de texto (txtOrigen, txtDestino y
txtTamaño) y un botón de aceptar.
• El usuario indicará el nombre de los archivos (Origen y Destino)
y un tamaño en bytes.
• Tras pulsar el botón de enviar, se transferirá al fichero destino
tantos bytes del fichero origen como indique el campo txtTama-
ño.

• Si el usuario intenta enviar más bytes que los que restan para
completar el fichero destino, se indicará el error al usuario con
un mensaje señalándole cuantos bytes le quedan por transferir
como máximo

ORIGEN    CAJATEXTO  BOTON
DESTINO   CAJATEXTO  BOTON
TAMAÑO    CAJATEXTO
        BOTON ENVIAR DATOS


ejemplo imagen que se vaya viendo a trozos
ejempo archivo de 400, le poinemos 100 y copia los primeros 100, 200 y copia 200 y se queda en 300, si luego
ponemos 400, se pasa y hay que poner aviso
 */
package Ejercicios_Tema10_ActionListener;

import java.awt.BorderLayout;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author VESPERTINO
 */
public class CopiaRandomAcces extends JFrame implements ActionListener, WindowListener {
//atributos
    private JLabel jlOrigen, jlDestino, jlTamaño;
    private JButton jbBuscarArchivo, jbCarpetaDestinoM,  jbEnviarDatos;
    private JPanel jPanelNorte, jPanelSur ,jPanel1 ,jPanel2, jPanel3;
    private JTextField jTexto1,jTexto2, jTexto3;
    //delcarmos dos archivos copia destino
    private File archivoCopia, archivoDestino;
    private JFileChooser fileChooserOrigen,fileChooserDestino ;
    private RandomAccessFile ficheroAccesoAleatorioLeer, ficheroAccesoAleatorioEscribir;
         
    
    public CopiaRandomAcces(){
        this.getContentPane().setLayout(new BorderLayout());
        //instanciamos paneles
        jPanelNorte = new JPanel();
        jPanelSur = new JPanel();
        jPanel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        jPanel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        jPanel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        //instanciamos panel norte objetos
        jlOrigen = new JLabel("ORIGEN");
        jTexto1 = new JTextField(20);
        jbBuscarArchivo = new JButton("CARPETA ORIGEN");
        jlDestino = new JLabel("DESTINO");
        jTexto2 = new JTextField(20);
        jbCarpetaDestinoM = new JButton("CARPETA DESTINO");
        jlTamaño = new JLabel("TAMAÑO");
        jTexto3 = new JTextField(20);
        //instanciamos FILES
        archivoCopia = new File("");
        archivoDestino = new File("");
        //instanciamos un obejto de fileChooser
        fileChooserOrigen = new JFileChooser();
        fileChooserDestino = new JFileChooser();

  
        //DAMOS ACCION A LOS BOTONES
        jbBuscarArchivo.addActionListener(this);       
        jbCarpetaDestinoM.addActionListener(this);
        jbCarpetaDestinoM.addActionListener(this);     
               
        //instanciamos panel sur objetos
        jbEnviarDatos = new JButton("COPIAR");
        jbEnviarDatos.setAlignmentX(CENTER_ALIGNMENT);//alineamos al centro
        jbEnviarDatos.addActionListener(this);
        
        //añadaimso los objetos al panel norte
        jPanel1.add(jlOrigen);
        jPanel1.add(jTexto1);
        jPanel1.add(jbBuscarArchivo);
        
        jPanel2.add(jlDestino);
        jPanel2.add(jTexto2);
        jPanel2.add(jbCarpetaDestinoM);
        
        jPanel3.add(jlTamaño);
        jPanel3.add(jTexto3);
        
        //añadimos los objetos al panel norte
        jPanelNorte.add(jPanel1);
        jPanelNorte.add(jPanel2);
        jPanelNorte.add(jPanel3);
        
        //añadimos los objetos al panel sur
        jPanelSur.add(jbEnviarDatos);
              
        //añadimos paneles
        this.add(jPanelNorte,BorderLayout.NORTH);
        this.add(jPanelSur,BorderLayout.SOUTH);
        
        jPanelNorte.setLayout(new GridLayout(3, 3));
        jPanelSur.setLayout(new FlowLayout());
        
        //para la ventana
        this.pack();//empaquetar
        this.setLocationRelativeTo(null);//centrar
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cerrar ejecucion
        this.setVisible(true);//visualizar
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object pulsarBoton = e.getSource();//declaramos objeto segun boton pulsado        
        //metodo para boton copiar//ESTO ES PARA EL BOTON DE CARPETA ORIGEN
        if (pulsarBoton == jbBuscarArchivo) {           
            int seleccion = fileChooserOrigen.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {   //aquí abrimos el archivo              
                try {
                    archivoCopia = fileChooserOrigen.getSelectedFile();
                    jTexto1.setText(archivoCopia.getPath());//Enviamos al label el texto de la ruta 
                    ficheroAccesoAleatorioLeer = new RandomAccessFile(archivoCopia, "r");//leemos con random
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(CopiaRandomAcces.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                jTexto1.setText("Ningún archivo elegido");                 
            }
            
            //metodo para boton salvar//ESTO ES PARA EL BOTON DE CARPETA DESTINO
        } else if (pulsarBoton == jbCarpetaDestinoM) {
            int seleccion = fileChooserDestino.showSaveDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) { //aqui guardamos el archivo                
                try {
                    archivoDestino = fileChooserDestino.getSelectedFile();
                    jTexto2.setText(archivoDestino.getPath());//Enviamos al label el texto de la ruta
                    ficheroAccesoAleatorioEscribir = new RandomAccessFile(archivoDestino, "rw");//ESTO ES PARA ESCRIBIR
                    //EL TAMAÑO QUE LE INDIQUEMOS
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(CopiaRandomAcces.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                jTexto2.setText("No se ha copiado correctamente");                 
            }
            //metodo para boton empezar copia//ESTO ES PARA EL BOTON COPIAR
        } else if (pulsarBoton == jbEnviarDatos) {
            //esto es para comprobar que hay algo en las cajas de texto            
            if ((jlOrigen.getText() != "") && (jlDestino.getText() != "")) {              
                try {
                //varaibles locales
                int numeroLimite = 0;//variable para el numero que introduzcamos
                numeroLimite = Integer.parseInt(jTexto3.getText());//capturamos el NUMERO DE TEXTO
                //declaramos un array de bytes con el numero que ha pasado el usuario para que lea
                //exactamente ese numero de bytes (que sera minimo 1 kb)
                byte datos[] = new byte[numeroLimite]; 
                long aux = ficheroAccesoAleatorioLeer.getFilePointer() + numeroLimite;
                
                    if (archivoCopia.length() >= archivoDestino.length()) { 
                        
                        //Posicionar el puntero del fichero en la posición indicada
                        ficheroAccesoAleatorioLeer.seek(archivoDestino.length());
                        //leemos desde las primeras 100 posiciones que le hemos puesto en el texto
                        ficheroAccesoAleatorioLeer.read(datos);

                        ficheroAccesoAleatorioEscribir.seek(archivoDestino.length());
                        //escribimos desde las primeras 100 posiciones que le hemos puesto en el texto
                        ficheroAccesoAleatorioEscribir.write(datos);
                        long auxiliar;
                        auxiliar = archivoCopia.length()-archivoDestino.length();
                        System.out.println("longitud leer " + archivoCopia.length());
                        System.out.println("longitud escrbir " +archivoDestino.length() );
                        System.out.println("restante leer " +auxiliar );
                    } else {
                        //System.out.println("te has pasado");
                        long restante = archivoDestino.length() - aux;
                        System.out.println("Has puesto un tamaño superior a"
                                + " los bytes que quedan. Te quedan: " + restante);;
                    }

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(CopiaRandomAcces.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(CopiaRandomAcces.class.getName()).log(Level.SEVERE, null, ex);
                } 
            }

        }

    }//FIN METODO actionPerformed
    
    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try {
            JOptionPane.showMessageDialog(this, "Cerrando los ficheros");
            ficheroAccesoAleatorioLeer.close();
            ficheroAccesoAleatorioEscribir.close();
        } catch (IOException ex) {
            Logger.getLogger(Diseño.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    //MAIN
    public static void main(String[] args) {
        CopiaRandomAcces cp = new CopiaRandomAcces();
        cp.setVisible(true);
    }//fin main
    
}//fin clase
  