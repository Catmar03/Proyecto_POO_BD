/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author User 
 */
public class asientos extends javax.swing.JFrame {

    /**
     * Creates new form asientos
     */
    public asientos() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        cboestadoasiento = new javax.swing.JComboBox<>();
        btneliminarasiento = new javax.swing.JButton();
        btnactualizarasiento = new javax.swing.JButton();
        btnmodificarasiento = new javax.swing.JButton();
        btnagregarasiento = new javax.swing.JButton();
        btnbuscarasiento = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtplantaasiento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcodigoid = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtseleccionavion = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboestadoasiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ocupado", "Vacio", " " }));
        cboestadoasiento.setBorder(null);
        cboestadoasiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboestadoasientoActionPerformed(evt);
            }
        });
        jPanel1.add(cboestadoasiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 120, -1));

        btneliminarasiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/1486504830-delete-dustbin-empty-recycle-recycling-remove-trash_81361.png"))); // NOI18N
        jPanel1.add(btneliminarasiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        btnactualizarasiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/vcsupdaterequired_93493.png"))); // NOI18N
        jPanel1.add(btnactualizarasiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        btnmodificarasiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/editnote_pencil_edi_6175.png"))); // NOI18N
        jPanel1.add(btnmodificarasiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        btnagregarasiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/add_icon-icons.com_52393.png"))); // NOI18N
        btnagregarasiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarasientoActionPerformed(evt);
            }
        });
        jPanel1.add(btnagregarasiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        btnbuscarasiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/xmag_search_find_export_locate_5984.png"))); // NOI18N
        jPanel1.add(btnbuscarasiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("INGRESE PLANTA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("INGRESE CODIGO ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        txtplantaasiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtplantaasiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtplantaasientoActionPerformed(evt);
            }
        });
        jPanel1.add(txtplantaasiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 120, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("ESTADO DEL ASIENTO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        txtcodigoid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtcodigoid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoidActionPerformed(evt);
            }
        });
        jPanel1.add(txtcodigoid, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 120, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 120, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("SELECCION DE AVION");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        txtseleccionavion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtseleccionavion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtseleccionavionActionPerformed(evt);
            }
        });
        jPanel1.add(txtseleccionavion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 120, -1));

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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 550, 110));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("AGREGAR");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("ELIMINAR");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("ACTUALIZAR");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("MODIFICAR");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("BUSCAR");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/avion-aeropuerto-arcus-global-1.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void txtcodigoidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoidActionPerformed

    private void cboestadoasientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboestadoasientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboestadoasientoActionPerformed

    private void txtplantaasientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtplantaasientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtplantaasientoActionPerformed

    private void txtseleccionavionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtseleccionavionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtseleccionavionActionPerformed

    private void btnagregarasientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarasientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnagregarasientoActionPerformed

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
            java.util.logging.Logger.getLogger(asientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(asientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(asientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(asientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new asientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizarasiento;
    private javax.swing.JButton btnagregarasiento;
    private javax.swing.JButton btnbuscarasiento;
    private javax.swing.JButton btneliminarasiento;
    private javax.swing.JButton btnmodificarasiento;
    private javax.swing.JComboBox<String> cboestadoasiento;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtcodigoid;
    private javax.swing.JTextField txtplantaasiento;
    private javax.swing.JTextField txtseleccionavion;
    // End of variables declaration//GEN-END:variables
}
