package sequence;

import java.io.IOException;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class CrearUsuario extends javax.swing.JFrame {

    AdminUsuarios adminuser = new AdminUsuarios();
    public CrearUsuario() throws IOException {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        UsernameTxT = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Contra = new javax.swing.JPasswordField();
        ConfirmarContra = new javax.swing.JPasswordField();
        ConfirmarContraTxT = new javax.swing.JLabel();
        CrearUsuarioBtn = new javax.swing.JButton();
        RegresarBtn = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Titulo.setText("Crear Usuario");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 230, 40));

        Username.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        jPanel1.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 125, 30));

        UsernameTxT.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        UsernameTxT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsernameTxT.setText("Nombre de Usuario");
        jPanel1.add(UsernameTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 160, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Contraseña");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 110, 30));

        Contra.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(Contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 125, 30));

        ConfirmarContra.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(ConfirmarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 125, 30));

        ConfirmarContraTxT.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ConfirmarContraTxT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ConfirmarContraTxT.setText("Confirmar Contraseña");
        jPanel1.add(ConfirmarContraTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 200, 30));

        CrearUsuarioBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CrearUsuarioBtn.setText("Crear Usuario");
        CrearUsuarioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearUsuarioBtnActionPerformed(evt);
            }
        });
        jPanel1.add(CrearUsuarioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 150, 40));

        RegresarBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        RegresarBtn.setText("Regresar");
        RegresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(RegresarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 100, 30));

        Fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameActionPerformed

    private void CrearUsuarioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearUsuarioBtnActionPerformed
        String username=Username.getText();
        String contra=Contra.getText();
        Calendar fechacreacion = Calendar.getInstance();
        if(!contra.equals("") && !username.equals("")){
            if(contra.equals(ConfirmarContra.getText())){
                try{
                    if(adminuser.BuscarUser(username)==-1){
                        adminuser.CrearUser(username, contra, 0, fechacreacion);
                        JOptionPane.showMessageDialog(null, "Se creó el usuario exitosamente", "Usuario creado", JOptionPane.INFORMATION_MESSAGE);
                        AdminPantallas.AbrirMenuInicio();
                        this.dispose();
                    }else
                    JOptionPane.showMessageDialog(null, "El nombre de usuario ya está en uso", "Error", JOptionPane.ERROR_MESSAGE);
                }catch(IOException e){
                    JOptionPane.showMessageDialog(null, "Vaya parece que esto no debía pasar", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }else
            JOptionPane.showMessageDialog(null, "La contraseña no coincide", "Error", JOptionPane.ERROR_MESSAGE);
        } else
        JOptionPane.showMessageDialog(null, "Complete todos los espacios", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_CrearUsuarioBtnActionPerformed

    private void RegresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarBtnActionPerformed
        AdminPantallas.AbrirMenuInicio();
        this.dispose();
    }//GEN-LAST:event_RegresarBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ConfirmarContra;
    private javax.swing.JLabel ConfirmarContraTxT;
    private javax.swing.JPasswordField Contra;
    private javax.swing.JButton CrearUsuarioBtn;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton RegresarBtn;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel UsernameTxT;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
