/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.OibCliente;
import bean.OibFuncionario;
import bean.OibProduto;
import bean.OibVenda;
import bean.OibVendaproduto;
import controle.VendaControle;
import controle.VendaProdutoControle;
import dao.ClienteDAO;
import dao.FuncionarioDAO;
import dao.VendaDAO;
import dao.VendaProdutoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import tools.Util;
import view.JDlgVendaPesquisar;

/**
 *
 * @author Oscar Iago
 */
public class JDlgVenda extends javax.swing.JDialog {

    boolean incluindo;
    VendaProdutoControle vendaProdutoControle;
    VendaControle vendaControle;
    VendaDAO vendaDAO;
    VendaProdutoDAO vendaProdutoDAO;
    OibVendaproduto oibVendaProduto;

    /**
     * Creates new form JDlgVenda
     */
    public JDlgVenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Vendas");
        setLocationRelativeTo(null);

        vendaProdutoControle = new VendaProdutoControle();

        vendaProdutoControle.setList(new ArrayList());
        jTable1.setModel(vendaProdutoControle);

        Util.habilitar(false, jTxtCodigo, jTxtPagamento, jFmtData, jTxtTotal, jCboCliente, jCboFuncionario, jBtnIncluirProd, jBtnAlterarProd, jBtnExcluirProd, jBtnCancelar, jBtnConfirmar);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnPesquisar, jBtnExcluir);

        jCboCliente.removeAllItems();
        ClienteDAO clienteDAO = new ClienteDAO();
        List lista = clienteDAO.listAll();
        for (int i = 0; i < lista.size(); i++) {
            jCboCliente.addItem((OibCliente) lista.get(i));

            jCboFuncionario.removeAllItems();
            FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
            List lista1 = funcionarioDAO.listAll();
            for (int j = 0; j < lista1.size(); j++) {
                jCboFuncionario.addItem((OibFuncionario) lista1.get(j));

            }

        }
    }

    public void addProduto(OibProduto oibProduto, int quantidade, double valorUnitario) {
        OibVendaproduto oibVendaProduto = new OibVendaproduto();
//        vendaProduto.setPedidos(venda);
        oibVendaProduto.setOibProduto(oibProduto);
        oibVendaProduto.setOibQuantidade(quantidade);
        oibVendaProduto.setOibValorunitario(valorUnitario);
        vendaProdutoControle.addList(oibVendaProduto);
    }

    public void beanView(OibVenda oibVenda, List lista) {
        jTxtCodigo.setText(Util.intStr(oibVenda.getIdOibVenda()));
        jFmtData.setText(Util.dateStr(oibVenda.getOibData()));
        jTxtTotal.setText(oibVenda.getOibTotal());
        jTxtPagamento.setText(oibVenda.getOibFormapagamento());
        jCboCliente.setSelectedItem(oibVenda.getOibCliente());
        jCboFuncionario.setSelectedItem(oibVenda.getOibFuncionario());
        vendaProdutoControle.setList(lista);

    }

    public OibVenda viewBean() {
        OibVenda oibVenda = new OibVenda();
        oibVenda.setIdOibVenda(Util.strInt(jTxtCodigo.getText()));
        oibVenda.setOibData(Util.strDate(jFmtData.getText()));
        oibVenda.setOibTotal(jTxtTotal.getText());
        oibVenda.setOibFormapagamento(jTxtPagamento.getText());
        oibVenda.setOibCliente((OibCliente) jCboCliente.getSelectedItem());
        oibVenda.setOibFuncionario((OibFuncionario) jCboFuncionario.getSelectedItem());
        return oibVenda;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTxtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jFmtData = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jCboCliente = new javax.swing.JComboBox<OibCliente>();
        jLabel4 = new javax.swing.JLabel();
        jCboFuncionario = new javax.swing.JComboBox<OibFuncionario>();
        jLabel5 = new javax.swing.JLabel();
        jTxtTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTxtPagamento = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jBtnIncluirProd = new javax.swing.JButton();
        jBtnAlterarProd = new javax.swing.JButton();
        jBtnExcluirProd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Codigo");

        jTxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCodigoActionPerformed(evt);
            }
        });

        jLabel2.setText("Data");

        jLabel3.setText("Cliente");

        jLabel4.setText("Funcionario");

        jLabel5.setText("Total");

        jLabel6.setText("Forma de Pagamento");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/incluir.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnIncluir);

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar.png"))); // NOI18N
        jBtnAlterar.setText("Alterar");
        jBtnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnAlterar);

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Excluir.png"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnExcluir);

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gravar.png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnConfirmar);

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnCancelar);

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnPesquisar);

        jBtnIncluirProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/incluir.png"))); // NOI18N
        jBtnIncluirProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirProdActionPerformed(evt);
            }
        });

        jBtnAlterarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar_1.png"))); // NOI18N
        jBtnAlterarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarProdActionPerformed(evt);
            }
        });

        jBtnExcluirProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Excluir.png"))); // NOI18N
        jBtnExcluirProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirProdActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jFmtData, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jCboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jCboFuncionario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBtnExcluirProd, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jBtnAlterarProd, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jBtnIncluirProd, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnIncluirProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnAlterarProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnExcluirProd)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCodigoActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:
        Util.habilitar(true, jTxtCodigo, jFmtData, jTxtTotal, jTxtPagamento, jCboCliente, jCboFuncionario, jBtnConfirmar, jBtnCancelar, jBtnIncluirProd, jBtnAlterarProd, jBtnExcluirProd);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnPesquisar, jBtnExcluir);
        Util.limparCampos(jTxtCodigo, jFmtData, jTxtTotal, jCboCliente, jCboFuncionario, jTxtPagamento);
        incluindo = true;
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:
        Util.habilitar(true, jTxtCodigo, jFmtData, jTxtTotal, jTxtPagamento, jCboCliente, jCboFuncionario, jBtnCancelar, jBtnConfirmar, jBtnIncluirProd, jBtnAlterarProd, jBtnExcluirProd);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        incluindo = false;
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        Util.limparCampos(jTxtCodigo, jFmtData, jTxtTotal, jCboCliente, jCboFuncionario);
        if (Util.perguntar("Deseja Excluir?") == true) {
            VendaProdutoDAO vendaProdutoDAO = new VendaProdutoDAO();
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                vendaProdutoDAO.insert(vendaProdutoControle.getList(i));
            }
            VendaDAO vendaDAO = new VendaDAO();
            vendaDAO.delete(viewBean());
        }
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        // TODO add your handling code here:
        Util.habilitar(false, jTxtCodigo, jTxtPagamento, jFmtData, jCboCliente, jCboFuncionario, jTxtTotal, jBtnCancelar, jBtnConfirmar);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        VendaDAO vendaDAO = new VendaDAO();
        vendaDAO.insert(viewBean());
        VendaProdutoDAO vendaProdutoDAO = new VendaProdutoDAO();
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            OibVendaproduto oibVendaProduto = vendaProdutoControle.getList(i);
            oibVendaProduto.setOibVenda(viewBean());
            vendaProdutoDAO.insert(oibVendaProduto);
        }
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        Util.habilitar(false, jTxtCodigo, jTxtPagamento, jFmtData, jTxtTotal, jCboCliente, jCboFuncionario, jBtnCancelar, jBtnConfirmar);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        Util.limparCampos(jTxtCodigo, jFmtData, jTxtTotal, jCboCliente, jCboFuncionario);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        JDlgVendaPesquisar jDlgVendaPesquisar = new JDlgVendaPesquisar(null, true);
        jDlgVendaPesquisar.setTelaAnterior(this);
        jDlgVendaPesquisar.setVisible(true);
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jBtnIncluirProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirProdActionPerformed
        // TODO add your handling code here:
        JDlgVendaProduto jDlgVendaProduto = new JDlgVendaProduto(null, true);
        jDlgVendaProduto.setTelaAnterior(this);
        jDlgVendaProduto.setVisible(true);
    }//GEN-LAST:event_jBtnIncluirProdActionPerformed

    private void jBtnAlterarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarProdActionPerformed
        // TODO add your handling code here:
        if (Util.perguntar("Deseja Alterar?") == true) {
            JDlgVendaProduto jDlgVendaProduto = new JDlgVendaProduto(null, true);
            jDlgVendaProduto.setTitle("Alteração de produtos");
            jDlgVendaProduto.setTelaAnterior(this);
            int sel = jTable1.getSelectedRow();
            //oibVendaProduto = (OibVendaproduto) vendaControle.getBean(sel);
            //jDlgVendaProduto.beanView(oibVendaProduto);
            jDlgVendaProduto.setVisible(true);
        } else {
            Util.mensagem("Alteração cancelada");

        }
    }//GEN-LAST:event_jBtnAlterarProdActionPerformed

    private void jBtnExcluirProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirProdActionPerformed
        // TODO add your handling code here:
        if (Util.perguntar("Deseja Excluir?") == true) {
            int row = jTable1.getSelectedRow();
            oibVendaProduto = vendaProdutoControle.getBean(row);
            vendaProdutoDAO = new VendaProdutoDAO();
            vendaProdutoDAO.delete(vendaControle);
            vendaProdutoDAO = new VendaProdutoDAO();
            List lista = vendaProdutoDAO.listAll();
            vendaControle.setList(lista);
            jTable1.setModel(vendaControle);
            Util.mensagem("Exclusão efetuada");
        } else {
            Util.mensagem("Exclusão cancelada");
        }
    }//GEN-LAST:event_jBtnExcluirProdActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgVenda dialog = new JDlgVenda(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnAlterarProd;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnExcluirProd;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnIncluirProd;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JComboBox<OibCliente> jCboCliente;
    private javax.swing.JComboBox<OibFuncionario> jCboFuncionario;
    private javax.swing.JFormattedTextField jFmtData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtCodigo;
    private javax.swing.JTextField jTxtPagamento;
    private javax.swing.JTextField jTxtTotal;
    // End of variables declaration//GEN-END:variables

}
