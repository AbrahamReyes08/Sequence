package sequence;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class IniciarSesion extends javax.swing.JFrame {
    
    AdminUsuarios adminuser = new AdminUsuarios();
    
    public IniciarSesion() throws IOException {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        IniciarSesionBtn = new javax.swing.JButton();
        Contra = new javax.swing.JPasswordField();
        Username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ContraseñaTxT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Titulo.setText("Iniciar Sesión");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 34, -1, -1));

        jButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 454, -1, 30));

        IniciarSesionBtn.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        IniciarSesionBtn.setText("Iniciar Sesión");
        IniciarSesionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSesionBtnActionPerformed(evt);
            }
        });
        jPanel1.add(IniciarSesionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        Contra.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jPanel1.add(Contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 140, -1));

        Username.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jPanel1.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 140, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Nombre de Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        ContraseñaTxT.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        ContraseñaTxT.setText("Contraseña");
        jPanel1.add(ContraseñaTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniciarSesionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSesionBtnActionPerformed
        String username = Username.getText();
        String contra = Contra.getText();
        if(!username.equals("") && !contra.equals("")){
            try{
                if(adminuser.getUsuario(username)!=null){
                    ArrayList<Object> usuario = adminuser.getUsuario(username);
                    if(usuario.get(1).equals(contra)){
                        AdminPantallas.AbrirMenuPrincipal();
                        this.dispose();
                    } else
                        JOptionPane.showMessageDialog(null, "La contraseña no es correcta", "Error", JOptionPane.ERROR_MESSAGE);
                } else
                    JOptionPane.showMessageDialog(null, "El usuario no existe", "Error", JOptionPane.ERROR_MESSAGE);
            }catch (IOException e){
                JOptionPane.showMessageDialog(null, "Vaya parece que esto no debía pasar", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else
            JOptionPane.showMessageDialog(null, "Complete todos los espacios", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_IniciarSesionBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AdminPantallas.AbrirMenuInicio();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Contra;
    private javax.swing.JLabel ContraseñaTxT;
    private javax.swing.JButton IniciarSesionBtn;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField Username;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
