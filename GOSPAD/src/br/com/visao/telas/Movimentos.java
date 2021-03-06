/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.visao.telas;

import br.com.visao.Principal;
import br.com.visao.telas.cadastro.a_pagar;
import br.com.visao.telas.cadastro.a_receber;
import br.com.visao.telas.movimento.abrir_caixa;
import br.com.visao.telas.movimento.fechar_caixa;
import br.com.visao.telas.movimento.movimento_diario;
import javax.swing.JInternalFrame;

/**
 *
 * @author Rafael Paes Leme
 */
public class Movimentos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Movimentos
     */
    public Movimentos() {
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
        bt_abre_movimento = new javax.swing.JButton();
        bt_c_a_pagar_movimento = new javax.swing.JButton();
        bt_c_a_receber_movimento = new javax.swing.JButton();
        bt_diaria_movimento = new javax.swing.JButton();
        bt_fecha_movimento = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Opções de Movimentos");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        bt_abre_movimento.setBackground(new java.awt.Color(153, 153, 255));
        bt_abre_movimento.setFont(new java.awt.Font("Khmer UI", 1, 14)); // NOI18N
        bt_abre_movimento.setForeground(new java.awt.Color(255, 255, 255));
        bt_abre_movimento.setText("ABRIR CAIXA");
        bt_abre_movimento.setBorderPainted(false);
        bt_abre_movimento.setContentAreaFilled(false);
        bt_abre_movimento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_abre_movimento.setOpaque(true);
        bt_abre_movimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_abre_movimentoActionPerformed(evt);
            }
        });

        bt_c_a_pagar_movimento.setBackground(new java.awt.Color(153, 153, 255));
        bt_c_a_pagar_movimento.setFont(new java.awt.Font("Khmer UI", 1, 14)); // NOI18N
        bt_c_a_pagar_movimento.setForeground(new java.awt.Color(255, 255, 255));
        bt_c_a_pagar_movimento.setText("CONTAS A PAGAR");
        bt_c_a_pagar_movimento.setBorderPainted(false);
        bt_c_a_pagar_movimento.setContentAreaFilled(false);
        bt_c_a_pagar_movimento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_c_a_pagar_movimento.setOpaque(true);
        bt_c_a_pagar_movimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_c_a_pagar_movimentoActionPerformed(evt);
            }
        });

        bt_c_a_receber_movimento.setBackground(new java.awt.Color(153, 153, 255));
        bt_c_a_receber_movimento.setFont(new java.awt.Font("Khmer UI", 1, 14)); // NOI18N
        bt_c_a_receber_movimento.setForeground(new java.awt.Color(255, 255, 255));
        bt_c_a_receber_movimento.setText("CONTAS A RECEBER");
        bt_c_a_receber_movimento.setBorderPainted(false);
        bt_c_a_receber_movimento.setContentAreaFilled(false);
        bt_c_a_receber_movimento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_c_a_receber_movimento.setOpaque(true);
        bt_c_a_receber_movimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_c_a_receber_movimentoActionPerformed(evt);
            }
        });

        bt_diaria_movimento.setBackground(new java.awt.Color(153, 153, 255));
        bt_diaria_movimento.setFont(new java.awt.Font("Khmer UI", 1, 14)); // NOI18N
        bt_diaria_movimento.setForeground(new java.awt.Color(255, 255, 255));
        bt_diaria_movimento.setText("MOVIMENTAÇÃO DIARIA");
        bt_diaria_movimento.setBorderPainted(false);
        bt_diaria_movimento.setContentAreaFilled(false);
        bt_diaria_movimento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_diaria_movimento.setOpaque(true);
        bt_diaria_movimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_diaria_movimentoActionPerformed(evt);
            }
        });

        bt_fecha_movimento.setBackground(new java.awt.Color(153, 153, 255));
        bt_fecha_movimento.setFont(new java.awt.Font("Khmer UI", 1, 14)); // NOI18N
        bt_fecha_movimento.setForeground(new java.awt.Color(255, 255, 255));
        bt_fecha_movimento.setText("FECHAR CAIXA");
        bt_fecha_movimento.setBorderPainted(false);
        bt_fecha_movimento.setContentAreaFilled(false);
        bt_fecha_movimento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_fecha_movimento.setOpaque(true);
        bt_fecha_movimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_fecha_movimentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bt_abre_movimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bt_c_a_pagar_movimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bt_c_a_receber_movimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bt_diaria_movimento, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
            .addComponent(bt_fecha_movimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_abre_movimento, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_c_a_pagar_movimento, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_c_a_receber_movimento, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_diaria_movimento, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_fecha_movimento, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

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

    private void bt_c_a_pagar_movimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_c_a_pagar_movimentoActionPerformed

        a_pagar pgta = new a_pagar();
        chamarTelas(pgta);
        
// TODO add your handling code here:
    }//GEN-LAST:event_bt_c_a_pagar_movimentoActionPerformed

    private void bt_c_a_receber_movimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_c_a_receber_movimentoActionPerformed

        a_receber rcba = new a_receber();
        chamarTelas(rcba);
        
// TODO add your handling code here:
    }//GEN-LAST:event_bt_c_a_receber_movimentoActionPerformed

    private void bt_abre_movimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_abre_movimentoActionPerformed

        abrir_caixa ac = new abrir_caixa();
        chamarTelas(ac);
        
// TODO add your handling code here:
    }//GEN-LAST:event_bt_abre_movimentoActionPerformed

    private void bt_diaria_movimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_diaria_movimentoActionPerformed

        movimento_diario md = new movimento_diario();
        chamarTelas(md);
        
// TODO add your handling code here:
    }//GEN-LAST:event_bt_diaria_movimentoActionPerformed

    private void bt_fecha_movimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_fecha_movimentoActionPerformed

        fechar_caixa fc = new fechar_caixa();
        chamarTelas(fc);
        
// TODO add your handling code here:
    }//GEN-LAST:event_bt_fecha_movimentoActionPerformed

    
        private void chamarTelas(JInternalFrame p) {

        Principal.getPainel().add(p);
        p.setVisible(true);

        int x = (Principal.getPainel().getWidth() / 2) - (p.getWidth() / 2);
        int y = (Principal.getPainel().getHeight() / 2) - (p.getHeight() / 2);
        p.setVisible(true);
        p.setLocation(x, y);
        p.toFront();
        p.show();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_abre_movimento;
    private javax.swing.JButton bt_c_a_pagar_movimento;
    private javax.swing.JButton bt_c_a_receber_movimento;
    private javax.swing.JButton bt_diaria_movimento;
    private javax.swing.JButton bt_fecha_movimento;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
