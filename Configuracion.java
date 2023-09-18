package sequence;

import java.awt.Color;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Configuracion extends javax.swing.JFrame {
    
    int opcplayers;
    boolean compcolor;
    AdminUsuarios adminuser = new AdminUsuarios();
    Color negro = new Color(38,38,38);
    Color celeste = new Color(92,225,230);
    Color verde = new Color(193,255,114);
    Color rojo = new Color(255,87,87);
    Color anaranjado = new Color(255,145,77);
    Color morado = new Color(203,108,230);
    Color azul = new Color(84,106,221);
    Color amarillo = new Color(225,222,89);
    
    public Configuracion() throws IOException {
        initComponents();
        setLocationRelativeTo(null);
        CambiarColoresHabilitados();
        setSeleccionesJugador();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Subtitulo1 = new javax.swing.JLabel();
        CantidadUsersTxT = new javax.swing.JLabel();
        Btn1 = new javax.swing.JRadioButton();
        Btn2 = new javax.swing.JRadioButton();
        Btn3 = new javax.swing.JRadioButton();
        Btn4 = new javax.swing.JRadioButton();
        Btn5 = new javax.swing.JRadioButton();
        Subtitulo2 = new javax.swing.JLabel();
        ColorBtn = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        NegroBtn = new javax.swing.JButton();
        CelesteBtn = new javax.swing.JButton();
        VerdeBtn = new javax.swing.JButton();
        RojoBtn = new javax.swing.JButton();
        AnaranjadoBtn = new javax.swing.JButton();
        MoradoBtn = new javax.swing.JButton();
        AzulBtn = new javax.swing.JButton();
        AmarilloBtn = new javax.swing.JButton();
        AceptarBtn = new javax.swing.JButton();
        CompartirColorCBx = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(550, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Titulo.setText("Configuración");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        Subtitulo1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Subtitulo1.setText("General");
        jPanel1.add(Subtitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        CantidadUsersTxT.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CantidadUsersTxT.setText("Cantidad de Usuarios (por partida)");
        jPanel1.add(CantidadUsersTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        buttonGroup1.add(Btn1);
        Btn1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Btn1.setText("1 vs 1 (2 jugadores)");
        jPanel1.add(Btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        buttonGroup1.add(Btn2);
        Btn2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Btn2.setText("1 vs 1 vs 1 (3 jugadores)");
        jPanel1.add(Btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        buttonGroup1.add(Btn3);
        Btn3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Btn3.setText("2 vs 2 (4 jugadores)");
        jPanel1.add(Btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        buttonGroup1.add(Btn4);
        Btn4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Btn4.setText("2 vs 2 vs 2 (6 jugadores)");
        jPanel1.add(Btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        buttonGroup1.add(Btn5);
        Btn5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Btn5.setText("4 vs 4 (8 jugadores)");
        jPanel1.add(Btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));

        Subtitulo2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Subtitulo2.setText("Usuario");
        jPanel1.add(Subtitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        ColorBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ColorBtn.setText("Selector de Colores");
        jPanel1.add(ColorBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jPanel2.setLayout(new java.awt.GridLayout(2, 4));

        NegroBtn.setBackground(new java.awt.Color(38, 38, 38));
        NegroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NegroBtnActionPerformed(evt);
            }
        });
        jPanel2.add(NegroBtn);

        CelesteBtn.setBackground(new java.awt.Color(92, 225, 230));
        CelesteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CelesteBtnActionPerformed(evt);
            }
        });
        jPanel2.add(CelesteBtn);

        VerdeBtn.setBackground(new java.awt.Color(193, 255, 114));
        VerdeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerdeBtnActionPerformed(evt);
            }
        });
        jPanel2.add(VerdeBtn);

        RojoBtn.setBackground(new java.awt.Color(255, 87, 87));
        RojoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RojoBtnActionPerformed(evt);
            }
        });
        jPanel2.add(RojoBtn);

        AnaranjadoBtn.setBackground(new java.awt.Color(255, 145, 77));
        AnaranjadoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnaranjadoBtnActionPerformed(evt);
            }
        });
        jPanel2.add(AnaranjadoBtn);

        MoradoBtn.setBackground(new java.awt.Color(203, 108, 230));
        MoradoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoradoBtnActionPerformed(evt);
            }
        });
        jPanel2.add(MoradoBtn);

        AzulBtn.setBackground(new java.awt.Color(84, 106, 221));
        AzulBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AzulBtnActionPerformed(evt);
            }
        });
        jPanel2.add(AzulBtn);

        AmarilloBtn.setBackground(new java.awt.Color(225, 222, 89));
        AmarilloBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmarilloBtnActionPerformed(evt);
            }
        });
        jPanel2.add(AmarilloBtn);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 390, 110));

        AceptarBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        AceptarBtn.setText("Aceptar");
        AceptarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(AceptarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, -1, -1));

        CompartirColorCBx.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CompartirColorCBx.setText("Compartir color con equipo");
        jPanel1.add(CompartirColorCBx, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

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

    private void NegroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NegroBtnActionPerformed
        CambiarColoresHabilitados();
        CambiarColor(NegroBtn);
        CambiarColoresHabilitados();
    }//GEN-LAST:event_NegroBtnActionPerformed

    private void CelesteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CelesteBtnActionPerformed
        CambiarColoresHabilitados();
        CambiarColor(CelesteBtn);
        CambiarColoresHabilitados();
    }//GEN-LAST:event_CelesteBtnActionPerformed

    private void VerdeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerdeBtnActionPerformed
        CambiarColoresHabilitados();
        CambiarColor(VerdeBtn);
        CambiarColoresHabilitados();
    }//GEN-LAST:event_VerdeBtnActionPerformed

    private void RojoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RojoBtnActionPerformed
        CambiarColoresHabilitados();
        CambiarColor(RojoBtn);
        CambiarColoresHabilitados();
    }//GEN-LAST:event_RojoBtnActionPerformed

    private void AnaranjadoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnaranjadoBtnActionPerformed
        CambiarColoresHabilitados();
        CambiarColor(AnaranjadoBtn);
        CambiarColoresHabilitados();
    }//GEN-LAST:event_AnaranjadoBtnActionPerformed

    private void MoradoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoradoBtnActionPerformed
        CambiarColoresHabilitados();
        CambiarColor(MoradoBtn);
        CambiarColoresHabilitados();
    }//GEN-LAST:event_MoradoBtnActionPerformed

    private void AzulBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AzulBtnActionPerformed
        CambiarColoresHabilitados();
        CambiarColor(AzulBtn);
        CambiarColoresHabilitados();
    }//GEN-LAST:event_AzulBtnActionPerformed

    private void AmarilloBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmarilloBtnActionPerformed
        CambiarColoresHabilitados();
        CambiarColor(AmarilloBtn);
        CambiarColoresHabilitados();
    }//GEN-LAST:event_AmarilloBtnActionPerformed

    private void AceptarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarBtnActionPerformed
        setCantidadJugadores();
        if(CompartirColorCBx.isSelected()){
            ConfiguracionPartida.setCompartirColor(true);
            compcolor=true;
        }else{
            ConfiguracionPartida.setCompartirColor(false);
            compcolor=false;
        }
        adminuser.CambiarConfig(adminuser.getUserlog(), opcplayers, compcolor);
        AdminPantallas.AbrirMenuPrincipal();
        this.dispose();
    }//GEN-LAST:event_AceptarBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarBtn;
    private javax.swing.JButton AmarilloBtn;
    private javax.swing.JButton AnaranjadoBtn;
    private javax.swing.JButton AzulBtn;
    private javax.swing.JRadioButton Btn1;
    private javax.swing.JRadioButton Btn2;
    private javax.swing.JRadioButton Btn3;
    private javax.swing.JRadioButton Btn4;
    private javax.swing.JRadioButton Btn5;
    private javax.swing.JLabel CantidadUsersTxT;
    private javax.swing.JButton CelesteBtn;
    private javax.swing.JLabel ColorBtn;
    private javax.swing.JCheckBox CompartirColorCBx;
    private javax.swing.JButton MoradoBtn;
    private javax.swing.JButton NegroBtn;
    private javax.swing.JButton RojoBtn;
    private javax.swing.JLabel Subtitulo1;
    private javax.swing.JLabel Subtitulo2;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton VerdeBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private void setColorHabilitado(JButton boton) throws IOException{
        if(adminuser.ColorDisponible(boton.getBackground())==false){
            boton.setEnabled(false);
            boton.setBackground(new Color(100,100,100));
        } else{
            if(boton.equals(NegroBtn)){
                boton.setBackground(negro);
                boton.setEnabled(true);
            }else if(boton.equals(CelesteBtn)){
                boton.setBackground(celeste);
                boton.setEnabled(true);
            }else if(boton.equals(VerdeBtn)){
                boton.setBackground(verde);
                boton.setEnabled(true);
            }else if(boton.equals(RojoBtn)){
                boton.setBackground(rojo);
                boton.setEnabled(true);
            }else if(boton.equals(AnaranjadoBtn)){
                boton.setBackground(anaranjado);
                boton.setEnabled(true);
            }else if(boton.equals(MoradoBtn)){
                boton.setBackground(morado);
                boton.setEnabled(true);
            }else if(boton.equals(AzulBtn)){
                boton.setBackground(azul);
                boton.setEnabled(true);
            }else if(boton.equals(AmarilloBtn)){
                boton.setBackground(amarillo);
                boton.setEnabled(true);
            }
        }
    }
    
    public void CambiarColor(JButton boton){
        try{
        adminuser.AgregarCambiarColor(adminuser.getUserlog(), boton.getBackground());
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Vaya parece que esto no debía pasar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void CambiarColoresHabilitados(){
        try{
        setColorHabilitado(NegroBtn);
        setColorHabilitado(CelesteBtn);
        setColorHabilitado(VerdeBtn);
        setColorHabilitado(RojoBtn);
        setColorHabilitado(AnaranjadoBtn);
        setColorHabilitado(MoradoBtn);
        setColorHabilitado(AzulBtn);
        setColorHabilitado(AmarilloBtn);
        }catch(IOException e){
           JOptionPane.showMessageDialog(null, "Vaya parece que esto no debía pasar", "Error", JOptionPane.ERROR_MESSAGE);     
        }
    }
    
    private void setCantidadJugadores(){
        if(Btn1.isSelected()){
            ConfiguracionPartida.setCantjugadores(2);
            opcplayers=0;
        }else if(Btn2.isSelected()){
            ConfiguracionPartida.setCantjugadores(3);
            opcplayers=1;
        }else if(Btn3.isSelected()){
            ConfiguracionPartida.setCantjugadores(4);
            opcplayers=2;
        }else if(Btn4.isSelected()){
            ConfiguracionPartida.setCantjugadores(6);
            opcplayers=3;
        }else if(Btn5.isSelected()){
            ConfiguracionPartida.setCantjugadores(8);
            opcplayers=4;
        }
    }
    
    private void setSeleccionesJugador(){
        int selectedcant=ConfiguracionPartida.getCantjugadores();
        switch(selectedcant){
            case 2:
                Btn1.setSelected(true);
                break;
            case 3:
                Btn2.setSelected(true);
                break;
            case 4:
                Btn3.setSelected(true);
                break;
            case 6:
                Btn4.setSelected(true);
                break;
            case 8:
                Btn5.setSelected(true);
                break;
        }
        if(ConfiguracionPartida.getCompartirColor())
            CompartirColorCBx.setSelected(true);
    }
}
