/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import logica.Carrera;
import logica.Corredor;
import logica.LogicaNegocio;
import util.Util;

/**
 *
 * @author Pelayo
 */
public class PantallaCarreras extends javax.swing.JDialog {

    private LogicaNegocio logica;
    private JFrame parent;
    

    public PantallaCarreras(java.awt.Frame parent, boolean modal, LogicaNegocio ln) {
        super(parent, modal);
        this.parent = (JFrame) parent;
        logica = ln;

        initComponents();
        this.setLocationRelativeTo(this);
        rellenarTablaCarreras();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonDarAlta = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCarreras = new javax.swing.JTable();
        jLabelTituloCarreras = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCarrerasFinalizadas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButtonDarAlta.setText(org.openide.util.NbBundle.getMessage(PantallaCarreras.class, "PantallaCarreras.jButtonDarAlta.text")); // NOI18N
        jButtonDarAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDarAltaActionPerformed(evt);
            }
        });

        jButtonModificar.setText(org.openide.util.NbBundle.getMessage(PantallaCarreras.class, "PantallaCarreras.jButtonModificar.text")); // NOI18N
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jTableCarreras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableCarreras);

        jLabelTituloCarreras.setText(org.openide.util.NbBundle.getMessage(PantallaCarreras.class, "PantallaCarreras.jLabelTituloCarreras.text")); // NOI18N

        jTableCarrerasFinalizadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableCarrerasFinalizadas);

        jLabel1.setText(org.openide.util.NbBundle.getMessage(PantallaCarreras.class, "PantallaCarreras.jLabel1.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabelTituloCarreras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonDarAlta)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTituloCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModificar)
                    .addComponent(jButtonDarAlta))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDarAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDarAltaActionPerformed
        JDialog d = new PantallaAltaCarrera(parent, true, logica, 1);
        d.setVisible(true);
        d.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        rellenarTablaCarreras();
        logica.guardarEnFichero();

    }//GEN-LAST:event_jButtonDarAltaActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        int seleccionado = jTableCarreras.getSelectedRow();

        if (seleccionado == -1) {
            JOptionPane.showMessageDialog(this, "Tienes que seleccionar la carrera que quieres modificar", "Titulo", JOptionPane.INFORMATION_MESSAGE);

        } else {
            Carrera carreraSelecionada = logica.getListaCarreras().get(seleccionado);
            logica.setCarreraSelecionada(carreraSelecionada);
            logica.getListaCarreras().remove(carreraSelecionada);
            JDialog d = new PantallaAltaCarrera(parent, true, logica, 2);
            d.setVisible(true);
            d.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            rellenarTablaCarreras();
            logica.guardarEnFichero();
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed
    
    private void rellenarTablaCarreras() {
        String[] columnas = {"Nombre", "Fecha", "Lugar", "Num max Participantes"};
        DefaultTableModel dtm = new DefaultTableModel(columnas, 0);
        DefaultTableModel dtmFinalizada = new DefaultTableModel(columnas, 0);
        for (Carrera c : logica.getListaCarreras()) {
            String[] a = new String[4];
            a[0] = c.getNombreCarrera();
            a[1] = Util.formatearFechaDateAString(c.getFechaCarrera());
            a[2] = c.getLugarCarrera();
            a[3] = String.valueOf(c.getMaximoCorredores());
            
            if(!c.isFinalizada()){
              dtm.addRow(a);  
            }else{
                dtmFinalizada.addRow(a);
            }
            
        }
        jTableCarreras.setModel(dtm);
        jTableCarrerasFinalizadas.setModel(dtmFinalizada);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDarAlta;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelTituloCarreras;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCarreras;
    private javax.swing.JTable jTableCarrerasFinalizadas;
    // End of variables declaration//GEN-END:variables
}
