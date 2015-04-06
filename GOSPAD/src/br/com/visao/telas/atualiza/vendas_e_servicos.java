/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.visao.telas.atualiza;

import br.com.visao.telas.cadastro.*;

/**
 *
 * @author Rafael Paes Leme
 */
public class vendas_e_servicos extends javax.swing.JInternalFrame {

    /**
     * Creates new form vendas_e_servicos
     */
    public vendas_e_servicos() {
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
        bt_salvar_cvs = new javax.swing.JButton();
        bt_limpar_cvs = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        id_cvs = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbx_tipo_cvs = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        nome_cvs = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbx_produto_cvs = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        id_pord_cvs = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        local_cvs = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dt_cvs = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        hora_cvs = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        vendedor_cvs = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        id_vendedor_cvs = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        obs_cvs = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Atualização de Vendas e Serviços");

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));

        bt_salvar_cvs.setBackground(new java.awt.Color(0, 153, 204));
        bt_salvar_cvs.setFont(new java.awt.Font("Khmer UI", 1, 14)); // NOI18N
        bt_salvar_cvs.setForeground(new java.awt.Color(255, 255, 255));
        bt_salvar_cvs.setText("SALVAR");
        bt_salvar_cvs.setBorderPainted(false);
        bt_salvar_cvs.setContentAreaFilled(false);
        bt_salvar_cvs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_salvar_cvs.setOpaque(true);

        bt_limpar_cvs.setBackground(new java.awt.Color(0, 153, 204));
        bt_limpar_cvs.setFont(new java.awt.Font("Khmer UI", 1, 14)); // NOI18N
        bt_limpar_cvs.setForeground(new java.awt.Color(255, 255, 255));
        bt_limpar_cvs.setText("LIMPAR");
        bt_limpar_cvs.setBorderPainted(false);
        bt_limpar_cvs.setContentAreaFilled(false);
        bt_limpar_cvs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_limpar_cvs.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_salvar_cvs)
                .addGap(18, 18, 18)
                .addComponent(bt_limpar_cvs)
                .addContainerGap(577, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_salvar_cvs)
                    .addComponent(bt_limpar_cvs))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel1.setText("ID");

        id_cvs.setEditable(false);
        id_cvs.setBackground(new java.awt.Color(255, 255, 204));
        id_cvs.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel2.setText("Tipo");

        cbx_tipo_cvs.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        cbx_tipo_cvs.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Serviço", "Venda", " " }));

        jLabel3.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel3.setText("Nome");

        nome_cvs.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel4.setText("Produto");

        cbx_produto_cvs.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        cbx_produto_cvs.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel5.setText("ID Produto");

        id_pord_cvs.setEditable(false);
        id_pord_cvs.setBackground(new java.awt.Color(255, 255, 204));
        id_pord_cvs.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel6.setText("Local");

        local_cvs.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel7.setText("Data");

        try {
            dt_cvs.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dt_cvs.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel8.setText("Hora");

        try {
            hora_cvs.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        hora_cvs.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel9.setText("Vendedor");

        vendedor_cvs.setEditable(false);
        vendedor_cvs.setBackground(new java.awt.Color(255, 255, 204));
        vendedor_cvs.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("ID Vendedor");

        id_vendedor_cvs.setEditable(false);
        id_vendedor_cvs.setBackground(new java.awt.Color(255, 255, 204));
        id_vendedor_cvs.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel11.setText("Observação");

        obs_cvs.setColumns(20);
        obs_cvs.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        obs_cvs.setLineWrap(true);
        obs_cvs.setRows(5);
        jScrollPane1.setViewportView(obs_cvs);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));

        jLabel17.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel17.setText("Buscar por Nome");

        jComboBox1.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel18.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel18.setText("Buscar por ID");

        jComboBox2.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setFont(new java.awt.Font("Khmer UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 255, 204));
        jButton1.setText("BUSCAR");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addGap(2, 2, 2))
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(id_cvs, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbx_tipo_cvs, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nome_cvs, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(local_cvs, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cbx_produto_cvs, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(42, 42, 42)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(dt_cvs, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(vendedor_cvs, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(hora_cvs, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(id_pord_cvs, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(id_vendedor_cvs, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1))
                        .addGap(0, 64, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id_cvs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cbx_tipo_cvs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(nome_cvs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_produto_cvs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(id_pord_cvs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(local_cvs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dt_cvs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(hora_cvs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_vendedor_cvs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(vendedor_cvs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_limpar_cvs;
    private javax.swing.JButton bt_salvar_cvs;
    private javax.swing.JComboBox cbx_produto_cvs;
    private javax.swing.JComboBox cbx_tipo_cvs;
    private javax.swing.JFormattedTextField dt_cvs;
    private javax.swing.JFormattedTextField hora_cvs;
    private javax.swing.JTextField id_cvs;
    private javax.swing.JTextField id_pord_cvs;
    private javax.swing.JTextField id_vendedor_cvs;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField local_cvs;
    private javax.swing.JTextField nome_cvs;
    private javax.swing.JTextArea obs_cvs;
    private javax.swing.JTextField vendedor_cvs;
    // End of variables declaration//GEN-END:variables
}
