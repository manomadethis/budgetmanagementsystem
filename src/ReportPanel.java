/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author Felicia
 */
public class ReportPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReportPanel
     */public ReportPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reportPanel = new javax.swing.JPanel();
        reportLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();

        reportPanel.setBackground(new java.awt.Color(255, 255, 255));
        reportPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reportLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        reportLabel.setText("Report");
        reportPanel.add(reportLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 40));

        jLabel3.setText("Expenses details");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.green, null));
        reportPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 530, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"flight", null, null, null, null},
                {"Driving", null, null, null, null},
                {"Parking", null, null, null, null},
                {"Hotel", null, null, null, null},
                {"Breakfast", null, null, null, null},
                {"Lunch", null, null, null, null},
                {"Dinners", null, null, null, null},
                {"Other entertainment", null, null, null, null},
                {"Purchased gifts", null, null, null, null},
                {"others", null, null, null, null}
            },
            new String [] {
                "Description", "Category", "Quantity", "Cost Per unit", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jTable3);

        reportPanel.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 530, 280));

        jLabel4.setBackground(new java.awt.Color(51, 51, 255));
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("Budget and expenses");
        reportPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 120, -1));

        jLabel5.setText("Total Budget");
        reportPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel6.setText("Total expenses");
        reportPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel7.setText("Money left");
        reportPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel8.setBackground(new java.awt.Color(102, 255, 255));
        jLabel8.setText("                                                                 Break down of expenses");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 255)));
        reportPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 530, 20));

        jLabel9.setText("Transportation");
        reportPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel10.setText("Logging");
        reportPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel11.setText("Food");
        reportPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel12.setText("Entertainment");
        reportPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel13.setText("other");
        reportPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jButton3.setText("Pie chart");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        reportPanel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, -1));
        reportPanel.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, 20));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        reportPanel.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));
        reportPanel.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));
        reportPanel.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        reportPanel.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        jLabel14.setText("                                                                                                                              Total expenses");
        reportPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 460, -1));

        jTextField6.setText("$");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        reportPanel.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 580, -1, -1));

        jTextField7.setText("jTextField7");
        reportPanel.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        jTextField8.setText("jTextField8");
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        reportPanel.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jTextField9.setText("jTextField9");
        reportPanel.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(reportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 247, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(reportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel reportLabel;
    private javax.swing.JPanel reportPanel;
    // End of variables declaration//GEN-END:variables
}
