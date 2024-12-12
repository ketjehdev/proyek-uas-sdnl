/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kelompok2.app;

import java.awt.Color;

/**
 *
 * @author LENOVO
 */
public class Overview extends javax.swing.JFrame {

    /**
     * Creates new form Overview
     */
    public Overview() {
        initComponents(); 
        chart.setTitle("UMP");
        chart.addLegend("amount", Color.red, Color.green);
        chart1.setTitle("Bahan Pangan");
        chart1.addLegend("amount", Color.green, Color.blue);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        curveLineChart1 = new com.kelompok2.chart.CurveLineChart();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        panelGradient1 = new com.kelompok2.panel.PanelGradient();
        panelGradient7 = new com.kelompok2.panel.PanelGradient();
        overviewClicked = new javax.swing.JLabel();
        panelGradient8 = new com.kelompok2.panel.PanelGradient();
        managemenData = new javax.swing.JLabel();
        panelGradient2 = new com.kelompok2.panel.PanelGradient();
        title = new javax.swing.JLabel();
        pannelTab = new javax.swing.JTabbedPane();
        overview = new com.kelompok2.panel.PanelGradient();
        chart = new com.kelompok2.chart.CurveLineChart();
        chart1 = new com.kelompok2.chart.CurveLineChart();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        managementData = new com.kelompok2.panel.PanelGradient();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jFormattedTextField1.setText("jFormattedTextField1");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelGradient1.setBackground(new java.awt.Color(0, 0, 51));
        panelGradient1.setColorGradient(new java.awt.Color(19, 51, 89));

        panelGradient7.setBackground(new java.awt.Color(0, 0, 51));
        panelGradient7.setColorGradient(new java.awt.Color(19, 51, 89));

        overviewClicked.setBackground(new java.awt.Color(255, 255, 255));
        overviewClicked.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        overviewClicked.setForeground(new java.awt.Color(255, 255, 255));
        overviewClicked.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        overviewClicked.setText("OVERVIEW");
        overviewClicked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                overviewClickedMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelGradient7Layout = new javax.swing.GroupLayout(panelGradient7);
        panelGradient7.setLayout(panelGradient7Layout);
        panelGradient7Layout.setHorizontalGroup(
            panelGradient7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradient7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(overviewClicked, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelGradient7Layout.setVerticalGroup(
            panelGradient7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradient7Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(overviewClicked)
                .addContainerGap())
        );

        panelGradient1.add(panelGradient7);
        panelGradient7.setBounds(0, 80, 180, 30);

        panelGradient8.setBackground(new java.awt.Color(0, 0, 51));
        panelGradient8.setColorGradient(new java.awt.Color(19, 51, 89));

        managemenData.setBackground(new java.awt.Color(255, 255, 255));
        managemenData.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        managemenData.setForeground(new java.awt.Color(255, 255, 255));
        managemenData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        managemenData.setText("MANAGEMENT DATA");
        managemenData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managemenDataMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelGradient8Layout = new javax.swing.GroupLayout(panelGradient8);
        panelGradient8.setLayout(panelGradient8Layout);
        panelGradient8Layout.setHorizontalGroup(
            panelGradient8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(managemenData, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        panelGradient8Layout.setVerticalGroup(
            panelGradient8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradient8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(managemenData)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelGradient1.add(panelGradient8);
        panelGradient8.setBounds(0, 120, 180, 30);

        getContentPane().add(panelGradient1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 600));

        panelGradient2.setBackground(new java.awt.Color(19, 51, 89));
        panelGradient2.setForeground(new java.awt.Color(24, 43, 61));
        panelGradient2.setColorGradient(new java.awt.Color(0, 0, 51));

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Overview");
        panelGradient2.add(title);
        title.setBounds(20, 10, 120, 50);

        getContentPane().add(panelGradient2, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 0, 680, 70));

        overview.setBackground(new java.awt.Color(187, 187, 187));
        overview.setColorGradient(new java.awt.Color(0, 0, 51));

        chart.setBackground(new java.awt.Color(0, 0, 0));
        chart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chart.setForeground(new java.awt.Color(0, 0, 0));
        overview.add(chart);
        chart.setBounds(100, 20, 270, 210);

        chart1.setBackground(new java.awt.Color(0, 0, 0));
        chart1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chart1.setForeground(new java.awt.Color(0, 0, 0));
        overview.add(chart1);
        chart1.setBounds(400, 20, 300, 210);

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        overview.add(jScrollPane1);
        jScrollPane1.setBounds(90, 240, 620, 270);

        pannelTab.addTab("tab1", overview);

        managementData.setBackground(new java.awt.Color(187, 187, 187));
        managementData.setColorGradient(new java.awt.Color(0, 0, 51));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        managementData.add(jTextField1);
        jTextField1.setBounds(330, 40, 140, 30);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Masukkan harga UMP :");
        managementData.add(jLabel1);
        jLabel1.setBounds(330, 20, 140, 14);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        managementData.add(jTextField2);
        jTextField2.setBounds(520, 40, 160, 30);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Masukkan harga bahan pangan :");
        managementData.add(jLabel2);
        jLabel2.setBounds(510, 20, 180, 14);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        managementData.add(jComboBox1);
        jComboBox1.setBounds(130, 40, 130, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pilih provinsi :");
        managementData.add(jLabel3);
        jLabel3.setBounds(100, 20, 180, 14);

        jButton2.setBackground(new java.awt.Color(204, 102, 0));
        jButton2.setForeground(new java.awt.Color(0, 0, 102));
        jButton2.setText("EDIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        managementData.add(jButton2);
        jButton2.setBounds(330, 90, 140, 40);

        jButton3.setBackground(new java.awt.Color(0, 255, 51));
        jButton3.setForeground(new java.awt.Color(0, 0, 102));
        jButton3.setText("CREATE");
        managementData.add(jButton3);
        jButton3.setBounds(520, 90, 160, 40);

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setForeground(new java.awt.Color(0, 0, 102));
        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        managementData.add(jButton4);
        jButton4.setBounds(130, 90, 130, 40);

        jTable2.setBackground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        managementData.add(jScrollPane2);
        jScrollPane2.setBounds(130, 152, 550, 340);

        pannelTab.addTab("tab2", managementData);

        getContentPane().add(pannelTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 38, 740, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void overviewClickedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_overviewClickedMouseClicked
        // TODO add your handling code here:
        pannelTab.setSelectedIndex(0);
    }//GEN-LAST:event_overviewClickedMouseClicked

    private void managemenDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managemenDataMouseClicked
        // TODO add your handling code here:
        pannelTab.setSelectedIndex(1);
    }//GEN-LAST:event_managemenDataMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Overview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Overview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Overview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Overview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Overview().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.kelompok2.chart.CurveLineChart chart;
    private com.kelompok2.chart.CurveLineChart chart1;
    private com.kelompok2.chart.CurveLineChart curveLineChart1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel managemenData;
    private com.kelompok2.panel.PanelGradient managementData;
    private com.kelompok2.panel.PanelGradient overview;
    private javax.swing.JLabel overviewClicked;
    private com.kelompok2.panel.PanelGradient panelGradient1;
    private com.kelompok2.panel.PanelGradient panelGradient2;
    private com.kelompok2.panel.PanelGradient panelGradient7;
    private com.kelompok2.panel.PanelGradient panelGradient8;
    private javax.swing.JTabbedPane pannelTab;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
