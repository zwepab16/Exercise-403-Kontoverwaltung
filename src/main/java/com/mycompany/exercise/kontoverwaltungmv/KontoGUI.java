package com.mycompany.exercise.kontoverwaltungmv;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class KontoGUI extends javax.swing.JFrame {

    private ArrayList<Konto> kontos = new ArrayList();

    public KontoGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        miAddUser = new javax.swing.JMenuItem();
        miPerformAccountTest = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        miNeuesKonto = new javax.swing.JMenuItem();
        lbGeld = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        userList = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        logTextArea = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        cbKonto = new javax.swing.JComboBox<>();

        miAddUser.setText("add user");
        miAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAddUserActionPerformed(evt);
            }
        });
        jPopupMenu1.add(miAddUser);

        miPerformAccountTest.setText("perform account test");
        miPerformAccountTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPerformAccountTestActionPerformed(evt);
            }
        });
        jPopupMenu1.add(miPerformAccountTest);

        miNeuesKonto.setText("neues Konto anlegen");
        miNeuesKonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNeuesKontoActionPerformed(evt);
            }
        });
        jPopupMenu2.add(miNeuesKonto);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Konto-Verwaltung");

        lbGeld.setFont(new java.awt.Font("Palatino Linotype", 0, 24)); // NOI18N
        lbGeld.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbGeld.setText("360€");
        lbGeld.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Account", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Source Sans Pro Semibold", 0, 18), new java.awt.Color(50, 100, 20))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(50, 100, 20))); // NOI18N

        userList.setToolTipText("");
        userList.setComponentPopupMenu(jPopupMenu1);
        jScrollPane3.setViewportView(userList);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Log-output", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(50, 100, 20))); // NOI18N

        logTextArea.setColumns(20);
        logTextArea.setRows(5);
        logTextArea.setComponentPopupMenu(jPopupMenu2);
        jScrollPane1.setViewportView(logTextArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Konto auswählen", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(50, 100, 20))); // NOI18N

        cbKonto.setBorder(null);
        cbKonto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbKontoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cbKonto, 0, 139, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cbKonto, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbGeld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbGeld)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miNeuesKontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNeuesKontoActionPerformed
        String eingabe = JOptionPane.showInputDialog("Bitte im folgenden format: \"Name,Geldbetrag\" eingeben!","Kontoname,75");
        
        String eingabe2[] = eingabe.split(",");

        try {
            Konto k = new Konto(Double.parseDouble(eingabe2[1]), eingabe2[0]);
            cbKonto.addItem(k);
            kontos.add(k);
            userList.setModel(k);
            lbGeld.setText(k.getSaldo() + "€");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Bitte das Format beachten!");
            miNeuesKontoActionPerformed(evt);
        }


    }//GEN-LAST:event_miNeuesKontoActionPerformed

    private void miAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddUserActionPerformed

        Konto k = (Konto) cbKonto.getSelectedItem();
        KontoBenutzer u = new KontoBenutzer(JOptionPane.showInputDialog("Bitte deinen User-Namen eingeben!","Username"), k, logTextArea, lbGeld);
        k.addUser(u);
        userList.setModel(k);

    }//GEN-LAST:event_miAddUserActionPerformed

    private void cbKontoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbKontoItemStateChanged
        Konto k = (Konto) cbKonto.getSelectedItem();
        userList.setModel(k);
        lbGeld.setText(k.getSaldo() + "€");
    }//GEN-LAST:event_cbKontoItemStateChanged

    private void miPerformAccountTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPerformAccountTestActionPerformed
        Konto k = (Konto) cbKonto.getSelectedItem();
        int user[] = userList.getSelectedIndices();
        k.startTest(user);
    }//GEN-LAST:event_miPerformAccountTestActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KontoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Konto> cbKonto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbGeld;
    private javax.swing.JTextArea logTextArea;
    private javax.swing.JMenuItem miAddUser;
    private javax.swing.JMenuItem miNeuesKonto;
    private javax.swing.JMenuItem miPerformAccountTest;
    private javax.swing.JList<String> userList;
    // End of variables declaration//GEN-END:variables
}
