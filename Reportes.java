package sequence;

import java.io.IOException;
import java.util.ArrayList;

public class Reportes extends javax.swing.JFrame {

    AdminUsuarios useradmin = new AdminUsuarios();
    
    public Reportes() throws IOException {
        initComponents();
        setLocationRelativeTo(null);
        if (useradmin.getLogs(useradmin.getUserlog()) != null) {
            StringBuilder htmlText = new StringBuilder("Fecha  -  Tu Equipo  -  Equipo contrario  -  Resultado\n");
            ArrayList<String> registros = useradmin.getLogs(useradmin.getUserlog());
            for (int i = 0; i < registros.size(); i++) {
                htmlText.append(registros.get(i));
            }
            RegistroLogs.setText(htmlText.toString());
        } else {
            RegistroLogs.setText("Aun no hay registros de partidas jugadas");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        RegresarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        RegistroLogs = new javax.swing.JTextArea();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        RegistroLogs.setColumns(20);
        RegistroLogs.setRows(5);
        jScrollPane1.setViewportView(RegistroLogs);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 480, 340));

        Fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fondo.png"))); // NOI18N
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
    public static javax.swing.JTextArea RegistroLogs;
    private javax.swing.JButton RegresarBtn;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
