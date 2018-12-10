
package Interfaz;

import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import logica.LogicaNegocio;

/**
 *
 * @author Pelayo
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    private LogicaNegocio logica;
     private static final String RUTA_LOGO ="/imgs/corredor.png"; 
     private static final String RUTA_LOGO2 ="/imgs/dicarreras.png";
    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() {
        logica = LogicaNegocio.getInstance();
        logica.leerFichero();
        logica.leerFicheroCarreras();
        initComponents();
        this.setLocationRelativeTo(this);
        jLabelFoto.setIcon(new ImageIcon(getClass().getResource(RUTA_LOGO)));
        jLabelFoto2.setIcon(new ImageIcon(getClass().getResource(RUTA_LOGO2)));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCarreras = new javax.swing.JButton();
        jButtonCorredores = new javax.swing.JButton();
        jLabelFoto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelFoto2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonCarreras.setText(org.openide.util.NbBundle.getMessage(PantallaPrincipal.class, "PantallaPrincipal.jButtonCarreras.text")); // NOI18N
        jButtonCarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarrerasActionPerformed(evt);
            }
        });

        jButtonCorredores.setText(org.openide.util.NbBundle.getMessage(PantallaPrincipal.class, "PantallaPrincipal.jButtonCorredores.text")); // NOI18N
        jButtonCorredores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCorredoresActionPerformed(evt);
            }
        });

        jLabelFoto.setText(org.openide.util.NbBundle.getMessage(PantallaPrincipal.class, "PantallaPrincipal.jLabelFoto.text")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText(org.openide.util.NbBundle.getMessage(PantallaPrincipal.class, "PantallaPrincipal.jLabel1.text")); // NOI18N
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabelFoto2.setText(org.openide.util.NbBundle.getMessage(PantallaPrincipal.class, "PantallaPrincipal.jLabelFoto2.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(jLabelFoto2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jButtonCorredores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelFoto2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCorredores)
                    .addComponent(jButtonCarreras))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarrerasActionPerformed
        JDialog d = new PantallaCarreras(this, true,logica);
        d.setVisible(true);
        d.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButtonCarrerasActionPerformed

    private void jButtonCorredoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCorredoresActionPerformed
        JDialog d = new PantallaCorredores(this, true);
        d.setVisible(true);
        d.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButtonCorredoresActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Locale.setDefault(new Locale("es", "ES"));
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCarreras;
    private javax.swing.JButton jButtonCorredores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelFoto2;
    // End of variables declaration//GEN-END:variables
}
