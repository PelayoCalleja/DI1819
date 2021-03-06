/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Carrera;
import logica.Corredor;
import logica.LogicaNegocio;
import util.Util;

/**
 *
 * @author Pelayo
 */
public class Ejercicio1 extends javax.swing.JDialog {

    private LogicaNegocio logica;

    public Ejercicio1(java.awt.Frame parent, boolean modal, LogicaNegocio ln) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(this);
        logica = ln;
        rellenarTablaCorredores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCorredores = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListCarreras = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableCorredores.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableCorredores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCorredoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCorredores);

        jScrollPane2.setViewportView(jListCarreras);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText(org.openide.util.NbBundle.getMessage(Ejercicio1.class, "Ejercicio1.jLabel1.text")); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1)))
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableCorredoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCorredoresMouseClicked
        int seleccionado = jTableCorredores.getSelectedRow();
        if (seleccionado == -1) {
        } else {
            Corredor corredorSelecionado = logica.getListaCorredores().get(seleccionado);
            logica.setCorredorSelecionado(corredorSelecionado);
            rellenarLista();
        }
     }//GEN-LAST:event_jTableCorredoresMouseClicked

    private void rellenarTablaCorredores() {
        String[] columnas = {"Nombre", "DNI", "Fecha"};
        DefaultTableModel dtm = new DefaultTableModel(columnas, 0);
        for (Corredor c : logica.getListaCorredores()) {
            String[] a = new String[3];
            a[0] = c.getNombre();
            a[1] = c.getDni();
            a[2] = Util.formatearFechaDateAString(c.getFechaNacimiento());
            dtm.addRow(a);
        }
        jTableCorredores.setModel(dtm);
    }

    private void rellenarLista() {
        DefaultListModel dlm = new DefaultListModel();
        ArrayList<Carrera> carrera = (ArrayList<Carrera>) logica.getListaCarreras();
        for (int j = 0; j < logica.getListaCarreras().size(); j++) {
            dlm.addElement(carrera.get(j).getNombreCarrera());
        }
        jListCarreras.setModel(dlm);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jListCarreras;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCorredores;
    // End of variables declaration//GEN-END:variables
}
