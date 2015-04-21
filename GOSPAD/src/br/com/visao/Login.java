/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.visao;

import br.com.visao.Principal;
import static br.com.visao.Principal.getInstancia;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Paes Leme
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bt_fechar = new javax.swing.JLabel();
        bt_minimizar1 = new javax.swing.JPanel();
        bt_minimizar = new javax.swing.JLabel();
        bt_icon = new javax.swing.JLabel();
        config = new javax.swing.JLabel();
        sobre = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        altera_tema = new javax.swing.JLabel();
        logoff = new javax.swing.JLabel();
        bd = new javax.swing.JLabel();
        licenca = new javax.swing.JLabel();
        sair = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        login = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        acessar = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        bt_fechar.setFont(new java.awt.Font("Khmer UI", 0, 30)); // NOI18N
        bt_fechar.setForeground(new java.awt.Color(255, 255, 255));
        bt_fechar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt_fechar.setText("X");
        bt_fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt_fecharMousePressed(evt);
            }
        });

        bt_minimizar1.setBackground(new java.awt.Color(0, 102, 153));
        bt_minimizar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_minimizar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt_minimizar1MousePressed(evt);
            }
        });

        bt_minimizar.setBackground(new java.awt.Color(0, 102, 153));
        bt_minimizar.setFont(new java.awt.Font("Khmer UI", 1, 30)); // NOI18N
        bt_minimizar.setForeground(new java.awt.Color(255, 255, 255));
        bt_minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt_minimizar.setText("-");
        bt_minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_minimizar.setOpaque(true);
        bt_minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt_minimizarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout bt_minimizar1Layout = new javax.swing.GroupLayout(bt_minimizar1);
        bt_minimizar1.setLayout(bt_minimizar1Layout);
        bt_minimizar1Layout.setHorizontalGroup(
            bt_minimizar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bt_minimizar1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(bt_minimizar)
                .addContainerGap())
        );
        bt_minimizar1Layout.setVerticalGroup(
            bt_minimizar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bt_minimizar1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        bt_icon.setForeground(new java.awt.Color(255, 255, 255));
        bt_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagem/goel_teste.PNG"))); // NOI18N
        bt_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        config.setFont(new java.awt.Font("Khmer UI", 0, 14)); // NOI18N
        config.setForeground(new java.awt.Color(255, 255, 255));
        config.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        config.setText("Configurações");
        config.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        config.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                configMouseDragged(evt);
            }
        });
        config.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                configMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                configMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                configMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                configMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                configMouseReleased(evt);
            }
        });

        sobre.setFont(new java.awt.Font("Khmer UI", 0, 14)); // NOI18N
        sobre.setForeground(new java.awt.Color(255, 255, 255));
        sobre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sobre.setText("Sobre");
        sobre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sobreMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sobreMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(bt_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(config)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sobre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 396, Short.MAX_VALUE)
                .addComponent(bt_minimizar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bt_fechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bt_minimizar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bt_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(config, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sobre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jPanel6.setVisible(false);
        jPanel6.setBackground(new java.awt.Color(204, 204, 255));

        jLabel15.setBackground(new java.awt.Color(0, 153, 153));
        jLabel15.setFont(new java.awt.Font("Khmer UI", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Direitos Reservados");
        jLabel15.setOpaque(true);

        jLabel16.setBackground(new java.awt.Color(0, 153, 153));
        jLabel16.setFont(new java.awt.Font("Khmer UI", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Goel");
        jLabel16.setOpaque(true);

        jLabel17.setBackground(new java.awt.Color(0, 153, 153));
        jLabel17.setFont(new java.awt.Font("Khmer UI", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Tecnologia");
        jLabel17.setOpaque(true);

        jLabel18.setBackground(new java.awt.Color(0, 153, 153));
        jLabel18.setFont(new java.awt.Font("Khmer UI", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Desenvolvido por:");
        jLabel18.setOpaque(true);

        jLabel19.setBackground(new java.awt.Color(0, 153, 153));
        jLabel19.setFont(new java.awt.Font("Khmer UI", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Rafael S. Paes Leme");
        jLabel19.setOpaque(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel5.setVisible(false);
        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        altera_tema.setBackground(new java.awt.Color(0, 102, 153));
        altera_tema.setFont(new java.awt.Font("Khmer UI", 0, 12)); // NOI18N
        altera_tema.setForeground(new java.awt.Color(255, 255, 255));
        altera_tema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        altera_tema.setText("Alterar Tema");
        altera_tema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        altera_tema.setEnabled(false);
        altera_tema.setOpaque(true);
        altera_tema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                altera_temaMousePressed(evt);
            }
        });

        logoff.setBackground(new java.awt.Color(0, 102, 153));
        logoff.setFont(new java.awt.Font("Khmer UI", 0, 12)); // NOI18N
        logoff.setForeground(new java.awt.Color(255, 255, 255));
        logoff.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoff.setText("Logoff");
        logoff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoff.setEnabled(false);
        logoff.setOpaque(true);

        bd.setBackground(new java.awt.Color(0, 102, 153));
        bd.setFont(new java.awt.Font("Khmer UI", 0, 12)); // NOI18N
        bd.setForeground(new java.awt.Color(255, 255, 255));
        bd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bd.setText("Banco de Dados");
        bd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bd.setEnabled(false);
        bd.setOpaque(true);

        licenca.setBackground(new java.awt.Color(0, 102, 153));
        licenca.setFont(new java.awt.Font("Khmer UI", 0, 12)); // NOI18N
        licenca.setForeground(new java.awt.Color(255, 255, 255));
        licenca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        licenca.setText("Licença");
        licenca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        licenca.setOpaque(true);

        sair.setBackground(new java.awt.Color(0, 102, 153));
        sair.setFont(new java.awt.Font("Khmer UI", 0, 12)); // NOI18N
        sair.setForeground(new java.awt.Color(255, 255, 255));
        sair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sair.setText("Sair");
        sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sair.setOpaque(true);
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sairMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(altera_tema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bd, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
            .addComponent(licenca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(altera_tema, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoff, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bd, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(licenca, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Khmer UI", 0, 14)); // NOI18N
        jLabel6.setText("Login");

        login.setFont(new java.awt.Font("Khmer UI", 0, 14)); // NOI18N
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Khmer UI", 0, 14)); // NOI18N
        jLabel7.setText("Senha");

        acessar.setBackground(new java.awt.Color(0, 102, 153));
        acessar.setFont(new java.awt.Font("Khmer UI", 0, 14)); // NOI18N
        acessar.setForeground(new java.awt.Color(255, 255, 255));
        acessar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acessar.setText("Acessar");
        acessar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        acessar.setOpaque(true);
        acessar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                acessarMousePressed(evt);
            }
        });

        senha.setFont(new java.awt.Font("Khmer UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(acessar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel7))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel6))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jLabel7))
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel6))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(acessar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 270, 270));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagem/gospad.PNG"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel14MousePressed(evt);
            }
        });
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 370, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 400, 270));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_minimizar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_minimizar1MousePressed

        jPanel6.setVisible(false);
        jPanel5.setVisible(false);
        setExtendedState(ICONIFIED);

// TODO add your handling code here:
    }//GEN-LAST:event_bt_minimizar1MousePressed

    private void bt_fecharMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_fecharMousePressed

        System.exit(WIDTH);

        // TODO add your handling code here:
    }//GEN-LAST:event_bt_fecharMousePressed

    private void bt_minimizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_minimizarMousePressed

        jPanel6.setVisible(false);
        jPanel5.setVisible(false);
        setExtendedState(ICONIFIED);

// TODO add your handling code here:
    }//GEN-LAST:event_bt_minimizarMousePressed

    private void configMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_configMousePressed

        jPanel5.setVisible(true);
        jPanel6.setVisible(false);

// TODO add your handling code here:
    }//GEN-LAST:event_configMousePressed

    private void configMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_configMouseClicked

// TODO add your handling code here:
    }//GEN-LAST:event_configMouseClicked

    private void configMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_configMouseExited

// TODO add your handling code here:
    }//GEN-LAST:event_configMouseExited

    private void configMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_configMouseReleased

        // TODO add your handling code here:
    }//GEN-LAST:event_configMouseReleased

    private void configMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_configMouseEntered

        jPanel5.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_configMouseEntered

    private void configMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_configMouseDragged

// TODO add your handling code here:
    }//GEN-LAST:event_configMouseDragged

    private void sairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMousePressed

        System.exit(WIDTH);

        // TODO add your handling code here:
    }//GEN-LAST:event_sairMousePressed

    private void sobreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sobreMousePressed

        jPanel6.setVisible(true);
        jPanel5.setVisible(false);

// TODO add your handling code here:
    }//GEN-LAST:event_sobreMousePressed

    private void sobreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sobreMouseEntered

        jPanel6.setVisible(false);

// TODO add your handling code here:
    }//GEN-LAST:event_sobreMouseEntered

    private void acessarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acessarMousePressed

        if ("Admin".equals(login.getText()) && "Admin".equals(senha.getText())) {

            //
            getInstancia().setVisible(true);
            this.dispose();

            acessar.setBackground(new java.awt.Color(0, 80, 90));
            acessar.setForeground(new java.awt.Color(200, 200, 200));

            //
            JOptionPane.showMessageDialog(null, "Acesso Liberado!\n\nSeja Bem Vindo ao Sistema GOSPAD!");

        } else {

            JOptionPane.showMessageDialog(null, "Erro de Login e Senha!\n\n Favor informe as informações corretas para acesso.");

        }
        jPanel6.setVisible(false);
        jPanel5.setVisible(false);

// TODO add your handling code here:
    }//GEN-LAST:event_acessarMousePressed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed

        jPanel6.setVisible(false);
        jPanel5.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MousePressed

    private void jLabel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MousePressed

        jPanel6.setVisible(false);
        jPanel5.setVisible(false);

// TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MousePressed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed

        jPanel6.setVisible(false);
        jPanel5.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MousePressed

    private void loginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMousePressed

        jPanel6.setVisible(false);
        jPanel5.setVisible(false);

// TODO add your handling code here:
    }//GEN-LAST:event_loginMousePressed

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed

        jPanel6.setVisible(false);
        jPanel5.setVisible(false);

// TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MousePressed

    private void altera_temaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_altera_temaMousePressed

// TODO add your handling code here:
    }//GEN-LAST:event_altera_temaMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);

            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acessar;
    private javax.swing.JLabel altera_tema;
    private javax.swing.JLabel bd;
    private javax.swing.JLabel bt_fechar;
    private javax.swing.JLabel bt_icon;
    private javax.swing.JLabel bt_minimizar;
    private javax.swing.JPanel bt_minimizar1;
    private javax.swing.JLabel config;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel licenca;
    private javax.swing.JTextField login;
    private javax.swing.JLabel logoff;
    private javax.swing.JLabel sair;
    private javax.swing.JPasswordField senha;
    private javax.swing.JLabel sobre;
    // End of variables declaration//GEN-END:variables
}
