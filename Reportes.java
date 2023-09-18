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
        PuntosTxT.setText("Mis puntos: "+useradmin.getPuntosUsuario(useradmin.getUserlog()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RegistrosTxT = new javax.swing.JTextArea();
        Titulo = new javax.swing.JLabel();
        RegresarBtn = new javax.swing.JButton();
        PuntosTxT = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegistrosTxT.setColumns(20);
        RegistrosTxT.setRows(5);
        jScrollPane1.setViewportView(RegistrosTxT);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 86, 410, 290));

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

        PuntosTxT.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        PuntosTxT.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PuntosTxT.setText("Mis puntos:");
        jPanel1.add(PuntosTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

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
    private javax.swing.JLabel PuntosTxT;
    private javax.swing.JTextArea RegistrosTxT;
    private javax.swing.JButton RegresarBtn;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
