/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.PopUps;

import Telas.PopUps.Error_exclusão_canal;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;
import Negócio.Canal;
import Negócio.Chamado;
import Negócio.Cliente;
import Telas.Chamados;
import Telas.Clientes;
import static Telas.Clientes.Tabela;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
/**
 *
 * @author thiag
 */
public class perguntaExcluirChamado extends javax.swing.JDialog {
    int idChamado;
    /**
     * Creates new form perguntaExcluir
     */
    public perguntaExcluirChamado(int idChamado) {
        initComponents();
        jPanel1.setBorder(BorderFactory.createLineBorder(Color.black));
        this.idChamado = idChamado;
        setModal(true);
    }
    
    public perguntaExcluirChamado() {
        initComponents();
        jPanel1.setBorder(BorderFactory.createLineBorder(Color.black));
        setModal(true);
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
        jPanelNao = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanelSim = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(0, 0));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel1.setText("Deseja realmente excluir o chamado selecionado?");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jPanelNao.setBackground(new java.awt.Color(45, 118, 232));
        jPanelNao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelNaoMouseClicked(evt);
            }
        });
        jPanelNao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("    Não");
        jPanelNao.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 20));

        jPanel1.add(jPanelNao, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 47));

        jPanelSim.setBackground(new java.awt.Color(45, 118, 232));
        jPanelSim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelSimMouseClicked(evt);
            }
        });
        jPanelSim.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sim");
        jPanelSim.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 60, 20));

        jPanel1.add(jPanelSim, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 110, 47));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelSimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSimMouseClicked
      
       if(Chamado.excluiChamado(idChamado)){
           dispose();
           new Operacao_sucesso().setVisible(true);
           Chamados.preencheTabela();
       }else{
           dispose();
           JOptionPane.showMessageDialog(null, "Erro ao excluir o chamado!");
       }
        
    }//GEN-LAST:event_jPanelSimMouseClicked

    private void jPanelNaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelNaoMouseClicked
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jPanelNaoMouseClicked

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
            java.util.logging.Logger.getLogger(perguntaExcluirChamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(perguntaExcluirChamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(perguntaExcluirChamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(perguntaExcluirChamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new perguntaExcluirChamado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelNao;
    private javax.swing.JPanel jPanelSim;
    // End of variables declaration//GEN-END:variables
}
