/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Negócio.Chamado;
import Telas.PopUps.Campos_preenchidos;
import Telas.PopUps.Operacao_sucesso;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Alexf
 */
public class Altera_chamado extends javax.swing.JFrame {
    int numeroChamado;
    /**
     * Creates new form Altera_chamado
     */
    public Altera_chamado(String motivo, String item, int numeroChamado, int idContrato) {
        initComponents();
        this.numeroChamado = numeroChamado;
        lblContrato.setText(Integer.toString(idContrato));
        jComboBoxSituacao.setBackground(Color.white);
        jLabelMotivo.setText(motivo);
        jComboBoxSituacao.setSelectedItem(item);
        
        
        
    }

    private Altera_chamado() {
        initComponents();
      
     
    }
    
    public boolean verificaCampo(){
        boolean habilitado = true;
        if(jComboBoxSituacao.getSelectedIndex()==0){
            habilitado = false;
            lblSituacao.setForeground(Color.RED);
        }else{
           lblSituacao.setForeground(Color.black);
        }
        
        return habilitado;
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
        painel_header = new javax.swing.JPanel();
        lblContrato = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxSituacao = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        lblMotivo = new javax.swing.JLabel();
        lblSituacao = new javax.swing.JLabel();
        jLabelMotivo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painel_header.setBackground(new java.awt.Color(45, 118, 232));

        lblContrato.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblContrato.setForeground(new java.awt.Color(255, 255, 255));
        lblContrato.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblContrato.setText("numero");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ver-chamados.png"))); // NOI18N
        jLabel3.setText("Atualizar Chamado");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/contrato-pequeno.png"))); // NOI18N
        jLabel4.setText("Contrato nº :");

        javax.swing.GroupLayout painel_headerLayout = new javax.swing.GroupLayout(painel_header);
        painel_header.setLayout(painel_headerLayout);
        painel_headerLayout.setHorizontalGroup(
            painel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_headerLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblContrato)
                .addGap(365, 365, 365))
        );
        painel_headerLayout.setVerticalGroup(
            painel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(painel_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 90));

        jPanel2.setBackground(new java.awt.Color(45, 118, 232));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/atualizar-chamado.png"))); // NOI18N
        jLabel5.setText("Atualizar");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 320, 70));

        jComboBoxSituacao.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jComboBoxSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Em Aberto", "Solicitada Manuntenção no Local", "Visita Técnica Marcada", "Técnico Enviado Ao Local", "Concluído", "Cancelado" }));
        jPanel1.add(jComboBoxSituacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 1010, 40));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 1000, 20));

        lblMotivo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblMotivo.setText("Motivo:");
        jPanel1.add(lblMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        lblSituacao.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblSituacao.setText("Situação:");
        jPanel1.add(lblSituacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabelMotivo.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabelMotivo.setText("jLabel1");
        jPanel1.add(jLabelMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 1000, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
       if(verificaCampo()){
           String situacao = (String) jComboBoxSituacao.getSelectedItem();
           Chamado c= new Chamado(numeroChamado, situacao);
           if(Chamado.atualizaChamado(c)){
               dispose();
               new Operacao_sucesso().setVisible(true);
               Chamados.preencheTabela();
           }else{
               dispose();
              JOptionPane.showMessageDialog(null, "Falha ao atualizar"); 
           }
       }else{
           new Campos_preenchidos().setVisible(true);
       }
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        jPanel2.setBackground(new Color(22, 43, 229));
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        jPanel2.setBackground(new Color(45,118,232));
    }//GEN-LAST:event_jPanel2MouseExited

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
            java.util.logging.Logger.getLogger(Altera_chamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Altera_chamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Altera_chamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Altera_chamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Altera_chamado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxSituacao;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelMotivo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblContrato;
    private javax.swing.JLabel lblMotivo;
    private javax.swing.JLabel lblSituacao;
    private javax.swing.JPanel painel_header;
    // End of variables declaration//GEN-END:variables
}
