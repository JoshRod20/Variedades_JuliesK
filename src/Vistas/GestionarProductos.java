package Vistas;

import Controlador.CRUDProducto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class GestionarProductos extends javax.swing.JFrame {
    
    int datoSeleccionado= -1;

    public GestionarProductos() {
        initComponents();
//        mostrar(); //llamado al método mostrar ()
    
    }
    
    public void mostrar(){//Método mostrar 
        try {
            DefaultTableModel modelo;
                CRUDProducto prod = new CRUDProducto();//objeto de la clase CRUDProducto
                modelo = prod.MostrarProductos();
                tableProducto.setModel(modelo);
                
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBusqueda = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProducto = new javax.swing.JTable();
        btnAñadir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBusqueda = new javax.swing.JButton();
        btvolLobby = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btEditar = new javax.swing.JButton();
        botonmostrar = new javax.swing.JButton();
        jTextSearch = new javax.swing.JTextField();

        txtBusqueda.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtBusqueda.setForeground(new java.awt.Color(153, 153, 153));
        txtBusqueda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBusqueda.setText("Buscar por ID, nombre ó categoria");
        txtBusqueda.setBorder(null);
        txtBusqueda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBusquedaFocusLost(evt);
            }
        });
        txtBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBusquedaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBusquedaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtBusquedaMouseReleased(evt);
            }
        });
        txtBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaActionPerformed(evt);
            }
        });
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyTyped(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(156, 162, 239));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Búsqueda de producto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 64, 230, 41));

        tableProducto.setBackground(new java.awt.Color(187, 227, 222));
        tableProducto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tableProducto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tableProducto.setRowHeight(30);
        tableProducto.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tableProducto.setShowGrid(true);
        tableProducto.setShowVerticalLines(false);
        tableProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProducto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 198, 724, 295));

        btnAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/agregar.png"))); // NOI18N
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });
        jPanel1.add(btnAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 140, 40, 40));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/basura.png"))); // NOI18N
        btnEliminar.setToolTipText("");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(736, 140, 40, 40));

        btnBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/busqueda.png"))); // NOI18N
        btnBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaActionPerformed(evt);
            }
        });
        jPanel1.add(btnBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 140, 40, 40));

        btvolLobby.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btvolLobby.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/previous.png"))); // NOI18N
        btvolLobby.setText("Volver");
        btvolLobby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btvolLobbyActionPerformed(evt);
            }
        });
        jPanel1.add(btvolLobby, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Variedades JuliesK");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, 26));

        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lapiz.png"))); // NOI18N
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 40, 40));

        botonmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmostrarActionPerformed(evt);
            }
        });
        jPanel1.add(botonmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 54, 0, 30));

        jTextSearch.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jTextSearch.setForeground(new java.awt.Color(153, 153, 153));
        jTextSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextSearch.setText("Buscar por ID, Nombres o Descripción");
        jTextSearch.setBorder(null);
        jTextSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextSearchFocusLost(evt);
            }
        });
        jTextSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextSearchMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextSearchMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextSearchMouseReleased(evt);
            }
        });
        jTextSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSearchActionPerformed(evt);
            }
        });
        jTextSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextSearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextSearchKeyTyped(evt);
            }
        });
        jPanel1.add(jTextSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 140, 538, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 10, 830, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBusquedaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBusquedaFocusLost
//        txtBusqueda.setText("Buscar por ID , nombre ó categoria");
//        txtBusqueda.setForeground(Color.gray);
    }//GEN-LAST:event_txtBusquedaFocusLost

    private void txtBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBusquedaMouseClicked
        txtBusqueda.setText("");
    }//GEN-LAST:event_txtBusquedaMouseClicked

    private void txtBusquedaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBusquedaMousePressed
//        txtBusqueda.setText("");
//        txtBusqueda.setForeground(Color.black);
    }//GEN-LAST:event_txtBusquedaMousePressed

    private void txtBusquedaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBusquedaMouseReleased

    }//GEN-LAST:event_txtBusquedaMouseReleased

    private void txtBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaActionPerformed

    }//GEN-LAST:event_txtBusquedaActionPerformed

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
//        buscar();
    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void txtBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyTyped

    }//GEN-LAST:event_txtBusquedaKeyTyped

    private void tableProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductoMouseClicked
        datoSeleccionado = tableProducto.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_tableProductoMouseClicked

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
//        AñadirProd apro = new AñadirProd();
//        apro.setVisible(true);
//
//          Productos produ = new Productos();
//          produ.setVisible(true);
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed
        
        try {
            DefaultTableModel modelo;
            CRUDProducto pro = new CRUDProducto();
            modelo = pro.BuscarProducto(txtBusqueda.getText());
            if (txtBusqueda.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Escriba el dato a buscar");
                mostrar();
            } else {
                tableProducto.setModel(modelo);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnBusquedaActionPerformed

    private void btvolLobbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btvolLobbyActionPerformed
            Lobby lob = new Lobby();
            lob.setVisible(true);
    }//GEN-LAST:event_btvolLobbyActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       
        if (datoSeleccionado >= 0){
            String dato =
                    String.valueOf(tableProducto.getValueAt(datoSeleccionado, 0));
            CRUDProducto prod = new CRUDProducto();
            if (JOptionPane.showConfirmDialog(rootPane,
                    "Se eliminará el registro, ¿desea continuar?",
                    "Eliminar registro",
                    JOptionPane.WARNING_MESSAGE,
                    JOptionPane.YES_NO_OPTION)
                    ==JOptionPane.YES_OPTION) {
                prod.eliminar(dato);
                mostrar();
                JOptionPane.showMessageDialog(null, "Dato eliminado correctamente");
                
            }else {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un registro de la tabla");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed

//        Productos Prod = new Productos();
//        int x = (Lobby.jdpane.getWidth() / 2) - Prod.getWidth() / 2;
//        int y = (Lobby.jdpane.getHeight() / 2) - Prod.getHeight() / 2;
//        Prod.setLocation(x, y);
//        Lobby.jdpane.add(POJOProductoProd);
        
        if (datoSeleccionado >= 0){
            //mandar datos al formulario
            
            Productos.NombreProducto.setText(String.valueOf(tableProducto.getValueAt(datoSeleccionado, 0)));
            Productos.Descripcion.setText(String.valueOf(tableProducto.getValueAt(datoSeleccionado, 1)));
            Productos.PCompra.setText(String.valueOf(tableProducto.getValueAt(datoSeleccionado, 2)));
            Productos.pVenta.setText(String.valueOf(tableProducto.getValueAt(datoSeleccionado, 3)));
            Productos.Marca.setText(String.valueOf(tableProducto.getValueAt(datoSeleccionado, 4)));
            Productos.Talla.setText(String.valueOf(tableProducto.getValueAt(datoSeleccionado, 5)));
            Productos.NombreProducto.enable(false);
            //hacer al frente y visible
            Productos vista = new Productos();
            vista.setVisible(true);
            dispose();
            Productos.GuardarProductos.setVisible(false);
            
        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro a actualizar");
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void botonmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmostrarActionPerformed
        mostrar();
    }//GEN-LAST:event_botonmostrarActionPerformed

    private void jTextSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextSearchFocusLost
        jTextSearch.setText("Buscar por cédula, nombres o apellidos");
//        jTextSearch.setForeground(Color.gray);
    }//GEN-LAST:event_jTextSearchFocusLost

    private void jTextSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextSearchMouseClicked
        jTextSearch.setText("");
    }//GEN-LAST:event_jTextSearchMouseClicked

    private void jTextSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextSearchMousePressed
        jTextSearch.setText("");
//        jTextSearch.setForeground(Color.black);
    }//GEN-LAST:event_jTextSearchMousePressed

    private void jTextSearchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextSearchMouseReleased

    }//GEN-LAST:event_jTextSearchMouseReleased

    private void jTextSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSearchActionPerformed

    private void jTextSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextSearchKeyReleased
//        buscar();
    }//GEN-LAST:event_jTextSearchKeyReleased

    private void jTextSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextSearchKeyTyped

    }//GEN-LAST:event_jTextSearchKeyTyped

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
            java.util.logging.Logger.getLogger(GestionarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton botonmostrar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btvolLobby;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextSearch;
    private javax.swing.JTable tableProducto;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
