package proyectofinal;

import com.mysql.jdbc.Statement;
import java.sql.*;
import java.util.Calendar;

public class FrameReg extends GUI2 {

    private static final long serialVersionUID = 1L;
    private boolean error=false;
    
    public FrameReg() {
        int anioA = Calendar.getInstance().get(Calendar.YEAR);
        int mesA = Calendar.getInstance().get(Calendar.MONTH)+1;
        int diaA = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        initComponents();
        int cont=0;
        for(int x=1980; x<=anioA; x++){
            String a = String.valueOf(x);
            ComboAño.addItem(a);
            cont++;
        }
        ComboAño.setSelectedIndex(cont-1);
        for(int x=0; x<ComboMes.getItemCount();x++){
            if(Integer.parseInt(ComboMes.getItemAt(x))==mesA){
                ComboMes.setSelectedIndex(x);
            }
        }
        for(int x=0; x<ComboDia.getItemCount();x++){
            if(Integer.parseInt(ComboDia.getItemAt(x))==diaA){
                ComboDia.setSelectedIndex(x);
            }
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TextRemision = new javax.swing.JTextField();
        TextFolio = new javax.swing.JTextField();
        ComboDia = new javax.swing.JComboBox<>();
        ComboMes = new javax.swing.JComboBox<>();
        ComboAño = new javax.swing.JComboBox<>();
        BEntrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        NoRemision = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        Pasarela = new javax.swing.JCheckBox();
        Coque = new javax.swing.JCheckBox();
        Anulado = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        TextMax = new javax.swing.JTextField();
        SinAsignar = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 350));
        setSize(new java.awt.Dimension(400, 350));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Registro");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 10, 61, 21);

        jLabel3.setText("Folio p. s. max (+1 folio):");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 90, 160, 20);

        jLabel2.setText("Fecha (DD/MM/AAAA):");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 290, 150, 16);

        jLabel7.setText("Folio Remisión:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 140, 120, 16);
        getContentPane().add(TextRemision);
        TextRemision.setBounds(190, 130, 200, 26);
        getContentPane().add(TextFolio);
        TextFolio.setBounds(190, 50, 200, 26);

        ComboDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(ComboDia);
        ComboDia.setBounds(170, 290, 70, 27);

        ComboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        ComboMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboMesActionPerformed(evt);
            }
        });
        getContentPane().add(ComboMes);
        ComboMes.setBounds(240, 290, 70, 27);

        ComboAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboAñoActionPerformed(evt);
            }
        });
        getContentPane().add(ComboAño);
        ComboAño.setBounds(310, 290, 90, 27);

        BEntrar.setText("Entrar");
        BEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(BEntrar);
        BEntrar.setBounds(320, 10, 81, 29);

        jLabel8.setText("Sucursal:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 230, 60, 20);

        NoRemision.setText("No se ha remisionado.");
        getContentPane().add(NoRemision);
        NoRemision.setBounds(200, 160, 180, 23);

        jLabel9.setText("¿Está anulado?");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 190, 130, 20);

        Pasarela.setText("Pasarela");
        getContentPane().add(Pasarela);
        Pasarela.setBounds(300, 250, 90, 23);

        Coque.setText("Coque");
        getContentPane().add(Coque);
        Coque.setBounds(200, 250, 80, 23);

        Anulado.setText("Si está anulado.");
        getContentPane().add(Anulado);
        Anulado.setBounds(200, 190, 140, 23);

        jLabel4.setText("Folio papel seg. min:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 50, 140, 20);
        getContentPane().add(TextMax);
        TextMax.setBounds(190, 90, 200, 26);

        SinAsignar.setText("Bodega");
        getContentPane().add(SinAsignar);
        SinAsignar.setBounds(250, 220, 90, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEntrarActionPerformed
        // TODO add your handling code here:
        try{
            error=false;
            int anio = Integer.parseInt(ComboAño.getSelectedItem().toString());
            int mes = Byte.parseByte(ComboMes.getSelectedItem().toString());
            int dia = Byte.parseByte(ComboDia.getSelectedItem().toString());
            boolean disp = true, dañado = false;
            String sucursal = "";
            int folRemision = 0;
            boolean falso = NoRemision.isSelected();
            if(!falso){
                folRemision = Integer.parseInt(TextRemision.getText());
                disp = false;
            }
            boolean an = Anulado.isSelected();
            if(an){
                disp = false;
                dañado = true;
            }
            int folio = Integer.parseInt(TextFolio.getText());
            int fMax = folio;
            String fMax2 = (TextMax.getText());
            if(fMax2.equalsIgnoreCase("")==false){
                fMax= Integer.parseInt(fMax2);
            }
            boolean coq = Coque.isSelected();
            boolean pas = Pasarela.isSelected();
            boolean sa = SinAsignar.isSelected();
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
            else if(sa){
                sucursal = "Bodega";
            }
            else{
                emerg.cambiarText("Falta seleccionar una opcion");
                emerg.setVisible(true);
                error=true;
            }
            int dispo=0;
            if(disp){
                dispo=1;
            }
            int anul=0;
            if(dañado){
                anul=1;
            }
            if(error==false){
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    try (java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:1322/Pemex", "root", "")) {
                        Statement st = (Statement) conexion.createStatement();
                        for(int x=folio; x<=fMax; x++){
                           st.executeUpdate("insert into Folios(idFolios, folioRemision, dispo, anulado, sucursal, dia, mes, año)" + 
                                "values ('"+x+"','"+folRemision+"','"+dispo+"','"+anul+"','"+sucursal+"','"+
                                   dia+"','"+mes+"','"+anio+"')");
                        }
                        emerg.cambiarText("Se registraron los datos con exito");
                        emerg.setVisible(true);
                        conexion.close(); 
                    } catch (SQLIntegrityConstraintViolationException e) {
                        emerg.cambiarText("El dato que ingreso está repetido");
                        emerg.setVisible(true);
                    } catch (SQLException e) {
                        emerg.cambiarText("El dato que ingreso está repetido");
                        emerg.setVisible(true);
                    }
                }  catch (ClassNotFoundException ex) {
                    emerg.cambiarText("Falta la libreria");
                    emerg.setVisible(true);
                }  
            } 
        } catch(java.lang.NumberFormatException ex){
            emerg.cambiarText("Falto ingresar algun folio");
            emerg.setVisible(true);
            error=true;
        }
        
    }//GEN-LAST:event_BEntrarActionPerformed

    private void ComboMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboMesActionPerformed
        
        byte mes = Byte.parseByte(ComboMes.getSelectedItem().toString());
        ComboDia.removeAllItems();
        switch(mes){
            case 2:{
                int anio = Integer.parseInt(ComboAño.getSelectedItem().toString());
                if((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
                    for(int x=1; x<30; x++){
                        ComboDia.addItem(String.valueOf(x));
                    }
                }
                else{
                    for(int x=1; x<29; x++){
                        ComboDia.addItem(String.valueOf(x));
                    }
                }
                break;
            }
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:{
                for(int x=1; x<32; x++){
                    ComboDia.addItem(String.valueOf(x));
                }
                break;
            }
            default:{
                for(int x=1; x<31; x++){
                    ComboDia.addItem(String.valueOf(x));
                }
                break;
            }
        }
        
    }//GEN-LAST:event_ComboMesActionPerformed

    private void ComboAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboAñoActionPerformed
        
        byte mes = Byte.parseByte(ComboMes.getSelectedItem().toString());
        if(mes==2){
            ComboMesActionPerformed(evt);
        }
        
    }//GEN-LAST:event_ComboAñoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Anulado;
    private javax.swing.JButton BEntrar;
    private javax.swing.JComboBox<String> ComboAño;
    private javax.swing.JComboBox<String> ComboDia;
    private javax.swing.JComboBox<String> ComboMes;
    private javax.swing.JCheckBox Coque;
    private javax.swing.JCheckBox NoRemision;
    private javax.swing.JCheckBox Pasarela;
    private javax.swing.JCheckBox SinAsignar;
    private javax.swing.JTextField TextFolio;
    private javax.swing.JTextField TextMax;
    private javax.swing.JTextField TextRemision;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
