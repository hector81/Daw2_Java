/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VeranoRepaso;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class CopiarArchivoBarra extends JFrame implements ActionListener, WindowListener{
    private JPanel panelnorte, panelsur;
    private JLabel jlOrigen, jlDestino, jlTamaño,jlnumeroLineas;
    private JTextField jtorigen, jtdestino, jttamaño, jtnumeroLineas;
    private JButton botonOrigen, botonDestino, botonOk;
    private File fileleer, fileescribir;
    private JFileChooser chooserleer, chooserescribir;
    private JProgressBar barra;
    private CopiarArchivoBarra c;

    public CopiarArchivoBarra() {
        this.getContentPane().setLayout(new BorderLayout());
        this.panelnorte = new JPanel(new GridLayout(2, 3));
        this.panelsur = new JPanel();
        panelsur.setLayout(new BoxLayout(panelsur, BoxLayout.Y_AXIS));
        
        barra = new JProgressBar(0,100);
        barra.setStringPainted(true);
                
        this.jlOrigen = new JLabel("ORIGEN");
        this.jlDestino = new JLabel("DESTINO");
        this.jlTamaño = new JLabel("TAMAÑO");
        this.jlnumeroLineas = new JLabel("NUMERO LINEAS");
        
        this.jtorigen= new JTextField(20);
        this.jtdestino= new JTextField(20);
        this.jttamaño= new JTextField(20);
        this.jtnumeroLineas= new JTextField(20);
     
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
        panelsur.add(jlnumeroLineas);
        panelsur.add(jtnumeroLineas);
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
                fileleer = chooserleer.getSelectedFile();
                jtorigen.setText(fileleer.getPath());                
            }
        }else if(e.getSource() == botonDestino){
            int returnValor = chooserescribir.showSaveDialog(this);
            if(returnValor == JFileChooser.APPROVE_OPTION){
                fileescribir = chooserescribir.getSelectedFile();
                jtdestino.setText(fileescribir.getPath());
            }
        }else if (e.getSource() == botonOk) {           
            //poner tamaño archivo
            jttamaño.setText(Long.toString(fileleer.length()));
           
            long diferencia = fileleer.length()- Long.parseLong(jttamaño.getText());
            int nu = leerLineas();
            jtnumeroLineas.setText(Integer.toString(nu));
            
            CopiarArchivoBarraHilo ch = new CopiarArchivoBarraHilo(this);
            Thread t = new Thread(ch);
            t.start();
        }
    } 
    
    public static void main(String[] args) {
        CopiarArchivoBarra c= new CopiarArchivoBarra();
    }

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
        return jlnumeroLineas;
    }

    public void setJltamañorestante(JLabel jltamañorestante) {
        this.jlnumeroLineas = jltamañorestante;
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
        return jtnumeroLineas;
    }

    public void setJtrestante(JTextField jtrestante) {
        this.jtnumeroLineas = jtrestante;
    }

    public JButton getBotonOrigen() {
        return botonOrigen;
    }

    public void setBotonOrigen(JButton botonOrigen) {
        this.botonOrigen = botonOrigen;
    }

    public JButton getBotonDestino() {
        return botonDestino;
    }

    public void setBotonDestino(JButton botonDestino) {
        this.botonDestino = botonDestino;
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

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public CopiarArchivoBarra getC() {
        return c;
    }

    public void setC(CopiarArchivoBarra c) {
        this.c = c;
    }
    
    public int leerLineas() {
        FileReader fr = null;
        BufferedReader br = null;
        int sumaN = 0;
        String linea;
        try {
            fr = new FileReader(fileleer);
            br = new BufferedReader(fr);
            linea = br.readLine();
            while (linea != null) {
                sumaN ++;
                linea = br.readLine();
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(CopiarArchivoBarra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CopiarArchivoBarra.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(CopiarArchivoBarra.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return sumaN;
    }
}
