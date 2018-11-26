/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import logica.Carrera;
import logica.Corredor;
import logica.LogicaNegocio;

/**
 *
 * @author Pelayo
 */
public class PantallaAltaCarrera extends javax.swing.JDialog {

    private LogicaNegocio logica;
    private int accion;
    private ArrayList<Corredor> provisionalAdd;
    private ArrayList<Corredor> provisionalDisponibles;

    /**
     * Creates new form PantallaAltaCarrera
     */
    public PantallaAltaCarrera(java.awt.Frame parent, boolean modal, LogicaNegocio ln, int accion) {
        super(parent, modal);
        logica = ln;
        this.accion = accion;

        initComponents();
        this.setLocationRelativeTo(this);

        if (accion == 1) {//Alta
            jLabelAltaCarrera.setText("Alta Carreras");
            provisionalAdd = new ArrayList<>();
            provisionalDisponibles = new ArrayList<>(logica.getListaCorredores());

        } else if (accion == 2) {//Modificar
            jLabelAltaCarrera.setText("Modificar Carreras");

            Carrera c = logica.getCarreraSelecionada();

            provisionalAdd = c.getListaCorredores();
            provisionalDisponibles = new ArrayList<>(logica.corredoresDisponiblesCarrera(c));//

            jTextFieldNombre.setText(c.getNombreCarrera());
            jSpinnerFecha.setValue(c.getFechaCarrera());
            jTextFieldLugar.setText(c.getLugarCarrera());
            jTextFieldMaximoCorredores.setText(String.valueOf(c.getMaximoCorredores()));

        }

        mostrarListaDisponible();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAltaCarrera = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelLugar = new javax.swing.JLabel();
        jLabelNumMax = new javax.swing.JLabel();
        jLabelListaCorredores = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jSpinnerFecha = new javax.swing.JSpinner();
        jTextFieldLugar = new javax.swing.JTextField();
        jTextFieldMaximoCorredores = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListInscritos = new javax.swing.JList<>();
        jButtonAceptar = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jButtonInscribirCorredor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListDisponibles = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelAltaCarrera.setText(org.openide.util.NbBundle.getMessage(PantallaAltaCarrera.class, "PantallaAltaCarrera.jLabelAltaCarrera.text")); // NOI18N

        jLabelNombre.setText(org.openide.util.NbBundle.getMessage(PantallaAltaCarrera.class, "PantallaAltaCarrera.jLabelNombre.text")); // NOI18N

        jLabelFecha.setText(org.openide.util.NbBundle.getMessage(PantallaAltaCarrera.class, "PantallaAltaCarrera.jLabelFecha.text")); // NOI18N

        jLabelLugar.setText(org.openide.util.NbBundle.getMessage(PantallaAltaCarrera.class, "PantallaAltaCarrera.jLabelLugar.text")); // NOI18N

        jLabelNumMax.setText(org.openide.util.NbBundle.getMessage(PantallaAltaCarrera.class, "PantallaAltaCarrera.jLabelNumMax.text")); // NOI18N

        jLabelListaCorredores.setText(org.openide.util.NbBundle.getMessage(PantallaAltaCarrera.class, "PantallaAltaCarrera.jLabelListaCorredores.text")); // NOI18N

        jTextFieldNombre.setText(org.openide.util.NbBundle.getMessage(PantallaAltaCarrera.class, "PantallaAltaCarrera.jTextFieldNombre.text")); // NOI18N

        jSpinnerFecha.setModel(new javax.swing.SpinnerDateModel());

        jTextFieldLugar.setText(org.openide.util.NbBundle.getMessage(PantallaAltaCarrera.class, "PantallaAltaCarrera.jTextFieldLugar.text")); // NOI18N

        jTextFieldMaximoCorredores.setText(org.openide.util.NbBundle.getMessage(PantallaAltaCarrera.class, "PantallaAltaCarrera.jTextFieldMaximoCorredores.text")); // NOI18N

        jScrollPane1.setViewportView(jListInscritos);

        jButtonAceptar.setText(org.openide.util.NbBundle.getMessage(PantallaAltaCarrera.class, "PantallaAltaCarrera.jButtonAceptar.text")); // NOI18N
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonBorrar.setText(org.openide.util.NbBundle.getMessage(PantallaAltaCarrera.class, "PantallaAltaCarrera.jButtonBorrar.text")); // NOI18N
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jButtonInscribirCorredor.setText(org.openide.util.NbBundle.getMessage(PantallaAltaCarrera.class, "PantallaAltaCarrera.jButtonInscribirCorredor.text")); // NOI18N
        jButtonInscribirCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInscribirCorredorActionPerformed(evt);
            }
        });

        jLabel1.setText(org.openide.util.NbBundle.getMessage(PantallaAltaCarrera.class, "PantallaAltaCarrera.jLabel1.text")); // NOI18N

        jScrollPane2.setViewportView(jListDisponibles);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFecha)
                    .addComponent(jLabelLugar)
                    .addComponent(jLabelNumMax)
                    .addComponent(jLabelListaCorredores)
                    .addComponent(jLabelNombre)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAceptar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBorrar)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jButtonInscribirCorredor)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSpinnerFecha)
                            .addComponent(jTextFieldLugar)
                            .addComponent(jTextFieldMaximoCorredores)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabelAltaCarrera))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabelAltaCarrera)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFecha)
                    .addComponent(jSpinnerFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLugar)
                    .addComponent(jTextFieldLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumMax)
                    .addComponent(jTextFieldMaximoCorredores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabelListaCorredores)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar)
                    .addComponent(jButtonBorrar)
                    .addComponent(jButtonInscribirCorredor))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarListaDisponible() {
        DefaultListModel dlm1 = new DefaultListModel();
        System.out.println("Disponible");
        if (accion == 1) {//Alta
            for (Corredor c : provisionalDisponibles) {
                dlm1.addElement(c);
                System.out.println(c);
            }
            jListDisponibles.setModel(dlm1);
        } else {//Modificar
            Carrera c = logica.getCarreraSelecionada();
        }
    }

    private void mostrarListaInscritos() {
        DefaultListModel dlm2 = new DefaultListModel();
        System.out.println("Inscritos");
        if (accion == 1) {//Alta

            for (Corredor c : provisionalAdd) {
                dlm2.addElement(c);
                System.out.println(c);
            }

        } else {
            Carrera c = logica.getCarreraSelecionada();
        }
        jListInscritos.setModel(dlm2);

    }


    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        String nombre = jTextFieldNombre.getText();
        Date fecha = (Date) jSpinnerFecha.getValue();//hacer cast a fecha
        String lugar = jTextFieldLugar.getText();
        int numMax = Integer.valueOf(jTextFieldMaximoCorredores.getText());

        if (accion == 1) {//Alta    

            
            int resultado = JOptionPane.showConfirmDialog(this, "¿Quieres dar de alta la carrera?", "Título", JOptionPane.YES_NO_OPTION);
            if (resultado == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, "La carrera ha sido creada", "Titulo", JOptionPane.INFORMATION_MESSAGE);
                logica.altaCarrera(nombre, fecha, lugar, numMax, provisionalAdd);
                //logica.altaCarrera(nombre, fecha, lugar, numMax,provisionalAdd);
            } else if (resultado == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(this, "Los datos de la carrera han sido borrados", "Titulo", JOptionPane.INFORMATION_MESSAGE);

            }
        } else {//Modificar

            int resultado = JOptionPane.showConfirmDialog(this, "¿Quieres modificar la carrera?", "Título", JOptionPane.YES_NO_OPTION);
            if (resultado == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, "La carrera ha sido modificada", "Titulo", JOptionPane.INFORMATION_MESSAGE);
                logica.altaCarrera(nombre, fecha, lugar, numMax, provisionalAdd);
            } else if (resultado == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(this, "La carrera  no ha sido modificada", "Titulo", JOptionPane.INFORMATION_MESSAGE);
                logica.getListaCarreras().add(logica.getCarreraSelecionada());
            }
            logica.setCarreraSelecionada(null);
        }
        /*if (accion == 1) {
            int resultado = JOptionPane.showConfirmDialog(this, "¿Quieres darte de alta?", "Título", JOptionPane.YES_NO_OPTION);
            if (resultado == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, "El corredor se ha dado de alta", "Titulo", JOptionPane.INFORMATION_MESSAGE);
                logica.altaCorredor(nombre, fecha, lugar, numMax);
            } else if (resultado == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(this, "El corredor no se ha dado de alta", "Titulo", JOptionPane.INFORMATION_MESSAGE);

           }
        } else {

            int resultado = JOptionPane.showConfirmDialog(this, "¿Quieres modificar el corredor?", "Título", JOptionPane.YES_NO_OPTION);
            if (resultado == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, "El corredor ha sido modificado", "Titulo", JOptionPane.INFORMATION_MESSAGE);
                logica.altaCorredor(nombre, dni, fecha, direccion, telefono);
            } else if (resultado == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(this, "El corredor no ha sido modificado", "Titulo", JOptionPane.INFORMATION_MESSAGE);
                logica.getLista().add(logica.getCorredorSelecionado());
            }
            logica.setCorredorSelecionado(null);
        //}*/

        this.dispose();


    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        int resultado = JOptionPane.showConfirmDialog(this, "¿Quieres borrarlo?", "Título", JOptionPane.YES_NO_OPTION);
        if (resultado == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "La informacion se ha borrado", "Titulo", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldNombre.setText("");
            jTextFieldLugar.setText("");
            jTextFieldMaximoCorredores.setText("");

        } else if (resultado == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(this, "La informacion no se ha borrado", "Titulo", JOptionPane.INFORMATION_MESSAGE);

        }


    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jButtonInscribirCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInscribirCorredorActionPerformed
        if (accion == 1) {
            int index = jListDisponibles.getSelectedIndex();

            if (index != -1) {
                provisionalAdd.add(provisionalDisponibles.get(index));
                provisionalDisponibles.remove(index);
            } else {
                JOptionPane.showMessageDialog(this, "Tienes que tener un corredor seleccionado", "Titulo", JOptionPane.INFORMATION_MESSAGE);
            }

        } else {

        }

        jListDisponibles.clearSelection();
        jListInscritos.clearSelection();
        mostrarListaDisponible();
        mostrarListaInscritos();

    }//GEN-LAST:event_jButtonInscribirCorredorActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonInscribirCorredor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAltaCarrera;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelListaCorredores;
    private javax.swing.JLabel jLabelLugar;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNumMax;
    private javax.swing.JList<String> jListDisponibles;
    private javax.swing.JList<String> jListInscritos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerFecha;
    private javax.swing.JTextField jTextFieldLugar;
    private javax.swing.JTextField jTextFieldMaximoCorredores;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
