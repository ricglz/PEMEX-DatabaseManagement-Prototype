/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.sql.*;

/**
 *
 * @author Ricardo
 */
public class FrameAsignar extends GUI2 {

    /**
     * Creates new form FrameAsignar
     */
    public FrameAsignar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BAsignar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Pasarela = new javax.swing.JCheckBox();
        Coque = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        TextFolio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TextMax = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setSize(new java.awt.Dimension(400, 300));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Asignar");

        BAsignar.setText("Asignar");
        BAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAsignarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Posible sucursal asig. :");

        Pasarela.setText("Pasarela");

        Coque.setText("Coque");

        jLabel4.setText("Folio p. s. max (+1 folio):");

        jLabel5.setText("Folio papel seg. min:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(88, 88, 88)
                        .addComponent(BAsignar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(Coque, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(Pasarela, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(TextFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(20, 20, 20)
                                .addComponent(TextMax, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(BAsignar))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Pasarela)
                        .addComponent(Coque))
                    .addComponent(jLabel3))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAsignarActionPerformed
        
        try{
            Folio [] arreglo = crearArreglo();
            int buscar = Integer.parseInt(TextFolio.getText());
            int max;
            if(TextMax.getText().equals("")){
                max=buscar;
            }
            else{
                max = Integer.parseInt(TextMax.getText());
            }
            ordenarArreglo(arreglo);
            int posicion = busqueda(arreglo, buscar);
            String sucursal="";
            boolean coq = Coque.isSelected();
            boolean pas = Pasarela.isSelected();
            if(coq){
                if(pas){
                    emerg.cambiarText("No se pueden seleccionar las 2 sucursales");
                    emerg.setVisible(true);
                }
                else{
                    sucursal = "Coque";
                }
            }
            else if(pas){
                if(coq){
                    emerg.cambiarText("No se pueden seleccionar las 2 sucursales");
                    emerg.setVisible(true);  
                }
                else{
                    sucursal = "Pasarela";
                }
            }
            else{
                emerg.cambiarText("Falta seleccionar una opcion");
                emerg.setVisible(true);
            }
            if(posicion != -1 && sucursal.equals("")==false){
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                        try (java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:1322/Pemex", "root", "")) {
                            String accion = "Update Folios set sucursal='" +sucursal 
                                    +  "' WHERE idFolios='"+buscar+"'";
                            PreparedStatement pst = conexion.prepareStatement(accion);
                            pst.execute();
                            conexion.close();
                            frame.setVisible(true);
                            emerg.cambiarText("Exito");
                            emerg.setVisible(true);
                            dispose();
                            }
                        } catch (ClassNotFoundException ex) {
                            emerg.cambiarText("No esta la libreria");
                            emerg.setVisible(true);
                        } catch (SQLException  ex){
                            emerg.cambiarText("Hay un problema");
                            emerg.setVisible(true);
                        }
               
            }
            else{
                emerg.cambiarText("No se encontro el folio");
                emerg.setVisible(true);
            }
        } catch(java.lang.NumberFormatException ex){
            emerg.cambiarText("Falto ingresar el folio de inicio");
            emerg.setVisible(true);
        }
    }//GEN-LAST:event_BAsignarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAsignar;
    private javax.swing.JCheckBox Coque;
    private javax.swing.JCheckBox Pasarela;
    private javax.swing.JTextField TextFolio;
    private javax.swing.JTextField TextMax;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
