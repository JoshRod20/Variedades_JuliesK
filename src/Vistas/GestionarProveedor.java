package Vistas;

/**
 *
 * @author rodri
 */
public class GestionarProveedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form GestionarProveedor
     */
    public GestionarProveedor() {
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

        jPan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        btnAñadir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBusqueda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btEditar = new javax.swing.JButton();
        botonmostrar = new javax.swing.JButton();
        tsProv = new javax.swing.JTextField();

        jPan.setBackground(new java.awt.Color(156, 162, 239));
        jPan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Búsqueda de Proveedores");
        jPan.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 64, -1, 41));

        tableProv.setBackground(new java.awt.Color(187, 227, 222));
        tableProv.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tableProv.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tableProv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableProv.setRowHeight(30);
        tableProv.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tableProv.setShowGrid(true);
        tableProv.setShowVerticalLines(false);
        tableProv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProvMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProv);

        jPan.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 198, 724, 295));

        btnAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/agregar.png"))); // NOI18N
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });
        jPan.add(btnAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 140, 40, 40));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/basura.png"))); // NOI18N
        btnEliminar.setToolTipText("");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPan.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(736, 140, 40, 40));

        btnBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/busqueda.png"))); // NOI18N
        btnBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaActionPerformed(evt);
            }
        });
        jPan.add(btnBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 140, 40, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Variedades JuliesK");
        jPan.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 32, -1, 26));

        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lapiz.png"))); // NOI18N
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        jPan.add(btEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 40, 40));

        botonmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmostrarActionPerformed(evt);
            }
        });
        jPan.add(botonmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 54, 0, 30));

        tsProv.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tsProv.setForeground(new java.awt.Color(153, 153, 153));
        tsProv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tsProv.setText("Buscar por ID, Nombres o Apellidos");
        tsProv.setBorder(null);
        tsProv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tsProvFocusLost(evt);
            }
        });
        tsProv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tsProvMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tsProvMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tsProvMouseReleased(evt);
            }
        });
        tsProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsProvActionPerformed(evt);
            }
        });
        tsProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tsProvKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tsProvKeyTyped(evt);
            }
        });
        jPan.add(tsProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 140, 538, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPan, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPan, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableProvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProvMouseClicked
        //        datoSeleccionado = tableProv.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_tableProvMouseClicked

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        Proveedores prove = new Proveedores();
        prove.setVisible(true);
        // dispose();
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        //        if (datoSeleccionado >= 0){
            //            String dato =
            //            String.valueOf(tableProv.getValueAt(datoSeleccionado, 0));
            //            CRUDProducto prod = new CRUDProducto();
            //            if (JOptionPane.showConfirmDialog(rootPane,
                //                "Se eliminará el registro, ¿desea continuar?",
                //                "Eliminar registro",
                //                JOptionPane.WARNING_MESSAGE,
                //                JOptionPane.YES_NO_OPTION)
            //            ==JOptionPane.YES_OPTION) {
            //            prod.eliminar(dato);
            //            mostrar();
            //            JOptionPane.showMessageDialog(null, "Dato eliminado correctamente");
            //
            //        }else {
            //            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro de la tabla");
            //        }
        //        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed

        //        try {
            //            DefaultTableModel modelo;
            //            CRUDProveedores pro = new CRUDProveedores();
            //            modelo = pro.BuscarProducto(tsProv.getText());
            //            if (tsProv.getText().equals("")) {
                //                JOptionPane.showMessageDialog(null, "Escriba el dato a buscar");
                //                mostrar();
                //            } else {
                //                tableProv.setModel(modelo);
                //            }
            //        } catch (Exception e) {
            //            JOptionPane.showMessageDialog(null, e);
            //        }
    }//GEN-LAST:event_btnBusquedaActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed

        //        Productos Prod = new Productos();
        //        int x = (Lobby.jdpane.getWidth() / 2) - Prod.getWidth() / 2;
        //        int y = (Lobby.jdpane.getHeight() / 2) - Prod.getHeight() / 2;
        //        Prod.setLocation(x, y);
        //        Lobby.jdpane.add(POJOProductoProd);

        //        if (datoSeleccionado >= 0){
            //            //mandar datos al formulario
            //
            //            Productos.NombreProducto.setText(String.valueOf(tableProv.getValueAt(datoSeleccionado, 0)));
            //            Productos.Descripcion.setText(String.valueOf(tableProv.getValueAt(datoSeleccionado, 1)));
            //            Productos.PCompra.setText(String.valueOf(tableProv.getValueAt(datoSeleccionado, 2)));
            //            Productos.pVenta.setText(String.valueOf(tableProv.getValueAt(datoSeleccionado, 3)));
            //            Productos.Marca.setText(String.valueOf(tableProv.getValueAt(datoSeleccionado, 4)));
            //            Productos.Talla.setText(String.valueOf(tableProv.getValueAt(datoSeleccionado, 5)));
            //            Productos.NombreProducto.enable(false);
            //            //hacer al frente y visible
            //            Productos vista = new Productos();
            //            vista.setVisible(true);
            //            dispose();
            //            Productos.GuardarProductos.setVisible(false);
            //
            //        }else{
            //            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro a actualizar");
            //        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void botonmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmostrarActionPerformed
        //        mostrar();
    }//GEN-LAST:event_botonmostrarActionPerformed

    private void tsProvFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tsProvFocusLost
        //        tsProv.setText("Buscar por cédula, nombres o apellidos");
        //        tsProv.setForeground(Color.gray);
    }//GEN-LAST:event_tsProvFocusLost

    private void tsProvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tsProvMouseClicked
        tsProv.setText("");
    }//GEN-LAST:event_tsProvMouseClicked

    private void tsProvMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tsProvMousePressed
        //        tsProv.setText("");
        //        tsProv.setForeground(Color.black);
    }//GEN-LAST:event_tsProvMousePressed

    private void tsProvMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tsProvMouseReleased

    }//GEN-LAST:event_tsProvMouseReleased

    private void tsProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsProvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tsProvActionPerformed

    private void tsProvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tsProvKeyReleased
        //        buscar();
    }//GEN-LAST:event_tsProvKeyReleased

    private void tsProvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tsProvKeyTyped

    }//GEN-LAST:event_tsProvKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton botonmostrar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPan;
    private javax.swing.JScrollPane jScrollPane1;
    public static final javax.swing.JTable tableProv = new javax.swing.JTable();
    private javax.swing.JTextField tsProv;
    // End of variables declaration//GEN-END:variables
}
