/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.visao.telas.cadastro;

/**
 *
 * @author Rafael Paes Leme
 */
public class a_pagar extends javax.swing.JInternalFrame {

    /**
     * Creates new form a_pagar
     */
    public a_pagar() {
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
        bt_salvar_a_pagar = new javax.swing.JButton();
        bt_limpar_a_pagar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        id_a_pagar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        doc_a_pagar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        VL_a_pagar = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        cbx_forn_a_pagar = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        dt_pgto_a_pagar = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        dt_venc_a_pagar = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        dt_lanc_a_pagar = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        VL_pgto_a_pagar = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        VL_pagar_a_pagar = new javax.swing.JTextField();
        bt_situacao_a_pagar = new javax.swing.JLabel();
        situacao_a_pagar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        obs_a_pagar = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Contas a Pagar");
        setVisible(true);

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));

        bt_salvar_a_pagar.setBackground(new java.awt.Color(0, 153, 204));
        bt_salvar_a_pagar.setFont(new java.awt.Font("Khmer UI", 1, 14)); // NOI18N
        bt_salvar_a_pagar.setForeground(new java.awt.Color(255, 255, 255));
        bt_salvar_a_pagar.setText("SALVAR");
        bt_salvar_a_pagar.setBorderPainted(false);
        bt_salvar_a_pagar.setContentAreaFilled(false);
        bt_salvar_a_pagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_salvar_a_pagar.setOpaque(true);

        bt_limpar_a_pagar.setBackground(new java.awt.Color(0, 153, 204));
        bt_limpar_a_pagar.setFont(new java.awt.Font("Khmer UI", 1, 14)); // NOI18N
        bt_limpar_a_pagar.setForeground(new java.awt.Color(255, 255, 255));
        bt_limpar_a_pagar.setText("LIMPAR");
        bt_limpar_a_pagar.setBorderPainted(false);
        bt_limpar_a_pagar.setContentAreaFilled(false);
        bt_limpar_a_pagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_limpar_a_pagar.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_salvar_a_pagar)
                .addGap(18, 18, 18)
                .addComponent(bt_limpar_a_pagar)
                .addContainerGap(429, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_salvar_a_pagar)
                    .addComponent(bt_limpar_a_pagar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel1.setText("ID");

        id_a_pagar.setEditable(false);
        id_a_pagar.setBackground(new java.awt.Color(255, 255, 204));
        id_a_pagar.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel2.setText("Documento");

        doc_a_pagar.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel3.setText("Valor Total");

        try {
            VL_a_pagar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        VL_a_pagar.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel4.setText("Fornecedor");

        cbx_forn_a_pagar.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        cbx_forn_a_pagar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel5.setText("Pagamento");

        try {
            dt_pgto_a_pagar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dt_pgto_a_pagar.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel6.setText("Vencimento");

        try {
            dt_venc_a_pagar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dt_venc_a_pagar.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel7.setText("Lançamento");

        try {
            dt_lanc_a_pagar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dt_lanc_a_pagar.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel8.setText("Valor Pago");

        try {
            VL_pgto_a_pagar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        VL_pgto_a_pagar.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel9.setText("Valor a Pagar");

        VL_pagar_a_pagar.setEditable(false);
        VL_pagar_a_pagar.setBackground(new java.awt.Color(255, 255, 204));
        VL_pagar_a_pagar.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        bt_situacao_a_pagar.setBackground(new java.awt.Color(0, 102, 204));
        bt_situacao_a_pagar.setFont(new java.awt.Font("Khmer UI", 1, 11)); // NOI18N
        bt_situacao_a_pagar.setForeground(new java.awt.Color(255, 255, 255));
        bt_situacao_a_pagar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt_situacao_a_pagar.setText("Situação");
        bt_situacao_a_pagar.setToolTipText("Clique aqui para saber sua situação a pagar.");
        bt_situacao_a_pagar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_situacao_a_pagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_situacao_a_pagar.setOpaque(true);

        situacao_a_pagar.setEditable(false);
        situacao_a_pagar.setBackground(new java.awt.Color(255, 255, 204));
        situacao_a_pagar.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel11.setText("Observação");

        obs_a_pagar.setColumns(20);
        obs_a_pagar.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        obs_a_pagar.setLineWrap(true);
        obs_a_pagar.setRows(5);
        jScrollPane1.setViewportView(obs_a_pagar);

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(id_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doc_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(VL_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_forn_a_pagar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(VL_pgto_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(VL_pagar_a_pagar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(dt_pgto_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dt_venc_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_situacao_a_pagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dt_lanc_a_pagar)
                            .addComponent(situacao_a_pagar)))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(doc_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(VL_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cbx_forn_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dt_pgto_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(dt_venc_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(dt_lanc_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(VL_pgto_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(VL_pagar_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_situacao_a_pagar)
                    .addComponent(situacao_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
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

        setBounds(0, 0, 643, 423);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField VL_a_pagar;
    private javax.swing.JTextField VL_pagar_a_pagar;
    private javax.swing.JFormattedTextField VL_pgto_a_pagar;
    private javax.swing.JButton bt_limpar_a_pagar;
    private javax.swing.JButton bt_salvar_a_pagar;
    private javax.swing.JLabel bt_situacao_a_pagar;
    private javax.swing.JComboBox cbx_forn_a_pagar;
    private javax.swing.JTextField doc_a_pagar;
    private javax.swing.JFormattedTextField dt_lanc_a_pagar;
    private javax.swing.JFormattedTextField dt_pgto_a_pagar;
    private javax.swing.JFormattedTextField dt_venc_a_pagar;
    private javax.swing.JTextField id_a_pagar;
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
    private javax.swing.JTextArea obs_a_pagar;
    private javax.swing.JTextField situacao_a_pagar;
    // End of variables declaration//GEN-END:variables


}