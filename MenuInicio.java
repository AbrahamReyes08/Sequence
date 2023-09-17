package sequence;
import javax.swing.JOptionPane;

public class MenuInicio extends javax.swing.JFrame {

    public MenuInicio() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        IniciarSesionBtn = new javax.swing.JButton();
        CrearUsuarioBtn = new javax.swing.JButton();
        SalirBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Sequence");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 170, -1));

        IniciarSesionBtn.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        IniciarSesionBtn.setText("Iniciar Sesión");
        IniciarSesionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSesionBtnActionPerformed(evt);
            }
        });
        jPanel1.add(IniciarSesionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        CrearUsuarioBtn.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        CrearUsuarioBtn.setText("Crear Usuario");
        CrearUsuarioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearUsuarioBtnActionPerformed(evt);
            }
        });
        jPanel1.add(CrearUsuarioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 190, -1));

        SalirBtn.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        SalirBtn.setText("Salir");
        SalirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirBtnActionPerformed(evt);
            }
        });
        jPanel1.add(SalirBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 90, -1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

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

    private void IniciarSesionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSesionBtnActionPerformed
        AdminPantallas.AbrirIniciarSesion();
        this.dispose();
    }//GEN-LAST:event_IniciarSesionBtnActionPerformed

    private void CrearUsuarioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearUsuarioBtnActionPerformed
        AdminPantallas.AbrirCrearJugador();
        this.dispose();
    }//GEN-LAST:event_CrearUsuarioBtnActionPerformed

    private void SalirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirBtnActionPerformed
        int opcion = JOptionPane.showOptionDialog(null, "¿Desea salir del juego?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Si", "No"}, "No");
        if (opcion==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_SalirBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CrearUsuarioBtn;
    private javax.swing.JButton IniciarSesionBtn;
    private javax.swing.JButton SalirBtn;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
