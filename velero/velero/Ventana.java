
package velero.velero;

public class Ventana extends javax.swing.JFrame {
    public Ventana() {
        initComponents();
        setTitle("Base de datos veleros");
        setExtendedState(MAXIMIZED_BOTH);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        jmiConsulta = new javax.swing.JMenuItem();
        jmiAñadir = new javax.swing.JMenuItem();
        jmiBorrar = new javax.swing.JMenuItem();
        jmiModificar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Veleros");

        jmiConsulta.setMnemonic('o');
        jmiConsulta.setText("Consulta");
        jmiConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultaActionPerformed(evt);
            }
        });
        fileMenu.add(jmiConsulta);

        jmiAñadir.setMnemonic('s');
        jmiAñadir.setText("Añadir");
        jmiAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAñadirActionPerformed(evt);
            }
        });
        fileMenu.add(jmiAñadir);

        jmiBorrar.setMnemonic('a');
        jmiBorrar.setText("Borrar");
        jmiBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBorrarActionPerformed(evt);
            }
        });
        fileMenu.add(jmiBorrar);

        jmiModificar.setMnemonic('x');
        jmiModificar.setText("Modificar");
        jmiModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiModificarActionPerformed(evt);
            }
        });
        fileMenu.add(jmiModificar);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiModificarActionPerformed
        Modificar modificar = new Modificar();
        desktopPane.add(modificar);
        modificar.setVisible(true);
    }//GEN-LAST:event_jmiModificarActionPerformed

    private void jmiBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBorrarActionPerformed
        Borrar borrar = new Borrar();
        desktopPane.add(borrar);
        borrar.setVisible(true);
    }//GEN-LAST:event_jmiBorrarActionPerformed

    private void jmiAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAñadirActionPerformed
        Añadir añadir = new Añadir();
        desktopPane.add(añadir);
        añadir.setVisible(true);
    }//GEN-LAST:event_jmiAñadirActionPerformed

    private void jmiConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultaActionPerformed
        Consulta consulta = new Consulta();
        desktopPane.add(consulta);
        consulta.setVisible(true);
    }//GEN-LAST:event_jmiConsultaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem jmiAñadir;
    private javax.swing.JMenuItem jmiBorrar;
    private javax.swing.JMenuItem jmiConsulta;
    private javax.swing.JMenuItem jmiModificar;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
