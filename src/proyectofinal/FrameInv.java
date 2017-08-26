/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.util.Calendar;

public class FrameInv extends GUI2 {

    private static final long serialVersionUID = 1L;
    int cont=0;
    int contA=0;
    int contE=0;
    int contT=0;
    String fDisp ="";
    String fUt ="";
    int fMin=0;
    int fMin2=0;
    int fMax=0;
    int fMax2=0;
    Folio [] arreglo;
    String sucursal="";
    Calendar c = Calendar.getInstance();
    int mesB = c.get(Calendar.MONTH) +1;
    int añoB = c.get(Calendar.YEAR);
    
    public FrameInv() {
        initComponents();
        Recursivo.setEditable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CBCoque = new javax.swing.JCheckBox();
        CBPasarela = new javax.swing.JCheckBox();
        CoBTiempo = new javax.swing.JComboBox<>();
        CBAmbos = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        Scroll = new javax.swing.JScrollPane();
        Recursivo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BAceptar.setText("Aceptar");
        BAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(BAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 6, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Inventario ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 8, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setText("Tiempo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        CBCoque.setText("Coque");
        getContentPane().add(CBCoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        CBPasarela.setText("Pasarela");
        getContentPane().add(CBPasarela, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        CoBTiempo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mensual", "Trimestral", "Semestral", "Anual" }));
        getContentPane().add(CoBTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 137, -1));

        CBAmbos.setText("Ambos");
        getContentPane().add(CBAmbos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setText("Sucursal:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        Scroll.setToolTipText("");

        Recursivo.setColumns(20);
        Recursivo.setRows(5);
        Scroll.setViewportView(Recursivo);

        getContentPane().add(Scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 380, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    private void BAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAceptarActionPerformed
        
        cont=0;
        arreglo = crearArreglo();
        contA=0;
        contE=0;
        contT=0;
        fMin=0;
        fMin2=0;
        fMax=0;
        fMax2=0;
        fDisp ="";
        fUt ="";
        sucursal="";
        boolean amb = CBAmbos.isSelected();
        boolean coq = CBCoque.isSelected();
        boolean pas = CBPasarela.isSelected();
        if(amb == true){
            if((coq == true) || (pas == true)){
                emerg.cambiarText("No puede usar 2 botones al mismo tiempo");
                emerg.setVisible(true);
            }
            else{
               sucursal=CBAmbos.getText(); 
            }
        }
        else if(coq == true){
            if((amb == true) || (pas == true)){
                emerg.cambiarText("No puede usar 2 botones al mismo tiempo");
                emerg.setVisible(true);
            }
            else{
                sucursal=CBCoque.getText();
            }
        }
        else if(pas == true){
            if((amb == true) || (coq == true)){
                emerg.cambiarText("No puede usar 2 botones al mismo tiempo");
                emerg.setVisible(true);
            }
            else{
                sucursal=CBPasarela.getText();
            }
        }
        if(sucursal.equals("")!=true){
            if(sucursal.equals("Ambos")==true){
                if(CoBTiempo.getSelectedItem().equals("Mensual")==true){
                    aMen();
                }
                else if(CoBTiempo.getSelectedItem().equals("Trimestral")==true){
                    aTri();
                }
                else if(CoBTiempo.getSelectedItem().equals("Semestral")==true){
                    aSem();
                }
                else if(CoBTiempo.getSelectedItem().equals("Anual")==true){
                    aAnual();
                }
            }
            else{
                if(CoBTiempo.getSelectedItem().equals("Mensual")==true){
                    sMen();
                }
                else if(CoBTiempo.getSelectedItem().equals("Trimestral")==true){
                    sTri();
                }
                else if(CoBTiempo.getSelectedItem().equals("Semestral")){
                    sSem();
                }
                else if(CoBTiempo.getSelectedItem().equals("Anual")){
                    sAnual();
                }
            }
            if(cont!=0){
                String total = "Se registraron un total de: " + cont +
                        " folios de papel seguridad, en el tiempo transcurrido";
                String disp = "Estan disponibles los folios: " +fDisp;
                String anulado = "De los cuales " +contA +" fueron anulados";
                String emitidos = " y " +contE +" fueron emitidos";
                String ut = "Y esos folios son: " + fUt;
                String restantes = "Por lo que restan " +(cont-contA-contE) +
                        " folios en la(s) bodega(s) de la(s) sucursal(es)";
                Recursivo.setText(total +"\n" + disp +"\n" + anulado + emitidos 
                        + "\n" + ut +"\n" + restantes);
            }
            else{
                Recursivo.setText("No se regustro ningun folio en el tiempo escogido");
            }
        }
    }//GEN-LAST:event_BAceptarActionPerformed
    
    private void aMen(){
        for (Folio arreglo1 : arreglo) {
            contT++;
            if (arreglo1.mes == mesB && arreglo1.año == añoB) {
                contar(arreglo1);
            }
        }
        terminarArr();
    }
    
    private void sMen() {
        for (Folio arreglo1 : arreglo) {
            contT++;
            if (arreglo1.mes == mesB && arreglo1.año == añoB && 
                    arreglo1.sucursal.equals(sucursal)==true) {
                contar(arreglo1);
            }
        }
        terminarArr();
    }

    private void aTri() {
        for (Folio arreglo1 : arreglo) {
            contT++;
            if (arreglo1.año == añoB) {
                switch (arreglo1.mes % 3) {
                    case 0:
                        if(mesB<=(arreglo1.mes+2) && mesB>=arreglo1.mes){
                            contar(arreglo1);
                        } break;
                    case 1:
                        if(mesB<=(arreglo1.mes+1) && mesB>=(arreglo1.mes-1)){
                            contar(arreglo1);
                        }   break;
                    case 2:
                        if(mesB<=arreglo1.mes && mesB>=(arreglo1.mes-2)){
                            contar(arreglo1);
                        }   break;
                }
            }
        }
        terminarArr();
    }
    
    private void sTri() {
        for (Folio arreglo1 : arreglo) {
            contT++;
            if (arreglo1.año == añoB
                    && arreglo1.sucursal.equals(sucursal)==true) {
                switch (arreglo1.mes % 3) {
                    case 0:
                        if(mesB<=(arreglo1.mes+2) && mesB>=arreglo1.mes){
                            contar(arreglo1);
                        }   break;
                    case 1:
                        if(mesB<=(arreglo1.mes+1) && mesB>=(arreglo1.mes-1)){
                            contar(arreglo1);
                        }   break;
                    case 2:
                        if(mesB<=arreglo1.mes && mesB>=(arreglo1.mes-2)){
                            contar(arreglo1);
                        }   break;
                }
            }
        }
        terminarArr();
    }
    
    private void aSem() {
        for (Folio arreglo1 : arreglo) {
            contT++;
            if (arreglo1.año == añoB) {
                switch (arreglo1.mes % 3) {
                    case 0:
                        if(mesB<=(arreglo1.mes+5) && mesB>=arreglo1.mes){
                            contar(arreglo1);
                        }   break;
                    case 1:
                        if(mesB<=(arreglo1.mes+4) && mesB>=(arreglo1.mes-1)){
                            contar(arreglo1);
                        }   break;
                    case 2:
                        if(mesB<=(arreglo1.mes+3) && mesB>=(arreglo1.mes-2)){
                            contar(arreglo1);
                        }   break;
                    case 3:
                        if(mesB<=(arreglo1.mes+2) && (mesB>=arreglo1.mes-3)){
                            contar(arreglo1);
                        }   break;
                    case 4:
                        if(mesB<=(arreglo1.mes+1) && mesB>=(arreglo1.mes-4)){
                            contar(arreglo1);
                        }   break;
                    case 5:
                        if(mesB<=arreglo1.mes && mesB>=(arreglo1.mes-5)){
                            contar(arreglo1);
                        }   break;
                }
            }
        }
        terminarArr();
    }
    
    private void sSem() {
        for (Folio arreglo1 : arreglo) {
            contT++;
            if (arreglo1.año == añoB && 
                    arreglo1.sucursal.equals(sucursal)==true) {
                switch (arreglo1.mes % 3) {
                    case 0:
                        if(mesB<=(arreglo1.mes+5) && mesB>=arreglo1.mes){
                            contar(arreglo1);
                        }   break;
                    case 1:
                        if(mesB<=(arreglo1.mes+4) && mesB>=(arreglo1.mes-1)){
                            contar(arreglo1);
                        }   break;
                    case 2:
                        if(mesB<=(arreglo1.mes+3) && mesB>=(arreglo1.mes-2)){
                            contar(arreglo1);
                        }   break;
                    case 3:
                        if(mesB<=(arreglo1.mes+2) && (mesB>=arreglo1.mes-3)){
                            contar(arreglo1);
                        }   break;
                    case 4:
                        if(mesB<=(arreglo1.mes+1) && mesB>=(arreglo1.mes-4)){
                            contar(arreglo1);
                        }   break;
                    case 5:
                        if(mesB<=arreglo1.mes && mesB>=(arreglo1.mes-5)){
                            contar(arreglo1);
                        }   break;
                }
            }
        }
        terminarArr();
    }
    
    private void aAnual() {
        for (Folio arreglo1 : arreglo) {
            contT++;
            if (arreglo1.año == añoB) {
                contar(arreglo1);
            }
        }
        terminarArr();
    }
    
    private void sAnual() {
        for (Folio arreglo1 : arreglo) {
            if (arreglo1.año == añoB && 
                    arreglo1.sucursal.equals(sucursal)==true) {
                contar(arreglo1);
            }
        }
        terminarArr();
    }
    
    private void contar(Folio arreglo1) {
        cont++;
        if(arreglo1.anulado){
            contA++;
            conteoDisp();
            agregarReg(arreglo1);
        }
        else if(!arreglo1.disp && !arreglo1.anulado){
            contE++;
            conteoDisp();
            agregarReg(arreglo1);
        }
        else{
            conteoReg();
            agregarDisp(arreglo1);
        }
    }

    private void conteoReg() {
        if(fMin2!=0){
            if(fUt.equals("")==true){
                fUt = (fMax2!=0) ? ", ("+fMin2+"-"+fMax2+")" : ", ("+fMin2+")";
            }
            else{
                if(fMax2!=0){
                    fUt= fUt +", ("+fMin2+"-"+fMax2+")";
                }
                else{
                    fUt = fUt+ ", ("+fMin2+")";
                }
            }
            fMin2=0;
        }
    }
    
    private void conteoDisp() {
        if(fMin!=0){
            if(fDisp.equals("")==true){
                fDisp = (fMax!=0) ? "(" + fMin +"-"+fMax+")" : "(" + fMin + ")";
            }
            else{
                if(fMax!=0){
                    fDisp = fDisp + ", (" + fMin +"-"+fMax+")";
                }
                else{
                    fDisp = fDisp + ", (" + fMin + ")";
                }
            }
            fMin=0;
        }
    }
    
    private void agregarDisp(Folio arreglo1) {
       if(fMin==0){
           fMin=arreglo1.idFolio;
       }
       else{
           fMax=arreglo1.idFolio;
       } 
    }
    
    private void agregarReg(Folio arreglo1) {
        if(fMin2!=0){
            fMax2=arreglo1.idFolio;
        }
        else{
            fMin2=arreglo1.idFolio;
        }
    }
    
    private void terminarArr() {
        conteoDisp();
        conteoReg();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAceptar;
    private javax.swing.JCheckBox CBAmbos;
    private javax.swing.JCheckBox CBCoque;
    private javax.swing.JCheckBox CBPasarela;
    private javax.swing.JComboBox<String> CoBTiempo;
    private javax.swing.JTextArea Recursivo;
    private javax.swing.JScrollPane Scroll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

}