package proyectofinal;

import java.sql.*;
import java.util.logging.*;



public class FrameDef extends GUI2 {

    private static final long serialVersionUID = 1L;
    public byte longitud=32;
    
    public FrameDef() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Recursivo = new javax.swing.JLabel();
        TFFolio = new javax.swing.JTextField();
        TFComentarios = new javax.swing.JTextField();
        Caracteres = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BAceptar.setText("Aceptar");
        BAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAceptarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Folio defectuoso");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Folio papel seguridad:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Comentarios:");

        Recursivo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Recursivo.setForeground(new java.awt.Color(204, 0, 51));
        Recursivo.setText(" ");

        TFComentarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFComentariosKeyTyped(evt);
            }
        });

        Caracteres.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Caracteres.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49)
                        .addComponent(BAceptar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Recursivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TFFolio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFComentarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(Caracteres, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(BAceptar))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Caracteres)
                .addGap(34, 34, 34)
                .addComponent(Recursivo)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAceptarActionPerformed
        String comentario = TFComentarios.getText();
        if(comentario.length()<=longitud){
            Folio [] arreglo = crearArreglo();
            int buscar = Integer.parseInt(TFFolio.getText());
            ordenarArreglo(arreglo);
            int posicion = busqueda(arreglo, buscar);
            if(posicion != -1){
                byte dispo = 0;
                byte anulado = 1;
                try {
                Class.forName("com.mysql.jdbc.Driver");
                    try (java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:1322/Pemex", "root", "")) {
                        String accion = "Update Folios set dispo='"
                                +dispo+"', anulado ='"+ anulado +
                                "', comentarios ='"+ comentario +
                                "' WHERE idFolios='"+buscar+"'";
                        PreparedStatement pst = conexion.prepareStatement(accion);
                        pst.execute();
                        conexion.close();
                        frame.setVisible(true);
                        emerg.cambiarText("Exito");
                        emerg.setVisible(true);
                        dispose();
                        }
                    } catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(FrameEmitido.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
            else{
                Recursivo.setText("No se encontró el folio.");
            }
        }
        else{
            Recursivo.setText("Se excedió el numero de caracteres en el comentario.");
        }
    }//GEN-LAST:event_BAceptarActionPerformed

    private void TFComentariosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFComentariosKeyTyped
        // TODO add your handling code here:
        if(evt.getKeyCode()!=8){
            String texto = TFComentarios.getText();
            int tamano = texto.length();
            if(tamano>longitud){
                TFComentarios.setText(texto.substring(0,(longitud-1)));
                tamano--;
            }
            Caracteres.setText("Te quedan: " + (longitud-tamano-1) +" caracteres."); 
        }
    }//GEN-LAST:event_TFComentariosKeyTyped

    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAceptar;
    private javax.swing.JLabel Caracteres;
    private javax.swing.JLabel Recursivo;
    private javax.swing.JTextField TFComentarios;
    private javax.swing.JTextField TFFolio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
