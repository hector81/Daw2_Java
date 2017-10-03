/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VeranoRepaso;

/**
 *
 * @author user
*/ 
    
import java.awt.BorderLayout;
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
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class RandomAccesFileBarra extends JFrame implements ActionListener, WindowListener{
    private JPanel panelnorte, panelsur;
    private JLabel jlOrigen, jlDestino, jlTamaño,jltamañorestante;
    private JTextField jtorigen, jtdestino, jttamaño, jtrestante;
    private JButton botonOrigen, botonDestino, botonOk;
    private File fileleer, fileescribir;
    private JFileChooser chooserleer, chooserescribir;
    private RandomAccessFile raleer, raescribir;
    private JProgressBar barra;
    private RandomAccesFileBarra r;

    public RandomAccesFileBarra() {
        this.getContentPane().setLayout(new BorderLayout());
        this.panelnorte = new JPanel(new GridLayout(2, 3));
        this.panelsur = new JPanel();
        panelsur.setLayout(new BoxLayout(panelsur, BoxLayout.Y_AXIS));
        
        barra = new JProgressBar(0,100);
        barra.setStringPainted(true);
                
        this.jlOrigen = new JLabel("ORIGEN");
        this.jlDestino = new JLabel("DESTINO");
        this.jlTamaño = new JLabel("TAMAÑO");
        this.jltamañorestante = new JLabel("RESTO");
        
        this.jtorigen= new JTextField(20);
        this.jtdestino= new JTextField(20);
        this.jttamaño= new JTextField(20);
        this.jtrestante= new JTextField(20);
     
        this.botonOrigen = new JButton("ORIGEN");
        this.botonDestino = new JButton("DESTINO");
        this.botonOk = new JButton("OK");
        
        botonOrigen.addActionListener(this);
        botonDestino.addActionListener(this);
        botonOk.addActionListener(this);
        
        this.fileleer = new File("");
        this.fileescribir = new File("");
        
        this.chooserleer = new JFileChooser("");
        this.chooserescribir = new JFileChooser("");
        
        panelnorte.add(jlOrigen);
        panelnorte.add(jtorigen);
        panelnorte.add(botonOrigen);
        
        panelnorte.add(jlDestino);
        panelnorte.add(jtdestino);
        panelnorte.add(botonDestino);
        
       
        
        panelsur.add(jlTamaño);
        panelsur.add(jttamaño);
        panelsur.add(jltamañorestante);
        panelsur.add(jtrestante);
        panelsur.add(barra);
        panelsur.add(botonOk);
        
        this.add(panelnorte, BorderLayout.NORTH);
        this.add(panelsur, BorderLayout.SOUTH);
        
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if( e.getSource() == botonOrigen){
            int returnValor = chooserleer.showOpenDialog(this);
            if(returnValor == JFileChooser.APPROVE_OPTION){
                try {
                    fileleer = chooserleer.getSelectedFile();
                    jtorigen.setText(fileleer.getPath());
                    raleer = new RandomAccessFile(fileleer, "r");
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(RandomAccesFileBarra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else if(e.getSource() == botonDestino){
            int returnValor = chooserescribir.showSaveDialog(this);
            if(returnValor == JFileChooser.APPROVE_OPTION){
                try {
                    fileescribir = chooserescribir.getSelectedFile();
                    jtdestino.setText(fileescribir.getPath());
                    raescribir = new RandomAccessFile(fileescribir, "rw");
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(RandomAccesFileBarra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else if(e.getSource() == botonOk){
            int aux;
            long diferencia;
            aux = Integer.parseInt(jttamaño.getText());
            byte datos[]= new byte[aux];
            long tamañoLeer=fileleer.length(); 
            long tamañoEscribir = fileescribir.length();
            RandomAccesFileBarraHilo h = new RandomAccesFileBarraHilo(r);
            diferencia = tamañoLeer;
            if(fileescribir.length() < fileleer.length()){
                try {
                    raleer.seek(tamañoLeer);
                    raleer.read(datos);
                    
                    raescribir.seek(tamañoEscribir);
                    raescribir.read(datos);
                    
                    Thread t = new Thread(h);
                    t.start();
                    
                    diferencia -= tamañoEscribir;
                    jtrestante.setText(Long.toString(diferencia));
                    
                    RandomAccesFileBarraHilo rr = new RandomAccesFileBarraHilo(this);
                    Thread th = new Thread(rr);
                    th.start();
                
                } catch (IOException ex) {
                    Logger.getLogger(RandomAccesFileBarra.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(this, "AUN PUEDES COPIAR" + diferencia);
            } else {
                JOptionPane.showMessageDialog(this, "ERROR , EL ARCHIVO MIDE EN BYTES " + tamañoLeer);
            }         
        }
    }
    
    public static void main(String[] args) {
        RandomAccesFileBarra r = new RandomAccesFileBarra();
    }

    public JPanel getPanelnorte() {
        return panelnorte;
    }

    public void setPanelnorte(JPanel panelnorte) {
        this.panelnorte = panelnorte;
    }

    public JPanel getPanelsur() {
        return panelsur;
    }

    public void setPanelsur(JPanel panelsur) {
        this.panelsur = panelsur;
    }

    public JLabel getJlOrigen() {
        return jlOrigen;
    }

    public void setJlOrigen(JLabel jlOrigen) {
        this.jlOrigen = jlOrigen;
    }

    public JLabel getJlDestino() {
        return jlDestino;
    }

    public void setJlDestino(JLabel jlDestino) {
        this.jlDestino = jlDestino;
    }

    public JLabel getJlTamaño() {
        return jlTamaño;
    }

    public void setJlTamaño(JLabel jlTamaño) {
        this.jlTamaño = jlTamaño;
    }

    public JLabel getJltamañorestante() {
        return jltamañorestante;
    }

    public void setJltamañorestante(JLabel jltamañorestante) {
        this.jltamañorestante = jltamañorestante;
    }

    public JTextField getJtorigen() {
        return jtorigen;
    }

    public void setJtorigen(JTextField jtorigen) {
        this.jtorigen = jtorigen;
    }

    public JTextField getJtdestino() {
        return jtdestino;
    }

    public void setJtdestino(JTextField jtdestino) {
        this.jtdestino = jtdestino;
    }

    public JTextField getJttamaño() {
        return jttamaño;
    }

    public void setJttamaño(JTextField jttamaño) {
        this.jttamaño = jttamaño;
    }

    public JTextField getJtrestante() {
        return jtrestante;
    }

    public void setJtrestante(JTextField jtrestante) {
        this.jtrestante = jtrestante;
    }

    public JButton getBotonOrigen() {
        return botonOrigen;
    }

    public void setBotonOrigen(JButton botonOrigen) {
        this.botonOrigen = botonOrigen;
    }

    public JButton getBotobnDestino() {
        return botonDestino;
    }

    public void setBotobnDestino(JButton botobnDestino) {
        this.botonDestino = botobnDestino;
    }

    public JButton getBotonOk() {
        return botonOk;
    }

    public void setBotonOk(JButton botonOk) {
        this.botonOk = botonOk;
    }

    public File getFileleer() {
        return fileleer;
    }

    public void setFileleer(File fileleer) {
        this.fileleer = fileleer;
    }

    public File getFileescribir() {
        return fileescribir;
    }

    public void setFileescribir(File fileescribir) {
        this.fileescribir = fileescribir;
    }

    public JFileChooser getChooserleer() {
        return chooserleer;
    }

    public void setChooserleer(JFileChooser chooserleer) {
        this.chooserleer = chooserleer;
    }

    public JFileChooser getChooserescribir() {
        return chooserescribir;
    }

    public void setChooserescribir(JFileChooser chooserescribir) {
        this.chooserescribir = chooserescribir;
    }

    public RandomAccessFile getRaleer() {
        return raleer;
    }

    public void setRaleer(RandomAccessFile raleer) {
        this.raleer = raleer;
    }

    public RandomAccessFile getRaescribir() {
        return raescribir;
    }

    public void setRaescribir(RandomAccessFile raescribir) {
        this.raescribir = raescribir;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try {
            raleer.close();
            
            raescribir.close();
        } catch (IOException ex) {
            Logger.getLogger(RandomAccesFileBarra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    
}
