package proyectofinal;

import javax.swing.table.*;

public class FrameDatos extends GUI2 {

    private static final long serialVersionUID = 1L;
    private final Folio[] arreglo = crearArreglo();

    public FrameDatos() {
        initComponents();
        armarTabla();
        admin = true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableDatos = new javax.swing.JTable();
        CBOrdenar = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Datos");
        setLocation(new java.awt.Point(300, 230));
        setMaximumSize(new java.awt.Dimension(750, 300));
        setMinimumSize(new java.awt.Dimension(750, 300));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Datos");

        TableDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TableDatos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TableDatos.setToolTipText("");
        TableDatos.setMaximumSize(new java.awt.Dimension(740, 290));
        TableDatos.setMinimumSize(new java.awt.Dimension(740, 290));
        TableDatos.setRowHeight(32);
        jScrollPane1.setViewportView(TableDatos);

        CBOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ordenar: Menor -> Mayor", "Ordenar: Mayor -> Menor" }));
        CBOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOrdenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CBOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CBOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOrdenarActionPerformed
        
        char opcion = CBOrdenar.getSelectedItem().toString().charAt(10);
        switch(opcion){
            case 'e':
                mMayor();
                break;
            case 'a':
                mMenor();
                break;
        }
        emerg.cambiarText("Se cambiaron los datos");
        emerg.setVisible(true);
        
    }//GEN-LAST:event_CBOrdenarActionPerformed

    private void mMayor() {
        
        int pibote;
        for (int x = 1 ; x < arreglo.length ; x++) {
            Folio aux = arreglo[x];
            pibote = x; 
            while (pibote > 0 && arreglo[pibote - 1].idFolio > aux.idFolio) {
                arreglo[pibote] = arreglo[pibote - 1];    
                --pibote;
            }
 
            arreglo[pibote] = aux;   
        }
        armarTabla();
        
    }

    private void mMenor() {
        
        int pibote;
        for (int x = 1 ; x < arreglo.length ; x++) {
            Folio aux = arreglo[x];
            pibote = x; 
            while (pibote > 0 && arreglo[pibote - 1].idFolio < aux.idFolio) {
                arreglo[pibote] = arreglo[pibote - 1];    
                --pibote;
            }
 
            arreglo[pibote] = aux;   
        }
        armarTabla();
        
    }
    
    private void armarTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Folio Unico");
        modelo.addColumn("Sucursal");
        modelo.addColumn("Num Remision");
        modelo.addColumn("Disponible");
        modelo.addColumn("Anulado");
        modelo.addColumn("Dia");
        modelo.addColumn("Mes");
        modelo.addColumn("Año");
        modelo.addColumn("Comentarios");
        for (Folio arreglo1 : arreglo) {
            Object [] fila = new Object[9];
            fila [0] = arreglo1.idFolio;
            fila [1] = arreglo1.sucursal;
            fila [2] = arreglo1.numRemision;
            fila [3] = arreglo1.disp;
            fila [4] = arreglo1.anulado;
            fila [5] = arreglo1.dia;
            fila [6] = arreglo1.mes;
            fila [7] = arreglo1.año;
            fila [8] = arreglo1.comentarios;
            modelo.addRow(fila);
        }
        TableDatos.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBOrdenar;
    private javax.swing.JTable TableDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
 
}
