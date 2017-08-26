/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;

public class FrameUsuarios extends GUI2 {

    private static final long serialVersionUID = 1L;
    String [] nombres =  new String[4];
    String [] contraseñas = new String [4];

    public FrameUsuarios() throws IOException {
        initComponents();
        admin = true;
        leerBinario();
        llenarTabla();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableUsuarios = new javax.swing.JTable();
        CambiarDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Usuarios");

        TableUsuarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TableUsuarios.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre de usuario", "Contraseña"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableUsuarios.setToolTipText("");
        TableUsuarios.setRowHeight(24);
        jScrollPane1.setViewportView(TableUsuarios);

        CambiarDatos.setText("Cambia datos");
        CambiarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarDatosActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(CambiarDatos)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CambiarDatos)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CambiarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarDatosActionPerformed
        try {
            // TODO add your handling code here:
            RandomAccessFile miArchivo = new RandomAccessFile("proyecto.dat", "rw");
            miArchivo.setLength(0);
            TableModel model = TableUsuarios.getModel();
            for(int y=0; y<nombres.length; y++){
                nombres[y] = model.getValueAt(y, 0).toString();
            }
            for(int y=0; y<nombres.length; y++){
                contraseñas[y] = model.getValueAt(y, 1).toString();
            }
            byte maxN = (byte) nombres[0].length();
            byte maxC = (byte) contraseñas[0].length();
            for(int x=1; x<nombres.length; x++){
                if(nombres[x].length()>maxN) {
                    maxN = (byte) nombres[x].length();
                }
                if(contraseñas[x].length()>maxC) {
                    maxC = (byte) contraseñas[x].length();
                }
            }
            for(int x=0; x<nombres.length; x++){
                while(nombres[x].length()<maxN){
                    nombres[x] += " ";
                }
                while(contraseñas[x].length()<maxC){
                    contraseñas[x] += " ";
                }
            }
            miArchivo.writeByte(maxN);
            miArchivo.writeByte(maxC);
            for(int x=0; x<nombres.length; x++){
                miArchivo.writeChars(nombres[x]);
                miArchivo.writeChars(contraseñas[x]);
            }
            emerg.cambiarText("Se cambiaron los datos con exito");
            emerg.setVisible(true);
        } catch (FileNotFoundException ex) {
            emerg.cambiarText("No se encontro el archivo.");
            emerg.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(FrameUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_CambiarDatosActionPerformed

    private void leerBinario() throws FileNotFoundException, IOException {
        RandomAccessFile miArchivo = new RandomAccessFile("proyecto.dat", "rw");
        byte maxN= miArchivo.readByte();
        byte maxC= miArchivo.readByte();
        char aux = ' ';
        for(int x=0; x<nombres.length; x++){
            for(int y=0; y<maxN; y++){
                aux = miArchivo.readChar();
                if(aux !=' '){
                    nombres[x] += aux;
                }
            }
            nombres[x] = nombres[x].substring(4);
            for(int y=0; y<maxC; y++){
                aux = miArchivo.readChar();
                if(aux !=' '){
                    contraseñas[x] += aux;
                }
            }
            contraseñas[x] = contraseñas[x].substring(4);
        }
    }
    
    private void llenarTabla() {
        
        String [][] data = new String [4] [2];
        for(int x=0; x<nombres.length; x++){
            data[x][0] = nombres[x];
            data[x][1] = contraseñas[x];
        }
        TableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            data, new String [] {"Nombre de usuario", "Contraseña"}
        ));
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CambiarDatos;
    private javax.swing.JTable TableUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
}
