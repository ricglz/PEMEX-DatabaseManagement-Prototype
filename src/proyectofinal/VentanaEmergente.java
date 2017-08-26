package proyectofinal;

public class VentanaEmergente extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    public VentanaEmergente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Mensaje = new javax.swing.JLabel();
        Aceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mensaje");
        setLocation(new java.awt.Point(500, 200));
        setMaximumSize(new java.awt.Dimension(350, 100));
        setMinimumSize(new java.awt.Dimension(350, 100));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 34, 330, -1));

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        getContentPane().add(Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 65, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_AceptarActionPerformed

    public void cambiarText(String s){
        Mensaje.setText(s);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JLabel Mensaje;
    // End of variables declaration//GEN-END:variables
}
