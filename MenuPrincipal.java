package sequence;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MenuPrincipal extends javax.swing.JFrame {

    AdminUsuarios useradmin = new AdminUsuarios();
    ConfiguracionPartida config = new ConfiguracionPartida();
    
    public MenuPrincipal() throws IOException {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ConfiguracionBtn = new javax.swing.JButton();
        Desconectarse = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        NuevaPartidaBtn = new javax.swing.JButton();
        ReportesBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ConfiguracionBtn.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        ConfiguracionBtn.setText("Configuración");
        ConfiguracionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfiguracionBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ConfiguracionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        Desconectarse.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Desconectarse.setText("Desconectarse");
        Desconectarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesconectarseActionPerformed(evt);
            }
        });
        jPanel1.add(Desconectarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, -1, -1));

        Titulo.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Sequence");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, -1));

        NuevaPartidaBtn.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        NuevaPartidaBtn.setText("Iniciar Nueva Partida");
        NuevaPartidaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaPartidaBtnActionPerformed(evt);
            }
        });
        jPanel1.add(NuevaPartidaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        ReportesBtn.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        ReportesBtn.setText("Reportes");
        ReportesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportesBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ReportesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DesconectarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesconectarseActionPerformed
        AdminPantallas.AbrirMenuInicio();
        this.dispose();
    }//GEN-LAST:event_DesconectarseActionPerformed

    private void ConfiguracionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfiguracionBtnActionPerformed
        AdminPantallas.AbrirConfiguracion();
        this.dispose();
    }//GEN-LAST:event_ConfiguracionBtnActionPerformed

    private void NuevaPartidaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaPartidaBtnActionPerformed
        try{
        if(useradmin.getTodosUsuarios().size()>=ConfiguracionPartida.getCantjugadores()){
        if(ConfiguracionPartida.getCantjugadores()<4){
            ArrayList<String> equipo2 = new ArrayList();
            for(int i=0; i<ConfiguracionPartida.getCantjugadores()-1;i++){
                String player = JOptionPane.showInputDialog(null, "Ingrese el nombre de usuario de su contrincante", "Contrincante", JOptionPane.INFORMATION_MESSAGE);
                if(player!=null){
                    if(!player.equals("")){
                        try{
                            if(useradmin.BuscarUser(player)!=-1 && !player.equals(useradmin.getUserlog())){
                                equipo2.add(player);
                            } else{
                                JOptionPane.showMessageDialog(null, "Por favor ingrese un usuario valido", "Error", JOptionPane.ERROR_MESSAGE);
                                equipo2.clear();
                                break;
                            }
                        }catch(IOException e){
                            JOptionPane.showMessageDialog(null, "Parece que algo salió mal", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else{
                        JOptionPane.showMessageDialog(null, "Por favor ingrese un usuario valido", "Error", JOptionPane.ERROR_MESSAGE);
                        equipo2.clear();
                    }
                }
            }
            if(!equipo2.isEmpty()){
                if((ConfiguracionPartida.getCantjugadores()==2) || ((ConfiguracionPartida.getCantjugadores()==3 && equipo2.size()==2) && (!equipo2.get(0).equals(equipo2.get(1))))){
                    ConfiguracionPartida.setEquipo2(equipo2);
                    ArrayList<String> equipo1 = new ArrayList();
                    equipo1.add(useradmin.getUserlog());
                    ConfiguracionPartida.setEquipo1(equipo1);
                    config.setColoresEquipos(equipo1, equipo2);
                    AdminPantallas.AbrirSequence();
                    this.dispose();
                } else{
                    JOptionPane.showMessageDialog(null, "Verifique que los usuarios no se repitan", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else{
            AdminPantallas.AbrirMenuEquipos();
            this.dispose();
            } 
        }else{
                JOptionPane.showMessageDialog(null, "No existen suficientes usuarios para jugar", "Error", JOptionPane.ERROR_MESSAGE);
        }
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Parece que algo salió mal", "Error", JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_NuevaPartidaBtnActionPerformed

    private void ReportesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportesBtnActionPerformed
        AdminPantallas.AbrirReportes();
        this.dispose();
    }//GEN-LAST:event_ReportesBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfiguracionBtn;
    private javax.swing.JButton Desconectarse;
    private javax.swing.JButton NuevaPartidaBtn;
    private javax.swing.JButton ReportesBtn;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
