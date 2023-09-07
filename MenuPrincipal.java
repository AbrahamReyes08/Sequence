package sequence;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NuevaPartidaBtn = new javax.swing.JButton();
        Desconectarse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NuevaPartidaBtn.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        NuevaPartidaBtn.setText("Iniciar Nueva Partida");
        NuevaPartidaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaPartidaBtnActionPerformed(evt);
            }
        });

        Desconectarse.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Desconectarse.setText("Desconectarse");
        Desconectarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesconectarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Desconectarse)
                    .addComponent(NuevaPartidaBtn))
                .addContainerGap(688, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(NuevaPartidaBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 363, Short.MAX_VALUE)
                .addComponent(Desconectarse)
                .addGap(184, 184, 184))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevaPartidaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaPartidaBtnActionPerformed
        AdminPantallas.AbrirSequence();
        this.dispose();
    }//GEN-LAST:event_NuevaPartidaBtnActionPerformed

    private void DesconectarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesconectarseActionPerformed
        AdminPantallas.AbrirMenuInicio();
        this.dispose();
    }//GEN-LAST:event_DesconectarseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Desconectarse;
    private javax.swing.JButton NuevaPartidaBtn;
    // End of variables declaration//GEN-END:variables
}
