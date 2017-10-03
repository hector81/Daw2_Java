
package velero.velero;

import java.awt.event.*;
import java.net.URL;
import javax.swing.*;

public class Modificar extends javax.swing.JInternalFrame {
    public Modificar() {
        initComponents();
        setTitle("Modificar velero");
        URL url = getClass().getResource("/javier/iconos/ok_1.png");
        ImageIcon img = new ImageIcon(url);
        
        jbModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean comprobar;
                try{
                    ImplementacionDAOVelero i = new ImplementacionDAOVelero();
                    comprobar = i.modificacion(new Velero(getJtfMatriculaVieja(), 0, 0, 0, 0, 0, 0, " ", " ", " "), new Velero(getJtfMatriculaNueva(), getJtfEslora(), getJtfManga(), getJtfPuntal(), getJtfMaxTripulacion(), getJtfAño(), getJtfNumeroMas(), getJtfMaterialConstrucion(), getJtfDescripcion(), getJtfClaseVelero()));
                    if(comprobar == true){
                        JOptionPane.showMessageDialog(null, "Velero con matricula "+getJtfMatriculaVieja()+" modificado correctamente", "Modificado", JOptionPane.DEFAULT_OPTION, img);
                    } else {
                        JOptionPane.showMessageDialog(null, "No existe un velero con matricula "+getJtfMatriculaVieja(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    ponerEnBlanco();
                } catch (NullPointerException n) {
                    System.out.println("No se puede conectar");
                } catch (NumberFormatException n){
                    JOptionPane.showMessageDialog(null, "Faltan valores por añadir", "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpModificar = new javax.swing.JPanel();
        jlbMatriculaVieja = new javax.swing.JLabel();
        jtfMatriculaVieja = new javax.swing.JTextField();
        jlbMatriculaNueva = new javax.swing.JLabel();
        jtfMatriculaNueva = new javax.swing.JTextField();
        jlbMaterialConstrucion = new javax.swing.JLabel();
        jtfMaterialConstrucion = new javax.swing.JTextField();
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
        jlbNumeroMas = new javax.swing.JLabel();
        jtfNumeroMas = new javax.swing.JTextField();
        jlbClaseVelero = new javax.swing.JLabel();
        jtfClaseVelero = new javax.swing.JTextField();
        jpBoton = new javax.swing.JPanel();
        jbModificar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jpModificar.setLayout(new java.awt.GridLayout(11, 2));

        jlbMatriculaVieja.setText("Matrícula (Vieja)");
        jpModificar.add(jlbMatriculaVieja);

        jtfMatriculaVieja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMatriculaViejaActionPerformed(evt);
            }
        });
        jpModificar.add(jtfMatriculaVieja);

        jlbMatriculaNueva.setText("Matricula");
        jpModificar.add(jlbMatriculaNueva);

        jtfMatriculaNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMatriculaNuevaActionPerformed(evt);
            }
        });
        jpModificar.add(jtfMatriculaNueva);

        jlbMaterialConstrucion.setText("Material de construción");
        jpModificar.add(jlbMaterialConstrucion);
        jpModificar.add(jtfMaterialConstrucion);

        jlbDescripcion.setText("Descripción");
        jpModificar.add(jlbDescripcion);
        jpModificar.add(jtfDescripcion);

        jlbEslora.setText("Eslora");
        jpModificar.add(jlbEslora);
        jpModificar.add(jtfEslora);

        jlbManga.setText("Manga");
        jpModificar.add(jlbManga);
        jpModificar.add(jtfManga);

        jlbPuntal.setText("Puntal");
        jpModificar.add(jlbPuntal);

        jtfPuntal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPuntalActionPerformed(evt);
            }
        });
        jpModificar.add(jtfPuntal);

        jlbMaxTripulacion.setText("Máxima tripulación");
        jpModificar.add(jlbMaxTripulacion);
        jpModificar.add(jtfMaxTripulacion);

        jlbAño.setText("Año");
        jpModificar.add(jlbAño);
        jpModificar.add(jtfAño);

        jlbNumeroMas.setText("Número mas");
        jpModificar.add(jlbNumeroMas);

        jtfNumeroMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNumeroMasActionPerformed(evt);
            }
        });
        jpModificar.add(jtfNumeroMas);

        jlbClaseVelero.setText("Clase velero");
        jpModificar.add(jlbClaseVelero);
        jpModificar.add(jtfClaseVelero);

        getContentPane().add(jpModificar);

        jbModificar.setText("Modificar");
        jpBoton.add(jbModificar);

        getContentPane().add(jpBoton);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfMatriculaNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMatriculaNuevaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMatriculaNuevaActionPerformed

    private void jtfMatriculaViejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMatriculaViejaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMatriculaViejaActionPerformed

    private void jtfPuntalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPuntalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPuntalActionPerformed

    private void jtfNumeroMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNumeroMasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNumeroMasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbModificar;
    private javax.swing.JLabel jlbAño;
    private javax.swing.JLabel jlbClaseVelero;
    private javax.swing.JLabel jlbDescripcion;
    private javax.swing.JLabel jlbEslora;
    private javax.swing.JLabel jlbManga;
    private javax.swing.JLabel jlbMaterialConstrucion;
    private javax.swing.JLabel jlbMatriculaNueva;
    private javax.swing.JLabel jlbMatriculaVieja;
    private javax.swing.JLabel jlbMaxTripulacion;
    private javax.swing.JLabel jlbNumeroMas;
    private javax.swing.JLabel jlbPuntal;
    private javax.swing.JPanel jpBoton;
    private javax.swing.JPanel jpModificar;
    private javax.swing.JTextField jtfAño;
    private javax.swing.JTextField jtfClaseVelero;
    private javax.swing.JTextField jtfDescripcion;
    private javax.swing.JTextField jtfEslora;
    private javax.swing.JTextField jtfManga;
    private javax.swing.JTextField jtfMaterialConstrucion;
    private javax.swing.JTextField jtfMatriculaNueva;
    private javax.swing.JTextField jtfMatriculaVieja;
    private javax.swing.JTextField jtfMaxTripulacion;
    private javax.swing.JTextField jtfNumeroMas;
    private javax.swing.JTextField jtfPuntal;
    // End of variables declaration//GEN-END:variables

    public int getJtfAño() {
        return Integer.parseInt(jtfAño.getText());
    }

    public String getJtfClaseVelero() {
        return jtfClaseVelero.getText();
    }

    public String getJtfDescripcion() {
        return jtfDescripcion.getText();
    }

    public int getJtfEslora() {
        return Integer.parseInt(jtfEslora.getText());
    }

    public int getJtfManga() {
        return Integer.parseInt(jtfManga.getText());
    }

    public String getJtfMaterialConstrucion() {
        return jtfMaterialConstrucion.getText();
    }

    public String getJtfMatriculaNueva() {
        return jtfMatriculaNueva.getText();
    }

    public String getJtfMatriculaVieja() {
        return jtfMatriculaVieja.getText();
    }

    public int getJtfMaxTripulacion() {
        return Integer.parseInt(jtfMaxTripulacion.getText());
    }

    public int getJtfNumeroMas() {
        return Integer.parseInt(jtfNumeroMas.getText());
    }

    public int getJtfPuntal() {
        return Integer.parseInt(jtfPuntal.getText());
    }
    
    public void ponerEnBlanco() {
        jtfMatriculaVieja.setText("");
        jtfMatriculaNueva.setText("");
        jtfMaterialConstrucion.setText("");
        jtfDescripcion.setText("");
        jtfEslora.setText("");
        jtfManga.setText("");
        jtfPuntal.setText("");
        jtfMaxTripulacion.setText("");
        jtfAño.setText("");
        jtfNumeroMas.setText("");
        jtfClaseVelero.setText("");
    }

}
