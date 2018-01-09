/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Negócio.Cliente;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;



/**
 *
 * @author Alexf
 */
public class Novo_usuario extends javax.swing.JFrame {

    /**
     * Creates new form Novo_usuario
     */
    
    
    public Novo_usuario() {
        initComponents();
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_principal = new javax.swing.JPanel();
        painel_header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tNomeCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        tCPFCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        tTelefoneCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        tEmailCliente = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);

        painel_principal.setBackground(new java.awt.Color(255, 255, 255));
        painel_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painel_header.setBackground(new java.awt.Color(45, 118, 232));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adiciona-usuario-pequeno.png"))); // NOI18N
        jLabel1.setText("Cadastrar Novo Usuário");

        javax.swing.GroupLayout painel_headerLayout = new javax.swing.GroupLayout(painel_header);
        painel_header.setLayout(painel_headerLayout);
        painel_headerLayout.setHorizontalGroup(
            painel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_headerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel_headerLayout.setVerticalGroup(
            painel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_headerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painel_principal.add(painel_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 100));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Nome:");
        painel_principal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));
        painel_principal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 420, 10));

        tNomeCliente.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        tNomeCliente.setBorder(null);
        painel_principal.add(tNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 420, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setText("CPF:");
        painel_principal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));
        painel_principal.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 420, 10));

        tCPFCliente.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        tCPFCliente.setBorder(null);
        tCPFCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCPFClienteActionPerformed(evt);
            }
        });
        painel_principal.add(tCPFCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 420, 30));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setText("Telefone:");
        painel_principal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));
        painel_principal.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 420, 10));

        tTelefoneCliente.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        tTelefoneCliente.setBorder(null);
        tTelefoneCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTelefoneClienteActionPerformed(evt);
            }
        });
        painel_principal.add(tTelefoneCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 420, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setText("Email:");
        painel_principal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, -1, -1));
        painel_principal.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, 420, 10));

        tEmailCliente.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        tEmailCliente.setBorder(null);
        painel_principal.add(tEmailCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 420, 30));

        jPanel1.setBackground(new java.awt.Color(45, 118, 232));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/confirma-cadastro.png"))); // NOI18N
        jLabel2.setText("Cadastrar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 58));

        painel_principal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, 320, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        Cliente c = new Cliente(tNomeCliente.getText(), tEmailCliente.getText(), tCPFCliente.getText(), tTelefoneCliente.getText());
        if(c.incluir()==true){
            JOptionPane.showMessageDialog(rootPane, "Cliente cadastrado!");
            tNomeCliente.setText("");
            tEmailCliente.setText("");
            tNomeCliente.setText("");
            tCPFCliente.setText("");
            tTelefoneCliente.setText("");
        }else
            JOptionPane.showMessageDialog(rootPane, "Erro no cadastro...");
    }//GEN-LAST:event_jPanel1MouseClicked

    private void tCPFClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCPFClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCPFClienteActionPerformed

    private void tTelefoneClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTelefoneClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tTelefoneClienteActionPerformed

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        jPanel1.setBackground(new Color(22, 43, 229));
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        jPanel1.setBackground(new Color(45,118,232));
    }//GEN-LAST:event_jPanel1MouseExited

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
            java.util.logging.Logger.getLogger(Novo_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Novo_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Novo_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Novo_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Novo_usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPanel painel_header;
    private javax.swing.JPanel painel_principal;
    private javax.swing.JTextField tCPFCliente;
    private javax.swing.JTextField tEmailCliente;
    private javax.swing.JTextField tNomeCliente;
    private javax.swing.JTextField tTelefoneCliente;
    // End of variables declaration//GEN-END:variables
}
