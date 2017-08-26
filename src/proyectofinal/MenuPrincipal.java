package proyectofinal;

public class MenuPrincipal extends GUI {

    private static final long serialVersionUID = 1L;

    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        LabelMenu = new javax.swing.JLabel();
        BRegistro = new javax.swing.JButton();
        BDefectuoso = new javax.swing.JButton();
        BEmitido = new javax.swing.JButton();
        BBusqueda = new javax.swing.JButton();
        BInventario = new javax.swing.JButton();
        BCerrarSes = new javax.swing.JButton();
        BAsignar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        setPreferredSize(new java.awt.Dimension(400, 300));
        setSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 320));

        LabelMenu.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        LabelMenu.setText("Menú");

        BRegistro.setText("Registrarse");
        BRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRegistroActionPerformed(evt);
            }
        });

        BDefectuoso.setText("Folio Defectuoso");
        BDefectuoso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDefectuosoActionPerformed(evt);
            }
        });

        BEmitido.setText("Folio Emitido");
        BEmitido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEmitidoActionPerformed(evt);
            }
        });

        BBusqueda.setText("Buscar");
        BBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBusquedaActionPerformed(evt);
            }
        });

        BInventario.setText("Inventario");
        BInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInventarioActionPerformed(evt);
            }
        });

        BCerrarSes.setText("Cerrar sesión");
        BCerrarSes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCerrarSesActionPerformed(evt);
            }
        });

        BAsignar.setText("Asignar sucursal");
        BAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAsignarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(LabelMenu))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BDefectuoso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BEmitido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(BCerrarSes, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelMenu)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BRegistro)
                    .addComponent(BAsignar))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BDefectuoso)
                    .addComponent(BBusqueda))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BEmitido)
                    .addComponent(BInventario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BCerrarSes)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 43, 400, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRegistroActionPerformed
        // TODO add your handling code here:
        FrameReg frame = new FrameReg();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_BRegistroActionPerformed

    private void BDefectuosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDefectuosoActionPerformed
        // TODO add your shandling code here:
        FrameDef frame = new FrameDef();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_BDefectuosoActionPerformed

    private void BCerrarSesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCerrarSesActionPerformed
        // TODO add your handling code here:
        GUI_InicioSesion frame = new GUI_InicioSesion();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_BCerrarSesActionPerformed

    private void BBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBusquedaActionPerformed
        // TODO add your handling code here:
        FrameBus frame2 = new FrameBus();
        frame2.setVisible(true);
        dispose();
    }//GEN-LAST:event_BBusquedaActionPerformed

    private void BEmitidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEmitidoActionPerformed
        // TODO add your handling code here:
        FrameEmitido frame = new FrameEmitido();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_BEmitidoActionPerformed

    private void BInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInventarioActionPerformed
        // TODO add your handling code here:
        FrameInv frame = new FrameInv();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_BInventarioActionPerformed

    private void BAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAsignarActionPerformed
        // TODO add your handling code here:
        FrameAsignar frame = new FrameAsignar();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_BAsignarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAsignar;
    private javax.swing.JButton BBusqueda;
    private javax.swing.JButton BCerrarSes;
    private javax.swing.JButton BDefectuoso;
    private javax.swing.JButton BEmitido;
    private javax.swing.JButton BInventario;
    private javax.swing.JButton BRegistro;
    private javax.swing.JLabel LabelMenu;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
