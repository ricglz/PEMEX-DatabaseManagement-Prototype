package proyectofinal;

import java.io.*;


public class GUI_InicioSesion2 extends GUI {

    private static final long serialVersionUID = 1L;
    String [] nombres =  new String[4];
    String [] contraseñas = new String [4];
    
    public GUI_InicioSesion2() throws IOException {
        initComponents();
        leerBinario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuSesion = new javax.swing.JPanel();
        Usuario = new javax.swing.JLabel();
        NombreDeUsuario = new javax.swing.JTextField();
        Usuario1 = new javax.swing.JLabel();
        Contraseña = new javax.swing.JPasswordField();
        Entrar = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(349, 259));
        setPreferredSize(new java.awt.Dimension(390, 280));
        getContentPane().setLayout(null);

        MenuSesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Usuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Usuario.setText("Contraseña:");

        NombreDeUsuario.setToolTipText("");
        NombreDeUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NombreDeUsuarioKeyPressed(evt);
            }
        });

        Usuario1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Usuario1.setText("Nombre de usuario:");

        Contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ContraseñaKeyPressed(evt);
            }
        });

        Entrar.setText("Entrar");
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuSesionLayout = new javax.swing.GroupLayout(MenuSesion);
        MenuSesion.setLayout(MenuSesionLayout);
        MenuSesionLayout.setHorizontalGroup(
            MenuSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuSesionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuSesionLayout.createSequentialGroup()
                        .addComponent(Usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NombreDeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(MenuSesionLayout.createSequentialGroup()
                        .addGroup(MenuSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuSesionLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuSesionLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(Usuario)))
                        .addGroup(MenuSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuSesionLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Contraseña)
                                .addContainerGap())
                            .addGroup(MenuSesionLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        MenuSesionLayout.setVerticalGroup(
            MenuSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuSesionLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(MenuSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MenuSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MenuSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(MenuSesion);
        MenuSesion.setBounds(0, 46, 390, 210);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        
        GUI_InicioSesion frame = new GUI_InicioSesion();
        frame.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_RegresarActionPerformed

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed

        entrar();
        
    }//GEN-LAST:event_EntrarActionPerformed

    private void ContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContraseñaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==10){
            entrar();
        }
    }//GEN-LAST:event_ContraseñaKeyPressed

    private void NombreDeUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreDeUsuarioKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==10){
            entrar();
        }
    }//GEN-LAST:event_NombreDeUsuarioKeyPressed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JButton Entrar;
    private javax.swing.JPanel MenuSesion;
    private javax.swing.JTextField NombreDeUsuario;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel Usuario;
    private javax.swing.JLabel Usuario1;
    // End of variables declaration//GEN-END:variables

    private void entrar() {
        String n = NombreDeUsuario.getText();
        String clave = new String(Contraseña.getPassword());
        boolean sent=false;
        if(n.equals("")){
            emerg.cambiarText("Introducir usuario");
            emerg.setVisible(true);
        }
        else if(clave.equals("")){
            emerg.cambiarText("Introducir contraseña");
            emerg.setVisible(true);
        }
        else{
            byte x=0;
            while(x<nombres.length && sent==false){
                if(n.equals(nombres[x])==true){
                    if(clave.equals(contraseñas[x])==true){
                        if(x!=3){
                            MenuPrincipal frame = new MenuPrincipal();
                            frame.setVisible(true);
                            dispose();
                        }
                        else{
                            AdmFrame frame = new AdmFrame();
                            frame.setVisible(true);
                            dispose();
                        }
                    }
                    else{
                        emerg.cambiarText("Contraseña Incorrecta");
                        emerg.setVisible(true);
                    }
                    sent=true;
                }
                x++;
            }
            if(sent==false){
                emerg.cambiarText("El usuario no existe");
                emerg.setVisible(true);
            }
        }
    }
}
