package Conexion;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class JFConexionBD extends javax.swing.JFrame {

    public static final String URL = "jdbc:mysql://localhost/aerolinea";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    Connection con = null;
    ResultSet rs = null;


    public JFConexionBD() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBT_Conectar = new javax.swing.JButton();
        JBT_Desconectar = new javax.swing.JButton();
        JTF_Nombres = new javax.swing.JTextField();
        JTF_Apellidos = new javax.swing.JTextField();
        JTF_DNI = new javax.swing.JTextField();
        JTF_Sexo = new javax.swing.JTextField();
        JTF_Tele = new javax.swing.JTextField();
        JTF_Usuario = new javax.swing.JTextField();
        JTF_Acceso = new javax.swing.JLabel();
        JCB_Acceso = new javax.swing.JComboBox<>();
        JBT_Guardar = new javax.swing.JButton();
        JTF_Contra = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBT_Conectar.setText("Conectar");
        jBT_Conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT_ConectarActionPerformed(evt);
            }
        });

        JBT_Desconectar.setText("Desconectar");
        JBT_Desconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBT_DesconectarActionPerformed(evt);
            }
        });

        JTF_Nombres.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        JTF_Apellidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Apellidos"));

        JTF_DNI.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));

        JTF_Sexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));

        JTF_Tele.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefono"));

        JTF_Usuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuario"));

        JTF_Acceso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JTF_Acceso.setText("Acesso");

        JCB_Acceso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Pasajero" }));

        JBT_Guardar.setText("Guardar");
        JBT_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBT_GuardarActionPerformed(evt);
            }
        });

        JTF_Contra.setBorder(javax.swing.BorderFactory.createTitledBorder("Contraseña"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBT_Conectar)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTF_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBT_Desconectar)
                    .addComponent(JTF_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JTF_Acceso, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(JCB_Acceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(76, 76, 76))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JTF_Tele, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JTF_Apellidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTF_Nombres, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTF_Usuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(JBT_Guardar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(JTF_Contra, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBT_Conectar)
                    .addComponent(JBT_Desconectar))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTF_Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTF_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTF_Tele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTF_Acceso)
                        .addComponent(JCB_Acceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JTF_Usuario)
                    .addComponent(JTF_Contra))
                .addGap(18, 31, Short.MAX_VALUE)
                .addComponent(JBT_Guardar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 public static Connection estableciendoConexion() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");

        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }

    public static PreparedStatement realizarConsulta(Connection con, String consulta) {
        PreparedStatement ps = null;
        try {
            ps = (PreparedStatement) con.prepareStatement(consulta);

        } catch (Exception e) {
            System.out.println(e);
        }
        return ps;

    }
    private void jBT_ConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT_ConectarActionPerformed
        PreparedStatement ps = null;

        try {
            if (con != null && !con.isClosed()) {
                JOptionPane.showMessageDialog(null, "La conexion ya esta abierta");
                return;
            }
            con = estableciendoConexion();
            ps = realizarConsulta(con, "SELECT* FROM TBPasajero,TBAvion,TBReserva,TBAsientos;");//mostara los datos de la tabla persona
            rs = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jBT_ConectarActionPerformed

    private void JBT_DesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBT_DesconectarActionPerformed
        try {
            con.close();
            JOptionPane.showMessageDialog(null, "Se cerro exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No existen conexiones abiertas");

        }
    }//GEN-LAST:event_JBT_DesconectarActionPerformed

    private void JBT_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBT_GuardarActionPerformed
   PreparedStatement ps = null;
        try {
            ps = realizarConsulta(con, "INSERT INTO TBPasajero (Nombre,Apellido,DNI,sexo,telefono,Acceso,Usuario,contrañesa) VALUES(?,?,?,?,?,?,?,?)");
            ps.setString(1, JTF_Nombres.getText());
            ps.setString(2, JTF_Apellidos.getText());
            ps.setInt(3, Integer.parseInt(JTF_DNI.getText()));
            ps.setString(4, JTF_Sexo.getText());
            ps.setInt(5, Integer.parseInt(JTF_Tele.getText()));
            ps.setString (6,JCB_Acceso.getItemAt(JCB_Acceso.getSelectedIndex()).toString());
            ps.setString(7, JTF_Usuario.getText());
            ps.setString(8, JTF_Contra.getText());

            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Se guardo exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo guardar el registro");
            }
        } catch (Exception e) {
              }
    }//GEN-LAST:event_JBT_GuardarActionPerformed

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
            java.util.logging.Logger.getLogger(JFConexionBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFConexionBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFConexionBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFConexionBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFConexionBD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBT_Desconectar;
    private javax.swing.JButton JBT_Guardar;
    private javax.swing.JComboBox<String> JCB_Acceso;
    private javax.swing.JLabel JTF_Acceso;
    private javax.swing.JTextField JTF_Apellidos;
    private javax.swing.JTextField JTF_Contra;
    private javax.swing.JTextField JTF_DNI;
    private javax.swing.JTextField JTF_Nombres;
    private javax.swing.JTextField JTF_Sexo;
    private javax.swing.JTextField JTF_Tele;
    private javax.swing.JTextField JTF_Usuario;
    private javax.swing.JButton jBT_Conectar;
    // End of variables declaration//GEN-END:variables
}
