/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.ifrn.edu.projetogestaoimovel.gui;

import br.ifrn.edu.projetogestaoimovel.controle.ControleImovel;
import br.ifrn.edu.projetogestaoimovel.modelo.Imovel;
import br.ifrn.edu.projetogestaoimovel.modelo.ImovelNovo;
import br.ifrn.edu.projetogestaoimovel.modelo.ImovelVelho;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author 1577655
 */
public class FrameImovel extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrameImovel
     */
    
    private final ControleImovel controleImovel;
    private int idImovel=-1;
    
    public FrameImovel(ControleImovel controleImovel) {
        
        this.controleImovel=controleImovel;
        
        initComponents();
        
        ListSelectionModel linhaSelectionModel=this.tblImoveis.getSelectionModel();
        
        linhaSelectionModel.addListSelectionListener((e) -> {
            if (e.getSource()!=null){
                ListSelectionModel model=(ListSelectionModel)e.getSource();
                idImovel=model.getMinSelectionIndex();
                exibirImovel();
            }else{
                idImovel=-1;
            }
        });
        
    }
    
    
    private void exibirImovel(){
        if (idImovel!=-1){
            Imovel imovel=this.controleImovel.getImovel(idImovel);
            cboTipoImovel.setEditable(false);
            if (imovel instanceof ImovelNovo){
                cboTipoImovel.setSelectedIndex(0);
            }else{
                cboTipoImovel.setSelectedIndex(1);
            }
            txtEndereco.setText(imovel.getEndereco());
            txtPreco.setText(Double.toString(imovel.getPreco()));
        }
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
        jLabel1 = new javax.swing.JLabel();
        cboTipoImovel = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblCampo = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        txtCampoEspecial = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblImoveis = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setResizable(true);
        setTitle("Cadastro de Im??veis");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Im??vel"));

        jLabel1.setText("Tipo Im??vel:");

        cboTipoImovel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Novo", "Velho" }));
        cboTipoImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoImovelActionPerformed(evt);
            }
        });

        jLabel2.setText("Endere??o:");

        jLabel3.setText("Pre??o:");

        lblCampo.setText("Pre??o Adicional:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCampo)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEndereco)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboTipoImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtCampoEspecial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                .addComponent(txtPreco, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboTipoImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCampo)
                    .addComponent(txtCampoEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        tblImoveis.setModel(new ImovelTableModel(this.controleImovel.getImoveis())
        );
        tblImoveis.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblImoveis);

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboTipoImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoImovelActionPerformed
        // TODO add your handling code here:
       
        switch(cboTipoImovel.getSelectedIndex()){
            case 0:
                lblCampo.setText("Pre??o Adicional:");
                break;
            case 1:
                lblCampo.setText("Desconto:");
               break;
        }
    }//GEN-LAST:event_cboTipoImovelActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        cboTipoImovel.setSelectedIndex(0);
        txtEndereco.setText("");
        txtPreco.setText("");
        txtCampoEspecial.setText("");
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        Imovel imovel=null;
        
        switch(cboTipoImovel.getSelectedIndex()){
            case 0:
                imovel=new ImovelNovo(txtEndereco.getText(), Double.parseDouble(txtPreco.getText()), Double.parseDouble(txtCampoEspecial.getText()));
                break;
            case 1:
                imovel=new ImovelVelho(txtEndereco.getText(), Double.parseDouble(txtPreco.getText()), Double.parseDouble(txtCampoEspecial.getText()));
        }
        
        this.controleImovel.adicionarImovel(imovel, idImovel);
        //Notifica a interface gr??fica para atualizar a tabela
        ((ImovelTableModel)tblImoveis.getModel()).fireTableDataChanged();
        JOptionPane.showMessageDialog(this, "Im??vel Salvo com Sucesso", "Gest??o de Im??veis", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (idImovel!=-1){
            if (JOptionPane.showConfirmDialog(this, "Deseja realmente Excluir?","Gest??o de Im??veis", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE)==JOptionPane.OK_OPTION){
                this.controleImovel.excluirImovel(idImovel);
                JOptionPane.showMessageDialog(this, "Im??vel Excluido com Sucesso", "Gest??o de Im??veis", JOptionPane.INFORMATION_MESSAGE);
                ((ImovelTableModel)tblImoveis.getModel()).fireTableDataChanged();
                 cboTipoImovel.setSelectedIndex(0);
                txtEndereco.setText("");
                txtPreco.setText("");
                txtCampoEspecial.setText("");
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cboTipoImovel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCampo;
    private javax.swing.JTable tblImoveis;
    private javax.swing.JTextField txtCampoEspecial;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
