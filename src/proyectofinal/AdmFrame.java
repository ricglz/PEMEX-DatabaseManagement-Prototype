package proyectofinal;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdmFrame extends GUI {

    private static final long serialVersionUID = 1L;

    public AdmFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        LabelMenu = new javax.swing.JLabel();
        BUsuarios = new javax.swing.JButton();
        BDatos = new javax.swing.JButton();
        BCerrarSes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 320));

        LabelMenu.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        LabelMenu.setText("Menú de administracion");

        BUsuarios.setText("Ver/Cambiar Usuarios");
        BUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUsuariosActionPerformed(evt);
            }
        });

        BDatos.setText("Ver todos los datos de la base");
        BDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDatosActionPerformed(evt);
            }
        });

        BCerrarSes.setText("Cerrar sesión");
        BCerrarSes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCerrarSesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BCerrarSes, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelMenu)
                .addGap(86, 86, 86))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelMenu)
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(BCerrarSes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 38, 400, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUsuariosActionPerformed
        // TODO add your handling code here:
        FrameUsuarios frame;
        try {
            frame = new FrameUsuarios();
            frame.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdmFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_BUsuariosActionPerformed

    private void BDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDatosActionPerformed
        // TODO add your shandling code here:
        FrameDatos frame = new FrameDatos();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_BDatosActionPerformed

    private void BCerrarSesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCerrarSesActionPerformed
        // TODO add your handling code here:
        GUI_InicioSesion frame = new GUI_InicioSesion();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_BCerrarSesActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCerrarSes;
    private javax.swing.JButton BDatos;
    private javax.swing.JButton BUsuarios;
    private javax.swing.JLabel LabelMenu;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
