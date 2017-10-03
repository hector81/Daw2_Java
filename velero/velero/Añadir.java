
package velero.velero;

import java.awt.event.*;
import java.net.URL;
import javax.swing.*;

public class Añadir extends javax.swing.JInternalFrame {
    public Añadir() {
        initComponents();
        setTitle("Añadir velero");
        URL url = getClass().getResource("/javier/iconos/ok_1.png");
        ImageIcon img = new ImageIcon(url);
        
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean comprobar;
                try{
                    ImplementacionDAOVelero i = new ImplementacionDAOVelero();
                    comprobar = i.alta(new Velero(getJTFMatricula(),getJTFEslora(), getJTFManga(),getJTFPuntal(), getJTFMaxTripulacion(),getJTFAño(),getJTFNumMas(),getJTFMaterialConstruccion(), getJTFDescripcion(), getJTFClaseVelero()));
                    if(comprobar == true){
                        JOptionPane.showMessageDialog(null, "Añadido velero con matricula "+getJTFMatricula(), "Añadido", JOptionPane.DEFAULT_OPTION, img);
                    }                        
                    ponerEnBlanco();
                } catch (NullPointerException n) {
                    System.out.println("No existe conexión");
                } catch (NumberFormatException n){
                    JOptionPane.showMessageDialog(null, "Faltan valores por añadir", "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpAñadir = new javax.swing.JPanel();
        jlbMatricula = new javax.swing.JLabel();
        jtfMatricula = new javax.swing.JTextField();
        jlbMaterial = new javax.swing.JLabel();
        jtfMaterial = new javax.swing.JTextField();
        jlbDescripcion = new javax.swing.JLabel();
        jtfDescripcion = new javax.swing.JTextField();
        jlbEslora = new javax.swing.JLabel();
        jtfEslora = new javax.swing.JTextField();
        jlbManga = new javax.swing.JLabel();
        jtfManga = new javax.swing.JTextField();
        jlbPuntal = new javax.swing.JLabel();
        jtfPuntal = new javax.swing.JTextField();
        jlbMaxTripulacion = new javax.swing.JLabel();
        jtfMaxTripulacion = new javax.swing.JTextField();
        jlbAño = new javax.swing.JLabel();
        jtfAño = new javax.swing.JTextField();
        jlbNumMas = new javax.swing.JLabel();
        jtfNumMas = new javax.swing.JTextField();
        jlbClaseVelero = new javax.swing.JLabel();
        jtfClaseVelero = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        jpAñadir.setLayout(new java.awt.GridLayout(10, 2, 5, 5));

        jlbMatricula.setText("Matricula");
        jpAñadir.add(jlbMatricula);

        jtfMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMatriculaActionPerformed(evt);
            }
        });
        jpAñadir.add(jtfMatricula);

        jlbMaterial.setText("Material de construción");
        jpAñadir.add(jlbMaterial);
        jpAñadir.add(jtfMaterial);

        jlbDescripcion.setText("Descripción");
        jpAñadir.add(jlbDescripcion);
        jpAñadir.add(jtfDescripcion);

        jlbEslora.setText("Eslora");
        jpAñadir.add(jlbEslora);
        jpAñadir.add(jtfEslora);

        jlbManga.setText("Manga");
        jpAñadir.add(jlbManga);

        jtfManga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMangaActionPerformed(evt);
            }
        });
        jpAñadir.add(jtfManga);

        jlbPuntal.setText("Puntal");
        jpAñadir.add(jlbPuntal);
        jpAñadir.add(jtfPuntal);

        jlbMaxTripulacion.setText("Máxima tripulación");
        jpAñadir.add(jlbMaxTripulacion);
        jpAñadir.add(jtfMaxTripulacion);

        jlbAño.setText("Año");
        jpAñadir.add(jlbAño);
        jpAñadir.add(jtfAño);

        jlbNumMas.setText("Numero Mas");
        jpAñadir.add(jlbNumMas);

        jtfNumMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNumMasActionPerformed(evt);
            }
        });
        jpAñadir.add(jtfNumMas);

        jlbClaseVelero.setText("Clase velero");
        jpAñadir.add(jlbClaseVelero);
        jpAñadir.add(jtfClaseVelero);

        jPanel1.add(jpAñadir);

        jButton1.setText("Añadir");
        jPanel2.add(jButton1);

        jPanel1.add(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMatriculaActionPerformed

    private void jtfMangaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMangaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMangaActionPerformed

    private void jtfNumMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNumMasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNumMasActionPerformed

    public String getJTFMatricula(){
        return jtfMatricula.getText();
    }
    
    public String getJTFMaterialConstruccion(){
        return jtfMaterial.getText();
    }

    public void setJtfAño(JTextField jtfAño) {
        this.jtfAño = jtfAño;
    }

    public void setJtfClaseVelero(JTextField jtfClaseVelero) {
        this.jtfClaseVelero = jtfClaseVelero;
    }

    public void setJtfDescripcion(JTextField jtfDescripcion) {
        this.jtfDescripcion = jtfDescripcion;
    }

    public void setJtfEslora(JTextField jtfEslora) {
        this.jtfEslora = jtfEslora;
    }

    public void setJtfManga(JTextField jtfManga) {
        this.jtfManga = jtfManga;
    }

    public void setJtfMaterial(JTextField jtfMaterial) {
        this.jtfMaterial = jtfMaterial;
    }

    public void setJtfMatricula(JTextField jtfMatricula) {
        this.jtfMatricula = jtfMatricula;
    }

    public void setJtfMaxTripulacion(JTextField jtfMaxTripulacion) {
        this.jtfMaxTripulacion = jtfMaxTripulacion;
    }

    public void setJtfNumMas(JTextField jtfNumMas) {
        this.jtfNumMas = jtfNumMas;
    }

    public void setJtfPuntal(JTextField jtfPuntal) {
        this.jtfPuntal = jtfPuntal;
    }
    
    public String getJTFDescripcion() {
        return jtfDescripcion.getText();
    }
    
    public int getJTFEslora() {
        return Integer.parseInt(jtfEslora.getText());
    }
    
    public int getJTFManga() {
        return Integer.parseInt(jtfManga.getText());
    }
    
    public int getJTFPuntal() {
        return Integer.parseInt(jtfPuntal.getText());
    }
    
    public int getJTFMaxTripulacion() {
        return Integer.parseInt(jtfMaxTripulacion.getText());
    }
    
    public int getJTFAño() {
        return Integer.parseInt(jtfAño.getText());
    }
    
    public int getJTFNumMas() {
        return Integer.parseInt(jtfNumMas.getText());
    }
    
    public String getJTFClaseVelero() {
        return jtfClaseVelero.getText();
    }
    
    public void ponerEnBlanco() {
        jtfMatricula.setText("");
        jtfMaterial.setText("");
        jtfDescripcion.setText("");
        jtfEslora.setText("");
        jtfManga.setText("");
        jtfPuntal.setText("");
        jtfMaxTripulacion.setText("");
        jtfAño.setText("");
        jtfNumMas.setText("");
        jtfClaseVelero.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlbAño;
    private javax.swing.JLabel jlbClaseVelero;
    private javax.swing.JLabel jlbDescripcion;
    private javax.swing.JLabel jlbEslora;
    private javax.swing.JLabel jlbManga;
    private javax.swing.JLabel jlbMaterial;
    private javax.swing.JLabel jlbMatricula;
    private javax.swing.JLabel jlbMaxTripulacion;
    private javax.swing.JLabel jlbNumMas;
    private javax.swing.JLabel jlbPuntal;
    private javax.swing.JPanel jpAñadir;
    private javax.swing.JTextField jtfAño;
    private javax.swing.JTextField jtfClaseVelero;
    private javax.swing.JTextField jtfDescripcion;
    private javax.swing.JTextField jtfEslora;
    private javax.swing.JTextField jtfManga;
    private javax.swing.JTextField jtfMaterial;
    private javax.swing.JTextField jtfMatricula;
    private javax.swing.JTextField jtfMaxTripulacion;
    private javax.swing.JTextField jtfNumMas;
    private javax.swing.JTextField jtfPuntal;
    // End of variables declaration//GEN-END:variables

    

}
