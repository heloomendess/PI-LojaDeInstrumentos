/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pilojainstrumentos.Views;

import com.mycompany.pilojainstrumentos.dao.ProdutoDAO;
import com.mycompany.pilojainstrumentos.models.Cliente;
import com.mycompany.pilojainstrumentos.models.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Helo
 */
public class TelaProduto extends javax.swing.JFrame {

    Produto objAlterar = null;

    /**
     * Creates new form TelaProduto
     */
    public TelaProduto() {
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

        pnlGuiasProduto = new javax.swing.JTabbedPane();
        pnlCadastroProduto = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        lblBrancoID = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNomeCadastro = new javax.swing.JTextField();
        lblCodCadastro = new javax.swing.JLabel();
        txtCodigoCadastro = new javax.swing.JFormattedTextField();
        lblPrecoCad = new javax.swing.JLabel();
        txtPrecoCad = new javax.swing.JFormattedTextField();
        lblQtdCad = new javax.swing.JLabel();
        txtQtdCad = new javax.swing.JFormattedTextField();
        btnCancelar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        pnlConsultarProduto = new javax.swing.JPanel();
        lblCodigoConsulta = new javax.swing.JLabel();
        txtCodigoConsulta = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsultar = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnExcluirConsulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblID.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblID.setText("ID:");

        lblBrancoID.setBackground(new java.awt.Color(204, 204, 204));

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNome.setText("NOME:");

        txtNomeCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCadastroActionPerformed(evt);
            }
        });

        lblCodCadastro.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblCodCadastro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCodCadastro.setText("CÓDIGO:");

        lblPrecoCad.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblPrecoCad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPrecoCad.setText("PREÇO:");

        lblQtdCad.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblQtdCad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblQtdCad.setText("QUANTIDADE:");

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 0, 0));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3162629_close_delete_exit_remove_icon.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");

        btnConfirmar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(51, 255, 51));
        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/326572_check_icon.png"))); // NOI18N
        btnConfirmar.setText("CONFIRMAR");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCadastroProdutoLayout = new javax.swing.GroupLayout(pnlCadastroProduto);
        pnlCadastroProduto.setLayout(pnlCadastroProdutoLayout);
        pnlCadastroProdutoLayout.setHorizontalGroup(
            pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroProdutoLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastroProdutoLayout.createSequentialGroup()
                        .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(lblBrancoID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnlCadastroProdutoLayout.createSequentialGroup()
                            .addComponent(lblNome)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNomeCadastro))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCadastroProdutoLayout.createSequentialGroup()
                            .addComponent(lblQtdCad)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtQtdCad))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCadastroProdutoLayout.createSequentialGroup()
                            .addComponent(lblCodCadastro)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCodigoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCadastroProdutoLayout.createSequentialGroup()
                            .addComponent(lblPrecoCad)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPrecoCad))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlCadastroProdutoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnCancelar)
                .addGap(100, 100, 100)
                .addComponent(btnConfirmar)
                .addGap(0, 58, Short.MAX_VALUE))
        );
        pnlCadastroProdutoLayout.setVerticalGroup(
            pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroProdutoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBrancoID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodCadastro)
                    .addComponent(txtCodigoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecoCad)
                    .addComponent(txtPrecoCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQtdCad)
                    .addComponent(txtQtdCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnConfirmar))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pnlGuiasProduto.addTab("Cadastro", pnlCadastroProduto);

        lblCodigoConsulta.setText("NOME:");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tblConsultar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Código", "Nome", "Valor", "Quantidade"
            }
        ));
        jScrollPane1.setViewportView(tblConsultar);

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnAdd.setText("Adicionar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnExcluirConsulta.setForeground(new java.awt.Color(255, 0, 0));
        btnExcluirConsulta.setText("Excluir");
        btnExcluirConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConsultarProdutoLayout = new javax.swing.GroupLayout(pnlConsultarProduto);
        pnlConsultarProduto.setLayout(pnlConsultarProdutoLayout);
        pnlConsultarProdutoLayout.setHorizontalGroup(
            pnlConsultarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarProdutoLayout.createSequentialGroup()
                .addGroup(pnlConsultarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConsultarProdutoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblCodigoConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlConsultarProdutoLayout.createSequentialGroup()
                        .addContainerGap(16, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(pnlConsultarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnExcluirConsulta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnlConsultarProdutoLayout.setVerticalGroup(
            pnlConsultarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarProdutoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pnlConsultarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoConsulta)
                    .addComponent(txtCodigoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGroup(pnlConsultarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConsultarProdutoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(pnlConsultarProdutoLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluirConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );

        pnlGuiasProduto.addTab("Consultar", pnlConsultarProduto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlGuiasProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlGuiasProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        ArrayList<Produto> lista = ProdutoDAO.listar();

        DefaultTableModel modeloTabela = (DefaultTableModel) tblConsultar.getModel();

        modeloTabela.setRowCount(0);

        for (Produto item : lista) {
            modeloTabela.addRow(new String[]{
                String.valueOf(item.getIdProduto()), // Adicione o ID do produto
                String.valueOf(item.getCodProduto()),
                item.getNomeProduto(),
                String.valueOf(item.getValorProduto()),
                String.valueOf(item.getQtdProduto())
            });
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        DefaultTableModel modeloProdutos = (DefaultTableModel) tblConsultar.getModel();

        int linhaSelecionada = tblConsultar.getSelectedRow();

        if (linhaSelecionada >= 0) {
            int id = Integer.parseInt(modeloProdutos.getValueAt(linhaSelecionada, 0).toString());
            int codProduto = Integer.parseInt(modeloProdutos.getValueAt(linhaSelecionada, 1).toString());
            String nomeProduto = modeloProdutos.getValueAt(linhaSelecionada, 2).toString();
            float valorProduto = Float.parseFloat(modeloProdutos.getValueAt(linhaSelecionada, 3).toString());
            int qtdProduto = Integer.parseInt(modeloProdutos.getValueAt(linhaSelecionada, 4).toString());

            objAlterar = new Produto(id, codProduto, nomeProduto, qtdProduto, valorProduto);

            pnlGuiasProduto.setSelectedIndex(0);

            lblBrancoID.setText(String.valueOf(objAlterar.getIdProduto()));
            txtCodigoCadastro.setText(String.valueOf(objAlterar.getCodProduto()));
            txtPrecoCad.setText(String.valueOf(objAlterar.getValorProduto()));
            txtQtdCad.setText(String.valueOf(objAlterar.getQtdProduto()));
            txtNomeCadastro.setText(objAlterar.getNomeProduto());
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha para alterar!");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirConsultaActionPerformed

        DefaultTableModel modeloProduto = (DefaultTableModel) tblConsultar.getModel();
        int linhaSelecionada = tblConsultar.getSelectedRow();

        if (linhaSelecionada >= 0) {
            int idExcluir = Integer.parseInt(modeloProduto.getValueAt(linhaSelecionada, 0).toString());

            boolean retorno = ProdutoDAO.excluir(idExcluir);
            if (retorno) {
                JOptionPane.showMessageDialog(rootPane, "Produto excluído com sucesso!");
                atualizarTabela();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Falha ao excluir!");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione um produto para excluir!");
        }
    }//GEN-LAST:event_btnExcluirConsultaActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
    pnlGuiasProduto.setSelectedIndex(0);

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        //Se tiver em alteração
        if (objAlterar != null) {
            //modo de alteração
            //resgata os dados alterados
            int codProduto = Integer.parseInt(txtCodigoCadastro.getText());
            String nomeProduto = txtNomeCadastro.getText();
            int qtdProduto = Integer.parseInt(txtQtdCad.getText());
            float valorProduto = Float.parseFloat(txtPrecoCad.getText());

            int idProduto = Integer.parseInt(lblBrancoID.getText());

            objAlterar.setIdProduto(idProduto);
            objAlterar.setNomeProduto(nomeProduto);
            objAlterar.setQtdProduto(qtdProduto);
            objAlterar.setValorProduto(valorProduto);
            objAlterar.setCodProduto(codProduto);

            //TODO: chamar a DAO para alterar
            boolean retornoAlteração = ProdutoDAO.alterar(objAlterar);
            if (retornoAlteração) {
                JOptionPane.showMessageDialog(rootPane, "Sucesso ao Alterar!");

                //Limpar campos da tela de cadastro
                objAlterar = null;
                txtNomeCadastro.setText("");
                txtQtdCad.setText("");
                txtPrecoCad.setText("");
                lblBrancoID.setText("");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Falha ao Alterar!");

            }
        } else {
            // Modo de inclusão
            // Passando os dados da interface para o objeto
            String codProdutoStr = txtCodigoCadastro.getText();
            String nomeProduto = txtNomeCadastro.getText();
            String qtdProdutoStr = txtQtdCad.getText();
            String valorProdutoStr = txtPrecoCad.getText();

            // Verificar se algum dos campos obrigatórios está vazio
            if (codProdutoStr.isEmpty() || nomeProduto.isEmpty() || qtdProdutoStr.isEmpty() || valorProdutoStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.");
                return;
            }
            if (txtNomeCadastro.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Digite o nome do produto");
            } else if (txtCodigoCadastro.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Digite o código");
            } else if (txtPrecoCad.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Digite o preço");
            } else if (txtQtdCad.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Digite a quantidade");
            } 

            // Analisar as strings nos tipos de dados apropriados
            int codProduto = Integer.parseInt(codProdutoStr);
            int qtdProduto = Integer.parseInt(qtdProdutoStr);
            float valorProduto = Float.parseFloat(valorProdutoStr);

            Produto objCadastrar = new Produto(codProduto, nomeProduto, qtdProduto, valorProduto);

            //2 Passar o objeto para oo banco de dados
            boolean retornoBanco = ProdutoDAO.salvar(objCadastrar);
            if (retornoBanco == true) {
                JOptionPane.showMessageDialog(rootPane,
                        "Produto Cadastrado com Sucesso!");
                txtNomeCadastro.setText("");
                txtQtdCad.setText("");
                txtPrecoCad.setText("");
            } else {
                JOptionPane.showMessageDialog(rootPane,
                        "Falha ao cadastrar!");
            }
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void txtNomeCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCadastroActionPerformed

    }//GEN-LAST:event_txtNomeCadastroActionPerformed

    public void atualizarTabela() {
        ArrayList<Produto> lista = ProdutoDAO.listar();

        DefaultTableModel modeloTabela = (DefaultTableModel) tblConsultar.getModel();

        modeloTabela.setRowCount(0);

        for (Produto item : lista) {
            modeloTabela.addRow(new String[]{
                String.valueOf(item.getIdProduto()),
                String.valueOf(item.getCodProduto()),
                item.getNomeProduto(),
                String.valueOf(item.getValorProduto()),
                String.valueOf(item.getQtdProduto())
            });
        }

    }

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
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnExcluirConsulta;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBrancoID;
    private javax.swing.JLabel lblCodCadastro;
    private javax.swing.JLabel lblCodigoConsulta;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPrecoCad;
    private javax.swing.JLabel lblQtdCad;
    private javax.swing.JPanel pnlCadastroProduto;
    private javax.swing.JPanel pnlConsultarProduto;
    private javax.swing.JTabbedPane pnlGuiasProduto;
    private javax.swing.JTable tblConsultar;
    private javax.swing.JFormattedTextField txtCodigoCadastro;
    private javax.swing.JTextField txtCodigoConsulta;
    private javax.swing.JTextField txtNomeCadastro;
    private javax.swing.JFormattedTextField txtPrecoCad;
    private javax.swing.JFormattedTextField txtQtdCad;
    // End of variables declaration//GEN-END:variables
}
