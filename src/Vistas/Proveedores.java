package Vistas;

import Controlador.CRUDProveedores;
import Modelo.POJOProveedores;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Proveedores extends javax.swing.JFrame {

    /**
     * Creates new form Proveedores
     */
    public Proveedores() {
        initComponents();
    }

    public void guardarProveedores() {
        CRUDProveedores cp = new CRUDProveedores();
        POJOProveedores prov1 = new POJOProveedores(NEmpresa.getText(),
                NombreProv.getText(),
                ApellidoProv.getText(),
                NTelefono.getText());
        cp.insertarProveedores(prov1);

    }

    public void limpiar() {
        NombreProv.setText("");
        ApellidoProv.setText("");
        NEmpresa.setText("");
        NTelefono.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        NProducto4 = new javax.swing.JLabel();
        NombreProv = new javax.swing.JTextField();
        jSeparator26 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        NEmpresa = new javax.swing.JTextField();
        jSeparator27 = new javax.swing.JSeparator();
        jLabel31 = new javax.swing.JLabel();
        ApellidoProv = new javax.swing.JTextField();
        jSeparator28 = new javax.swing.JSeparator();
        jLabel32 = new javax.swing.JLabel();
        GuardarProv = new javax.swing.JButton();
        btActualizarProv = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jTextTelefono = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(156, 162, 239));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setText("PROVEEDORES");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/clienteGrande.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        NProducto4.setBackground(new java.awt.Color(0, 0, 0));
        NProducto4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        NProducto4.setForeground(new java.awt.Color(7, 81, 74));
        NProducto4.setText("Nombre Proveedor");

        NombreProv.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        NombreProv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NombreProv.setBorder(null);
        NombreProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreProvActionPerformed(evt);
            }
        });
        NombreProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreProvKeyTyped(evt);
            }
        });

        jSeparator26.setBackground(new java.awt.Color(0, 255, 51));
        jSeparator26.setForeground(new java.awt.Color(7, 81, 74));

        jLabel30.setBackground(new java.awt.Color(0, 0, 0));
        jLabel30.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(7, 81, 74));
        jLabel30.setText("Nombre Empresa");

        NEmpresa.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        NEmpresa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NEmpresa.setBorder(null);
        NEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NEmpresaKeyTyped(evt);
            }
        });

        jSeparator27.setForeground(new java.awt.Color(7, 81, 74));

        jLabel31.setBackground(new java.awt.Color(0, 0, 0));
        jLabel31.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(7, 81, 74));
        jLabel31.setText("Apellido");

        ApellidoProv.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        ApellidoProv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ApellidoProv.setBorder(null);
        ApellidoProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApellidoProvKeyTyped(evt);
            }
        });

        jSeparator28.setBackground(new java.awt.Color(0, 255, 51));
        jSeparator28.setForeground(new java.awt.Color(7, 81, 74));

        jLabel32.setBackground(new java.awt.Color(0, 0, 0));
        jLabel32.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(7, 81, 74));
        jLabel32.setText("N° Teléfono");

        GuardarProv.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GuardarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardar.png"))); // NOI18N
        GuardarProv.setText("Guardar");
        GuardarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarProvActionPerformed(evt);
            }
        });

        btActualizarProv.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btActualizarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/actualizar.png"))); // NOI18N
        btActualizarProv.setText("Actualizar");
        btActualizarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarProvActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 255, 51));
        jSeparator1.setForeground(new java.awt.Color(7, 81, 74));

        jTextTelefono.setBorder(null);
        try {
            jTextTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextTelefono.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jTextTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTelefonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelProvLayout = new javax.swing.GroupLayout(jpanelProv);
        jpanelProv.setLayout(jpanelProvLayout);
        jpanelProvLayout.setHorizontalGroup(
            jpanelProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelProvLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelProvLayout.createSequentialGroup()
                        .addGroup(jpanelProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NProducto4)
                            .addComponent(NombreProv, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator26, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpanelProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(ApellidoProv, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator28, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpanelProvLayout.createSequentialGroup()
                        .addGroup(jpanelProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel30)
                            .addComponent(jSeparator27, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(NEmpresa)
                            .addComponent(GuardarProv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpanelProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btActualizarProv)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jpanelProvLayout.setVerticalGroup(
            jpanelProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelProvLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpanelProvLayout.createSequentialGroup()
                        .addComponent(NProducto4)
                        .addGap(1, 1, 1)
                        .addComponent(NombreProv, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator26, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelProvLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(1, 1, 1)
                        .addComponent(ApellidoProv, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator28, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(jLabel32))
                .addGap(1, 1, 1)
                .addGroup(jpanelProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelProvLayout.createSequentialGroup()
                        .addComponent(NEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator27, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelProvLayout.createSequentialGroup()
                        .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jpanelProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuardarProv)
                    .addComponent(btActualizarProv))
                .addGap(85, 85, 85))
        );

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setText("Registrar Proveedores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(170, 170, 170))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jpanelProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)))
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(jpanelProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btActualizarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarProvActionPerformed
        try {
            if ((NombreProv.getText().equals(""))
                    || (ApellidoProv.getText().equals(""))
                    || (NEmpresa.getText().equals(""))
                    || (NTelefono.getText().equals(""))) {
                JOptionPane.showMessageDialog(null, "Tiene datos vacíos");
            } else {
//                editarProv();
                JOptionPane.showMessageDialog(null, "Datos Actualizados Correctamente");
                dispose();

                GestionarProductos.botonmostrar.doClick();

            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_btActualizarProvActionPerformed

    private void GuardarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarProvActionPerformed
        CRUDProveedores cpr = new CRUDProveedores();
        try {
            if ((NombreProv.getText().equals(""))
                    || (ApellidoProv.getText().equals(""))
                    || (NEmpresa.getText().equals(""))
                    || (NTelefono.getText().equals(""))) {
                JOptionPane.showMessageDialog(null, "Tiene datos vacios");
            } else {

                guardarProveedores();
                limpiar();
                JOptionPane.showMessageDialog(null, "Datos guardados correctamente");

                //GestionarProveedores prove = new GestionarProveedores();
                //prove.setVisible(true);
              //  Proveedores.this.dispose();

            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
        }
    }//GEN-LAST:event_GuardarProvActionPerformed

    private void ApellidoProvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApellidoProvKeyTyped
//        char car = evt.getKeyChar();
//        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z')
//            && car != 'á' //Minúsculas
//            && car != 'é'
//            && car != 'í'
//            && car != 'ó'
//            && car != 'ú'
//            && car != 'Á' //Mayúsculas
//            && car != 'É'
//            && car != 'Í'
//            && car != 'Ó'
//            && car != 'Ú'
//            && car != 'Ü'
//            && car != 'ü'
//            && car != 'Ñ'
//            && car != 'ñ'
//            && (car != (char) KeyEvent.VK_SPACE)) {
//            evt.consume();
//        }
    }//GEN-LAST:event_ApellidoProvKeyTyped

    private void NEmpresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NEmpresaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_NEmpresaKeyTyped

    private void NombreProvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreProvKeyTyped
//        char car = evt.getKeyChar();
//        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z')
//            && car != 'á' //Minúsculas
//            && car != 'é'
//            && car != 'í'
//            && car != 'ó'
//            && car != 'ú'
//            && car != 'Á' //Mayúsculas
//            && car != 'É'
//            && car != 'Í'
//            && car != 'Ó'
//            && car != 'Ú'
//            && car != 'Ü'
//            && car != 'ü'
//            && car != 'Ñ'
//            && car != 'ñ'
//            && (car != (char) KeyEvent.VK_SPACE)) {
//            evt.consume();
//        }
    }//GEN-LAST:event_NombreProvKeyTyped

    private void NombreProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreProvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreProvActionPerformed

    private void jTextTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTelefonoActionPerformed

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
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField ApellidoProv;
    public static javax.swing.JButton GuardarProv;
    public static javax.swing.JTextField NEmpresa;
    private javax.swing.JLabel NProducto4;
    public static javax.swing.JTextField NombreProv;
    public static javax.swing.JButton btActualizarProv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JFormattedTextField jTextTelefono;
    public static final javax.swing.JPanel jpanelProv = new javax.swing.JPanel();
    // End of variables declaration//GEN-END:variables
}
