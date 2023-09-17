package sequence;

import java.awt.Font;
import java.awt.GridLayout;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PrePartida extends javax.swing.JFrame {

    AdminUsuarios adminusers = new AdminUsuarios();
    ConfiguracionPartida config = new ConfiguracionPartida();
    ArrayList<String> usuariospartida = new ArrayList();
    ArrayList<String> equipo1 = new ArrayList();
    ArrayList<String> equipo2 = new ArrayList();
    ArrayList<String> equipo3 = new ArrayList();
    ArrayList<JComboBox<String>> totalcombobox = new ArrayList<>();
    
    public PrePartida() throws IOException {
        initComponents();
        setLocationRelativeTo(null);
        GenerarComboBox(ConfiguracionPartida.getCantjugadores(), Equipo1Panel, 1);
        GenerarComboBox(ConfiguracionPartida.getCantjugadores(), Equipo2Panel, 2);
        if(ConfiguracionPartida.getCantjugadores()==6){
            jLabel2.setText("Equipo 2");
            jLabel3.setText("Equipo 3");
            GenerarComboBox(ConfiguracionPartida.getCantjugadores(), Equipo3Panel, 3);
        }else{
            jLabel2.setVisible(false);
            JLabel relleno = new JLabel();
            relleno.setFont(new Font("Arial", Font.PLAIN, 24));
            relleno.setText("VS");
            relleno.setVerticalAlignment(SwingConstants.CENTER);
            relleno.setHorizontalAlignment(SwingConstants.CENTER);
            Equipo3Panel.add(relleno);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Equipo1Panel = new javax.swing.JPanel();
        Equipo2Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        AceptarBtn = new javax.swing.JButton();
        CancelarBtn = new javax.swing.JButton();
        Equipo3Panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Equipo1Panel.setLayout(new java.awt.GridLayout(1, 0));
        jPanel1.add(Equipo1Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 100, 70));

        Equipo2Panel.setLayout(new java.awt.GridLayout(1, 0));
        jPanel1.add(Equipo2Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 100, 70));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Equipo 1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 60, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Equipo 3");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 60, -1));

        Titulo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Seleccionar Equipos");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        AceptarBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        AceptarBtn.setText("Aceptar");
        AceptarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(AceptarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        CancelarBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CancelarBtn.setText("Cancelar");
        CancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(CancelarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        Equipo3Panel.setLayout(new java.awt.GridLayout());
        jPanel1.add(Equipo3Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 100, 70));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Equipo 2");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 60, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarBtnActionPerformed
        if(EvitarRepetidos(0,usuariospartida)!=null){
            setEquipos();
            ConfiguracionPartida.setEquipo1(equipo1);
            ConfiguracionPartida.setEquipo2(equipo2);
            if(ConfiguracionPartida.getCantjugadores()==6)
                ConfiguracionPartida.setEquipo3(equipo3);
            try{
            config.setColoresEquipos(equipo1, equipo2, equipo3);
            }catch(IOException e){
                
            }
            AdminPantallas.AbrirSequence();
            this.dispose();
        } else{
            JOptionPane.showMessageDialog(null, "Verifique que no se repiten los jugadores", "Advertencia", JOptionPane.ERROR_MESSAGE);
            usuariospartida.clear();
        }
    }//GEN-LAST:event_AceptarBtnActionPerformed

    private void CancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarBtnActionPerformed
        AdminPantallas.AbrirMenuPrincipal();
        this.dispose();
    }//GEN-LAST:event_CancelarBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarBtn;
    private javax.swing.JButton CancelarBtn;
    private javax.swing.JPanel Equipo1Panel;
    private javax.swing.JPanel Equipo2Panel;
    private javax.swing.JPanel Equipo3Panel;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    
    private void GenerarComboBox(int cantidadcombobox, JPanel panel, int equipo) throws IOException{
        if(cantidadcombobox>=4){
        panel.setLayout(new GridLayout(cantidadcombobox/2, 1));
        int cantidadusersdivided;
        if(cantidadcombobox==6){
            cantidadusersdivided=3;
        }else
            cantidadusersdivided=2;
        if(adminusers.getTodosUsuarios()!=null){
            ArrayList<String> usuarios = adminusers.getTodosUsuarios();
            for (int i = 0; i < cantidadcombobox/cantidadusersdivided; i++) {
                JComboBox<String> combobox = new JComboBox<>();
                if(i!=0 || (i==0 && equipo==2 || equipo==3)){
                    for(int i2=0; i2<usuarios.size();i2++){
                        if(!usuarios.get(i2).equals(adminusers.getUserlog()))
                            combobox.addItem(usuarios.get(i2));
                    }
                } else if(i==0 && equipo==1)
                    combobox.addItem(adminusers.getUserlog());
                panel.add(combobox);
                totalcombobox.add(combobox);
            }
        } else{
            JOptionPane.showMessageDialog(null, "No hay suficientes jugadores", "Error", JOptionPane.ERROR_MESSAGE);
            this.dispose();
        }
        } else{
            JOptionPane.showMessageDialog(null, "No hay suficientes jugadores", "Error", JOptionPane.ERROR_MESSAGE);
            this.dispose();
        }
    }
    
    private ArrayList<String> EvitarRepetidos(int i, ArrayList<String> usuariospartida){
        if(i<totalcombobox.size()){
            usuariospartida.add(String.valueOf(totalcombobox.get(i).getSelectedItem()));
            return EvitarRepetidos(i+1,usuariospartida);
        } else{
            boolean repetido=false;
            for(String user: usuariospartida){
                int contador=0;
                for(String usuario: usuariospartida){
                    if(user.equals(usuario)){
                        contador++;
                    }
                }
                if(contador>1){
                   repetido=true;
                }
            }
            if(repetido==false)
                return usuariospartida;
        }
        return null;
    }
    
    private void setEquipos(){
        if(ConfiguracionPartida.getCantjugadores()!=6){
            for(int i=0; i<usuariospartida.size()/2;i++){
                equipo1.add(usuariospartida.get(i));
            }
            for(int i=usuariospartida.size()/2;i<usuariospartida.size();i++){
                equipo2.add(usuariospartida.get(i));
            }
        } else{
            for(int i=0; i<2;i++){
                equipo1.add(usuariospartida.get(i));
            }
            for(int i=2;i<4;i++){
                equipo2.add(usuariospartida.get(i));
            }
            for(int i=4;i<6;i++){
                equipo3.add(usuariospartida.get(i));
            }
        }
    }
}
