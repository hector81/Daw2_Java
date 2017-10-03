/*
origen   jlabel  boton origen archivo
origen   jlabel  boton origen archivo
            copiar
jprgoess 50%

JFileChooser

Copiador
-Origen: String
-Destino: String
//**********************
+copiar() (void)    --el metodo que copia
+getCantidad()    --metodo que te enseña lo que lleva copiado  59%

debe tener sleep y runnable


botonoes funiconarçcopair en e run el hilo
y luego hacer copador
 */
package Ejercicios_Tema10_Buffer;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

/**
 *
 * @author VESPERTINO
 */
public class CopiarArchivos extends JFrame implements ActionListener{
    //atributos
    private JLabel jlOrigen, jlDestino;
    private JButton jbBuscarArchivo, jbCarpetaDestinoM,  jbCopiar;
    private JProgressBar jpBarra;
    private JPanel jPanelNorte, jPanelCentro, jPanelSur ,jPanel1 ,jPanel2;
    private JTextField jTexto1,jTexto2;
    //delcarmos dos archivos copia destino
    private File archivoCopia, archivoDestino;
    private JFileChooser fileChooserOrigen,fileChooserDestino ;
            
    
    public CopiarArchivos(){
        this.getContentPane().setLayout(new BorderLayout());
        //instanciamos paneles
        jPanelNorte = new JPanel();
        jPanelCentro = new JPanel();
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
        
        //instanciamos panel centro objetos
        jpBarra = new JProgressBar(0,100);//ponemos los valores de 0 a 100
        jpBarra.setAlignmentX(CENTER_ALIGNMENT);//alineamos centro
        //setStringPainted hace que la barra de progreso muestre un string de
        //porcentaje dentro de sus límites. Por defecto, la cadena indica el 
        //porcentaje completo de la barra de progreso.
        jpBarra.setStringPainted(true);
               
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
    
        //añadimos los objetos al panel centro
        jPanelCentro.add(jpBarra);
        
        //añadimos los objetos al panel sur
        jPanelSur.add(jbCopiar);
        
        //añadimos paneles
        this.add(jPanelNorte,BorderLayout.NORTH);
        this.add(jPanelCentro,BorderLayout.CENTER);
        this.add(jPanelSur,BorderLayout.SOUTH);
        
        jPanelNorte.setLayout(new GridLayout(2, 3));
        jPanelCentro.setLayout(new FlowLayout());
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
        //metodo para boton copiar
        if (pulsarBoton == jbBuscarArchivo) {           
            int seleccion = fileChooserOrigen.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {   //aquí abrimos el archivo
                archivoCopia = fileChooserOrigen.getSelectedFile();
                jTexto1.setText(archivoCopia.getPath());//Enviamos al label el texto de la ruta
            } else {
                jTexto1.setText("Ningún archivo elegido");                 
            }
            
            //metodo para boton salvar
        } else if (pulsarBoton == jbCarpetaDestinoM) {
            int seleccion = fileChooserDestino.showSaveDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) { //aqui guardamos el archivo
                archivoDestino = fileChooserDestino.getSelectedFile();
                jTexto2.setText(archivoDestino.getPath());//Enviamos al label el texto de la ruta
            } else {
                jTexto2.setText("No se ha copiado correctamente");                 
            }
            //metodo para boton empezar copia
        } else if (pulsarBoton == jbCopiar) {
            if((jlOrigen.getText()!="")&& (jlDestino.getText()!="")){
                CopiarArchivoHilo hp = new CopiarArchivoHilo(this);
                Thread t = new Thread(hp);
                t.start();
            }
        }

    }//FIN METODO actionPerformed

    //GETTERS AND SETTERS
    public JProgressBar getJpBarra() {
        return jpBarra;
    }
    
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
        CopiarArchivos cp = new CopiarArchivos();
        cp.setVisible(true);
    }//fin main
}//fin clase
