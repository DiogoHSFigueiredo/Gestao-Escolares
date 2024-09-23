/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package geral;

import dao.ModuloConexao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Diogo
 */
public class TelaFinanceiro extends javax.swing.JFrame {

    /**
     * Creates new form TelaFinanceiro
     */
    ModuloConexao conectar = new ModuloConexao();

    //construtor da classe
    public TelaFinanceiro() throws SQLException, ClassNotFoundException {
        initComponents();
        conectar.abrirCon();
        DefaultTableModel modelo1 = (DefaultTableModel) PainelNomes.getModel();
        PainelNomes.setRowSorter(new TableRowSorter(modelo1));
        readeJtable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PainelNomes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/IconHome.png"))); // NOI18N
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        PainelNomes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PainelNomes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Idade", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        PainelNomes.setColumnSelectionAllowed(true);
        PainelNomes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PainelNomesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PainelNomes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1216, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(16, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(16, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(721, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(198, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(51, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        this.dispose();
        PrincipalGE tela;
        try {
            tela = new PrincipalGE();
            tela.setVisible(true);

        } catch (SQLException ex) {
            Logger.getLogger(TelaFinanceiro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaFinanceiro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void PainelNomesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PainelNomesMouseClicked

    }//GEN-LAST:event_PainelNomesMouseClicked

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
            java.util.logging.Logger.getLogger(TelaFinanceiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFinanceiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFinanceiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFinanceiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaFinanceiro().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaFinanceiro.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TelaFinanceiro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PainelNomes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables


    //metodo que faz a leitura e preenche o array para o JTable
    public List<PessoaAluno> reade() {

        List<PessoaAluno> pessoas = new ArrayList<>();
        try {
            conectar.executaSql("select * from pessoasge");

            while (conectar.rs.next()) {
                PessoaAluno ppessoa = new PessoaAluno() {
                };
                ppessoa.setId(conectar.rs.getInt("id"));
                ppessoa.setNome(conectar.rs.getString("nome"));
                ppessoa.setIdade(conectar.rs.getInt("idade"));
                ppessoa.setJaneiro(conectar.rs.getString("janeiro"));
                ppessoa.setFevereiro(conectar.rs.getString("fevereiro"));
                ppessoa.setMarco(conectar.rs.getString("marco"));
                ppessoa.setAbril(conectar.rs.getString("abril"));
                ppessoa.setMaio(conectar.rs.getString("maio"));
                ppessoa.setJunho(conectar.rs.getString("junho"));
                ppessoa.setJulho(conectar.rs.getString("julho"));
                ppessoa.setAgosto(conectar.rs.getString("agosto"));
                ppessoa.setSetembro(conectar.rs.getString("setembro"));
                ppessoa.setOutubro(conectar.rs.getString("outubro"));
                ppessoa.setNovembro(conectar.rs.getString("novembro"));
                ppessoa.setDezembro(conectar.rs.getString("dezembro"));

                pessoas.add(ppessoa);
            }
        } catch (Exception e) {
        }
        return pessoas;
    }    


    // metodo que preenche a tabela de cadastro
    public void readeJtable() {
        DefaultTableModel modelo1 = (DefaultTableModel) PainelNomes.getModel();
        for (PessoaAluno p : reade()) {
            modelo1.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getIdade(),
                p.Janeiro(),
                p.Fevereiro(),
                p.Marco(),
                p.Abril(),
                p.Maio(),
                p.Junho(),
                p.Julho(),
                p.Agosto(),
                p.Setembro(),
                p.Outubro(),
                p.Novembro(),
                p.Dezembro(),});
        }
    }
}
