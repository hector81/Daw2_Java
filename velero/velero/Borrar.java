
package velero.velero;

import java.awt.event.*;
import java.net.URL;
import javax.swing.*;

public class Borrar extends javax.swing.JInternalFrame {
    public Borrar() {
        initComponents();
        setTitle("Borrar");
        URL url = getClass().getResource("/javier/iconos/ok_1.png");
        ImageIcon img = new ImageIcon(url);
        
        jbBorrar.addActionListener((ActionEvent e) -> {
            boolean comprobar;
            try{
                ImplementacionDAOVelero i = new ImplementacionDAOVelero();
                comprobar = i.baja(new Velero(getJTFBorrar(), 0, 0, 0, 0, 0, 0, " ", " ", " "));
                if(comprobar == true) {
                    JOptionPane.showMessageDialog(null, "Borrado velero con matricula "+getJTFBorrar(), "Borrado", JOptionPane.DEFAULT_OPTION, img);
                } else {
                    JOptionPane.showMessageDialog(null, "No existe un velero con matricula "+getJTFBorrar(), "Error", JOptionPane.ERROR_MESSAGE);
                }
                ponerEnBlanco();
            } catch (NullPointerException n){
                System.out.println("No existe conexión");
            } catch (NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Faltan valores por añadir", "Error", JOptionPane.WARNING_MESSAGE);
            }
        });
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBorrar = new javax.swing.JPanel();
        jtfBorrar = new javax.swing.JTextField();
        jbBorrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jtfBorrar.setColumns(15);
        jpBorrar.add(jtfBorrar);

        jbBorrar.setText("Borrar");
        jpBorrar.add(jbBorrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String getJTFBorrar() {
        return jtfBorrar.getText();
    }
    
    public void ponerEnBlanco() {
        jtfBorrar.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbBorrar;
    private javax.swing.JPanel jpBorrar;
    private javax.swing.JTextField jtfBorrar;
    // End of variables declaration//GEN-END:variables
}
