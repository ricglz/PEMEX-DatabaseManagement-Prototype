package proyectofinal;

import com.mysql.jdbc.Statement;
import java.sql.*;
import java.util.logging.*;

public class GUI2 extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    MenuPrincipal frame = new MenuPrincipal();
    public VentanaEmergente emerg = new VentanaEmergente();
    public boolean admin = false;
    
    public GUI2() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        setSize(new java.awt.Dimension(400, 300));

        jButton1.setText("<--");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(301, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(admin==true){
            AdmFrame frame2 = new AdmFrame();
            frame2.setVisible(true); 
        }
        else{
            frame.setVisible(true); 
        }
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void ordenarArreglo(Folio[] arreglo) {
        
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
        
    }
    
    public int busqueda(Folio[] arreglo, int buscar) {
        int medio = 0;
        boolean flag; 
        flag = false;
        int inicio;
        inicio = 0;
        int fin= arreglo.length;
        while((inicio <= fin) && (!flag)){
            medio = (fin + inicio) / 2;
            if(buscar > arreglo[medio].idFolio) { 
                inicio = medio + 1;
            } 
            else if(buscar < arreglo[medio].idFolio) { 
                fin = medio - 1;
            } else {
                flag = true;
            }
        }
        if(flag){
            return medio;
        }
        else{
            return -1;
        }
        
    }
    
    public Folio[] crearArreglo(){
        Folio [] arreglo = null;
        try {
           Class.forName("com.mysql.jdbc.Driver");
            try (java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:1322/Pemex", "root", "")) {
                Statement statement;
                statement = (Statement) conexion.createStatement();
                ResultSet rs = statement.executeQuery("SELECT * FROM Folios ");
                int row=0;
                while(rs.next()){
                    row++;
                }
                Folio [] sent = new Folio [row];
                int x =0;
                if(row!=0){
                    rs.beforeFirst();
                    while(x<row){
                        rs.next();
                        int folio = rs.getInt("idFolios");
                        String sucursal = rs.getString("sucursal");
                        int numPap = rs.getInt("folioRemision");
                        boolean disp = rs.getBoolean("dispo");
                        boolean dañado = rs.getBoolean("anulado");
                        byte dia = rs.getByte("dia");
                        byte mes = rs.getByte("mes");
                        int año = rs.getInt("año");
                        String comentarios = rs.getString("comentarios");
                        sent [x] = new Folio(folio,numPap,disp,dañado, dia, mes, año, sucursal);
                        if(comentarios!= null){
                            sent[x].setComentarios(comentarios);
                        }
                        x++;
                        arreglo=sent;
                    }
                }
                conexion.close();
            } catch (SQLException ex) {
                emerg.cambiarText("No se pudo conectar con la base de datos");
                emerg.setVisible(true);
            }
        }   catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arreglo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
