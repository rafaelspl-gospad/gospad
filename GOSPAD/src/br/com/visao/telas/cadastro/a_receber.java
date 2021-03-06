/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.visao.telas.cadastro;

import br.com.conexao.conexao;
import br.com.controle.a_receberControl;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Paes Leme
 */
public class a_receber extends javax.swing.JInternalFrame {

    /**
     * Creates new form a_receber
     */
    public a_receber() {
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

        jPanel3 = new javax.swing.JPanel();
        bt_salvar_a_receber = new javax.swing.JButton();
        bt_limpar_a_receber = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        id_a_receber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        doc_a_receber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        VLT_a_receber = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        cbx_clie_a_receber = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        dt_receb_a_receber = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        dt_venc_a_receber = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        dt_lanc_a_receber = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        VL_rec_a_receber = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        VL_a_rec_a_receber = new javax.swing.JTextField();
        bt_situacao_a_receber = new javax.swing.JLabel();
        situacao_a_receber = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        obs_a_receber = new javax.swing.JTextArea();
        id_fornecedor = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Contas a Receber");
        setVisible(true);

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));

        bt_salvar_a_receber.setBackground(new java.awt.Color(0, 153, 204));
        bt_salvar_a_receber.setFont(new java.awt.Font("Khmer UI", 1, 14)); // NOI18N
        bt_salvar_a_receber.setForeground(new java.awt.Color(255, 255, 255));
        bt_salvar_a_receber.setText("SALVAR");
        bt_salvar_a_receber.setBorderPainted(false);
        bt_salvar_a_receber.setContentAreaFilled(false);
        bt_salvar_a_receber.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_salvar_a_receber.setOpaque(true);
        bt_salvar_a_receber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salvar_a_receberActionPerformed(evt);
            }
        });

        bt_limpar_a_receber.setBackground(new java.awt.Color(0, 153, 204));
        bt_limpar_a_receber.setFont(new java.awt.Font("Khmer UI", 1, 14)); // NOI18N
        bt_limpar_a_receber.setForeground(new java.awt.Color(255, 255, 255));
        bt_limpar_a_receber.setText("LIMPAR");
        bt_limpar_a_receber.setBorderPainted(false);
        bt_limpar_a_receber.setContentAreaFilled(false);
        bt_limpar_a_receber.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_limpar_a_receber.setOpaque(true);
        bt_limpar_a_receber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_limpar_a_receberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_salvar_a_receber)
                .addGap(18, 18, 18)
                .addComponent(bt_limpar_a_receber)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_salvar_a_receber)
                    .addComponent(bt_limpar_a_receber))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel1.setText("ID");

        id_a_receber.setEditable(false);
        id_a_receber.setBackground(new java.awt.Color(255, 255, 204));
        id_a_receber.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel2.setText("Documento");

        doc_a_receber.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel3.setText("Valor Total");

        try {
            VLT_a_receber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        VLT_a_receber.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Cliente");

        cbx_clie_a_receber.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        cbx_clie_a_receber.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Clique aqui para carregar lista de Clientes." }));
        cbx_clie_a_receber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbx_clie_a_receberMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel5.setText("Recebimento");

        try {
            dt_receb_a_receber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dt_receb_a_receber.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel6.setText("Vencimento");

        try {
            dt_venc_a_receber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dt_venc_a_receber.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Lançamento");

        try {
            dt_lanc_a_receber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dt_lanc_a_receber.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel8.setText("Valor Recebido");

        try {
            VL_rec_a_receber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        VL_rec_a_receber.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel9.setText("Valor a Receber");

        VL_a_rec_a_receber.setEditable(false);
        VL_a_rec_a_receber.setBackground(new java.awt.Color(255, 255, 204));
        VL_a_rec_a_receber.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        bt_situacao_a_receber.setBackground(new java.awt.Color(0, 102, 204));
        bt_situacao_a_receber.setFont(new java.awt.Font("Khmer UI", 1, 11)); // NOI18N
        bt_situacao_a_receber.setForeground(new java.awt.Color(255, 255, 255));
        bt_situacao_a_receber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt_situacao_a_receber.setText("Situação");
        bt_situacao_a_receber.setToolTipText("Clique aqui para saber sua situação a receber.");
        bt_situacao_a_receber.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_situacao_a_receber.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_situacao_a_receber.setOpaque(true);
        bt_situacao_a_receber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt_situacao_a_receberMousePressed(evt);
            }
        });

        situacao_a_receber.setEditable(false);
        situacao_a_receber.setBackground(new java.awt.Color(255, 255, 204));
        situacao_a_receber.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel11.setText("Observação");

        obs_a_receber.setColumns(20);
        obs_a_receber.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        obs_a_receber.setLineWrap(true);
        obs_a_receber.setRows(5);
        jScrollPane1.setViewportView(obs_a_receber);

        id_fornecedor.setVisible(false);
        id_fornecedor.setText("iid fornecedor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id_fornecedor)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(VLT_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbx_clie_a_receber, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(dt_receb_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dt_venc_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                            .addComponent(dt_lanc_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(id_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(doc_a_receber))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(VL_rec_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(VL_a_rec_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(bt_situacao_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(situacao_a_receber))
                        .addComponent(jScrollPane1)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(doc_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(VLT_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cbx_clie_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dt_receb_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(dt_venc_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(dt_lanc_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(VL_rec_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(VL_a_rec_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_situacao_a_receber)
                    .addComponent(situacao_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(id_fornecedor)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 720, 423);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_salvar_a_receberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salvar_a_receberActionPerformed

        SalvarDados();
        
// TODO add your handling code here:
    }//GEN-LAST:event_bt_salvar_a_receberActionPerformed

    private void bt_limpar_a_receberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limpar_a_receberActionPerformed

        LimparCampos();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_limpar_a_receberActionPerformed

    private void cbx_clie_a_receberMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_clie_a_receberMousePressed

        Listar_Clientes_CBX();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_clie_a_receberMousePressed

    private void bt_situacao_a_receberMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_situacao_a_receberMousePressed
    
        bt_situacao();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_situacao_a_receberMousePressed

    
    public void bt_situacao() {

        Double valor_total = Double.parseDouble(VLT_a_receber.getText());
        Double valor_recebido = Double.parseDouble(VL_rec_a_receber.getText());
        Double valor_a_receber;

        valor_a_receber = valor_total - valor_recebido;

        if (valor_a_receber > 0) {
            situacao_a_receber.setText("Conta Pendente");
            situacao_a_receber.setForeground(Color.RED);
            situacao_a_receber.setBackground(Color.BLACK);
            VL_a_rec_a_receber.setText(String.valueOf(valor_a_receber));
        } else if (valor_a_receber == 0) {
            situacao_a_receber.setText("Conta Finalizada");
            situacao_a_receber.setForeground(Color.BLUE);
            situacao_a_receber.setBackground(Color.BLACK);
            VL_a_rec_a_receber.setText(String.valueOf(valor_a_receber));
        } else {
            situacao_a_receber.setText("Troco de " + String.valueOf(valor_a_receber).replace("-", "") + " real(reais).");
            situacao_a_receber.setForeground(Color.GREEN);
            situacao_a_receber.setBackground(Color.BLACK);
            VL_a_rec_a_receber.setText(String.valueOf(valor_a_receber));
        }

    }

    
    public void Listar_Clientes_CBX() {

        try {

            Connection conn = conexao.GeraConexao();

            String sql = "SELECT * FROM GOSPAD_BD.clientes";

            PreparedStatement comando = conn.prepareStatement(sql);

            ResultSet rs = comando.executeQuery();

            cbx_clie_a_receber.removeAllItems();

            while (rs.next()) {

                id_fornecedor.setText(rs.getString("id"));
                cbx_clie_a_receber.addItem(rs.getString("nome"));

            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }

    }

    
    public void SalvarDados() {

        ArrayList<String> Registro = new ArrayList<>();
        Registro.add(id_a_receber.getText());
        Registro.add(doc_a_receber.getText());
        Registro.add(VLT_a_receber.getText());
        Registro.add(id_fornecedor.getText());

        if ("  /  /    ".equals(dt_receb_a_receber.getText())) {
            Registro.add("00/00/0000");
        } else {
            Registro.add(dt_receb_a_receber.getText());
        }

        if ("  /  /    ".equals(dt_venc_a_receber.getText())) {
            Registro.add("00/00/0000");
        } else {
            Registro.add(dt_venc_a_receber.getText());
        }

        if ("  /  /    ".equals(dt_lanc_a_receber.getText())) {
            Registro.add("00/00/0000");
        } else {
            Registro.add(dt_lanc_a_receber.getText());
        }

        Registro.add(VL_rec_a_receber.getText());
        Registro.add(VL_a_rec_a_receber.getText());
        Registro.add(situacao_a_receber.getText());
        Registro.add(obs_a_receber.getText());

        a_receberControl Controllap = new a_receberControl();
        try {
            //
            Controllap.Salvar(Registro);
            //

// TODO add your handling code here:
        } catch (ParseException ex) {

            JOptionPane.showMessageDialog(null, "Erro Fatal! Erro, " + ex + ". Informações inseridas incorretamentes!");

            Logger.getLogger(fornecedores.class.getName()).log(Level.SEVERE, null, ex);
        }

        LimparCampos();

    }

    
    public void LimparCampos() {

        id_a_receber.setText(null);
        doc_a_receber.setText(null);
        VLT_a_receber.setText(null);
        cbx_clie_a_receber.addItem("Clique aqui para carregar lista de Clientes.");
        dt_receb_a_receber.setText(null);
        dt_venc_a_receber.setText(null);
        dt_lanc_a_receber.setText(null);
        VL_rec_a_receber.setText("");
        situacao_a_receber.setText(null);
        obs_a_receber.setText(null);

    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField VLT_a_receber;
    private javax.swing.JTextField VL_a_rec_a_receber;
    private javax.swing.JFormattedTextField VL_rec_a_receber;
    private javax.swing.JButton bt_limpar_a_receber;
    private javax.swing.JButton bt_salvar_a_receber;
    private javax.swing.JLabel bt_situacao_a_receber;
    private javax.swing.JComboBox cbx_clie_a_receber;
    private javax.swing.JTextField doc_a_receber;
    private javax.swing.JFormattedTextField dt_lanc_a_receber;
    private javax.swing.JFormattedTextField dt_receb_a_receber;
    private javax.swing.JFormattedTextField dt_venc_a_receber;
    private javax.swing.JTextField id_a_receber;
    private javax.swing.JLabel id_fornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea obs_a_receber;
    private javax.swing.JTextField situacao_a_receber;
    // End of variables declaration//GEN-END:variables
}
