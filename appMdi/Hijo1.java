/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appMdi;

import Barco.Barco;
import implementacion.ImplementacionDAOObjectStream;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author VESPERTINO
 */
public class Hijo1 extends javax.swing.JInternalFrame {

    ImplementacionDAOObjectStream imp = new ImplementacionDAOObjectStream();
    
    public Hijo1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelMat = new javax.swing.JLabel();
        jLabelEslora = new javax.swing.JLabel();
        jLabelFab = new javax.swing.JLabel();
        jTextFieldMatricula = new javax.swing.JTextField();
        jTextFieldEslora = new javax.swing.JTextField();
        jTextFieldAñoFab = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabelMat.setText("Matricula");

        jLabelEslora.setText("Eslora");

        jLabelFab.setText("Año de fabricación");

        jButton1.setText("Alta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Baja");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Mostrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("<-");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("->");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabelFab)
                                .addComponent(jLabelMat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelEslora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldMatricula)
                            .addComponent(jTextFieldEslora)
                            .addComponent(jTextFieldAñoFab, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMat)
                    .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEslora)
                    .addComponent(jTextFieldEslora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFab)
                    .addComponent(jTextFieldAñoFab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int matricula = Integer.parseInt(jTextFieldMatricula.getText());
        int eslora = Integer.parseInt(jTextFieldEslora.getText());
        String fechaFab = jTextFieldMatricula.getText();
        Barco b = new Barco(matricula, eslora, fechaFab);
        if(imp.borrar(b)==false){
            JOptionPane.showMessageDialog(this,"No se ha borrado porque no existe.");
        }else{
            imp.borrar(b);
            JOptionPane.showMessageDialog(this,"Barco borrado.");
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int eslora;
        try {
            int matricula = Integer.parseInt(jTextFieldMatricula.getText());            
            esRequerido(jTextFieldEslora.getText(), " Eslora");
            eslora = Integer.parseInt(jTextFieldEslora.getText());        
            esRequerido(jTextFieldAñoFab.getText(), " Fecha de Matricula");
            String fechaFab = jTextFieldAñoFab.getText();
            
            Barco b = new Barco(matricula, eslora, fechaFab);
            if(imp.añadir(b)){
                imp.añadir(b);
                JOptionPane.showMessageDialog(this,"Barco añadido.");
            }else{
                JOptionPane.showMessageDialog(this,"Ya existe el id, cambielo");            
            }        
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this,"Los campos matricula y eslora deben ser numeros enteros");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this,"En estos momentos no se puede realizar la operacion");
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void esRequerido(String dato, String nombreCampo) {
        if (dato.equals("")) {
            JOptionPane.showMessageDialog(this, "El campo " + nombreCampo + " es requerido");
            
        }
    }
            
    
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Integer mat = Integer.parseInt(jTextFieldMatricula.getText());
        Barco b= new Barco(mat);
        b=(Barco)imp.dameBarco(mat);
        if(b==null){
            JOptionPane.showMessageDialog(this, "No existe ese barco.");
        }else{
            jTextFieldEslora.setText(""+b.getEslora());
            jTextFieldAñoFab.setText(b.getAñoFabricación());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Integer mat = Integer.parseInt(jTextFieldMatricula.getText());
        Barco viejo= new Barco(mat);
        imp.dameBarco(mat);
        if(viejo==null){
            JOptionPane.showMessageDialog(this, "No existe ese barco.");
        }else{
            //datos nuevos pdiendolos por la ventana
            jLabelEslora.setText("Nueva eslora:");
            jLabelFab.setText("Nuevo año de fabricación:");
            //escribimos los datos
            int esloraNueva= Integer.parseInt(jTextFieldEslora.getText());
            String añoNuevo= jTextFieldAñoFab.getText();
            int matNueva = Integer.parseInt(jTextFieldMatricula.getText());
            //creamos el objeto nuevo
            Barco nuevo = new Barco(matNueva,esloraNueva ,añoNuevo);
            //llamamos al metodo modificar
            if(imp.modificaBarco(viejo, nuevo)==true){
                imp.modificaBarco(viejo, nuevo);
                JOptionPane.showMessageDialog(this,"Barco modificado.");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int mat = Integer.parseInt(jTextFieldMatricula.getText());
        Barco b = new Barco(mat);
        imp.dameAnterior(b);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int mat = Integer.parseInt(jTextFieldMatricula.getText());
        Barco b = new Barco(mat);
        imp.dameSiguiente(b);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        imp.guardarDatos("FicheroBarcos");
    }//GEN-LAST:event_formInternalFrameClosed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try{
        imp.cargarDatos("FicheroBarcos");
        }catch(NullPointerException n){
            
        }
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabelEslora;
    private javax.swing.JLabel jLabelFab;
    private javax.swing.JLabel jLabelMat;
    private javax.swing.JTextField jTextFieldAñoFab;
    private javax.swing.JTextField jTextFieldEslora;
    private javax.swing.JTextField jTextFieldMatricula;
    // End of variables declaration//GEN-END:variables
}
