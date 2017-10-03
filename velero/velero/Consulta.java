
package velero.velero;

import java.awt.event.*;
import javax.swing.JOptionPane;

public class Consulta extends javax.swing.JInternalFrame {
    public Consulta() {
        setTitle("Consulta");
        initComponents();
        
        jbConsulta.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    ImplementacionDAOVelero i = new ImplementacionDAOVelero();
                    i.consulta(new Velero(getJTFConsulta(), 0, 0, 0, 0, 0, 0, " ", " ", " "));
                    ponerEnBlanco();
                } catch (NullPointerException n ){
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

        jpConsulta = new javax.swing.JPanel();
        jtfConsulta = new javax.swing.JTextField();
        jbConsulta = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jtfConsulta.setColumns(15);
        jtfConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfConsultaActionPerformed(evt);
            }
        });
        jpConsulta.add(jtfConsulta);

        jbConsulta.setText("Buscar");
        jpConsulta.add(jbConsulta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpConsulta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfConsultaActionPerformed

    public String getJTFConsulta() {
        return jtfConsulta.getText();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbConsulta;
    private javax.swing.JPanel jpConsulta;
    private javax.swing.JTextField jtfConsulta;
    // End of variables declaration//GEN-END:variables
    
    public void ponerEnBlanco() {
        jtfConsulta.setText("");
    }
}
