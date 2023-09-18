package sequence;

import java.io.IOException;
import java.util.ArrayList;

public class Reportes extends javax.swing.JFrame {

    AdminUsuarios useradmin = new AdminUsuarios();
    
    public Reportes() throws IOException {
        initComponents();
        if(useradmin.getLogs(useradmin.getUserlog())!=null){
            String texto="Fecha  -  Tu Equipo  -  Equipo contrario  -  Resultado\n";
            ArrayList<String> registros = useradmin.getLogs(useradmin.getUserlog());
            for(int i=0; i<registros.size();i++){
                texto+=registros.get(i)+"\n";
            }
            RegistrosTxT.setText(texto);
        } else
            RegistrosTxT.setText("Aun no hay registros de partidas jugadas");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        RegistrosTxT = new javax.swing.JTextField();
        Titulo = new javax.swing.JLabel();
        RegresarBtn = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegistrosTxT.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        RegistrosTxT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(RegistrosTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 410, 320));

        Titulo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Titulo.setText("Registros de Partidas");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        RegresarBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        RegresarBtn.setText("Regresar");
        RegresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(RegresarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, -1, -1));

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

    private void RegresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarBtnActionPerformed
        AdminPantallas.AbrirMenuPrincipal();
        this.dispose();
    }//GEN-LAST:event_RegresarBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JTextField RegistrosTxT;
    private javax.swing.JButton RegresarBtn;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
