/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package geral;

import dao.ModuloConexao;
import static java.awt.AWTEventMulticaster.add;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Diogo
 */
public class PrincipalGE extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalGE
     */
    ModuloConexao conectar = new ModuloConexao();

    public PrincipalGE() throws SQLException, ClassNotFoundException {
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
        java.awt.GridBagConstraints gridBagConstraints;

        PainelBotoes = new javax.swing.JPanel();
        btnTelaCadastro = new javax.swing.JButton();
        btnTelaFinanceiro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        PainelBotoes.setPreferredSize(new java.awt.Dimension(1060, 685));
        PainelBotoes.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                PainelBotoesComponentResized(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                PainelBotoesComponentShown(evt);
            }
        });
        java.awt.GridBagLayout PainelBotoesLayout = new java.awt.GridBagLayout();
        PainelBotoesLayout.columnWidths = new int[] {100};
        PainelBotoes.setLayout(PainelBotoesLayout);

        btnTelaCadastro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnTelaCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastropqn.png"))); // NOI18N
        btnTelaCadastro.setText("CADASTRO");
        btnTelaCadastro.setAlignmentY(0.0F);
        btnTelaCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTelaCadastro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTelaCadastro.setIconTextGap(10);
        btnTelaCadastro.setInheritsPopupMenu(true);
        btnTelaCadastro.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnTelaCadastro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTelaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaCadastroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 30);
        PainelBotoes.add(btnTelaCadastro, gridBagConstraints);

        btnTelaFinanceiro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnTelaFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/financeiro.png"))); // NOI18N
        btnTelaFinanceiro.setText("FINANCEIRO");
        btnTelaFinanceiro.setAlignmentY(0.0F);
        btnTelaFinanceiro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTelaFinanceiro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTelaFinanceiro.setIconTextGap(10);
        btnTelaFinanceiro.setInheritsPopupMenu(true);
        btnTelaFinanceiro.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnTelaFinanceiro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTelaFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaFinanceiroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 30);
        PainelBotoes.add(btnTelaFinanceiro, gridBagConstraints);

        getContentPane().add(PainelBotoes);
        PainelBotoes.getAccessibleContext().setAccessibleParent(PainelBotoes);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setExtendedState(this.MAXIMIZED_BOTH);

        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
    }//GEN-LAST:event_formComponentAdded

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized


    }//GEN-LAST:event_formComponentResized

    private void PainelBotoesComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_PainelBotoesComponentShown

    }//GEN-LAST:event_PainelBotoesComponentShown

    private void PainelBotoesComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_PainelBotoesComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_PainelBotoesComponentResized

    private void btnTelaFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaFinanceiroActionPerformed
        this.dispose();
        TelaFinanceiro tela;
        try {
            tela = new TelaFinanceiro();
            tela.setVisible(true);
            tela.setLocationRelativeTo(null);
            tela.setExtendedState(this.MAXIMIZED_BOTH);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalGE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrincipalGE.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnTelaFinanceiroActionPerformed

    private void btnTelaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaCadastroActionPerformed

        this.dispose();
        TelaCadastro Tela;
        try {
            Tela = new TelaCadastro();
            Tela.setVisible(true);
            Tela.setLocationRelativeTo(null);
            Tela.setExtendedState(this.MAXIMIZED_BOTH);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalGE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrincipalGE.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnTelaCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PrincipalGE().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(PrincipalGE.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(PrincipalGE.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelBotoes;
    private javax.swing.JButton btnTelaCadastro;
    private javax.swing.JButton btnTelaFinanceiro;
    // End of variables declaration//GEN-END:variables

}
