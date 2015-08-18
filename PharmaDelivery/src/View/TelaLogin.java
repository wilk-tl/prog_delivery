/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author Willy
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pLogin = new javax.swing.JPanel();
        tfMatricula = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        lbSenha = new javax.swing.JLabel();
        pfSenha = new javax.swing.JPasswordField();
        btAcessar = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();
        lbImagemPainelLogin = new javax.swing.JLabel();
        lbImagemChave = new javax.swing.JLabel();
        lbImagemLogo = new javax.swing.JLabel();
        lbImagemFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PharmaDelivery - Login");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfMatricula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMatriculaActionPerformed(evt);
            }
        });
        pLogin.add(tfMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 59, 210, -1));

        lbNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbNome.setText("Matrícula");
        pLogin.add(lbNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 62, 60, -1));

        lbSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbSenha.setText("Senha");
        pLogin.add(lbSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        pfSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfSenhaActionPerformed(evt);
            }
        });
        pLogin.add(pfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 110, 210, -1));

        btAcessar.setText("Acessar");
        btAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcessarActionPerformed(evt);
            }
        });
        pLogin.add(btAcessar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 210, 30));

        lbTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Login");
        pLogin.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 12, 265, 29));

        lbImagemPainelLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbImagemPainelLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tema branco azul.jpg"))); // NOI18N
        lbImagemPainelLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pLogin.add(lbImagemPainelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 200));

        getContentPane().add(pLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 310, 200));

        lbImagemChave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbImagemChave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/chave.png"))); // NOI18N
        getContentPane().add(lbImagemChave, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 190, 260));

        lbImagemLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbImagemLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Logo.png"))); // NOI18N
        lbImagemLogo.setAlignmentX(10.0F);
        lbImagemLogo.setAlignmentY(10.0F);
        getContentPane().add(lbImagemLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 560, 100));

        lbImagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pilula.png"))); // NOI18N
        getContentPane().add(lbImagemFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMatriculaActionPerformed
        // Aqui vai receber a matrícula do usuário
    }//GEN-LAST:event_tfMatriculaActionPerformed

    private void pfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfSenhaActionPerformed
        // Aqui vai receber a senha do usuário
    }//GEN-LAST:event_pfSenhaActionPerformed

    private void btAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcessarActionPerformed
        JOptionPane.showMessageDialog(null, "USUÁRIO AUTENTICADO COM SUCESSO!");
        new TelaPrincipal().show();
        dispose();
    }//GEN-LAST:event_btAcessarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAcessar;
    private javax.swing.JLabel lbImagemChave;
    private javax.swing.JLabel lbImagemFundo;
    private javax.swing.JLabel lbImagemLogo;
    private javax.swing.JLabel lbImagemPainelLogin;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel pLogin;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JTextField tfMatricula;
    // End of variables declaration//GEN-END:variables
}
