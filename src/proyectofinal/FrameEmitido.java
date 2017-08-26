
package proyectofinal;

import java.sql.*;
import java.util.ArrayList;

public class FrameEmitido extends GUI2 {

    private static final long serialVersionUID = 1L;
    private Folio [] arreglo = crearArreglo();
    private ArrayList <Integer> arr= new ArrayList<>();
    
    public FrameEmitido() {
        initComponents();
        if(arreglo[0] !=null){
            for(Folio arreglo1 : arreglo){
            if(arreglo1.numRemision==0){
                CBPrim.addItem(String.valueOf(arreglo1.idFolio));
                CBUlt.addItem(String.valueOf(arreglo1.idFolio));
                arr.add(arreglo1.idFolio);
            }
        }
        }
        CBUlt.setSelectedIndex(0);
        CBPrim.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Aceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CBPrim = new javax.swing.JComboBox<>();
        CBUlt = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TFPrim = new javax.swing.JTextField();
        TFUlt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CBSuc = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 320));
        setMinimumSize(new java.awt.Dimension(400, 320));
        setPreferredSize(new java.awt.Dimension(400, 320));
        setSize(new java.awt.Dimension(400, 320));
        getContentPane().setLayout(null);

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        getContentPane().add(Aceptar);
        Aceptar.setBounds(300, 10, 92, 29);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Folio emitido");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 10, 98, 21);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Folio(s) papel seguridad:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(6, 96, 170, 17);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Num de remisión asignado(s):");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 140, 205, 17);

        getContentPane().add(CBPrim);
        CBPrim.setBounds(180, 90, 110, 27);

        getContentPane().add(CBUlt);
        CBUlt.setBounds(290, 90, 110, 27);

        jLabel4.setText("Ultimo");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(310, 60, 50, 16);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setText("Sucursal:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 260, 70, 17);

        jLabel6.setText("Primero");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(210, 60, 50, 16);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel7.setText("Inicio del intervalo:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 180, 130, 17);
        getContentPane().add(TFPrim);
        TFPrim.setBounds(190, 180, 200, 26);
        getContentPane().add(TFUlt);
        TFUlt.setBounds(190, 220, 200, 26);

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel8.setText("Fin del intervalo:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 220, 120, 17);

        CBSuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pasarela", "Coque" }));
        getContentPane().add(CBSuc);
        CBSuc.setBounds(230, 260, 110, 27);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed

        int min = Integer.parseInt(CBPrim.getSelectedItem().toString());
        int max = Integer.parseInt(CBUlt.getSelectedItem().toString());
        int min2 = Integer.parseInt(TFPrim.getText());
        int max2 = Integer.parseInt(TFUlt.getText());
        boolean error=false;
        if(min2==0 || max2==0){
            emerg.cambiarText("Falta introducir datos");
            emerg.setVisible(true);
            error=true;
        }
        String sucursal = CBSuc.getSelectedItem().toString();
        int dif= max - min;
        int dif2 = max2 - min2;
        if(dif2==dif && error!=true){
            byte dispo = 0;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                    try (java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:1322/Pemex", "root", "")) {
                        for(int x=0; x<dif; x++){
                            String accion = "Update Folios set dispo='"
                                +dispo+"', folioRemision= '"
                                +(min2+x)+"', sucursal= '"
                                +(sucursal)+"'WHERE idFolios='"+(min+x)+"'";
                            PreparedStatement pst = conexion.prepareStatement(accion);
                            pst.execute();
                        }
                        conexion.close();
                        frame.setVisible(true);
                        emerg.cambiarText("Exito");
                        emerg.setVisible(true);
                        dispose();
                        } catch( SQLException ex){
                            emerg.cambiarText("No se encontro la base de datos");
                            emerg.setVisible(true);
                        }
            } catch (ClassNotFoundException ex) {
                emerg.cambiarText("No esta la libreria.");
                emerg.setVisible(true);
            }
        }
        else{
            emerg.cambiarText("Los numeros no coinciden.");
            emerg.setVisible(true);
        }
        
    }//GEN-LAST:event_AceptarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JComboBox<String> CBPrim;
    private javax.swing.JComboBox<String> CBSuc;
    private javax.swing.JComboBox<String> CBUlt;
    private javax.swing.JTextField TFPrim;
    private javax.swing.JTextField TFUlt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
