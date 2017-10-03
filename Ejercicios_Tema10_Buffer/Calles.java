/*
Implementar una aplicación en Java haciendo uso de la clase BufferedReader y
BufferedWriter, teniendo en cuenta los siguientes requerimientos:

• En la IGU aparecerá una caja de texto para recoger el fichero de lectura y un
JFileChooser y otra caja de texto para recoger el directorio destino.
• Dado el fichero de calles de ciudades entregado por vuestro profesor.
• Realizar un programa que particione dicho fichero, en ficheros cuyas calles
empiecen por “a”, “b”, “c”.
• Dichos ficheros se guardarán en el directorio seleccionado por el usuario

INTRODUCE UNA ARCHIVO CON LAS CALLES DE LOGROÑO
DEVOLVER 28 ARCHIVOS DE TEXTO DISTINTO TXT CON LAS CALLES ORDENADAS
 */
package Ejercicios_Tema10_Buffer;

import java.awt.BorderLayout;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author VESPERTINO
 */
public class Calles extends JFrame implements ActionListener, WindowListener{
    //atributos
    private JLabel jlOrigen, jlDestino;
    private JButton jbBuscarArchivo, jbCarpetaDestinoM,  jbCopiar;
    private JPanel jPanelNorte, jPanelSur ,jPanel1 ,jPanel2;
    private JTextField jTexto1,jTexto2;
    //delcarmos dos archivos copia destino
    private File archivoCopia, archivoDestino;
    private JFileChooser fileChooserOrigen,fileChooserDestino ;
    //atributos
    private FileReader fr = null;
    private String linea;
    private BufferedReader br = null;
    private URL url;        
    private BufferedWriter bw;
    private FileWriter fw;
    
    public Calles(){
        this.getContentPane().setLayout(new BorderLayout());
        //instanciamos paneles
        jPanelNorte = new JPanel();
        jPanelSur = new JPanel();
        jPanel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        jPanel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        //instanciamos panel norte objetos
        jlOrigen = new JLabel("ORIGEN");
        jTexto1 = new JTextField(20);
        jbBuscarArchivo = new JButton("CARPETA ORIGEN");
        jlDestino = new JLabel("DESTINO");
        jTexto2 = new JTextField(20);
        jbCarpetaDestinoM = new JButton("CARPETA DESTINO");
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
        jbCopiar = new JButton("COPIAR");
        jbCopiar.setAlignmentX(CENTER_ALIGNMENT);//alineamos al centro
        jbCopiar.addActionListener(this);
        
        //añadaimso los objetos al panel norte
        jPanel1.add(jlOrigen);
        jPanel1.add(jTexto1);
        jPanel1.add(jbBuscarArchivo);
        
        jPanel2.add(jlDestino);
        jPanel2.add(jTexto2);
        jPanel2.add(jbCarpetaDestinoM);
        
        //añadimos los objetos al panel norte
        jPanelNorte.add(jPanel1);
        jPanelNorte.add(jPanel2);
    
        
        //añadimos los objetos al panel sur
        jPanelSur.add(jbCopiar);
        
        //añadimos paneles
        this.add(jPanelNorte,BorderLayout.NORTH);
        this.add(jPanelSur,BorderLayout.SOUTH);
        
        jPanelNorte.setLayout(new GridLayout(2, 3));
        jPanelSur.setLayout(new FlowLayout());
        
        //para la ventana
        this.pack();//empaquetar
        this.setLocationRelativeTo(null);//centrar
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cerrar ejecucion
        this.setVisible(true);//visualizar
    }

    @Override
    public void actionPerformed(ActionEvent e) {    
        try {
        Object pulsarBoton = e.getSource();//declaramos objeto segun boton pulsado
        //metodo para boton copiar   archivoCopia es file
        if (pulsarBoton == jbBuscarArchivo) {           
            int seleccion = fileChooserOrigen.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {   //aquí abrimos el archivo
                archivoCopia = fileChooserOrigen.getSelectedFile();
                jTexto1.setText(archivoCopia.getPath());//Enviamos al label el texto de la ruta  
                
                    fr = new FileReader(archivoCopia);//abrimos el filereader
                
                
            } else {
                jTexto1.setText("Ningún archivo elegido");                 
            }
            
            //metodo para boton salvar
        } else if (pulsarBoton == jbCarpetaDestinoM) {
            fileChooserDestino.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int seleccion = fileChooserDestino.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) { //aqui guardamos el archivo
                archivoDestino = fileChooserDestino.getCurrentDirectory();//esto es para que elija una carpeta
                jTexto2.setText(archivoDestino.getPath());//Enviamos al label el texto de la ruta
            } else {
                jTexto2.setText("No se ha copiado correctamente");                 
            }
            //metodo para boton empezar copia
        } else if (pulsarBoton == jbCopiar) {
            if ((jlOrigen.getText() != "") && (jlDestino.getText() != "")) {
                dameFicheros(archivoDestino.getPath());
            }
        }
        } catch (FileNotFoundException ex) {
                    Logger.getLogger(Calles.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//FIN METODO actionPerformed
    
    //metodo dame ficheros
    private void dameFicheros(String rutaArchivoOrigen) {
        //variables locales
        linea="";
        String destino = "";      
        String nuevaLinea = "";//declaramos variable para acumular las lineas
        String abcedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] arrayChar = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        try {
            //la primera vuelta dara 26 vueltas y creara los archivos
            for (int j = 0; j < abcedario.length(); j++) {
                fr = new FileReader(archivoCopia);
                br = new BufferedReader(fr);//le pasamos como parametro el objeto
                rutaArchivoOrigen = "C:\\Users\\user\\Documents\\NetBeansProjects\\Hector_Proyecto\\src\\Ejercicios_Tema10_Buffer\\resultado" + abcedario.charAt(j) + ".txt";            
                fw = new FileWriter(rutaArchivoOrigen);
                //declaramos objeto de BufferedWriter
                bw = new BufferedWriter(fw);
                //tratamiento de los datos
                linea = br.readLine();
                while(linea!=null){ 
                    String cadena;//usaremos esta variable para almacenar las variables
                    cadena = linea.toUpperCase();//pasamos a mayusculas
                    //la segunda vuelta ingresar en los archivos las lineas de las letras que le correspondan
                    for (int i = 0; i < arrayChar.length; i++) {
                        if (cadena.charAt(10) == arrayChar[i]) {
                            //acumulamos la cadena o linea si coincide con el caracter
                            nuevaLinea = nuevaLinea + "\n" + linea;

                        }
                    }//fin for 2
                }
                //ESTO ESTA MAL , NO CIERRA BIEN CORREGIR 
                bw.write(nuevaLinea); //pasamos los resultados y lo escribimos en BufferedWriter
                bw.close();//cerramos BufferedWriter
                fw.close();//cerramos FileWriter
                br.close();//cerramos BufferedReader
                fr.close();//cerramos FileReader
            }//fin for 1
        } catch (IOException ex) {
            Logger.getLogger(Calles.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Calles.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//fin metodo

    //GETTERS AND SETTERS
    
    public JFileChooser getFileChooserOrigen() {
        return fileChooserOrigen;
    }
    
    public void setFileChooserOrigen(JFileChooser fileChooserOrigen) {
        this.fileChooserOrigen = fileChooserOrigen;
    }
    
    public JFileChooser getFileChooserDestino() {
        return fileChooserDestino;
    }
    
    public void setFileChooserDestino(JFileChooser fileChooserDestino) {
        this.fileChooserDestino = fileChooserDestino;
    }
    
    public File getArchivoCopia(){
        return archivoCopia;
    }
    
    public File getArchivoDestino(){
        return archivoDestino;
    }

    
    //MAIN
    public static void main(String[] args) {
        Calles cp = new Calles();
    }//fin main

    //metodos sobreescritos de windowslistener
    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosed(WindowEvent e) {
        try {
            bw.close();
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(Calles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}//fin clase
