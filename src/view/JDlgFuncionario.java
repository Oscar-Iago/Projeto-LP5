/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import bean.OibFuncionario;
import dao.FuncionarioDAO;
import tools.Util;

/**
 *
 * @author u08655026174
 */
public class JDlgFuncionario extends javax.swing.JDialog {

    boolean incluindo;
    FuncionarioDAO funcionarioDAO;

    /**
     * Creates new form JDlgFuncionario
     */
    public JDlgFuncionario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Funcionario");
        setLocationRelativeTo(null);
        funcionarioDAO = new FuncionarioDAO();

        Util.habilitar(false, jBtnConfirmar, jBtnCancelar, jTxtCodigo, jTxtNome, jTxtSobrenome, jFmtCpf, jFmtNascimento, jFmtTelefone, jTxtFuncao);
    }

    public void beanView(OibFuncionario oibFuncionario) {
        jTxtCodigo.setText(Util.intStr(oibFuncionario.getIdOibFuncionario()));
        jTxtNome.setText(oibFuncionario.getOibNome());
        jTxtSobrenome.setText(oibFuncionario.getOibSobrenome());
        jFmtCpf.setText(oibFuncionario.getOibCpf());
        jFmtNascimento.setText(Util.dateStr(oibFuncionario.getOibDatanascimento()));
        jFmtTelefone.setText(oibFuncionario.getOibTelefone());
        jTxtFuncao.setText(oibFuncionario.getOibFuncao());

    }

    public OibFuncionario viewBean() {
        OibFuncionario oibFuncionario = new OibFuncionario();
        oibFuncionario.setIdOibFuncionario(Util.strInt(jTxtCodigo.getText()));
        oibFuncionario.setOibNome(jTxtNome.getText());
        oibFuncionario.setOibSobrenome(jTxtSobrenome.getText());
        oibFuncionario.setOibCpf(jFmtCpf.getText());
        oibFuncionario.setOibDatanascimento(Util.strDate(jFmtNascimento.getText()));
        oibFuncionario.setOibTelefone(jFmtTelefone.getText());
        oibFuncionario.setOibFuncao(jTxtFuncao.getText());
        return oibFuncionario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtSobrenome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jFmtCpf = new javax.swing.JFormattedTextField();
        jFmtNascimento = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jFmtTelefone = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jTxtFuncao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTxtCodigo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nome");

        jLabel2.setText("Sobrenome");

        jLabel3.setText("CPF");

        jLabel4.setText("Data de Nascimento");

        jLabel5.setText("Telefone");

        jLabel6.setText("Função");

        jLabel7.setText("Código");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/incluir.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnIncluir);

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar.png"))); // NOI18N
        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnAlterar);

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Excluir.png"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnExcluir);

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gravar.png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnConfirmar);

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnCancelar);

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnPesquisar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jTxtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                    .addComponent(jFmtCpf)
                                    .addComponent(jFmtNascimento))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTxtFuncao, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                    .addComponent(jLabel6)
                                    .addComponent(jFmtTelefone)
                                    .addComponent(jLabel2)
                                    .addComponent(jTxtSobrenome)
                                    .addComponent(jLabel5)))
                            .addComponent(jTxtCodigo))
                        .addGap(41, 41, 41))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel7)
                .addGap(4, 4, 4)
                .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFmtTelefone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFmtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:
        Util.limparCampos(jTxtCodigo, jTxtNome, jTxtSobrenome, jFmtCpf, jFmtNascimento, jFmtTelefone, jTxtFuncao);
        Util.habilitar(true, jTxtCodigo, jTxtNome, jTxtSobrenome, jFmtCpf, jFmtNascimento,
                jFmtTelefone, jTxtFuncao, jBtnCancelar, jBtnConfirmar);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        
        incluindo = true;
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:
        Util.habilitar(true, jTxtCodigo, jTxtNome, jTxtSobrenome, jFmtCpf, jFmtNascimento, jFmtTelefone, jTxtFuncao, jBtnCancelar, jBtnConfirmar);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        incluindo = false;
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        // TODO add your handling code here:
        if (Util.perguntar("Deseja Excluir?") == true) {
            funcionarioDAO.delete(viewBean());
        }
        Util.limparCampos(jTxtCodigo, jTxtNome, jTxtSobrenome, jFmtCpf, jFmtNascimento, jFmtTelefone, jTxtFuncao);
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        // TODO add your handling code here:
        OibFuncionario oibFuncionario = viewBean();
        funcionarioDAO = new FuncionarioDAO();
        if (incluindo == true) {
            funcionarioDAO.insert(oibFuncionario);
        } else {
            funcionarioDAO.update(oibFuncionario);
        }
        Util.limparCampos(jTxtCodigo, jTxtNome, jTxtSobrenome, jFmtCpf, jFmtNascimento, jFmtTelefone, jTxtFuncao);
        Util.habilitar(false, jTxtCodigo, jTxtNome, jTxtSobrenome, jFmtCpf, jFmtNascimento, jFmtTelefone, jTxtFuncao, jBtnCancelar, jBtnConfirmar);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        Util.habilitar(false, jTxtCodigo, jTxtNome, jTxtSobrenome, jFmtCpf, jFmtNascimento, jFmtTelefone, jTxtFuncao, jBtnCancelar, jBtnConfirmar);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        Util.limparCampos(jTxtCodigo, jTxtNome, jTxtSobrenome, jFmtCpf, jFmtNascimento, jFmtTelefone, jTxtFuncao);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        // TODO add your handling code here:
        JDlgFuncionarioPesquisar jDlgFuncionarioPesquisar = new JDlgFuncionarioPesquisar(null, true);
        jDlgFuncionarioPesquisar.setTelaAnterior(this);
        jDlgFuncionarioPesquisar.setVisible(true);

        Util.habilitar(true, jBtnCancelar, jBtnExcluir, jBtnAlterar);
        Util.habilitar(false, jTxtCodigo, jTxtNome, jTxtSobrenome, jFmtCpf, jFmtNascimento, jFmtTelefone, jTxtFuncao, jBtnCancelar, jBtnConfirmar);
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgFuncionario dialog = new JDlgFuncionario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JFormattedTextField jFmtCpf;
    private javax.swing.JFormattedTextField jFmtNascimento;
    private javax.swing.JFormattedTextField jFmtTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtCodigo;
    private javax.swing.JTextField jTxtFuncao;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtSobrenome;
    // End of variables declaration//GEN-END:variables
}
