/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.visao.telas.relatorios;

import br.com.conexao.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rafael Paes Leme
 */
public class fornecedores extends javax.swing.JInternalFrame {

    /**
     * Creates new form clientes
     */
    public fornecedores() {
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
        bt_salvar_ccliente = new javax.swing.JButton();
        bt_limpar_ccliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        cbx_Nome = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        cbx_id = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbx_cid = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cbx_cnpj = new javax.swing.JComboBox();

        setClosable(true);
        setIconifiable(true);
        setTitle("Relatorio de Fornecedores");

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));

        bt_salvar_ccliente.setBackground(new java.awt.Color(0, 153, 204));
        bt_salvar_ccliente.setFont(new java.awt.Font("Khmer UI", 1, 14)); // NOI18N
        bt_salvar_ccliente.setForeground(new java.awt.Color(255, 255, 255));
        bt_salvar_ccliente.setText("IMPRIMIR");
        bt_salvar_ccliente.setBorderPainted(false);
        bt_salvar_ccliente.setContentAreaFilled(false);
        bt_salvar_ccliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_salvar_ccliente.setOpaque(true);
        bt_salvar_ccliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salvar_cclienteActionPerformed(evt);
            }
        });

        bt_limpar_ccliente.setBackground(new java.awt.Color(0, 153, 204));
        bt_limpar_ccliente.setFont(new java.awt.Font("Khmer UI", 1, 14)); // NOI18N
        bt_limpar_ccliente.setForeground(new java.awt.Color(255, 255, 255));
        bt_limpar_ccliente.setText("LIMPAR");
        bt_limpar_ccliente.setBorderPainted(false);
        bt_limpar_ccliente.setContentAreaFilled(false);
        bt_limpar_ccliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_limpar_ccliente.setOpaque(true);
        bt_limpar_ccliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_limpar_cclienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_salvar_ccliente)
                .addGap(18, 18, 18)
                .addComponent(bt_limpar_ccliente)
                .addContainerGap(501, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_salvar_ccliente)
                    .addComponent(bt_limpar_ccliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Endereço", "CEP", "Cidade", "UF", "CNPJ", "Registro", "CPF", "Nascimento", "Tel. Comercial", "Tel. Comercial 2", "Celular", "Fax", "Email", "Observação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));

        jLabel17.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel17.setText("Buscar por Nome");

        cbx_Nome.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        cbx_Nome.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione Nome" }));
        cbx_Nome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbx_NomeMousePressed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel18.setText("Buscar por ID");

        cbx_id.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        cbx_id.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID" }));
        cbx_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbx_idMousePressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setFont(new java.awt.Font("Khmer UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 255, 204));
        jButton1.setText("BUSCAR");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel1.setText("Buscar por Cidade");

        cbx_cid.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        cbx_cid.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione Cidade" }));
        cbx_cid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbx_cidMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel2.setText("Buscar por CNPJ");

        cbx_cnpj.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        cbx_cnpj.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione CNPJ" }));
        cbx_cnpj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbx_cnpjMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx_cid, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cbx_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(cbx_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1)
                    .addComponent(cbx_cid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cbx_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_salvar_cclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salvar_cclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_salvar_cclienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        CarregarInformacao();
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbx_NomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_NomeMousePressed

        CBX_Nome();
        cbx_Nome.setEnabled(true);
        cbx_id.setEnabled(false);
        cbx_cnpj.setEnabled(false);
        cbx_cid.setEnabled(false);

// TODO add your handling code here:
    }//GEN-LAST:event_cbx_NomeMousePressed

    private void cbx_idMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_idMousePressed

        CBX_id();
        cbx_Nome.setEnabled(false);
        cbx_id.setEnabled(true);
        cbx_cnpj.setEnabled(false);
        cbx_cid.setEnabled(false);

// TODO add your handling code here:
    }//GEN-LAST:event_cbx_idMousePressed

    private void cbx_cnpjMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_cnpjMousePressed

        CBX_CNPJ();
        cbx_Nome.setEnabled(false);
        cbx_id.setEnabled(false);
        cbx_cnpj.setEnabled(true);
        cbx_cid.setEnabled(false);

// TODO add your handling code here:
    }//GEN-LAST:event_cbx_cnpjMousePressed

    private void cbx_cidMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_cidMousePressed

        CBX_CID();
        cbx_Nome.setEnabled(false);
        cbx_id.setEnabled(false);
        cbx_cnpj.setEnabled(false);
        cbx_cid.setEnabled(true);

// TODO add your handling code here:
    }//GEN-LAST:event_cbx_cidMousePressed

    private void bt_limpar_cclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limpar_cclienteActionPerformed

        LimparCampos();
        
// TODO add your handling code here:
    }//GEN-LAST:event_bt_limpar_cclienteActionPerformed

    public void LimparCampos() {

        cbx_Nome.removeAllItems();
        cbx_id.removeAllItems();
        cbx_cnpj.removeAllItems();
        cbx_cid.removeAllItems();

        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);

    }

    public void CarregarInformacao() {

        String nome = (String) cbx_Nome.getSelectedItem();
        String id = (String) cbx_id.getSelectedItem();
        String cnpj = (String) cbx_cnpj.getSelectedItem();
        String cid = (String) cbx_cid.getSelectedItem();

        boolean nome2 = cbx_Nome.isEnabled();
        boolean id2 = cbx_id.isEnabled();
        boolean cnpj2 = cbx_cnpj.isEnabled();
        boolean cid2 = cbx_cid.isEnabled();

        if ("Selecione Nome".equals(nome) && "ID".equals(id) && "Selecione CNPJ".equals(cnpj) && "Selecione Cidade".equals(cid)) {
            CarregarTabela();
        } else {
            if (!"Selecione Nome".equals(nome) && id2 == false && cnpj2 == false && cid2 == false) {
                CarregarNome();
            } else if (!"ID".equals(id) && nome2 == false && cnpj2 == false && cid2 == false) {
                CarregarID();
            } else if (!"Selecione CNPJ".equals(cnpj) && id2 == false && nome2 == false && cid2 == false) {
                CarregarCNPJ();
            } else if (!"Selecione Cidade".equals(cid) && id2 == false && cnpj2 == false && nome2 == false) {
                CarregarCidade();
            } else {
                JOptionPane.showMessageDialog(null, "Erro de pesquisa, reinicie esta Janela!");
            }
        }

    }

    public void CarregarTabela() {
        try {
            Connection conn = conexao.GeraConexao();

            String sql = "SELECT * FROM GOSPAD_BD.fornecedor";

            PreparedStatement comando = conn.prepareStatement(sql);

            ResultSet rs = comando.executeQuery();

            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            modelo.setNumRows(0);

            while (rs.next()) {

                DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                df.setLenient(false);

                DateFormat df2 = new SimpleDateFormat("dd/MM/yyyy");
                df2.setLenient(false);

                modelo.addRow(
                        new Object[]{
                            rs.getString("id"),
                            rs.getString("nome"),
                            rs.getString("endereco"),
                            rs.getString("cep"),
                            rs.getString("cidade"),
                            rs.getString("uf"),
                            rs.getString("cnpj"),
                            df.format(rs.getDate("registro_dt")),
                            rs.getString("cpf"),
                            df.format(rs.getDate("nascimento_dt")),
                            rs.getString("tel_comercial"),
                            rs.getString("tel_residencial"),
                            rs.getString("celular"),
                            rs.getString("fax"),
                            rs.getString("email"),
                            rs.getString("observacao")

                        }
                );
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas ao tentar conectar com o banco de dados: " + e);
        }
    }

    public void CarregarNome() {

        String bcnpjcarNome = (String) cbx_Nome.getSelectedItem();

        try {

            if (!bcnpjcarNome.equals("")) {

                Connection conn = conexao.GeraConexao();

                String sql = "SELECT * FROM GOSPAD_BD.fornecedor WHERE nome = ?";

                PreparedStatement comando = conn.prepareStatement(sql);

                comando.setString(1, bcnpjcarNome);

                ResultSet rs = comando.executeQuery();

                DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                modelo.setNumRows(0);

                while (rs.next()) {

                    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                    df.setLenient(false);

                    DateFormat df2 = new SimpleDateFormat("dd/MM/yyyy");
                    df2.setLenient(false);

                    modelo.addRow(
                            new Object[]{
                                rs.getString("id"),
                                rs.getString("nome"),
                                rs.getString("endereco"),
                                rs.getString("cep"),
                                rs.getString("cidade"),
                                rs.getString("uf"),
                                rs.getString("cnpj"),
                                df.format(rs.getDate("registro_dt")),
                                rs.getString("cpf"),
                                df.format(rs.getDate("nascimento_dt")),
                                rs.getString("tel_comercial"),
                                rs.getString("tel_residencial"),
                                rs.getString("celular"),
                                rs.getString("fax"),
                                rs.getString("email"),
                                rs.getString("observacao")

                            }
                    );

                }

            } else {
                JOptionPane.showMessageDialog(null, "Selecione um nome!");
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void CarregarID() {

        String bcnpjcarID = (String) cbx_id.getSelectedItem();

        try {

            if (!bcnpjcarID.equals("")) {

                Connection conn = conexao.GeraConexao();

                String sql = "SELECT * FROM GOSPAD_BD.fornecedor WHERE id = ?";

                PreparedStatement comando = conn.prepareStatement(sql);

                comando.setString(1, bcnpjcarID);

                ResultSet rs = comando.executeQuery();

                DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                modelo.setNumRows(0);

                while (rs.next()) {

                    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                    df.setLenient(false);

                    DateFormat df2 = new SimpleDateFormat("dd/MM/yyyy");
                    df2.setLenient(false);

                    modelo.addRow(
                            new Object[]{
                                rs.getString("id"),
                                rs.getString("nome"),
                                rs.getString("endereco"),
                                rs.getString("cep"),
                                rs.getString("cidade"),
                                rs.getString("uf"),
                                rs.getString("cnpj"),
                                df.format(rs.getDate("registro_dt")),
                                rs.getString("cpf"),
                                df.format(rs.getDate("nascimento_dt")),
                                rs.getString("tel_comercial"),
                                rs.getString("tel_residencial"),
                                rs.getString("celular"),
                                rs.getString("fax"),
                                rs.getString("email"),
                                rs.getString("observacao")

                            }
                    );

                }

            } else {
                JOptionPane.showMessageDialog(null, "Selecione um nome!");
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void CarregarCNPJ() {

        String bcnpjcarCidade = (String) cbx_cnpj.getSelectedItem();

        try {

            if (!bcnpjcarCidade.equals("")) {

                Connection conn = conexao.GeraConexao();

                String sql = "SELECT * FROM GOSPAD_BD.fornecedor WHERE cnpj = ?";

                PreparedStatement comando = conn.prepareStatement(sql);

                comando.setString(1, bcnpjcarCidade);

                ResultSet rs = comando.executeQuery();

                DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                modelo.setNumRows(0);

                while (rs.next()) {

                    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                    df.setLenient(false);

                    DateFormat df2 = new SimpleDateFormat("dd/MM/yyyy");
                    df2.setLenient(false);

                    modelo.addRow(
                            new Object[]{
                                rs.getString("id"),
                                rs.getString("nome"),
                                rs.getString("endereco"),
                                rs.getString("cep"),
                                rs.getString("cidade"),
                                rs.getString("uf"),
                                rs.getString("cnpj"),
                                df.format(rs.getDate("registro_dt")),
                                rs.getString("cpf"),
                                df.format(rs.getDate("nascimento_dt")),
                                rs.getString("tel_comercial"),
                                rs.getString("tel_residencial"),
                                rs.getString("celular"),
                                rs.getString("fax"),
                                rs.getString("email"),
                                rs.getString("observacao")

                            }
                    );

                }

            } else {
                JOptionPane.showMessageDialog(null, "Selecione um nome!");
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void CarregarCidade() {

        String bcnpjcarCidade = (String) cbx_cid.getSelectedItem();

        try {

            if (!bcnpjcarCidade.equals("")) {

                Connection conn = conexao.GeraConexao();

                String sql = "SELECT * FROM GOSPAD_BD.fornecedor WHERE cid = ?";

                PreparedStatement comando = conn.prepareStatement(sql);

                comando.setString(1, bcnpjcarCidade);

                ResultSet rs = comando.executeQuery();

                DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                modelo.setNumRows(0);

                while (rs.next()) {

                    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                    df.setLenient(false);

                    DateFormat df2 = new SimpleDateFormat("dd/MM/yyyy");
                    df2.setLenient(false);

                    modelo.addRow(
                            new Object[]{
                                rs.getString("id"),
                                rs.getString("nome"),
                                rs.getString("endereco"),
                                rs.getString("cep"),
                                rs.getString("cidade"),
                                rs.getString("uf"),
                                rs.getString("cnpj"),
                                df.format(rs.getDate("registro_dt")),
                                rs.getString("cpf"),
                                df.format(rs.getDate("nascimento_dt")),
                                rs.getString("tel_comercial"),
                                rs.getString("tel_residencial"),
                                rs.getString("celular"),
                                rs.getString("fax"),
                                rs.getString("email"),
                                rs.getString("observacao")

                            }
                    );

                }

            } else {
                JOptionPane.showMessageDialog(null, "Selecione um nome!");
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void CBX_CID() {

        try {

            Connection conn = conexao.GeraConexao();

            String sql = "SELECT * FROM GOSPAD_BD.fornecedor";

            PreparedStatement comando = conn.prepareStatement(sql);

            ResultSet rs = comando.executeQuery();

            cbx_cid.removeAllItems();

            while (rs.next()) {

                cbx_cid.addItem(rs.getString("cidade"));

            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void CBX_CNPJ() {

        try {

            Connection conn = conexao.GeraConexao();

            String sql = "SELECT * FROM GOSPAD_BD.fornecedor";

            PreparedStatement comando = conn.prepareStatement(sql);

            ResultSet rs = comando.executeQuery();

            cbx_cnpj.removeAllItems();

            while (rs.next()) {

                cbx_cnpj.addItem(rs.getString("cnpj"));

            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void CBX_id() {

        try {

            Connection conn = conexao.GeraConexao();

            String sql = "SELECT * FROM GOSPAD_BD.fornecedor";

            PreparedStatement comando = conn.prepareStatement(sql);

            ResultSet rs = comando.executeQuery();

            cbx_id.removeAllItems();

            while (rs.next()) {

                cbx_id.addItem(rs.getString("id"));

            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void CBX_Nome() {

        try {

            Connection conn = conexao.GeraConexao();

            String sql = "SELECT * FROM GOSPAD_BD.fornecedor";

            PreparedStatement comando = conn.prepareStatement(sql);

            ResultSet rs = comando.executeQuery();

            cbx_Nome.removeAllItems();

            while (rs.next()) {

                cbx_Nome.addItem(rs.getString("nome"));

            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_limpar_ccliente;
    private javax.swing.JButton bt_salvar_ccliente;
    private javax.swing.JComboBox cbx_Nome;
    private javax.swing.JComboBox cbx_cid;
    private javax.swing.JComboBox cbx_cnpj;
    private javax.swing.JComboBox cbx_id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
