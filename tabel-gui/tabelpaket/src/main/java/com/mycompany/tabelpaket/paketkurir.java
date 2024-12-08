/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tabelpaket;

import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class paketkurir extends javax.swing.JFrame {

    /**
     * Creates new form paketkurir
     */ 
    DefaultTableModel model;
    String pengirim, penerima, layanan, kotaTujuan, status, catatan,jenislayanan,dikirim;
    public paketkurir() {
        initComponents();
        
        Object kolom[] = {"nama pengirim", "nama penerima", "jenis layanan", "kota tujuan", "status", "catatan"};
        Object data[][] = {};
        model = new DefaultTableModel (data, kolom);

        jTableModel.setModel(model);
                          
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jpengirim = new javax.swing.JLabel();
        jpenerima = new javax.swing.JLabel();
        txtnamapengirim = new javax.swing.JTextField();
        txtnamapenerima = new javax.swing.JTextField();
        jlayanan = new javax.swing.JLabel();
        jbreguler = new javax.swing.JRadioButton();
        jbexpress = new javax.swing.JRadioButton();
        jtujuan = new javax.swing.JLabel();
        jcbtujuan = new javax.swing.JComboBox<>();
        jdikirim = new javax.swing.JLabel();
        jcbdikirim = new javax.swing.JCheckBox();
        jcatatan = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableModel = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtcatatan = new javax.swing.JTextArea();
        btntambah = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnkeluar = new javax.swing.JButton();
        btnhapusrow = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));

        jpengirim.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jpengirim.setForeground(new java.awt.Color(102, 102, 102));
        jpengirim.setText("nama pengirim");

        jpenerima.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jpenerima.setForeground(new java.awt.Color(102, 102, 102));
        jpenerima.setText("nama penerima");

        txtnamapengirim.setBackground(new java.awt.Color(204, 204, 204));
        txtnamapengirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamapengirimActionPerformed(evt);
            }
        });

        txtnamapenerima.setBackground(new java.awt.Color(204, 204, 204));
        txtnamapenerima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamapenerimaActionPerformed(evt);
            }
        });

        jlayanan.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jlayanan.setText("jenis layanan");

        buttonGroup1.add(jbreguler);
        jbreguler.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jbreguler.setText("reguler");
        jbreguler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbregulerActionPerformed(evt);
            }
        });

        buttonGroup1.add(jbexpress);
        jbexpress.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jbexpress.setText("express");
        jbexpress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbexpressActionPerformed(evt);
            }
        });

        jtujuan.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jtujuan.setText("kota tujuan");

        jcbtujuan.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jcbtujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Malang", "Surabaya", "Blitar", "Kediri", "Pasuruan", "Probolinggo" }));
        jcbtujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbtujuanActionPerformed(evt);
            }
        });

        jdikirim.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jdikirim.setText("status pengiriman");

        jcbdikirim.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jcbdikirim.setText("dikirim");
        jcbdikirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbdikirimActionPerformed(evt);
            }
        });

        jcatatan.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jcatatan.setForeground(new java.awt.Color(102, 102, 102));
        jcatatan.setText("catatan");

        jTableModel.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jTableModel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nama pengirim", "nama penerima", "jenis layanan", "kota tujuan", "status", "catatan"
            }
        ));
        jTableModel.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTableModel);
        jTableModel.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        txtcatatan.setBackground(new java.awt.Color(204, 204, 204));
        txtcatatan.setColumns(20);
        txtcatatan.setRows(5);
        jScrollPane2.setViewportView(txtcatatan);

        btntambah.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btntambah.setText("tambah");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btnhapus.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnhapus.setText("hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft Uighur", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("PENGIRIMAN PAKET");

        btnkeluar.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnkeluar.setText("keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        btnhapusrow.setText("hapus row");
        btnhapusrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusrowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(452, 452, 452)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jpenerima, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtnamapenerima, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(206, 206, 206)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtnamapengirim, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jpengirim, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(60, 60, 60)
                                            .addComponent(jbreguler, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(67, 67, 67)
                                            .addComponent(jbexpress, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jtujuan)
                                                .addComponent(jdikirim))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jcbdikirim, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jcbtujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(327, 327, 327)
                                .addComponent(jlayanan, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(btntambah)
                                .addGap(18, 18, 18)
                                .addComponent(btnhapus)
                                .addGap(33, 33, 33)
                                .addComponent(btnhapusrow)
                                .addGap(36, 36, 36)
                                .addComponent(btnkeluar)))
                        .addGap(0, 198, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jcatatan, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(346, 346, 346))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpengirim)
                    .addComponent(jpenerima))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnamapenerima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnamapengirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlayanan)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbreguler)
                    .addComponent(jbexpress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtujuan)
                    .addComponent(jcbtujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbdikirim)
                    .addComponent(jdikirim))
                .addGap(18, 18, 18)
                .addComponent(jcatatan)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnkeluar)
                    .addComponent(btntambah)
                    .addComponent(btnhapus)
                    .addComponent(btnhapusrow))
                .addGap(86, 86, 86))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnamapenerimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamapenerimaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtnamapenerimaActionPerformed

    private void txtnamapengirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamapengirimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamapengirimActionPerformed

    private void jbregulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbregulerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbregulerActionPerformed

    private void jbexpressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbexpressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbexpressActionPerformed

    private void jcbtujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbtujuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbtujuanActionPerformed

    private void jcbdikirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbdikirimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbdikirimActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        // TODO add your handling code here:
        pengirim = txtnamapengirim.getText();
        penerima = txtnamapenerima.getText();
        kotaTujuan = jcbtujuan.getSelectedItem().toString();
        catatan = txtcatatan.getText();
        if (jbreguler.isSelected()) {
            jenislayanan = "reguler";
        } else {
            jenislayanan = "express";
        }
        if (jcbdikirim.isSelected()) {
            dikirim = "dikirim";
        } else {
            dikirim = "";
        }
        model.addRow(new Object[]{pengirim, penerima,jenislayanan, kotaTujuan, dikirim, catatan});
        
        
 
        
            
        
        
    }//GEN-LAST:event_btntambahActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
        txtnamapengirim.setText("");
        txtnamapenerima.setText("");
        buttonGroup1.clearSelection();
        jcbtujuan.setSelectedItem("none");
        txtcatatan.setText("");
        jcbdikirim.setSelected(false);
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void btnhapusrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusrowActionPerformed
        // TODO add your handling code here:
        int index = jTableModel.getSelectedRow();
        model.removeRow(index);
        jTableModel.setModel(model);
    }//GEN-LAST:event_btnhapusrowActionPerformed

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
            java.util.logging.Logger.getLogger(paketkurir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paketkurir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paketkurir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paketkurir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paketkurir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnhapusrow;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btntambah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableModel;
    private javax.swing.JRadioButton jbexpress;
    private javax.swing.JRadioButton jbreguler;
    private javax.swing.JLabel jcatatan;
    private javax.swing.JCheckBox jcbdikirim;
    private javax.swing.JComboBox<String> jcbtujuan;
    private javax.swing.JLabel jdikirim;
    private javax.swing.JLabel jlayanan;
    private javax.swing.JLabel jpenerima;
    private javax.swing.JLabel jpengirim;
    private javax.swing.JLabel jtujuan;
    private javax.swing.JTextArea txtcatatan;
    private javax.swing.JTextField txtnamapenerima;
    private javax.swing.JTextField txtnamapengirim;
    // End of variables declaration//GEN-END:variables
}