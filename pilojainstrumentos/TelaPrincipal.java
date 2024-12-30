/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pilojainstrumentos;

import com.mycompany.pilojainstrumentos.dao.ClienteDAO;
import com.mycompany.pilojainstrumentos.dao.ProdutoDAO;
import com.mycompany.pilojainstrumentos.dao.RelatorioAnaliticoDAO;
import com.mycompany.pilojainstrumentos.dao.RelatorioSinteticoDAO;
import com.mycompany.pilojainstrumentos.dao.VendaDAO;
import com.mycompany.pilojainstrumentos.models.Cliente;
import com.mycompany.pilojainstrumentos.models.ItemVenda;
import com.mycompany.pilojainstrumentos.models.Produto;
import com.mycompany.pilojainstrumentos.models.RelatorioAnalitico;
import com.mycompany.pilojainstrumentos.models.RelatorioSintetico;
import com.mycompany.pilojainstrumentos.models.Venda;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Helo
 */
public class TelaPrincipal extends javax.swing.JFrame {

    Venda objVenda = new Venda();
    float valorTotal = 0;

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();

        cboProdutos.removeAllItems();

        ArrayList<Produto> listaProdutos = ProdutoDAO.listar();

        for (Produto item : listaProdutos) {
            cboProdutos.addItem(item);
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

        JTabbedPane = new javax.swing.JTabbedPane();
        jPanelVendas = new javax.swing.JPanel();
        LblCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        BtnBuscarCPF = new javax.swing.JButton();
        LblNomeCliente = new javax.swing.JLabel();
        cboProdutos = new javax.swing.JComboBox<Produto>();
        spnQtd = new javax.swing.JSpinner();
        btnADD = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVenda = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        lblValorTotal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        jPanelRelatorios = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblValorTotalRelat = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblRelatorioSintetico = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblRelatorioAnalitico = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jdcDataInicio = new com.toedter.calendar.JDateChooser();
        jdcDataTermino = new com.toedter.calendar.JDateChooser();
        jMenuBar1 = new javax.swing.JMenuBar();
        jbarArquivo = new javax.swing.JMenu();
        jMenuProduto = new javax.swing.JMenu();
        jMenuProdInserir = new javax.swing.JMenuItem();
        jMenuProdConsultar = new javax.swing.JMenuItem();
        jMenuProdEditar = new javax.swing.JMenuItem();
        jMenuProdExcluir = new javax.swing.JMenuItem();
        jMenuCliente = new javax.swing.JMenu();
        jMenuCliInserir = new javax.swing.JMenuItem();
        jMenuCliConsultar = new javax.swing.JMenuItem();
        jMenuCliEditar = new javax.swing.JMenuItem();
        jMenuCliExcluir = new javax.swing.JMenuItem();
        jbarAjuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelVendas.setToolTipText("");

        LblCPF.setText("CPF:");

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        BtnBuscarCPF.setText("Buscar");
        BtnBuscarCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarCPFActionPerformed(evt);
            }
        });

        btnADD.setText("Adicionar ao carrinho");
        btnADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDActionPerformed(evt);
            }
        });

        tblVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Produto", "Codigo", "Nome", "Qtd", "Vlr Unitário"
            }
        ));
        jScrollPane1.setViewportView(tblVenda);

        btnExcluir.setText("Excluir");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Valor Total:");

        btnLimpar.setText("Limpar");

        btnConfirmar.setText("Cofirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVendasLayout = new javax.swing.GroupLayout(jPanelVendas);
        jPanelVendas.setLayout(jPanelVendasLayout);
        jPanelVendasLayout.setHorizontalGroup(
            jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVendasLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVendasLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelVendasLayout.createSequentialGroup()
                        .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboProdutos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelVendasLayout.createSequentialGroup()
                                .addComponent(LblCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelVendasLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(BtnBuscarCPF)
                                .addGap(27, 27, 27)
                                .addComponent(LblNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(92, 92, 92))
                            .addGroup(jPanelVendasLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnADD)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanelVendasLayout.createSequentialGroup()
                        .addComponent(btnExcluir)
                        .addGap(64, 64, 64)
                        .addComponent(btnLimpar)
                        .addGap(134, 134, 134)
                        .addComponent(btnConfirmar)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanelVendasLayout.setVerticalGroup(
            jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVendasLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblCPF)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnBuscarCPF)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnADD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(lblValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnLimpar)
                    .addComponent(btnConfirmar))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        JTabbedPane.addTab("Vendas", jPanelVendas);

        jLabel2.setText("Data de Inicio:");

        jLabel3.setText("Data de termino:");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Valor Total:");

        tblRelatorioSintetico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Data", "Cliente", "Valor Total"
            }
        ));
        jScrollPane3.setViewportView(tblRelatorioSintetico);

        tblRelatorioAnalitico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Quantidade", "Valor Unitário"
            }
        ));
        jScrollPane4.setViewportView(tblRelatorioAnalitico);

        jButton2.setText("Detalhes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRelatoriosLayout = new javax.swing.GroupLayout(jPanelRelatorios);
        jPanelRelatorios.setLayout(jPanelRelatoriosLayout);
        jPanelRelatoriosLayout.setHorizontalGroup(
            jPanelRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRelatoriosLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanelRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRelatoriosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdcDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdcDataTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRelatoriosLayout.createSequentialGroup()
                        .addGap(0, 22, Short.MAX_VALUE)
                        .addGroup(jPanelRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRelatoriosLayout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(181, 181, 181)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblValorTotalRelat, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelRelatoriosLayout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46))))
        );
        jPanelRelatoriosLayout.setVerticalGroup(
            jPanelRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRelatoriosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jButton1))
                    .addComponent(jdcDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcDataTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanelRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRelatoriosLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelRelatoriosLayout.createSequentialGroup()
                        .addGroup(jPanelRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValorTotalRelat, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addGap(0, 20, Short.MAX_VALUE))))
        );

        JTabbedPane.addTab("Relatórios", jPanelRelatorios);

        jbarArquivo.setText("Arquivo");

        jMenuProduto.setText("Produto");

        jMenuProdInserir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuProdInserir.setText("Inserir");
        jMenuProduto.add(jMenuProdInserir);

        jMenuProdConsultar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuProdConsultar.setText("Consultar");
        jMenuProduto.add(jMenuProdConsultar);

        jMenuProdEditar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuProdEditar.setText("Editar");
        jMenuProduto.add(jMenuProdEditar);

        jMenuProdExcluir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuProdExcluir.setText("Excluir");
        jMenuProduto.add(jMenuProdExcluir);

        jbarArquivo.add(jMenuProduto);

        jMenuCliente.setText("Cliente");

        jMenuCliInserir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuCliInserir.setText("Inserir");
        jMenuCliente.add(jMenuCliInserir);

        jMenuCliConsultar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuCliConsultar.setText("Consultar");
        jMenuCliente.add(jMenuCliConsultar);

        jMenuCliEditar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuCliEditar.setText("Editar");
        jMenuCliente.add(jMenuCliEditar);

        jMenuCliExcluir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuCliExcluir.setText("Excluir");
        jMenuCliente.add(jMenuCliExcluir);

        jbarArquivo.add(jMenuCliente);

        jMenuBar1.add(jbarArquivo);

        jbarAjuda.setText("Ajuda");
        jMenuBar1.add(jbarAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JTabbedPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Date dataInicio = jdcDataInicio.getDate();
        Date dataTermino = jdcDataTermino.getDate();

        ArrayList<RelatorioSintetico> lista = RelatorioSinteticoDAO.listarPorPeriodo(dataInicio, dataTermino);

        DefaultTableModel modelo = (DefaultTableModel) tblRelatorioSintetico.getModel();
        modelo.setRowCount(0);

        for (RelatorioSintetico item : lista) {

            modelo.addRow(new String[]{
                String.valueOf(item.getIdVenda()),
                String.valueOf(item.getDataVenda()),
                item.getNomeCliente(),
                String.valueOf(item.getValorVenda())
            });

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDActionPerformed

        Produto produtoSelecionado = (Produto) cboProdutos.getSelectedItem();

        if (produtoSelecionado != null) {
            DefaultTableModel modelo = (DefaultTableModel) tblVenda.getModel();
            modelo.addRow(new String[]{
                String.valueOf(produtoSelecionado.getIdProduto()),
                String.valueOf(produtoSelecionado.getCodProduto()),
                produtoSelecionado.getNomeProduto(),
                String.valueOf(Integer.parseInt(spnQtd.getValue().toString())),
                String.valueOf(produtoSelecionado.getValorProduto())
            });

            float valorUnitario = produtoSelecionado.getValorProduto();
            int qtd = Integer.parseInt(spnQtd.getValue().toString());

            float valorLinha = valorUnitario * qtd;

            valorTotal += valorLinha;

            lblValorTotal.setText(String.valueOf(valorTotal));

        }
    }//GEN-LAST:event_btnADDActionPerformed

    private void BtnBuscarCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarCPFActionPerformed

        String cpf = txtCPF.getText();

        Cliente objRetorno = null;
        try {
            objRetorno = ClienteDAO.buscarPorCPF(cpf);
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (objRetorno != null) {
            LblNomeCliente.setText(objRetorno.getNomeCliente());
            objVenda.setIdCliente(objRetorno.getIdCliente());
        }
    }//GEN-LAST:event_BtnBuscarCPFActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

        DefaultTableModel modelo = (DefaultTableModel) tblVenda.getModel();

        for (int i = 0; i < modelo.getRowCount(); i++) {

            ItemVenda novoItem = null;

            int idProduto = Integer.parseInt(modelo.getValueAt(i, 0).toString());
            int codProduto = Integer.parseInt(modelo.getValueAt(i, 1).toString());
            String nomeProduto = modelo.getValueAt(i, 2).toString();
            int qtdProduto = Integer.parseInt(modelo.getValueAt(i, 3).toString());
            float vlrUnitario = Float.parseFloat(modelo.getValueAt(i, 4).toString());

            novoItem = new ItemVenda(idProduto, qtdProduto, vlrUnitario);

            objVenda.getListaItens().add(novoItem);

        }

        objVenda.setValorVenda(Float.parseFloat(lblValorTotal.getText()));
        objVenda.setDataVenda(new Date());

        Cliente objRetorno = null;
        try {
            objRetorno = ClienteDAO.buscarPorCPF(txtCPF.getText());
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (objRetorno != null) {
            objVenda.setIdCliente(objRetorno.getIdCliente());
        }

        boolean retorno = VendaDAO.salvar(objVenda);

        if (retorno) {
            JOptionPane.showMessageDialog(rootPane, "Venda realizada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Falha na venda!");
        }

    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int linhaSelecionada = tblRelatorioSintetico.getSelectedRow();

        if (linhaSelecionada >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) tblRelatorioSintetico.getModel();
            int idVenda = Integer.parseInt(modelo.getValueAt(linhaSelecionada, 0).toString());

            ArrayList<RelatorioAnalitico> lista = RelatorioAnaliticoDAO.listarPorVenda(idVenda);

            if (lista != null) {
                DefaultTableModel modeloAnalitico = (DefaultTableModel) tblRelatorioAnalitico.getModel();
                modeloAnalitico.setRowCount(0);

                for (RelatorioAnalitico item : lista) {
                    modeloAnalitico.addRow(new String[]{
                        item.getNomeProduto(),
                        String.valueOf(item.getQtdProduto()),
                        String.valueOf(item.getVlrUnitario())
                    });
                }
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscarCPF;
    private javax.swing.JTabbedPane JTabbedPane;
    private javax.swing.JLabel LblCPF;
    private javax.swing.JLabel LblNomeCliente;
    private javax.swing.JButton btnADD;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox<Produto> cboProdutos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCliConsultar;
    private javax.swing.JMenuItem jMenuCliEditar;
    private javax.swing.JMenuItem jMenuCliExcluir;
    private javax.swing.JMenuItem jMenuCliInserir;
    private javax.swing.JMenu jMenuCliente;
    private javax.swing.JMenuItem jMenuProdConsultar;
    private javax.swing.JMenuItem jMenuProdEditar;
    private javax.swing.JMenuItem jMenuProdExcluir;
    private javax.swing.JMenuItem jMenuProdInserir;
    private javax.swing.JMenu jMenuProduto;
    private javax.swing.JPanel jPanelRelatorios;
    private javax.swing.JPanel jPanelVendas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JMenu jbarAjuda;
    private javax.swing.JMenu jbarArquivo;
    private com.toedter.calendar.JDateChooser jdcDataInicio;
    private com.toedter.calendar.JDateChooser jdcDataTermino;
    private javax.swing.JLabel lblValorTotal;
    private javax.swing.JLabel lblValorTotalRelat;
    private javax.swing.JSpinner spnQtd;
    private javax.swing.JTable tblRelatorioAnalitico;
    private javax.swing.JTable tblRelatorioSintetico;
    private javax.swing.JTable tblVenda;
    private javax.swing.JFormattedTextField txtCPF;
    // End of variables declaration//GEN-END:variables
}